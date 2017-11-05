package edument.perl6idea.filetypes;

import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.vfs.VirtualFile;
import edument.perl6idea.Perl6Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class Perl6ScriptFileType implements FileType {
    @NotNull
    @Override
    public String getName() {
        return "Perl 6 Script";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Perl 6 Script";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "p6";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Perl6Icons.CAMELIA;
    }

    @Override
    public boolean isBinary() {
        return false;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Nullable
    @Override
    public String getCharset(@NotNull VirtualFile file, @NotNull byte[] content) {
        return "UTF-8";
    }
}
