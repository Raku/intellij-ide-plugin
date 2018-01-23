package edument.perl6idea.debugger;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Perl6LoadedFileDescriptor {
    private String path;
    private String name;

    Perl6LoadedFileDescriptor(String path, String name) {
        this.path = path;
        this.name = name;
    }

    @NotNull
    public String getPath() {
        return path;
    }

    @Nullable
    public String getName() {
        return name;
    }

    @NotNull
    public String getNameOrPath() {
        return path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Perl6LoadedFileDescriptor)) {
            return false;
        }

        Perl6LoadedFileDescriptor that = (Perl6LoadedFileDescriptor) o;

        return getPath().equals(that.getPath());
    }

    @Override
    public int hashCode() {
        return getPath().hashCode();
    }
}
