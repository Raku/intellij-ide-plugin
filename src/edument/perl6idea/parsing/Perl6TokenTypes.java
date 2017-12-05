package edument.perl6idea.parsing;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;

public interface Perl6TokenTypes {
    IElementType STATEMENT_TERMINATOR = new Perl6ElementType("STATEMENT_TERMINATOR");
    IElementType STATEMENT_CONTROL = new Perl6ElementType("STATEMENT_CONTROL");
    IElementType BAD_CHARACTER = TokenType.BAD_CHARACTER;
    IElementType NAME = new Perl6ElementType("NAME");
    IElementType WHITE_SPACE = TokenType.WHITE_SPACE;
}
