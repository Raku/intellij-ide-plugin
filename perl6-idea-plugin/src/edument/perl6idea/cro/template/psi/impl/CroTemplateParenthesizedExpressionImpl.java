package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateParenthesizedExpression;
import org.jetbrains.annotations.NotNull;

public class CroTemplateParenthesizedExpressionImpl extends ASTWrapperPsiElement implements CroTemplateParenthesizedExpression {
    public CroTemplateParenthesizedExpressionImpl(@NotNull ASTNode node) {
        super(node);
    }
}
