package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionResult;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ui.ExecutionConsole;
import com.intellij.xdebugger.XDebugProcess;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.breakpoints.XBreakpointHandler;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import com.intellij.xdebugger.frame.XExecutionStack;
import com.intellij.xdebugger.frame.XSuspendContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class Perl6XDebugProcess extends XDebugProcess {
    private final ExecutionResult myExecutionResult;
    private final Perl6DebugThread myDebugThread;

    Perl6XDebugProcess(XDebugSession session, ExecutionResult result) {
        super(session);
        myExecutionResult = result;
        myDebugThread = new Perl6DebugThread(session, result);
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

    @Override
    public XBreakpointHandler<?> @NotNull [] getBreakpointHandlers() {
        return new XBreakpointHandler[]{new Perl6BreakpointHandler(myDebugThread)};
    }

    @Override
    public void startPausing() {
        myDebugThread.pauseExecution();
    }

    @Override
    public void startStepOver(@Nullable XSuspendContext context) {
        myDebugThread.stepOver(getActiveThreadId(context));
    }

    @Override
    public void startStepInto(@Nullable XSuspendContext context) {
        myDebugThread.stepInto(getActiveThreadId(context));
    }

    @Override
    public void startStepOut(@Nullable XSuspendContext context) {
        myDebugThread.stepOut(getActiveThreadId(context));
    }

    private static int getActiveThreadId(@Nullable XSuspendContext context) {
        if (context == null)
            return 1;
        XExecutionStack stack = context.getActiveExecutionStack();
        int threadId = 1;
        if (stack instanceof Perl6ExecutionStack)
            threadId = ((Perl6ExecutionStack)stack).getThreadId();
        return threadId;
    }

    @Override
    public void resume(@Nullable XSuspendContext context) {
        myDebugThread.resumeExecution();
    }

    @Override
    public void stop() {
        myDebugThread.stopDebugThread();
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
