package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateDerefMethod;
import org.jetbrains.annotations.NotNull;

public class CroTemplateDerefMethodImpl extends ASTWrapperPsiElement implements CroTemplateDerefMethod {
    public CroTemplateDerefMethodImpl(@NotNull ASTNode node) {
        super(node);
    }
}
