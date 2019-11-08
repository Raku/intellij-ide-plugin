package edument.perl6idea.cro.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.InputValidator;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import edument.perl6idea.cro.template.CroTemplateFileType;
import edument.perl6idea.filetypes.Perl6TestFileType;
import edument.perl6idea.module.builder.Perl6ModuleBuilderModule;
import edument.perl6idea.utils.Patterns;
import edument.perl6idea.utils.Perl6Utils;
import org.jetbrains.annotations.NotNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NewCroTemplateAction extends AnAction {
    @Override
    public void update(AnActionEvent e) {
        final DataContext dataContext = e.getDataContext();
        final Presentation presentation = e.getPresentation();
        final boolean enabled = isAvailable(dataContext);
        presentation.setVisible(enabled);
        presentation.setEnabled(enabled);
    }

    private static boolean isAvailable(DataContext dataContext) {
        final Project project = CommonDataKeys.PROJECT.getData(dataContext);
        final Object navigatable = CommonDataKeys.NAVIGATABLE.getData(dataContext);
        return project != null && (navigatable instanceof PsiDirectory ||
                                   navigatable instanceof PsiFile);
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getData(CommonDataKeys.PROJECT);
        if (project == null) return;
        InputValidator validator = new InputValidator() {
            @Override
            public boolean checkInput(String inputString) {
                return inputString.matches(Patterns.CRO_TEMPLATE_PATTERN);
            }

            @Override
            public boolean canClose(String inputString) {
                return inputString.matches(Patterns.CRO_TEMPLATE_PATTERN);
            }
        };

        Object navigatable = e.getData(CommonDataKeys.NAVIGATABLE);
        String templatePath = null;
        if (navigatable != null) {
            if (navigatable instanceof PsiDirectory)
                templatePath = ((PsiDirectory) navigatable).getVirtualFile().getPath();
            else if (navigatable instanceof PsiFile)
                if (((PsiFile) navigatable).getParent() != null)
                    templatePath = ((PsiFile) navigatable).getParent().getVirtualFile().getPath();
        }

        String fileName = Messages.showInputDialog(
                project,
                "Cro Template name (type one without an extension to use a default '.crotmp'):",
                "New Cro Template Name",
                Messages.getQuestionIcon(), null, validator);
        if (fileName == null)
            return;

        if (templatePath == null) {
            VirtualFile path = project.getBaseDir();
            if (path == null) return;
            templatePath = Paths.get(path.getPath(), "templates").toString();
        }

        templatePath = stubTemplate(Paths.get(templatePath), fileName);
        VirtualFile testFile = LocalFileSystem.getInstance().refreshAndFindFileByPath(templatePath);
        assert testFile != null;
        FileEditorManager.getInstance(project).openFile(testFile, true);
    }


    public static String stubTemplate(Path testDirectoryPath, String fileName) {
        Path testPath = testDirectoryPath.resolve(fileName);
        // If no extension, add default `.crotmp`
        if (!testPath.toString().contains("."))
            testPath = Paths.get(testDirectoryPath.toString(), fileName + "." + CroTemplateFileType.INSTANCE.getDefaultExtension());
        Perl6Utils.writeCodeToPath(testPath, new LinkedList<>());
        return testPath.toString();
    }
}
