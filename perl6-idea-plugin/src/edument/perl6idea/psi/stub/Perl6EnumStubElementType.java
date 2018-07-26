package edument.perl6idea.psi.stub;

import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import edument.perl6idea.Perl6Language;
import edument.perl6idea.psi.Perl6Enum;
import edument.perl6idea.psi.impl.Perl6EnumImpl;
import edument.perl6idea.psi.stub.impl.Perl6EnumStubImpl;
import edument.perl6idea.psi.stub.index.Perl6StubIndexKeys;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Perl6EnumStubElementType extends IStubElementType<Perl6EnumStub, Perl6Enum> {
    public Perl6EnumStubElementType() {
        super("ENUM", Perl6Language.INSTANCE);
    }

    @Override
    public Perl6Enum createPsi(@NotNull Perl6EnumStub stub) {
        return new Perl6EnumImpl(stub, this);
    }

    @NotNull
    @Override
    public Perl6EnumStub createStub(@NotNull Perl6Enum psi, StubElement parentStub) {
        return new Perl6EnumStubImpl(parentStub, psi.getEnumName(), psi.isExported());
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "perl6.stub.enum";
    }

    @Override
    public void serialize(@NotNull Perl6EnumStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getTypeName());
        dataStream.writeBoolean(stub.isExported());
    }

    @NotNull
    @Override
    public Perl6EnumStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef enumNameRef = dataStream.readName();
        boolean exported = dataStream.readBoolean();
        return new Perl6EnumStubImpl(parentStub, enumNameRef.getString(), exported);
    }

    @Override
    public void indexStub(@NotNull Perl6EnumStub stub, @NotNull IndexSink sink) {
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