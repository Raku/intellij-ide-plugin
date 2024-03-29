package edument.perl6idea.psi.external;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.stubs.IStubElementType;
import edument.perl6idea.psi.Perl6Variable;
import edument.perl6idea.psi.Perl6VariableDecl;
import edument.perl6idea.psi.stub.Perl6VariableDeclStub;
import edument.perl6idea.psi.symbols.*;
import edument.perl6idea.psi.type.Perl6Type;
import edument.perl6idea.psi.type.Perl6UnresolvedType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExternalPerl6VariableDecl extends Perl6ExternalPsiElement implements Perl6VariableDecl {
    private final String myName;
    private final String myScope;
    private final String myType;

    public ExternalPerl6VariableDecl(Project project, PsiElement parent, String name, String scope, String type) {
        myProject = project;
        myParent = parent;
        myName = name;
        myScope = scope;
        myType = type;
    }

    @NotNull
    @Override
    public String getName() {
        return myName;
    }

    @Override
    public String[] getVariableNames() {
        return new String[]{getName()};
    }

    @Override
    public Perl6Variable[] getVariables() {
        return new Perl6Variable[0];
    }

    @Override
    public boolean hasInitializer() {
        return false;
    }

    @Nullable
    @Override
    public PsiElement getInitializer(Perl6Variable variable) {
        return null;
    }

    @Nullable
    @Override
    public PsiElement getInitializer() {
        return null;
    }

    @Override
    public void removeVariable(Perl6Variable variable) {

    }

    @Override
    public IStubElementType<?, ?> getElementType() {
        return null;
    }

    @Override
    public Perl6VariableDeclStub getStub() {
        return null;
    }

    @Override
    public @NotNull String getScope() {
        return myScope;
    }

    @Override
    public @NotNull Perl6Type inferType() {
        return new Perl6UnresolvedType(myType);
    }

    @Nullable
    @Override
    public PsiElement getNameIdentifier() {
        return null;
    }

    @Override
    public void contributeLexicalSymbols(Perl6SymbolCollector collector) {
        if (getScope().equals("has"))
            return;

        String name = getName();
        if (name.length() <= 1)
            return;

        // Our scoped term definitions are not yet implemented in rakudo
        collector.offerSymbol(new Perl6ExplicitSymbol(Perl6SymbolKind.Variable, this));
        if (collector.isSatisfied()) return;
        if (name.startsWith("&"))
            collector.offerSymbol(new Perl6ExplicitAliasedSymbol(Perl6SymbolKind.Routine,
                                                                 this, name.substring(1)));
    }

    @Override
    public void contributeMOPSymbols(Perl6SymbolCollector collector, MOPSymbolsAllowed symbolsAllowed) {
        if (!getScope().equals("has"))
            return;

        String name = getName();
        if (name.length() < 3)
            return;

        if (Perl6Variable.getTwigil(name) == '!' && symbolsAllowed.privateAttributesVisible) {
            collector.offerSymbol(new Perl6ExplicitSymbol(Perl6SymbolKind.Variable, this));
        } else if (Perl6Variable.getTwigil(name) == '.') {
            collector.offerSymbol(new Perl6ExplicitSymbol(Perl6SymbolKind.Variable, this));
            if (collector.isSatisfied()) return;
            if (symbolsAllowed.privateAttributesVisible) {
                collector.offerSymbol(new Perl6ExplicitAliasedSymbol(Perl6SymbolKind.Variable,
                                                                     this, name.charAt(0) + "!" + name.substring(2)));
                if (collector.isSatisfied()) return;
            }
            // Offer self.foo;
            collector.offerMultiSymbol(new Perl6ExplicitAliasedSymbol(
                Perl6SymbolKind.Method, this, '.' + name.substring(2)), false);
        }
    }
}
