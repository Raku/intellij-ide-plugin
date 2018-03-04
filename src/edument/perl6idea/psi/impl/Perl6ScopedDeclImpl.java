package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.*;
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
        ArrayList<Perl6PsiElement> decls = new ArrayList<>();
        decls.addAll(Arrays.asList(findChildrenByClass(Perl6RegexDecl.class)));
        decls.addAll(Arrays.asList(findChildrenByClass(Perl6RoutineDecl.class)));
        decls.addAll(Arrays.asList(findChildrenByClass(Perl6PackageDecl.class)));
        return decls;
    }
}
