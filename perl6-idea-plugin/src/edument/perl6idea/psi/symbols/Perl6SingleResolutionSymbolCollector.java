package edument.perl6idea.psi.symbols;

import com.intellij.codeInsight.PsiEquivalenceUtil;
import edument.perl6idea.psi.Perl6PackageDecl;

import java.util.*;

public class Perl6SingleResolutionSymbolCollector implements Perl6SymbolCollector {
    private final Set<String> traversedNames = new HashSet<>();
    private final List<Perl6Symbol> results = new ArrayList<>();
    private final String wantedName;
    private final Perl6SymbolKind wantedKind;
    private boolean satisfied = false;
    private boolean wasDeferred = false;

    public Perl6SingleResolutionSymbolCollector(String wantedName, Perl6SymbolKind wantedKind) {
        this.wantedName = wantedName;
        this.wantedKind = wantedKind;
    }

    @Override
    public boolean shouldTraverse(String packageName) {
        return traversedNames.add(packageName);
    }

    @Override
    public void offerSymbol(Perl6Symbol symbol) {
        // If already satisfied, then we're done.
        if (satisfied)
            return;

        // Otherwise, see if it matches.
        if (symbol != null &&
                Objects.equals(symbol.getKind(), wantedKind) &&
                Objects.equals(symbol.getName(), wantedName)) {
            if (wantedKind == Perl6SymbolKind.TypeOrConstant && symbol.getPsi() instanceof Perl6PackageDecl &&
                ((Perl6PackageDecl)symbol.getPsi()).isStubbed()) {
                wasDeferred = true;
                return;
            }
            // If we've already got results, then they were multi results. We're now seeing an
            // only result, so we'll drop it and be satisfied.
            if (symbol instanceof Perl6ExplicitSymbol)
                ((Perl6ExplicitSymbol)symbol).setDeferrence(wasDeferred);
            if (results.isEmpty())
                results.add(symbol);
            satisfied = true;
        }
    }

    @Override
    public void offerMultiSymbol(Perl6Symbol symbol, boolean isProto) {
        // If already satisfied, then we're done.
        if (satisfied)
            return;

        // If we've already got results, then they were multi results. If we now see a
        // proto, then it's probably outer or parent to what we did see, so don't take
        // any more.
        if (isProto && !results.isEmpty()) {
            satisfied = true;
            return;
        }

        // Otherwise, add it if it matches, but don't set "satisfied" so we can collect
        // more.
        if (symbol != null &&
            Objects.equals(symbol.getKind(), wantedKind) &&
            Objects.equals(symbol.getName(), wantedName)) {
            if (symbol.getPsi() != null &&
                results.stream().anyMatch(r -> PsiEquivalenceUtil.areElementsEquivalent(r.getPsi(), symbol.getPsi())))
                return;
            results.add(symbol);
        }
    }

    @Override
    public boolean isSatisfied() {
        return satisfied;
    }

    public Perl6Symbol getResult() {
        return results.isEmpty() ? null : results.get(0);
    }

    public List<Perl6Symbol> getResults() {
        return results;
    }

    // We do not consider e.g. signature matching when doing a resolution,
    // so priority concept does not work here
    @Override
    public void decreasePriority() {}
}
