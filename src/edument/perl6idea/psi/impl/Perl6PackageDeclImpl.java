package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6PackageDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6PackageDeclImpl extends ASTWrapperPsiElement implements Perl6PackageDecl {
    public Perl6PackageDeclImpl(@NotNull ASTNode node) {
        super(node);
    }
}
