package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.psi.*;
import edument.perl6idea.psi.type.Perl6Type;
import edument.perl6idea.sdk.Perl6SdkType;
import edument.perl6idea.sdk.Perl6SettingTypeId;
import org.jetbrains.annotations.NotNull;

import static edument.perl6idea.parsing.Perl6TokenTypes.COLON_PAIR;

public class Perl6ColonPairImpl extends ASTWrapperPsiElement implements Perl6ColonPair {
    public Perl6ColonPairImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public @NotNull Perl6Type inferType() {
        return Perl6SdkType.getInstance().getCoreSettingType(getProject(), Perl6SettingTypeId.Pair);
    }

    @Override
    public String getKey() {
        PsiElement sibling = getFirstChild().getNextSibling();
        if (sibling.getNode().getElementType() == COLON_PAIR)
            return sibling.getText();
        else if (sibling instanceof Perl6Variable) {
            String nameWithSigils = ((Perl6Variable)sibling).getVariableName();
            if (nameWithSigils != null) {
                int sigilIndex = Perl6Variable.getTwigil(nameWithSigils) == ' ' ? 1 : 2;
                return nameWithSigils.substring(sigilIndex);
            }
        } else {
            if (getLastChild().getNode().getElementType() == COLON_PAIR)
                return getLastChild().getText();
        }
        return null;
    }

    @Override
    public PsiElement getStatement() {
        PsiElement explicitStatement = PsiTreeUtil.findChildOfAnyType(this, Perl6Statement.class, Perl6StrLiteral.class, Perl6Variable.class);
        if (explicitStatement == null) {
            if (getFirstChild().getText().equals(":")) {
                return Perl6ElementFactory.createStatementFromText(getProject(), "True;");
            } else {
                return Perl6ElementFactory.createStatementFromText(getProject(), "False;");
            }
        }
        return explicitStatement;
    }
}
