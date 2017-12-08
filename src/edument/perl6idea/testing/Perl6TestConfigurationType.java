package edument.perl6idea.testing;

import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.ConfigurationTypeBase;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.extensions.Extensions;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import edument.perl6idea.Perl6Icons;
import edument.perl6idea.filetypes.Perl6TestFileType;
import org.jetbrains.annotations.NotNull;

public class Perl6TestConfigurationType extends ConfigurationTypeBase implements DumbAware {
    private static final String PERL6_TEST_CONFIGURATION_ID = "PERL6_TEST_CONFIGURATION";

    protected Perl6TestConfigurationType() {
        super(PERL6_TEST_CONFIGURATION_ID,
                "Perl 6 test",
                "Run Perl 6 tests",
                Perl6Icons.CAMELIA);
        addFactory(new Perl6TestConfigurationFactory(this));
    }

    @NotNull
    public static Perl6TestConfigurationType getInstance() {
        return Extensions.findExtension(CONFIGURATION_TYPE_EP, Perl6TestConfigurationType.class);
    }

    private class Perl6TestConfigurationFactory extends ConfigurationFactory {
        public Perl6TestConfigurationFactory(Perl6TestConfigurationType configurationType) {
            super(configurationType);
        }

        @NotNull
        @Override
        public RunConfiguration createTemplateConfiguration(@NotNull Project project) {
            return new Perl6TestRunConfiguration(project, this, "Perl 6 tests");
        }

        @Override
        public boolean isApplicable(@NotNull Project project) {
            return FileTypeIndex.containsFileOfType(Perl6TestFileType.INSTANCE,
                    GlobalSearchScope.projectScope(project));
        }
    }
}
