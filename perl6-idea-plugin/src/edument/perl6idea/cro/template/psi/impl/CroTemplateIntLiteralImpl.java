package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateIntLiteral;
import org.jetbrains.annotations.NotNull;

public class CroTemplateIntLiteralImpl extends ASTWrapperPsiElement implements CroTemplateIntLiteral {
    public CroTemplateIntLiteralImpl(@NotNull ASTNode node) {
        super(node);
    }
}
