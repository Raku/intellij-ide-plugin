package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.ModifiableRootModel;
import edument.perl6idea.sdk.Perl6SdkType;
import org.jetbrains.annotations.NotNull;

public class Perl6ModuleBuilder extends ModuleBuilder {
    private Sdk sdk;

    @Override
    public void setupRootModel(ModifiableRootModel model) throws ConfigurationException {
        if (myJdk != null) {
            model.setSdk(myJdk);
        }
        else {
            model.inheritSdk();
        }
        doAddContentEntry(model);
    }

    @NotNull
    @Override
    public ModuleType getModuleType() {
        return Perl6ModuleType.getInstance();
    }

    @Override
    public boolean isSuitableSdkType(SdkTypeId sdk) {
        return sdk == Perl6SdkType.getInstance();
    }

    @Override
    public String getGroupName() {
        return "Perl 6";
    }
}
