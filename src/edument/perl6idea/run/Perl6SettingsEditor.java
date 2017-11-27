package edument.perl6idea.run;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.Comparing;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.RawCommandLineEditor;
import com.intellij.ui.components.JBPanel;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;

public class Perl6SettingsEditor extends SettingsEditor<Perl6RunConfiguration> {
    private JPanel myPanel;
    private TextFieldWithBrowseButton fileField;
    private RawCommandLineEditor myScriptParamsTextField;

    public Perl6SettingsEditor(Project myProject) {
        super();
        myPanel = new JBPanel<>();
        GridBagLayout layout = new GridBagLayout();
        layout.columnWidths = new int[]{80, 80, 0};
        layout.rowHeights = new int[]{20, 20, 0};
        layout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
        layout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        myPanel.setLayout(layout);
        FileChooserDescriptor chooserDescriptor = new FileChooserDescriptor(
                true, false,
                false, false,
                false, false) {
            @Override
            public boolean isFileVisible(VirtualFile file, boolean showHiddenFiles) {
                return file.isDirectory() || file.getExtension() == null
                        || Comparing.equal(file.getExtension(), "p6"); // Enforcing no ".pl6" extension here.
            }
        };
        fileField = new TextFieldWithBrowseButton();
        fileField.addBrowseFolderListener("Select Script", null, myProject,
                chooserDescriptor);
        addLabelAndTextFIeld("Script path", 0, fileField);

        myScriptParamsTextField = new RawCommandLineEditor();
        addLabelAndTextFIeld("Script args", 1, myScriptParamsTextField);
    }

    private void addLabelAndTextFIeld(String labelText, int yPos, JComponent field) {
        JLabel label = new JLabel(labelText);
        GridBagConstraints labelConstraints = new GridBagConstraints();
        labelConstraints.fill = GridBagConstraints.BOTH;
        labelConstraints.gridx = 0;
        labelConstraints.gridy = yPos;
        myPanel.add(label, labelConstraints);

        GridBagConstraints fieldConstraints = new GridBagConstraints();
        fieldConstraints.gridx = 1;
        fieldConstraints.gridy = yPos;
        myPanel.add(field, fieldConstraints);
    }

    @Override
    protected void resetEditorFrom(@NotNull Perl6RunConfiguration conf) {
        fileField.setText(conf.getMyScriptPath());
        myScriptParamsTextField.setText(conf.getMyScriptArgs());
    }

    @Override
    protected void applyEditorTo(@NotNull Perl6RunConfiguration conf) throws ConfigurationException {
        if (myScriptParamsTextField.getText() != null) {
            conf.setMyScriptPath(fileField.getText());
        } else {
            throw new ConfigurationException("Main script path must be chosen");
        }
        conf.setMyScriptArgs(myScriptParamsTextField.getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }
}
