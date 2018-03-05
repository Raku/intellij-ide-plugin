package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Parameter;
import org.jetbrains.annotations.NotNull;

public class Perl6ParameterImpl extends ASTWrapperPsiElement implements Perl6Parameter {
    public Perl6ParameterImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String summary() {
        return "Arg";
    }
}
