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
            new AttributesDescriptor("Phaser", Perl6Highlighter.PHASER),
            new AttributesDescriptor("Statement Prefix", Perl6Highlighter.STATEMENT_PREFIX),
            new AttributesDescriptor("Statement modifier", Perl6Highlighter.STATEMENT_MOD),
            new AttributesDescriptor("Scope Keyword", Perl6Highlighter.SCOPE_DECLARATOR),
            new AttributesDescriptor("Multi Keyword", Perl6Highlighter.MULTI_DECLARATOR),
            new AttributesDescriptor("Routine Keyword", Perl6Highlighter.ROUTINE_DECLARATOR),
            new AttributesDescriptor("Package Keyword", Perl6Highlighter.PACKAGE_DECLARATOR),
            new AttributesDescriptor("Routine Name", Perl6Highlighter.ROUTINE_NAME),
            new AttributesDescriptor("Prefix Operator", Perl6Highlighter.PREFIX),
            new AttributesDescriptor("Infix Operator", Perl6Highlighter.INFIX),
            new AttributesDescriptor("Postfix Operator", Perl6Highlighter.POSTFIX),
            new AttributesDescriptor("Array Indexer", Perl6Highlighter.ARRAY_INDEXER),
            new AttributesDescriptor("Hash Indexer", Perl6Highlighter.HASH_INDEXER),
            new AttributesDescriptor("Lambda (-> and <->)", Perl6Highlighter.LAMBDA),
            new AttributesDescriptor("Variable", Perl6Highlighter.VARIABLE),
            new AttributesDescriptor("Numeric Literal", Perl6Highlighter.NUMERIC_LITERAL),
            new AttributesDescriptor("Version Literal", Perl6Highlighter.VERSION),
            new AttributesDescriptor("Comment", Perl6Highlighter.COMMENT),
            new AttributesDescriptor("Sub Call Name", Perl6Highlighter.SUB_CALL_NAME),
            new AttributesDescriptor("Method Call Name", Perl6Highlighter.METHOD_CALL_NAME),
            new AttributesDescriptor("Parentheses", Perl6Highlighter.PARENTHESES),
            new AttributesDescriptor("Block Curly Braces", Perl6Highlighter.BLOCK_CURLY_BRACKETS),
            new AttributesDescriptor("Whatever", Perl6Highlighter.WHATEVER),
            new AttributesDescriptor("Current Object (self, sigil in $.foo(...))", Perl6Highlighter.SELF),
            new AttributesDescriptor("Only Star (Protos)", Perl6Highlighter.ONLY_STAR),
            new AttributesDescriptor("Parameter Separator", Perl6Highlighter.PARAMETER_SEPARATOR),
            new AttributesDescriptor("Named Parameter Colon and Parentheses", Perl6Highlighter.NAMED_PARAMETER_SYNTAX),
            new AttributesDescriptor("Named Parameter Name Alias", Perl6Highlighter.NAMED_PARAMETER_NAME_ALIAS),
            new AttributesDescriptor("Parameter or variable constraint (where)", Perl6Highlighter.WHERE_CONSTRAINT),
            new AttributesDescriptor("String Literal Quote", Perl6Highlighter.STRING_LITERAL_QUOTE),
            new AttributesDescriptor("String Literal Value", Perl6Highlighter.STRING_LITERAL_CHAR),
            new AttributesDescriptor("String Literal Escape", Perl6Highlighter.STRING_LITERAL_ESCAPE),
            new AttributesDescriptor("String Literal Invalid Escape", Perl6Highlighter.STRING_LITERAL_BAD_ESCAPE),
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
