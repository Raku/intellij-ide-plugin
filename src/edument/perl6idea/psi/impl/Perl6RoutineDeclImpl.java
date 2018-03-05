package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import edument.perl6idea.parsing.Perl6ElementTypes;
import edument.perl6idea.parsing.Perl6TokenTypes;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;

import static edument.perl6idea.parsing.Perl6ElementTypes.*;

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
        return (name == null ? "<anon>" : name.getText()) + summarySignature();
    }

    private String summarySignature() {
        Perl6SignatureImpl signature = findChildByClass(Perl6SignatureImpl.class);
        String retTrait = null;
        String retConstraint = null;

        if (signature == null)
            return "()";

        ASTNode constr = signature.getNode().findChildByType(RETURN_CONSTRAINT);
        if (constr != null) {
            retTrait = constr.getPsi().getNode().findChildByType(TYPE_NAME).getText();
        } else {
            ASTNode current = null;
            for (PsiElement x : signature.getChildren()) {
                if (x.getNode().getElementType() == PARAMETER) {
                    ASTNode trait = x.getNode().findChildByType(TRAIT);
                    if (trait != null && trait.getFirstChildNode().getText().equals("returns")) {
                        current = trait;
                    }
                }
            }
            if (current != null)
                retConstraint = current.getPsi().getNode().findChildByType(TYPE_NAME).getText();
        }

        return retTrait != null ?
                signature.summary(retTrait) :
                retConstraint != null ?
                signature.summary(retConstraint) : "";
    }
}
