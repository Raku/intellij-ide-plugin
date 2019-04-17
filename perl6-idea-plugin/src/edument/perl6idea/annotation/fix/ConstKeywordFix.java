package edument.perl6idea.annotation.fix;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import com.intellij.util.IncorrectOperationException;
import edument.perl6idea.psi.Perl6SubCallName;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

public class ConstKeywordFix implements IntentionAction {
    private final Perl6SubCallName myCall;

    public ConstKeywordFix(Perl6SubCallName call) {
        this.myCall = call;
    }

    @Nls
    @NotNull
    @Override
    public String getText() {
        return "Use 'constant' keyword";
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return getText();
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return true;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, PsiFile file) throws IncorrectOperationException {
        editor.getDocument().replaceString(myCall.getTextOffset(),
                                           myCall.getTextOffset() + myCall.getTextLength(),
                                           "constant");
    }

    @Override
    public boolean startInWriteAction() {
        return true;
    }
}
