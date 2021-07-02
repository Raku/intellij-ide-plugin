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
import edument.perl6idea.psi.*;
import edument.perl6idea.utils.Perl6PsiUtil;
import org.jetbrains.annotations.NotNull;

import static edument.perl6idea.parsing.Perl6TokenTypes.*;

public class Perl6StatementMover extends StatementUpDownMover {
    private boolean down;

    @Override
    public boolean checkAvailable(@NotNull Editor editor, @NotNull PsiFile file, @NotNull MoveInfo info, boolean down) {
        return file instanceof Perl6File;
    }

    @Override
    public void beforeMove(@NotNull Editor editor, @NotNull MoveInfo info, boolean down) {
        this.down = down;
        if (editor.getProject() == null || !(editor instanceof EditorEx)) return;
        EditorEx editorEx = (EditorEx) editor;
        final PsiFile psiFile = PsiManager.getInstance(editor.getProject()).findFile(editorEx.getVirtualFile());
        assert psiFile != null;

        if (editor.getSelectionModel().getSelectionStart() != editor.getSelectionModel().getSelectionEnd())
            return;

        PsiElement rangeElement1 = getNode(editor.getDocument(), editorEx, info.toMove.startLine, psiFile, true);
        if (rangeElement1 == null) return;
        PsiElement rangeElement2 = getNode(editor.getDocument(), editorEx, info.toMove2.startLine, psiFile, false);
        if (rangeElement2 == null) return;

        if (rangeElement1.equals(rangeElement2)) {
            // It is a multi-line statement and we're in the middle of it
            PsiElement node = down ? rangeElement2.getNextSibling() : rangeElement1.getPrevSibling();
            PsiElement tempRange = Perl6PsiUtil.skipSpaces(node, down);
            if (tempRange == null) {
                if (!down) {
                    // It is first element in the block and we are moving up, so need to jump out
                    // Firstly, get parent statement for this block, then set ranges
                    PsiElement blockStatement = PsiTreeUtil.getParentOfType(rangeElement2, Perl6Blockoid.class);
                    setInfo(info, rangeElement1, blockStatement == null ? rangeElement1 : blockStatement.getFirstChild());
                } else {
                    // It seems to be last element of block and we are moving down, so we need to jump and move down
                    tempRange = rangeElement2.getParent().getNextSibling();
                    // We check it for null, because it may be last statement in the file, so no sibling
                    setInfo(info, rangeElement1, tempRange != null ? tempRange : rangeElement1);
                }
            } else {
                setInfo(info, rangeElement1, tempRange);
            }
        } else if (PsiTreeUtil.isAncestor(rangeElement2, rangeElement1, true)) {
            if (rangeElement2.getFirstChild() instanceof Perl6IfStatement) {
                handleIfCase(info, rangeElement1);
            } else { // If we are moving out of the block moving
                PsiElement blockStatement = PsiTreeUtil.getParentOfType(rangeElement1, Perl6Blockoid.class);
                if (blockStatement == null) {
                    setInfo(info, rangeElement1, rangeElement1);
                } else {
                    setInfo(info, rangeElement1,
                            down ? blockStatement.getLastChild() : blockStatement.getFirstChild());
                }
            }
        } else if (PsiTreeUtil.isAncestor(rangeElement1, rangeElement2, true)) {
            // If we are moving block from its first line into "insides", switch it with next list-level statement
            if (down) {
                PsiElement next = Perl6PsiUtil.skipSpaces(rangeElement1.getNextSibling(), true);
                setInfo(info, rangeElement1, next == null ? rangeElement1 : next);
            } else {
                PsiElement prev = Perl6PsiUtil.skipSpaces(rangeElement1.getPrevSibling(), false);
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

    private void handleIfCase(MoveInfo info, PsiElement line) {
        PsiElement block = PsiTreeUtil.getParentOfType(line, Perl6Block.class);
        if (block == null) {
            setInfo(info, line, line);
            return;
        }
        PsiElement sib = down ? block.getNextSibling() : block.getPrevSibling();
        while (sib != null && (!(sib instanceof Perl6Block))) {
            sib = down ? sib.getNextSibling() : sib.getPrevSibling();
        }
        if (sib != null) {
            LineRange firstRange = new LineRange(line);
            PsiElement sibBlockoid = sib.getFirstChild();
            PsiElement blockoid = block.getFirstChild();
            LineRange secondRange = new LineRange(
                down ? blockoid.getLastChild() : sibBlockoid.getLastChild(),
                down ? sibBlockoid.getFirstChild() : blockoid.getFirstChild());
            info.toMove = firstRange;
            info.toMove2 = secondRange;
        } else {
            info.toMove = new LineRange(line);
            PsiElement blockoid = block.getFirstChild();
            info.toMove2 = new LineRange(down ? blockoid.getLastChild() : blockoid.getFirstChild());
        }
        if (info.toMove.contains(info.toMove2) || info.toMove2.contains(info.toMove)) {
            info.toMove2 = info.toMove;
            info.indentTarget = false;
            info.indentSource = false;
        }
    }

    private void setInfo(@NotNull MoveInfo info, PsiElement rangeElement1, PsiElement rangeElement2) {
        if (checkHeredocEdgeCases(info, rangeElement1)) return;

        LineRange range1 = null;
        LineRange range2 = null;
        PsiElement heredoc1 = Perl6PsiUtil.skipSpaces(rangeElement1.getNextSibling(), true);
        PsiElement heredoc2 = Perl6PsiUtil.skipSpaces(rangeElement2.getNextSibling(), true);

        if (rangeElement2 instanceof Perl6Heredoc) {
            range1 = new LineRange(rangeElement1, rangeElement2);
            rangeElement2 = Perl6PsiUtil.skipSpaces(rangeElement2.getNextSibling(), true);
            assert rangeElement2 != null;
        }

        if (heredoc1 instanceof Perl6Heredoc)
            range1 = new LineRange(rangeElement1, heredoc1);
        if (heredoc2 instanceof Perl6Heredoc)
            range2 = new LineRange(rangeElement2, heredoc2);

        if (rangeElement1.getFirstChild() != null && rangeElement1.getFirstChild().equals(rangeElement1.getLastChild()))
            rangeElement1 = rangeElement1.getFirstChild();
        if (rangeElement2.getFirstChild() != null && rangeElement2.getFirstChild().equals(rangeElement2.getLastChild()))
            rangeElement2 = rangeElement2.getFirstChild();

        if (range1 == null)
            range1 = rangeElement1.getFirstChild() != null
                     ? new LineRange(Perl6PsiUtil.skipSpaces(rangeElement1.getFirstChild(), true),
                                     Perl6PsiUtil.skipSpaces(rangeElement1.getLastChild(), false))
                     : new LineRange(rangeElement1);
        if (range2 == null)
            range2 = rangeElement2.getFirstChild() != null
                     ? new LineRange(Perl6PsiUtil.skipSpaces(rangeElement2.getFirstChild(), true),
                                     Perl6PsiUtil.skipSpaces(rangeElement2.getLastChild(), false))
                     : new LineRange(rangeElement2);

        if (rangeElement1 == rangeElement2 || // If heuristic is wrong
            range1.contains(range2) || range2.contains(range1)) {
            cancelMoving(info, range1);
        } else {
            info.toMove = range1;
            info.toMove2 = range2;
        }
    }

    private boolean checkHeredocEdgeCases(MoveInfo info, PsiElement element1) {
        // Handle all cases where the cursor is inside of heredoc part
        boolean isHeredoc = Perl6PsiUtil.skipSpaces(element1.getNextSibling(), true) instanceof Perl6Heredoc;
        if (isHeredoc) {
            PsiElement neighbour = down ?
                                   Perl6PsiUtil.skipSpaces(element1.getNextSibling(), true) :
                                   Perl6PsiUtil.skipSpaces(element1.getPrevSibling(), false);
            if (down && neighbour instanceof Perl6Heredoc) {
                // If we're moving down, for first iteration we return known heredoc
                // but we are checking if we have a statement _after_ that
                neighbour = Perl6PsiUtil.skipSpaces(neighbour.getNextSibling(), true);
            }
            if (!(neighbour instanceof Perl6Statement)) {
                LineRange range = new LineRange(element1);
                cancelMoving(info, range);
                return true;
            }
        }
        return false;
    }

    private static void cancelMoving(MoveInfo info, LineRange range) {
        info.toMove = range;
        info.toMove2 = range;
        info.indentSource = false;
        info.indentTarget = false;
    }

    private static PsiElement getNode(@NotNull Document document,
                                      EditorEx editor,
                                      int startOffset,
                                      PsiFile psiFile,
                                      boolean is_first) {
        PsiElement element;
        if (is_first) {
            PsiElement el = psiFile.findElementAt(editor.getCaretModel().getOffset());
            while (el != null && (el instanceof PsiWhiteSpace || el.getNode().getElementType().equals(UNV_WHITE_SPACE))) {
                int basicOffset = el.getTextOffset();
                el = psiFile.findElementAt(basicOffset + el.getTextLength());
            }
            element = el;
        } else {
            element = Perl6PsiUtil.skipSpaces(psiFile.findElementAt(getLineStartSafeOffset(document, startOffset)), true);
        }
        if (element == null) return null;
        if (element.getNode().getElementType() == STRING_LITERAL_CHAR || element.getNode().getElementType() == STRING_LITERAL_QUOTE_CLOSE) {
            PsiElement heredoc = element.getParent();
            if (heredoc instanceof Perl6Heredoc)
                return Perl6PsiUtil.skipSpaces(heredoc.getPrevSibling(), false);
        }
        if (element instanceof Perl6StatementList &&
            element.getParent() instanceof Perl6Blockoid && element.getFirstChild() != null)
            element = element.getFirstChild();
        return element instanceof Perl6Statement ? element : PsiTreeUtil.getParentOfType(element, Perl6Statement.class);
    }

    @Override
    public void afterMove(@NotNull Editor editor, @NotNull PsiFile file, @NotNull MoveInfo info, boolean down) {
    }
}
