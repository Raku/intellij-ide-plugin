package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateBody;
import org.jetbrains.annotations.NotNull;

public class CroTemplateBodyImpl extends ASTWrapperPsiElement implements CroTemplateBody {
    public CroTemplateBodyImpl(@NotNull ASTNode node) {
        super(node);
    }
}
