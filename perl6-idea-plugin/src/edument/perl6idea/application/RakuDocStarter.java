package edument.perl6idea.application;

import com.intellij.formatting.commandLine.MessageOutput;
import com.intellij.ide.impl.ProjectUtil;
import com.intellij.openapi.application.ApplicationStarter;
import com.intellij.openapi.application.ex.ApplicationInfoEx;
import com.intellij.openapi.application.impl.ApplicationInfoImpl;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.util.ArrayUtil;
import edument.perl6idea.metadata.Perl6MetaDataComponent;
import edument.perl6idea.psi.Perl6File;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class RakuDocStarter implements ApplicationStarter {
    public static final String RAKU_DOC_COMMAND_NAME = "raku-doc";

    @Override
    public @NonNls String getCommandName() {
        return RAKU_DOC_COMMAND_NAME;
    }

    @SuppressWarnings("AssignmentToForLoopParameter")
    @Override
    public void main(@NotNull List<String> args) {
        @SuppressWarnings("UseOfSystemOutOrSystemErr")
        // comma raku-doc directory
        MessageOutput messageOutput = new MessageOutput(
            new PrintWriter(System.out, false, StandardCharsets.UTF_8),
            new PrintWriter(System.err, false, StandardCharsets.UTF_8));
        messageOutput.info(getAppInfo() + "Documentation Generator\n");

        String outputPrefix = null;

        // If only "raku-doc" argument
        if (args.size() < 2) {
            showUsageInfo(messageOutput);
        }
        else {
            boolean foundAModule = false;
            for (int i = 1; i < args.size(); i++) {
                if (ArrayUtil.contains(args.get(i), "-h", "--help")) {
                    showUsageInfo(messageOutput);
                }
                if (ArrayUtil.contains(args.get(i), "-o", "--output")) {
                    i++;
                    if (i >= args.size()) {
                        fatalError(messageOutput, "Missing output directory path.\n");
                    }
                    else {
                        outputPrefix = args.get(i);
                    }
                }
                else {
                    boolean newModuleStatus = processDirectory(messageOutput, outputPrefix, args.get(i));
                    foundAModule = foundAModule || newModuleStatus;
                }
            }
            if (!foundAModule) {
                // If we are here then something silly has happened with the args passed
                showUsageInfo(messageOutput);
                System.exit(1);
            }
        }
        System.exit(0);
    }

    private static void fatalError(MessageOutput messageOutput, String message) {
        messageOutput.error("ERROR: " + message);
        System.exit(1);
    }

    private static boolean processDirectory(MessageOutput messageOutput, @Nullable String outputPrefix, String projectPathString) {
        Path projectPath = Paths.get(projectPathString);
        File projectDirectoryFile = projectPath.toFile();
        if (!projectDirectoryFile.exists() || !projectDirectoryFile.isDirectory())
            showUsageInfo(messageOutput);

        Project project = ProjectUtil.openOrImport(projectPath);
        if (project == null) {
            messageOutput.info("Could not import or open the project by path\n");
        }
        else {
            Module @NotNull [] modules = ModuleManager.getInstance(project).getModules();
            boolean sawAModule = false;
            for (Module module : modules) {
                Perl6MetaDataComponent metaDataComponent = module.getService(Perl6MetaDataComponent.class);
                if (metaDataComponent != null) {
                    VirtualFile metaFile = metaDataComponent.getMetaFile();
                    Path originalDistDirectory;
                    if (metaFile != null)
                        originalDistDirectory = Paths.get(metaFile.getPath());
                    else {
                        messageOutput.info("No META file for the '" + module.getName() + "' module, skipping\n");
                        continue;
                    }
                    @Nullable Map<String, Object> providesMap = metaDataComponent.getProvidedMap();
                    if (providesMap != null) {
                        sawAModule = true;
                        processModules(project, outputPrefix, originalDistDirectory, messageOutput, providesMap);
                    }
                }
            }
            if (sawAModule) {
                ProjectManagerEx.getInstanceEx().closeAndDispose(project);
                return true;
            }
            messageOutput.info("Could not find suitable modules to convert\n");
        }
        if (project != null)
            ProjectManagerEx.getInstanceEx().closeAndDispose(project);
        return false;
    }

    private static void processModules(Project project,
                                       @Nullable String outputPrefix,
                                       Path originalDistDirectory,
                                       MessageOutput messageOutput,
                                       Map<String, Object> map) {
        Path outputPath = Paths.get(outputPrefix != null ? outputPrefix : "output");
        File outputDirectory = outputPath.toFile();
        outputDirectory.mkdirs();
        messageOutput.info("Started processing the module\n");
        for (String key : map.keySet()) {
            String relativeFilePathString = map.get(key) instanceof String ? (String)map.get(key) : null;
            if (relativeFilePathString == null) {
                messageOutput.error("Encountered improper formatting for the '" + key + "' entry." +
                                    "Expected String, got " + map.get(key).getClass().getCanonicalName() +
                                    ", skipping\n");
                continue;
            }
            Path relativeFilePath = originalDistDirectory.resolveSibling(relativeFilePathString);
            File file = relativeFilePath.toFile();
            VirtualFile vf = LocalFileSystem.getInstance().findFileByIoFile(file);
            if (!file.exists() || !file.isFile() || vf == null) {
                messageOutput.error("Encountered invalid file path '" + relativeFilePath.toFile() + "', skipping\n");
                continue;
            }
            PsiFile psiFile = PsiManager.getInstance(project).findFile(vf);
            if (psiFile instanceof Perl6File) {
                String htmlForModule = ((Perl6File)psiFile).renderPod();
                Path path = outputPath.resolve(relativeFilePathString).resolveSibling(psiFile.getName().replaceFirst("[.][^.]+$", "") + ".html");
                messageOutput.info(path.toString() + "\n");
                path.getParent().toFile().mkdirs();
                try {
                    Files.writeString(path, htmlForModule);
                }
                catch (IOException e) {
                    messageOutput.info("Something bad has happened: " + e.getMessage() + "\n");
                }
            }
        }
    }

    private static String getAppInfo() {
        ApplicationInfoImpl appInfo = (ApplicationInfoImpl)ApplicationInfoEx.getInstanceEx();
        return String.format("%s, build %s", appInfo.getFullApplicationName(), appInfo.getBuild().asString());
    }

    private static void showUsageInfo(MessageOutput messageOutput) {
        messageOutput.info("Usage: raku-doc [-o|--output outputPath] [-h|--help] path1 path2...\n");
        messageOutput.info("  -h|--help       Show a help message and exit.\n");
        messageOutput.info("  -o|--output     A path for the output directory (created if does not exist).\n");
        messageOutput.info("  path<n>         A path to a project directory.\n");
        System.exit(0);
    }
}
