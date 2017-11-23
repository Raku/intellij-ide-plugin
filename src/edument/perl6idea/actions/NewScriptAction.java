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

public class NewScriptAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        if (project == null) return;
        InputValidator validator = new InputValidator() {
            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches(Patterns.SCRIPT_PATTERN);
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches(Patterns.SCRIPT_PATTERN);
            }
        };
        String fileName = Messages.showInputDialog(project,
                    "What is new script name?",
                    "New Script Name",
                    Messages.getQuestionIcon(), null, validator);
        // If user cancelled action.
        if (fileName == null)
            return;
        String scriptPath = Perl6ModuleBuilder.stubScript(project.getBaseDir().getCanonicalPath(), fileName);
        VirtualFile scriptFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(scriptPath);
        assert scriptFile != null;
        FileEditorManager.getInstance(project).openFile(scriptFile, true);
    }
}
