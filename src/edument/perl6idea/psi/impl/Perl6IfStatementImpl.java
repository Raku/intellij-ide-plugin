package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6IfStatement;
import org.jetbrains.annotations.NotNull;

public class Perl6IfStatementImpl extends ASTWrapperPsiElement implements Perl6IfStatement {
    public Perl6IfStatementImpl(@NotNull ASTNode node) {
        super(node);
    }
}