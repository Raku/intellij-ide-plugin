package edument.perl6idea.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import edument.perl6idea.module.Perl6ModuleBuilder;
import edument.perl6idea.utils.Patterns;

import java.util.Collections;

public class NewTestAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        if (project == null) return;
        InputValidator validator = new InputValidator() {
            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches(Patterns.TEST_PATTERN);
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches(Patterns.TEST_PATTERN);
            }
        };
        String fileName = Messages.showInputDialog(project,
                "Test file name (without .t extension):",
                "New Test Name",
                Messages.getQuestionIcon(), null, validator);
        if (fileName == null)
            return;
        String testPath = Perl6ModuleBuilder.stubTest(project.getBaseDir().getCanonicalPath(), fileName, Collections.emptyList());
        VirtualFile testFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(testPath);
        assert testFile != null;
        FileEditorManager.getInstance(project).openFile(testFile, true);

    }
}
