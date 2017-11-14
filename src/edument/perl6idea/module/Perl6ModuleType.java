package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.module.ModuleTypeManager;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import edument.perl6idea.Perl6Icons;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Perl6ModuleType extends ModuleType<Perl6ModuleBuilder> {
    private static final String ID = "PERL6_MODULE_TYPE";

    public Perl6ModuleType() {
        super(ID);
    }

    public static Perl6ModuleType getInstance() {
        return (Perl6ModuleType) ModuleTypeManager.getInstance().findByID(ID);
    }

    @NotNull
    @Override
    public Perl6ModuleBuilder createModuleBuilder() {
        return new Perl6ModuleBuilder();
    }

    @NotNull
    @Override
    public String getName() {
        return "Perl 6 Module Type";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Perl 6 Module Type";
    }

    @Override
    public Icon getNodeIcon(@Deprecated boolean b) {
        return Perl6Icons.CAMELIA;
    }

    @NotNull
    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull Perl6ModuleBuilder moduleBuilder, @NotNull ModulesProvider modulesProvider) {
        return super.createWizardSteps(wizardContext, moduleBuilder, modulesProvider);
    }
}
