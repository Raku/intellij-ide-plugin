package edument.perl6idea.cro.template.findUsages;

import com.intellij.lang.cacheBuilder.VersionedWordsScanner;
import com.intellij.lang.cacheBuilder.WordOccurrence;
import com.intellij.lexer.Lexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import com.intellij.util.Processor;
import edument.perl6idea.cro.template.parsing.CroTemplateLexer;
import edument.perl6idea.cro.template.parsing.CroTemplateTokenTypes;
import org.jetbrains.annotations.NotNull;

public class CroTemplateWordsScannar extends VersionedWordsScanner {
    private final Lexer myLexer;
    private final TokenSet myIdentifierTokenSet;
    private final TokenSet myCommentTokenSet;
    private final TokenSet myLiteralTokenSet;

    public CroTemplateWordsScannar() {
        myLexer = new CroTemplateLexer();
        myIdentifierTokenSet = TokenSet.create(
                CroTemplateTokenTypes.IDENTIFER, CroTemplateTokenTypes.MACRO_NAME,
                CroTemplateTokenTypes.MODULE_NAME, CroTemplateTokenTypes.SUB_NAME,
                CroTemplateTokenTypes.VARIABLE_NAME
        );
        myCommentTokenSet = TokenSet.create(CroTemplateTokenTypes.COMMENT);
        myLiteralTokenSet = TokenSet.create(
                CroTemplateTokenTypes.INT_LITERAL, CroTemplateTokenTypes.NUM_LITERAL,
                CroTemplateTokenTypes.RAT_LITERAL, CroTemplateTokenTypes.LITERAL_TEXT,
                CroTemplateTokenTypes.STRING_TEXT);
    }

    @Override
    public void processWords(@NotNull CharSequence fileText, @NotNull Processor<? super WordOccurrence> processor) {
        myLexer.start(fileText);
        WordOccurrence occurrence = new WordOccurrence(fileText, 0, 0, null); // shared occurrence

        IElementType type;
        while ((type = myLexer.getTokenType()) != null) {
            if (myIdentifierTokenSet.contains(type)) {
                String text = myLexer.getTokenText();
                if (type == CroTemplateTokenTypes.VARIABLE_NAME) {
                    if (text.length() > 1) {
                        String sigilLess = text.substring(Character.isLetter(text.charAt(1)) ? 1 : 2);
                        if (indexByDash(processor, occurrence, sigilLess)) return;
                    }
                    if (text.startsWith("$")) {
                        occurrence.init("$", 0, 1, WordOccurrence.Kind.CODE);
                        if (!processor.process(occurrence)) return;
                        occurrence.init(text, 0, text.length(), WordOccurrence.Kind.CODE);
                        if (!processor.process(occurrence)) return;
                    }
                }
                else if (type == CroTemplateTokenTypes.SUB_NAME || type == CroTemplateTokenTypes.MACRO_NAME ||
                        type == CroTemplateTokenTypes.MODULE_NAME) {
                    if (text.indexOf('-') == -1) {
                        occurrence.init(text, 0, text.length(), WordOccurrence.Kind.CODE);
                        if (!processor.process(occurrence)) return;
                    } else {
                        if (indexByDash(processor, occurrence, text)) return;
                    }
                } else {
                    occurrence.init(text, 0, text.length(), WordOccurrence.Kind.CODE);
                    if (!processor.process(occurrence)) return;
                }
            }
            else if (myCommentTokenSet.contains(type)) {
                if (!stripWords(processor, fileText, myLexer.getTokenStart(), myLexer.getTokenEnd(), WordOccurrence.Kind.COMMENTS, occurrence)) return;
            }
            else if (myLiteralTokenSet.contains(type)) {
                if (!stripWords(processor, fileText, myLexer.getTokenStart(), myLexer.getTokenEnd(), WordOccurrence.Kind.LITERALS, occurrence)) return;
            }
            myLexer.advance();
        }
    }

    private static boolean indexByDash(Processor<? super WordOccurrence> processor, WordOccurrence occurrence, String text) {
        String[] splitted = text.split("-");
        for (int i = 0; i < splitted.length; i++) {
            occurrence.init(splitted[i], 0, splitted[i].length(), WordOccurrence.Kind.CODE);
            if (!processor.process(occurrence)) return true;
            if (i + 1 != splitted.length) {
                occurrence.init("-", 0, 1, WordOccurrence.Kind.CODE);
                if (!processor.process(occurrence)) return true;
            }
        }
        return false;
    }

    protected static boolean stripWords(final Processor<? super WordOccurrence> processor,
                                        final CharSequence tokenText,
                                        int from,
                                        int to,
                                        final WordOccurrence.Kind kind,
                                        @NotNull WordOccurrence occurrence
    ) {
        // This code seems strange but it is more effective as Character.isJavaIdentifier_xxx_ is quite costly operation due to unicode
        int index = from;

        ScanWordsLoop:
        while (true) {
            while (true) {
                if (index == to) break ScanWordsLoop;
                char c = tokenText.charAt(index);
                if (isAsciiIdentifierPart(c) || Character.isJavaIdentifierStart(c)) {
                    break;
                }
                index++;
            }
            int wordStart = index;
            while (true) {
                index++;
                if (index == to) break;
                char c = tokenText.charAt(index);
                if (isAsciiIdentifierPart(c)) continue;
                if (!Character.isJavaIdentifierPart(c)) break;
            }
            int wordEnd = index;
            occurrence.init(tokenText, wordStart, wordEnd, kind);

            if (!processor.process(occurrence)) return false;
        }
        return true;
    }

    private static boolean isAsciiIdentifierPart(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9') || c == '$';
    }
}
