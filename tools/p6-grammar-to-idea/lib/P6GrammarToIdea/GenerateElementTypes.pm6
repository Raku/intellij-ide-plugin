use Java::Generate::CompUnit;
use Java::Generate::Expression;
use Java::Generate::Interface;
use Java::Generate::Literal;
use Java::Generate::Variable;

sub generate-perl6-element-types(@element-names) is export {
    my @fields;
    for @element-names -> $name {
        if $name eq 'FILE' {
            push @fields, InterfaceField.new: :type<IFileElementType>, :$name, :default(
                ConstructorCall.new(:name<IFileElementType>, :arguments(
                    StaticVariable.new(:name<INSTANCE>, :class<Perl6Language>))));
        }
        else {
            push @fields, InterfaceField.new: :type<IElementType>, :$name, :default(
                ConstructorCall.new(:name<Perl6ElementType>, :arguments(
                    StringLiteral.new(:value($name)))));
        }
    }
    my $interface = Interface.new: :access<public>, :name<Perl6ElementTypes>, :@fields;
    my $comp-unit = CompUnit.new:
        package => 'edument.perl6idea.parsing',
        imports => <
            com.intellij.psi.tree.IElementType
            com.intellij.psi.tree.IFileElementType
            edument.perl6idea.Perl6Language
        >,
        type => $interface;
    return $comp-unit.generate;
}
