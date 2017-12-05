grammar MAIN {
    token TOP {
        <.statementlist>
    }

    token statementlist {
        <.statement>*
    }

    token statement {
        <.ws>?
        [
        || <.statement_control>
        || <?>
        ]
        <.bogus_statement>?
        <.start-token('STATEMENT_TERMINATOR')>
        ';'
        <.end-token('STATEMENT_TERMINATOR')>
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
        <.start-token('STATEMENT_CONTROL')>
        'use'
        <.end-token('STATEMENT_CONTROL')>
        <.ws>
        <.name>
    }

    token name {
        <.start-token('NAME')>
        \w+
        <.end-token('NAME')>
    }
}
