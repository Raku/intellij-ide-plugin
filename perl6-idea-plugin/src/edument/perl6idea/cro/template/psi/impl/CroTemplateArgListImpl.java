package edument.perl6idea.cro.template.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.cro.template.psi.CroTemplateArgList;
import org.jetbrains.annotations.NotNull;

public class CroTemplateArgListImpl extends ASTWrapperPsiElement implements CroTemplateArgList {
    public CroTemplateArgListImpl(@NotNull ASTNode node) {
        super(node);
    }
}
