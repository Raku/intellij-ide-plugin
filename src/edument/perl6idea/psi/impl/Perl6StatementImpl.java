package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Perl6StatementImpl extends ASTWrapperPsiElement implements Perl6Statement {
    public Perl6StatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        ArrayList<Perl6PsiElement> decls = new ArrayList<>();
        Perl6PsiElement consider = findChildByClass(Perl6PsiElement.class);
        if (consider != null) {
            if (consider instanceof Perl6PackageDecl)
                decls.add(consider);
            else if (consider instanceof Perl6RegexDecl)
                decls.add(consider);
            else if (consider instanceof Perl6RoutineDecl)
                decls.add(consider);
            else if (consider instanceof Perl6ScopedDecl)
                decls.addAll(((Perl6ScopedDecl)consider).getDeclarations());
        }
        return decls;
    }
}
