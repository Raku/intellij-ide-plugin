package edument.perl6idea.completion;

import com.intellij.codeInsight.completion.CompletionType;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil;
import com.intellij.openapi.roots.ProjectRootManager;
import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;
import edument.perl6idea.filetypes.Perl6ScriptFileType;
import edument.perl6idea.sdk.Perl6SdkType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodCompletionTest extends LightCodeInsightFixtureTestCase {
    private Sdk testSdk;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        ApplicationManager.getApplication().runWriteAction(() -> {
            String homePath = Perl6SdkType.getInstance().suggestHomePath();
            assertNotNull("Found a perl6 in path to use in tests", homePath);
            testSdk = SdkConfigurationUtil.createAndAddSDK(homePath, Perl6SdkType.getInstance());
            ProjectRootManager.getInstance(myModule.getProject()).setProjectSdk(testSdk);
        });
    }

    @Override
    protected void tearDown() throws Exception {
        SdkConfigurationUtil.removeSdk(testSdk);
        super.tearDown();
    }

    public void testPrivateMethodCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class Foo { method !a{}; method !b{ self!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> methods = myFixture.getLookupElementStrings();
        assertNotNull(methods);
        assertTrue(methods.containsAll(Arrays.asList("!a", "!b")));
        assertEquals(2, methods.size());
    }

    public void testPrivateMethodFromRoleCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "role Bar { method !bar {}; }; class Foo does Bar { method !a{ self!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> methods = myFixture.getLookupElementStrings();
        assertNotNull(methods);
        assertTrue(methods.containsAll(Arrays.asList("!a", "!bar")));
        assertEquals(2, methods.size());
    }

    public void testPrivateMethodFromNestedRoleCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "role Baz { method !baz {} }; role Bar does Baz { method !bar {}; }; class Foo does Bar { method !a{ self!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> methods = myFixture.getLookupElementStrings();
        assertNotNull(methods);
        assertTrue(methods.containsAll(Arrays.asList("!a", "!bar", "!baz")));
        assertEquals(3, methods.size());
    }

    public void testPrivateMethodFromExternalRoleCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "use NativeCall; role Foo does NativeCall::Native { method bar { self!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> methods = myFixture.getLookupElementStrings();
        assertNotNull(methods);
        assertTrue(methods.containsAll(Collections.singletonList("!setup")));
    }
}
