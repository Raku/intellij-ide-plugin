grammar MAIN {
    token TOP {
        :my $*GOAL = '';
        :my $*IN_DECL = '';
        :my $*IN_REGEX_ASSERTION = 0;
        :my $*QSIGIL = '';
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
        :my $*QSIGIL = '';
        '::'
        [
        || <.identifier>
        ]?
    }

    token defterm {
        <.start-element('TERM_DEFINITION')>
        <.start-token('TERM')>
        <.identifier>
        <.end-token('TERM')>
        <.end-element('TERM_DEFINITION')>
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

    token tok {
        <.end_keyword>
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
        :my $*QSIGIL = '';
        [<.ws> || $]
        <.start-element('STATEMENT_LIST')>
        [
            <!before $ || <[\)\]\}]> >
            <.start-element('STATEMENT')>
            <.statement>
            <.eat_terminator>
            <.end-element('STATEMENT')>
        ]*
        <.end-element('STATEMENT_LIST')>
    }

    token semilist {
        <.ws>
        <.start-element('SEMI_LIST')>
        [
        || <?before <[)\]}]> > <.start-token('SEMI_LIST_END')> <?> <.end-token('SEMI_LIST_END')>
        || [
               <!before $ || <[\)\]\}]> >
               <.start-element('STATEMENT')>
               <.statement>
               <.eat_terminator>
               <.end-element('STATEMENT')>
           ]*
        ]
        <.end-element('SEMI_LIST')>
    }

    token statement {
        <!before <[\])}]> || $ >
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
    }

    token bogus_statement {
        <.start-token('BAD_CHARACTER')>
        <-[;]>+
        <.end-token('BAD_CHARACTER')>
    }

    token eat_terminator {
        [
        || <.start-token('STATEMENT_TERMINATOR')>
           ';'
           <.end-token('STATEMENT_TERMINATOR')>
           <.ws>
        || <?MARKED('endstmt')>
           <.start-token('END_OF_STATEMENT')> <?> <.end-token('END_OF_STATEMENT')>
           <.ws>
        || <.ws>
        ]?
    }

    token xblock {
        :my $*GOAL = '{';
        <.EXPR('')> <.ws> <.pblock>?
    }

    token pblock {
        || <.start-element('POINTY_BLOCK')>
           <.start-token('LAMBDA')>
           <.lambda>
           <.end-token('LAMBDA')>
           :my $*GOAL = '{';
           <.ws>
           <.start-element('SIGNATURE')>
           <.signature>
           <.end-element('SIGNATURE')>
           <.blockoid>?
           <.end-element('POINTY_BLOCK')>
        || <?[{]> <.blockoid>
        || <.start-token('MISSING_BLOCK')> <?> <.end-token('MISSING_BLOCK')>
    }

    token lambda { '->' || '<->' }

    token block {
        <.blockoid>
    }

    token terminator {
        || <?[;)\]}]>
        || <?[>]> <?{ $*IN_REGEX_ASSERTION }>
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
        :my $*IN_DECL = 'import';
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
        :my $*IN_DECL = 'no';
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
        :my $*IN_DECL = 'use';
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
        || <.start-token('MISSING_BLORST')> <?> <.end-token('MISSING_BLORST')>
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
        || <.value>
        || <.fatarrow>
        || <.colonpair>
        || <.variable>
        || <.term_self>
        || <.term_ident>
        || <.scope_declarator>
        || <.routine_declarator>
        || <.regex_declarator>
        || <?before 'multi'||'proto'||'only'> <.multi_declarator>
        || <.type_declarator>
        || <.statement_prefix>
        || <.package_declarator>
        || <.term_onlystar>
        || <.term_reduce>
        || <.circumfix>
        || <.term_stub_code>
        || <.dotty>
        || <?lambda> <.pblock>
        || <.term_now>
        || <.term_time>
        || <.term_empty_set>
        || <.term_rand>
        || <.term_whatever>
        || <.term_hyperwhatever>
        || <.term_type_const>
        || <.term_name>
        || <.capterm>
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

    token term_self {
        <.start-element('SELF')>
        <.start-token('SELF')>
        'self' <.end_keyword>
        <.end-token('SELF')>
        <.end-element('SELF')>
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

    token term_type_const {
        <.start-element('TYPE_NAME')>
        <.start-token('NAME')>
        '::?' <.identifier> >>
        <.end-token('NAME')>
        <.end-element('TYPE_NAME')>
    }

    token term_now {
        <?before 'now' <.tok>>
        <.start-element('TERM')>
        <.start-token('TERM')>
        'now'
        <.end-token('TERM')>
        <.tok>
        <.end-element('TERM')>
    }

    token term_time {
        <?before 'time' <.tok>>
        <.start-element('TERM')>
        <.start-token('TERM')>
        'time'
        <.end-token('TERM')>
        <.tok>
        <.end-element('TERM')>
    }

    token term_empty_set {
        <?before ['∅' <!before <[ \( \\ ' \- ]> || \h* '=>'>]>
        <.start-element('TERM')>
        <.start-token('TERM')>
        '∅'
        <.end-token('TERM')>
        <.end-element('TERM')>
    }

    token term_rand {
        <?before 'rand' >> <.end_keyword>>
        <.start-element('TERM')>
        <.start-token('TERM')>
        'rand'
        <.end-token('TERM')>
        <.end_keyword>
        <.end-element('TERM')>
    }

    token term_stub_code {
        <.start-element('STUB_CODE')>
        [
        || <.start-token('STUB_CODE')> '…' <.end-token('STUB_CODE')>
        || <.start-token('STUB_CODE')> '...' <.end-token('STUB_CODE')>
        || <.start-token('STUB_CODE')> '???' <.end-token('STUB_CODE')>
        || <.start-token('STUB_CODE')> '!!!' <.end-token('STUB_CODE')>
        ]
        <.args>
        <.end-element('STUB_CODE')>
    }

    token term_onlystar {
        <.start-element('ONLY_STAR')>
        <.start-token('ONLY_STAR')>
        '{*}'
        <.end-token('ONLY_STAR')>
        <.end-element('ONLY_STAR')>
        <?ENDSTMT>
    }

    token fatarrow {
        <?before <.identifier> \h* '=>' <.ws>>
        <.start-element('FATARROW')>
        <.start-token('PAIR_KEY')>
        <.identifier>
        <.end-token('PAIR_KEY')>
        <.start-token('WHITE_SPACE')>
        \h*
        <.end-token('WHITE_SPACE')>
        <.start-token('INFIX')>
        '=>'
        <.end-token('INFIX')>
        <.ws>
        <.EXPR('i<=')>?
        <.end-element('FATARROW')>
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
        || <.start-token('NO_ARGS')> <?> <.end-token('NO_ARGS')>
        ]
    }

    token colonpair {
        <.start-element('COLON_PAIR')>
        [
        || <?before [':' \d+ <.identifier>]>
           <.start-token('COLON_PAIR')>
           ':'
           <.end-token('COLON_PAIR')>
           <.start-token('INTEGER_LITERAL')>
           \d+
           <.end-token('INTEGER_LITERAL')>
           <.start-token('COLON_PAIR')>
           <.identifier>
           <.end-token('COLON_PAIR')>
        || <?before [':!' <.identifier>]>
           <.start-token('COLON_PAIR')>
           ':!'
           <.end-token('COLON_PAIR')>
           <.start-token('COLON_PAIR')>
           <.identifier>
           <.end-token('COLON_PAIR')>
        || <.start-token('COLON_PAIR')>
           ':('
           <.end-token('COLON_PAIR')>
           <.start-element('SIGNATURE')>
           <.signature>
           <.end-element('SIGNATURE')>
           [
               <.start-token('COLON_PAIR')>
               ')'
               <.end-token('COLON_PAIR')>
           ]?
        || <?before [':' <.sigil> [ <.twigil>? <.identifier> || '<']]>
           <.start-token('COLON_PAIR')>
           ':'
           <.end-token('COLON_PAIR')>
           <.colonpair_variable>
        || <?before [':' <.identifier>]>
           <.start-token('COLON_PAIR')>
           ':'
           <.end-token('COLON_PAIR')>
           <.start-token('COLON_PAIR')>
           <.identifier>
           <.end-token('COLON_PAIR')>
           [
               <?before [<.unsp>? <[[{<«]>]>
               <.start-token('COLON_PAIR_HAS_VALUE')> <?> <.end-token('COLON_PAIR_HAS_VALUE')>
               <.unsp>?
               <.coloncircumfix>
           ]?
        || <?before [':' <[[{<«]>]>
           <.start-token('COLON_PAIR')>
           ':'
           <.end-token('COLON_PAIR')>
           <.coloncircumfix>
        ]
        <.end-element('COLON_PAIR')>
    }

    token coloncircumfix {
        <.circumfix>
    }

    token colonpair_variable {
        <.start-element('VARIABLE')>
        [
        || <.start-token('VARIABLE')>
           <.sigil> <.twigil>? <.desigilname>
           <.end-token('VARIABLE')>
        || <.start-token('REGEX_CAPTURE_NAME')>
           <.sigil> '<' [ <.desigilname> '>'? ]?
           <.end-token('REGEX_CAPTURE_NAME')>
        ]
        <.end-element('VARIABLE')>
    }

    # XXX Cheat
    token semiarglist {
        <.arglist>
        <.ws>
    }

    token arglist {
        :my $*QSIGIL = '';
        :my $*GOAL = 'endargs';
        <.ws>
        <.start-token('ARGLIST_START')> <?> <.end-token('ARGLIST_START')>
        [
        || <?stdstopper> <.start-token('ARGLIST_EMPTY')> <?> <.end-token('ARGLIST_EMPTY')>
        || <.EXPR('e=')>?
        ]
        <.start-token('ARGLIST_END')> <?> <.end-token('ARGLIST_END')>
    }

    token variable {
        :my $*Q_BACKSLASH = 0;
        :my $*Q_QBACKSLASH = 0;
        :my $*Q_QQBACKSLASH = 0;
        :my $*Q_CLOSURES = 0;
        :my $*Q_SCALARS = 0;
        :my $*Q_ARRAYS = 0;
        :my $*Q_HASHES = 0;
        :my $*Q_FUNCTIONS = 0;
        [
        || <.start-element('VARIABLE')>
           <.start-token('VARIABLE')>
           '&['
           <.end-token('VARIABLE')>
           [
               <.infixish>
               [
                   <.start-token('VARIABLE')>
                   ']'
                   <.end-token('VARIABLE')>
               ]?
           ]?
           <.end-element('VARIABLE')>
        || <!{ $*IN_DECL }> <?before <.sigil> '.' <.desigilname>>
           <.start-element('METHOD_CALL')>
           <.start-token('SELF')>
           <.sigil>
           <.end-token('SELF')>
           <.start-token('METHOD_CALL_OPERATOR')>
           '.'
           <.end-token('METHOD_CALL_OPERATOR')>
           <.start-token('METHOD_CALL_NAME')>
           <.desigilname>
           <.end-token('METHOD_CALL_NAME')>
           [
               <?before [ <.unsp> || '\\' || <?> ] '('>
               [
               || <.unsp>
               || <.start-token('WHITE_SPACE')>
                  '\\'
                  <.end-token('WHITE_SPACE')>
               ]?
               <.postcircumfix>
           ]?
           <.end-element('METHOD_CALL')>
        || <.start-element('VARIABLE')>
           <.start-token('VARIABLE')>
           '$' <[/_!¢]>
           <.end-token('VARIABLE')>
           <.end-element('VARIABLE')>
        || <.start-element('VARIABLE')>
           <.start-token('VARIABLE')>
           <.sigil> <.twigil>? <.desigilname>
           <.end-token('VARIABLE')>
           <.end-element('VARIABLE')>
        || <?before [<.sigil> '<']>
           <.start-token('VARIABLE_REGEX_NAMED_CAPTURE')>
           <?>
           <.end-token('VARIABLE_REGEX_NAMED_CAPTURE')>
           <.start-element('VARIABLE')>
           <.start-token('REGEX_CAPTURE_NAME')>
           <.sigil> '<'
           <.end-token('REGEX_CAPTURE_NAME')>
           <.quote_q('<', '>', '>')>
           [
               <.start-token('REGEX_CAPTURE_NAME')>
               '>'
               <.end-token('REGEX_CAPTURE_NAME')>
           ]?
           <.end-element('VARIABLE')>
        || <.start-element('VARIABLE')>
           <.start-token('REGEX_CAPTURE_NAME')>
           <.sigil> \d+
           <.end-token('REGEX_CAPTURE_NAME')>
           <.end-element('VARIABLE')>
        || <?before <.sigil> <?[ ( [ { ]>> <!{ $*IN_DECL }> <.contextualizer>
        || <!{ $*QSIGIL }>
           <.start-element('VARIABLE')>
           <.start-token('VARIABLE')>
           <.sigil>
           <.end-token('VARIABLE')>
           <.end-element('VARIABLE')>
           <?MARKER('baresigil')>
        ]
    }

    token contextualizer {
        <.start-element('CONTEXTUALIZER')>
        [
        || <.start-token('CONTEXTUALIZER')>
           <.sigil>
           <.end-token('CONTEXTUALIZER')>
           <.start-token('CONTEXTUALIZER')>
           '('
           <.end-token('CONTEXTUALIZER')>
           <.semilist>
           [
               <.start-token('CONTEXTUALIZER')>
               ')'
               <.end-token('CONTEXTUALIZER')>
           ]?
        || <?before [<.sigil> <?[ \[ \{ ]>]>
           <.start-token('CONTEXTUALIZER')>
           <.sigil>
           <.end-token('CONTEXTUALIZER')>
           <.circumfix>
        ]
        <.end-element('CONTEXTUALIZER')>
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
        || <.package_declarator>
        || [
               <!before [<.sigil> || <[\\(]> || 'sub' || 'method' ||
                         'regex' || 'token' || 'rule' ||
                         'multi' || 'proto' || 'only']>
               <.typename> <.ws>
           ]+
           <.multi_declarator>?
        || <.multi_declarator>
        || <.start-token('INCOMPLETE_SCOPED_DECLARATION')>
           <?>
           <.end-token('INCOMPLETE_SCOPED_DECLARATION')>
        ]
        <.end-element('SCOPED_DECLARATION')>
    }

    token declarator {
        || <?before '\\' <.defterm>>
           <.start-element('VARIABLE_DECLARATION')>
           <.start-token('TERM_DECLARATION_BACKSLASH')>
           '\\'
           <.end-token('TERM_DECLARATION_BACKSLASH')>
           <.defterm>
           <.ws> <.initializer>?
           <.end-element('VARIABLE_DECLARATION')>
        || <.start-element('VARIABLE_DECLARATION')>
           <.variable_declarator>
           <.ws> <.initializer>?
           <.end-element('VARIABLE_DECLARATION')>
        || <.start-element('VARIABLE_DECLARATION')>
           <.start-token('PARENTHESES')>
           '('
           <.end-token('PARENTHESES')>
           <.start-element('SIGNATURE')>
           <.signature>
           <.end-element('SIGNATURE')>
           [
               <.start-token('PARENTHESES')>
               ')'
               <.end-token('PARENTHESES')>
               <.ws> <.trait>*
               <.ws> <.initializer>?
           ]?
           <.end-element('VARIABLE_DECLARATION')>
        || <.routine_declarator>
        || <.regex_declarator>
        || <.type_declarator>
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
        || <.start-token('MULTI_DECLARATOR_NULL')>
           <?>
           <.end-token('MULTI_DECLARATOR_NULL')>
           <.declarator>
    }

    token variable_declarator {
        :my $*IN_DECL = 'variable';
        <.variable>
        { $*IN_DECL = '' }
        [
            <?before [<.unsp>? <[[{]>]>
            <.unsp>?
            [
            || <.start-token('SHAPE_DECLARATION')>
               '['
               <.end-token('SHAPE_DECLARATION')>
               <.semilist>
               [
                   <.start-token('SHAPE_DECLARATION')>
                   ']'
                   <.end-token('SHAPE_DECLARATION')>
               ]?
            || <.start-token('SHAPE_DECLARATION')>
               '{'
               <.end-token('SHAPE_DECLARATION')>
               <.semilist>
               [
                   <.start-token('SHAPE_DECLARATION')>
                   '}'
                   <.end-token('SHAPE_DECLARATION')>
               ]?
            ]+
        ]?
        <.ws>
        <.trait>*
        <.ws>
        <.post_constraint>*
    }

    token routine_declarator {
        <.start-element('ROUTINE_DECLARATION')>
        [
        || <.start-token('ROUTINE_DECLARATOR')>
           'sub' <.end_keyword>
           <.end-token('ROUTINE_DECLARATOR')>
           <.routine_def>
        || <.start-token('ROUTINE_DECLARATOR')>
           'method' <.end_keyword>
           <.end-token('ROUTINE_DECLARATOR')>
           <.method_def>
        || <.start-token('ROUTINE_DECLARATOR')>
           'submethod' <.end_keyword>
           <.end-token('ROUTINE_DECLARATOR')>
           <.method_def>
        ]
        <.end-element('ROUTINE_DECLARATION')>
    }

    token routine_def {
        :my $*IN_DECL = 'sub';
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
        <.trait>*
        { $*IN_DECL = '' }
        [
        || <.onlystar>
        || <.blockoid>
        # Allow for body not written yet
        || <?>
        ]
    }

    token method_def {
        :my $*IN_DECL = 'method';
        <.ws>
        [
            <.start-token('ROUTINE_NAME')>
            [
            || <[ ! ^ ]>? <.longname>?
            || <.longname>
            ]
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
        <.trait>*
        { $*IN_DECL = '' }
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

    token capterm {
        <.start-element('CAPTURE')>
        <.start-token('CAPTURE_TERM')>
        '\\' <?before \S>
        <.end-token('CAPTURE_TERM')>
        [
        || <.start-token('CAPTURE_TERM')> '(' <.end-token('CAPTURE_TERM')>
           <.semiarglist>
           [ <.start-token('CAPTURE_TERM')> ')' <.end-token('CAPTURE_TERM')> ]?
        || <.termish>
        || <.start-token('CAPTURE_INVALID')> <?> <.end-token('CAPTURE_INVALID')>
        ]
        <.end-element('CAPTURE')>
    }

    token param_sep {
        <?before <.ws> [','||':'||';;'||';']>
        <.ws>
        <.start-token('PARAMETER_SEPARATOR')>
        [','||':'||';;'||';']
        <.end-token('PARAMETER_SEPARATOR')>
        <.ws>
    }

    token signature {
        :my $*IN_DECL = 'sig';
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
        { $*IN_DECL = '' }
        [
            <.start-element('RETURN_CONSTRAINT')>
            <.start-token('RETURN_ARROW')>
            '-->'
            <.end-token('RETURN_ARROW')>
            <.ws>
            [
            || [ <.typename> || <.value> ] <.ws>
            || <.start-token('MISSING_RETURN_CONSTRAINT')>
               <?>
               <.end-token('MISSING_RETURN_CONSTRAINT')>
            ]
            <.end-element('RETURN_CONSTRAINT')>
        ]?
    }

    token parameter {
        <.start-element('PARAMETER')>
        [
        || <.type_constraint>+
            [
            || [
               || <.start-token('TERM_DECLARATION_BACKSLASH')>
                  '\\'
                  <.end-token('TERM_DECLARATION_BACKSLASH')>
               || <.start-token('PARAMETER_QUANTIFIER')> '|' <.end-token('PARAMETER_QUANTIFIER')>
               || <.start-token('PARAMETER_QUANTIFIER')> '+' <.end-token('PARAMETER_QUANTIFIER')>
               ]
               <.param_term>
            || <.start-token('PARAMETER_QUANTIFIER')>
               ['**'||'*'||'+']
               <.end-token('PARAMETER_QUANTIFIER')>
               [
               || <.param_var>
               || <.start-token('PARAMETER_INCOMPLETE')> <?> <.end-token('PARAMETER_INCOMPLETE')>
               ]
            || [ <.param_var> || <.named_param> ]
               [
                   <.start-token('PARAMETER_QUANTIFIER')>
                   <[?!]>
                   <.end-token('PARAMETER_QUANTIFIER')>
               ]?
            || <.start-token('PARAMETER_ANON')> <?> <.end-token('PARAMETER_ANON')>
            ]
        || [
           || <.start-token('PARAMETER_QUANTIFIER')> '\\' <.end-token('PARAMETER_QUANTIFIER')>
           || <.start-token('PARAMETER_QUANTIFIER')> '|' <.end-token('PARAMETER_QUANTIFIER')>
           || <.start-token('PARAMETER_QUANTIFIER')> '+' <.end-token('PARAMETER_QUANTIFIER')>
           ]
           <.param_term>
        || <.start-token('PARAMETER_QUANTIFIER')>
           ['**'||'*'||'+']
           <.end-token('PARAMETER_QUANTIFIER')>
           [
           || <.param_var>
           || <.start-token('PARAMETER_INCOMPLETE')> <?> <.end-token('PARAMETER_INCOMPLETE')>
           ]
        || [ <.param_var> || <.named_param> ]
           [
               <.start-token('PARAMETER_QUANTIFIER')>
               <[?!]>
               <.end-token('PARAMETER_QUANTIFIER')>
           ]?
        ]
        <.ws>
        <.trait>*
        <.post_constraint>*
        <.default_value>?
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

    token param_term {
        <.defterm>?
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
               ]?
           ]?
        || <.param_var>
        ]?
        <.end-element('NAMED_PARAMETER')>
    }

    token default_value {
        :my $*IN_DECL = '';
        <.start-element('PARAMETER_DEFAULT')>
        <.start-token('INFIX')>
        '='
        <.end-token('INFIX')>
        <.ws>
        [ <.EXPR('i=')> <.ws> ]?
        <.end-element('PARAMETER_DEFAULT')>
    }

    token type_constraint {
        :my $*IN_DECL = '';
        [
        || <?before 'where' <.ws>>
           <.start-element('WHERE_CONSTRAINT')>
           <.start-token('WHERE_CONSTRAINT')>
           'where'
           <.end-token('WHERE_CONSTRAINT')>
           <.ws>
           <.EXPR('i=')>?
           <.end-element('WHERE_CONSTRAINT')>
        || <.start-element('VALUE_CONSTRAINT')>
           <.value>
           <.end-element('VALUE_CONSTRAINT')>
        || <?before <[-−i+]> <.numish>>
           <.start-element('VALUE_CONSTRAINT')>
           <.start-token('PREFIX')> <[-−i+]> <.end-token('PREFIX')>
           <.numish>
           <.end-element('VALUE_CONSTRAINT')>
        || <.typename>
        ]
        <.ws>
    }

    token post_constraint {
        :my $*IN_DECL = '';
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
        || <?before 'where' <.ws>>
           <.start-element('WHERE_CONSTRAINT')>
           <.start-token('WHERE_CONSTRAINT')>
           'where'
           <.end-token('WHERE_CONSTRAINT')>
           <.ws>
           <.EXPR('i=')>?
           <.end-element('WHERE_CONSTRAINT')>
        ]
        <.ws>
    }

    token initializer {
        <?before ['=' || ':=' || '::='] <.ws>>
        <.start-element('INFIX')>
        [
        || <.start-token('INFIX')> '=' <.end-token('INFIX')>
        || <.start-token('INFIX')> ':=' <.end-token('INFIX')>
        || <.start-token('INFIX')> '::=' <.end-token('INFIX')>
        ]
        <.end-element('INFIX')>
        <.ws>
        [
        || <.EXPR('e=')>
        || <.start-token('INITIALIZER_MISSING')> <?> <.end-token('INITIALIZER_MISSING')>
        ]
    }

    token trait {
        <.trait_mod> <.ws>
    }

    token trait_mod {
        <.start-element('TRAIT')>
        [
        || <?before 'is' <.ws>>
           <.start-token('TRAIT')>
           'is'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.start-token('NAME')>
              <.longname>
              <.end-token('NAME')>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'hides' <.ws>>
           <.start-token('TRAIT')>
           'hides'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.typename>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'does' <.ws>>
           <.start-token('TRAIT')>
           'does'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.typename>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'will' <.ws>>
           <.start-token('TRAIT')>
           'will'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.start-token('NAME')>
              <.identifier>
              <.end-token('NAME')>
              <.ws>
              [
              || <.pblock>
              || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
              ]
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'of' <.ws>>
           <.start-token('TRAIT')>
           'of'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.typename>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'returns' <.ws>>
           <.start-token('TRAIT')>
           'returns'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.typename>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        || <?before 'handles' <.ws>>
           <.start-token('TRAIT')>
           'handles'
           <.end-token('TRAIT')>
           <.ws>
           [
           || <.term>
           || <.start-token('TRAIT_INCOMPLETE')> <?> <.end-token('TRAIT_INCOMPLETE')>
           ]
        ]
        <.end-element('TRAIT')>
    }

    token regex_declarator {
        <.start-element('REGEX_DECLARATION')>
        [
        || <?before 'regex' <.kok>>
           <.start-token('REGEX_DECLARATOR')>
           'regex'
           <.end-token('REGEX_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'regex';
           :my $*RX_S = 0;
           <.regex_def>
        || <?before 'rule' <.kok>>
           <.start-token('REGEX_DECLARATOR')>
           'rule'
           <.end-token('REGEX_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'rule';
           :my $*RX_S = 1;
           <.regex_def>
        || <?before 'token' <.kok>>
           <.start-token('REGEX_DECLARATOR')>
           'token'
           <.end-token('REGEX_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'token';
           :my $*RX_S = 0;
           <.regex_def>
        ]
        <.end-element('REGEX_DECLARATION')>
    }

    token regex_def {
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
        <.trait>*
        { $*IN_DECL = '' }
        [
            <.start-token('BLOCK_CURLY_BRACKET')>
            '{'
            <.end-token('BLOCK_CURLY_BRACKET')>
            <.ws>
            [
            || <.start-token('ONLY_STAR')> ['*'||'<...>'||'<*>'] <.end-token('ONLY_STAR')>
            || <.enter_regex_nibblier('{', '}')>
            || <.start-token('MISSING_REGEX')> <?> <.end-token('MISSING_REGEX')>
            ]
            <.ws>
            [
                <.start-token('BLOCK_CURLY_BRACKET')>
                '}'
                <.end-token('BLOCK_CURLY_BRACKET')>
                <?ENDSTMT>
            ]?
        ]?
    }

    token type_declarator {
        || <?before ['enum' <.kok>]>
           <.start-element('ENUM')>
           <.start-token('TYPE_DECLARATOR')>
           'enum'
           <.end-token('TYPE_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'enum';
           [
               [
               || <.start-token('NAME')> <.longname> <.end-token('NAME')>
               || <.variable>
               || <.start-token('ENUM_ANON')> <?> <.end-token('ENUM_ANON')>
               ]
               { $*IN_DECL = '' }
               <.ws>
               <.trait>*
               <.ws>
               [
               || <![<(«]> <.start-token('ENUM_INCOMPLETE')> <?> <.end-token('ENUM_INCOMPLETE')>
               || <.term>
               ]
               <.ws>
           ]?
           <.end-element('ENUM')>
        || <?before ['subset' <.kok>]>
           <.start-element('SUBSET')>
           <.start-token('TYPE_DECLARATOR')>
           'subset'
           <.end-token('TYPE_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'subset';
           [
               [
               || <.start-token('NAME')> <.longname> <.end-token('NAME')>
               || <.start-token('SUBSET_ANON')> <?> <.end-token('SUBSET_ANON')>
               ]
               { $*IN_DECL = '' }
               <.ws>
               <.trait>*
               <.ws>
               [
                   <?before ['where' <.ws>]>
                   <.start-token('WHERE_CONSTRAINT')>
                   'where'
                   <.end-token('WHERE_CONSTRAINT')>
                   <.ws>
                   [
                   || <.EXPR('e=')>
                   || <.start-token('SUBSET_INCOMPLETE')> <?> <.end-token('SUBSET_INCOMPLETE')>
                   ]
               ]?
               <.ws>
           ]?
           <.end-element('SUBSET')>
        || <?before ['constant' <.kok>]>
           <.start-element('CONSTANT')>
           <.start-token('TYPE_DECLARATOR')>
           'constant'
           <.end-token('TYPE_DECLARATOR')>
           <.kok>
           :my $*IN_DECL = 'constant';
           [
           || <?before '\\' <.defterm>>
              <.start-token('TERM_DECLARATION_BACKSLASH')>
              '\\'
              <.end-token('TERM_DECLARATION_BACKSLASH')>
              <.defterm>
           || <.variable>
           || <.start-token('CONSTANT_ANON')> <?> <.end-token('CONSTANT_ANON')>
           ]
           { $*IN_DECL = '' }
           <.ws>
           <.trait>*
           [
           || <.initializer>
           || <.start-token('CONSTANT_MISSING_INITIALIZER')>
              <?>
              <.end-token('CONSTANT_MISSING_INITIALIZER')>
           ]
           <.end-element('CONSTANT')>
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
        :my $*IN_DECL = 'package';
        <.ws>
        [
            <.start-token('NAME')>
            <.longname>
            <.end-token('NAME')>
            <.ws>
        ]?
        { $*IN_DECL = '' }
        <.trait>*
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
        || <.complex_number>
        || <.rat_number>
        || <.rad_number>
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

    token rat_number {
        <?before [ '<' <.bare_rat_number> '>']>
        <.start-element('RAT_LITERAL')>
        <.start-token('RAT_LITERAL')>
        '<'
        <.end-token('RAT_LITERAL')>
        <.bare_rat_number>
        <.start-token('RAT_LITERAL')>
        '>'
        <.end-token('RAT_LITERAL')>
        <.end-element('RAT_LITERAL')>
    }
    token bare_rat_number {
        <.signed_integer>
        <.start-token('RAT_LITERAL')>
        '/'
        <.end-token('RAT_LITERAL')>
        <.integer>
    }

    token complex_number {
        <?before [ '<' <.bare_complex_number> '>']>
        <.start-element('COMPLEX_LITERAL')>
        <.start-token('COMPLEX_LITERAL')>
        '<'
        <.end-token('COMPLEX_LITERAL')>
        <.bare_complex_number>
        <.start-token('COMPLEX_LITERAL')>
        '>'
        <.end-token('COMPLEX_LITERAL')>
        <.end-element('COMPLEX_LITERAL')>
    }

    token bare_complex_number {
        <.signed_number>
        <.start-token('COMPLEX_LITERAL')>
        <?[-−+]>
        <.end-token('COMPLEX_LITERAL')>
        <.signed_number>
        <.start-token('COMPLEX_LITERAL')>
        '\\'? 'i'
        <.end-token('COMPLEX_LITERAL')>
    }

    token signed_number {
        <.start-token('COMPLEX_LITERAL')>
        <.sign>
        <.end-token('COMPLEX_LITERAL')>
        <.number>
    }

    token rad_number {
        <?before [':' \d+ <.unsp>? <[<[(]>]>
        <.start-element('RADIX_NUMBER')>
        <.start-token('RADIX_NUMBER')>
        ':'
        <.end-token('RADIX_NUMBER')>
        <.start-token('RADIX_NUMBER')>
        \d+
        <.end-token('RADIX_NUMBER')>
        <.unsp>?
        [
        || <.start-token('RADIX_NUMBER')>
           '<'
           <.end-token('RADIX_NUMBER')>
           [
           || <.start-token('RADIX_NUMBER')> '0x' <.end-token('RADIX_NUMBER')>
           || <.start-token('RADIX_NUMBER')> '0o' <.end-token('RADIX_NUMBER')>
           || <.start-token('RADIX_NUMBER')> '0d' <.end-token('RADIX_NUMBER')>
           || <.start-token('RADIX_NUMBER')> '0b' <.end-token('RADIX_NUMBER')>
           ]?
           <.start-token('RADIX_NUMBER')>
           [
               <.rad_digits>
               ['.' <.rad_digits>]?
               ['*' <.radint> '**' <.radint>]?
           ]
           <.end-token('RADIX_NUMBER')>
           [
               <.start-token('RADIX_NUMBER')>
               '>'
               <.end-token('RADIX_NUMBER')>
           ]?
        || <.start-token('RADIX_NUMBER')>
           '['
           <.end-token('RADIX_NUMBER')>
           <.semilist>
           [
               <.start-token('RADIX_NUMBER')>
               ']'
               <.end-token('RADIX_NUMBER')>
           ]?
        || <.start-token('RADIX_NUMBER')>
           '('
           <.end-token('RADIX_NUMBER')>
           <.semilist>
           [
               <.start-token('RADIX_NUMBER')>
               ')'
               <.end-token('RADIX_NUMBER')>
           ]?
        ]
        <.end-element('RADIX_NUMBER')>
    }

    token rad_digits { <.rad_digit>+ [ '_' <.rad_digit>+ ]* }
    token rad_digit  { \d || <[ a..z A..Z ａ..ｚ Ａ..Ｚ ]> }
    token radint    { <.integer_lex> }

    token integer {
        <.start-element('INTEGER_LITERAL')>
        <.start-token('INTEGER_LITERAL')>
        <.integer_lex>
        <.end-token('INTEGER_LITERAL')>
        <.end-element('INTEGER_LITERAL')>
    }

    token signed_integer {
        <.start-token('RAT_LITERAL')>
        <.sign>
        <.end-token('RAT_LITERAL')>
        <.integer>
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

    token typename {
        <.start-element('TYPE_NAME')>
        [
        || <.start-token('NAME')>
           '::?' <.identifier>
           <.end-token('NAME')>
           # XXX
           # <.colonpair>*
        || <.start-token('NAME')>
           <.longname>
           <.end-token('NAME')>
        ]
        <.unsp>?
        [
            <.start-token('TYPE_PARAMETER_BRACKET')>
            '['
            <.end-token('TYPE_PARAMETER_BRACKET')>
            <.arglist>
            [
                <.start-token('TYPE_PARAMETER_BRACKET')>
                ']'
                <.end-token('TYPE_PARAMETER_BRACKET')>
            ]?
        ]?
        <.unsp>?
        [
            <.start-token('TYPE_COERCION_PARENTHESES')>
            '('
            <.end-token('TYPE_COERCION_PARENTHESES')>
            <.ws>
            <.typename>?
            <.ws>
            [
                || <.start-token('TYPE_COERCION_PARENTHESES')>
                   ')'
                   <.end-token('TYPE_COERCION_PARENTHESES')>
                || <.start-token('INCOMPLETE_TYPE_NAME')> <?> <.end-token('INCOMPLETE_TYPE_NAME')>
            ]
        ]?
        [
            <?before <.ws> 'of' <.ws>>
            <.ws>
            <.start-token('NAME')>
            'of'
            <.end-token('NAME')>
            <.ws>
            [
            || <.typename>
            || <.start-token('INCOMPLETE_TYPE_NAME')> <?> <.end-token('INCOMPLETE_TYPE_NAME')>
            ]
        ]?
        <.end-element('TYPE_NAME')>
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
            :my $*QSIGIL = '$';
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

    token circumfix {
        :my $*Q_BACKSLASH = 0;
        :my $*Q_QBACKSLASH = 0;
        :my $*Q_QQBACKSLASH = 0;
        :my $*Q_CLOSURES = 0;
        :my $*Q_SCALARS = 0;
        :my $*Q_ARRAYS = 0;
        :my $*Q_HASHES = 0;
        :my $*Q_FUNCTIONS = 0;
        [
        || <.start-element('PARENTHESIZED_EXPRESSION')>
           <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
           <.semilist>
           [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
           <.end-element('PARENTHESIZED_EXPRESSION')>
        || <.start-element('ARRAY_COMPOSER')>
           <.start-token('ARRAY_COMPOSER')> '[' <.end-token('ARRAY_COMPOSER')>
           <.semilist>
           [ <.start-token('ARRAY_COMPOSER')> ']' <.end-token('ARRAY_COMPOSER')> ]?
           <.end-element('ARRAY_COMPOSER')>
        || <?[{]>
           <.start-element('BLOCK_OR_HASH')> <.pblock> <.end-element('BLOCK_OR_HASH')>
        || <.start-element('STRING_LITERAL')>
           <.start-token('STRING_LITERAL_QUOTE')>
           '<<'
           <.end-token('STRING_LITERAL_QUOTE')>
           [
               <.quote_qq('<<', '>>', '>>')>
               [
                   <.start-token('STRING_LITERAL_QUOTE')>
                   '>>'
                   <.end-token('STRING_LITERAL_QUOTE')>
               ]?
           ]?
           <.end-element('STRING_LITERAL')>
        || <.start-element('STRING_LITERAL')>
           <.start-token('STRING_LITERAL_QUOTE')>
           '«'
           <.end-token('STRING_LITERAL_QUOTE')>
           [
               <.quote_qq('«', '»', '»')>
               [
                   <.start-token('STRING_LITERAL_QUOTE')>
                   '»'
                   <.end-token('STRING_LITERAL_QUOTE')>
               ]?
           ]?
           <.end-element('STRING_LITERAL')>
        || <.start-element('STRING_LITERAL')>
           <.start-token('STRING_LITERAL_QUOTE')>
           '<'
           <.end-token('STRING_LITERAL_QUOTE')>
           [
               <.quote_q('<', '>', '>')>
               [
                   <.start-token('STRING_LITERAL_QUOTE')>
                   '>'
                   <.end-token('STRING_LITERAL_QUOTE')>
               ]?
           ]?
           <.end-element('STRING_LITERAL')>
        ]
    }

    token EXPR($*PRECLIM) {
        :my $*PREC = '';
        <.start-element('EXPR')>

        [
        || <.prefixish>+ <.termish>?
        || <.termish>
        ]
        <.postfixish>*

        [
            <?before <.ws> <.infixish> <.ws>>
            <.ws>
            <.infixish>
            <.ws>
            [
                [
                || <.prefixish>+ <.termish>?
                || <.termish>
                ]
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
        || <?before [<.prefix> ['«'||'<<']]>
           <.start-element('HYPER_METAOP')>
           <.prefix>
           <.start-token('METAOP')>
           ['«'||'<<']
           <.end-token('METAOP')>
           <.end-element('HYPER_METAOP')>
        || <.start-element('PREFIX')>
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
        || '-' <![>]> { $*PREC = 'v=' }
        || '−' { $*PREC = 'v=' }
        || '?' <!before '??'> { $*PREC = 'v=' }
        || '!' <!before '!!'> { $*PREC = 'v=' }
        || '|' { $*PREC = 'v=' }
        || '^' { $*PREC = 'v=' }
        || '⚛' { $*PREC = 'v=' }
        ]
        <.end-token('PREFIX')>
    }

    token postfixish {
        || <?before [ ['»' || '>>'] [ <!{ $*QSIGIL }> || <![(]> ] ]>
           <.start-element('HYPER_METAOP')>
           <.start-token('METAOP')>
           ['»' || '>>']
           <.end-token('METAOP')>
           [
           || <.postfixish_nometa>
           || <.start-token('HYPER_METAOP_MISSING')> <?> <.end-token('HYPER_METAOP_MISSING')>
           ]
           <.end-element('HYPER_METAOP')>
        || <.postfixish_nometa>
    }

    token postfixish_nometa {
        || <.start-element('POSTFIX')>
           <.postfix>
           <.end-element('POSTFIX')>
        || <.postcircumfix> { $*PREC = 'y=' }
        || <.dotty> { $*PREC = 'y=' }
        || <.privop> { $*PREC = 'y=' }
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
        <.dottyop>
        <.end-element('METHOD_CALL')>
    }

    token dottyop {
        <.unsp>?
        [
        || <.methodop>
        ]?
    }

    token privop {
        <.start-element('METHOD_CALL')>
        <.start-token('METHOD_CALL_OPERATOR')>
        '!'
        <.end-token('METHOD_CALL_OPERATOR')>
        <.methodop>?
        <.end-element('METHOD_CALL')>
    }

    token methodop {
        [
        || <.start-token('METHOD_CALL_NAME')>
           <.longname>
           <.end-token('METHOD_CALL_NAME')>
        || <?[$@&]> <.variable>
        || <?['"]>
           # XXX Add this once we set up $*QSIGIL
           #[ <!{$*QSIGIL}> || <!before '"' <-["]>*? [\s|$] > ]
           <.quote>
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
        :my $*QSIGIL = '';
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
               <.semilist>
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
               <.semilist>
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
        [
        || <?before [<![!]> <.infixish_non_assignment_meta> '=']>
           <.start-element('ASSIGN_METAOP')>
           <.start-token('ASSIGN_METAOP')> <?> <.end-token('ASSIGN_METAOP')>
           <.infixish_non_assignment_meta>
           <.start-token('METAOP')>
           '='
           <.end-token('METAOP')>
           <.end-element('ASSIGN_METAOP')>
        || <.infixish_non_assignment_meta>
        ]
    }

    token infixish_non_assignment_meta {
        || <.infix_prefix_meta_operator>
        || <.infix_circumfix_meta_operator>
        || <.start-element('INFIX')>
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
        || '-' [<?before '>>'> || <![>]>] { $*PREC = 't=' }
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

    token infix_prefix_meta_operator {
        || <?before ['!' <![!]> <.infixish>]>
           <!before ['!=' <![=]>]>
           <.start-element('NEGATION_METAOP')>
           <.start-token('METAOP')>
           '!'
           <.end-token('METAOP')>
           <.infixish>
           <.end-element('NEGATION_METAOP')>
        || <?before ['R' <.infixish>]>
           <.start-element('REVERSE_METAOP')>
           <.start-token('METAOP')>
           'R'
           <.end-token('METAOP')>
           <.infixish>
           <.end-element('REVERSE_METAOP')>
        || <?before ['S' <.infixish>]>
           <.start-element('SEQUENTIAL_METAOP')>
           <.start-token('METAOP')>
           'S'
           <.end-token('METAOP')>
           <.infixish>
           <.end-element('SEQUENTIAL_METAOP')>
        || <?before ['X' <.infixish>]>
           <.start-element('CROSS_METAOP')>
           <.start-token('METAOP')>
           'X'
           <.end-token('METAOP')>
           <.infixish>
           <.end-element('CROSS_METAOP')>
        || <?before ['Z' <.infixish>]>
           <.start-element('ZIP_METAOP')>
           <.start-token('METAOP')>
           'Z'
           <.end-token('METAOP')>
           <.infixish>
           <.end-element('ZIP_METAOP')>
    }

    token infix_circumfix_meta_operator {
        || <?before [<[«»]> <.infixish>]>
           <.start-element('HYPER_METAOP')>
           <.start-token('METAOP')>
           <[«»]>
           <.end-token('METAOP')>
           <.infixish>
           [
           || <.start-token('METAOP')>
              <[«»]>
              <.end-token('METAOP')>
           || <.start-token('HYPER_METAOP_MISSING')> <?> <.end-token('HYPER_METAOP_MISSING')>
           ]
           <.end-element('HYPER_METAOP')>
        || <?before [[ '<<' || '>>' ] <.infixish>]>
           <.start-element('HYPER_METAOP')>
           <.start-token('METAOP')>
           [ '<<' || '>>' ]
           <.end-token('METAOP')>
           <.infixish>
           [
           || <.start-token('METAOP')>
              [ '<<' || '>>' ]
              <.end-token('METAOP')>
           || <.start-token('HYPER_METAOP_MISSING')> <?> <.end-token('HYPER_METAOP_MISSING')>
           ]
           <.end-element('HYPER_METAOP')>
    }

    token termish {
        <.term>
    }

    token term_reduce {
        <!before [ '[' <[ - + ? ~ ^ ]> [\w || <[$@]>] ]>
        <?before [ '[' [ <.infixish> || '\\' <.infixish> ] ']' ]>

        <.start-element('REDUCE_METAOP')>
        <.start-token('METAOP')>
        '['
        <.end-token('METAOP')>
        [
        || <.start-token('METAOP')> '\\' <.end-token('METAOP')> <.infixish>
        || <.infixish>
        ]
        <.start-token('METAOP')>
        ']'
        <.end-token('METAOP')>
        <.args>
        <.end-element('REDUCE_METAOP')>
    }

    token enter_regex_nibblier($*STARTER, $*STOPPER) {
        <.start-element('REGEX')>
        <.regex_nibbler>
        <.end-element('REGEX')>
    }

    token regex_nibbler_fresh_rx($*RX_S) {
        <.regex_nibbler>
    }

    token regex_nibbler {
        <.ws>
        [
            <!rxstopper>
            [
            || <.start-token('REGEX_INFIX')> '||' <.end-token('REGEX_INFIX')>
            || <.start-token('REGEX_INFIX')> '|' <.end-token('REGEX_INFIX')>
            || <.start-token('REGEX_INFIX')> '&&' <.end-token('REGEX_INFIX')>
            || <.start-token('REGEX_INFIX')> '&' <.end-token('REGEX_INFIX')>
            ]
            <.ws>
        ]?
        <.termseq>?
    }

    token rxstopper { <.stopper> }

    token rxinfixstopper {
        [
        || <?before <[\) \} \]]> >
        || <?before '>' <-[>]> >
        || <?rxstopper>
        ]
    }

    token termseq {
        <.termaltseq>
    }

    token termaltseq {
        <.termconjseq>
        [
            <!rxinfixstopper>
            <.start-token('REGEX_INFIX')> '||' <.end-token('REGEX_INFIX')>
            <.ws>
            [<.termconjseq> || <.start-token('REGEX_MISSING_TERM')> <?> <.end-token('REGEX_MISSING_TERM')>]
        ]*
    }

    token termconjseq {
        <.termalt>
        [
            <!infixstopper>
            <.start-token('REGEX_INFIX')> '&&' <.end-token('REGEX_INFIX')>
            <.ws>
            [<.termalt> || <.start-token('REGEX_MISSING_TERM')> <?> <.end-token('REGEX_MISSING_TERM')>]
        ]*
    }

    token termalt {
        <.termconj>
        [
            <!infixstopper>
            <.start-token('REGEX_INFIX')> '|' <![|]> <.end-token('REGEX_INFIX')>
            <.ws>
            [<.termconj> || <.start-token('REGEX_MISSING_TERM')> <?> <.end-token('REGEX_MISSING_TERM')>]
        ]*
    }

    token termconj {
        <.rxtermish>
        [
            <!infixstopper>
            <.start-token('REGEX_INFIX')> '&' <![&]> <.end-token('REGEX_INFIX')>
            <.ws>
            [<.rxtermish> || <.start-token('REGEX_MISSING_TERM')> <?> <.end-token('REGEX_MISSING_TERM')>]
        ]*
    }

    token rxtermish {
        :my $*SIGOK = 0;
        <.quantified_atom>*
    }

    token SIGOK {
        [ <?{ $*RX_S }> { $*SIGOK = 1 } ]?
    }

    token sigmaybe {
        || <?{ $*SIGOK }>
           <.start-element('REGEX_SIGSPACE')>
           <.start-token('REGEX_SIGSPACE')> <?> <.end-token('REGEX_SIGSPACE')>
           <.normspace>
           <.end-element('REGEX_SIGSPACE')>
        || <.normspace>
    }

    token normspace { <?before \s || '#'> <.ws> }

    token quantified_atom {
        <.start-element('REGEX_ATOM')>
        <.atom>
        <.sigmaybe>?
        [
            [
            || <!rxstopper> <.quantifier>
            || <?before <?[:]> <.backmod> \W>
               <.start-element('REGEX_QUANTIFIER')>
               <.start-token('REGEX_QUANTIFIER')>
               <.backmod>
               <.end-token('REGEX_QUANTIFIER')>
               <.end-element('REGEX_QUANTIFIER')>
            ]
            [ <.SIGOK> <.sigmaybe> ]?
            [
                <?before <.ws> '%''%'? <.ws>>
                <.ws> <.separator>
            ]?
        ]?
        <.end-element('REGEX_ATOM')>
        { $*SIGOK = 0 }
    }

    token separator {
        <.start-element('REGEX_SEPARATOR')>
        <.start-token('REGEX_QUANTIFIER')>
        '%''%'?
        <.end-token('REGEX_QUANTIFIER')>
        :my $*SIGOK = 0;
        <.ws>
        <.quantified_atom>?
        <.ws>
        <.end-element('REGEX_SEPARATOR')>
    }

    token atom {
        [
        || <.start-element('REGEX_LITERAL')>
           <.start-token('STRING_LITERAL_CHAR')> \w <.end-token('STRING_LITERAL_CHAR')>
           <.end-element('REGEX_LITERAL')>
           <.SIGOK>
        || <.metachar>
        ]
    }

    token quantifier {
        <.start-element('REGEX_QUANTIFIER')>
        [
        || <.start-token('REGEX_QUANTIFIER')> '**' <.end-token('REGEX_QUANTIFIER')>
           <.normspace>?
           <.start-token('REGEX_QUANTIFIER')> <.backmod> <.end-token('REGEX_QUANTIFIER')>
           <.normspace>?
           [
           || <?[{]> <.rxcodeblock>
           || <.start-token('PREFIX')> '^' <.end-token('PREFIX')> <.integer>
           || <.integer>
              [
                  <.start-token('INFIX')>
                  '^'? '..' '^'?
                  <.end-token('INFIX')>
                  [
                      || <.integer>
                      || <.start-token('WHATEVER')> '*' <.end-token('WHATEVER')>
                  ]?
              ]?
           || <.start-token('REGEX_QUANTIFIER_MISSING')> <?> <.end-token('REGEX_QUANTIFIER_MISSING')>
           ]
        || <.start-token('REGEX_QUANTIFIER')>
           [ '*' || '+' || '?' ] <.backmod>
           <.end-token('REGEX_QUANTIFIER')>
       ]
        <.end-element('REGEX_QUANTIFIER')>
    }

    token rxcodeblock {
        <.pblock>
    }

    token backmod { ':'? [ '?' || '!' || <!before ':'> ] }

    token metachar {
        || <?before [<.sigil> [<.alpha> || \W<.alpha> || '(' || \d]]>
           <!before [<.sigil> <.rxstopper>]>
           <.start-element('REGEX_VARIABLE')>
           <.start-token('REGEX_VARIABLE')> <?> <.end-token('REGEX_VARIABLE')>
           <.variable>
           [
               <?before [\s*'='\s*]>
               <.start-token('REGEX_VARIABLE_BINDING')>
               <?>
               <.end-token('REGEX_VARIABLE_BINDING')>
               <.start-token('WHITE_SPACE')>
               \s*
               <.end-token('WHITE_SPACE')>
               <.start-token('INFIX')>
               '='
               <.end-token('INFIX')>
               <.start-token('WHITE_SPACE')>
               \s*
               <.end-token('WHITE_SPACE')>
               [
               || <.quantified_atom>
               || <.start-token('REGEX_VARIABLE_BINDING_INCOMPLETE')>
                  <?>
                  <.end-token('REGEX_VARIABLE_BINDING_INCOMPLETE')>
               ]
           ]?
           <.end-element('REGEX_VARIABLE')>
        || <.start-element('REGEX_ANCHOR')>
           [
           || <.start-token('REGEX_ANCHOR')> '^^' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '^' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '$$' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '$' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '<<' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '«' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '>>' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '»' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> '<(' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           || <.start-token('REGEX_ANCHOR')> ')>' <.end-token('REGEX_ANCHOR')> <.SIGOK>
           ]
           <.end-element('REGEX_ANCHOR')>
        || <.start-element('REGEX_BUILTIN_CCLASS')>
           <.start-token('REGEX_BUILTIN_CCLASS')>
           '.'
           <.end-token('REGEX_BUILTIN_CCLASS')>
           <.end-element('REGEX_BUILTIN_CCLASS')>
        || <.start-element('REGEX_GROUP')>
           <.start-token('REGEX_GROUP_BRACKET')>
           '['
           <.end-token('REGEX_GROUP_BRACKET')>
           <.regex_nibbler_fresh_rx($*RX_S)>?
           [
               <.start-token('REGEX_GROUP_BRACKET')>
               ']'
               <.end-token('REGEX_GROUP_BRACKET')>
           ]?
           <.end-element('REGEX_GROUP')>
        || <.start-element('REGEX_CAPTURE_POSITIONAL')>
           <.start-token('REGEX_CAPTURE_PARENTHESES')>
           '('
           <.end-token('REGEX_CAPTURE_PARENTHESES')>
           <.regex_nibbler_fresh_rx($*RX_S)>?
           [
               <.start-token('REGEX_CAPTURE_PARENTHESES')>
               ')'
               <.end-token('REGEX_CAPTURE_PARENTHESES')>
           ]?
           <.end-element('REGEX_CAPTURE_POSITIONAL')>
        || <?before '\\' .> <.backslash> <.SIGOK>
        || <?before '<' \s > <.rxqw> <.SIGOK>
        || <.start-element('REGEX_ASSERTION')>
           <.start-token('REGEX_ASSERTION_ANGLE')>
           '<'
           <.end-token('REGEX_ASSERTION_ANGLE')>
           <.assertion(0)>
           [
           <.start-token('REGEX_ASSERTION_ANGLE')>
           '>'
           <.end-token('REGEX_ASSERTION_ANGLE')>
           <.SIGOK>
           ]?
           <.end-element('REGEX_ASSERTION')>
        || <?['‘‚]> <.rxq> <.SIGOK>
        || <?["“„]> <.rxqq> <.SIGOK>
        || <?[{]> <.rxcodeblock>
        || <?before ':' ['my'||'constant'||'state'||'our'||'temp'||'let'] <.end_keyword>>
           <.start-token('SCOPE_DECLARATOR')>
           ':'
           <.end-token('SCOPE_DECLARATOR')>
           <.statement> <.eat_terminator>
        || <.start-element('REGEX_GOAL')>
           <.start-token('REGEX_INFIX')>
           '~'
           <.end-token('REGEX_INFIX')>
           <.ws>
           [
               <.quantified_atom>
               <.ws>
               <.quantified_atom>?
           ]?
           <.end-element('REGEX_GOAL')>
        || <.mod_internal>
    }

    token rxq {
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
        ]
        <.end-element('STRING_LITERAL')>
    }

    token rxqq {
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
        ]
        <.end-element('STRING_LITERAL')>
    }

    token rxqw {
        :my $*Q_BACKSLASH = 0;
        :my $*Q_QBACKSLASH = 0;
        :my $*Q_QQBACKSLASH = 0;
        :my $*Q_CLOSURES = 0;
        :my $*Q_SCALARS = 0;
        :my $*Q_ARRAYS = 0;
        :my $*Q_HASHES = 0;
        :my $*Q_FUNCTIONS = 0;
        <.start-element('STRING_LITERAL')>
        <.start-token('STRING_LITERAL_QUOTE')> '<' <.end-token('STRING_LITERAL_QUOTE')>
        <.quote_q('<', '>', '>')>
        [<.start-token('STRING_LITERAL_QUOTE')> '>' <.end-token('STRING_LITERAL_QUOTE')>]?
        <.end-element('STRING_LITERAL')>
    }

    token backslash {
        <.start-element('REGEX_BUILTIN_CCLASS')>
        [
        || <.start-token('REGEX_BUILTIN_CCLASS')>
           '\\'
           [
           || <[dDnNsSwWeEfFhHrRtTvV0]>
           || 'o' [ <.octint> || '[' <.octints> ']' ]
           || 'x' [ <.hexint> || '[' <.hexints> ']' ]
           || 'c' <.charspec>
           || \W
           ]
           <.end-token('REGEX_BUILTIN_CCLASS')>
        || <.start-token('REGEX_BACKSLASH_BAD')>
           '\\' \w
           <.end-token('REGEX_BACKSLASH_BAD')>
        ]
        <.end-element('REGEX_BUILTIN_CCLASS')>
    }

    token assertion($*METHOD_CALL) {
        || <.start-token('REGEX_ANCHOR')>
           '?' <?before '>'>
           <.end-token('REGEX_ANCHOR')>
        || <.start-token('REGEX_ANCHOR')>
           '!' <?before '>'>
           <.end-token('REGEX_ANCHOR')>
        || <.start-token('METHOD_CALL_OPERATOR')>
           '.'
           <.end-token('METHOD_CALL_OPERATOR')>
           <.assertion(1)>
        || <.start-token('REGEX_LOOKAROUND')>
           '?'
           <.end-token('REGEX_LOOKAROUND')>
           <.assertion(1)>
        || <.start-token('REGEX_LOOKAROUND')>
           '!'
           <.end-token('REGEX_LOOKAROUND')>
           <.assertion(1)>
        || <?before <.longname>>
           [
           || <?{ $*METHOD_CALL }>
              <.start-token('METHOD_CALL_NAME')>
              <.longname>
              <.end-token('METHOD_CALL_NAME')>
           || <.start-token('REGEX_CAPTURE_NAME')>
              <.longname>
              <.end-token('REGEX_CAPTURE_NAME')>
           ]
           [
           || <?before '>'>
              <.start-token('REGEX_ASSERTION_END')> <?> <.end-token('REGEX_ASSERTION_END')>
           || <.start-token('INFIX')> '=' <.end-token('INFIX')> <.assertion(0)>
           || <.start-token('INVOCANT_MARKER')>
              ':'
              <.end-token('INVOCANT_MARKER')>
              <.rxarglist>
           || <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
              <.rxarglist>
              [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
           || <.normspace> <.regex_nibbler>
           ]?
        || <.start-token('REGEX_ANCHOR')>
           '|' <.identifier>
           <.end-token('REGEX_ANCHOR')>
        || <?[{]> <.rxcodeblock>
        || <?[&]> <.variable>
           [
           || <.start-token('INVOCANT_MARKER')>
              ':'
              <.end-token('INVOCANT_MARKER')>
              <.rxarglist>
           || <.start-token('PARENTHESES')> '(' <.end-token('PARENTHESES')>
              <.rxarglist>
              [ <.start-token('PARENTHESES')> ')' <.end-token('PARENTHESES')> ]?
           ]?
        || <?sigil> <.variable>
        || <.start-token('REGEX_INFIX')>
           '~~'
           <.end-token('REGEX_INFIX')>
           [
           || <?before '>'>
              <.start-token('REGEX_ASSERTION_END')> <?> <.end-token('REGEX_ASSERTION_END')>
           || <.start-token('REGEX_CAPTURE_NAME')>
              \d+
              <.end-token('REGEX_CAPTURE_NAME')>
           || <.start-token('REGEX_CAPTURE_NAME')>
              <.desigilname>
              <.end-token('REGEX_CAPTURE_NAME')>
           ]?
        || <?before '['||'+'||'-'||':'>
           <.start-element('REGEX_CCLASS')>
           <.cclass_elem>+
           <.end-element('REGEX_CCLASS')>
        || <.start-token('REGEX_MISSING_ASSERTION')>
           <?>
           <.end-token('REGEX_MISSING_ASSERTION')>
    }

    token rxarglist {
        :my $*IN_REGEX_ASSERTION = 1;
        <.arglist>
    }

    token cclass_elem {
        :my $*SIGN = 0;
        <.start-element('REGEX_CCLASS_ELEM')>
        [
            [
            || <.start-token('REGEX_CCLASS_SYNTAX')>
               '+'
               <.end-token('REGEX_CCLASS_SYNTAX')>
            || <.start-token('REGEX_CCLASS_SYNTAX')>
               '-'
               <.end-token('REGEX_CCLASS_SYNTAX')>
            ]
            { $*SIGN = 1 }
        ]?
        <.normspace>?
        [
        || <.start-token('REGEX_CCLASS_SYNTAX')>
           '['
           <.end-token('REGEX_CCLASS_SYNTAX')>
           [
               <?before \s* ['\\'. || <-[\]\\]>]>
               <.start-token('REGEX_CCLASS_ATOM')> <?> <.end-token('REGEX_CCLASS_ATOM')>
               [
                   <.start-token('WHITE_SPACE')>
                   \s+
                   <.end-token('WHITE_SPACE')>
               ]?
               [
               || <.cclass_backslash>
               || <.start-token('STRING_LITERAL_CHAR')>
                  <-[\]\\]>
                  <.end-token('STRING_LITERAL_CHAR')>
               ]
               [
                   <?before \s* '..'>
                   [
                       <.start-token('WHITE_SPACE')>
                       \s+
                       <.end-token('WHITE_SPACE')>
                   ]?
                   <.start-token('REGEX_CCLASS_SYNTAX')>
                   '..'
                   <.end-token('REGEX_CCLASS_SYNTAX')>
                   [
                       || <?before \s* ['\\'. || <-[\]\\]>]>
                          [
                              <.start-token('WHITE_SPACE')>
                              \s+
                              <.end-token('WHITE_SPACE')>
                          ]?
                          [
                          || <.cclass_backslash>
                          || <.start-token('STRING_LITERAL_CHAR')>
                             <-[\]\\]>
                             <.end-token('STRING_LITERAL_CHAR')>
                          ]
                          || <.start-token('REGEX_CCLASS_INCOMPLETE')>
                             <?>
                             <.end-token('REGEX_CCLASS_INCOMPLETE')>
                   ]
               ]?
           ]*
           [
               <.start-token('WHITE_SPACE')>
               \s+
               <.end-token('WHITE_SPACE')>
           ]?
           [
               || <.start-token('REGEX_CCLASS_SYNTAX')>
                  ']'
                  <.end-token('REGEX_CCLASS_SYNTAX')>
               || <.start-token('REGEX_CCLASS_INCOMPLETE')>
                  <?>
                  <.end-token('REGEX_CCLASS_INCOMPLETE')>
           ]
        || <.start-token('METHOD_CALL_NAME')>
           <.identifier>
           <.end-token('METHOD_CALL_NAME')>
        || <.start-token('REGEX_BUILTIN_CCLASS')>
           ':' '!'? <.identifier>
           # XXX optional coloncircumfix here, when MAIN has that
           <.end-token('REGEX_BUILTIN_CCLASS')>
        || <.start-token('REGEX_CCLASS_INCOMPLETE')>
           <?{ $*SIGN }> <?>
           <.end-token('REGEX_CCLASS_INCOMPLETE')>
        ]
        <.normspace>?
        <.end-element('REGEX_CCLASS_ELEM')>
    }

    token cclass_backslash {
        <.start-element('REGEX_BUILTIN_CCLASS')>
        [
        || <.start-token('REGEX_BUILTIN_CCLASS')>
           '\\'
           [
           || 'o' [ <.octint> || '[' <.octints> ']' ]
           || 'x' [ <.hexint> || '[' <.hexints> ']' ]
           || 'c' <.charspec>
           || .
           ]
           <.end-token('REGEX_BUILTIN_CCLASS')>
        ]
        <.end-element('REGEX_BUILTIN_CCLASS')>
    }

    token mod_internal {
        <?before [':' ['!'||\d+]? <.mod_ident> ]>
        [
        || <?before [':s' 'igspace'? >>]> { $*RX_S = 1 }
        || <?before [':!s' 'igspace'? >>]> { $*RX_S = 0 }
        ]?
        <.start-element('REGEX_MOD_INTERNAL')>
        <.start-token('REGEX_MOD_INTERNAL')>
        ':'
        <.end-token('REGEX_MOD_INTERNAL')>
        [
        || <.start-token('REGEX_MOD_INTERNAL')>
           '!'
           <.end-token('REGEX_MOD_INTERNAL')>
           <.start-token('REGEX_MOD_INTERNAL')>
           <.mod_ident>
           <.end-token('REGEX_MOD_INTERNAL')>
        || <?before \d+>
           <.start-token('REGEX_MOD_INTERNAL_NUMERIC')>
           <?>
           <.end-token('REGEX_MOD_INTERNAL_NUMERIC')>
           <.start-token('REGEX_MOD_INTERNAL')>
           \d+
           <.end-token('REGEX_MOD_INTERNAL')>
           <.start-token('REGEX_MOD_INTERNAL')>
           <.mod_ident>
           <.end-token('REGEX_MOD_INTERNAL')>
        || <.start-token('REGEX_MOD_INTERNAL')>
           <.mod_ident>
           <.end-token('REGEX_MOD_INTERNAL')>
           [
               <.start-token('REGEX_MOD_INTERNAL')>
               '('
               <.end-token('REGEX_MOD_INTERNAL')>
               [
                   <.value>
                   [
                       <.start-token('REGEX_MOD_INTERNAL')>
                       ')'
                       <.end-token('REGEX_MOD_INTERNAL')>
                   ]?
               ]?
           ]?
        ]
        <.end-element('REGEX_MOD_INTERNAL')>
    }

    token mod_ident {
        || 'i' 'gnorecase'? >>
        || 'm' >>
        || 'ignoremark' >>
        || 'r' 'atchet'? >>
        || 's' 'igspace'? >>
        || 'dba' >>
    }
}
