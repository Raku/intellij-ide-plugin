grammar MAIN {
    token TOP {
        :my $*GOAL = '';
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

    token spacey { <?[\s]> || <?[#]> }

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

    token vnum {
        \w+ || '*'
    }

    token version {
        <?before 'v'\d+\w*>
        <.start-element('VERSION')>
        <.start-token('VERSION')>
        'v' [<.vnum>+ % '.' '+'?]
        <.end-token('VERSION')>
        <.end-element('VERSION')>
    }

    ## Top-level structure

    token statementlist {
        [<.ws> || $]
        <.start-element('STATEMENT_LIST')>
        [<!before $ || <[\)\]\}]> > <.statement>]*
        <.end-element('STATEMENT_LIST')>
    }

    token semilist {
        <.ws>
        <.start-element('SEMI_LIST')>
        [
        || <?before <[)\]}]> > <.start-token('SEMI_LIST_END')> <?> <.end-token('SEMI_LIST_END')>
        || [<!before $ || <[\)\]\}]> > <.statement>]*
        ]
        <.end-element('SEMI_LIST')>
    }

    token statement {
        <!before <[\])}]> || $ >
        <.start-element('STATEMENT')>
        [
        || <.statement_control>
        || <.EXPR('')>
            [
                || <?MARKED('endstmt')>
                   <.start-token('END_OF_STATEMENT')> <?> <.end-token('END_OF_STATEMENT')>
                || <?before <.ws> <.statement_mod_cond_keyword> <.kok>>
                   <.ws>
                   <.statement_mod_cond>
                   [
                        <?before <.ws> <.statement_mod_loop_keyword> <.kok>>
                        <.ws>
                        <.statement_mod_loop>
                   ]?
                || <?before <.ws> <.statement_mod_loop_keyword> <.kok>>
                   <.ws>
                   <.statement_mod_loop>
            ]?
        || <.bogus_statement>
        ]
        [
        || <.start-token('STATEMENT_TERMINATOR')>
           ';'
           <.end-token('STATEMENT_TERMINATOR')>
        || <?MARKED('endstmt')>
           <.start-token('END_OF_STATEMENT')> <?> <.end-token('END_OF_STATEMENT')>
           <.ws>
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

    token xblock {
        :my $*GOAL = '{';
        <.EXPR('')> <.ws> <.pblock>?
    }

    token pblock {
        || <.start-token('LAMBDA')>
           <.lambda>
           <.end-token('LAMBDA')>
           :my $*GOAL = '{';
           <.ws>
           <.start-element('SIGNATURE')>
           <.signature>
           <.end-element('SIGNATURE')>
           <.blockoid>?
        || <?[{]> <.blockoid>
        || <?>
    }

    token lambda { '->' || '<->' }

    token block {
        <.blockoid>
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
        <.start-element('BLOCK')>
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
        <.end-element('BLOCK')>
    }

    token stdstopper {
        || <?terminator>
        || $
    }

    ## Statement controls

    token statement_control {
        || <.statement_control_if>
        || <.statement_control_unless>
        || <.statement_control_without>
        || <.statement_control_while>
        || <.statement_control_until>
        || <.statement_control_repeat>
        || <.statement_control_for>
        || <.statement_control_whenever>
        || <.statement_control_loop>
        || <.statement_control_need>
        || <.statement_control_import>
        || <.statement_control_no>
        || <.statement_control_use>
        || <.statement_control_require>
        || <.statement_control_given>
        || <.statement_control_when>
        || <.statement_control_default>
        || <.statement_control_CATCH>
        || <.statement_control_CONTROL>
        || <.statement_control_QUIT>
    }

    token statement_control_if {
        <?before ['if'||'with'] <.kok>>
        <.start-element('IF_STATEMENT')>
        [
        || <.start-token('STATEMENT_CONTROL')>
           'if'
           <.end-token('STATEMENT_CONTROL')>
        || <.start-token('STATEMENT_CONTROL')>
           'with'
           <.end-token('STATEMENT_CONTROL')>
        ]
        <.kok>
        <.ws>
        [
            <.xblock>
            <.ws>
            [
                <?before ['elsif' || 'orwith'] <.ws>>
                [
                || <.start-token('STATEMENT_CONTROL')>
                   'elsif'
                   <.end-token('STATEMENT_CONTROL')>
                || <.start-token('STATEMENT_CONTROL')>
                   'orwith'
                   <.end-token('STATEMENT_CONTROL')>
                ]
                <.ws>
                <.xblock>?
                <.ws>
            ]*
            <.ws>
            [
                <?before 'else' <.ws>>
                <.start-token('STATEMENT_CONTROL')>
                'else'
                <.end-token('STATEMENT_CONTROL')>
                <.ws>
                <.pblock>?
            ]?
        ]?
        <.end-element('IF_STATEMENT')>
    }

    token statement_control_unless {
        <?before 'unless' <.kok>>
        <.start-element('UNLESS_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'unless'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('UNLESS_STATEMENT')>
    }

    token statement_control_without {
        <?before 'without' <.kok>>
        <.start-element('WITHOUT_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'without'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('WITHOUT_STATEMENT')>
    }

    token statement_control_while {
        <?before 'while' <.kok>>
        <.start-element('WHILE_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'while'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('WHILE_STATEMENT')>
    }

    token statement_control_until {
        <?before 'until' <.kok>>
        <.start-element('UNTIL_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'until'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('UNTIL_STATEMENT')>
    }

    token statement_control_repeat {
        <?before 'repeat' <.kok>>
        <.start-element('REPEAT_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'repeat'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        [
        || <?before ['while'||'until'] <.kok>>
           [
           || <.start-token('STATEMENT_CONTROL')>
              'while'
              <.end-token('STATEMENT_CONTROL')>
           || <.start-token('STATEMENT_CONTROL')>
              'until'
               <.end-token('STATEMENT_CONTROL')>
           ]
           <.kok>
           <.ws>
           <.xblock>?
        || <.pblock>
           <.ws>
           [
               <?before ['while'||'until'] <.kok>>
               [
               || <.start-token('STATEMENT_CONTROL')>
                  'while'
                  <.end-token('STATEMENT_CONTROL')>
               || <.start-token('STATEMENT_CONTROL')>
                  'until'
                   <.end-token('STATEMENT_CONTROL')>
               ]
               <.EXPR('')>?
           ]?
        || <?>
        ]
        <.end-element('REPEAT_STATEMENT')>
    }

    token statement_control_for {
        <?before 'for' <.kok>>
        <.start-element('FOR_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'for'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('FOR_STATEMENT')>
    }

    token statement_control_whenever {
        <?before 'whenever' <.kok>>
        <.start-element('WHENEVER_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'whenever'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('WHENEVER_STATEMENT')>
    }

    token statement_control_loop {
        <?before 'loop' <.kok>>
        <.start-element('LOOP_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'loop'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        [
            <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
            <.ws>
            <.EXPR('')>?
            <.ws>
            [
                <.start-token('STATEMENT_TERMINATOR')>
                ';'
                <.end-token('STATEMENT_TERMINATOR')>
                <.ws>
                <.EXPR('')>?
                <.ws>
                [
                    <.start-token('STATEMENT_TERMINATOR')>
                    ';'
                    <.end-token('STATEMENT_TERMINATOR')>
                    <.ws>
                    <.EXPR('')>?
                    <.ws>
                ]?
            ]?
            [<.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')>]?
            <.ws>
        ]?
        <.block>?
        <.end-element('LOOP_STATEMENT')>
    }

    token statement_control_need {
        <.start-element('NEED_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'need'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        [
            [
            || <.version>
            || <.module_name>
            ]
            <.ws>
            [
                <.start-token('INFIX')>
                ','
                <.end-token('INFIX')>
                <.ws>
                [
                || <.version>
                || <.module_name>
                ]?
                <.ws>
            ]*
        ]?
        <.end-element('NEED_STATEMENT')>
    }

    token statement_control_import {
        <.start-element('IMPORT_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'import'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        [
            <.module_name>
            [ <.spacey> <.arglist> ]?
            <.ws>
        ]?
        <.end-element('IMPORT_STATEMENT')>
    }

    token statement_control_no {
        <.start-element('NO_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'no'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        [
            <.module_name>
            [ <.spacey> <.arglist> ]?
            <.ws>
        ]?
        <.end-element('NO_STATEMENT')>
    }

    token statement_control_use {
        <.start-element('USE_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'use'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        [
        || <.version>
        || <.module_name> [ <.spacey> <.arglist> ]?
        ]?
        <.ws>
        <.end-element('USE_STATEMENT')>
    }

    token statement_control_require {
        <.start-element('REQUIRE_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'require'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        [
            [
            || <.module_name>
            || <.variable>
            || <!sigil> <.term>
            ]
            <.ws>
            <.EXPR('')>?
        ]?
        <.end-element('REQUIRE_STATEMENT')>
    }

    token statement_control_given {
        <?before 'given' <.kok>>
        <.start-element('GIVEN_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'given'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('GIVEN_STATEMENT')>
    }

    token statement_control_when {
        <?before 'when' <.kok>>
        <.start-element('WHEN_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'when'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.xblock>?
        <.end-element('WHEN_STATEMENT')>
    }

    token statement_control_default {
        <?before 'default' <.kok>>
        <.start-element('DEFAULT_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'default'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.block>?
        <.end-element('DEFAULT_STATEMENT')>
    }

    token statement_control_CATCH {
        <?before 'CATCH' <.kok>>
        <.start-element('CATCH_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'CATCH'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.block>?
        <.end-element('CATCH_STATEMENT')>
    }

    token statement_control_CONTROL {
        <?before 'CONTROL' <.kok>>
        <.start-element('CONTROL_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'CONTROL'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.block>?
        <.end-element('CONTROL_STATEMENT')>
    }

    token statement_control_QUIT {
        <?before 'QUIT' <.kok>>
        <.start-element('QUIT_STATEMENT')>
        <.start-token('STATEMENT_CONTROL')>
        'QUIT'
        <.end-token('STATEMENT_CONTROL')>
        <.kok>
        <.ws>
        <.block>?
        <.end-element('QUIT_STATEMENT')>
    }

    ## Statement prefixes

    token statement_prefix {
        || <.statement_prefix_DOC>
        || <.statement_prefix_phaser>
        || <.statement_prefix_race>
        || <.statement_prefix_hyper>
        || <.statement_prefix_lazy>
        || <.statement_prefix_eager>
        || <.statement_prefix_sink>
        || <.statement_prefix_try>
        || <.statement_prefix_quietly>
        || <.statement_prefix_gather>
        || <.statement_prefix_once>
        || <.statement_prefix_start>
        || <.statement_prefix_supply>
        || <.statement_prefix_react>
        || <.statement_prefix_do>
    }

    token phaser_name {
        || 'BEGIN'
        || 'COMPOSE'
        || 'TEMP'
        || 'CHECK'
        || 'INIT'
        || 'ENTER'
        || 'FIRST'
        || 'END'
        || 'LEAVE'
        || 'KEEP'
        || 'UNDO'
        || 'NEXT'
        || 'LAST'
        || 'PRE'
        || 'POST'
        || 'CLOSE'
    }

    token statement_prefix_DOC {
        <?before 'DOC' <.kok>>
        <.start-element('PHASER')>
        <.start-token('PHASER')>
        'DOC'
        <.end-token('PHASER')>
        <.kok>
        <.ws>
        [
            <?before ['BEGIN' || 'CHECK' || 'INIT'] <.end_keyword>>
            <.statement_prefix>
        ]?
        <.end-element('PHASER')>
    }

    token statement_prefix_phaser {
        <?before <.phaser_name> <.kok>>
        <.start-element('PHASER')>
        <.start-token('PHASER')>
        <.phaser_name>
        <.end-token('PHASER')>
        <.kok>
        <.blorst>
        <.end-element('PHASER')>
    }

    token statement_prefix_race {
        <?before 'race' <.kok>>
        <.start-element('RACE')>
        <.start-token('STATEMENT_PREFIX')>
        'race'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('RACE')>
    }

    token statement_prefix_hyper {
        <?before 'hyper' <.kok>>
        <.start-element('HYPER')>
        <.start-token('STATEMENT_PREFIX')>
        'hyper'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('HYPER')>
    }

    token statement_prefix_lazy {
        <?before 'lazy' <.kok>>
        <.start-element('LAZY')>
        <.start-token('STATEMENT_PREFIX')>
        'lazy'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('LAZY')>
    }

    token statement_prefix_eager {
        <?before 'eager' <.kok>>
        <.start-element('EAGER')>
        <.start-token('STATEMENT_PREFIX')>
        'eager'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('EAGER')>
    }

    token statement_prefix_sink {
        <?before 'sink' <.kok>>
        <.start-element('SINK')>
        <.start-token('STATEMENT_PREFIX')>
        'sink'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('SINK')>
    }

    token statement_prefix_try {
        <?before 'try' <.kok>>
        <.start-element('TRY')>
        <.start-token('STATEMENT_PREFIX')>
        'try'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('TRY')>
    }

    token statement_prefix_quietly {
        <?before 'quietly' <.kok>>
        <.start-element('QUIETLY')>
        <.start-token('STATEMENT_PREFIX')>
        'quietly'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('QUIETLY')>
    }

    token statement_prefix_gather {
        <?before 'gather' <.kok>>
        <.start-element('GATHER')>
        <.start-token('STATEMENT_PREFIX')>
        'gather'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('GATHER')>
    }

    token statement_prefix_once {
        <?before 'once' <.kok>>
        <.start-element('ONCE')>
        <.start-token('STATEMENT_PREFIX')>
        'once'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('ONCE')>
    }

    token statement_prefix_start {
        <?before 'start' <.kok>>
        <.start-element('START')>
        <.start-token('STATEMENT_PREFIX')>
        'start'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('START')>
    }

    token statement_prefix_supply {
        <?before 'supply' <.kok>>
        <.start-element('SUPPLY')>
        <.start-token('STATEMENT_PREFIX')>
        'supply'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('SUPPLY')>
    }

    token statement_prefix_react {
        <?before 'react' <.kok>>
        <.start-element('REACT')>
        <.start-token('STATEMENT_PREFIX')>
        'react'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('REACT')>
    }

    token statement_prefix_do {
        <?before 'do' <.kok>>
        <.start-element('DO')>
        <.start-token('STATEMENT_PREFIX')>
        'do'
        <.end-token('STATEMENT_PREFIX')>
        <.kok>
        <.blorst>
        <.end-element('DO')>
    }

    token blorst {
        [
        || <?[{]> <.block>
        || <.statement>
        || <?>
        ]
    }

    ## Statement modifiers

    token statement_mod_cond_keyword {
        'if' || 'unless' || 'when' || 'with' || 'without'
    }

    token statement_mod_cond {
        <?before <.statement_mod_cond_keyword> <.kok>>
        <.start-element('STATEMENT_MOD_COND')>
        <.start-token('STATEMENT_MOD_COND')>
        <.statement_mod_cond_keyword>
        <.end-token('STATEMENT_MOD_COND')>
        <.kok>
        <.ws>
        <.EXPR('')>?
        <.end-element('STATEMENT_MOD_COND')>
    }

    token statement_mod_loop_keyword {
        'while' || 'until' || 'for' || 'given'
    }

    token statement_mod_loop {
        <?before <.statement_mod_loop_keyword> <.kok>>
        <.start-element('STATEMENT_MOD_LOOP')>
        <.start-token('STATEMENT_MOD_LOOP')>
        <.statement_mod_loop_keyword>
        <.end-token('STATEMENT_MOD_LOOP')>
        <.kok>
        <.ws>
        <.EXPR('')>?
        <.end-element('STATEMENT_MOD_LOOP')>
    }

    ## Terms

    token term {
        || <.variable>
        || <.term_ident>
        || <.scope_declarator>
        || <.routine_declarator>
        || <?before 'multi'||'proto'||'only'> <.multi_declarator>
        || <.statement_prefix>
        || <.package_declarator>
        || <.dotty>
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
        :my $*GOAL = '';
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
        :my $*GOAL = 'endargs';
        <.ws>
        [
        || <!stdstopper> <.EXPR('e=')>
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
        || <.package_declarator>
        || <.declarator>
        || <?>
        ]
        <.end-element('SCOPED_DECLARATION')>
    }

    token declarator {
        ||  [
            <.start-element('VARIABLE_DECLARATION')>
            <.variable_declarator>
            <.ws> <.initializer>?
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
            <.signature>
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

    ## Captures and Signatures

    token param_sep {
        <?before <.ws> [','||':'||';;'||';']>
        <.ws>
        <.start-token('PARAMETER_SEPARATOR')>
        [','||':'||';;'||';']
        <.end-token('PARAMETER_SEPARATOR')>
        <.ws>
    }

    token signature {
        <.ws>
        [
        || <?before '-->' || ')' || ']' || '{' || ':'\s || ';;' >
           <.start-token('END_OF_PARAMETERS')> <?> <.end-token('END_OF_PARAMETERS')>
        || <.parameter>
           [
               <.param_sep>
               [
               || <?before '-->' || ')' || ']' || '{' || ':'\s || ';;' >
                  <.start-token('END_OF_PARAMETERS')> <?> <.end-token('END_OF_PARAMETERS')>
               || <.parameter>
               ]?
           ]*
        || <?>
        ]
        <.ws>
    }

    token parameter {
        <.start-element('PARAMETER')>
        [ <.param_var> || <.named_param> ]
        <.end-element('PARAMETER')>
    }

    token param_var {
        [
        || <.start-element('SIGNATURE')>
           <.start-token('PARENTHESES')>
           '['
           <.end-token('PARENTHESES')>
           <.signature>
           [
           <.start-token('PARENTHESES')>
           ']'
           <.end-token('PARENTHESES')>
           ]?
           <.end-element('SIGNATURE')>
        || <.start-element('SIGNATURE')>
           <.start-token('PARENTHESES')>
           '('
           <.end-token('PARENTHESES')>
           <.signature>
           [
           <.start-token('PARENTHESES')>
           ')'
           <.end-token('PARENTHESES')>
           ]?
           <.end-element('SIGNATURE')>
        || <.start-element('PARAMETER_VARIABLE')>
           <.start-token('VARIABLE')>
           <.sigil> <.twigil>?
           [
           || <.identifier>
           || <[/!]>
           ]?
           <.end-token('VARIABLE')>
           [
               <?before '['>
               <.start-element('ARRAY_SHAPE')>
               <.postcircumfix>
               <.end-element('ARRAY_SHAPE')>
           ]?
           <.end-element('PARAMETER_VARIABLE')>
       ]
    }

    token named_param {
        :my $*GOAL = ')';
        <.start-element('NAMED_PARAMETER')>
        <.start-token('NAMED_PARAMETER_SYNTAX')>
        ':'
        <.end-token('NAMED_PARAMETER_SYNTAX')>
        [
        || <.start-token('NAMED_PARAMETER_NAME_ALIAS')>
           <.identifier>
           <.end-token('NAMED_PARAMETER_NAME_ALIAS')>
           [
               <.start-token('NAMED_PARAMETER_SYNTAX')>
               '('
               <.end-token('NAMED_PARAMETER_SYNTAX')>
               <.ws>
               [
                   [ <.named_param> || <.param_var> ]
                   <.ws>
                   [
                       <.start-token('NAMED_PARAMETER_SYNTAX')>
                       ')'
                       <.end-token('NAMED_PARAMETER_SYNTAX')>
                   ]?
               ]
           ]?
        || <.param_var>
        ]?
        <.end-element('NAMED_PARAMETER')>
    }

    token initializer {
        <.start-element('INFIX')>
        <.start-token('INFIX')>
        ['=' || ':=' || '::=']
        <.end-token('INFIX')>
        <.end-element('INFIX')>
        <.ws>
        <.EXPR('e=')>?
    }

    token sigil { <[$@%&]> }

    token twigil { <[.!^:*?=~]> <?before \w> }

    token package_declarator {
        <?before <.package_kind> <.kok>>
        <.start-element('PACKAGE_DECLARATION')>
        <.start-token('PACKAGE_DECLARATOR')>
        <.package_kind>
        <.end-token('PACKAGE_DECLARATOR')>
        <.kok>
        <.package_def>
        <.end-element('PACKAGE_DECLARATION')>
    }

    token package_kind {
        'package' || 'module' || 'class' || 'grammar' || 'role' || 'knowhow' || 'native' || 'slang'
    }

    token package_def {
        <.ws>
        [
            <.start-token('NAME')>
            <.longname>
            <.end-token('NAME')>
            <.ws>
        ]?
        [
        || <?[{]> <.blockoid>
        || <?[;]>
           <.start-token('STATEMENT_TERMINATOR')>
           ';'
           <.end-token('STATEMENT_TERMINATOR')>
           <.ws>
           <.statementlist>?
        || <?>
        ]
    }

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
        || <?[{]> <?{ $*Q_CLOSURES }> <.block>
    }

    token EXPR($*PRECLIM) {
        :my $*PREC = '';
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

        # Zero-width marker token to get nesting correct.
        <.start-token('END_OF_EXPR')>
        <?>
        <.end-token('END_OF_EXPR')>

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
        || '++⚛' { $*PREC = 'x=' }
        || '--⚛' { $*PREC = 'x=' }
        || '++' { $*PREC = 'x=' }
        || '--' { $*PREC = 'x=' }
        || '+^' { $*PREC = 'v=' }
        || '~^' { $*PREC = 'v=' }
        || '?^' { $*PREC = 'v=' }
        || '+' { $*PREC = 'v=' }
        || '~' { $*PREC = 'v=' }
        || '-' { $*PREC = 'v=' }
        || '−' { $*PREC = 'v=' }
        || '?' { $*PREC = 'v=' }
        || '!' { $*PREC = 'v=' }
        || '|' { $*PREC = 'v=' }
        || '^' { $*PREC = 'v=' }
        || '⚛' { $*PREC = 'v=' }
        ]
        <.end-token('PREFIX')>
    }

    token postfixish {
        || <.start-element('POSTFIX')>
           <.postfix>
           <.end-element('POSTFIX')>
        || <.postcircumfix> { $*PREC = 'y=' }
        || <.dotty> { $*PREC = 'y=' }
    }

    token postfix {
        <.start-token('POSTFIX')>
        [
        || 'i' { $*PREC = 'y=' }
        || '⚛++' { $*PREC = 'x=' }
        || '⚛--' { $*PREC = 'x=' }
        || '++' { $*PREC = 'x=' }
        || '--' { $*PREC = 'x=' }
        || <[⁻⁺¯]>? <[⁰¹²³⁴⁵⁶⁷⁸⁹]>+ { $*PREC = 'x=' }
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

    token postcircumfix {
        :my $*Q_BACKSLASH = 0;
        :my $*Q_QBACKSLASH = 0;
        :my $*Q_QQBACKSLASH = 0;
        :my $*Q_CLOSURES = 0;
        :my $*Q_SCALARS = 0;
        :my $*Q_ARRAYS = 0;
        :my $*Q_HASHES = 0;
        :my $*Q_FUNCTIONS = 0;
        [
        || <.start-element('ARRAY_INDEX')>
           <.start-token('ARRAY_INDEX_BRACKET')>
           '['
           <.end-token('ARRAY_INDEX_BRACKET')>
           [
               <.ws>
               <.semilist>?
               [
                   <.start-token('ARRAY_INDEX_BRACKET')>
                   ']'
                   <.end-token('ARRAY_INDEX_BRACKET')>
               ]?
           ]?
           <.end-element('ARRAY_INDEX')>
        || <.start-element('HASH_INDEX')>
           <.start-token('HASH_INDEX_BRACKET')>
           '{'
           <.end-token('HASH_INDEX_BRACKET')>
           [
               <.ws>
               <.semilist>?
               [
                   <.start-token('HASH_INDEX_BRACKET')>
                   '}'
                   <.end-token('HASH_INDEX_BRACKET')>
               ]?
           ]?
           <.end-element('HASH_INDEX')>
        || <.start-element('HASH_INDEX')>
           <.start-token('HASH_INDEX_BRACKET')>
           '<<'
           <.end-token('HASH_INDEX_BRACKET')>
           [
               <.quote_qq('<<', '>>', '>>')>
               [
                   <.start-token('HASH_INDEX_BRACKET')>
                   '>>'
                   <.end-token('HASH_INDEX_BRACKET')>
               ]?
           ]?
           <.end-element('HASH_INDEX')>
        || <.start-element('HASH_INDEX')>
           <.start-token('HASH_INDEX_BRACKET')>
           '«'
           <.end-token('HASH_INDEX_BRACKET')>
           [
               <.quote_qq('«', '»', '»')>
               [
                   <.start-token('HASH_INDEX_BRACKET')>
                   '»'
                   <.end-token('HASH_INDEX_BRACKET')>
               ]?
           ]?
           <.end-element('HASH_INDEX')>
        || <.start-element('HASH_INDEX')>
           <.start-token('HASH_INDEX_BRACKET')>
           '<'
           <.end-token('HASH_INDEX_BRACKET')>
           [
               <.quote_q('<', '>', '>')>
               [
                   <.start-token('HASH_INDEX_BRACKET')>
                   '>'
                   <.end-token('HASH_INDEX_BRACKET')>
               ]?
           ]?
           <.end-element('HASH_INDEX')>
        || <.start-element('CALL')>
           <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
           <.arglist>
           [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
           <.end-element('CALL')>
       ]
    }

    token infixish {
        <!stdstopper>
        <!infixstopper>
        <.start-element('INFIX')>
        <.infix>
        <.end-element('INFIX')>
    }

    token infixstopper {
        [
        || <?before '!!'> <?{ $*GOAL eq '!!' }>
        || <?before '{' || <.lambda> > [ <?{ $*GOAL eq '{' }> || <?{ $*GOAL eq 'endargs' }> ]
        ]
    }

    token infix {
        <.start-token('INFIX')>
        [
        || 'notandthen' { $*PREC = 'd=' }
        || 'andthen' { $*PREC = 'd=' }
        || '(elem)' { $*PREC = 'm=' }
        || '(cont)' { $*PREC = 'm=' }
        || 'orelse' { $*PREC = 'c=' }
        || 'unicmp' { $*PREC = 'n=' }
        || 'minmax' { $*PREC = 'f=' }
        || 'before' { $*PREC = 'm=' }
        || 'after' { $*PREC = 'm=' }
        || '^fff^' { $*PREC = 'j=' }
        || '...^' { $*PREC = 'f=' }
        || '^ff^' { $*PREC = 'j=' }
        || '^fff' { $*PREC = 'j=' }
        || 'fff^' { $*PREC = 'j=' }
        || '<<==' { $*PREC = 'b=' }
        || '==>>' { $*PREC = 'b=' }
        || '^..^' { $*PREC = 'n=' }
        || 'coll' { $*PREC = 'n=' }
        || 'does' { $*PREC = 'n=' }
        || 'div' { $*PREC = 'u=' }
        || 'gcd' { $*PREC = 'u=' }
        || 'lcm' { $*PREC = 'u=' }
        || 'mod' { $*PREC = 'u=' }
        || '(&)' { $*PREC = 'q=' }
        || '(.)' { $*PREC = 'q=' }
        || '(|)' { $*PREC = 'p=' }
        || '(^)' { $*PREC = 'p=' }
        || '(+)' { $*PREC = 'p=' }
        || '(-)' { $*PREC = 'p=' }
        || '=~=' { $*PREC = 'm=' }
        || '=:=' { $*PREC = 'm=' }
        || '===' { $*PREC = 'm=' }
        || 'eqv' { $*PREC = 'm=' }
        || '!~~' { $*PREC = 'm=' }
        || '(<)' { $*PREC = 'm=' }
        || '(>)' { $*PREC = 'm=' }
        || '(<=)' { $*PREC = 'm=' }
        || '(>=)' { $*PREC = 'm=' }
        || '(<+)' { $*PREC = 'm=' }
        || '(>+)' { $*PREC = 'm=' }
        || 'min' { $*PREC = 'k=' }
        || 'max' { $*PREC = 'k=' }
        || '::=' { $*PREC = 'i=' }
        || '...' { $*PREC = 'f=' }
        || '^ff' { $*PREC = 'j=' }
        || 'ff^' { $*PREC = 'j=' }
        || 'fff' { $*PREC = 'j=' }
        || '⚛+=' { $*PREC = 'i=' }
        || '⚛-=' { $*PREC = 'i=' }
        || '⚛−=' { $*PREC = 'i=' }
        || 'and' { $*PREC = 'd=' }
        || 'xor' { $*PREC = 'c=' }
        || '<==' { $*PREC = 'b=' }
        || '==>' { $*PREC = 'b=' }
        || '^..' { $*PREC = 'n=' }
        || '..^' { $*PREC = 'n=' }
        || 'leg' { $*PREC = 'n=' }
        || 'cmp' { $*PREC = 'n=' }
        || '<=>' { $*PREC = 'n=' }
        || 'but' { $*PREC = 'n=' }
        || '**' { $*PREC = 'w=' }
        || '%%' { $*PREC = 'u=' }
        || '+&' { $*PREC = 'u=' }
        || '~&' { $*PREC = 'u=' }
        || '?&' { $*PREC = 'u=' }
        || '+<' { $*PREC = 'u=' }
        || '+>' { $*PREC = 'u=' }
        || '~<' { $*PREC = 'u=' }
        || '~>' { $*PREC = 'u=' }
        || '+|' { $*PREC = 't=' }
        || '+^' { $*PREC = 't=' }
        || '~|' { $*PREC = 't=' }
        || '~^' { $*PREC = 't=' }
        || '?|' { $*PREC = 't=' }
        || '?^' { $*PREC = 't=' }
        || 'xx' { $*PREC = 's=' }
        || '==' { $*PREC = 'm=' }
        || '!=' { $*PREC = 'm=' }
        || '<=' { $*PREC = 'm=' }
        || '>=' { $*PREC = 'm=' }
        || 'eq' { $*PREC = 'm=' }
        || 'ne' { $*PREC = 'm=' }
        || 'le' { $*PREC = 'm=' }
        || 'ge' { $*PREC = 'm=' }
        || 'lt' { $*PREC = 'm=' }
        || 'gt' { $*PREC = 'm=' }
        || '~~' { $*PREC = 'm=' }
        || '&&' { $*PREC = 'l=' }
        || '||' { $*PREC = 'k=' }
        || '^^' { $*PREC = 'k=' }
        || '//' { $*PREC = 'k=' }
        || ':=' { $*PREC = 'i=' }
        || '.=' { $*PREC = 'v=' }
        || '…^' { $*PREC = 'f=' }
        || 'ff' { $*PREC = 'j=' }
        || '⚛=' { $*PREC = 'i=' }
        || 'or' { $*PREC = 'c=' }
        || '..' { $*PREC = 'n=' }
        || '*' { $*PREC = 'u=' }
        || '×' { $*PREC = 'u=' }
        || '/' { $*PREC = 'u=' }
        || '÷' { $*PREC = 'u=' }
        || '%' { $*PREC = 'u=' }
        || '+' { $*PREC = 't=' }
        || '-' { $*PREC = 't=' }
        || '−' { $*PREC = 't=' }
        || 'x' { $*PREC = 's=' }
        || '~' { $*PREC = 'r=' }
        || '∘' { $*PREC = 'r=' }
        || 'o' { $*PREC = 'r=' }
        || '&' { $*PREC = 'q=' }
        || '∩' { $*PREC = 'q=' }
        || '⊍' { $*PREC = 'q=' }
        || '|' { $*PREC = 'p=' }
        || '^' { $*PREC = 'p=' }
        || '∪' { $*PREC = 'p=' }
        || '⊖' { $*PREC = 'p=' }
        || '⊎' { $*PREC = 'p=' }
        || '∖' { $*PREC = 'p=' }
        || '≅' { $*PREC = 'm=' }
        || '≠' { $*PREC = 'm=' }
        || '≤' { $*PREC = 'm=' }
        || '≥' { $*PREC = 'm=' }
        || '<' { $*PREC = 'm=' }
        || '>' { $*PREC = 'm=' }
        || '∈' { $*PREC = 'm=' }
        || '∉' { $*PREC = 'm=' }
        || '∋' { $*PREC = 'm=' }
        || '∌' { $*PREC = 'm=' }
        || '⊂' { $*PREC = 'm=' }
        || '⊄' { $*PREC = 'm=' }
        || '⊃' { $*PREC = 'm=' }
        || '⊅' { $*PREC = 'm=' }
        || '⊆' { $*PREC = 'm=' }
        || '⊈' { $*PREC = 'm=' }
        || '⊇' { $*PREC = 'm=' }
        || '⊉' { $*PREC = 'm=' }
        || '≼' { $*PREC = 'm=' }
        || '≽' { $*PREC = 'm=' }
        || ',' { $*PREC = 'g=' }
        || 'Z' { $*PREC = 'f=' }
        || 'X' { $*PREC = 'f=' }
        || '…' { $*PREC = 'f=' }
        || '=' { $*PREC = 'i=' }
        ]
        <!{ $*PREC le $*PRECLIM }>
        <.end-token('INFIX')>
    }

    token termish {
        <.term>
    }
}
