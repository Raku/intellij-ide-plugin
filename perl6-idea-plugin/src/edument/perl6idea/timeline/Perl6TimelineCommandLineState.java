package edument.perl6idea.timeline;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.runners.ExecutionEnvironment;
import edument.perl6idea.run.Perl6RunCommandLineState;
import edument.perl6idea.run.Perl6RunConfiguration;
import edument.perl6idea.timeline.client.TimelineClient;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.net.ServerSocket;

public class Perl6TimelineCommandLineState extends Perl6RunCommandLineState {
    private int port;

    private TimelineClient timelineClient;

    public Perl6TimelineCommandLineState(ExecutionEnvironment environment) {
        super(environment);
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        try (ServerSocket socket = new ServerSocket(0)) {
            port = socket.getLocalPort();
        }
        catch (IOException e) {
            throw new ExecutionException("Could not find a free port for timeline server: " + e.getMessage());
        }
        ProcessHandler handler = super.startProcess();
        timelineClient = new TimelineClient("127.0.0.1", port);
        return handler;
    }

    @Override
    protected void setEnvironment(GeneralCommandLine cmd) {
        super.setEnvironment(cmd);
        cmd.withEnvironment("LOG_TIMELINE_SERVER", "127.0.0.1:" + port);
        if (runConfiguration instanceof Perl6RunConfiguration) {
            String allowedEvents = ((Perl6RunConfiguration)runConfiguration).getLogTimelineEvents();
            if (!allowedEvents.isEmpty()) {
                cmd.withEnvironment("LOG_TIMELINE_RAKU_EVENTS", allowedEvents);
            }
        }
    }

    @Override
    protected void populateRunCommand() throws ExecutionException {
        command.add("-MLog::Timeline");
        super.populateRunCommand();
    }

    public TimelineClient getTimelineClient() {
        return timelineClient;
    }
}
