package edument.perl6idea.psi;

import com.intellij.psi.PsiElement;

public interface Perl6Variable extends Perl6PsiElement {

    PsiElement getVariableToken();

    default String getVariableName() {
        PsiElement varToken = getVariableToken();
        return varToken != null ? varToken.getText() : null;
    }

    static char getSigil(String text) {
        switch (text.charAt(0)) {
            case '$': return '$';
            case '@': return '@';
            case '%': return '%';
            case '&': return '&';
            default:  return ' ';
        }
    }

    static char getTwigil(String text) {
        if (text.length() < 2) return ' ';
        switch (text.charAt(1)) {
            case '*': return '*';
            case '?': return '?';
            case '!': return '!';
            case '^': return '^';
            case ':': return ':';
            case '=': return '=';
            case '~': return '~';
            case '.': return '.';
            default:  return ' ';
        }
    }
}