package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import edument.perl6idea.Perl6Language;
import edument.perl6idea.filetypes.Perl6ModuleFileType;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6PsiElement;
import edument.perl6idea.psi.Perl6StatementList;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Perl6FileImpl extends PsiFileBase implements Perl6File {

    public Perl6FileImpl(FileViewProvider viewProvider) {
        super(viewProvider, Perl6Language.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return Perl6ModuleFileType.INSTANCE;
    }

    @Override
    public List<Perl6PsiElement> getDeclarations() {
        Perl6StatementList statementList = findChildByClass(Perl6StatementList.class);
        return statementList != null
                ? statementList.getDeclarations()
                : new ArrayList<>();
    }
}
