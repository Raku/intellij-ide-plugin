package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionResult;
import com.intellij.execution.actions.StopProcessAction;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.xdebugger.XDebugSession;
import org.edument.moarvm.RemoteInstance;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Perl6DebugThread extends Thread {
    private final XDebugSession mySession;
    private final Perl6DebugCommandLineState myDebugProfileState;
    private final ExecutionResult myExecutionResult;
    private RemoteInstance client;

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
        } finally {
            System.out.println("End");
        }
    }

    public void stopDebug() {
        StopProcessAction.stopProcess(myExecutionResult.getProcessHandler());;
        ((ConsoleView)myExecutionResult.getExecutionConsole()).print("Disconnected\n", ConsoleViewContentType.SYSTEM_OUTPUT);
    }

    public void sendCommand(String command) throws ExecutionException, InterruptedException {
        if (command.equals("pause")) {
            client.suspend().get();
        } else if (command.equals("resume")) {
            client.resume().get();
        }
    }
}
