package edument.perl6idea.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class Perl6ConfigurationFactory extends ConfigurationFactory {
    private static final String FACTORY_NAME = "Perl 6 configuration factory";

    protected Perl6ConfigurationFactory(@NotNull ConfigurationType type) {
        super(type);
    }

    @NotNull
    @Override
    public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
        return new Perl6RunConfiguration(project, this,  "Perl 6");
    }

    public static String getFactoryName() {
        return FACTORY_NAME;
    }
}
