package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6ParameterVariable;
import org.jetbrains.annotations.NotNull;

public class Perl6ParameterVariableImpl extends ASTWrapperPsiElement implements Perl6ParameterVariable {
    public Perl6ParameterVariableImpl(@NotNull ASTNode node) {
        super(node);
    }
}
