grammar MAIN {
    token TOP {
        <.statementlist>
        [
        || $
        || <.bogus_end>
        ]
    }

    token bogus_end {
        <.start-token('BAD_CHARACTER')>
        .+
        <.end-token('BAD_CHARACTER')>
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
        <!before <[ \( \\ ' \- ]> || \h* '=>'>
    }

    token kok {
        <.end_keyword>
        <?before \s || \# || $ > <.ws>
    }

    token ENDSTMT {
        [
        || <?before \h* $$ <.ws> > <?MARKER('endstmt')>
        || <?before <.unv>? $$ <.ws> > <?MARKER('endstmt')>
        ]?
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
        [<.ws> || $]
        <.start-element('STATEMENT_LIST')>
        [<!before $ || <[\)\]\}]> > <.statement>]*
        <.end-element('STATEMENT_LIST')>
    }

    token statement {
        <!before <[\])}]> || $ >
        <.start-element('STATEMENT')>
        [
        || <.statement_control>
        || <.EXPR>
        || <.bogus_statement>
        ]
        [
        || <.start-token('STATEMENT_TERMINATOR')>
           ';'
           <.end-token('STATEMENT_TERMINATOR')>
        || <?MARKED('endstmt')> <.ws>
        || <?>
        ]
        <.end-element('STATEMENT')>
        <.ws>
    }

    token bogus_statement {
        <.start-token('BAD_CHARACTER')>
        <-[;]>+
        <.end-token('BAD_CHARACTER')>
    }

    token terminator {
        || <?[;)\]}]>
        # XXX <?{ $*IN_REGEX_ASSERTION }> needed below
        || <?[>]>
        || [ 'if' || 'unless' || 'while' || 'until' || 'for' || 'given' || 'when' || 'with' || 'without' ]
           <.kok>
        || '-->'
    }

    token blockoid {
        <.start-token('BLOCK_CURLY_BRACKET')>
        '{'
        <.end-token('BLOCK_CURLY_BRACKET')>
        <.statementlist>
        [
        <.start-token('BLOCK_CURLY_BRACKET')>
        '}'
        <.end-token('BLOCK_CURLY_BRACKET')>
        <?ENDSTMT>
        ]?
    }

    token stdstopper {
        || <?terminator>
        || $
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
        || <.term_ident>
        || <.scope_declarator>
        || <.routine_declarator>
        || <?before 'multi'||'proto'||'only'> <.multi_declarator>
        || <.value>
        || <.term_name>
        || <.term_whatever>
        || <.term_hyperwhatever>
    }

    token term_ident {
        <?before <.identifier> [ <.unsp>? '(' || \\ '(' ]>
        <.start-element('SUB_CALL')>
        <.start-token('SUB_CALL_NAME')>
        <.identifier>
        <.end-token('SUB_CALL_NAME')>
        [ <?before '\\('> <.start-token('WHITE_SPACE')> '\\' <.end-token('WHITE_SPACE')> ]?
        <.args>
        <.end-element('SUB_CALL')>
    }

    # This is rather tricky. A true Perl 6 implementation will rely on knowing
    # on what is and is not a type name. We can start trying to track that in
    # the future while lexing, but even then we'll be going on incomplete info.
    # For now, we assume anything that starts with A..Z is a type name, and
    # anything else is a listop sub name, with the exception of known name
    # types.
    token term_name {
        || <?before <[A..Z]> || '::' || 'u'?'int'\d+ >> || 'num'\d+ >> || 'str' >> || 'array' >> >
           <.start-element('TYPE_NAME')>
           <.start-token('NAME')>
           <.longname>
           <.end-token('NAME')>
           <.end-element('TYPE_NAME')>
        || <.start-element('SUB_CALL')>
           <.start-token('SUB_CALL_NAME')>
           <.longname>
           <.end-token('SUB_CALL_NAME')>
           [ <?before '\\('> <.start-token('WHITE_SPACE')> '\\' <.end-token('WHITE_SPACE')> ]?
           <.args>
           <.end-element('SUB_CALL')>
    }

    token term_whatever {
        <.start-element('WHATEVER')>
        <.start-token('WHATEVER')>
        '*'
        <.end-token('WHATEVER')>
        <.end-element('WHATEVER')>
    }

    token term_hyperwhatever {
        <.start-element('HYPER_WHATEVER')>
        <.start-token('HYPER_WHATEVER')>
        '*'
        <.end-token('HYPER_WHATEVER')>
        <.end-element('HYPER_WHATEVER')>
    }

    token args {
        [
        || <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
           <.semiarglist>
           [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
        || <.unsp>
           <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
           <.semiarglist>
           [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
        || <.start-token('WHITE_SPACE')> \s <.end-token('WHITE_SPACE')> <.arglist>
        || <?>
        ]
    }

    # XXX Cheat
    token semiarglist {
        <.arglist>
        <.ws>
    }

    token arglist {
        <.ws>
        [
        || <!stdstopper> <.EXPR>
        || <?>
        ]
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
        || <.routine_declarator>
    }


    token multi_declarator {
        || <?before ['multi' || 'proto' || 'only'] <.kok>>
           <.start-element('MULTI_DECLARATION')>
           <.start-token('MULTI_DECLARATOR')>
           ['multi' || 'proto' || 'only']
           <.end-token('MULTI_DECLARATOR')>
           <.kok>
           [ <.declarator> || <.routine_def> || <?> ]
           <.end-element('MULTI_DECLARATION')>
        || <.declarator>
    }

    token variable_declarator {
        <.variable>
    }

    token routine_declarator {
        <.start-element('ROUTINE_DECLARATION')>
        [
        || <.start-token('ROUTINE_DECLARATOR')>
           'sub' <.end_keyword>
           <.end-token('ROUTINE_DECLARATOR')>
           <.routine_def>
        ]
        <.end-element('ROUTINE_DECLARATION')>
    }

    token routine_def {
        <.ws>
        [
            <.start-token('ROUTINE_NAME')>
            <.longname>
            <.end-token('ROUTINE_NAME')>
        ]?
        <.ws>
        [
            <.start-element('SIGNATURE')>
            <.start-token('PARENTHESES')>
            '('
            <.end-token('PARENTHESES')>
            <.ws>
            [
            <.start-token('PARENTHESES')>
            ')'
            <.end-token('PARENTHESES')>
            ]?
            <.end-element('SIGNATURE')>
        ]?
        <.ws>
        [
        || <.onlystar>
        || <.blockoid>
        # Allow for body not written yet
        || <?>
        ]
    }

    token onlystar {
        <?before '{' <.ws> '*' <.ws> '}'>
        <.start-token('BLOCK_CURLY_BRACKET')>
        '{'
        <.end-token('BLOCK_CURLY_BRACKET')>
        <.ws>
        <.start-token('ONLY_STAR')>
        '*'
        <.end-token('ONLY_STAR')>
        <.ws>
        <.start-token('BLOCK_CURLY_BRACKET')>
        '}'
        <.end-token('BLOCK_CURLY_BRACKET')>
        <?ENDSTMT>
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
        || <.quote>
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
        <.integer_lex>
        <.end-token('INTEGER_LITERAL')>
        <.end-element('INTEGER_LITERAL')>
    }

    token integer_lex {
        || '0'
            [
            || 'b' '_'? <.binint>
            || 'o' '_'? <.octint>
            || 'x' '_'? <.hexint>
            || 'd' '_'? <.decint>
            || <.decint>
            ]
        || <.decint>
    }

    token decint { [\d+]+ % '_' }
    token hexint { [[\d||<[ a..f A..F ａ..ｆ Ａ..Ｆ ]>]+]+ % '_' }
    token octint { [\d+]+ % '_' }
    token binint { [\d+]+ % '_' }
    token charname {
        || <.integer_lex>
        || <.alpha> [<!before \s* <[ \] , # ]> > .]*
    }

    # XXX These are slightly cheating in that they \s* instead of <.ws>, to
    # avoid token nesting issues in the places using them. It's most likely
    # that we'll get away with that.
    token hexints { [\s*<.hexint>\s*]+ % ',' }
    token octints { [\s*<.octint>\s*]+ % ',' }
    token charnames { [\s*<.charname>\s*]+ % ',' }

    token charspec {
        [
        || '[' <.charnames> ']'
        || \d+ [ '_' \d+]*
        || <[ ?..Z ]>
        ]
    }

    token quote {
        :my $*Q_BACKSLASH = 0;
        :my $*Q_QBACKSLASH = 0;
        :my $*Q_QQBACKSLASH = 0;
        :my $*Q_CLOSURES = 0;
        :my $*Q_SCALARS = 0;
        :my $*Q_ARRAYS = 0;
        :my $*Q_HASHES = 0;
        :my $*Q_FUNCTIONS = 0;
        <.start-element('STRING_LITERAL')>
        [
        || <.start-token('STRING_LITERAL_QUOTE')> '\'' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_q('\'', '\'', '\'')>
           [<.start-token('STRING_LITERAL_QUOTE')> '\'' <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '‘' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_q('‘', '’', '’')>
           [<.start-token('STRING_LITERAL_QUOTE')> '’' <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '‚' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_q('‚', '’', '‘')>
           [<.start-token('STRING_LITERAL_QUOTE')> <[’‘]> <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '’' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_q('’', '’', '‘')>
           [<.start-token('STRING_LITERAL_QUOTE')> <[’‘]> <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '"' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_qq('"', '"', '"')>
           [<.start-token('STRING_LITERAL_QUOTE')> '"' <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '“' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_qq('“', '”', '”')>
           [<.start-token('STRING_LITERAL_QUOTE')> '”' <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '„' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_qq('„', '”', '“')>
           [<.start-token('STRING_LITERAL_QUOTE')> <[”“]> <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '”' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_qq('”', '”', '“')>
           [<.start-token('STRING_LITERAL_QUOTE')> <[”“]> <.end-token('STRING_LITERAL_QUOTE')>]?
        || <.start-token('STRING_LITERAL_QUOTE')> '｢' <.end-token('STRING_LITERAL_QUOTE')>
           <.quote_Q('｢', '｣', '｣')>
           [<.start-token('STRING_LITERAL_QUOTE')> '｣' <.end-token('STRING_LITERAL_QUOTE')>]?
       ]
       <.end-element('STRING_LITERAL')>
    }

    token quote_Q($*STARTER, $*STOPPER, $*ALT_STOPPER) {
        <.quote_nibbler>
    }

    token quote_q($*STARTER, $*STOPPER, $*ALT_STOPPER) {
        { $*Q_QBACKSLASH = 1 }
        <.quote_nibbler>
    }

    token quote_qq($*STARTER, $*STOPPER, $*ALT_STOPPER) {
        { $*Q_BACKSLASH = 1 }
        { $*Q_QQBACKSLASH = 1 }
        { $*Q_CLOSURES = 1 }
        { $*Q_SCALARS = 1 }
        { $*Q_ARRAYS = 1 }
        { $*Q_HASHES = 1 }
        { $*Q_FUNCTIONS = 1 }
        <.quote_nibbler>
    }

    token quote_nibbler {
        [
            <!stopper>
            [
            || <.start-token('STRING_LITERAL_QUOTE')> <.starter> <.end-token('STRING_LITERAL_QUOTE')>
               <.quote_nibbler>
               <.start-token('STRING_LITERAL_QUOTE')> <.stopper> <.end-token('STRING_LITERAL_QUOTE')>
            || <.quote_escape>
            || <.start-token('STRING_LITERAL_CHAR')> . <.end-token('STRING_LITERAL_CHAR')>
            ]
        ]*
    }

    token starter {
        $*STARTER
    }

    token stopper {
        $*STOPPER || $*ALT_STOPPER
    }

    token quote_escape {
        || <?[$]> <?{ $*Q_SCALARS }>
            [
            || <.variable>
            || <.start-token('BAD_ESCAPE')> '$' <.end-token('BAD_ESCAPE')>
            ]
        || <?[\\]> <?{ $*Q_BACKSLASH }>
            <.start-token('STRING_LITERAL_ESCAPE')>
            '\\'
            [
            || <[abefnrt0\\]>
            || 'o' [ <.octint> || '[' <.octints> ']' ]
            || 'x' [ <.hexint> || '[' <.hexints> ']' ]
            || 'c' <.charspec>
            || <.starter>
            || <.stopper>
            ]
            <.end-token('STRING_LITERAL_ESCAPE')>
        || <?[\\]> <?{ $*Q_BACKSLASH }>
           <.start-token('BAD_ESCAPE')> <[1..9]>\d* <.end-token('BAD_ESCAPE')>
        || <?[\\]> <?{ $*Q_QQBACKSLASH }>
           <.start-token('STRING_LITERAL_ESCAPE')>
           '\\' \W
           <.end-token('STRING_LITERAL_ESCAPE')>
        || <?[\\]> <?{ $*Q_QQBACKSLASH }>
           <.start-token('BAD_ESCAPE')> '\\' \w <.end-token('BAD_ESCAPE')>
        || <?[\\]> <?{ $*Q_QBACKSLASH }>
            <.start-token('STRING_LITERAL_ESCAPE')>
            '\\'
            [
            || '\\'
            || <.starter>
            || <.stopper>
            ]
            <.end-token('STRING_LITERAL_ESCAPE')>
    }

    token EXPR {
        <.start-element('EXPR')>

        <.prefixish>*
        <.termish>
        <.postfixish>*

        [
            <?before <.ws> <.infixish>>
            <.ws>
            <.infixish>
            <.ws>
            [
                <.prefixish>*
                <.termish>
                <.postfixish>*
            ]?
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
        || <.start-element('POSTFIX')>
           <.postfix>
           <.end-element('POSTFIX')>
        || <.dotty>
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

    token dotty {
        <.start-element('METHOD_CALL')>
        <.start-token('METHOD_CALL_OPERATOR')>
        '.' [ <[+*?=]> || '^' ]?
        <.end-token('METHOD_CALL_OPERATOR')>
        <.dottyop>?
        <.end-element('METHOD_CALL')>
    }

    token dottyop {
        <.unsp>?
        [
        || <.methodop>
        ]
    }

    token methodop {
        [
        || <.start-token('METHOD_CALL_NAME')>
           <.longname>
           <.end-token('METHOD_CALL_NAME')>
        || <?[$@&]> <.variable>
        ] <.unsp>?
        [
            [
            || <?[(]> <.args>
            || <?before ':' [ \s || '{']>
               <.start-token('INVOCANT_MARKER')>
               ':'
               <.end-token('INVOCANT_MARKER')>
               <.arglist>
            ]
            || <?>
        ] <.unsp>?
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
