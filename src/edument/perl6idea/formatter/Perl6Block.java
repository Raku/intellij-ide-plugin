package edument.perl6idea.formatter;

import com.intellij.formatting.*;
import com.intellij.formatting.templateLanguages.BlockWithParent;
import com.intellij.lang.ASTNode;
import com.intellij.psi.codeStyle.CodeStyleSettings;
import com.intellij.psi.formatter.FormatterUtil;
import com.intellij.psi.formatter.common.AbstractBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static edument.perl6idea.parsing.Perl6ElementTypes.BLOCK;
import static edument.perl6idea.parsing.Perl6TokenTypes.BLOCK_CURLY_BRACKET;

class Perl6Block extends AbstractBlock implements BlockWithParent {
    private BlockWithParent myParent;
    private CodeStyleSettings mySettings;

    Perl6Block(ASTNode node, Wrap wrap, Alignment align, CodeStyleSettings settings) {
        super(node, wrap, align);
        mySettings = settings;
    }

    @Override
    protected List<Block> buildChildren() {
        if (isLeaf())
            return EMPTY;
        final ArrayList<Block> children = new ArrayList<>();
        for (ASTNode child = getNode().getFirstChildNode(); child != null; child = child.getTreeNext()) {
            if (FormatterUtil.containsWhiteSpacesOnly(child)) continue;
            final Perl6Block childBlock = new Perl6Block(child, null,
                    null, mySettings);
            childBlock.setParent(this);
            children.add(childBlock);
        }
        return children;
    }

    @Override
    public boolean isIncomplete() {
        return super.isIncomplete();
    }

    @Nullable
    @Override
    public Spacing getSpacing(@Nullable Block child1, @NotNull Block child2) {
        return null;
    }

    @Override
    public Indent getIndent() {
        if (myNode.getText().trim().length() == 0) {
            return null;
        }

        Indent indent = Indent.getNoneIndent();
        if (myNode.getElementType() != BLOCK_CURLY_BRACKET &&
                myNode.getTreeParent() != null &&
                myNode.getTreeParent().getElementType() == BLOCK) {
            indent = Indent.getNormalIndent();
        }

        return indent;
    }

    @NotNull
    @Override
    public ChildAttributes getChildAttributes(final int newIndex) {
        return new ChildAttributes(getIndent(), null);
    }

    @Override
    public boolean isLeaf() {
        return myNode.getFirstChildNode() == null;
    }

    @Override
    public BlockWithParent getParent() {
        return myParent;
    }

    @Override
    public void setParent(BlockWithParent newParent) {
        myParent = newParent;
    }
}
