grammar P6GrammarToIdea::Parser {
    rule TOP {
        '' [<grammar> ]*
        [ $ || <.panic('Confused')> ]
    }

    rule grammar {
        'grammar' <name> '{'
            [<production> ]*
        '}'
    }

    rule production {
        $<kind>=< token rule > <name> '{'
        [
        || <seqalt>
        || <.panic('Syntax error in production rule')>
        ]
        '}'
    }

    rule seqalt {
        '||'? <alt>+ % [ '||' ]
    }

    rule alt {
        '|'? <termish>+ % [ '|' ]
    }

    rule termish {
        [<quantified-atom> ]+
    }

    rule quantified-atom {
        <atom> <quantifier>?
    }

    token atom {
        <metachar>
    }

    proto token quantifier {*}
    token quantifier:sym<?> { <sym> }
    token quantifier:sym<*> { <sym> }
    token quantifier:sym<+> { <sym> }

    proto token metachar {*}
    token metachar:sym<$> { <sym> }
    rule metachar:sym<group> {
        '[' <seqalt> ']'
    }
    token metachar:sym<assert> {
        '<' ~ '>' <assertion>
    }

    proto token assertion {*}
    token assertion:sym<name> {
        <name>
    }
    token assertion:sym<method> {
        '.' <name>
    }

    token name {
        <ident>
    }

    method panic($message) {
        die "$message near " ~ self.orig.substr(self.pos, 30).perl
    }

    token ws {
        | <!ww>
        | [
            | \h+
            | ^^ \h* '#' \N+
            | \n
          ]*
    }
}
