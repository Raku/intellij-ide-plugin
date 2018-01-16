package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import edument.perl6idea.psi.Perl6RegexBackslashCClass;
import org.jetbrains.annotations.NotNull;

public class Perl6RegexBackslashCClassImpl extends ASTWrapperPsiElement implements Perl6RegexBackslashCClass {
    public Perl6RegexBackslashCClassImpl(@NotNull ASTNode node) {
        super(node);
    }
}
