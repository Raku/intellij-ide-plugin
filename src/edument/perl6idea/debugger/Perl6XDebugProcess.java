package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionResult;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.breakpoints.XBreakpointHandler;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import com.intellij.xdebugger.frame.XSuspendContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.ExecutionException;

public class Perl6XDebugProcess extends XDebugProcess {
    private final ExecutionResult myExecutionResult;
    private final Perl6DebugThread myDebugThread;
    private final Perl6DebugCommandLineState myDebugProfileState;

    public Perl6XDebugProcess(XDebugSession session, Perl6DebugCommandLineState state, ExecutionResult result) {
        super(session);
        myExecutionResult = result;
        myDebugThread = new Perl6DebugThread(session, state, result);
        myDebugProfileState = state;
        myDebugThread.start();
    }

    @NotNull
    @Override
    public XDebuggerEditorsProvider getEditorsProvider() {
        return Perl6DebuggerEditorsProvider.INSTANCE;
    }

    @Override
    public boolean checkCanInitBreakpoints() {
        return true;
    }

    @NotNull
    @Override
    public XBreakpointHandler<?>[] getBreakpointHandlers() {
        return new XBreakpointHandler[]{}; // LineBreakpointHandler
    }

    @Override
    public void startPausing() {
        try {
            System.out.println("Pause");
            myDebugThread.sendCommand("pause");
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void resume(@Nullable XSuspendContext context) {
        try {
            System.out.println("Resume");
            myDebugThread.sendCommand("resume");
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void stop() {
        System.out.println("Stop");
        myDebugThread.stopDebug();
    }

    @Nullable
    @Override
    protected ProcessHandler doGetProcessHandler() {
        return myExecutionResult.getProcessHandler();
    }

    @NotNull
    @Override
    public ExecutionConsole createConsole() {
        return myExecutionResult.getExecutionConsole();
    }
}
