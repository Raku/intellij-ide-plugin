package edument.perl6idea.sdk;

import com.intellij.openapi.projectRoots.*;
import edument.perl6idea.Perl6Icons;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Perl6SdkType extends SdkType {
    private static final String NAME = "Perl 6 SDK";

    public Perl6SdkType() {
        super(NAME);
    }

    public static Perl6SdkType getInstance() {
        return SdkType.findInstance(Perl6SdkType.class);
    }

    @NotNull
    @Override
    public Icon getIcon() {
        return Perl6Icons.CAMELIA;
    }

    @NotNull
    @Override
    public Icon getIconForAddAction() {
        // TODO get some another icon?
        return getIcon();
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        final String perl6fromPath = findPerl6InPath();
        if (perl6fromPath != null) {
            return perl6fromPath;
        }
        return null;
    }

    @Nullable
    private static String findPerl6InPath() {
        // TODO: Windows/Mac support
        final String command = "perl6";
        final String path = System.getenv("PATH");
        for (String root : path.split(File.pathSeparator)) {
            final File file = new File(root, command);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean isValidSdkHome(@NotNull String path) {
        // FIXME: write a real check here
        return true;
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(@NotNull SdkModel model, @NotNull SdkModificator modificator) {
        return null;
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData data, @NotNull Element additional) {
    }

    @Nullable
    @Override
    public String getVersionString(@NotNull String home) {
        String[] command = {home, "--version"};
        try {
            File file = new File(home);
            if (!file.isDirectory() && file.canExecute()) {
                Process p = Runtime.getRuntime().exec(command);
                BufferedReader std = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String firstLine = std.readLine();
                if (firstLine != null) {
                    Pattern pattern = Pattern.compile("(20\\d\\d\\.\\d+-\\d+)");
                    Matcher matcher = pattern.matcher(firstLine);
                    if (matcher.find()) {
                        return matcher.group(0);
                    } else {
                        return null;
                    }
                }
            } else {
                return null;
            }
        } catch (IOException e) {
            // TODO: send a proper log warning here?
            e.printStackTrace();
            return null;
        }
        return null;
    }

    @NotNull
    @Override
    public String suggestSdkName(@Nullable String currentSdkName, @NotNull String sdkHome) {
        System.out.println(currentSdkName);
        System.out.println(sdkHome);
        String version = getVersionString(sdkHome);
        System.out.println(version);
        if (version == null) {
            return "Unknown at " + sdkHome;
        }
        return "Perl 6 " + version;
    }

    @NotNull
    @Override
    public String getPresentableName() {
        return "Perl 6 SDK";
    }
}
