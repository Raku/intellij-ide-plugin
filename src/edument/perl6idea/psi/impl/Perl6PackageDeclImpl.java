package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import edument.perl6idea.parsing.Perl6TokenTypes;
import edument.perl6idea.psi.Perl6Block;
import edument.perl6idea.psi.Perl6PackageDecl;
import edument.perl6idea.psi.Perl6PsiElement;
import edument.perl6idea.psi.Perl6StatementList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Perl6PackageDeclImpl extends ASTWrapperPsiElement implements Perl6PackageDecl {
    public Perl6PackageDeclImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        Perl6Block block = findChildByClass(Perl6Block.class);
        Perl6StatementList list = null;
        if (block == null)
            list = findChildByClass(Perl6StatementList.class);
        return block != null
                ? block.getDeclarations()
                : list != null ? list.getDeclarations()
                : new ArrayList<>();
    }

    @Override
    public String getPackageKind() {
        PsiElement declarator = findChildByType(Perl6TokenTypes.PACKAGE_DECLARATOR);
        return declarator == null ? "package" : declarator.getText();
    }

    @Override
    public String getPackageName() {
        PsiElement name = findChildByType(Perl6TokenTypes.NAME);
        return name == null ? "<anon>" : name.getText();
    }
}
