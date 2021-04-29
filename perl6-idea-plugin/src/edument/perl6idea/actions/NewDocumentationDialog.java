package edument.perl6idea.actions;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.ValidationInfo;
import edument.perl6idea.utils.Patterns;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.nio.file.Paths;

public class NewDocumentationDialog extends DialogWrapper {
    private final String myParentPath;
    private JTextField fileNameField;
    private JPanel myPanel;

    public NewDocumentationDialog(@Nullable Project project,
                                  String parentPath) {
        super(project, false);
        myParentPath = parentPath;
        init();
        setTitle("New Raku Documentation (Pod6)");
    }

    @Nullable
    @Override
    public JComponent getPreferredFocusedComponent() {
        return fileNameField;
    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        String newFileName = fileNameField.getText();
        boolean isCorrectFileName = newFileName.matches(Patterns.SCRIPT_PATTERN);
        if (!isCorrectFileName)
            return new ValidationInfo("Incorrect script name (examples: `doc`, `doc.rakudoc`, `doc.pod6`)", fileNameField);
        if (Paths.get(myParentPath, newFileName).toFile().exists())
            return new ValidationInfo("File " + newFileName + " already exists", fileNameField);
        return null;
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        return myPanel;
    }

    public String getFileName() {
        return fileNameField.getText();
    }
}
