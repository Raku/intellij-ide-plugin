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

import java.nio.file.Paths;

public class NewModuleAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        if (project == null) return;
        InputValidator validator = new InputValidator() {
            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches(Patterns.MODULE_PATTERN);
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches(Patterns.MODULE_PATTERN);
            }
        };
        String moduleName = Messages.showInputDialog(project,
                "What is new module name?",
                "New Module Name",
                Messages.getQuestionIcon(), null, validator);
        // If user cancelled action.
        if (moduleName == null)
            return;

        String baseDir = project.getBaseDir().getCanonicalPath();
        if (baseDir != null) {
            String modulePath = Perl6ModuleBuilder.stubModule(Paths.get(baseDir, "lib").toString(),
                    moduleName, null,
                    !Perl6ModuleBuilder.getMETAFilePath().toFile().exists());
            VirtualFile moduleFile = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(Paths.get(modulePath).toFile());
            assert moduleFile != null;
            FileEditorManager.getInstance(project).openFile(moduleFile, true);
        } else {
            throw new IllegalStateException("Cannot create a module without a project base directory!");
        }
    }
}
