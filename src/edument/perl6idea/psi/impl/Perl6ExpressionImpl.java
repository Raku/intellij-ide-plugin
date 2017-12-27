package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Expression;
import org.jetbrains.annotations.NotNull;

public class Perl6ExpressionImpl extends ASTWrapperPsiElement implements Perl6Expression {
    public Perl6ExpressionImpl(@NotNull ASTNode node) {
        super(node);
    }
}
