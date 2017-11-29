package edument.perl6idea.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.KillableColoredProcessHandler;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessTerminatedListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.roots.ProjectRootManager;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Perl6CommandLineState extends CommandLineState {
    private List<String> command;

    protected Perl6CommandLineState(Project project, ExecutionEnvironment environment, String script, String args) {
        super(environment);
        this.command = new LinkedList<>();
        Sdk projectSdk = ProjectRootManager.getInstance(project).getProjectSdk();
        assert projectSdk != null;
        String path = projectSdk.getHomePath();
        assert path != null;
        this.command.add(Paths.get(path, "perl6").toAbsolutePath().toString());
        this.command.add(script);
        // To avoid a call like `perl6 script.p6 ""`
        if (StringUtils.isNotBlank(args)) {
            this.command.addAll(Arrays.asList(args.split(" ")));
        }
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        GeneralCommandLine cmd = new GeneralCommandLine(command);
        KillableColoredProcessHandler handler = new KillableColoredProcessHandler(cmd, true);
        ProcessTerminatedListener.attach(handler);
        return handler;
    }
}
