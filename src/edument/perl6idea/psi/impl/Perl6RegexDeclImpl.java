package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6RegexDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6RegexDeclImpl extends ASTWrapperPsiElement implements Perl6RegexDecl {
    public Perl6RegexDeclImpl(@NotNull ASTNode node) {
        super(node);
    }
}
