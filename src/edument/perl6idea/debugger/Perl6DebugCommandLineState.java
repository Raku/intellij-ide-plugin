package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.runners.ExecutionEnvironment;
import edument.perl6idea.run.Perl6RunCommandLineState;

import java.util.LinkedList;

public class Perl6DebugCommandLineState extends Perl6RunCommandLineState {
    public Perl6DebugCommandLineState(ExecutionEnvironment environment) throws ExecutionException {
        super(environment);
        this.command = new LinkedList<>();
        populateRunCommand();
    }

    private void populateRunCommand() {
        // TODO Remove hardcoded paths ASAP
        this.command.add("/home/koto/Work/CustomPerl6/MoarVM/install/bin/moar");
        this.command.add("--debug-port=9999");
        // TODO Make suspend on start is optional
        this.command.add("--debug-suspend");
        this.command.add("--libpath=/home/koto/Work/CustomPerl6/nqp/install/lib");
        this.command.add("/usr/share/nqp/lib/nqp.moarvm");
    }
}
