package edument.perl6idea.psi;

import com.intellij.openapi.fileTypes.FileTypeManager;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.NavigatablePsiElement;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.filetypes.Perl6ModuleFileType;
import edument.perl6idea.pod.PodDomBuildingContext;
import edument.perl6idea.psi.effects.Effect;
import edument.perl6idea.psi.effects.EffectCollection;
import edument.perl6idea.psi.symbols.*;
import edument.perl6idea.psi.type.Perl6Type;
import edument.perl6idea.psi.type.Perl6Untyped;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;

import static edument.perl6idea.parsing.Perl6TokenTypes.UNV_WHITE_SPACE;

public interface Perl6PsiElement extends NavigatablePsiElement {
    /* Name-manages the enclosing file name into a module name, if possible.
     * Returns null if that's not possible or this doesn't seem to be a module. */
    default String getEnclosingPerl6ModuleName() {
        // Make sure it's Raku module file, and trim the extension.
        VirtualFile file = getContainingFile().getVirtualFile();
        if (!(FileTypeManager.getInstance().getFileTypeByFile(file) instanceof Perl6ModuleFileType))
            return null;
        String path = file.getPath();
        String extension = file.getExtension();
        path = path.substring(0, path.length() - (extension == null ? 0 : extension.length() + 1));

        // Make sure it's within the project and trim the project path
        // off the start.
        String projectPath = getProject().getBasePath();
        if (projectPath == null)
            return null;
        if (!path.startsWith(projectPath))
            return null;
        path = path.substring(projectPath.length() + 1);

        // Mangle it, removing a leading lib:: since lib/ is the standard place
        // for libraries.
        String libraryName = path.replaceAll("[/\\\\]", "::");
        return StringUtil.trimStart(libraryName, "lib::");
    }

    default Perl6Symbol resolveLexicalSymbol(Perl6SymbolKind kind, String name) {
        Perl6SingleResolutionSymbolCollector collector = new Perl6SingleResolutionSymbolCollector(name, kind);
        applyLexicalSymbolCollector(collector);
        return collector.getResult();
    }

    @Nullable
    default List<Perl6Symbol> resolveLexicalSymbolAllowingMulti(Perl6SymbolKind kind, String name) {
        Perl6SingleResolutionSymbolCollector collector = new Perl6SingleResolutionSymbolCollector(name, kind);
        applyLexicalSymbolCollector(collector);
        List<Perl6Symbol> results = collector.getResults();
        return results.isEmpty() ? null : results;
    }

    default Collection<Perl6Symbol> getLexicalSymbolVariants(Perl6SymbolKind... kinds) {
        Perl6VariantsSymbolCollector collector = new Perl6VariantsSymbolCollector(kinds);
        applyLexicalSymbolCollector(collector);
        return collector.getVariants();
    }

    default void applyExternalSymbolCollector(Perl6SymbolCollector collector) {
        Perl6PsiScope scope = PsiTreeUtil.getParentOfType(this, Perl6PsiScope.class);
        while (scope != null) {
            // If we are at top level already, we need to contribute CORE external symbols too
            if (scope instanceof Perl6File)
                scope.contributeScopeSymbols(collector);

            Perl6StatementList list = PsiTreeUtil.findChildOfType(scope, Perl6StatementList.class);
            if (list == null) return;
            Perl6Statement[] stats = PsiTreeUtil.getChildrenOfType(list, Perl6Statement.class);
            // Just go one level up, skipping the for loop below
            if (stats == null) stats = new Perl6Statement[0];
            for (Perl6Statement statement : stats) {
                // Do not iterate further If we already passed current element
                if (statement.getTextOffset() > getTextOffset()) break;
                for (PsiElement maybeImport : statement.getChildren()) {
                    if (!(maybeImport instanceof Perl6UseStatement || maybeImport instanceof Perl6NeedStatement)) continue;
                    Perl6LexicalSymbolContributor cont = (Perl6LexicalSymbolContributor)maybeImport;
                    cont.contributeLexicalSymbols(collector);
                    if (collector.isSatisfied()) return;
                }
            }
            scope = PsiTreeUtil.getParentOfType(scope, Perl6PsiScope.class);
        }
    }

    default void applyLexicalSymbolCollector(Perl6SymbolCollector collector) {
        Perl6PsiScope scope = PsiTreeUtil.getParentOfType(this, Perl6PsiScope.class);
        while (scope != null) {
            for (Perl6LexicalSymbolContributor cont : scope.getSymbolContributors()) {
                cont.contributeLexicalSymbols(collector);
                if (collector.isSatisfied())
                    return;
            }
            scope.contributeScopeSymbols(collector);
            if (collector.isSatisfied())
                return;
            scope = PsiTreeUtil.getParentOfType(scope, Perl6PsiScope.class);
        }
    }

    @NotNull
    default Perl6Type inferType() {
        return Perl6Untyped.INSTANCE;
    }

    default Perl6PackageDecl getSelfType() {
        // There's only a self type if we're inside of a method or in the declaration of
        // an attribute.
        Perl6PsiElement current = this;
        boolean foundSelfProvider = false;
        while (current != null) {
            current = PsiTreeUtil.getParentOfType(current, Perl6RoutineDecl.class, Perl6RegexDecl.class, Perl6PackageDecl.class, Perl6VariableDecl.class);
            if (current instanceof Perl6PackageDecl)
                return foundSelfProvider ? (Perl6PackageDecl)current : null;
            if (foundSelfProvider)
                return null;
            if (current instanceof Perl6RoutineDecl) {
                String scope = ((Perl6RoutineDecl)current).getScope();
                if (scope.equals("has"))
                    foundSelfProvider = true;
            }
            else if (current instanceof Perl6RegexDecl) {
                String scope = ((Perl6RegexDecl)current).getScope();
                if (scope.equals("has"))
                    foundSelfProvider = true;
            }
            else if (current instanceof Perl6VariableDecl) {
                String scope = ((Perl6VariableDecl)current).getScope();
                if (scope.equals("has"))
                    foundSelfProvider = true;
            }
        }
        return null;
    }

    @Nullable
    default PsiElement skipWhitespacesBackward() {
        PsiElement temp = getPrevSibling();
        while (temp != null &&
               (temp instanceof PsiWhiteSpace ||
                temp.getNode().getElementType() == UNV_WHITE_SPACE))
            temp = temp.getPrevSibling();
        return temp;
    }

    @Nullable
    default PsiElement skipWhitespacesForward() {
        PsiElement temp = getNextSibling();
        while (temp != null &&
               (temp instanceof PsiWhiteSpace ||
                temp.getNode().getElementType() == UNV_WHITE_SPACE))
            temp = temp.getNextSibling();
        return temp;
    }

    default void collectPodAndDocumentables(PodDomBuildingContext context) {
        PsiElement child = getFirstChild();
        while (child != null) {
            if (child instanceof Perl6PsiElement)
                ((Perl6PsiElement)child).collectPodAndDocumentables(context);
            child = child.getNextSibling();
        }
    }

    @NotNull
    default EffectCollection inferEffects() {
        return EffectCollection.of(Effect.IMPURE);
    }
}
