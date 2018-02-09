package edument.perl6idea.debugger;

import com.intellij.execution.ExecutionResult;
import com.intellij.execution.actions.StopProcessAction;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import edument.perl6idea.debugger.event.Perl6DebugEventBreakpointReached;
import edument.perl6idea.debugger.event.Perl6DebugEventBreakpointSet;
import edument.perl6idea.debugger.event.Perl6DebugEventStop;
import edument.perl6idea.run.Perl6RunConfiguration;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import org.edument.moarvm.DebugEvent;
import org.edument.moarvm.EventType;
import org.edument.moarvm.RemoteInstance;
import org.edument.moarvm.types.ExecutionStack;
import org.edument.moarvm.types.Kind;
import org.edument.moarvm.types.Lexical.*;
import org.edument.moarvm.types.StackFrame;
import org.edument.moarvm.types.event.BreakpointNotification;

import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Perl6DebugThread extends Thread {
    private static final Logger LOG = Logger.getInstance(Perl6DebugThread.class);
    private final XDebugSession mySession;
    private final ExecutionResult myExecutionResult;
    private RemoteInstance client;
    private static final Executor myExecutor = Executors.newSingleThreadExecutor();
    private final List<BreakpointActionRequest> breakpointQueue = new CopyOnWriteArrayList<>();
    private boolean ready = false;

    Perl6DebugThread(XDebugSession session, ExecutionResult result) {
        super("Perl6DebugThread");
        mySession = session;
        myExecutionResult = result;
    }

    @Override
    public void run() {
        try {
            Perl6RunConfiguration runConfiguration = (Perl6RunConfiguration) mySession.getRunProfile();
            client = RemoteInstance.connect(runConfiguration.getDebugPort()).get(2, TimeUnit.SECONDS);
            ready = true;
            sendBreakpoints();
            setEventHandler();
            client.resume().get(2, TimeUnit.SECONDS);
        } catch (CancellationException | InterruptedException | TimeoutException | ExecutionException e) {
            LOG.error(e);
        }
    }

    private void setEventHandler() {
        Subject<DebugEvent> events = client.getSubject();
        events.subscribeOn(Schedulers.newThread()).subscribe(event -> {
            if (event.getEventType() == EventType.BreakpointNotification) {
                Perl6DebugThread thread = this;
                Executors.newSingleThreadExecutor().execute(() -> {
                    BreakpointNotification bpn = (BreakpointNotification) event;
                    Perl6DebugEventBreakpointReached reachedEvent =
                            new Perl6DebugEventBreakpointReached(stackToFrames(bpn.getStack()),
                                    mySession, thread, bpn.getFile(), bpn.getLine());
                    myExecutor.execute(reachedEvent);
                });
            } else {
                System.out.println("Event + " + event.getClass().getName());
            }
        });
    }

    public void stopDebugThread() {
        StopProcessAction.stopProcess(myExecutionResult.getProcessHandler());
        ((ConsoleView)myExecutionResult.getExecutionConsole()).print("Disconnected\n", ConsoleViewContentType.SYSTEM_OUTPUT);
    }

    public void resumeExecution() {
        try {
            client.resume().get();
        } catch (CancellationException | InterruptedException | ExecutionException e) {
            LOG.error(e);
        }
    }

    public void pauseExecution() {
        try {
            client.suspend().get();
            ExecutionStack stack = client.threadStackTrace(1).get();
            Perl6DebugEventStop stopEvent =
                    new Perl6DebugEventStop(stackToFrames(stack), mySession, this);
            myExecutor.execute(stopEvent);
        } catch (CancellationException | InterruptedException | ExecutionException e) {
            LOG.error(e);
        }
    }

    private Perl6StackFrameDescriptor[] stackToFrames(ExecutionStack stack) {
        List<StackFrame> frames = stack.getFrames();
        Perl6StackFrameDescriptor[] result = new Perl6StackFrameDescriptor[frames.size()];
        for (int i = 0; i < frames.size(); i++) {
            StackFrame frame = frames.get(i);
            Perl6LoadedFileDescriptor fileDescriptor = new Perl6LoadedFileDescriptor(frame.getFile(), "");
            result[i] = new Perl6StackFrameDescriptor(fileDescriptor, frame);
            int finalI = i;
            client.contextHandle(1, i)
                    .thenApply(v -> client.contextLexicals(v).thenApply(lex -> {
                        result[finalI].setLexicals(convertLexicals(lex));
                        client.releaseHandle(new int[]{v});
                        return null;
                    }));
        }
        return result;
    }

    private Perl6ValueDescriptor[] convertLexicals(Map<String, Lexical> lex) {
        Perl6ValueDescriptor[] result = new Perl6ValueDescriptor[lex.size()];
        AtomicInteger i = new AtomicInteger();
        lex.forEach((k, v) -> {
            String value;
            String type;
            if (v.getKind() == Kind.INT) {
                type = "int";
                value = String.valueOf(((IntValue)v).getValue());
            } else if (v.getKind() == Kind.NUM) {
                type = "num";
                value = String.valueOf(((NumValue)v).getValue());
            } else if (v.getKind() == Kind.STR) {
                type = "str";
                value = String.valueOf(((StrValue)v).getValue());
            } else {
                type = "obj";
                value = "OBJECT";
            }
            result[i.get()] = new Perl6ValueDescriptor(k, type, value);
            i.getAndIncrement();
        });
        return result;
    }

    private void sendBreakpoints() {
        if (ready) {
            try {
                for (BreakpointActionRequest request : breakpointQueue) {
                    if (!request.isRemove) {
                        int realLine = client.setBreakpoint(request.file, request.line, true, true).get();
                        // TODO handle difference between real line
                        Perl6DebugEventBreakpointSet setEvent =
                                new Perl6DebugEventBreakpointSet(request.file, realLine);
                        setEvent.setDebugSession(mySession);
                        setEvent.setDebugThread(this);
                        myExecutor.execute(setEvent);
                    } else {
                        client.clearBreakpoint(request.file, request.line).get();
                    }
                }
            } catch (CancellationException | InterruptedException | ExecutionException e) {
                LOG.error(e);
            }
            breakpointQueue.clear();
        }
    }

    public void queueBreakpoint(XLineBreakpoint breakpoint, boolean isRemove) {
        breakpointQueue.add(new BreakpointActionRequest(isRemove, breakpoint));
        sendBreakpoints();
    }

    class BreakpointActionRequest {
        final boolean isRemove;
        final String file;
        final int line;

        BreakpointActionRequest(boolean isRemove, XLineBreakpoint bp) {
            this.isRemove = isRemove;
            this.file = bp.getFileUrl().substring(7);
            this.line = bp.getLine();
        }
    }
}