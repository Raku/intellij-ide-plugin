package edument.perl6idea.editor;

import com.intellij.lang.BracePair;
import com.intellij.lang.PairedBraceMatcher;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import edument.perl6idea.parsing.Perl6TokenTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Perl6BraceMatcher implements PairedBraceMatcher {
    @NotNull
    @Override
    public BracePair[] getPairs() {
        return new BracePair[]{
                new BracePair(Perl6TokenTypes.BLOCK_CURLY_BRACKET, Perl6TokenTypes.BLOCK_CURLY_BRACKET, false),
                new BracePair(Perl6TokenTypes.STRING_LITERAL_QUOTE, Perl6TokenTypes.STRING_LITERAL_QUOTE, false),
                new BracePair(Perl6TokenTypes.PARENTHESES, Perl6TokenTypes.PARENTHESES, false)
        };
    }

    @Override
    public boolean isPairedBracesAllowedBeforeType(@NotNull IElementType lbraceType, @Nullable IElementType contextType) {
        return true;
    }

    @Override
    public int getCodeConstructStart(PsiFile file, int openingBraceOffset) {
        return openingBraceOffset;
    }
}
