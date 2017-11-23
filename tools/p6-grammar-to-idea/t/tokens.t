use P6GrammarToIdea::Parser;
use P6GrammarToIdea::Actions;
use P6GrammarToIdea::Tokens;
use Test;

sub has-tokens($grammar, @expected, $desc) {
    my $ast = P6GrammarToIdea::Parser.parse(
        $grammar,
        :actions(P6GrammarToIdea::Actions)
    ).ast;
    is-deeply check-and-get-tokens($ast).sort.list, @expected.sort.list, $desc;
}

sub fails-check($grammar, $expected-exception, $desc) {
    my $ast = P6GrammarToIdea::Parser.parse(
        $grammar,
        :actions(P6GrammarToIdea::Actions)
    ).ast;
    throws-like { check-and-get-tokens($ast) }, $expected-exception, $desc;
}

has-tokens Q:to/GRAMMAR/, <WORD WHITE_SPACE BAD_CHARACTER>, 'Tokens identified correctly';
    grammar MAIN {
        token TOP {
            [
            || <.word> | <.ws>
            || <.bad>
            ]+
        }

        token word {
            <.start-token('WORD')>
            \w+
            <.end-token('WORD')>
        }

        token ws {
            <.start-token('WHITE_SPACE')>
            \w+
            <.end-token('WHITE_SPACE')>
        }

        token bad {
            <.start-token('BAD_CHARACTER')>
            .
            <.end-token('BAD_CHARACTER')>
        }
    }
    GRAMMAR

done-testing;
