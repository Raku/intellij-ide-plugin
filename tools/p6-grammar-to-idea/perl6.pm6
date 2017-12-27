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

    token name {
        <.start-token('NAME')>
        \w+
        <.end-token('NAME')>
    }
}
