package edument.perl6idea.completion;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import edument.perl6idea.filetypes.Perl6ScriptFileType;

import java.util.Arrays;
import java.util.List;

public class ModuleNameCompletionTest extends LightCodeInsightFixtureTestCase {
    public void testCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "use <caret>");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> names = myFixture.getLookupElementStrings();
        assertNotNull(names);
        assertTrue(names.containsAll(Arrays.asList("experimental", "v6.c",
                                                   "Test", "NativeCall")));
    }
}
