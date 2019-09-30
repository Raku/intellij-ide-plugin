package edument.perl6idea.annotation;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.annotation.fix.UseBindingToDestructureFix;
import edument.perl6idea.psi.Perl6Infix;
import edument.perl6idea.psi.Perl6Variable;
import edument.perl6idea.psi.Perl6VariableDecl;
import org.jetbrains.annotations.NotNull;

public class ListAssignmentAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        if (!(element instanceof Perl6VariableDecl))
            return;

        Perl6VariableDecl decl = (Perl6VariableDecl)element;
        if (!decl.hasInitializer())
            return;

        Perl6Infix infix = PsiTreeUtil.findChildOfType(decl, Perl6Infix.class);
        if (infix == null || !infix.getOperator().getText().equals("="))
            return;

        Perl6Variable[] variables = decl.getVariables();
        if (variables.length < 2)
            return;

        for (int i = 0, length = variables.length; i < length; i++) {
            String name = variables[i].getVariableName();
            if (i != length - 1 && name.startsWith("@") || name.startsWith("%"))
                holder.createWarningAnnotation(variables[i], String.format("%s slurps everything from assignment", name.startsWith("@") ? "Array" : "Hash"))
                    .registerFix(new UseBindingToDestructureFix(infix));
        }
    }
}