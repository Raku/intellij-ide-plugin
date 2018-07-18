package edument.perl6idea.editor;

import com.intellij.codeInsight.editorActions.moveUpDown.LineRange;
import com.intellij.codeInsight.editorActions.moveUpDown.StatementUpDownMover;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.ex.EditorEx;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.PsiWhiteSpace;
import com.intellij.psi.util.PsiTreeUtil;
import edument.perl6idea.psi.Perl6Blockoid;
import edument.perl6idea.psi.Perl6File;
import edument.perl6idea.psi.Perl6Statement;
import edument.perl6idea.psi.Perl6StatementList;
import org.jetbrains.annotations.NotNull;

import static edument.perl6idea.parsing.Perl6TokenTypes.BLOCK_CURLY_BRACKET_CLOSE;
import static edument.perl6idea.parsing.Perl6TokenTypes.UNV_WHITE_SPACE;

public class Perl6StatementMover extends StatementUpDownMover {
    @Override
    public boolean checkAvailable(@NotNull Editor editor, @NotNull PsiFile file, @NotNull MoveInfo info, boolean down) {
        return file instanceof Perl6File;
    }

    @Override
    public void beforeMove(@NotNull Editor editor, @NotNull MoveInfo info, boolean down) {
        if (editor.getProject() == null || !(editor instanceof EditorEx)) return;
        EditorEx editorEx = (EditorEx) editor;
        final PsiFile psiFile = PsiManager.getInstance(editor.getProject()).findFile(editorEx.getVirtualFile());
        assert psiFile != null;

        if (editor.getSelectionModel().getSelectionStart() != editor.getSelectionModel().getSelectionEnd())
            return;

        PsiElement rangeElement1 = getNode(editor.getDocument(), info.toMove.startLine, psiFile);
        if (rangeElement1 == null) return;
        PsiElement rangeElement2 = getNode(editor.getDocument(), info.toMove2.startLine, psiFile);
        if (rangeElement2 == null) return;

        if (rangeElement1.equals(rangeElement2)) {
            // It is a multi-line statement and we're in the middle of it
            PsiElement tempRange = skipEmpty(down ? rangeElement2.getNextSibling() : rangeElement1.getPrevSibling(), down);
            if (tempRange == null) {
                // It is first element in the block and we are moving up, so need to jump out
                // Firstly, get parent statement for this block, then set ranges
                PsiElement blockStatement = PsiTreeUtil.getParentOfType(rangeElement2, Perl6Blockoid.class);
                setInfo(info, rangeElement1, blockStatement == null ? rangeElement1 : blockStatement.getFirstChild());
            } else if (tempRange instanceof PsiWhiteSpace) {
                // It seems to be last element of block, so we need to jump and move next
                tempRange = tempRange.getParent().getNextSibling();
                setInfo(info, rangeElement1, tempRange);
            } else {
                setInfo(info, rangeElement1, tempRange);
            }
        } else if (PsiTreeUtil.isAncestor(rangeElement2, rangeElement1, true)) {
            // If we are moving out of the block moving up
            if (!down) {
                PsiElement blockStatement = PsiTreeUtil.getParentOfType(rangeElement1, Perl6Blockoid.class);
                setInfo(info, rangeElement1, blockStatement == null ? rangeElement1 : blockStatement.getFirstChild());
            }
        } else if (PsiTreeUtil.isAncestor(rangeElement1, rangeElement2, true)) {
            // If we are moving block from its first line into "insides", switch it with next list-level statement
            if (down) {
                PsiElement next = skipEmpty(rangeElement1.getNextSibling(), true);
                if (next != null && (!(next instanceof PsiWhiteSpace)) && !next.getNode().getElementType().equals(UNV_WHITE_SPACE)) {
                    setInfo(info, rangeElement1, next);
                } else {
                    setInfo(info, rangeElement1, rangeElement1);
                }
            } else {
                PsiElement prev = skipEmpty(rangeElement1.getPrevSibling(), false);
                if (prev == null) {
                    PsiElement blockStatement = PsiTreeUtil.getParentOfType(rangeElement2, Perl6Blockoid.class);
                    PsiElement outerBlock = PsiTreeUtil.getParentOfType(blockStatement, Perl6Blockoid.class);
                    if (outerBlock != null)
                        blockStatement = outerBlock;
                    setInfo(info, rangeElement1, blockStatement == null ? rangeElement1 : blockStatement.getFirstChild());
                } else {
                    setInfo(info, rangeElement1, prev);
                }
            }
        } else {
            setInfo(info, rangeElement1, rangeElement2);
        }
    }

    private static void setInfo(@NotNull MoveInfo info, PsiElement rangeElement1, PsiElement rangeElement2) {
        LineRange range1 = new LineRange(rangeElement1);
        LineRange range2 = new LineRange(rangeElement2);
        if (rangeElement1 == rangeElement2 || // If heuristic is wrong
            range1.contains(range2) || range2.contains(range1)) {
            info.toMove = range1;
            info.toMove2 = range1;
            info.indentTarget = false;
            info.indentSource = false;
        } else {
            info.toMove = range1;
            info.toMove2 = range2;
        }
    }

    private static PsiElement getNode(@NotNull Document document, int startOffset, PsiFile psiFile) {
        PsiElement element = skipEmpty(psiFile.findElementAt(getLineStartSafeOffset(document, startOffset)), true);
        if (element == null) return null;
        if (element.getNode().getElementType().equals(BLOCK_CURLY_BRACKET_CLOSE)) return element;
        if (element instanceof Perl6StatementList && element.getParent() instanceof Perl6Blockoid)
            element = element.getFirstChild();
        return element instanceof Perl6Statement ? element : PsiTreeUtil.getParentOfType(element, Perl6Statement.class);
    }

    private static PsiElement skipEmpty(PsiElement node, boolean toRight) {
        PsiElement temp = node;
        while (temp != null && (temp instanceof PsiWhiteSpace || temp.getNode().getElementType().equals(UNV_WHITE_SPACE)))
            temp = toRight ? temp.getNextSibling() : temp.getPrevSibling();
        return temp == null ? node : temp;
    }

    @Override
    public void afterMove(@NotNull Editor editor, @NotNull PsiFile file, @NotNull MoveInfo info, boolean down) {
    }
}
