package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.SdkSettingsStep;
import com.intellij.ide.util.projectWizard.SettingsStep;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.util.Condition;
import org.jetbrains.annotations.NotNull;

public class Perl6SettingsStep extends SdkSettingsStep {
    public Perl6SettingsStep(@NotNull SettingsStep step, @NotNull ModuleBuilder builder, @NotNull Condition<SdkTypeId> filter) {
        super(step, builder, filter);
    }

    @Override
    public void updateDataModel() {
        super.updateDataModel();
    }
}
