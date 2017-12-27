package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6UseStatement;
import org.jetbrains.annotations.NotNull;

public class Perl6UseStatementImpl extends ASTWrapperPsiElement implements Perl6UseStatement {
    public Perl6UseStatementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
