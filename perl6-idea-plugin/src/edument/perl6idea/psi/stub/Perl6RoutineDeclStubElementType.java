package edument.perl6idea.psi.stub;

import com.intellij.psi.stubs.*;
import com.intellij.util.io.StringRef;
import edument.perl6idea.Perl6Language;
import edument.perl6idea.psi.Perl6RoutineDecl;
import edument.perl6idea.psi.impl.Perl6RoutineDeclImpl;
import edument.perl6idea.psi.stub.impl.Perl6RoutineDeclStubImpl;
import edument.perl6idea.psi.stub.index.Perl6StubIndexKeys;
import edument.perl6idea.psi.type.Perl6Type;
import edument.perl6idea.psi.type.Perl6Untyped;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class Perl6RoutineDeclStubElementType extends IStubElementType<Perl6RoutineDeclStub, Perl6RoutineDecl> {
    public Perl6RoutineDeclStubElementType() {
        super("ROUTINE_DECLARATION", Perl6Language.INSTANCE);
    }

    @Override
    public Perl6RoutineDecl createPsi(@NotNull Perl6RoutineDeclStub stub) {
        return new Perl6RoutineDeclImpl(stub, this);
    }

    @NotNull
    @Override
    public Perl6RoutineDeclStub createStub(@NotNull Perl6RoutineDecl psi, StubElement parentStub) {
        Perl6Type returnType = psi.getReturnType();
        String returnTypeName = returnType instanceof Perl6Untyped ? "" : returnType.getName();
        return new Perl6RoutineDeclStubImpl(parentStub, psi.getRoutineName(), psi.getRoutineKind(),
                                            psi.isPrivate(), psi.isExported(), psi.getMultiness(), returnTypeName);
    }

    @NotNull
    @Override
    public String getExternalId() {
        return "perl6.stub.routineDeclaration";
    }

    @Override
    public void serialize(@NotNull Perl6RoutineDeclStub stub, @NotNull StubOutputStream dataStream) throws IOException {
        dataStream.writeName(stub.getRoutineName());
        dataStream.writeName(stub.getRoutineKind());
        dataStream.writeBoolean(stub.isPrivate());
        dataStream.writeBoolean(stub.isExported());
        dataStream.writeName(stub.getMultiness());
        dataStream.writeName(stub.getReturnType());
    }

    @NotNull
    @Override
    public Perl6RoutineDeclStub deserialize(@NotNull StubInputStream dataStream, StubElement parentStub) throws IOException {
        StringRef routineNameRef = dataStream.readName();
        StringRef routineKindRef = dataStream.readName();
        boolean isPrivate = dataStream.readBoolean();
        boolean exported = dataStream.readBoolean();
        StringRef multiness = dataStream.readName();
        StringRef returnType = dataStream.readName();
        assert routineNameRef != null && routineKindRef != null && multiness != null;
        return new Perl6RoutineDeclStubImpl(parentStub, routineNameRef.getString(), routineKindRef.getString(), isPrivate,
                                            exported, multiness.getString(), returnType == null ? null : returnType.getString());
    }

    @Override
    public void indexStub(@NotNull Perl6RoutineDeclStub stub, @NotNull IndexSink sink) {
        sink.occurrence(Perl6StubIndexKeys.ALL_ROUTINES, stub.getRoutineName());
    }
}
