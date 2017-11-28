package edument.perl6idea.run;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.*;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Perl6RunConfiguration extends RunConfigurationBase {
    private static final String SCRIPT_PATH = "Script_path";
    private static final String SCRIPT_ARGS = "Script_args";

    private Project myProject;
    private String myScriptPath;
    private String myScriptArgs;

    protected Perl6RunConfiguration(@NotNull Project project, @NotNull ConfigurationFactory factory, String name) {
        super(project, factory, name);
        this.myProject = project;
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new Perl6SettingsEditor(myProject);
    }

    @Nullable
    @Override
    public RunProfileState getState(@NotNull Executor executor, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        return new Perl6CommandLineState(myProject, environment, myScriptPath, myScriptArgs);
    }

    String getMyScriptPath() {
        return myScriptPath;
    }

    void setMyScriptPath(String myScriptPath) {
        this.myScriptPath = myScriptPath;
    }

    String getMyScriptArgs() {
        return myScriptArgs;
    }

    void setMyScriptArgs(String myScriptArgs) {
        this.myScriptArgs = myScriptArgs;
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
}
