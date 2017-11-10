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
        :my $*PROTO = False;
        :my $*SYM;
        [$<proto>='proto' { $*PROTO = True } ]?
        $<kind>=< token rule >
        <name>[<!{$*PROTO}>':sym<'$<sym>=[<-[>]>+]'>'{$*SYM = ~$<sym>}]?
        '{'
        [
        || <!{$*PROTO}> <nibbler>
        || <?{$*PROTO}> ['<...>' || <.panic('Body of proto must be <...>')>]
        || <.panic('Syntax error in production rule')>
        ]
        '}'
    }

    token nibbler {
        <.ws>
        [
          <!rxstopper>
          [
          |  '||'
          |  '|'
          |  '&&'
          |  '&'
          ] <.ws>
        ]?
        <seqalt>
        [
        || <?infixstopper>
        || $$ <.panic('Regex notterminated')>
        || (\W) {} <.panic("Unrecognized metachar: $/[0]")>
        || <.panic('Regex notterminated')>
        ]
    }

    rule seqalt {
        <alt>+ % [ '||' ]
    }

    rule alt {
        <termish>+ % [ '|' ]
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
        '[' <nibbler> ']'
    }
    token metachar:sym<assert> {
        '<' ~ '>' <assertion>
    }
    token metachar:sym<'> {
        "'"
        <single-quote-string-part>*
        [ "'" || <.panic: "Cannot find closing '"> ]
    }
    token metachar:sym<bs> { \\ <backslash> }

    token single-quote-string-part {
        <!before "'">
        [
        || '\\' $<esc>=.
        || <-[\\']>+
        ]
    }


    proto token backslash { <...> }
    token backslash:sym<s> { $<sym>=[<[sS]>] }
    token backslash:sym<d> { $<sym>=[<[dD]>] }
    token backslash:sym<w> { $<sym>=[<[wW]>] }
    token backslash:sym<n> { $<sym>=[<[nN]>] }
    token backslash:sym<h> { $<sym>=[<[hH]>] }
    token backslash:sym<v> { $<sym>=[<[vV]>] }
    token backslash:sym<r> { $<sym>=[<[rR]>] }
    token backslash:sym<misc> { \W }

    proto token assertion {*}
    token assertion:sym<name> {
        <name>
            [
            | <?before '>'>
#            | '=' <assertion>
#            | ':' <arglist>
#            | '(' <arglist> ')'
            | <.normspace> <nibbler>
            ]?
    }
    token assertion:sym<method> {
        '.' <assertion>
    }
    token assertion:sym<?> {
        '?' <assertion>
    }
    token assertion:sym<!> {
        '!' <assertion>
    }
    token assertion:sym<[> {
        <?before '['|'+'|'-'>
        <cclass_elem>
    }

    token cclass_elem {
        :my $*key;
        $<sign>=['+'|'-'|<?>]
        <.normspace>?
        [
        | '[' $<charspec>=(
                  || \s* ( '\\' <cclass_backslash> || (<-[\]\\]>) )
                     [
                         \s* '..' \s*
                         ( '\\' <cclass_backslash> || (<-[\]\\]>) )
                     ]**0..1
              )*
          \s* ']'
#        | $<name>=<identifier>
        ]
        <.normspace>?
    }

    proto token cclass_backslash {*}
    token cclass_backslash:sym<nyi> {
        <[dDnNsSwWbBeEfFrRtTvVoOxXcC0]>
        <.panic("Backslash sequence $/ not implemented")>
    }
    token cclass_backslash:sym<any> {
        .
    }

    token name {
        <ident>+ % <[-']>
    }

    method panic($message) {
        die "$message near " ~ self.orig.substr(self.pos, 30).perl
    }

    regex infixstopper {
        [
        | <?before <.[\) \} \]]> >
        | <?before '>' <.-[>]> >
        | <?rxstopper>
        ]
    }

    token rxstopper { $ }

    token ws {
        | <!ww>
        | [
            | \h+
            | ^^ \h* '#' \N+
            | \n
          ]*
    }

    token normspace { <?[\s#]> <.ws> }
}
