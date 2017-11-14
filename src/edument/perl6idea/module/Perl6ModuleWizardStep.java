package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;

import javax.swing.*;

public class Perl6ModuleWizardStep extends ModuleWizardStep {
    @Override
    public JComponent getComponent() {
        return new JLabel("Perl 6 step");
    }

    @Override
    public void updateDataModel() {
        // Update model according to UI
    }
}
