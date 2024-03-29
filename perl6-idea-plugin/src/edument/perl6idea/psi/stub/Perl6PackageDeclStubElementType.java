package edument.perl6idea.psi.stub;

import com.intellij.lang.ASTNode;
import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import edument.perl6idea.Perl6Language;
import edument.perl6idea.psi.Perl6PackageDecl;
import edument.perl6idea.psi.impl.Perl6PackageDeclImpl;
import edument.perl6idea.psi.stub.impl.Perl6PackageDeclStubImpl;
import edument.perl6idea.psi.stub.index.Perl6StubIndexKeys;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Perl6PackageDeclStubElementType extends IStubElementType<Perl6PackageDeclStub, Perl6PackageDecl> {
    public Perl6PackageDeclStubElementType() {
        super("PACKAGE_DECLARATION", Perl6Language.INSTANCE);
    }

    @Override
    public boolean shouldCreateStub(ASTNode node) {
        return ((Perl6PackageDecl)node.getPsi()).getPackageName() != null;
    }

    @Override
    public Perl6PackageDecl createPsi(@NotNull Perl6PackageDeclStub stub) {
        return new Perl6PackageDeclImpl(stub, this);
    }

    @NotNull
    @Override
    public Perl6PackageDeclStub createStub(@NotNull Perl6PackageDecl psi, StubElement parentStub) {
        return new Perl6PackageDeclStubImpl(parentStub, psi.getPackageKind(), psi.getPackageName(), psi.isExported());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "perl6.stub.packageDeclaration";
    }

    @Override
    public void serialize(@NotNull Perl6PackageDeclStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getPackageKind());
        dataStream.writeName(stub.getTypeName());
        dataStream.writeBoolean(stub.isExported());
    }

    @NotNull
    @Override
    public Perl6PackageDeclStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef packageKindRef = dataStream.readName();
        StringRef packageNameRef = dataStream.readName();
        boolean exported = dataStream.readBoolean();
        return new Perl6PackageDeclStubImpl(parentStub, packageKindRef.getString(), packageNameRef.getString(), exported);
    }

    @Override
    public void indexStub(@NotNull Perl6PackageDeclStub stub, @NotNull IndexSink sink) {
        String globalName = stub.getGlobalName();
        if (globalName != null) {
            sink.occurrence(Perl6StubIndexKeys.GLOBAL_TYPES, globalName);
        }
        else {
            String lexicalName = stub.getLexicalName();
            if (lexicalName != null)
                sink.occurrence(Perl6StubIndexKeys.LEXICAL_TYPES, lexicalName);
        }
    }
}
