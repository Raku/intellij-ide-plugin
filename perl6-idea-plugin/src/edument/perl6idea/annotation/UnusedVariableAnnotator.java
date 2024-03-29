package edument.perl6idea.annotation;

import com.intellij.lang.annotation.AnnotationBuilder;
import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.search.LocalSearchScope;
import com.intellij.psi.search.searches.ReferencesSearch;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.Query;
import edument.perl6idea.annotation.fix.DeleteUnusedVariable;
import edument.perl6idea.highlighter.Perl6Highlighter;
import edument.perl6idea.psi.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class UnusedVariableAnnotator implements Annotator {
    @Override
    public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
        // See if it's something we know how to handle, and extract the items to
        // search for and the search scope.
        List<PsiElement> toCheck = null;
        LocalSearchScope searchScope = null;
        String error = null;
        if (element instanceof Perl6VariableDecl) {
            // If it's lexical or state, then we want to check for usages in the
            // declaring lexical scope.
            String scope = ((Perl6VariableDecl)element).getScope();
            if (scope.equals("my") || scope.equals("state")) {
                Perl6PsiScope usageScope = PsiTreeUtil.getParentOfType(element, Perl6PsiScope.class);
                if (usageScope != null) {
                    searchScope = new LocalSearchScope(usageScope);
                    toCheck = new ArrayList<>();
                    for (Perl6Variable variable : ((Perl6VariableDecl)element).getVariables()) {
                        if (namedWithoutTwigil(variable.getName()))
                            continue;
                        toCheck.add(variable.getParent() instanceof Perl6ParameterVariable
                                    ? variable.getParent()
                                    : element);
                    }
                    error = "Unused variable";
                }
            }

            // If it's has-scoped and has a ! twigil and we're not in a role, we
            // can check it.
            else if (scope.equals("has")) {
                Perl6PackageDecl containingPackage = PsiTreeUtil.getParentOfType(element, Perl6PackageDecl.class);
                if (containingPackage != null && !containingPackage.getPackageKind().equals("role")) {
                    searchScope = new LocalSearchScope(containingPackage);
                    toCheck = new ArrayList<>();
                    for (Perl6Variable variable : ((Perl6VariableDecl)element).getVariables()) {
                        String name = variable.getVariableName();
                        if (name == null || name.length() < 3 || Perl6Variable.getTwigil(name) != '!')
                            continue;
                        toCheck.add(variable);
                    }
                    error = "Unused attribute";
                }
            }
        }
        else if (element instanceof Perl6ParameterVariable) {
            // Make sure the parameter is not really part of a signature in a
            // variable declaration; those are checked separately. Also ensure
            // it's not anonymous nor carrying a twigil, and not on a stubbed
            // method (where they can be just for documentation).
            String name = ((Perl6ParameterVariable)element).getName();
            if (namedWithoutTwigil(name))
                return;
            Perl6Signature signature = PsiTreeUtil.getParentOfType(element, Perl6Signature.class);
            if (signature != null) {
                PsiElement signatureOwner = signature.getParent();
                if (!(signatureOwner instanceof Perl6VariableDecl) &&
                        !(signatureOwner instanceof Perl6RoutineDecl && ((Perl6RoutineDecl)signatureOwner).isStubbed())) {
                    Perl6PsiScope usageScope = PsiTreeUtil.getParentOfType(element, Perl6PsiScope.class);
                    if (usageScope != null) {
                        searchScope = new LocalSearchScope(usageScope);
                        toCheck = Collections.singletonList(element);
                        error = "Unused parameter";
                    }
                }
            }
        }

        // Assuming we have search targets, go over them.
        if (toCheck == null)
            return;
        for (PsiElement expectedUsed : toCheck) {
            // We need two references, since the declaration resolves to itself.
            Query<PsiReference> results = ReferencesSearch.search(expectedUsed, searchScope);
            AtomicInteger count = new AtomicInteger();
            results.forEach(found -> count.incrementAndGet() < 2);

            // Annotate if not found.
            if (count.get() < 2 && !implicitlyUsed(expectedUsed)) {
                PsiElement toAnnotate = expectedUsed instanceof Perl6VariableDecl
                    ? ((Perl6VariableDecl)expectedUsed).getVariables()[0]
                    : expectedUsed;
                AnnotationBuilder annBuilder = holder.newAnnotation(HighlightSeverity.WEAK_WARNING, error)
                        .range(toAnnotate)
                        .textAttributes(Perl6Highlighter.UNUSED);
                if (element instanceof Perl6VariableDecl && ((Perl6VariableDecl) element).getVariableNames().length == 1)
                    annBuilder = annBuilder.withFix(new DeleteUnusedVariable());
                annBuilder.create();
            }
        }
    }

    private static boolean namedWithoutTwigil(String name) {
        if (name == null || name.length() < 2)
            return true;
        char twigil = Perl6Variable.getTwigil(name);
        if (twigil != ' ')
            return true;
        return false;
    }

    private static boolean implicitlyUsed(PsiElement used) {
        String name = null;
        if (used instanceof Perl6Variable)
            name = ((Perl6Variable)used).getVariableName();
        else if (used instanceof Perl6ParameterVariable)
            name = ((Perl6ParameterVariable)used).getName();
        if (name == null)
            return false;
        if (name.equals("$_"))
            return implicitlyUsedTopic(PsiTreeUtil.getParentOfType(used, Perl6PsiScope.class));
        if (name.equals("$/"))
            return implicitlyUsedMatch(PsiTreeUtil.getParentOfType(used, Perl6PsiScope.class));
        return false;
    }

    private static boolean implicitlyUsedTopic(Perl6PsiElement current) {
        for (PsiElement child : current.getChildren()) {
            // If this construct topicalizes, then it won't have implicit uses of the
            // current topic.
            if (child instanceof P6Topicalizer && ((P6Topicalizer)child).isTopicalizing())
                continue;
            // If it's a `when` statement, it tests against the topic.
            if (child instanceof Perl6WhenStatement)
                return true;
            // If it's a call on the topic (`.foo`), it uses the topic.
            if (child instanceof Perl6MethodCall && ((Perl6MethodCall)child).isTopicCall())
                return true;
            // Otherwise, recurse.
            if (child instanceof Perl6PsiElement && implicitlyUsedTopic((Perl6PsiElement)child))
                return true;
        }
        return false;
    }

    private static boolean implicitlyUsedMatch(Perl6PsiElement current) {
        for (PsiElement child : current.getChildren()) {
            // Use of $0 and $<foo> is the implicit use we're looking for.
            if (child instanceof Perl6Variable && ((Perl6Variable)child).isCaptureVariable())
                return true;
            // If it's a routine, then it will declare a fresh $/.
            if (child instanceof Perl6RoutineDecl)
                continue;
            // Otherwise, recurse.
            if (child instanceof Perl6PsiElement && implicitlyUsedMatch((Perl6PsiElement)child))
                return true;
        }
        return false;
    }
}
