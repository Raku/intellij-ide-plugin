package edument.perl6idea.completion;

import com.intellij.codeInsight.completion.CompletionType;
import edument.perl6idea.CommaFixtureTestCase;
import edument.perl6idea.filetypes.Perl6ScriptFileType;

import java.util.Arrays;
import java.util.List;

public class AttributesTest extends CommaFixtureTestCase {
    @Override
    protected String getTestDataPath() {
        return "perl6-idea-plugin/testData/completion";
    }

    public void testOwnAttributes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class C { has $!abc; method a() { say $!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!", "$!abc")));
        assertEquals(2, vars.size());
    }

    public void testRoleAttributes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "role Foo { has $!foo; has $.bar; }; class A does Foo { has $!a; method a() { say $!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!", "$!a", "$!foo", "$!bar")));
        assertEquals(4, vars.size());
    }

    public void testNestedRoleAttributes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "role Nested { has $!nested; }; role Foo does Nested { has $!foo; has $.bar; }; class A does Foo { has $!a; method a() { say $!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!", "$!a", "$!foo", "$!bar", "$!nested")));
        assertEquals(5, vars.size());
    }

    public void testExternalAttributes() throws InterruptedException {
        ensureModuleIsLoaded("NativeCall");
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "use NativeCall; class A does NativeCall::Native { has $!a; method a() { say $!<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertContainsElements(vars, Arrays.asList("$!", "$!a", "$!rettype"));
    }

    public void testOuterFileAttributes() {
        myFixture.configureByFiles("IdeaFoo/Bar1.pm6", "IdeaFoo/Baz.pm6");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!private", "$!visible", "$.visible")));
    }

    public void testOuterFileLongFormAttributes() {
        myFixture.configureByFiles("IdeaFoo/Bar2.pm6", "IdeaFoo/Baz.pm6");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!private", "$!visible", "$.visible")));
    }

    public void testOuterFileNestedAttributes() {
        myFixture.configureByFiles("IdeaFoo/Bar3.pm6", "IdeaFoo/Baz.pm6");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!private", "$!visible", "$.visible")));
    }

    public void testAttributeCompletionWithInnerClasses() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class C { has $!abc; class Inner { has $!xyz;  method m() { say $!<caret> } } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!", "$!xyz")));
        assertEquals(2, vars.size());
    }

    public void testDotAttribute() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class Foo { has $.foo; has $.bar; method test { $<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$.foo", "$.bar", "$!foo", "$!bar")));
    }

    public void testAfterDotCompletion() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class Foo { has $.foo1; has $.foo2; method test { $.fo<caret>; } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList(".foo1", ".foo2")));
    }

    public void testLexicalSubBindsToOuterMethod() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                "class A { has $!a; has $.b; method m { sub a { say $<caret> } } };");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertTrue(vars.containsAll(Arrays.asList("$!a", "$!b", "$.b")));
    }

    public void testLexicalSubWithoutMethodWrapper() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                "class A { has $!a; has $.b; sub a { say $<caret> } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertNotNull(vars);
        assertFalse(vars.contains("$!a"));
        assertFalse(vars.contains("$!b"));
        assertFalse(vars.contains("$.b"));
    }

    public void testPrivateAbsenceFromInnerClassUsingSigilAccess() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class Foo { has $.foo1; my class Bar { method test { $!f<caret>; } } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertEmpty(vars);
    }

    public void testPrivateAbsenceFromInnerClassUsingSelfAccess() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class Foo { has $.foo1; has $.foo2; my class Bar { method test { self!f<caret>; } } }");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertEmpty(vars);
    }

    public void testPrivateVariableAbsenceFromOutside() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class Foo { has $.foo1; has $.foo2; }; Foo!f<caret>");
        myFixture.complete(CompletionType.BASIC, 1);
        List<String> vars = myFixture.getLookupElementStrings();
        assertEmpty(vars);
    }

}
