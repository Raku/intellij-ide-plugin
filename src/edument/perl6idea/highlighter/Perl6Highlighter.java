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

    static final String STRING_LITERAL_QUOTE_ID = "PERL6_STRING_LITERAL_QUOTE";
    public static final TextAttributesKey STRING_LITERAL_QUOTE = TextAttributesKey.createTextAttributesKey(
            STRING_LITERAL_QUOTE_ID,
            DefaultLanguageHighlighterColors.STRING
    );

    static final String STRING_LITERAL_CHAR_ID = "PERL6_STRING_LITERAL_CHAR";
    public static final TextAttributesKey STRING_LITERAL_CHAR = TextAttributesKey.createTextAttributesKey(
            STRING_LITERAL_CHAR_ID,
            DefaultLanguageHighlighterColors.STRING
    );

    static final String STRING_LITERAL_ESCAPE_ID = "PERL6_STRING_LITERAL_ESCAPE";
    public static final TextAttributesKey STRING_LITERAL_ESCAPE = TextAttributesKey.createTextAttributesKey(
            STRING_LITERAL_ESCAPE_ID,
            DefaultLanguageHighlighterColors.VALID_STRING_ESCAPE
    );

    static final String STRING_LITERAL_BAD_ESCAPE_ID = "PERL6_STRING_LITERAL_BAD_ESCAPE";
    public static final TextAttributesKey STRING_LITERAL_BAD_ESCAPE = TextAttributesKey.createTextAttributesKey(
            STRING_LITERAL_BAD_ESCAPE_ID,
            DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE
    );

    static final String PARENTHESES_ID = "PERL6_PARENTHESES";
    public static final TextAttributesKey PARENTHESES = TextAttributesKey.createTextAttributesKey(
            PARENTHESES_ID,
            DefaultLanguageHighlighterColors.PARENTHESES
    );

    static final String SUB_CALL_NAME_ID = "PERL6_SUB_CALL_NAME";
    public static final TextAttributesKey SUB_CALL_NAME = TextAttributesKey.createTextAttributesKey(
            SUB_CALL_NAME_ID,
            DefaultLanguageHighlighterColors.FUNCTION_CALL
    );

    static final String METHOD_CALL_NAME_ID = "PERL6_METHOD_CALL_NAME";
    public static final TextAttributesKey METHOD_CALL_NAME = TextAttributesKey.createTextAttributesKey(
            METHOD_CALL_NAME_ID,
            DefaultLanguageHighlighterColors.INSTANCE_METHOD
    );

    static final String WHATEVER_ID = "PERL6_WHATEVER";
    public static final TextAttributesKey WHATEVER = TextAttributesKey.createTextAttributesKey(
            WHATEVER_ID,
            DefaultLanguageHighlighterColors.CONSTANT
    );
}
