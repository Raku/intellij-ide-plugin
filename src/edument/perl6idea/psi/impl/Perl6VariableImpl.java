package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Variable;
import org.jetbrains.annotations.NotNull;

public class Perl6VariableImpl extends ASTWrapperPsiElement implements Perl6Variable {
    public Perl6VariableImpl(@NotNull ASTNode node) {
        super(node);
    }
}
