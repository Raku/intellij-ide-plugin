unit module P6GrammarToIdea::Elements;
use P6GrammarToIdea::AST;

# This walks the AST and builds up an element model. This will be used to
# generate an element list and a parser. The parser works in terms of tokens,
# which are produced by the lexer, which actually does the hard work of Perl 6
# parsing (far more than a "traditional" lexer). The element model consists of
# the information extracted from the grammar about elements and tokens.

class BraidModel {
    has %!production-structure;
    has %!element-names;

    method add-production(Production $p) {
        unless $p.proto {
            self.walk($p.implementation);
        }
    }

    method element-names() {
        %!element-names.keys
    }

    multi method walk(Alt $a) {
        self!alt($a);
    }

    multi method walk(SeqAlt $a) {
        self!alt($a);
    }

    method !alt($a) {
        for $a.alternatives {
            self.walk($_);
        }
    }

    multi method walk(Concat $c) {
        for $c.terms {
            self.walk($_);
        }
    }

    multi method walk(Quantifier $q) {
        self.walk($q.target);
    }

    multi method walk(Capture $c) {
        self.walk($c.target);
    }

    multi method walk(Subrule $s) {
        given $s.name {
            when 'start-element' {
                my $element-name = get-name($s);
                %!element-names{$element-name}++;
            }
            when 'end-element' {
                my $element-name = get-name($s);
            }
            when 'start-token' {
                my $token-name = get-name($s);
            }
            when 'end-token' {
                my $token-name = get-name($s);
            }
            default {
            }
        }
    }

    sub get-name($call) {
        unless $call.args == 1 && $call.args[0] ~~ StrArg {
            die 'Must call $call.name() with one string argument';
        }
        $call.args[0].value
    }

    multi method walk(Literal) {}

    multi method walk(Lookahead) {}
    multi method walk(EnumCharList) {}
    multi method walk(BuiltinCharClass) {}
    multi method walk(AnchorLeftWordBoundary) {}
    multi method walk(AnchorRightWordBoundary) {}
    multi method walk(AnchorEnd) {}
    multi method walk(AnchorLineEnd) {}
    multi method walk(AnchorPass) {}
    multi method walk(AnchorFail) {}
}

class Model {
    has %!braids;

    method add-braid-model(Str $key, BraidModel $bm) {
        %!braids{$key} = $bm;
    }

    method element-names() {
        %!braids.values.map({ |.element-names }).unique
    }
}

sub build-element-model(Braids $braids) is export {
    my $model = Model.new;
    for $braids.braids.kv -> $name, $grammar {
        my $bm = BraidModel.new;
        for $grammar.productions {
            $bm.add-production($_);
        }
        $model.add-braid-model($name, $bm);
    }
    return $model;
}
