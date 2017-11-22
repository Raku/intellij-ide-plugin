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

import static java.io.File.separator;

public class NewModuleAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        if (project == null) return;
        InputValidator validator = new InputValidator() {
            private String pattern = "^[A-Za-z0-9]++(::[A-Za-z0-9]++)*$";

            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches(pattern);
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches(pattern);
            }
        };
        String moduleName = Messages.showInputDialog(project,
                    "What is new module name?",
                    "New Module Name",
                    Messages.getQuestionIcon(), null, validator);
        VirtualFile baseDir = project.getBaseDir();
        String modulePath = Perl6ModuleBuilder.stubModule(baseDir.getCanonicalPath() + separator + "lib", moduleName, null);
        baseDir.refresh(false, true);
        VirtualFile moduleFile = LocalFileSystem.getInstance().findFileByPath(modulePath);
        // TODO: moduleFile can be null, investigate and fix.
        FileEditorManager.getInstance(project).openFile(moduleFile, true);
        Messages.showMessageDialog(project, "New script was created successfully!", "Information", Messages.getInformationIcon());
    }
}
