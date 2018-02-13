package edument.perl6idea.parsing;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

/* Implementation of operator precedence parsing. A given instance of this tracks the
 * state needed to do the precedence parse. */
public class OPP {
    private class Op {
        public String prec;
        public String assoc;
        public PsiBuilder.Marker startMarker; // For prefixes
        public PsiBuilder.Marker endMarker;   // For postfixes
    }

    private class Term {
        public PsiBuilder.Marker startMarker;
        public PsiBuilder.Marker endMarker;
    }

    private PsiBuilder builder;

    private PsiBuilder.Marker curPrefixStartMarker;
    private PsiBuilder.Marker termStartMarker;
    private PsiBuilder.Marker termEndMarker;
    private List<Op> prefixes = new ArrayList<>();
    private List<Op> postfixes = new ArrayList<>();
    private List<Op> opStack = new ArrayList<>();
    private List<Term> termStack = new ArrayList<>();

    public OPP(PsiBuilder builder) {
        this.builder = builder;
    }

    public void startExpr() {
        // Nothing to do
    }

    public void startPrefixes() {
        curPrefixStartMarker = builder.mark();
    }

    public void pushPrefix() {
        PrecInfoToken precInfo = getPrecInfoToken();
        Op prefix = new Op();
        prefix.prec = precInfo.prec();
        prefix.assoc = precInfo.assoc();
        prefix.startMarker = curPrefixStartMarker;
        prefixes.add(prefix);
        curPrefixStartMarker = builder.mark();
    }

    public void endPrefixes() {
        curPrefixStartMarker.drop(); // There were no more prefixes
        termStartMarker = builder.mark();
    }

    public void startPostfixes() {
        termEndMarker = builder.mark();
    }

    public void pushPostfix() {
        PrecInfoToken precInfo = getPrecInfoToken();
        Op postfix = new Op();
        postfix.prec = precInfo.prec();
        postfix.assoc = precInfo.assoc();
        postfix.endMarker = builder.mark();
        postfixes.add(postfix);
    }

    public void endPostfixes() {
        // Interleave prefix and postfix operators onto the op stack.
        while (prefixes.size() > 0 && postfixes.size() > 0) {
            Op preO = prefixes.get(0);
            Op postO = postfixes.get(postfixes.size() - 1);
            String prePrec = preO.prec;
            String postPrec = postO.prec;

            if (gt(postPrec, prePrec)) {
                opStack.add(prefixes.remove(0));
            }
            else if (lt(postPrec, prePrec)) {
                opStack.add(postfixes.remove(postfixes.size() - 1));
            }
            else if (postO.assoc.contentEquals("right")) {
                opStack.add(prefixes.remove(0));
            }
            else if (postO.assoc.contentEquals("left")) {
                opStack.add(postfixes.remove(postfixes.size() - 1));
            }
            else {
                // Non-assoc error; pretend left, parse for now.
                opStack.add(postfixes.remove(postfixes.size() - 1));
            }
        }
        while (prefixes.size() > 0)
            opStack.add(prefixes.remove(0));
        while (postfixes.size() > 0)
            opStack.add(postfixes.remove(postfixes.size() - 1));

        // Push term onto the term stack.
        Term term = new Term();
        term.startMarker = termStartMarker;
        term.endMarker = termEndMarker;
        termStack.add(term);

        // Clear up prefix start marker.
        curPrefixStartMarker = null;
    }

    public void startInfix() {
    }

    public void endInfix() {
        PrecInfoToken precInfo = getPrecInfoToken();
        Op op = new Op();
        op.prec = precInfo.prec();
        op.assoc = precInfo.assoc();
        opStack.add(op);
    }

    public void endExpr() {
        // XXX For now, just clear away all markers at the end (since we aren't
        // actually reducing the stack yet).
        for (Op op : opStack) {
            if (op.startMarker != null)
                op.startMarker.drop();
            if (op.endMarker != null)
                op.endMarker.drop();
        }
        for (Term term : termStack) {
            term.startMarker.drop();
            term.endMarker.drop();
        }
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

    private static boolean lt(String a, String b) {
        return a.compareTo(b) < 0 ? true : false;
    }

    public static boolean gt(String a, String b) {
        return a.compareTo(b) > 0 ? true : false;
    }
}
