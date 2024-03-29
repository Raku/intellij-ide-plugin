package edument.perl6idea.psi;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiNamedElement;
import com.intellij.psi.StubBasedPsiElement;
import edument.perl6idea.psi.stub.Perl6RoutineDeclStub;
import edument.perl6idea.psi.symbols.Perl6LexicalSymbolContributor;
import edument.perl6idea.psi.symbols.Perl6MOPSymbolContributor;
import org.jetbrains.annotations.NotNull;

public interface Perl6RoutineDecl extends Perl6PsiScope, Perl6PsiDeclaration,
                                          StubBasedPsiElement<Perl6RoutineDeclStub>,
                                          Perl6SignatureHolder, PsiNamedElement,
                                          P6Extractable, Perl6LexicalSymbolContributor,
                                          Perl6MOPSymbolContributor, Perl6Deprecatable {
    String getRoutineKind();
    String getRoutineName();
    boolean isPrivate();
    boolean isStubbed();
    @NotNull
    PsiElement[] getContent();
    Perl6Parameter[] getParams();
    PsiElement getDeclaratorNode();

    boolean isMethod();
    boolean isSub();
    boolean isPure();
}
