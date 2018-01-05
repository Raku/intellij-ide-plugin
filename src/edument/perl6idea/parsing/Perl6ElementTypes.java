package edument.perl6idea.parsing;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import edument.perl6idea.Perl6Language;

public interface Perl6ElementTypes {
    IFileElementType FILE = new IFileElementType(Perl6Language.INSTANCE);
    IElementType SEMI_LIST = new Perl6ElementType("SEMI_LIST");
    IElementType FOR_STATEMENT = new Perl6ElementType("FOR_STATEMENT");
    IElementType HYPER_WHATEVER = new Perl6ElementType("HYPER_WHATEVER");
    IElementType HASH_INDEX = new Perl6ElementType("HASH_INDEX");
    IElementType SCOPED_DECLARATION = new Perl6ElementType("SCOPED_DECLARATION");
    IElementType VARIABLE_DECLARATION = new Perl6ElementType("VARIABLE_DECLARATION");
    IElementType POSTFIX = new Perl6ElementType("POSTFIX");
    IElementType PHASER = new Perl6ElementType("PHASER");
    IElementType METHOD_CALL = new Perl6ElementType("METHOD_CALL");
    IElementType PREFIX = new Perl6ElementType("PREFIX");
    IElementType STATEMENT = new Perl6ElementType("STATEMENT");
    IElementType WHILE_STATEMENT = new Perl6ElementType("WHILE_STATEMENT");
    IElementType WHEN_STATEMENT = new Perl6ElementType("WHEN_STATEMENT");
    IElementType STATEMENT_MOD_COND = new Perl6ElementType("STATEMENT_MOD_COND");
    IElementType STRING_LITERAL = new Perl6ElementType("STRING_LITERAL");
    IElementType EXPR = new Perl6ElementType("EXPR");
    IElementType CALL = new Perl6ElementType("CALL");
    IElementType QUIT_STATEMENT = new Perl6ElementType("QUIT_STATEMENT");
    IElementType STATEMENT_MOD_LOOP = new Perl6ElementType("STATEMENT_MOD_LOOP");
    IElementType SUB_CALL = new Perl6ElementType("SUB_CALL");
    IElementType RAT_LITERAL = new Perl6ElementType("RAT_LITERAL");
    IElementType MULTI_DECLARATION = new Perl6ElementType("MULTI_DECLARATION");
    IElementType NUMBER_LITERAL = new Perl6ElementType("NUMBER_LITERAL");
    IElementType INTEGER_LITERAL = new Perl6ElementType("INTEGER_LITERAL");
    IElementType UNTIL_STATEMENT = new Perl6ElementType("UNTIL_STATEMENT");
    IElementType REPEAT_STATEMENT = new Perl6ElementType("REPEAT_STATEMENT");
    IElementType WHENEVER_STATEMENT = new Perl6ElementType("WHENEVER_STATEMENT");
    IElementType DEFAULT_STATEMENT = new Perl6ElementType("DEFAULT_STATEMENT");
    IElementType ROUTINE_DECLARATION = new Perl6ElementType("ROUTINE_DECLARATION");
    IElementType ARRAY_INDEX = new Perl6ElementType("ARRAY_INDEX");
    IElementType WITHOUT_STATEMENT = new Perl6ElementType("WITHOUT_STATEMENT");
    IElementType VARIABLE = new Perl6ElementType("VARIABLE");
    IElementType INFIX = new Perl6ElementType("INFIX");
    IElementType BLOCK = new Perl6ElementType("BLOCK");
    IElementType LOOP_STATEMENT = new Perl6ElementType("LOOP_STATEMENT");
    IElementType TYPE_NAME = new Perl6ElementType("TYPE_NAME");
    IElementType UNLESS_STATEMENT = new Perl6ElementType("UNLESS_STATEMENT");
    IElementType CATCH_STATEMENT = new Perl6ElementType("CATCH_STATEMENT");
    IElementType CONTROL_STATEMENT = new Perl6ElementType("CONTROL_STATEMENT");
    IElementType SIGNATURE = new Perl6ElementType("SIGNATURE");
    IElementType STATEMENT_LIST = new Perl6ElementType("STATEMENT_LIST");
    IElementType USE_STATEMENT = new Perl6ElementType("USE_STATEMENT");
    IElementType IF_STATEMENT = new Perl6ElementType("IF_STATEMENT");
    IElementType WHATEVER = new Perl6ElementType("WHATEVER");
    IElementType GIVEN_STATEMENT = new Perl6ElementType("GIVEN_STATEMENT");
}
