package edument.perl6idea.structureView;

import com.intellij.ide.structureView.StructureViewModel;
import com.intellij.ide.structureView.StructureViewModelBase;
import com.intellij.ide.structureView.TreeBasedStructureViewBuilder;
import com.intellij.ide.util.treeView.smartTree.Sorter;
import com.intellij.openapi.editor.Editor;
import com.intellij.psi.PsiFile;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6PackageDecl;
import edument.perl6idea.psi.Perl6PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Perl6StructureViewBuilder extends TreeBasedStructureViewBuilder {
    private final PsiFile psiFile;

    public Perl6StructureViewBuilder(PsiFile psiFile) {
        this.psiFile = psiFile;
    }

    @NotNull
    @Override
    public StructureViewModel createStructureViewModel(@Nullable Editor editor) {
        return new StructureViewModelBase(psiFile, editor,
                    new Perl6StructureViewElement((Perl6PsiElement)psiFile))
                .withSorters(Sorter.ALPHA_SORTER)
                .withSuitableClasses(Perl6File.class, Perl6PackageDecl.class);
    }
}
