package edument.perl6idea.utils;

import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiWhiteSpace;
import org.jetbrains.annotations.Nullable;

import static edument.perl6idea.parsing.Perl6TokenTypes.UNV_WHITE_SPACE;

public class Perl6PsiUtil {
    /**
     * If node element is a white space one, get next or prev non-whitespace sibling
     * @param node starting node to move from
     * @param toRight direction of move, next sibling if true, prev otherwise
     * @return non-whitespace PsiElement or null
     */
    @Nullable
    public static PsiElement skipSpaces(PsiElement node, boolean toRight) {
        PsiElement temp = node;
        while (temp != null && (temp instanceof PsiWhiteSpace || temp.getNode().getElementType().equals(UNV_WHITE_SPACE)))
            temp = toRight ? temp.getNextSibling() : temp.getPrevSibling();
        return temp;
    }
}
