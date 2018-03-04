package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6PackageDecl;
import edument.perl6idea.psi.Perl6PsiElement;
import edument.perl6idea.psi.Perl6ScopedDecl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perl6ScopedDeclImpl extends ASTWrapperPsiElement implements Perl6ScopedDecl {
    public Perl6ScopedDeclImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        return new ArrayList<>(Arrays.asList(findChildrenByClass(Perl6PackageDecl.class)));
    }
}
