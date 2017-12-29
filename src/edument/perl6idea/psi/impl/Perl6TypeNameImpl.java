package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6TypeName;
import org.jetbrains.annotations.NotNull;

public class Perl6TypeNameImpl extends ASTWrapperPsiElement implements Perl6TypeName {
    public Perl6TypeNameImpl(@NotNull ASTNode node) {
        super(node);
    }
}
