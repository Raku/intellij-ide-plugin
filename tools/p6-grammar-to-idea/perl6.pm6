grammar MAIN {
    token TOP {
        <.statementlist>
    }

    ## Lexer stuff

    token apostrophe {
        <[ ' \- ]>
    }

    token ident {
        [<.alpha> || '_'] \w*
    }

    token identifier {
        <.ident> [ <.apostrophe> <.ident> ]*
    }

    token name {
        [
        || <.identifier> <.morename>*
        || <.morename>+
        ]
    }

    token morename {
        '::'
        [
        || <.identifier>
        ]?
    }

    # XXX Missing its colonpairs
    token longname {
        <.name>
    }

    token module_name {
        <.start-token('NAME')>
        <.longname>
        <.end-token('NAME')>
    }

    token end_keyword {
        >>
        <!before <.[ \( \\ ' \- ]> || \h* '=>'>
    }

    token ws {
        <!ww>        
        [
        || <.start-token('WHITE_SPACE')>
           [\r\n || \v]
           <.end-token('WHITE_SPACE')>
        || <.unv>
        || <.unsp>
        ]*
    }

    token unsp {
        <.start-token('WHITE_SPACE')>
        '\\' <?before \s || '#'>
        <.end-token('WHITE_SPACE')>
        [
        || <.vws>
        || <.unv>
        || <.unsp>
        ]*
    }

    token vws {
        <.start-token('WHITE_SPACE')>
        \v+
        <.end-token('WHITE_SPACE')>
    }

    token unv {
        [
        || <.comment>
        || <.start-token('WHITE_SPACE')> \h+ <.end-token('WHITE_SPACE')> <.comment>?
        ]
    }

    token comment {
        <.start-token('COMMENT')>
       '#' \N*
        <.end-token('COMMENT')>
    }

    ## Top-level structure

    token statementlist {
        <.start-element('STATEMENT_LIST')>
        <.statement>*
        <.end-element('STATEMENT_LIST')>
    }

    token statement {
        <.ws>
        <.start-element('STATEMENT')>
        [
        || <.statement_control>
        || <.EXPR>
        || <.bogus_statement>
        ]
        <.ws>
        <.start-token('STATEMENT_TERMINATOR')>
        ';'?
        <.end-token('STATEMENT_TERMINATOR')>
        <.end-element('STATEMENT')>
        <.ws>
    }

    token bogus_statement {
        <.start-token('BAD_CHARACTER')>
        <-[;]>+
        <.end-token('BAD_CHARACTER')>
    }

    token statement_control {
        || <.statement_control_use>
    }

    token statement_control_use {
        <.start-element('USE_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'use'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        <.module_name>
        <.end-element('USE_STATEMENT')>
    }

    token term {
        || <.variable>
        || <.scope_declarator>
        || <.value>
    }

    token variable {
        <.start-element('VARIABLE')>
        <.start-token('VARIABLE')>
        <.sigil> <.twigil>? <.desigilname>
        <.end-token('VARIABLE')>
        <.end-element('VARIABLE')>
    }

    token scope_declarator {
        <.start-element('SCOPED_DECLARATION')>
        <.start-token('SCOPE_DECLARATOR')>
        [ 'my' || 'our' || 'has' || 'HAS' || 'augment' || 'anon' || 'state' || 'supersede' || 'unit' ]
        <.end_keyword>
        <.end-token('SCOPE_DECLARATOR')>
        <.ws>
        [
        || <.declarator>
        || <?>
        ]
        <.end-element('SCOPED_DECLARATION')>
    }

    token declarator {
        ||  [
            <.start-element('VARIABLE_DECLARATION')>
            <.variable_declarator>
            [<.ws> <.initializer>]?
            <.end-element('VARIABLE_DECLARATION')>
            ]
    }

    token variable_declarator {
        <.variable>
    }

    token initializer {
        <.start-element('INFIX')>
        <.start-token('INFIX')>
        ['=' || ':=' || '::=']
        <.end-token('INFIX')>
        <.end-element('INFIX')>
        <.ws>
        <.EXPR>?
    }

    token sigil { <[$@%&]> }

    token twigil { <[.!^:*?=~]> <?before \w> }

    # XXX Hack
    token desigilname { <.longname> }

    token value {
        || <.number>
    }

    token number {
        <.numish>
    }

    token numish {
        [
        || <.dec_number>
        || <.integer>
        || <.start-element('NUMBER_LITERAL')>
           <.start-token('NUMBER_LITERAL')>
           [ '∞' || 'NaN' >> || 'Inf' >> ]
           <.end-token('NUMBER_LITERAL')>
           <.end-element('NUMBER_LITERAL')>
        ]
    }

    token dec_number {
        ||  [
            <.start-element('NUMBER_LITERAL')>
            <.start-token('NUMBER_LITERAL')>
            [
            || [           '.' <.decint> ] <.escale>
            || [ <.decint> '.' <.decint> ] <.escale>
            || [ <.decint>               ] <.escale>
            ]
            <.end-token('NUMBER_LITERAL')>
            <.end-element('NUMBER_LITERAL')>
            ]
        ||  [
            <.start-element('RAT_LITERAL')>
            <.start-token('RAT_LITERAL')>
            [
            || [           '.' <.decint> ]
            || [ <.decint> '.' <.decint> ]
            ]
            <.end-token('RAT_LITERAL')>
            <.end-element('RAT_LITERAL')>
            ]
    }

    token escale { <[Ee]> <.sign> <.decint> }

    token sign { '+' || '-' || '−' || '' }

    token integer {
        <.start-element('INTEGER_LITERAL')>
        <.start-token('INTEGER_LITERAL')>
        [
        || '0'
            [
            || 'b' '_'? <.binint>
            || 'o' '_'? <.octint>
            || 'x' '_'? <.hexint>
            || 'd' '_'? <.decint>
            || <.decint>
            ]
        || <.decint>
        ]
        <.end-token('INTEGER_LITERAL')>
        <.end-element('INTEGER_LITERAL')>
    }

    token decint { [\d+]+ % '_' }
    token hexint { [[\d||<[ a..f A..F ａ..ｆ Ａ..Ｆ ]>]+]+ % '_' }
    token octint { [\d+]+ % '_' }
    token binint { [\d+]+ % '_' }

    token EXPR {
        <.start-element('EXPR')>

        <.prefixish>*
        <.termish>
        <.postfixish>*

        <.ws>

        [
            <.infixish>
            <.ws>
            [
                <.prefixish>*
                <.termish>
                <.postfixish>*
            ]?
            <.ws>
        ]*

        <.end-element('EXPR')>
    }

    token prefixish {
        <.start-element('PREFIX')>
        <.prefix>
        <.end-element('PREFIX')>
    }

    token prefix {
        <.start-token('PREFIX')>
        [
        || '++⚛'
        || '--⚛'
        || '++'
        || '--'
        || '+^'
        || '~^'
        || '?^'
        || '+'
        || '~'
        || '-'
        || '−'
        || '?'
        || '!'
        || '|'
        || '^'
        || '⚛'
        ]
        <.end-token('PREFIX')>
    }

    token postfixish {
        <.start-element('POSTFIX')>
        <.postfix>
        <.end-element('POSTFIX')>
    }

    token postfix {
        <.start-token('POSTFIX')>
        [
        || 'i'
        || '⚛++'
        || '⚛--'
        || '++'
        || '--'
        || <[⁻⁺¯]>? <[⁰¹²³⁴⁵⁶⁷⁸⁹]>+
        ]
        <.end-token('POSTFIX')>
    }

    token infixish {
        <.start-element('INFIX')>
        <.infix>
        <.end-element('INFIX')>
    }

    token infix {
        <.start-token('INFIX')>
        [
        || 'notandthen'
        || 'andthen'
        || '(elem)'
        || '(cont)'
        || 'orelse'
        || 'unicmp'
        || 'minmax'
        || 'before'
        || 'after'
        || '^fff^'
        || '...^'
        || '^ff^'
        || '^fff'
        || 'fff^'
        || '<<=='
        || '==>>'
        || '^..^'
        || 'coll'
        || 'does'
        || 'div'
        || 'gcd'
        || 'lcm'
        || 'mod'
        || '(&)'
        || '(.)'
        || '(|)'
        || '(^)'
        || '(+)'
        || '(-)'
        || '=~='
        || '=:='
        || '==='
        || 'eqv'
        || '!~~'
        || '(<)'
        || '(>)'
        || '(<=)'
        || '(>=)'
        || '(<+)'
        || '(>+)'
        || 'min'
        || 'max'
        || '::='
        || '...'
        || '^ff'
        || 'ff^'
        || 'fff'
        || '⚛+='
        || '⚛-='
        || '⚛−='
        || 'and'
        || 'xor'
        || '<=='
        || '==>'
        || '^..'
        || '..^'
        || 'leg'
        || 'cmp'
        || '<=>'
        || 'but'
        || '**'
        || '%%'
        || '+&'
        || '~&'
        || '?&'
        || '+<'
        || '+>'
        || '~<'
        || '~>'
        || '+|'
        || '+^'
        || '~|'
        || '~^'
        || '?|'
        || '?^'
        || 'xx'
        || '=='
        || '!='
        || '<='
        || '>='
        || 'eq'
        || 'ne'
        || 'le'
        || 'ge'
        || 'lt'
        || 'gt'
        || '~~'
        || '&&'
        || '||'
        || '^^'
        || '//'
        || ':='
        || '.='
        || '…^'
        || 'ff'
        || '⚛='
        || 'or'
        || '..'
        || '*'
        || '×'
        || '/'
        || '÷'
        || '%'
        || '+'
        || '-'
        || '−'
        || 'x'
        || '~'
        || '∘'
        || 'o'
        || '&'
        || '∩'
        || '⊍'
        || '|'
        || '^'
        || '∪'
        || '⊖'
        || '⊎'
        || '∖'
        || '≅'
        || '≠'
        || '≤'
        || '≥'
        || '<'
        || '>'
        || '∈'
        || '∉'
        || '∋'
        || '∌'
        || '⊂'
        || '⊄'
        || '⊃'
        || '⊅'
        || '⊆'
        || '⊈'
        || '⊇'
        || '⊉'
        || '≼'
        || '≽'
        || ','
        || 'Z'
        || 'X'
        || '…'
        || '='
        ]
        <.end-token('INFIX')>
    }

    token termish {
        <.term>
    }
}
