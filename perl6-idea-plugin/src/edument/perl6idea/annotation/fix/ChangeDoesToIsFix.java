package edument.perl6idea.annotation.fix;

import com.intellij.codeInsight.intention.IntentionAction;
import com.intellij.codeInsight.intention.PsiElementBaseIntentionAction;
import com.intellij.openapi.editor.CaretState;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.util.IncorrectOperationException;
import edument.perl6idea.psi.Perl6Trait;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ChangeDoesToIsFix extends PsiElementBaseIntentionAction implements IntentionAction {
    private final Perl6Trait myTrait;

    public ChangeDoesToIsFix(Perl6Trait trait) {
        myTrait = trait;
    }

    @Nls
    @NotNull
    @Override
    public String getText() {
        return "Replace \"does\" with \"is\"";
    }

    @Nls
    @NotNull
    @Override
    public String getFamilyName() {
        return "Raku";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, @NotNull PsiElement element) {
        return true;
    }

    @Override
    public void invoke(@NotNull Project project, Editor editor, @NotNull PsiElement element) throws IncorrectOperationException {
        List<CaretState> carets = editor.getCaretModel().getCaretsAndSelections();
        myTrait.changeTraitMod("is");
        editor.getCaretModel().setCaretsAndSelections(carets);
    }

    @Override
    public boolean startInWriteAction() {
        return true;
    }
}
