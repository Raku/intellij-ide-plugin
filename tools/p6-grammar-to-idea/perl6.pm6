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

    token unsp {
        \\ <?before \s | '#'>
        [
        | <.vws>
        | <.unv>
        | <.unsp>
        ]*
    }

    token unv {
        [
        | \h+
        | \h* <.comment>
#        | <?before \h* '=' [ \w | '\\'] > ^^ <.pod_content_toplevel>
        ]
    }

    token vnum {
        \w+ | '*'
    }

    ## Top-level rules

    rule statementlist {
        <.ws>
        [
        | $
        | <?before <[\)\]\}]>>
        | [ <statement> <.eat_terminator> ]*
        ]
    }

    rule semilist {
        ''
        [
        | <?[)\]}]>
        | [<statement><.eat_terminator> ]*
        ]
    }

    rule sequence {
        ''
        [
        | <?before <.[)\]}]> >
        | [<statement><.eat_terminator> ]*
        ]
    }

    token label {
        <identifier> ':' <?[\s]> <.ws>
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

    proto token terminator { <...> }

    token terminator:sym<;> { <?[;]> }
    token terminator:sym<)> { <?[)]> }
#    token terminator:sym<]> { <?[\]]> }
    token terminator:sym<}> { <?[}]> }
#    token terminator:sym<ang> { <?[>]> <?{ $*IN_REGEX_ASSERTION }> }
    token terminator:sym<if>     { 'if'     <.kok> }
    token terminator:sym<unless> { 'unless' <.kok> }
    token terminator:sym<while>  { 'while'  <.kok> }
    token terminator:sym<until>  { 'until'  <.kok> }
    token terminator:sym<for>    { 'for'    <.kok> }
    token terminator:sym<given>  { 'given'  <.kok> }
    token terminator:sym<when>   { 'when'   <.kok> }
    token terminator:sym<with>   { 'with'   <.kok> }
    token terminator:sym<without> { 'without' <.kok> }
    token terminator:sym<arrow>  { '-->' }

    ## Statement control

    proto rule statement_control { <...> }

    proto token statement_prefix { <...> }
    token statement_prefix:sym<BEGIN>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<COMPOSE> { <sym><.kok> <blorst> }
    token statement_prefix:sym<TEMP>    { <sym><.kok> <blorst> }
    token statement_prefix:sym<CHECK>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<INIT>    { <sym><.kok> <blorst> }
    token statement_prefix:sym<ENTER>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<FIRST>   { <sym><.kok> <blorst> }

    token statement_prefix:sym<END>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<LEAVE> { <sym><.kok> <blorst> }
    token statement_prefix:sym<KEEP>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<UNDO>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<NEXT>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<LAST>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<PRE>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<POST>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<CLOSE> { <sym><.kok> <blorst> }

    token statement_prefix:sym<eager>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<sink>    { <sym><.kok> <blorst> }
    token statement_prefix:sym<try>     { <sym><.kok> <blorst> }
    token statement_prefix:sym<quietly> { <sym><.kok> <blorst> }
    token statement_prefix:sym<gather>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<once>    { <sym><.kok> <blorst> }
    token statement_prefix:sym<start>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<supply>  { <sym><.kok> <blorst> }
    token statement_prefix:sym<react>   { <sym><.kok> <blorst> }
    token statement_prefix:sym<do>      { <sym><.kok> <blorst> }

    proto token term { <...> }
    token term:sym<fatarrow>           { <fatarrow> }
    token term:sym<colonpair>          { <colonpair> }
    token term:sym<variable>           { <variable> }
    token term:sym<package_declarator> { <package_declarator> }
    token term:sym<scope_declarator>   { <scope_declarator> }
    token term:sym<routine_declarator> { <routine_declarator> }
    token term:sym<multi_declarator>   { <?before 'multi'|'proto'|'only'> <multi_declarator> }
    token term:sym<regex_declarator>   { <regex_declarator> }
    token term:sym<circumfix>          { <circumfix> }
    token term:sym<statement_prefix>   { <statement_prefix> }
    token term:sym<**>                 { <sym> }
    token term:sym<*>                  { <sym> }
    token term:sym<lambda>             { <?lambda> <pblock> }
    token term:sym<type_declarator>    { <type_declarator> }
    token term:sym<value>              { <value> }
    token term:sym<!!>                 { '!!' <?before \s> }
    token term:sym<∞>                  { <sym> }

    token sigil { <[$@%&]> }

    proto token twigil { <...> }
    token twigil:sym<.> { <sym> <?before \w> }
    token twigil:sym<!> { <sym> <?before \w> }
    token twigil:sym<^> { <sym> <?before \w> }
    token twigil:sym<:> { <sym> <?before \w> }
    token twigil:sym<*> { <sym> <?before \w> }
    token twigil:sym<?> { <sym> <?before \w> }
    token twigil:sym<=> { <sym> <?before \w> }
    token twigil:sym<~> { <sym> <?before \w> }

    ## Terms

    token term:sym<self> { <sym> <.end_keyword> }
    token term:sym<now> { <sym> <.tok> }
    token term:sym<time> { <sym> <.tok> }
    token term:sym<empty_set> { '∅' <!before <[ \( \\ ' \- ]> || \h* '=>'> }
    token term:sym<dotty> { <dotty> }
    token term:sym<capterm> { <capterm> }
    token term:sym<onlystar> { '{*}' <?ENDSTMT> }

    proto token value { <...> }
    token value:sym<quote>  { <quote> }
    token value:sym<number> { <number> }
    token value:sym<version> { <version> }

    proto token number { <...> }
    token number:sym<numish>   { <numish> }

    token signed-number { <sign> <number> }

    token signed-integer { <sign> <integer> }

    token radint {
        <integer>
    }

    token escale { <[Ee]> <sign> <decint> }

    token sign { '+' | '-' | '−' | '' }
}

grammar EXPR {
}

grammar Signature {
}

grammar Q {
}

grammar Regex {
}
