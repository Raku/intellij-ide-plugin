package edument.perl6idea.commenter;

import com.intellij.codeInsight.generation.actions.CommentByBlockCommentAction;
import com.intellij.codeInsight.generation.actions.CommentByLineCommentAction;
import com.intellij.testFramework.LightProjectDescriptor;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import edument.perl6idea.Perl6LightProjectDescriptor;
import edument.perl6idea.filetypes.Perl6ScriptFileType;
import org.jetbrains.annotations.NotNull;

public class CommenterTest extends LightCodeInsightFixtureTestCase {
    @NotNull
    @Override
    protected LightProjectDescriptor getProjectDescriptor() {
        return new Perl6LightProjectDescriptor();
    }

    public void testCommenter() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "<caret>say 'foo';");
        CommentByLineCommentAction commentAction = new CommentByLineCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("#say 'foo';");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("say 'foo';");
    }

    public void testMultilineCommenter() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "<selection>say 'foo';\nsay 'bar';\n\n</selection>");
        CommentByLineCommentAction commentAction = new CommentByLineCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("#say 'foo';\n#say 'bar';\n#\n");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("say 'foo';\nsay 'bar';\n\n");
    }

    public void testBlockCommenter() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "<selection>say 'foo';\nsay 'bar';\n\n</selection>");
        CommentByBlockCommentAction commentAction = new CommentByBlockCommentAction();
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("#`[\nsay 'foo';\nsay 'bar';\n\n]\n");
        commentAction.actionPerformedImpl(getProject(), myFixture.getEditor());
        myFixture.checkResult("say 'foo';\nsay 'bar';\n\n");
    }
}
