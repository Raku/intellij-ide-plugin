package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6Constant;
import org.jetbrains.annotations.NotNull;

public class Perl6ConstantImpl extends ASTWrapperPsiElement implements Perl6Constant {
    public Perl6ConstantImpl(@NotNull ASTNode node) {
        super(node);
    }
}
