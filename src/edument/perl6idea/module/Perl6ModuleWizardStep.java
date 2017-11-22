package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.ui.components.JBPanel;
import com.intellij.ui.components.JBTextField;
import edument.perl6idea.utils.Perl6ProjectType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

class Perl6ModuleWizardStep extends ModuleWizardStep {
    private final Perl6ModuleBuilder builder;
    private JPanel myMainPanel;
    private JTextField myScriptName;
    private JTextField myModuleName;
    private JTextField myEntryName;
    private Perl6ProjectType currentType;

    Perl6ModuleWizardStep(Perl6ModuleBuilder builder) {
        this.builder = builder;
        this.currentType = builder.getType();
        updateInputs();
    }

    private void updateInputs() {
        myMainPanel = new JBPanel<>();
        Border border = myMainPanel.getBorder();
        Border margin = new EmptyBorder(10, 10, 10, 10);
        myMainPanel.setBorder(new CompoundBorder(border, margin));
        GridBagLayout layout = new GridBagLayout();
        layout.columnWidths = new int[]{80, 80, 0};
        layout.rowHeights = new int[]{20, 20, 0};
        layout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        layout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        myMainPanel.setLayout(layout);
        if (Objects.equals(builder.getType(), Perl6ProjectType.PERL6_SCRIPT)) {
            myScriptName = new JBTextField(40);
            addLabelAndTextFIeld("Script name", 0, myScriptName);
        } else if (Objects.equals(builder.getType(), Perl6ProjectType.PERL6_MODULE)) {
            myModuleName = new JBTextField(40);
            addLabelAndTextFIeld("Module name", 0, myModuleName);
        } else {
            myModuleName = new JBTextField(40);
            addLabelAndTextFIeld("Module name", 0, myModuleName);
            myEntryName = new JBTextField(40);
            addLabelAndTextFIeld("Entry point name", 1, myEntryName);
        }
    }

    private void addLabelAndTextFIeld(String labelText, int yPos, JTextField field) {
        JLabel label = new JLabel(labelText);
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.fill = GridBagConstraints.BOTH;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = yPos;
        myMainPanel.add(label, labelConstraints);

        GridBagConstraints fieldConstraints = new GridBagConstraints();
        fieldConstraints.gridx = 1;
        fieldConstraints.gridy = yPos;
        myMainPanel.add(field, fieldConstraints);
    }

    @Override
    public JComponent getComponent() {
        // If the module type was changed, we need to re-draw UI
        if (builder.getType() != currentType) {
            currentType = builder.getType();
            updateInputs();
        }
        return myMainPanel;
    }

    @Override
    public boolean validate() throws ConfigurationException {
        switch (builder.getType()) {
            case PERL6_SCRIPT:
                checkScriptName();
                break;
            case PERL6_MODULE:
                checkModuleName();
                break;
            default:
                checkModuleName();
                checkEntryPointName();
                break;
        }
        return true;
    }

    private void checkEntryPointName() throws ConfigurationException {
        String name = myEntryName.getText();
        if (!name.matches("^[A-Za-z0-9]++$")) {
            throw new ConfigurationException("Entry point name is incorrect");
        }
    }

    private void checkModuleName() throws ConfigurationException {
        String name = myModuleName.getText();
        if (!name.matches("^[A-Za-z0-9]++(::[A-Za-z0-9]++)*$")) {
            throw new ConfigurationException("Module name is incorrect");
        }
    }

    private void checkScriptName() throws ConfigurationException {
        String name = myScriptName.getText();
        if (!name.matches("^[A-Za-z0-9]++(.(p6|pl6))?$")) {
            throw new ConfigurationException("Script name must contain only letters and numbers");
        }
    }

    @Override
    public void updateDataModel() {
        switch (builder.getType()) {
            case PERL6_SCRIPT:
                builder.setScriptName(myScriptName.getText());
                break;
            case PERL6_MODULE:
                builder.setModuleName(myModuleName.getText());
                break;
            case PERL6_APPLICATION:
                builder.setModuleName(myModuleName.getText());
                builder.setEntryPointName(myEntryName.getText());
                break;
        }
    }
}
