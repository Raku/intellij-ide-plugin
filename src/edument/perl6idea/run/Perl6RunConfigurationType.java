package edument.perl6idea.run;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationType;
import edument.perl6idea.Perl6Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Perl6RunConfigurationType implements ConfigurationType {
    @Override
    public String getDisplayName() {
        return "Perl 6";
    }

    @Override
    public String getConfigurationTypeDescription() {
        return "Run Perl 6 configuration";
    }

    @Override
    public Icon getIcon() {
        return Perl6Icons.CAMELIA;
    }

    @NotNull
    @Override
    public String getId() {
        return "PERL6_RUN_CONFIGURATION";
    }

    @Override
    public ConfigurationFactory[] getConfigurationFactories() {
        return new ConfigurationFactory[]{new Perl6ConfigurationFactory(this)};
    }
}
