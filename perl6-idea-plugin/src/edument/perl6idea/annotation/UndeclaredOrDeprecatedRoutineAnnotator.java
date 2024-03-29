package edument.perl6idea.annotation;

import com.intellij.lang.annotation.*;
import com.intellij.openapi.editor.colors.CodeInsightColors;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReferenceBase;
import com.intellij.psi.ResolveResult;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.annotation.fix.ConstKeywordFix;
import edument.perl6idea.annotation.fix.StubMissingSubroutineFix;
import edument.perl6idea.highlighter.Perl6Highlighter;
import edument.perl6idea.psi.*;
import edument.perl6idea.sdk.Perl6SdkType;
import org.jetbrains.annotations.NotNull;

public class UndeclaredOrDeprecatedRoutineAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof final Perl6SubCallName call))
            return;

        // Only do the analysis if the core setting symbols are available.
        Perl6File setting = Perl6SdkType.getInstance().getCoreSettingFile(element.getProject());
        if (setting.getVirtualFile().getName().equals("DUMMY"))
            return;

        // Resolve the reference.
        String subName = call.getCallName();
        if (subName.equals("::"))
            return;
        PsiReferenceBase.Poly<?> reference = (PsiReferenceBase.Poly<?>)call.getReference();
        if (reference == null)
            return;
        ResolveResult[] results = reference.multiResolve(false);

        // If no resolve results, then we've got an error.
        if (results.length == 0) {
            AnnotationBuilder annBuilder = holder.newAnnotation(HighlightSeverity.ERROR,
                                                                String.format("Subroutine %s is not declared", subName))
                    .withFix(new StubMissingSubroutineFix())
                    .range(element);
            if (subName.equals("const") &&
                (PsiTreeUtil.skipWhitespacesForward(call) instanceof Perl6Variable ||
                 PsiTreeUtil.skipWhitespacesForward(call) instanceof Perl6InfixApplication)) {
                annBuilder = annBuilder.withFix(new ConstKeywordFix(call));
            }
            annBuilder.create();
        }

        else if (results.length == 1) {
            // If it resolves to a type, highlight it as one.
            PsiElement resolvedElement = results[0].getElement();
            if (resolvedElement instanceof Perl6PackageDecl) {
                holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
                    .textAttributes(Perl6Highlighter.TYPE_NAME)
                    .create();
            }

            // If it resolves to a deprecated routine, highlight it as one.
            else if (resolvedElement instanceof Perl6Deprecatable && ((Perl6Deprecatable)resolvedElement).isDeprecated()) {
                String deprecationMessage = ((Perl6Deprecatable)resolvedElement).getDeprecationMessage();
                String message = subName + " is deprecated" + (deprecationMessage != null ? "; use " + deprecationMessage : "");
                holder.newAnnotation(HighlightSeverity.WARNING, message)
                    .textAttributes(CodeInsightColors.DEPRECATED_ATTRIBUTES)
                    .create();
            }
        }
    }
}
