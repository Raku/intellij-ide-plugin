package edument.perl6idea.docs;

import com.intellij.lang.documentation.DocumentationProvider;
import com.intellij.psi.*;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.psi.*;
import edument.perl6idea.psi.external.ExternalPerl6File;
import edument.perl6idea.psi.external.ExternalPerl6PackageDecl;
import edument.perl6idea.psi.external.Perl6ExternalPsiElement;
import edument.perl6idea.utils.Perl6Utils;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Perl6DocumentationProvider implements DocumentationProvider {
    @Nullable
    @Override
    public synchronized String getQuickNavigateInfo(PsiElement element, PsiElement originalElement) {
        if (element instanceof Perl6Constant) {
            if (element.getText().length() < 50)
                return Perl6Utils.escapeHTML(element.getText());
            return Perl6Utils.escapeHTML("constant " + ((Perl6Constant)element).getConstantName() + " = ...");
        } else if (element instanceof Perl6Enum enumEl) {
            return Perl6Utils.escapeHTML("enum " + enumEl.getEnumName() + " (" + String.join(", ", enumEl.getEnumValues()) + ")");
        } else if (element instanceof Perl6PackageDecl decl) {
            Optional<String> traits = decl.getTraits().stream().map(t -> t.getTraitModifier() + " " + t.getTraitName()).reduce((s1, s2) -> s1 + " " + s2);
            return Perl6Utils.escapeHTML(String.format("%s %s%s", decl.getPackageKind(), decl.getPackageName(),
                                 traits.map(s -> " " + s).orElse("")));
        } else if (element instanceof Perl6ParameterVariable decl) {
            Perl6Parameter parameter = PsiTreeUtil.getParentOfType(decl, Perl6Parameter.class);
            if (parameter == null) return null;
            return Perl6Utils.escapeHTML(parameter.getText());
        } else if (element instanceof Perl6RegexDecl decl) {
            String text = element.getText();
            if (text.length() < 50)
                return text;
            return Perl6Utils.escapeHTML(String.format("%s %s { ... }", decl.getRegexKind(), decl.getRegexName()));
        } else if (element instanceof Perl6RoutineDecl decl) {
            String signature;
            if (decl instanceof Perl6ExternalPsiElement)
                signature = "(" + decl.summarySignature() + ")";
            else {
                Perl6Signature node = decl.getSignatureNode();
                signature = node != null ? node.getText() : "()";
            }
            return Perl6Utils.escapeHTML(String.format("%s %s%s", decl.getRoutineKind(), decl.getRoutineName(), signature));
        } else if (element instanceof Perl6Subset) {
            return Perl6Utils.escapeHTML("subset " + ((Perl6Subset)element).getSubsetName() + " of " + ((Perl6Subset)element).getSubsetBaseTypeName());
        } else if (element instanceof Perl6VariableDecl decl) {
            String name = String.join(", ", decl.getVariableNames());
            String scope = decl.getScope();
            PsiElement initializer = decl.getInitializer();
            Perl6PackageDecl selfType = scope.equals("has") ? PsiTreeUtil.getParentOfType(decl, Perl6PackageDecl.class) : null;
            return Perl6Utils.escapeHTML(String.format("%s %s%s%s",
                                 scope, name, initializer == null ? "" : " = " + initializer.getText(),
                                 selfType == null ? "" : " (attribute of " + selfType.getPackageName() + ")"));
        }
        return null;
    }

    @Nullable
    @Override
    public List<String> getUrlFor(PsiElement element, PsiElement originalElement) {
        if (element instanceof Perl6ExternalPsiElement) {
            String name = ((Perl6ExternalPsiElement)element).getName();
            PsiElement parent = element.getParent();
            if (parent instanceof ExternalPerl6PackageDecl)
                parent = parent.getParent();
            if (parent instanceof ExternalPerl6File &&
                Objects.equals(((ExternalPerl6File)parent).getName(), "SETTINGS.pm6")) {
                if (element instanceof Perl6PackageDecl)
                    return Collections.singletonList("https://docs.perl6.org/type/" + name);
                else if (element instanceof Perl6RoutineDecl)
                    return Collections.singletonList("https://docs.perl6.org/routine/" + name);
            }
        }
        return null;
    }

    @Nullable
    @Override
    public synchronized String generateDoc(PsiElement element, @Nullable PsiElement originalElement) {
        if (element instanceof Perl6MethodCall || element instanceof Perl6SubCall) {
            PsiReference ref;
            if (element instanceof Perl6MethodCall) {
                ref = element.getReference();
            } else {
                Perl6SubCallName callName = PsiTreeUtil.findChildOfType(element, Perl6SubCallName.class);
                if (callName == null) return null;
                ref = callName.getReference();
            }
            if (!(ref instanceof PsiReferenceBase.Poly))
                return null;
            ResolveResult[] resolves = ((PsiReferenceBase.Poly<?>)ref).multiResolve(false);
            for (ResolveResult result : resolves) {
                PsiElement declaration = result.getElement();
                if (declaration instanceof Perl6RoutineDecl) {
                    String docs = ((Perl6RoutineDecl)declaration).getDocsString();
                    if (docs != null)
                        return docs;
                }
            }
        }

        if (element instanceof Perl6Documented) {
            String docsString = ((Perl6Documented)element).getDocsString();
            return docsString == null || docsString.isEmpty() || docsString.equals("<br>")
                   ? null
                   : docsString;
        }
        return null;
    }

    @Nullable
    @Override
    public PsiElement getDocumentationElementForLookupItem(PsiManager psiManager, Object object, PsiElement element) {
        return null;
    }

    @Nullable
    @Override
    public PsiElement getDocumentationElementForLink(PsiManager psiManager, String link, PsiElement context) {
        return null;
    }
}
