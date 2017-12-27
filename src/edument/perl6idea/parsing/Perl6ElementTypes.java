package edument.perl6idea.parsing;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import edument.perl6idea.Perl6Language;

public interface Perl6ElementTypes {
    IFileElementType FILE = new IFileElementType(Perl6Language.INSTANCE);
    IElementType INFIX = new Perl6ElementType("INFIX");
    IElementType VARIABLE = new Perl6ElementType("VARIABLE");
    IElementType POSTFIX = new Perl6ElementType("POSTFIX");
    IElementType PREFIX = new Perl6ElementType("PREFIX");
    IElementType EXPR = new Perl6ElementType("EXPR");
    IElementType STATEMENT = new Perl6ElementType("STATEMENT");
    IElementType USE_STATEMENT = new Perl6ElementType("USE_STATEMENT");
    IElementType STATEMENT_LIST = new Perl6ElementType("STATEMENT_LIST");
}
