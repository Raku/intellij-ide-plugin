package edument.perl6idea.psi;

public interface Perl6PackageDecl extends Perl6PsiElement, Perl6PsiDeclarationHolder {
    String getPackageKind();
    String getPackageName();
}
