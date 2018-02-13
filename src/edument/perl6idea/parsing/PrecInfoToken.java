package edument.perl6idea.parsing;

import com.intellij.psi.tree.IElementType;
import edument.perl6idea.Perl6Language;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class PrecInfoToken extends IElementType {
    private String prec;
    private String assoc;

    private PrecInfoToken(@NotNull String prec, String assoc) {
        super("PrecInfo: " + prec + ", " + assoc, Perl6Language.INSTANCE);
        this.prec = prec;
        this.assoc = assoc;
    }

    public String prec() {
        return prec;
    }

    public String assoc() {
        return assoc;
    }

    private static Map<String, PrecInfoToken> cache = new HashMap<>();

    public static PrecInfoToken tokenFor(String prec, String assoc) {
        String key = prec + "\0" + assoc;
        synchronized (cache) {
            PrecInfoToken found = cache.get(key);
            if (found == null) {
                found = new PrecInfoToken(prec, assoc);
                cache.put(key, found);
            }
            return found;
        }
    }
}
