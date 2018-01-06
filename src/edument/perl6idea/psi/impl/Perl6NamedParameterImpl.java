package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6NamedParameter;
import org.jetbrains.annotations.NotNull;

public class Perl6NamedParameterImpl extends ASTWrapperPsiElement implements Perl6NamedParameter {
    public Perl6NamedParameterImpl(@NotNull ASTNode node) {
        super(node);
    }
}
