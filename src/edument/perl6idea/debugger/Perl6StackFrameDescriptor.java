package edument.perl6idea.debugger;

public class Perl6StackFrameDescriptor {
    private Perl6LoadedFileDescriptor file;
    private String bytecodeFile;
    private int line;
    private Perl6ValueDescriptor[] lexicals;

    Perl6StackFrameDescriptor(Perl6LoadedFileDescriptor descriptor, String bytecodeFile, int line) {
        this.file = descriptor;
        this.bytecodeFile = bytecodeFile;
        this.line = line;
    }

    public Perl6LoadedFileDescriptor getFile() {
        return file;
    }

    public Perl6ValueDescriptor[] getLexicals() {
        return lexicals;
    }

    public void setLexicals(Perl6ValueDescriptor[] lexicals) {
        this.lexicals = lexicals;
    }

    public String getPresentableName() {
        if (!file.getPath().equals("")) {
            return file.getPath() + ":" + line;
        } else {
            return bytecodeFile + ":" + line;
        }
    }

    public int getLine() {
        return line;
    }
}
