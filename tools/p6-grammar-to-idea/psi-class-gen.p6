sub MAIN(*@names) {
    for @names -> $name {
        my $impl = $name ~ "Impl";
        spurt "../../src/edument/perl6idea/psi/Perl6$name.java", q:b:s:to/INTERFACE/;
            package edument.perl6idea.psi;

            public interface Perl6$name {
            }
            INTERFACE
        spurt "../../src/edument/perl6idea/psi/impl/Perl6$impl.java", q:s:to/CLASS/.subst('Impl (', 'Impl(');
            package edument.perl6idea.psi.impl;

            import com.intellij.extapi.psi.ASTWrapperPsiElement;
            import com.intellij.lang.ASTNode;
            import edument.perl6idea.psi.Perl6$name;
            import org.jetbrains.annotations.NotNull;

            public class Perl6$impl extends ASTWrapperPsiElement implements Perl6$name {
                public Perl6$impl (@NotNull ASTNode node) {
                    super(node);
                }
            }
            CLASS
    }
}
