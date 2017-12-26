use P6GrammarToIdea::AST;
use P6GrammarToIdea::CodeGenUtil;
use P6GrammarToIdea::Elements;
use Java::Generate::Class;
use Java::Generate::CompUnit;
use Java::Generate::Interface;
use Java::Generate::JavaMethod;
use Java::Generate::JavaParameter;
use Java::Generate::JavaSignature;

sub parse-entry-method() {
    my $root-marker = local('rootMarker', 'PsiBuilder.Marker');
    my $builder = local('builder', 'PsiBuilder');
    ClassMethod.new:
        :access<public>, :name<parse>, :signature(JavaSignature.new(parameters => [
            JavaParameter.new('root', 'IElementType'),
            JavaParameter.new('builder', 'PsiBuilder')
        ])),
        :return-type<ASTNode>, :statements[
            decl($root-marker),
            assign($root-marker, call($builder, 'mark')),
            call($root-marker, 'done', local('root', 'IElementType')),
            ret(call($builder, 'getTreeBuilt'))
        ]
}

sub generate-parser(P6GrammarToIdea::Elements::Model $element-model) is export {
    my @methods = parse-entry-method();
    my $class = Class.new: :access<public>, :name("Perl6Parser"),
        :interfaces(Interface.new(:name('PsiParser'))), :@methods;
    my $comp-unit = CompUnit.new:
        package => 'edument.perl6idea.parsing',
        imports => <
            com.intellij.lang.ASTNode
            com.intellij.psi.tree.IElementType
            com.intellij.lang.PsiBuilder
            com.intellij.lang.PsiParser
        >,
        type => $class;
    return $comp-unit.generate;
}
