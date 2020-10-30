package edument.perl6idea.intention;

import com.intellij.codeInspection.util.IntentionName;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

public class UnicodeConvertIntention extends OperatorConverterIndention {
    @Override
    public @IntentionName @NotNull String getText() {
        return "Convert to Unicode operator";
    }

    @Override
    public boolean isAvailable(@NotNull Project project, Editor editor, PsiFile file) {
        return canBeConverted(editor, file) == OperatorResult.ASCII;
    }
}
