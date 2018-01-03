package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6RoutineDeclImpl extends ASTWrapperPsiElement implements Perl6RoutineDecl {
    public Perl6RoutineDeclImpl(@NotNull ASTNode node) {
        super(node);
    }
}
