package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateBoolLiteral;
import org.jetbrains.annotations.NotNull;

public class CroTemplateBoolLiteralImpl extends ASTWrapperPsiElement implements CroTemplateBoolLiteral {
    public CroTemplateBoolLiteralImpl(@NotNull ASTNode node) {
        super(node);
    }
}
