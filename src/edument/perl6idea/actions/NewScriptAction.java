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

public class NewScriptAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        if (project == null) return;
        // XXX Check for already existing files here?
        InputValidator validator = new InputValidator() {
            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches("^[A-Za-z0-9-]++(.(p6|pl6))?$");
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches("^[A-Za-z0-9-]++(.(p6|pl6))?$");
            }
        };
        String fileName = Messages.showInputDialog(project,
                    "What is new script name?",
                    "New Script Name",
                    Messages.getQuestionIcon(), null, validator);
        // If user cancelled action.
        if (fileName == null)
            return;
        VirtualFile baseDir = project.getBaseDir();
        String scriptPath = Perl6ModuleBuilder.stubScript(baseDir.getCanonicalPath(), fileName);
        baseDir.refresh(false, true);
        VirtualFile scriptFile = LocalFileSystem.getInstance().findFileByPath(scriptPath);
        FileEditorManager.getInstance(project).openFile(scriptFile, true);
        Messages.showMessageDialog(project, "New script was created successfully!", "Information", Messages.getInformationIcon());
    }
}
