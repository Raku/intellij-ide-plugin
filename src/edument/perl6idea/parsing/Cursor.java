package edument.perl6idea.parsing;

import com.intellij.psi.tree.IElementType;

/**
 * This works much like the Cursor class in Perl 6: it is the base class for grammars, and contains the state of an
 * ongoing rule parse along with having a bunch of methods used to implement parsing.
 */
public abstract class Cursor<TCursor extends Cursor> {
    /* The cursor stack we're part of. */
    public CursorStack stack;

    /* The number of the rule the cursor is currently in. */
    public int ruleNumber;

    /* The current state of the rule (this is updated by rule parsers). */
    public int state;

    /* The current position in that string. */
    public int pos;

    /* The result of the last subrule call this Cursor made. */
    public Cursor lastResult;

    public TCursor initialize(CursorStack stack) {
        TCursor cursor = null;
        try {
            cursor = (TCursor)this.getClass().getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        cursor.stack = stack;
        this.ruleNumber = 0;
        cursor.state = 0;
        cursor.pos = 0;
        return cursor;
    }

    public TCursor start(int ruleNumber) {
        TCursor cursor = null;
        try {
            cursor = (TCursor)this.getClass().getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        cursor.stack = stack;
        cursor.ruleNumber = ruleNumber;
        cursor.state = 0;
        cursor.pos = this.pos;
        return cursor;
    }

    public void startToken(IElementType token) {
        stack.token = token;
    }

    public boolean anyChar() {
        if (pos < stack.target.length()) {
            pos++;
            return true;
        }
        return false;
    }

    public boolean wordChar() {
        if (pos < stack.target.length()) {
            if (Character.isLetterOrDigit(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean notWordChar() {
        if (pos < stack.target.length()) {
            if (!Character.isLetterOrDigit(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean digitChar() {
        if (pos < stack.target.length()) {
            if (Character.isDigit(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean notDigitChar() {
        if (pos < stack.target.length()) {
            if (!Character.isDigit(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean spaceChar() {
        if (pos < stack.target.length()) {
            if (Character.isWhitespace(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean notSpaceChar() {
        if (pos < stack.target.length()) {
            if (!Character.isWhitespace(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public abstract int runRule();
}
