use P6GrammarToIdea::AST;
use P6GrammarToIdea::CodeGenUtil;
use Java::Generate::Class;
use Java::Generate::CompUnit;
use Java::Generate::Expression;
use Java::Generate::JavaMethod;
use Java::Generate::JavaParameter;
use Java::Generate::JavaSignature;
use Java::Generate::Variable;

my class GrammarCompiler {
    my constant PASS = -1;
    my constant FAIL = -2;
    my constant END-TOKEN = -3;

    has $.grammar;
    has Int %!rule-numbers = $!grammar.productions.map(*.name).antipairs;
    has Str %!rule-methods = $!grammar.productions.map:
        { .name => "_%!rule-numbers{.name}_&mangle(.name)" };

    method compile-run-rule() {
        my $result = local('result', 'int');
        return ClassMethod.new:
            :access<public>, :name<runRule>, :signature(JavaSignature.new),
            :return-type<int>, :statements[
                decl($result),
                Java::Generate::Statement::Switch.new(
                    switch => field('ruleNumber', 'int'),
                    branches => $!grammar.productions.map({
                        int-lit(%!rule-numbers{.name}) => [
                            assign($result, this-call(%!rule-methods{.name}))
                        ]
                    }),
                    default => [
                        Java::Generate::Statement::Throw.new(:exception('RuntimeException'))
                    ]
                ),
                ret($result)
            ]
    }

    method compile-rules() {
        $!grammar.productions.map({ self!compile-rule($_) })
    }

    method !compile-rule($rule) {
        # The methods that each production rule compiles into are state
        # machines, the current state being in the cursor (which is `this`).
        # The top level is a switch over the states.
        my @statements;
        my @*STATE-STATEMENTS;
        my $*CUR-STATEMENTS;
        my $*NEED-REP = False;
        self!new-state();
        self.compile($rule.implementation);
        $*CUR-STATEMENTS.push(ret(int-lit(PASS)));
        if $*NEED-REP {
            push @statements, decl(local('rep', 'int'));
        }
        push @statements, Java::Generate::Statement::While.new:
            cond => true-lit(),
            body => Java::Generate::Statement::Switch.new:
                switch => field('state', 'int'),
                branches => @*STATE-STATEMENTS.pairs.map({ int-lit(.key) => .value });
        return ClassMethod.new:
            :access<private>, :name(%!rule-methods{$rule.name}),
            :signature(JavaSignature.new), :return-type<int>, :@statements
    }

    method !new-state() {
        my $state = +@*STATE-STATEMENTS;
        @*STATE-STATEMENTS.push($*CUR-STATEMENTS = []);
        return $state;
    }

    multi method compile(Concat $conc) {
        for $conc.terms {
            self.compile($_);
        }
    }

    multi method compile(SeqAlt $alt) {
        my @alts = $alt.alternatives;
        my @insert-goto-statements;
        my @insert-goto-indices;
        my $insert-initial-mark-statements = $*CUR-STATEMENTS;
        my $insert-initial-mark-index = $*CUR-STATEMENTS.elems;
        while @alts > 1 {
            # We need to insert a push onto the backtracking stack for the
            # case where a non-final element of the alternation fails. Save
            # the point to insert the push, then compile, then create a new
            # state, then push it. Also save places that need to have the
            # final state, after the alternation, to jump to.
            my $insert = $*CUR-STATEMENTS;
            my $insert-at = $*CUR-STATEMENTS.elems;
            self.compile(@alts.shift);
            push @insert-goto-statements, $*CUR-STATEMENTS;
            push @insert-goto-indices, $*CUR-STATEMENTS.elems;
            my $failed-state = self!new-state();
            $insert.splice($insert-at, 0, [this-call('bsMark', int-lit($failed-state))]);
        }
        self.compile(@alts.shift);
        my $after-last-statement = $*CUR-STATEMENTS;
        my $success = self!new-state();
        $after-last-statement.append: [
            assign(field('state', 'int'), int-lit($success)),
            continue()
        ];
        $insert-initial-mark-statements.splice($insert-initial-mark-index, 0, [
            this-call('bsFailMark', int-lit($success))
        ]);
        for @insert-goto-statements Z @insert-goto-indices -> ($stmts, $idx) {
            $stmts.splice: $idx, 0, [
                this-call('bsCommit', int-lit($success)),
                assign(field('state', 'int'), int-lit($success)),
                continue()
            ];
        }
    }

    multi method compile(Quantifier $quant) {
        my ($min, $max) = $quant.min, $quant.max;
        return if $min == $max == 0;
        die "Compiling quantifiers with separators NYI" with $quant.separator; 

        # Save point that we should insert push of initial backtrack mark.
        my $insert-initial-mark-statements = $*CUR-STATEMENTS;
        my $insert-initial-mark-index = $*CUR-STATEMENTS.elems;

        # Need a new state which will be used as the quantifier loop.
        my $loop = self!new-state();

        # Compile the target being quantified.
        self.compile($quant.target);

        # We need a done state, but then to insert things before it.
        my $pre-done-statements = $*CUR-STATEMENTS;
        my $done = self!new-state();

        # Insert initial backtrack mark, then continue to loop state.
        $insert-initial-mark-statements.splice($insert-initial-mark-index, 0, [
            this-call($min == 0 ?? 'bsMark' !! 'bsFailMark', int-lit($done)),
            assign(field('state', 'int'), int-lit($loop))
        ]);

        # Retrieve repeition counter and increment it (unless `?`); also
        # commit.
        unless $min == 0 && $max == 1 {
            $*NEED-REP = True;
            $pre-done-statements.append: [
                assign(local('rep', 'int'), this-call('peekRep', int-lit($done))),
                PrefixOp.new(op => '++', right => local('rep', 'int'))
            ];
        }
        $pre-done-statements.push: this-call('bsCommit', int-lit($done));

        # If we have a maximum to reach, enforce it.
        if $max != Inf && $max > 1 {
            $pre-done-statements.push: if(
                cond => InfixOp.new(
                    left => local('rep', 'int'),
                    op => '>=',
                    right => int-lit($max)
                ),
                then => [
                    assign(field('state', 'int'), int-lit($done)),
                    continue()
                ]);
        }

        # Unless one match is what we want, loop.
        if $max == 1 {
            $pre-done-statements.append: [
                assign(field('state', 'int'), int-lit($done)),
                continue()
            ];
        }
        else {
            $pre-done-statements.append: [
                this-call('bsMark', int-lit($done), local('rep', 'int')),
                assign(field('state', 'int'), int-lit($loop)),
                continue()
            ];
        }

        # Enforce minimum.
        if $min > 1 {
            die "Compiling quantifier with minimum > 1 NYI";
        }
    }

    multi method compile(Subrule $rule) {
        given $rule.name {
            my $append-to = $*CUR-STATEMENTS;
            when 'start-token' {
                $append-to.push: this-call 'startToken',
                    StaticVariable.new(:name($rule.args[0].value), :class<Perl6TokenTypes>);
            }
            when 'end-token' {
                my $next = self!new-state();
                $append-to.push: assign(field('state', 'int'), int-lit($next));
                $append-to.push: ret(int-lit(END-TOKEN));
            }
            when 'start-element' | 'end-element' {
                # These aren't relevant for lexer generation
            }
            default {
                my $next = self!new-state();
                my $rule-number = %!rule-numbers{$rule.name};
                $append-to.push: assign(field('state', 'int'), int-lit($next));
                $append-to.push: ret(int-lit($rule-number));
                $*CUR-STATEMENTS.push: if(
                    call(field('lastResult', 'cursor'), 'isFailed'),
                    [backtrack()],
                    [assign(field('pos', 'int'), call(field('lastResult', 'cursor'), 'getPos'))]
                );
            }
        }
    }

    multi method compile(Literal $lit) {
        $*CUR-STATEMENTS.push: unless(this-call('literal', str-lit($lit.value)), [backtrack()]);
    }

    multi method compile(EnumCharList $enum) {
        my $method = $enum.negative ?? 'notInCharList' !! 'inCharList';
        $*CUR-STATEMENTS.push: unless(this-call($method, str-lit($enum.chars)), [backtrack()]);
    }

    multi method compile(BuiltinCharClass $cclass) {
        my $charType = do given $cclass.class {
            when AnyChar {
                die "Cannot have negated AnyChar" if $cclass.negative;
                "any"
            }
            when WordChars {
                "word"
            }
            when DigitChars {
                "digit"
            }
            when SpaceChars {
                "space"
            }
            when NewlineChars {
                die "Newline char class NYI"
            }
        }
        my $method = ($cclass.negative ?? "not$charType.tc()" !! $charType) ~ "Char";
        $*CUR-STATEMENTS.push: unless(this-call($method), [backtrack()]);
    }

    multi method compile(AnchorPass) {
        # Just continue onwards past this point, no action needed
    }

    multi method compile($unknown) {
        die "Unimplemented compilation of node type $unknown.^name()";
    }

    sub backtrack() {
        if(this-call("backtrack"),
            [continue()],
            [ret(int-lit(FAIL))])
    }

    sub mangle($name) {
        $name.subst(/<-alpha>+/, '_', :g)
    }
}

sub generate-lexer(Grammar $grammar) is export {
    my $compiler = GrammarCompiler.new(:$grammar);
    my @methods = flat $compiler.compile-run-rule, $compiler.compile-rules;
    my $class = Class.new: :access<public>, :name("$grammar.name()Braid"),
        :super(Class.new(:name("Cursor<$grammar.name()Braid>"))), :@methods;
    my $comp-unit = CompUnit.new:
        package => 'edument.perl6idea.parsing',
        imports => <
        >,
        type => $class;
    return $comp-unit.generate;
}
