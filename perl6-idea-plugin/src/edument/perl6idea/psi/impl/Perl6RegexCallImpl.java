package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import edument.perl6idea.psi.Perl6ElementFactory;
import edument.perl6idea.psi.Perl6RegexCall;
import edument.perl6idea.psi.Perl6RegexCallReference;
import org.jetbrains.annotations.NotNull;

public class Perl6RegexCallImpl extends ASTWrapperPsiElement implements Perl6RegexCall {
    public Perl6RegexCallImpl(ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        return this.getText();
    }

    @Override
    public PsiReference getReference() {
        return new Perl6RegexCallReference(this);
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        Perl6RegexCall newCall = PsiTreeUtil.findChildOfType(Perl6ElementFactory.createRegexCall(getProject(), name), Perl6RegexCall.class);
        if (newCall != null)
            replace(newCall);
        return this;
    }
}
