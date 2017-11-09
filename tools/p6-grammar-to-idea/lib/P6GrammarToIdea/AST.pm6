unit module P6GrammarToIdea::AST;

my constant INDENT = 2;

sub i($level, $text) {
    ' ' x $level * INDENT ~ $text
}

class Braids is export {
    has %.braids;

    method dump() {
        %!braids.values.map(*.dump(0)).join("\n")
    }
}

class Grammar is export {
    has $.name;
    has @.productions;

    method dump($level = 0) {
        i($level, "Grammar $!name\n") ~ @!productions.map(*.dump($level + 1)).join
    }
}

class Production is export {
    has $.name;
    has $.implementation;

    method dump($level = 0) {
        i($level, "Production $!name\n") ~ $!implementation.dump($level + 1)
    }
}

class SeqAlt is export {
    has @.alternatives;

    method dump($level = 0) {
        i($level, "Sequential Alternation\n") ~
            @!alternatives.map(*.dump($level + 1)).join
    }
}

class Alt is export {
    has @.alternatives;

    method dump($level = 0) {
        i($level, "LTM Alternation\n") ~
            @!alternatives.map(*.dump($level + 1)).join
    }
}

class Concat is export {
    has @.terms;

    method dump($level = 0) {
        i($level, "Concat\n") ~ @!terms.map(*.dump($level + 1)).join
    }
}

class Literal is export {
    has $.value;

    method dump($level = 0) {
        i($level, "Literal ($!value)\n")
    }
}

class EnumCharList is export {
    has $.chars;

    method dump($level = 0) {
        i($level, "Enumerated Character List ($!chars)\n")
    }
}

class Quantifier is export {
    has $.min;
    has $.max;
    has $.target;

    method dump($level = 0) {
        i($level, "Quantifier (min=$!min, max=$!max)\n") ~
            $!target.dump($level + 1)
    }
}

class Capture is export {
    has $.name;
    has $.target;

    method dump($level = 0) {
        i($level, "Capture ($!name)\n") ~
            $!target.dump($level + 1)
    }
}

class Subrule is export {
    has $.name;
    has $.regex-arg;

    method dump($level = 0) {
        i($level, "Subrule ($!name)\n") ~
            ($!regex-arg ?? $!regex-arg.dump($level + 1) !! '')
    }
}

class Lookahead is export {
    has $.negative;
    has $.target;

    method dump($level = 0) {
        i($level, "{$!negative ?? 'Negative' !! 'Positive'} Lookahead\n") ~
            $!target.dump($level + 1)
    }
}

class AnchorEnd is export {
    method dump($level = 0) {
        i($level, "Anchor (End Of String)\n")
    }
}
