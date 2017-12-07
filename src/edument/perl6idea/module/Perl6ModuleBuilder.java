package edument.perl6idea.module;

import com.intellij.ide.util.projectWizard.*;
import com.intellij.openapi.Disposable;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.projectRoots.SdkTypeId;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import edument.perl6idea.sdk.Perl6SdkType;
import edument.perl6idea.utils.Perl6ProjectType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.io.File.separator;

public class Perl6ModuleBuilder extends ModuleBuilder implements SourcePathsBuilder {
    private Perl6ProjectType type;
    private List<Pair<String, String>> mySourcePaths;
    private String scriptName;
    private String moduleName;
    private String entryPointName;

    @Override
    public String getName() {
        return "Perl 6 Builder";
    }

    @Override
    public String getDescription() {
        return "Perl 6 builder";
    }

    @Override
    public void setupRootModel(ModifiableRootModel model) throws ConfigurationException {
        Project project = model.getProject();
        ContentEntry contentEntry = this.doAddContentEntry(model);
        if (contentEntry == null) return;
        List<Pair<String, String>> sourcePaths = this.getSourcePaths();
        if (sourcePaths == null) return;
        for (final Pair<String, String> sourcePath : sourcePaths) {
            String moduleLibraryPath = sourcePath.first;
            File directory = new File(moduleLibraryPath);
            if (!directory.exists() && !directory.mkdirs()) {
                throw new IllegalStateException("Could not create directory: " + directory);
            }
            VirtualFile sourceRoot = LocalFileSystem.getInstance().refreshAndFindFileByPath(FileUtil.toSystemDependentName(moduleLibraryPath));
            if (sourceRoot != null)
                contentEntry.addSourceFolder(sourceRoot, false, sourcePath.second);
            if (type == Perl6ProjectType.PERL6_SCRIPT) {
                stubScript(moduleLibraryPath, this.scriptName);
            } else if (type == Perl6ProjectType.PERL6_MODULE) {
                stubModule(project, moduleLibraryPath, this.moduleName, null, true);
            } else if (type == Perl6ProjectType.PERL6_APPLICATION) {
                stubModule(project, moduleLibraryPath, this.moduleName, this.entryPointName, true);
                stubEntryPoint(moduleLibraryPath);
            }
        }
    }

    private void stubEntryPoint(String moduleLibraryPath) {
        if (!moduleLibraryPath.endsWith(separator + "bin")) return;
        Path entryPath = Paths.get(moduleLibraryPath, entryPointName);
        List<String> lines = Arrays.asList(
                "#!/usr/bin/env perl6",
                String.format("use %s;", moduleName)
        );
        writeCodeToPath(entryPath, lines);
    }

    public static String stubModule(Project project, String moduleLibraryPath, String moduleName, @Nullable String entryPointName, boolean firstModule) {
        if (moduleLibraryPath.endsWith(separator + "lib")) {
            if (firstModule) {
                writeMetaFile(project, moduleName, entryPointName);
            } else {
                addModuleToMetaFile(project, moduleName);
            }
            String modulePath = Paths.get(moduleLibraryPath, (moduleName.split("::"))) + ".pm6";
            new File(modulePath).getParentFile().mkdirs();
            writeCodeToPath(Paths.get(modulePath), Collections.singletonList(""));
            return modulePath;
        } else if (moduleLibraryPath.endsWith(separator + "t")) {
            Path testPath = Paths.get(moduleLibraryPath, "00-sanity.t");
            List<String> lines = Arrays.asList(
                    String.format("use %s;", moduleName),
                    "use Test;", "", "done-testing;"
            );
            writeCodeToPath(testPath, lines);
            return testPath.toString();
        }
        return moduleLibraryPath;
    }

    private static void addModuleToMetaFile(Project project, String moduleName) {
        try {
            Path metaPath = getMETAFilePath(project);
            String content = new String (Files.readAllBytes(metaPath));
            JSONObject metaInfo = new JSONObject(content);
            JSONObject providesSection = metaInfo.getJSONObject("provides");
            providesSection.put(moduleName, String.format("lib%s%s.pm6", separator, moduleName.replaceAll("::", separator)));
            metaInfo.put("provides", providesSection);
            writeCodeToPath(metaPath, Collections.singletonList(metaInfo.toString(4)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeMetaFile(Project project, String moduleName, @Nullable String entryPointName) {
        JSONObject providesSection = new JSONObject()
                .put(moduleName, String.format("lib%s%s.pm6", separator, moduleName.replaceAll("::", separator)));
        if (entryPointName != null)
            providesSection.put(entryPointName, String.format("bin%s%s", separator, entryPointName));
        JSONObject metaJson = new JSONObject()
                .put("perl", "6.*")
                .put("name", moduleName)
                .put("version", "0.1")
                .put("description", "Write me!")
                .put("authors", new JSONArray())
                .put("license", "Choose me!")
                .put("depends", new JSONArray())
                .put("provides", providesSection)
                .put("resources", new JSONArray())
                .put("source-url", "Write me!");
        writeCodeToPath(getMETAFilePath(project), Collections.singletonList(metaJson.toString(4)));
    }

    public static Path getMETAFilePath(Project project) {
        return Paths.get(project.getBasePath(), "META6.json");
    }

    private static void writeCodeToPath(Path codePath, List<String> lines) {
        try {
            if (Files.notExists(codePath.getParent()))
                Files.createDirectories(codePath.getParent());
            Files.write(codePath, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String stubTest(String moduleLibraryPath, String fileName) {
        String testPath = moduleLibraryPath + separator + 't' + separator + fileName;
        if (!testPath.endsWith(".t"))
            testPath = testPath + ".t";
        List<String> lines = Arrays.asList(
                "use Test;", "",
                "done-testing;"
        );
        writeCodeToPath(Paths.get(testPath), lines);
        return testPath;
    }

    public static String stubScript(String moduleLibraryPath, String scriptName) {
        String scriptPath = moduleLibraryPath + separator + scriptName;
        if (!scriptPath.endsWith(".pl6") && !scriptPath.endsWith(".p6"))
            scriptPath = scriptPath + ".p6";

        List<String> lines = Arrays.asList(
                "#!/usr/bin/env perl6",
                "", "",
                "sub MAIN() { }"
        );
        writeCodeToPath(Paths.get(scriptPath), lines);
        return scriptPath;
    }

    @NotNull
    @Override
    public ModuleType getModuleType() {
        return Perl6ModuleType.getInstance();
    }

    @Override
    public boolean isSuitableSdkType(SdkTypeId sdk) {
        return sdk == Perl6SdkType.getInstance();
    }

    @Override
    public String getGroupName() {
        return "Perl 6";
    }

    @Override
    public List<Pair<String, String>> getSourcePaths() throws ConfigurationException {
        if (this.mySourcePaths != null) return this.mySourcePaths;
        List<Pair<String, String>> paths = new ArrayList<>();
        switch (type) {
            case PERL6_SCRIPT:
                paths.add(Pair.create(this.getContentEntryPath(), ""));
                break;
            case PERL6_MODULE:
                addPath(paths, "lib");
                addPath(paths, "t");
                break;
            case PERL6_APPLICATION:
                addPath(paths, "lib");
                addPath(paths, "t");
                addPath(paths, "bin");
                break;
        }
        return paths;
    }

    @Override
    public void setSourcePaths(List<Pair<String, String>> sourcePaths) {
        this.mySourcePaths = sourcePaths != null ? new ArrayList<>(sourcePaths) : null;
    }

    private void addPath(List<Pair<String, String>> paths, String dirName) {
        String path = this.getContentEntryPath() + separator + dirName;
        paths.add(Pair.create(path, ""));
    }

    @Override
    public void addSourcePath(Pair<String, String> sourcePathInfo) {
        if (this.mySourcePaths == null)
            this.mySourcePaths = new ArrayList<>();
        this.mySourcePaths.add(sourcePathInfo);
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{ new Perl6ModuleWizardStep(this) };
    }

    @Nullable
    @Override
    public ModuleWizardStep getCustomOptionsStep(WizardContext context, Disposable parentDisposable) {
        TypeWizardStepForm step = new TypeWizardStepForm(this);
        Disposer.register(parentDisposable, step);
        return step;
    }

    Perl6ProjectType getType() {
        return type;
    }

    void setType(Perl6ProjectType type) {
        this.type = type;
    }

    void setEntryPointName(String entryPointName) {
        this.entryPointName = entryPointName;
    }

    void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    @Nullable
    @Override
    public ModuleWizardStep modifySettingsStep(@NotNull SettingsStep settingsStep) {
        final JTextField nameField = settingsStep.getModuleNameField();
        if (moduleName != null && nameField != null)
            nameField.setText(StringUtil.sanitizeJavaIdentifier(moduleName));
        return super.modifySettingsStep(settingsStep);
    }
}
