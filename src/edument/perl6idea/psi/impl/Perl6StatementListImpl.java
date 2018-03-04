package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6PsiElement;
import edument.perl6idea.psi.Perl6Statement;
import edument.perl6idea.psi.Perl6StatementList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Perl6StatementListImpl extends ASTWrapperPsiElement implements Perl6StatementList {
    public Perl6StatementListImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        ArrayList<Perl6PsiElement> decls = new ArrayList<>();
        for (Perl6Statement statement : findChildrenByClass(Perl6Statement.class))
            decls.addAll(statement.getDeclarations());
        return decls;
    }
}
