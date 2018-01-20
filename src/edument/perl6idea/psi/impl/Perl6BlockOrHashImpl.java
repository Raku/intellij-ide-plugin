package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6BlockOrHash;
import org.jetbrains.annotations.NotNull;

public class Perl6BlockOrHashImpl extends ASTWrapperPsiElement implements Perl6BlockOrHash {
    public Perl6BlockOrHashImpl(@NotNull ASTNode node) {
        super(node);
    }
}
