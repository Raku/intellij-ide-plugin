package edument.perl6idea.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import edument.perl6idea.parsing.Perl6ElementTypes;
import edument.perl6idea.parsing.Perl6TokenTypes;
import edument.perl6idea.pod.PodDomFormatted;
import edument.perl6idea.pod.PodDomNode;
import edument.perl6idea.pod.PodDomText;
import edument.perl6idea.psi.PodFormatted;
import org.jetbrains.annotations.NotNull;

public class PodFormattedImpl extends ASTWrapperPsiElement implements PodFormatted {
    public PodFormattedImpl(@NotNull ASTNode node) {
        super(node);
    }

    @Override
    public String getFormatCode() {
        PsiElement code = findChildByType(Perl6TokenTypes.FORMAT_CODE);
        return code == null ? "" : code.getText();
    }

    @Override
    public TextRange getFormattedTextRange() {
        PsiElement starter = findChildByType(Perl6TokenTypes.POD_FORMAT_STARTER);
        PsiElement stopper = findChildByType(Perl6TokenTypes.POD_FORMAT_STOPPER);
        int startOffset = starter.getTextOffset() + starter.getTextLength();
        return new TextRange(startOffset, stopper != null ? stopper.getTextOffset() : startOffset);
    }

    @Override
    public PodDomNode buildPodDom() {
        // Some codes are handled specially.
        String maybeCode = getFormatCode();
        char code = maybeCode.isEmpty() ? '\0' : maybeCode.charAt(0);
        boolean format = true;
        switch (code) {
            case 'L': case 'X': return buildLinkyPodDom(code);
            case 'V': format = false; break;
        }

        // Otherwise, we build a formatted node and add children.
        PodDomFormatted node = new PodDomFormatted(getTextOffset(), code);
        PsiElement content = findChildByType(Perl6ElementTypes.POD_TEXT);
        if (content != null)
            for (ASTNode child : content.getNode().getChildren(TokenSet.ANY))
                if (format && child.getElementType() == Perl6ElementTypes.POD_FORMATTED)
                    node.addChild(((PodFormatted)child.getPsi()).buildPodDom());
                else
                    node.addChild(new PodDomText(child.getStartOffset(), child.getText()));
        return node;
    }

    private PodDomNode buildLinkyPodDom(char code) {
        // We don't know if there'll be a separator or not, so we start out collecting
        // the text of the first part, and use it as the link.
        PodDomFormatted node = new PodDomFormatted(getTextOffset(), code);
        StringBuilder link = new StringBuilder();
        boolean inLink = false;
        PsiElement content = findChildByType(Perl6ElementTypes.POD_TEXT);
        if (content != null) {
            for (ASTNode child : content.getNode().getChildren(TokenSet.ANY)) {
                if (inLink) {
                    link.append(child.getText());
                }
                else {
                    IElementType elementType = child.getElementType();
                    if (elementType == Perl6TokenTypes.POD_FORMAT_SEPARATOR) {
                        link.delete(0, link.length());
                        inLink = true;
                    }
                    else {
                        String text = child.getText();
                        link.append(text);
                        if (elementType == Perl6ElementTypes.POD_FORMATTED)
                            node.addChild(((PodFormatted)child.getPsi()).buildPodDom());
                        else
                            node.addChild(new PodDomText(child.getStartOffset(), text));
                    }
                }
            }
        }
        node.setLink(link.toString());
        return node;
    }
}
