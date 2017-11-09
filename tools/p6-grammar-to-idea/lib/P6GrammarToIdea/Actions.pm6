use P6GrammarToIdea::AST;

class P6GrammarToIdea::Actions {
    method TOP($/) {
        make Braids.new: braids => %($<grammar>.map({ .ast.name => .ast }));
    }

    method grammar($/) {
        make Grammar.new: name => ~$<name>, productions => $<production>.map(*.ast);
    }

    method production($/) {
        make Production.new: name => ~$<name>, implementation => $<seqalt>.ast;
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
        make $<seqalt>.ast;
    }

    method metachar:sym<assert>($/) {
        make $<assertion>.ast;
    }

    method assertion:sym<name>($/) {
        make Capture.new: name => ~$<name>, target =>
            Subrule.new: name => ~$<name>;
    }

    method assertion:sym<method>($/) {
        make Subrule.new: name => ~$<name>;
    }
}
