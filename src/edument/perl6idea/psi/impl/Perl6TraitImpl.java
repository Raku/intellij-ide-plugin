package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Trait;
import org.jetbrains.annotations.NotNull;

public class Perl6TraitImpl extends ASTWrapperPsiElement implements Perl6Trait {
    public Perl6TraitImpl(@NotNull ASTNode node) {
        super(node);
    }
}
