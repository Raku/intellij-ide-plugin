package edument.perl6idea.parsing;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

public interface Perl6TokenTypes {
    IElementType ALSO = new Perl6ElementType("ALSO");
    IElementType ARGLIST_EMPTY = new Perl6ElementType("ARGLIST_EMPTY");
    IElementType ARGLIST_END = new Perl6ElementType("ARGLIST_END");
    IElementType ARGLIST_START = new Perl6ElementType("ARGLIST_START");
    IElementType ARRAY_COMPOSER_CLOSE = new Perl6ElementType("ARRAY_COMPOSER_CLOSE");
    IElementType ARRAY_COMPOSER_OPEN = new Perl6ElementType("ARRAY_COMPOSER_OPEN");
    IElementType ARRAY_INDEX_BRACKET_CLOSE = new Perl6ElementType("ARRAY_INDEX_BRACKET_CLOSE");
    IElementType ARRAY_INDEX_BRACKET_OPEN = new Perl6ElementType("ARRAY_INDEX_BRACKET_OPEN");
    IElementType ASSIGN_METAOP = new Perl6ElementType("ASSIGN_METAOP");
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
    IElementType BAD_ESCAPE = new Perl6ElementType("BAD_ESCAPE");
    IElementType BARE_BLOCK = new Perl6ElementType("BARE_BLOCK");
    IElementType BLOCK_CURLY_BRACKET_CLOSE = new Perl6ElementType("BLOCK_CURLY_BRACKET_CLOSE");
    IElementType BLOCK_CURLY_BRACKET_OPEN = new Perl6ElementType("BLOCK_CURLY_BRACKET_OPEN");
    IElementType BRACKETED_INFIX_INCOMPLETE = new Perl6ElementType("BRACKETED_INFIX_INCOMPLETE");
    IElementType CAPTURE_INVALID = new Perl6ElementType("CAPTURE_INVALID");
    IElementType CAPTURE_TERM = new Perl6ElementType("CAPTURE_TERM");
    IElementType CIRCUMFIX_CONTEXTUALIZER = new Perl6ElementType("CIRCUMFIX_CONTEXTUALIZER");
    IElementType COLON_PAIR = new Perl6ElementType("COLON_PAIR");
    IElementType COLON_PAIR_HAS_VALUE = new Perl6ElementType("COLON_PAIR_HAS_VALUE");
    IElementType COMMENT = new Perl6ElementType("COMMENT");
    IElementType COMMENT_QUOTE_CLOSE = new Perl6ElementType("COMMENT_QUOTE_CLOSE");
    IElementType COMMENT_QUOTE_OPEN = new Perl6ElementType("COMMENT_QUOTE_OPEN");
    IElementType COMMENT_STARTER = new Perl6ElementType("COMMENT_STARTER");
    IElementType COMPLEX_LITERAL = new Perl6ElementType("COMPLEX_LITERAL");
    IElementType COND_OP_INCOMPLETE = new Perl6ElementType("COND_OP_INCOMPLETE");
    IElementType CONSTANT_ANON = new Perl6ElementType("CONSTANT_ANON");
    IElementType CONSTANT_MISSING_INITIALIZER = new Perl6ElementType("CONSTANT_MISSING_INITIALIZER");
    IElementType CONTEXTUALIZER = new Perl6ElementType("CONTEXTUALIZER");
    IElementType CONTEXTUALIZER_CLOSE = new Perl6ElementType("CONTEXTUALIZER_CLOSE");
    IElementType CONTEXTUALIZER_OPEN = new Perl6ElementType("CONTEXTUALIZER_OPEN");
    IElementType DOTTY_NEXT_TERM = new Perl6ElementType("DOTTY_NEXT_TERM");
    IElementType EAT_TERMINATOR_HAS_HEREDOC = new Perl6ElementType("EAT_TERMINATOR_HAS_HEREDOC");
    IElementType EMPTY_STATEMENT = new Perl6ElementType("EMPTY_STATEMENT");
    IElementType END_OF_EXPR = new Perl6ElementType("END_OF_EXPR");
    IElementType END_OF_PARAMETERS = new Perl6ElementType("END_OF_PARAMETERS");
    IElementType END_OF_STATEMENT = new Perl6ElementType("END_OF_STATEMENT");
    IElementType END_OF_STATEMENT_MARK = new Perl6ElementType("END_OF_STATEMENT_MARK");
    IElementType END_OF_STATEMENT_STOPPER = new Perl6ElementType("END_OF_STATEMENT_STOPPER");
    IElementType ENUM_ANON = new Perl6ElementType("ENUM_ANON");
    IElementType ENUM_INCOMPLETE = new Perl6ElementType("ENUM_INCOMPLETE");
    IElementType ESCAPE_ARRAY = new Perl6ElementType("ESCAPE_ARRAY");
    IElementType ESCAPE_FUNCTION = new Perl6ElementType("ESCAPE_FUNCTION");
    IElementType ESCAPE_HASH = new Perl6ElementType("ESCAPE_HASH");
    IElementType ESCAPE_SCALAR = new Perl6ElementType("ESCAPE_SCALAR");
    IElementType FAKE_INFIX = new Perl6ElementType("FAKE_INFIX");
    IElementType FORMAT_CODE = new Perl6ElementType("FORMAT_CODE");
    IElementType HASH_INDEX_BRACKET_CLOSE = new Perl6ElementType("HASH_INDEX_BRACKET_CLOSE");
    IElementType HASH_INDEX_BRACKET_OPEN = new Perl6ElementType("HASH_INDEX_BRACKET_OPEN");
    IElementType HEREDOC = new Perl6ElementType("HEREDOC");
    IElementType HYPER_METAOP_MISSING = new Perl6ElementType("HYPER_METAOP_MISSING");
    IElementType HYPER_WHATEVER = new Perl6ElementType("HYPER_WHATEVER");
    IElementType INCOMPLETE_SCOPED_DECLARATION = new Perl6ElementType("INCOMPLETE_SCOPED_DECLARATION");
    IElementType INCOMPLETE_TYPE_NAME = new Perl6ElementType("INCOMPLETE_TYPE_NAME");
    IElementType INFIX = new Perl6ElementType("INFIX");
    IElementType INFIX_FUNCTION = new Perl6ElementType("INFIX_FUNCTION");
    IElementType INFIX_NOUN_VARIABLE = new Perl6ElementType("INFIX_NOUN_VARIABLE");
    IElementType INITIALIZER_MISSING = new Perl6ElementType("INITIALIZER_MISSING");
    IElementType INTEGER_LITERAL = new Perl6ElementType("INTEGER_LITERAL");
    IElementType INVOCANT_MARKER = new Perl6ElementType("INVOCANT_MARKER");
    IElementType IS_DOTTY = new Perl6ElementType("IS_DOTTY");
    IElementType IS_PARAM_TERM_QUANT = new Perl6ElementType("IS_PARAM_TERM_QUANT");
    IElementType LABEL_COLON = new Perl6ElementType("LABEL_COLON");
    IElementType LABEL_NAME = new Perl6ElementType("LABEL_NAME");
    IElementType LAMBDA = new Perl6ElementType("LAMBDA");
    IElementType LONGNAME_COLONPAIR = new Perl6ElementType("LONGNAME_COLONPAIR");
    IElementType METAOP = new Perl6ElementType("METAOP");
    IElementType METHOD_CALL_NAME = new Perl6ElementType("METHOD_CALL_NAME");
    IElementType METHOD_CALL_OPERATOR = new Perl6ElementType("METHOD_CALL_OPERATOR");
    IElementType MISSING_BLOCK = new Perl6ElementType("MISSING_BLOCK");
    IElementType MISSING_BLORST = new Perl6ElementType("MISSING_BLORST");
    IElementType MISSING_REGEX = new Perl6ElementType("MISSING_REGEX");
    IElementType MISSING_RETURN_CONSTRAINT = new Perl6ElementType("MISSING_RETURN_CONSTRAINT");
    IElementType MULTI_DECLARATOR = new Perl6ElementType("MULTI_DECLARATOR");
    IElementType NAME = new Perl6ElementType("NAME");
    IElementType NAMED_PARAMETER_NAME_ALIAS = new Perl6ElementType("NAMED_PARAMETER_NAME_ALIAS");
    IElementType NAMED_PARAMETER_SYNTAX = new Perl6ElementType("NAMED_PARAMETER_SYNTAX");
    IElementType NOT_DOTTY = new Perl6ElementType("NOT_DOTTY");
    IElementType NO_ARGS = new Perl6ElementType("NO_ARGS");
    IElementType NULL_TERM = new Perl6ElementType("NULL_TERM");
    IElementType NUMBER_LITERAL = new Perl6ElementType("NUMBER_LITERAL");
    IElementType ONLY_STAR = new Perl6ElementType("ONLY_STAR");
    IElementType PACKAGE_DECLARATOR = new Perl6ElementType("PACKAGE_DECLARATOR");
    IElementType PACKAGE_NAME = new Perl6ElementType("PACKAGE_NAME");
    IElementType PAIR_KEY = new Perl6ElementType("PAIR_KEY");
    IElementType PARAMETER_ANON = new Perl6ElementType("PARAMETER_ANON");
    IElementType PARAMETER_INCOMPLETE = new Perl6ElementType("PARAMETER_INCOMPLETE");
    IElementType PARAMETER_QUANTIFIER = new Perl6ElementType("PARAMETER_QUANTIFIER");
    IElementType PARAMETER_SEPARATOR = new Perl6ElementType("PARAMETER_SEPARATOR");
    IElementType PARAM_ARRAY_SHAPE = new Perl6ElementType("PARAM_ARRAY_SHAPE");
    IElementType PARENTHESES_CLOSE = new Perl6ElementType("PARENTHESES_CLOSE");
    IElementType PARENTHESES_OPEN = new Perl6ElementType("PARENTHESES_OPEN");
    IElementType PARSING_INITIALIZER = new Perl6ElementType("PARSING_INITIALIZER");
    IElementType PHASER = new Perl6ElementType("PHASER");
    IElementType POD_CODE = new Perl6ElementType("POD_CODE");
    IElementType POD_CONFIGURATION = new Perl6ElementType("POD_CONFIGURATION");
    IElementType POD_DIRECTIVE = new Perl6ElementType("POD_DIRECTIVE");
    IElementType POD_FINISH_TEXT = new Perl6ElementType("POD_FINISH_TEXT");
    IElementType POD_FORMAT_SEPARATOR = new Perl6ElementType("POD_FORMAT_SEPARATOR");
    IElementType POD_FORMAT_STARTER = new Perl6ElementType("POD_FORMAT_STARTER");
    IElementType POD_FORMAT_STOPPER = new Perl6ElementType("POD_FORMAT_STOPPER");
    IElementType POD_HAVE_CONTENT = new Perl6ElementType("POD_HAVE_CONTENT");
    IElementType POD_NEWLINE = new Perl6ElementType("POD_NEWLINE");
    IElementType POD_REMOVED_WHITESPACE = new Perl6ElementType("POD_REMOVED_WHITESPACE");
    IElementType POD_TEXT = new Perl6ElementType("POD_TEXT");
    IElementType POD_TYPENAME = new Perl6ElementType("POD_TYPENAME");
    IElementType POD_WHITESPACE = new Perl6ElementType("POD_WHITESPACE");
    IElementType POSTFIX = new Perl6ElementType("POSTFIX");
    IElementType POSTFIX_INTERPOLATIN = new Perl6ElementType("POSTFIX_INTERPOLATIN");
    IElementType PREFIX = new Perl6ElementType("PREFIX");
    IElementType QUASI = new Perl6ElementType("QUASI");
    IElementType QUOTE_MOD = new Perl6ElementType("QUOTE_MOD");
    IElementType QUOTE_PAIR = new Perl6ElementType("QUOTE_PAIR");
    IElementType QUOTE_REGEX = new Perl6ElementType("QUOTE_REGEX");
    IElementType RADIX_NUMBER = new Perl6ElementType("RADIX_NUMBER");
    IElementType RAT_LITERAL = new Perl6ElementType("RAT_LITERAL");
    IElementType REGEX_ANCHOR = new Perl6ElementType("REGEX_ANCHOR");
    IElementType REGEX_ASSERTION_ANGLE_CLOSE = new Perl6ElementType("REGEX_ASSERTION_ANGLE_CLOSE");
    IElementType REGEX_ASSERTION_ANGLE_OPEN = new Perl6ElementType("REGEX_ASSERTION_ANGLE_OPEN");
    IElementType REGEX_ASSERTION_END = new Perl6ElementType("REGEX_ASSERTION_END");
    IElementType REGEX_BACKSLASH_BAD = new Perl6ElementType("REGEX_BACKSLASH_BAD");
    IElementType REGEX_BUILTIN_CCLASS = new Perl6ElementType("REGEX_BUILTIN_CCLASS");
    IElementType REGEX_CAPTURE_NAME = new Perl6ElementType("REGEX_CAPTURE_NAME");
    IElementType REGEX_CAPTURE_PARENTHESES_CLOSE = new Perl6ElementType("REGEX_CAPTURE_PARENTHESES_CLOSE");
    IElementType REGEX_CAPTURE_PARENTHESES_OPEN = new Perl6ElementType("REGEX_CAPTURE_PARENTHESES_OPEN");
    IElementType REGEX_CCLASS_ATOM = new Perl6ElementType("REGEX_CCLASS_ATOM");
    IElementType REGEX_CCLASS_INCOMPLETE = new Perl6ElementType("REGEX_CCLASS_INCOMPLETE");
    IElementType REGEX_CCLASS_SYNTAX = new Perl6ElementType("REGEX_CCLASS_SYNTAX");
    IElementType REGEX_DECLARATOR = new Perl6ElementType("REGEX_DECLARATOR");
    IElementType REGEX_GROUP_BRACKET_CLOSE = new Perl6ElementType("REGEX_GROUP_BRACKET_CLOSE");
    IElementType REGEX_GROUP_BRACKET_OPEN = new Perl6ElementType("REGEX_GROUP_BRACKET_OPEN");
    IElementType REGEX_INFIX = new Perl6ElementType("REGEX_INFIX");
    IElementType REGEX_LOOKAROUND = new Perl6ElementType("REGEX_LOOKAROUND");
    IElementType REGEX_MISSING_ASSERTION = new Perl6ElementType("REGEX_MISSING_ASSERTION");
    IElementType REGEX_MISSING_TERM = new Perl6ElementType("REGEX_MISSING_TERM");
    IElementType REGEX_MOD_INTERNAL = new Perl6ElementType("REGEX_MOD_INTERNAL");
    IElementType REGEX_MOD_INTERNAL_NUMERIC = new Perl6ElementType("REGEX_MOD_INTERNAL_NUMERIC");
    IElementType REGEX_MOD_UNKNOWN = new Perl6ElementType("REGEX_MOD_UNKNOWN");
    IElementType REGEX_QUANTIFIER = new Perl6ElementType("REGEX_QUANTIFIER");
    IElementType REGEX_QUANTIFIER_MISSING = new Perl6ElementType("REGEX_QUANTIFIER_MISSING");
    IElementType REGEX_SIGSPACE = new Perl6ElementType("REGEX_SIGSPACE");
    IElementType REGEX_VARIABLE = new Perl6ElementType("REGEX_VARIABLE");
    IElementType REGEX_VARIABLE_BINDING = new Perl6ElementType("REGEX_VARIABLE_BINDING");
    IElementType REGEX_VARIABLE_BINDING_INCOMPLETE = new Perl6ElementType("REGEX_VARIABLE_BINDING_INCOMPLETE");
    IElementType RETURN_ARROW = new Perl6ElementType("RETURN_ARROW");
    IElementType ROUTINE_DECLARATOR = new Perl6ElementType("ROUTINE_DECLARATOR");
    IElementType ROUTINE_NAME = new Perl6ElementType("ROUTINE_NAME");
    IElementType SCOPE_DECLARATOR = new Perl6ElementType("SCOPE_DECLARATOR");
    IElementType SELF = new Perl6ElementType("SELF");
    IElementType SELF_CALL_VARIABLE = new Perl6ElementType("SELF_CALL_VARIABLE");
    IElementType SELF_CALL_VARIABLE_ARGS = new Perl6ElementType("SELF_CALL_VARIABLE_ARGS");
    IElementType SEMI_LIST_END = new Perl6ElementType("SEMI_LIST_END");
    IElementType SHAPE_DECLARATION = new Perl6ElementType("SHAPE_DECLARATION");
    IElementType SIGNATURE_BRACKET_CLOSE = new Perl6ElementType("SIGNATURE_BRACKET_CLOSE");
    IElementType SIGNATURE_BRACKET_OPEN = new Perl6ElementType("SIGNATURE_BRACKET_OPEN");
    IElementType SIMPLE_CONTEXTUALIZER = new Perl6ElementType("SIMPLE_CONTEXTUALIZER");
    IElementType STATEMENT_CONTROL = new Perl6ElementType("STATEMENT_CONTROL");
    IElementType STATEMENT_MOD_COND = new Perl6ElementType("STATEMENT_MOD_COND");
    IElementType STATEMENT_MOD_LOOP = new Perl6ElementType("STATEMENT_MOD_LOOP");
    IElementType STATEMENT_PREFIX = new Perl6ElementType("STATEMENT_PREFIX");
    IElementType STATEMENT_TERMINATOR = new Perl6ElementType("STATEMENT_TERMINATOR");
    IElementType STRING_LITERAL_CHAR = new Perl6ElementType("STRING_LITERAL_CHAR");
    IElementType STRING_LITERAL_ESCAPE = new Perl6ElementType("STRING_LITERAL_ESCAPE");
    IElementType STRING_LITERAL_QUOTE_CLOSE = new Perl6ElementType("STRING_LITERAL_QUOTE_CLOSE");
    IElementType STRING_LITERAL_QUOTE_OPEN = new Perl6ElementType("STRING_LITERAL_QUOTE_OPEN");
    IElementType STRING_LITERAL_QUOTE_SYNTAX = new Perl6ElementType("STRING_LITERAL_QUOTE_SYNTAX");
    IElementType STRING_LITERAL_REQUOTE_ESCAPE = new Perl6ElementType("STRING_LITERAL_REQUOTE_ESCAPE");
    IElementType STUB_CODE = new Perl6ElementType("STUB_CODE");
    IElementType SUBSET_ANON = new Perl6ElementType("SUBSET_ANON");
    IElementType SUBSET_INCOMPLETE = new Perl6ElementType("SUBSET_INCOMPLETE");
    IElementType SUBST_ASSIGNISH = new Perl6ElementType("SUBST_ASSIGNISH");
    IElementType SUB_CALL_NAME = new Perl6ElementType("SUB_CALL_NAME");
    IElementType TERM = new Perl6ElementType("TERM");
    IElementType TERM_DECLARATION_BACKSLASH = new Perl6ElementType("TERM_DECLARATION_BACKSLASH");
    IElementType TERM_IS_MULTI = new Perl6ElementType("TERM_IS_MULTI");
    IElementType TRAIT = new Perl6ElementType("TRAIT");
    IElementType TRAIT_INCOMPLETE = new Perl6ElementType("TRAIT_INCOMPLETE");
    IElementType TRANS_BAD = new Perl6ElementType("TRANS_BAD");
    IElementType TRANS_CHAR = new Perl6ElementType("TRANS_CHAR");
    IElementType TRANS_ESCAPE = new Perl6ElementType("TRANS_ESCAPE");
    IElementType TRANS_RANGE = new Perl6ElementType("TRANS_RANGE");
    IElementType TRUSTS = new Perl6ElementType("TRUSTS");
    IElementType TR_DISTINCT_START_STOP = new Perl6ElementType("TR_DISTINCT_START_STOP");
    IElementType TYPE_COERCION_PARENTHESES_CLOSE = new Perl6ElementType("TYPE_COERCION_PARENTHESES_CLOSE");
    IElementType TYPE_COERCION_PARENTHESES_OPEN = new Perl6ElementType("TYPE_COERCION_PARENTHESES_OPEN");
    IElementType TYPE_CONST = new Perl6ElementType("TYPE_CONST");
    IElementType TYPE_DECLARATOR = new Perl6ElementType("TYPE_DECLARATOR");
    IElementType TYPE_PARAMETER_BRACKET = new Perl6ElementType("TYPE_PARAMETER_BRACKET");
    IElementType UNSPACED_POSTFIX = new Perl6ElementType("UNSPACED_POSTFIX");
    IElementType UNSP_WHITE_SPACE = new Perl6ElementType("UNSP_WHITE_SPACE");
    IElementType UNV_WHITE_SPACE = new Perl6ElementType("UNV_WHITE_SPACE");
    IElementType VARIABLE = new Perl6ElementType("VARIABLE");
    IElementType VARIABLE_REGEX_NAMED_CAPTURE = new Perl6ElementType("VARIABLE_REGEX_NAMED_CAPTURE");
    IElementType VERSION = new Perl6ElementType("VERSION");
    IElementType VERTICAL_WHITE_SPACE = new Perl6ElementType("VERTICAL_WHITE_SPACE");
    IElementType WHATEVER = new Perl6ElementType("WHATEVER");
    IElementType WHERE_CONSTRAINT = new Perl6ElementType("WHERE_CONSTRAINT");
    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
    IElementType WS_OUTSIDE_LIST = new Perl6ElementType("WS_OUTSIDE_LIST");
}
