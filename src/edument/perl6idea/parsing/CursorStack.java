package edument.perl6idea.parsing;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a stack of Cursor objects, the top one being the current one in use.
 */
public class CursorStack {
    private List<Cursor> cursors = new ArrayList<Cursor>();
    public CharSequence target;

    public CursorStack(CharSequence target) {
        this.target = target;
    }

    public void push(Cursor c) {
        cursors.add(c);
    }

    public Cursor peek() {
        return cursors.get(cursors.size() - 1);
    }
}
