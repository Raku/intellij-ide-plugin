package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6MethodCall;
import org.jetbrains.annotations.NotNull;

public class Perl6MethodCallImpl extends ASTWrapperPsiElement implements Perl6MethodCall {
    public Perl6MethodCallImpl(@NotNull ASTNode node) {
        super(node);
    }
}
