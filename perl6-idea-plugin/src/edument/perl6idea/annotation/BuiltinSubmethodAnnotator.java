package edument.perl6idea.annotation;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import edument.perl6idea.annotation.fix.MakeSubmethodFix;
import edument.perl6idea.psi.Perl6RoutineDecl;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuiltinSubmethodAnnotator implements Annotator {
    private static final List<String> SHOULD_BE_SUBMETHOD_NAMES = new ArrayList<>(Arrays.asList("BUILD", "TWEAK"));

    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof Perl6RoutineDecl routineDecl))
            return;

        String name = routineDecl.getRoutineName();
        if (!SHOULD_BE_SUBMETHOD_NAMES.contains(name))
            return;

        if (routineDecl.getRoutineKind().equals("method"))
            holder.newAnnotation(HighlightSeverity.WARNING,
                                 String.format("%s should be declared as a submethod", name))
                .withFix(new MakeSubmethodFix(routineDecl))
                .range(routineDecl.getDeclaratorNode()).create();
    }
}
