package edument.perl6idea.filetypes;

import com.intellij.openapi.fileTypes.FileTypeConsumer;
import com.intellij.openapi.fileTypes.FileTypeFactory;
import org.jetbrains.annotations.NotNull;

public class Perl6FileTypeFactory extends FileTypeFactory {
    @Override
    public void createFileTypes(@NotNull FileTypeConsumer consumer) {
        consumer.consume(new Perl6ScriptFileType());
        consumer.consume(new Perl6ModuleFileType());
    }
}
