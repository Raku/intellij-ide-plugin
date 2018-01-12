package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Perl6RegexDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6Perl6RegexDeclImpl extends ASTWrapperPsiElement implements Perl6Perl6RegexDecl {
    public Perl6Perl6RegexDeclImpl(@NotNull ASTNode node) {
        super(node);
    }
}
