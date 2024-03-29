package edument.perl6idea.annotation;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import edument.perl6idea.psi.Perl6PackageDecl;
import edument.perl6idea.psi.Perl6Trait;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NonInheritableComposableDeclAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof Perl6PackageDecl decl)) return;
        String kind = decl.getPackageKind();
        if (!kind.equals("package") && !kind.equals("module")) return;

        List<Perl6Trait> traits = decl.getTraits();
        String messageBase = decl.getPackageKind() + " cannot ";
        for (Perl6Trait trait : traits) {
            String modifier = trait.getTraitModifier();
            if (modifier.equals("does")) {
                holder.newAnnotation(HighlightSeverity.ERROR, messageBase + "compose a role")
                    .range(trait).create();
            }
            else if (modifier.equals("is")) {
                holder.newAnnotation(HighlightSeverity.ERROR, messageBase + "inherit a class")
                    .range(trait).create();
            }
        }
    }
}
