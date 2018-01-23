package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionResult;
import com.intellij.execution.actions.StopProcessAction;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.xdebugger.XDebugSession;
import edument.perl6idea.debugger.event.Perl6DebugEventStop;
import org.edument.moarvm.RemoteInstance;
import org.edument.moarvm.types.ExecutionStack;
import org.edument.moarvm.types.StackFrame;

import java.util.List;
import java.util.concurrent.*;

public class Perl6DebugThread extends Thread {
    private final XDebugSession mySession;
    private final Perl6DebugCommandLineState myDebugProfileState;
    private final ExecutionResult myExecutionResult;
    private RemoteInstance client;
    private static Executor myExecutor = Executors.newSingleThreadExecutor();

    Perl6DebugThread(XDebugSession session, Perl6DebugCommandLineState state,
                     ExecutionResult result) {
        super("Perl6DebugThread");
        mySession = session;
        myDebugProfileState = state;
        myExecutionResult = result;
    }

    @Override
    public void run() {
        try {
            int debugPort = 9999;
            client = RemoteInstance.connect(debugPort).get(2, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public void stopDebug() {
        StopProcessAction.stopProcess(myExecutionResult.getProcessHandler());;
        ((ConsoleView)myExecutionResult.getExecutionConsole()).print("Disconnected\n", ConsoleViewContentType.SYSTEM_OUTPUT);
    }

    public void sendCommand(String command) throws ExecutionException, InterruptedException {
        if (command.equals("pause")) {
            client.suspend().get();
            ExecutionStack stack = client.threadStackTrace(1).get();
            Perl6DebugEventStop stopEvent = new Perl6DebugEventStop();
            stopEvent.setDebugSession(mySession);
            stopEvent.setDebugThread(this);
            stopEvent.setFrames(transformStack(stack));
            myExecutor.execute(stopEvent);
        } else if (command.equals("resume")) {
            client.resume().get();
        }
    }

    private Perl6StackFrameDescriptor[] transformStack(ExecutionStack stack) {
        List<StackFrame> frames = stack.getFrames();
        Perl6StackFrameDescriptor[] result = new Perl6StackFrameDescriptor[frames.size()];
        for (int i = 0; i < frames.size(); i++) {
            StackFrame frame = frames.get(i);
            Perl6LoadedFileDescriptor fileDescriptor = new Perl6LoadedFileDescriptor(frame.getFile(), "");
            result[i] = new Perl6StackFrameDescriptor(fileDescriptor, frame.getBytecode_file(), frame.getLine());
        }
        return result;
    }
}
