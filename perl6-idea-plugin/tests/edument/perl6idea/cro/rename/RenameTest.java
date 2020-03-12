package edument.perl6idea.cro.rename;

import edument.perl6idea.CommaFixtureTestCase;
import edument.perl6idea.cro.template.CroTemplateFileType;

public class RenameTest extends CommaFixtureTestCase {
    private void doTest(int offset, String newName, String result) {
        myFixture.configureByText(CroTemplateFileType.INSTANCE, "<:sub fofo($title)><$title></:sub><&fofo><:macro page></:macro><|page>");
        myFixture.getEditor().getCaretModel().moveToOffset(offset);
        myFixture.renameElementAtCaret(newName);
        myFixture.checkResult(result);
    }

    public void testRenameOfVariable() {
        doTest(15, "$name", "<:sub fofo($name)><$name></:sub><&fofo><:macro page></:macro><|page>");
        doTest(22, "$name", "<:sub fofo($name)><$name></:sub><&fofo><:macro page></:macro><|page>");
    }

    public void testRenameOfSubroutine() {
        doTest(8, "toto", "<:sub toto($title)><$title></:sub><&toto><:macro page></:macro><|page>");
        doTest(38, "toto", "<:sub toto($title)><$title></:sub><&toto><:macro page></:macro><|page>");
    }
}
