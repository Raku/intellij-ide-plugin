package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.StubBasedPsiElementBase;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6ModuleName;
import edument.perl6idea.psi.Perl6NeedStatement;
import edument.perl6idea.psi.stub.Perl6NeedStatementStub;
import edument.perl6idea.psi.stub.Perl6NeedStatementStubElementType;
import edument.perl6idea.psi.stub.index.ProjectModulesStubIndex;
import edument.perl6idea.psi.symbols.Perl6Symbol;
import edument.perl6idea.psi.symbols.Perl6SymbolCollector;
import edument.perl6idea.sdk.Perl6SdkType;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Perl6NeedStatementImpl extends StubBasedPsiElementBase<Perl6NeedStatementStub> implements Perl6NeedStatement {
    public Perl6NeedStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    public Perl6NeedStatementImpl(Perl6NeedStatementStub stub, Perl6NeedStatementStubElementType type) {
        super(stub, type);
    }

    @Override
    public void contributeSymbols(Perl6SymbolCollector collector) {
        for (String name : getModuleNames()) {
            Project project = getProject();
            Collection<Perl6File> found = ProjectModulesStubIndex.getInstance()
                    .get(name, project, GlobalSearchScope.projectScope(project));
            if (found.size() > 0) {
                Perl6File file = found.iterator().next();
                Set<String> seen = new HashSet<>();
                seen.add(name);
                file.contributeGlobals(collector, seen);
            }
            else {
                for (Perl6Symbol sym : Perl6SdkType.getInstance().getNamesForNeed(project, name)) {
                    collector.offerSymbol(sym);
                    if (collector.isSatisfied())
                        return;
                }
            }
        }
    }

    @Override
    public List<String> getModuleNames() {
        List<String> result = new ArrayList<>();
        for (Perl6ModuleName moduleName : findChildrenByClass(Perl6ModuleName.class))
            result.add(moduleName.getText());
        return result;
    }

    public String toString() {
        return getClass().getSimpleName() + "(Perl6:NEED_STATEMENT)";
    }
}
