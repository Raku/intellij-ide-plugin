package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6LongName;
import edument.perl6idea.psi.Perl6MultiDecl;
import edument.perl6idea.psi.Perl6PsiElement;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Perl6MultiDeclImpl extends ASTWrapperPsiElement implements Perl6MultiDecl {
    public Perl6MultiDeclImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        Perl6RoutineDecl r = findChildByClass(Perl6RoutineDecl.class);
        Perl6LongName name = null;
        if (r == null)
            name = findChildByClass(Perl6LongName.class);
        return r != null
                ? Collections.singletonList(r)
                : name != null ? Collections.singletonList(name)
                : new ArrayList<>();
    }
}
