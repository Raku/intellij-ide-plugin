grammar MAIN {
    token TOP {
        <statementlist>
    }

	## Lexer stuff

    token apostrophe {
        <[ ' \- ]>
    }

    token identifier {
        <.ident> [ <.apostrophe> <.ident> ]*
    }

    token name {
        [
        | <identifier> <morename>*
        | <morename>+
        ]
    }

    token desigilname {
        [
        | <?before <.sigil> <.sigil> > <variable>
        | <?sigil>
#            [ <?{ $*IN_DECL }> <.typed_panic: 'X::Syntax::Variable::IndirectDeclaration'> ]?
            <variable>
        | <longname>
        ]
    }

    rule statementlist {
        <.ws>
        [
        | $
        | <?before <[\)\]\}]>>
        | [ <statement> <.eat_terminator> ]*
        ]
    }

    token statement {
        <!before <[\])}]> | $ >
        <!stopper>
        [
        | <label> <statement>
        | <statement_control>
        | <EXPR>
            [
#            || <?MARKED('endstmt')>
            || <.ws> <statement_mod_cond> <statement_mod_loop>?
            || <.ws> <statement_mod_loop>
            ]?
        | <?[;]>
        | <?stopper>
#        | {} <.panic: "Bogus statement">
        ]
    }

    token eat_terminator {
        || ';'
#        || <?MARKED('endstmt')> <.ws>
        || <?before ')' | ']' | '}' >
        || $
        || <?stopper>
#        || <?before [if|while|for|loop|repeat|given|when] » > { $/.'!clear_highwater'(); self.typed_panic( 'X::Syntax::Confused', reason => "Missing semicolon" ) }
#        || { $/.typed_panic( 'X::Syntax::Confused', reason => "Confused" ) }
    }

    token lambda { '->' | '<->' }
}

grammar EXPR {
}

grammar Signature {
}

grammar Q {
}

grammar Regex {
}
