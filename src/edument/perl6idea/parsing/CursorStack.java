package edument.perl6idea.parsing;

import com.intellij.psi.tree.IElementType;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a stack of Cursor objects, the top one being the current one in use.
 */
public class CursorStack {
    /* The stack of cursors, current one at the top. */
    private List<Cursor> cursors = new ArrayList<Cursor>();

    /* Target of the parse. */
    public CharSequence target;

    /* The current token we're going to produce. */
    public IElementType token;
    public int tokenStart;

    /* Arguments being passed between rules. */
    public Object[] args;

    public CursorStack(CharSequence target) {
        this.target = target;
    }

    public void push(Cursor c) {
        cursors.add(c);
    }

    public Cursor peek() {
        return cursors.get(cursors.size() - 1);
    }

    public Cursor pop() {
        int top = cursors.size() - 1;
        Cursor result = cursors.get(top);
        cursors.remove(top);
        if (top != 0)
            cursors.get(top - 1).lastResult = result;
        return result;
    }

    public boolean isEmpty() {
        return cursors.isEmpty();
    }

    public Object findDynamicVariable(String variableName) {
        int top = cursors.size() - 1;
        while (top >= 0) {
            Object found = cursors.get(top).getDynamicVariable(variableName);
            if (found != null)
                return found;
            top--;
        }
        return null;
    }
}
