package edument.perl6idea.parsing;

import com.intellij.lexer.LexerBase;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Perl6Lexer extends LexerBase {
    private CursorStack stack;

    @Override
    public void start(@NotNull CharSequence buffer, int startOffset, int endOffset, int initialState) {
        if (initialState == 0) {
            stack = new CursorStack(buffer);
            stack.push(new MAINBraid().initialize(stack));
            advance();
        } else {
            throw new RuntimeException("Relexing NYI");
        }
    }

    @Override
    public int getState() {
        return 0;
    }

    @Nullable
    @Override
    public IElementType getTokenType() {
        return stack.token;
    }

    @Override
    public int getTokenStart() {
        return stack.tokenStart;
    }

    @Override
    public int getTokenEnd() {
        return stack.peek().pos;
    }

    @Override
    public void advance() {
        while (true) {
            int outcome = stack.peek().runRule();
            switch (outcome) {
                case -1:
                    stack.pop().passed = true;
                    if (stack.isEmpty()) {
                        stack.token = null;
                        return;
                    }
                    continue;
                case -2:
                    stack.pop();
                    if (stack.isEmpty()) {
                        System.err.println("Perl 6 lexer: failed to lex the whole file");
                        stack.token = null;
                        return;
                    }
                    continue;
                case -3:
                    return;
                default:
                    stack.push(stack.peek().start(outcome));
            }
        }
    }

    @NotNull
    @Override
    public CharSequence getBufferSequence() {
        return stack.target;
    }

    @Override
    public int getBufferEnd() {
        return stack.target.length(); // XXX
    }
}
