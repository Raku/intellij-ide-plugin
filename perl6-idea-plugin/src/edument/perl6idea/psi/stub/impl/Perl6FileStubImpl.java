package edument.perl6idea.psi.stub.impl;

import com.intellij.psi.stubs.PsiFileStubImpl;
import com.intellij.psi.stubs.Stub;
import com.intellij.psi.tree.IStubFileElementType;
import edument.perl6idea.parsing.Perl6ElementTypes;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6PsiDeclaration;
import edument.perl6idea.psi.stub.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Perl6FileStubImpl extends PsiFileStubImpl<Perl6File> implements Perl6FileStub {
    private final String compilationUnitName;

    public Perl6FileStubImpl(Perl6File file, String compilationUnitName) {
        super(file);
        this.compilationUnitName = compilationUnitName;
    }

    @NotNull
    @Override
    public IStubFileElementType<?> getType() {
        return Perl6ElementTypes.FILE;
    }

    @Override
    public String getCompilationUnitName() {
        return compilationUnitName;
    }

    @Override
    public List<Perl6PsiDeclaration> getExports() {
        List<Perl6PsiDeclaration> exports = new ArrayList<>();
        List<Stub> toTry = new ArrayList<>();
        toTry.add(this);
        while (!toTry.isEmpty()) {
            Stub current = toTry.remove(0);
            for (Stub child : current.getChildrenStubs()) {
                if (child instanceof Perl6DeclStub<?> declStub) {
                    if (declStub.isExported())
                        exports.add(declStub.getPsi());
                }
                toTry.add(child);
            }
        }
        return exports;
    }
}
