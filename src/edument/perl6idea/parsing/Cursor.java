package edument.perl6idea.parsing;

import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

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

    /* Flag that is set when the rule passes. */
    public boolean passed;

    /* The backtrack points stack, used to decide where to go upon a fail. Created lazily on
    * first need for it. Contains groups of 4 integers, which are:
     * 0. The location in the rule to backtrack to
     * 1. The position to reset pos to
     * 2. A repetition count, or zero (for quantifiers)
     * 3. The height of the capture stack at the point the mark was made
     */
    private List<Integer> backtrackStack;

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

    public boolean isFailed() {
        return !passed;
    }

    public int getPos() {
        return pos;
    }

    public void bsMark(int state) {
        pushBsMark(state, pos, 0);
    }

    public void bsMark(int state, int rep) {
        pushBsMark(state, pos, rep);
    }

    public void bsFailMark(int state) {
        pushBsMark(state, -1, 0);
    }

    private void pushBsMark(int state, int pos, int rep) {
        if (backtrackStack == null)
            backtrackStack = new ArrayList<>();
        backtrackStack.add(state);
        backtrackStack.add(pos);
        backtrackStack.add(rep);
        backtrackStack.add(0);
    }

    public int peekRep(int state) {
        int cursor = backtrackStack.size() - 4;
        while (true) {
            if (backtrackStack.get(cursor) == state)
                return backtrackStack.get(cursor + 2);
            cursor -= 4;
        }
    }

    public void bsCommit(int state) {
        while (true) {
            int removeState = backtrackStack.get(backtrackStack.size() - 4);
            for (int i = 0; i < 4; i++)
                backtrackStack.remove(backtrackStack.size() - 1);
            if (state == removeState)
                return;
        }
    }

    public boolean backtrack() {
        if (backtrackStack == null)
            return false;
        while (backtrackStack.size() > 0) {
            int toPos = backtrackStack.get(backtrackStack.size() - 3);
            int toState = backtrackStack.get(backtrackStack.size() - 4);
            if (toPos < 0) {
                /* Just remove this mark and continue backtracking. */
                for (int i = 0; i < 4; i++)
                    backtrackStack.remove(backtrackStack.size() - 1);
            }
            else {
                /* Restore state and position, remove mark, and we're done. */
                state = toState;
                pos = toPos;
                for (int i = 0; i < 4; i++)
                    backtrackStack.remove(backtrackStack.size() - 1);
                return true;
            }
        }
        return false;
    }

    public void startToken(IElementType token) {
        stack.token = token;
        stack.tokenStart = pos;
    }

    public boolean literal(String value) {
        int end = pos + value.length();
        if (end <= stack.target.length()) {
            if (value.contentEquals(stack.target.subSequence(pos, end))) {
                pos += value.length();
                return true;
            }
        }
        return false;
    }

    public boolean inCharList(String chars) {
        if (pos < stack.target.length()) {
            if (chars.contains(stack.target.subSequence(pos, pos + 1))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean notInCharList(String chars) {
        if (pos < stack.target.length()) {
            CharSequence checkChar = stack.target.subSequence(pos, pos + 1);
            if (!chars.contains(checkChar)) {
                pos++;
                return true;
            }
        }
        return false;
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

    public boolean alphaChar() {
        if (pos < stack.target.length()) {
            if (Character.isLetter(stack.target.charAt(pos))) {
                pos++;
                return true;
            }
        }
        return false;
    }

    public boolean rightWordBoundary() {
        // Always a boundary at the end; never a boundary at the start.
        if (pos == stack.target.length())
            return true;
        if (pos == 0)
            return false;

        // Otherwise, char before current position should be a word char
        // and char afterwards should not be.
        return Character.isLetterOrDigit(stack.target.charAt(pos - 1)) &&
                !Character.isLetterOrDigit(stack.target.charAt(pos));
    }

    public boolean lookahead(int ruleNumber) {
        // Save original token and token start.
        int origTokenStart = stack.tokenStart;
        IElementType origToken = stack.token;

        // Run ignoring any tokens, until we leave the base.
        Cursor<TCursor> base = stack.peek().start(ruleNumber);
        stack.push(base);
        boolean poppedBase = false;
        boolean result = false;
        while (!poppedBase) {
            int outcome = stack.peek().runRule();
            switch (outcome) {
                case -1: {
                    Cursor<TCursor> popped = stack.pop();
                    if (popped == base) {
                        result = true;
                        poppedBase = true;
                    }
                    continue;
                }
                case -2: {
                    Cursor<TCursor> popped = stack.pop();
                    if (popped == base)
                        poppedBase = true;
                }
                case -3:
                    continue;
                default:
                    stack.push(stack.peek().start(outcome));
            }
        }

        // Restore original token and token start.
        stack.token = origToken;
        stack.tokenStart = origTokenStart;

        // Return lookahead result.
        return result;
    }

    public abstract int runRule();
}
