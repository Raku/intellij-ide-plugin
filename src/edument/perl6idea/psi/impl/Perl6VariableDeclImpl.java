package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6VariableDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6VariableDeclImpl extends ASTWrapperPsiElement implements Perl6VariableDecl {
    public Perl6VariableDeclImpl(@NotNull ASTNode node) {
        super(node);
    }
}
