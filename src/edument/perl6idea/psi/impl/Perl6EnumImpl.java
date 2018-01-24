package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Enum;
import org.jetbrains.annotations.NotNull;

public class Perl6EnumImpl extends ASTWrapperPsiElement implements Perl6Enum {
    public Perl6EnumImpl(@NotNull ASTNode node) {
        super(node);
    }
}
