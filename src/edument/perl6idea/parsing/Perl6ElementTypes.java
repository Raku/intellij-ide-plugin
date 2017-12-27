package edument.perl6idea.parsing;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import edument.perl6idea.Perl6Language;

public interface Perl6ElementTypes {
    IFileElementType FILE = new IFileElementType(Perl6Language.INSTANCE);
    IElementType STATEMENT = new Perl6ElementType("STATEMENT");
    IElementType USE_STATEMENT = new Perl6ElementType("USE_STATEMENT");
    IElementType STATEMENT_LIST = new Perl6ElementType("STATEMENT_LIST");
}
