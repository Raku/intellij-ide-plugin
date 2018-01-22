package edument.perl6idea.run;

import com.intellij.execution.CommonProgramRunConfigurationParameters;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.executors.DefaultDebugExecutor;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import edument.perl6idea.debugger.Perl6DebugCommandLineState;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Perl6RunConfiguration extends LocatableConfigurationBase implements CommonProgramRunConfigurationParameters {
    private static final String SCRIPT_PATH = "Script_path";
    private static final String SCRIPT_ARGS = "Script_args";

    private String myScriptPath;
    private String myScriptArgs;
    private String myWorkingDirectory;
    private Map<String, String> myEnvs = new HashMap<>();
    private boolean myPassParentEnvs;

    Perl6RunConfiguration(@NotNull Project project, @NotNull ConfigurationFactory factory, String name) {
        super(project, factory, name);
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new Perl6RunSettingsEditor(getProject());
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        if (executor instanceof DefaultDebugExecutor) {
            return new Perl6DebugCommandLineState(environment);
        }
        return new Perl6RunCommandLineState(environment);
    }

    @Override
    public String suggestedName() {
        VirtualFile script = LocalFileSystem.getInstance().findFileByPath(getMyScriptPath());
        return script == null ? null : script.getName();
    }

    String getMyScriptPath() {
        return myScriptPath;
    }

    void setMyScriptPath(String myScriptPath) {
        this.myScriptPath = myScriptPath;
    }

    @Override
    public void readExternal(Element element) throws InvalidDataException {
        super.readExternal(element);
        Element path = element.getChild(SCRIPT_PATH);
        Element args = element.getChild(SCRIPT_ARGS);
        if (path == null || args == null) {
            throw new InvalidDataException();
        } else {
            myScriptPath = path.getText();
            myScriptArgs = args.getText();
        }
    }

    @Override
    public void writeExternal(Element element) throws WriteExternalException {
        super.writeExternal(element);
        Element path = new Element(SCRIPT_PATH);
        path.setText(myScriptPath);
        Element args = new Element(SCRIPT_ARGS);
        args.setText(myScriptArgs);
        element.addContent(path);
        element.addContent(args);
    }

    @Override
    public void checkConfiguration() throws RuntimeConfigurationException {
        Path path = Paths.get(myScriptPath);
        if (!(Files.exists(path))) {
            throw new RuntimeConfigurationError("Path to main script must be specified");
        }
    }

    @Override
    public void setProgramParameters(@Nullable String value) {
        myScriptArgs = value;
    }

    @Nullable
    @Override
    public String getProgramParameters() {
        return myScriptArgs;
    }

    @Override
    public void setWorkingDirectory(@Nullable String value) {
        myWorkingDirectory = value;
    }

    @Nullable
    @Override
    public String getWorkingDirectory() {
        return myWorkingDirectory;
    }

    @Override
    public void setEnvs(@NotNull Map<String, String> envs) {
        myEnvs = envs;
    }

    @NotNull
    @Override
    public Map<String, String> getEnvs() {
        return myEnvs;
    }

    @Override
    public void setPassParentEnvs(boolean passParentEnvs) {
        myPassParentEnvs = passParentEnvs;
    }

    @Override
    public boolean isPassParentEnvs() {
        return myPassParentEnvs;
    }
}
