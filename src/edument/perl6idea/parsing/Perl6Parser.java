package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_19(builder);
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private boolean infix_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postfixish_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.postfix_7(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean name_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean desigilname_4_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean desigilname_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.desigilname_4_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean termish_5(PsiBuilder builder) {
        if (!(this.term_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean prefix_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postfix_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean twigil_8(PsiBuilder builder) {
        return true;
    }

    private boolean variable_9(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean bogus_statement_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_11_quant_1(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11_alt_2(PsiBuilder builder) {
        if (!(this.bogus_statement_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11_alt_3(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11_quant_5(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11_quant_6(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_11(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.statement_11_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_11_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_11_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_11_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_11_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.STATEMENT);
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_11_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean infixish_12(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_1(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean statement_control_13(PsiBuilder builder) {
        if (!(this.statement_control_use_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_14_quant_1(PsiBuilder builder) {
        if (!(this.statement_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_14(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.statementlist_14_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        marker1.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean prefixish_15(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_6(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean EXPR_16_quant_1(PsiBuilder builder) {
        if (!(this.prefixish_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_2(PsiBuilder builder) {
        if (!(this.postfixish_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_3(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_4(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_5(PsiBuilder builder) {
        if (!(this.prefixish_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_6(PsiBuilder builder) {
        if (!(this.postfixish_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_7(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.EXPR_16_quant_5(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        if (!(this.termish_5(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_16_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_16_quant_8(PsiBuilder builder) {
        if (!(this.ws_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_9(PsiBuilder builder) {
        if (!(this.infixish_12(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.EXPR_16_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.EXPR_16_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.EXPR_16_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_16(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.EXPR_16_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        if (!(this.termish_5(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.EXPR_16_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.EXPR_16_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.EXPR_16_quant_9(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        marker1.done(Perl6ElementTypes.EXPR);
        return true;
    }

    private boolean sigil_17(PsiBuilder builder) {
        return true;
    }

    private boolean term_18(PsiBuilder builder) {
        if (!(this.variable_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_19(PsiBuilder builder) {
        if (!(this.statementlist_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_21(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_20(builder))) {
            return false;
        }
        if (!(this.name_3(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
