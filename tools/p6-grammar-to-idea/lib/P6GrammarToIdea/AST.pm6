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
    has $.proto;
    has $.name;
    has $.sym;
    has $.implementation;

    method dump($level = 0) {
        if $!proto {
            i($level, "Proto Production $!name\n")
        }
        else {
            my $name = $!name ~ ($!sym ?? ":sym<$!sym>" !! "");
            i($level, "Production $name\n") ~ $!implementation.dump($level + 1)
        }
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
    has $.negative;

    method dump($level = 0) {
        i($level, "Enumerated Character List ($!chars.perl()){$!negative ?? ' (NEG)' !! ''}\n")
    }
}

enum CharClass is export <WordChars DigitChars SpaceChars NewlineChars>;
class BuiltinCharClass is export {
    has CharClass $.class;
    has $.negative;

    method dump($level = 0) {
        i($level, "Builtin Character Class ($!class){$!negative ?? ' (NEG)' !! ''}\n")
    }
}

class Quantifier is export {
    has $.min;
    has $.max;
    has $.target;
    has $.separator;

    method dump($level = 0) {
        i($level, "Quantifier (min=$!min, max=$!max)\n") ~
            $!target.dump($level + 1) ~
            ($!separator
                ?? i($level + 1, "Separator\n") ~ $!separator.dump($level + 2)
                !! '')
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

class AnchorLeftWordBoundary is export {
    method dump($level = 0) {
        i($level, "Anchor (Left Word Boundary)\n")
    }
}

class AnchorRightWordBoundary is export {
    method dump($level = 0) {
        i($level, "Anchor (Right Word Boundary)\n")
    }
}

class AnchorEnd is export {
    method dump($level = 0) {
        i($level, "Anchor (End Of String)\n")
    }
}

class AnchorLineEnd is export {
    method dump($level = 0) {
        i($level, "Anchor (End Of Line)\n")
    }
}

class AnchorPass is export {
    method dump($level = 0) {
        i($level, "Anchor (Pass)\n")
    }
}

class AnchorFail is export {
    method dump($level = 0) {
        i($level, "Anchor (Fail)\n")
    }
}
