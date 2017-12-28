grammar MAIN {
    token TOP {
        <.statementlist>
    }

    token statementlist {
        <.start-element('STATEMENT_LIST')>
        <.statement>*
        <.end-element('STATEMENT_LIST')>
    }

    token statement {
        <.ws>?
        <.start-element('STATEMENT')>
        [
        || <.statement_control>
        || <.EXPR>
        || <.bogus_statement>
        ]
        <.ws>?
        <.start-token('STATEMENT_TERMINATOR')>
        ';'?
        <.end-token('STATEMENT_TERMINATOR')>
        <.end-element('STATEMENT')>
        <.ws>?
    }

    token bogus_statement {
        <.start-token('BAD_CHARACTER')>
        <-[;]>+
        <.end-token('BAD_CHARACTER')>
    }

    token ws {
        <.start-token('WHITE_SPACE')>
        \s+
        <.end-token('WHITE_SPACE')>
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
        <.name>
        <.end-element('USE_STATEMENT')>
    }

    token term {
        || <.variable>
        || <.value>
    }

    token variable {
        <.start-element('VARIABLE')>
        <.start-token('VARIABLE')>
        <.sigil> <.twigil>? <.desigilname>
        <.end-token('VARIABLE')>
        <.end-element('VARIABLE')>
    }

    token sigil { <[$@%&]> }

    # XXX Missing lookahead <?before \w> at end
    token twigil { <[.!^:*?=~]> }

    # XXX Hack
    token desigilname { \w+ }

    token name {
        <.start-token('NAME')>
        \w+
        <.end-token('NAME')>
    }

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

        <.ws>?

        [
            <.infixish>
            <.ws>?
            [
                <.prefixish>*
                <.termish>
                <.postfixish>*
            ]?
            <.ws>?
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
        || 'before'
        || '(elem)'
        || '(cont)'
        || 'after'
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
        ]
        <.end-token('INFIX')>
    }

    token termish {
        <.term>
    }
}
