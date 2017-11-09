use P6GrammarToIdea::AST;

class P6GrammarToIdea::Actions {
    method TOP($/) {
        make Braids.new: braids => %($<grammar>.map({ .ast.name => .ast }));
    }

    method grammar($/) {
        make Grammar.new: name => ~$<name>, productions => $<production>.map(*.ast);
    }

    method production($/) {
        make Production.new: name => ~$<name>, implementation => $<nibbler>.ast;
    }

    method nibbler($/) {
        make $<seqalt>.ast;
    }

    method seqalt($/) {
        make $<alt>.elems > 1
            ?? SeqAlt.new(alternatives => $<alt>.map(*.ast))
            !! $<alt>[0].ast;
    }

    method alt($/) {
        make $<termish>.elems > 1
            ?? Alt.new(alternatives => $<termish>.map(*.ast))
            !! $<termish>[0].ast;
    }

    method termish($/) {
        make $<quantified-atom>.elems > 1
            ?? Concat.new(terms => $<quantified-atom>.map(*.ast))
            !! $<quantified-atom>[0].ast;
    }

    method quantified-atom($/) {
        if $<quantifier> {
            my $q = $<quantifier>.ast;
            make Quantifier.new: min => $q.min, max => $q.max, target => $<atom>.ast;
        }
        else { 
            make $<atom>.ast;
        }
    }

    method quantifier:sym<?>($/) { make 0..1 }
    method quantifier:sym<*>($/) { make 0..* }
    method quantifier:sym<+>($/) { make 1..* }

    method atom($/) {
        make $<metachar>.ast;
    }

    method metachar:sym<$>($/) {
        make AnchorEnd.new
    }

    method metachar:sym<group>($/) {
        make $<nibbler>.ast;
    }

    method metachar:sym<assert>($/) {
        make $<assertion>.ast;
    }
    
    method metachar:sym<'>($/) {
        make Literal.new: value => $<single-quote-string-part>.map(*.ast).join;
    }

    method single-quote-string-part($/) {
        make $<esc> ?? ~$<esc> !! ~$/;
    }

    method assertion:sym<name>($/) {
        make Capture.new: name => ~$<name>, target =>
            Subrule.new: name => ~$<name>,
                |(regex-arg => $<nibbler>.ast if $<nibbler>);
    }

    method assertion:sym<method>($/) {
        my $target = $<assertion>.ast;
        make $target ~~ Capture ?? $target.target !! $target;
    }

    method assertion:sym<?>($/) {
        make Lookahead.new: :!negative, target => tweak-lookahead($<assertion>.ast);
    }

    method assertion:sym<!>($/) {
        make Lookahead.new: :negative, target => tweak-lookahead($<assertion>.ast);
    }

    sub tweak-lookahead($ast is copy) {
        if $ast ~~ Capture {
            $ast .= target;
        }
        if $ast ~~ Subrule && $ast.name eq 'before' {
            $ast .= regex-arg;
        }
        return $ast;
    }

    method assertion:sym<[>($/) {
        make $<cclass_elem>.ast;
    }

    method cclass_elem($/) {
        die "Negated cclasses NYI" if $<sign> eq '-';
        my @chars;
        for $<charspec> -> $c {
            if $c[1] {
                die "Ranges in cclasses NYI";
            }
            if $c[0]<cclass_backslash> {
                my $cc = $c[0]<cclass_backslash>.ast;
                if $cc ~~ EnumCharList {
                    push @chars, $cc.chars;
                }
                else {
                    die "Some backslash sequences in charclasses NYI";
                }
            }
            else {
                push @chars, ~$c[0];
            }
        }
        make EnumCharList.new: chars => @chars.join;
    }

    method cclass_backslash:sym<any>($/) {
        make EnumCharList.new: chars => ~$/;
    }
}
