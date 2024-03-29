package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiReference;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.psi.*;
import edument.perl6idea.psi.symbols.MOPSymbolsAllowed;
import edument.perl6idea.psi.symbols.Perl6SymbolCollector;
import org.jetbrains.annotations.NotNull;

public class Perl6AlsoImpl extends ASTWrapperPsiElement implements Perl6Also {
    public Perl6AlsoImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public void contributeMOPSymbols(Perl6SymbolCollector collector, MOPSymbolsAllowed symbolsAllowed) {
        Perl6Trait trait = getTrait();
        if (trait == null) return;

        String mod = trait.getTraitModifier();
        if (mod.equals("is") || mod.equals("does")) {
            PsiElement typeName = getTypeName();
            if (typeName == null) return;
            PsiReference ref = typeName.getReference();
            if (ref == null) return;
            PsiElement resolve = ref.resolve();
            if (resolve == null) return;
            if (!(resolve instanceof Perl6PackageDecl)) return;
            ((Perl6PackageDecl)resolve).contributeMOPSymbols(collector,
                    mod.equals("does") ? symbolsAllowed.does() : symbolsAllowed.is());
        }
    }

    @Override
    public Perl6Trait getTrait() {
        return PsiTreeUtil.findChildOfType(this, Perl6Trait.class);
    }

    private PsiElement getTypeName() {
        Perl6Trait trait = getTrait();
        if (trait == null) return null;
        return trait.getTraitModifier().equals("does") ?
               PsiTreeUtil.findChildOfType(this, Perl6TypeName.class) :
               PsiTreeUtil.findChildOfType(this, Perl6IsTraitName.class);
    }
}
