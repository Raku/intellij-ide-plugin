package edument.perl6idea.highlighting;

import edument.perl6idea.CommaFixtureTestCase;
import edument.perl6idea.filetypes.Perl6ScriptFileType;

public class RakuHighlightTest extends CommaFixtureTestCase {
    @Override
    protected String getTestDataPath() {
        return "perl6-idea-plugin/testData/highlight";
    }

    public void testDuplicatedSubs() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "sub foo { 1 }; <error descr=\"Re-declaration of foo from aaa.raku:1\">sub <weak_warning descr=\"Unused subroutine\">foo</weak_warning></error> { 2 }; foo;");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "multi sub b {}; multi <error descr=\"Re-declaration of b from aaa.raku:1\">sub b</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "multi sub c {};\nmulti sub c(Int $n) { $n; };\nmulti <error descr=\"Re-declaration of c from aaa.raku:1\">sub c</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\n\nmulti sub d {};\nmulti sub d(Int $n) { $n; };\nmulti <error descr=\"Re-declaration of d from aaa.raku:4\">sub d</error>(Int $n) { $n; };\nmulti <error descr=\"Re-declaration of d from aaa.raku:3\">sub d</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "multi trait_mod:<is>(Parameter:D $param, :$header! --> Nil) is export { $param does Header; $header; };\n" +
                                  "multi <error descr=\"Re-declaration of trait_mod:<is> from aaa.raku:1\">trait_mod:<is></error>(Parameter:D $param, :$header! --> Nil) is export { $param does Header; $header; };");
        myFixture.checkHighlighting();
    }

    public void testDuplicatedMethods() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class A { method a {}; method b {}; <error descr=\"Re-declaration of a from aaa.raku:1\">method a</error> {} }");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "grammar A { rule my-rule {<?>}; rule <error descr=\"Re-declaration of my-rule from aaa.raku:1\">my-rule</error> {<?>}; }");
        myFixture.checkHighlighting();
    }

    public void testDuplicatedRules() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "grammar A {\nrule my-rule {<?>};\ntoken <error descr=\"Re-declaration of my-rule from aaa.raku:2\">my-rule</error> {<?>};\n<error descr=\"Re-declaration of my-rule from aaa.raku:2\">method my-rule</error> { 42 }; { 42 };\n}");
        myFixture.checkHighlighting();
    }

    public void testDuplicateMultiMethods() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class B { multi method b {}; multi <error descr=\"Re-declaration of b from aaa.raku:1\">method b</error> {} }");
        myFixture.checkHighlighting();
    }

    public void testDuplicatedPackages() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\n\nclass A {};\n\nclass <error descr=\"Re-declaration of A from aaa.raku:3\">A</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "grammar Baz {}; grammar <error descr=\"Re-declaration of Baz from aaa.raku:1\">Baz</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class A { class A {} };");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\nclass A {\nclass B {}\n};\nclass <error descr=\"Re-declaration of A::B from aaa.raku:3\">A::B</error> {};");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\nclass A {\nclass B {}\n};\nclass <error descr=\"Re-declaration of A::B from aaa.raku:3\">A::B</error> {};");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\nclass A::B {};\nclass A {\nclass <error descr=\"Re-declaration of A::B from aaa.raku:2\">B</error> {}\n};");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class Agrammon::Outputs { ... }\nclass Agrammon::Outputs { }");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "subset CCCC1 of Int; class <error descr=\"Re-declaration of CCCC1 from aaa.raku:1\">CCCC1</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class DDDD1 {}; subset <error descr=\"Re-declaration of DDDD1 from aaa.raku:1\">DDDD1</error> of Int;");
        myFixture.checkHighlighting();
    }

    public void testDuplicatedRoles() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "role Baz {}; role <error descr=\"Re-declaration of Baz from aaa.raku:1\">Baz</error> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "role Bar[Type] {}; role <error descr=\"Re-declaration of Bar from aaa.raku:1\">Bar</error>[Type] {}; role Bar {};");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "role Saz {}; role Saz[Type] {}; role Saz[Type1, Type2] {};");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "role R1 {};\nrole R1[Type] {};\nrole <error descr=\"Re-declaration of R1 from aaa.raku:2\">R1</error>[Type] {};");
        myFixture.checkHighlighting();
    }

    public void testDuplicatedVariables() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "my $foo; say $foo; my <warning descr=\"Re-declaration of $foo from aaa.raku:1\"><weak_warning descr=\"Unused variable\">$foo</weak_warning></warning>; say $foo;");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\nmy $bar;\nsay $bar;\n{ my $bar; say $bar; };\nmy <warning descr=\"Re-declaration of $bar from aaa.raku:2\"><weak_warning descr=\"Unused variable\">$bar</weak_warning></warning>;\nsay $bar;");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "sub blah($x) { my <warning descr=\"Re-declaration of $x from aaa.raku:1\"><weak_warning descr=\"Unused variable\">$x</weak_warning></warning> = 42; say $x; }; blah(3);");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "sub x() {}; my <warning descr=\"Re-declaration of &x from aaa.raku:1\"><weak_warning descr=\"Unused variable\">&x</weak_warning></warning> = -> {}");
        myFixture.checkHighlighting();
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "\nmy my <weak_warning descr=\"Unused variable\">&y</weak_warning>;\n<warning descr=\"Re-declaration of &y from aaa.raku:2\">sub y() {}</warning>;");
        myFixture.checkHighlighting();
    }

    public void testDuplicateAttributes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE, "class C { has <weak_warning descr=\"Unused attribute\">$!a</weak_warning>; has <error descr=\"Re-declaration of $!a from aaa.raku:1\">$.a</error>; }");
        myFixture.checkHighlighting();
    }

    public void testDuplicatesInExternal() {
        myFixture.configureByFiles("User.rakumod", "Base.rakumod");
        myFixture.checkHighlighting();
    }

    public void testRoutineScopes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "class C {\n" +
                                  "    method m() {}\n" +
                                  "    sub <weak_warning descr=\"Unused subroutine\">m</weak_warning>() {}\n" +
                                  "}\n" +
                                  "class D {\n" +
                                  "    my method m() {}\n" +
                                  "    <error descr=\"Re-declaration of m from aaa.raku:6\">sub m</error>() {}\n" +
                                  "}");
        myFixture.checkHighlighting();
    }

    // TODO should warn
    public void testPackageScopes() {
        myFixture.configureByText(Perl6ScriptFileType.INSTANCE,
                                  "my class A { class B {} };\n" +
                                  "class A::B {}");
        myFixture.checkHighlighting();
    }
}
