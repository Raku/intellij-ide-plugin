package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.IncorrectOperationException;
import edument.perl6idea.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Perl6RegexCapturePositionalImpl extends ASTWrapperPsiElement implements Perl6RegexCapturePositional {
    public Perl6RegexCapturePositionalImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getName() {
        // This is not very efficient, since we want to use alias in caller in Perl6QuoteRegexImpl,
        // but we sacrifice some performance for code consistency
        Perl6RegexDriver driver = PsiTreeUtil.getParentOfType(this, Perl6RegexDriver.class);
        if (driver == null) return "";
        Perl6Regex regex = PsiTreeUtil.findChildOfType(driver, Perl6Regex.class, false);
        if (regex == null) return "";

        int captureCounter = 0;
        Deque<PsiElement> toWalk = new ArrayDeque<>(Arrays.asList(regex.getChildren()));
        while (!toWalk.isEmpty()) {
            PsiElement atom = toWalk.removeFirst();
            PsiElement firstChild = atom.getFirstChild();
            if (firstChild instanceof Perl6RegexCapturePositional) {
                if (firstChild.equals(this))
                    return "$" + captureCounter;
                else
                    captureCounter++;
            } else if (firstChild instanceof Perl6RegexGroup) {
                toWalk.addAll(Arrays.asList(firstChild.getChildren()));
            }
        }
        return "";
    }

    @Override
    public PsiElement setName(@NotNull String name) throws IncorrectOperationException {
        return null;
    }

    @Override
    public boolean mightMatchZeroWidth() {
        return atomsMightMatchZeroWidth(PsiTreeUtil.getChildrenOfType(this, Perl6RegexAtom.class));
    }
}
