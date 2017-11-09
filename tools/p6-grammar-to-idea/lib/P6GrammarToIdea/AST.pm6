unit module P6GrammarToIdea::AST;

class Braids is export {
    has %.braids;
}

class Grammar is export {
    has $.name;
    has @.productions;
}

class Production is export {
    has $.name;
    has $.implementation;
}

class SeqAlt is export {
    has @.alternatives;
}

class Alt is export {
    has @.alternatives;
}

class Concat is export {
    has @.terms;
}

class Quantifier is export {
    has $.min;
    has $.max;
    has $.target;
}

class Capture is export {
    has $.name;
    has $.target;
}

class Subrule is export {
    has $.name;
}

class AnchorEnd is export {
}
