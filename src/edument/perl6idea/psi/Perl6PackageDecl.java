package edument.perl6idea.psi;

public interface Perl6PackageDecl extends Perl6PsiElement, Perl6PsiDeclarationHolder {
    public String getPackageKind();
    public String getPackageName();
}
