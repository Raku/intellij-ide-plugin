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

    private void populateRunCommand() throws ExecutionException {
        String moar_path = System.getenv("DEBUG_MOAR_PATH");
        String libpath =  System.getenv("DEBUG_LIBPATH_BASE_PATH");
        String runtime = System.getenv("DEBUG_RUNTIME_PATH");
        if (moar_path == null || libpath == null || runtime == null) {
            System.out.println("Variables DEBUG_MOAR_PATH, DEBUG_LIBPATH_PATH and DEBUG_NQP_PATH must be set!");
            throw new ExecutionException("Variables DEBUG_MOAR_PATH, DEBUG_LIBPATH_PATH and DEBUG_NQP_PATH must be set!");
        }
        this.command.add(moar_path);
        this.command.add("--debug-port=" + runConfiguration.getDebugPort());
        this.command.add("--debug-suspend");
        this.command.add("--libpath=" + libpath + "nqp/lib");
        this.command.add("--libpath=" + libpath + "perl6/runtime");
        this.command.add(runtime);
    }
}