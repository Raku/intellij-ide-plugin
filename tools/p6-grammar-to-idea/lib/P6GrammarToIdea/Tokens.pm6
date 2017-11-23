unit module P6GrammarToIdea::Tokens;
use P6GrammarToIdea::AST;

# This module walks the AST and identifies all of the tokens (that is, regions
# between a `<.start-token('FOO')>` and an `<.end-token('FOO')>`). These will
# be the tokens returned from lexer generated from IntelliJ; token definitions
# will also be automatically generated from these too.
#
# It also detects some error cases:
# * `end-token` call when no `start-token` call is outstanding
# * Mismatched name of `start-token` and `end-token`
# * `start-token` call within an existing `start-token`
# * Regions that parse something, but aren't covered by a token
# It does this by performing an abstract interpretation of the grammar, which
# means it also descends into rules.

sub check-and-get-tokens(Braids $braids) is export {
    my $*CURRENT-GRAMMAR = $braids.braids<MAIN>;
    my $*CURRENT-PRODUCTION = $*CURRENT-GRAMMAR.get-rule('TOP');
    my %*KNOWN-TOKENS;
    walk($*CURRENT-PRODUCTION);
    return %*KNOWN-TOKENS.keys;
}

multi sub walk(Production $rule) {
    die "Handling of proto NYI" if $rule.proto;
    walk $rule.implementation;
}

multi sub walk(SeqAlt $alt) {
    walk all $alt.alternatives;
}

multi sub walk(Alt $alt) {
    walk all $alt.alternatives;
}

multi sub walk(Concat $concat) {
    walk all $concat.terms;
}

multi sub walk(Quantifier $quant) {
    walk $quant.target;
    walk($_) with $quant.separator;
}

multi sub walk(Capture $cap) {
    walk $cap.target;
}

multi sub walk(Subrule $call) {
    given $call.name {
        when 'start-token' {
            my $token-name = get-token-name($call);
            %*KNOWN-TOKENS{$token-name} = True;
        }
        when 'end-token' {
        }
        default {
            walk($*CURRENT-GRAMMAR.get-rule($call.name));
        }
    }
}

sub get-token-name($call) {
    unless $call.args == 1 && $call.args[0] ~~ StrArg {
        die 'Must call start-token and end-token with one string argument';
    }
    $call.args[0].value
}

multi sub walk(Literal) {
}

multi sub walk(EnumCharList) {
}

multi sub walk(BuiltinCharClass) {
}

# Ignore lookaheads and anchors, because they don't match any chars.
multi sub walk(Lookahead) { }
multi sub walk(AnchorLeftWordBoundary) { }
multi sub walk(AnchorRightWordBoundary) { }
multi sub walk(AnchorEnd) { }
multi sub walk(AnchorLineEnd) { }
multi sub walk(AnchorPass) { }
multi sub walk(AnchorFail) { }
