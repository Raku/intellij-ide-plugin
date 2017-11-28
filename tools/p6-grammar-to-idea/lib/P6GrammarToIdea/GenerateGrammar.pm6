use P6GrammarToIdea::AST;
use Java::Generate::Class;
use Java::Generate::CompUnit;
use Java::Generate::JavaMethod;
use Java::Generate::JavaParameter;
use Java::Generate::JavaSignature;

sub generate-grammar(Grammar $grammar) is export {
    my $class = Class.new: :access<public>, :name("$grammar.name()Braid"),
        :super(Class.new(:name("Cursor<$grammar.name()Braid>")));
    my $comp-unit = CompUnit.new:
        package => 'edument.perl6idea.parsing',
        imports => <
        >,
        type => $class;
    return $comp-unit.generate;
}
