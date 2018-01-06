package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6NeedStatement;
import org.jetbrains.annotations.NotNull;

public class Perl6NeedStatementImpl extends ASTWrapperPsiElement implements Perl6NeedStatement {
    public Perl6NeedStatementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
