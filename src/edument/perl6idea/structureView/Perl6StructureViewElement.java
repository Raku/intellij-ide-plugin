package edument.perl6idea.structureView;

import com.intellij.ide.structureView.StructureViewTreeElement;
import com.intellij.ide.util.treeView.smartTree.TreeElement;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import edument.perl6idea.Perl6Icons;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Perl6StructureViewElement implements StructureViewTreeElement {
    private final Perl6PsiElement element;

    public Perl6StructureViewElement(Perl6PsiElement element) {
        this.element = element;
    }

    @NotNull
    @Override
    public TreeElement[] getChildren() {
        return new TreeElement[0];
    }

    @NotNull
    @Override
    public ItemPresentation getPresentation() {
        if (element instanceof Perl6File) {
            return new ItemPresentation() {
                @Nullable
                @Override
                public String getPresentableText() {
                    return element.getContainingFile().getName();
                }

                @Nullable
                @Override
                public String getLocationString() {
                    return null;
                }

                @Nullable
                @Override
                public Icon getIcon(boolean b) {
                    return Perl6Icons.CAMELIA;
                }
            };
        }
        return null;
    }

    @Override
    public Perl6PsiElement getValue() {
        return element;
    }

    @Override
    public void navigate(boolean requestFocus) {
        element.navigate(requestFocus);
    }

    @Override
    public boolean canNavigate() {
        return element.canNavigate();
    }

    @Override
    public boolean canNavigateToSource() {
        return element.canNavigateToSource();
    }
}
