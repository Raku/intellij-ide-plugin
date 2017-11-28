use P6GrammarToIdea::AST;
use Java::Generate::Class;
use Java::Generate::CompUnit;
use Java::Generate::Expression;
use Java::Generate::JavaMethod;
use Java::Generate::JavaParameter;
use Java::Generate::JavaSignature;
use Java::Generate::Literal;
need Java::Generate::Statement;
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
        self!new-state();
        self.compile($rule.implementation);
        push @statements, Java::Generate::Statement::Switch.new:
            switch => field('state', 'int'),
            branches => @*STATE-STATEMENTS.pairs.map({ int-lit(.key) => .value });
        push @statements, ret(int-lit(PASS));
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

    multi method compile(Quantifier $quant) {
        # TODO actually quantify
    }

    multi method compile(Subrule $rule) {
        given $rule.name {
            when 'start-token' {
            }
            when 'end-token' {
            }
            default {
            }
        }
    }

    multi method compile(BuiltinCharClass $cclass) {
    }

    multi method compile($unknown) {
        die "Unimplemented compilation of node type $unknown.^name()";
    }

    sub int-lit($value) {
        Java::Generate::Literal::IntLiteral.new(:$value)
    }
    sub str-lit($value) {
        Java::Generate::Literal::StringLiteral.new(:$value)
    }
    sub field($name, $type) {
        InstanceVariable.new(:$name, :$type);
    }
    multi sub local($name, $type) {
        Java::Generate::Statement::LocalVariable.new(:$name, :$type)
    }
    multi sub local($name, $type, $default) {
        Java::Generate::Statement::LocalVariable.new(:$name, :$type, :$default)
    }
    sub decl($variable) {
        Java::Generate::Statement::VariableDeclaration.new(:$variable)
    }
    sub assign($left, $right) {
        Assignment.new(:$left, :$right)
    }
    sub this-call($name, *@arguments) {
        MethodCall.new: :object(local('this', 'Object')), :$name, :@arguments
    }
    sub ret($return) {
        Java::Generate::Statement::Return.new(:$return)
    }

    sub mangle($name) {
        $name.subst(/<-alpha>+/, '_', :g)
    }
}

sub generate-grammar(Grammar $grammar) is export {
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
