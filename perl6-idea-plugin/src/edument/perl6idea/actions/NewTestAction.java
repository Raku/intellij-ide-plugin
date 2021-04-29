package edument.perl6idea.actions;

import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import edument.perl6idea.module.builder.Perl6ModuleBuilderModule;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Paths;
import java.util.Collections;

public class NewTestAction extends NewRakuFileAction<NewTestDialog> {
    @Override
    protected void processDialogResult(Project project, String testPath, NewTestDialog dialog) {
        String fileName = dialog.getTestName();
        if (fileName == null)
            return;

        testPath = Perl6ModuleBuilderModule.stubTest(Paths.get(testPath), fileName, Collections.emptyList());
        VirtualFile testFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(testPath);
        assert testFile != null;
        FileEditorManager.getInstance(project).openFile(testFile, true);
    }

    @Override
    protected @NotNull NewTestDialog getDialog(Project project, String filePath) {
        return new NewTestDialog(project, filePath);
    }
}
