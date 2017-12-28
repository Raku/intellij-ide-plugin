package edument.perl6idea.highlighter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import edument.perl6idea.Perl6Icons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class Perl6ColorSettingsPage implements ColorSettingsPage {
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Type name", Perl6Highlighter.TYPE_NAME),
            new AttributesDescriptor("Statement terminator", Perl6Highlighter.STATEMENT_TERMINATOR),
            new AttributesDescriptor("Statement control", Perl6Highlighter.STATEMENT_CONTROL),
            new AttributesDescriptor("Prefix Operator", Perl6Highlighter.PREFIX),
            new AttributesDescriptor("Infix Operator", Perl6Highlighter.INFIX),
            new AttributesDescriptor("Postfix Operator", Perl6Highlighter.POSTFIX),
            new AttributesDescriptor("Variable", Perl6Highlighter.VARIABLE),
            new AttributesDescriptor("Numeric Literal", Perl6Highlighter.NUMERIC_LITERAL),
    };

    @Nullable
    @Override
    public Icon getIcon() {
        return Perl6Icons.CAMELIA;
    }

    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter() {
        return new Perl6SyntaxHighlighter();
    }

    @NotNull
    @Override
    public String getDemoText() {
        return "use Foo::Bar;\n" +
               "# Infinite list of primes:\n" +
               "my @primes = ^∞ .grep: *.is-prime;\n" +
               "say \"1001ˢᵗ prime is @primes[1000]\";\n\n" +
               "# Lazily read words from a file\n" +
               ".say for '50TB.file.txt'.IO.words;";
    }

    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
        return null;
    }

    @NotNull
    @Override
    public AttributesDescriptor[] getAttributeDescriptors() {
        return DESCRIPTORS;
    }

    @NotNull
    @Override
    public ColorDescriptor[] getColorDescriptors() {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return "Perl 6";
    }
}
