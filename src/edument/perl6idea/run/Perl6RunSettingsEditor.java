package edument.perl6idea.run;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.RawCommandLineEditor;
import com.intellij.ui.components.JBPanel;
import edument.perl6idea.utils.GUIHelpers;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Objects;

public class Perl6RunSettingsEditor extends SettingsEditor<Perl6RunConfiguration> {
    private JPanel myPanel;
    private TextFieldWithBrowseButton fileField;
    private RawCommandLineEditor myScriptParamsTextField;

    public Perl6RunSettingsEditor(Project myProject) {
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
                        || Arrays.asList("pm6", "pl6", "p6", "").contains(file.getExtension());
            }
        };
        fileField = new TextFieldWithBrowseButton();
        fileField.addBrowseFolderListener("Select Script", null, myProject,
                chooserDescriptor);
        GUIHelpers.addLabelAndTextFIeld(myPanel, "Script path:", 0, fileField);

        myScriptParamsTextField = new RawCommandLineEditor();
        GUIHelpers.addLabelAndTextFIeld(myPanel, "Script args:", 1, myScriptParamsTextField);
    }

    @Override
    protected void resetEditorFrom(@NotNull Perl6RunConfiguration conf) {
        fileField.setText(conf.getMyScriptPath());
        myScriptParamsTextField.setText(conf.getProgramParameters());
    }

    @Override
    protected void applyEditorTo(@NotNull Perl6RunConfiguration conf) throws ConfigurationException {
        String fileLine = fileField.getText();
        VirtualFile file = LocalFileSystem.getInstance().findFileByPath(fileLine);
        if (file == null || !file.exists()) {
            throw new ConfigurationException("Main script path is incorrect");
        } else if (Objects.equals(fileLine, "")) {
            throw new ConfigurationException("Main script path is absent");
        } else  {
            conf.setMyScriptPath(fileLine);
            conf.setProgramParameters(myScriptParamsTextField.getText());
        }
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return myPanel;
    }
}
