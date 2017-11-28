package edument.perl6idea.parsing;

import java.lang.reflect.InvocationTargetException;

/**
 * This works much like the Cursor class in Perl 6: it is the base class for grammars, and contains the state of an
 * ongoing rule parse along with having a bunch of methods used to implement parsing.
 */
public class Cursor<TCursor extends Cursor> {
    public CharSequence target;
    public int pos;
    public int from;
    public int to;

    public TCursor forTarget(String target) {
        TCursor cursor = null;
        try {
            cursor = (TCursor)this.getClass().getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        cursor.target = target;
        cursor.pos = 0;
        cursor.from = 0;
        cursor.to = -1;
        return cursor;
    }

    public TCursor start() {
        TCursor cursor = null;
        try {
            cursor = (TCursor)this.getClass().getConstructors()[0].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        cursor.target = target;
        cursor.pos = this.pos;
        cursor.from = this.pos;
        cursor.to = -1;
        return cursor;
    }
}
