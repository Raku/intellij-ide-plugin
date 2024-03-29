package edument.perl6idea.annotation;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import edument.perl6idea.annotation.fix.RemoveInitializerFix;
import edument.perl6idea.psi.*;
import org.jetbrains.annotations.NotNull;

public class EmptyInitializationAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof Perl6VariableDecl decl))
            return;

        String[] names = decl.getVariableNames();
        if (names.length != 1)
            return;
        String name = names[0];
        char sigil = Perl6Variable.getSigil(name);
        if (sigil != '@' && sigil != '%')
            return;

        boolean shouldAnnotate = false;
        PsiElement initializer = decl.getInitializer();

        if (sigil == '@' && initializer instanceof Perl6ArrayComposer) {
            shouldAnnotate = ((Perl6ArrayComposer)initializer).getElements().length == 0;
        } else if (initializer instanceof Perl6ParenthesizedExpr) {
            shouldAnnotate = ((Perl6ParenthesizedExpr)initializer).getElements().length == 0;
        } else if (sigil == '%' && initializer instanceof Perl6BlockOrHash) {
            shouldAnnotate = ((Perl6BlockOrHash)initializer).getElements().length == 0;
        }

        if (shouldAnnotate)
            holder.newAnnotation(HighlightSeverity.WEAK_WARNING,
                                 String.format("Initialization of empty %s is redundant", sigil == '@' ? "Array" : "Hash"))
            .range(initializer).withFix(new RemoveInitializerFix(decl, name)).create();
    }
}
