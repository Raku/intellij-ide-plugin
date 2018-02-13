package edument.perl6idea.parsing;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

/* Implementation of operator precedence parsing. A given instance of this tracks the
 * state needed to do the precedence parse. */
public class OPP {
    private PsiBuilder builder;

    public OPP(PsiBuilder builder) {
        this.builder = builder;
    }

    public void startExpr() {
    }

    public void startInfix() {
    }

    public void endInfix() {
        PrecInfoToken precInfo = getPrecInfoToken();
    }

    public void endExpr() {
    }

    public void startPrefixes() {
    }

    public void pushPrefix() {
        PrecInfoToken precInfo = getPrecInfoToken();
    }

    public void endPrefixes() {
    }

    public void startPostfixes() {
    }

    public void pushPostfix() {
        PrecInfoToken precInfo = getPrecInfoToken();
    }

    public void endPostfixes() {
    }

    private PrecInfoToken getPrecInfoToken() {
        IElementType token = builder.getTokenType();
        if (token instanceof PrecInfoToken) {
            builder.advanceLexer();
            return (PrecInfoToken)token;
        }
        else {
            throw new RuntimeException("Missing precedence info token");
        }
    }

}
