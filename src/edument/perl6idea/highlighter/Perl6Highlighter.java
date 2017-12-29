package edument.perl6idea.highlighter;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

public final class Perl6Highlighter {
    static final String COMMENT_ID = "PERL6_COMMENT";
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey(
            COMMENT_ID,
            DefaultLanguageHighlighterColors.LINE_COMMENT
    );

    static final String STATEMENT_CONTROL_ID = "PERL6_STATEMENT_CONTROL";
    public static final TextAttributesKey STATEMENT_CONTROL = TextAttributesKey.createTextAttributesKey(
            STATEMENT_CONTROL_ID,
            DefaultLanguageHighlighterColors.KEYWORD
    );

    static final String SCOPE_DECLARATOR_ID = "PERL6_SCOPE_DECLARATOR";
    public static final TextAttributesKey SCOPE_DECLARATOR = TextAttributesKey.createTextAttributesKey(
            SCOPE_DECLARATOR_ID,
            DefaultLanguageHighlighterColors.KEYWORD
    );

    static final String TYPE_NAME_ID = "PERL6_TYPE_NAME";
    public static final TextAttributesKey TYPE_NAME = TextAttributesKey.createTextAttributesKey(
            TYPE_NAME_ID,
            DefaultLanguageHighlighterColors.CLASS_REFERENCE
    );

    static final String STATEMENT_TERMINATOR_ID = "PERL6_STATEMENT_TERMINATOR";
    public static final TextAttributesKey STATEMENT_TERMINATOR = TextAttributesKey.createTextAttributesKey(
            STATEMENT_TERMINATOR_ID,
            DefaultLanguageHighlighterColors.SEMICOLON
    );

    static final String PREFIX_ID = "PERL6_PREFIX";
    public static final TextAttributesKey PREFIX = TextAttributesKey.createTextAttributesKey(
            PREFIX_ID,
            DefaultLanguageHighlighterColors.OPERATION_SIGN
    );

    static final String INFIX_ID = "PERL6_INFIX";
    public static final TextAttributesKey INFIX = TextAttributesKey.createTextAttributesKey(
            INFIX_ID,
            DefaultLanguageHighlighterColors.OPERATION_SIGN
    );

    static final String POSTFIX_ID = "PERL6_POSTFIX";
    public static final TextAttributesKey POSTFIX = TextAttributesKey.createTextAttributesKey(
            POSTFIX_ID,
            DefaultLanguageHighlighterColors.OPERATION_SIGN
    );

    static final String VARIABLE_ID = "PERL6_VARIABLE";
    public static final TextAttributesKey VARIABLE = TextAttributesKey.createTextAttributesKey(
            VARIABLE_ID,
            DefaultLanguageHighlighterColors.LOCAL_VARIABLE
    );

    static final String NUMERIC_LITERAL_ID = "PERL6_NUMERIC_LITERAL";
    public static final TextAttributesKey NUMERIC_LITERAL = TextAttributesKey.createTextAttributesKey(
            NUMERIC_LITERAL_ID,
            DefaultLanguageHighlighterColors.NUMBER
    );
}
