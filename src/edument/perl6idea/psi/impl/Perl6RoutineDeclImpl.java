package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import edument.perl6idea.parsing.Perl6ElementTypes;
import edument.perl6idea.parsing.Perl6TokenTypes;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;

public class Perl6RoutineDeclImpl extends ASTWrapperPsiElement implements Perl6RoutineDecl {
    public Perl6RoutineDeclImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getRoutineKind() {
        PsiElement declarator = findChildByType(Perl6TokenTypes.ROUTINE_DECLARATOR);
        return declarator == null ? "routine" : declarator.getText();
    }

    @Override
    public String getRoutineName() {
        PsiElement name = findChildByType(Perl6ElementTypes.LONG_NAME);
        return name == null ? "<anon>" : name.getText();
    }
}
