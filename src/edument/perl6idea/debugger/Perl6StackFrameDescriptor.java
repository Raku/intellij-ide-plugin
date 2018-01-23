package edument.perl6idea.debugger;

public class Perl6StackFrameDescriptor {
    private Perl6LoadedFileDescriptor file;
    private String bytecodeFile;
    private int line;
    private Perl6ValueDescriptor[] lexicals;
    private Perl6ValueDescriptor[] globals;
    private Perl6ValueDescriptor[] args;

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

    public Perl6ValueDescriptor[] getGlobals() {
        return globals;
    }

    public Perl6ValueDescriptor[] getArgs() {
        return args;
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
