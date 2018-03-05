package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import edument.perl6idea.parsing.Perl6ElementTypes;
import edument.perl6idea.parsing.Perl6TokenTypes;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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

        if (signature == null) {
            retTrait = getReturnsTrait(this);
            if (retTrait != null) return "(--> " + retTrait + ")";
            return "()";
        }

        ASTNode constr = signature.getNode().findChildByType(RETURN_CONSTRAINT);
        if (constr != null) {
            ASTNode type = constr.getPsi().getNode().findChildByType(TYPE_NAME);
            if (type != null) retTrait = type.getText();
        } else {
            retConstraint = checkReturnTraitInSignature(signature);
        }

        return retTrait != null ?
                signature.summary(retTrait) :
                retConstraint != null ?
                        signature.summary(retConstraint) : "";
    }

    private String checkReturnTraitInSignature(Perl6SignatureImpl signature) {
        for (PsiElement child : signature.getChildren()) {
            if (child.getNode().getElementType() == PARAMETER) {
                String trait = getReturnsTrait(child);
                if (trait != null) return trait;
            }
        }
        return null;
    }

    @Nullable
    private String getReturnsTrait(PsiElement child) {
        ASTNode trait = child.getNode().findChildByType(TRAIT);
        if (trait != null && trait.getFirstChildNode().getText().equals("returns")) {
            ASTNode type = trait.getPsi().getNode().findChildByType(TYPE_NAME);
            if (type != null) return type.getText();
        }
        return null;
    }
}
