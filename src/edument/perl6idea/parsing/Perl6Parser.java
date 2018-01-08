package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_66(builder);
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private boolean quote_1_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\uFF63"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\uFF62"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_Q_95(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quote_1_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.quote_1_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_6(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quote_1_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quote_1_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt8.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_10(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt7.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.quote_1_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_12(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt9.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_118(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.quote_1_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_14(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt10.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_118(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.quote_1_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt12.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_16(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt11.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_118(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.quote_1_quant_15(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        return true;
    }

    private boolean quote_1_quant_17(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt14.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_1_alt_18(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt13.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_118(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.quote_1_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean quote_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker19;
        altMarker19 = builder.mark();
        if (this.quote_1_alt_18(builder)) {
            altMarker19.drop();
        } else {
            altMarker19.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.quote_1_alt_16(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.quote_1_alt_14(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.quote_1_alt_12(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.quote_1_alt_10(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker9;;
                            altMarker9 = builder.mark();
                            if (this.quote_1_alt_8(builder)) {
                                altMarker9.drop();
                            } else {
                                altMarker9.rollbackTo();
                                PsiBuilder.Marker altMarker7;;
                                altMarker7 = builder.mark();
                                if (this.quote_1_alt_6(builder)) {
                                    altMarker7.drop();
                                } else {
                                    altMarker7.rollbackTo();
                                    PsiBuilder.Marker altMarker5;;
                                    altMarker5 = builder.mark();
                                    if (this.quote_1_alt_4(builder)) {
                                        altMarker5.drop();
                                    } else {
                                        altMarker5.rollbackTo();
                                        PsiBuilder.Marker altMarker3;;
                                        altMarker3 = builder.mark();
                                        if (this.quote_1_alt_2(builder)) {
                                            altMarker3.drop();
                                        } else {
                                            altMarker3.rollbackTo();
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean statement_control_until_2_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_until_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_until_2_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNTIL_STATEMENT);
        return true;
    }

    private boolean statement_control_if_3_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("with"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("if"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("orwith"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("elsif"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_5(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_if_3_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_if_3_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_if_3_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_7(PsiBuilder builder) {
        if (!(this.pblock_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("else"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_if_3_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_if_3_quant_9(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_if_3_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_if_3_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_if_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_if_3_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_if_3_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_if_3_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IF_STATEMENT);
        return true;
    }

    private boolean unsp_4_alt_1(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_4_alt_2(PsiBuilder builder) {
        if (!(this.unv_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_4_alt_3(PsiBuilder builder) {
        if (!(this.vws_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_4_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unsp_4_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unsp_4_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.unsp_4_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean unsp_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.unsp_4_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_react_5(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("react"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REACT);
        return true;
    }

    private boolean routine_declarator_6(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_39(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ROUTINE_DECLARATION);
        return true;
    }

    private boolean termish_7(PsiBuilder builder) {
        if (!(this.term_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean dotty_8_quant_1(PsiBuilder builder) {
        if (!(this.dottyop_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean dotty_8(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dotty_8_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean statement_control_repeat_9_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_repeat_9_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_repeat_9_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_repeat_9_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_repeat_9_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_9_alt_6(PsiBuilder builder) {
        if (!(this.pblock_43(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_repeat_9_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_9_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_quant_9(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_9_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.statement_control_repeat_9_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.statement_control_repeat_9_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_repeat_9_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_9(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("repeat"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.statement_control_repeat_9_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_control_repeat_9_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_repeat_9_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.REPEAT_STATEMENT);
        return true;
    }

    private boolean term_whatever_10(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHATEVER) && (tt1.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.WHATEVER);
        return true;
    }

    private boolean dottyop_11_quant_1(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_11(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_11_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.methodop_49(builder))) {
            return false;
        }
        return true;
    }

    private boolean dec_number_12_alt_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.RAT_LITERAL);
        return true;
    }

    private boolean dec_number_12_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.NUMBER_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker3.done(Perl6ElementTypes.NUMBER_LITERAL);
        return true;
    }

    private boolean dec_number_12(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_12_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_12_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean package_def_13_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_13_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_def_13_quant_3(PsiBuilder builder) {
        if (!(this.statementlist_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_13_alt_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.package_def_13_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean package_def_13_alt_5(PsiBuilder builder) {
        if (!(this.blockoid_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_13(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.package_def_13_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.package_def_13_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.package_def_13_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.package_def_13_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean package_kind_14_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_14(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.package_kind_14_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.package_kind_14_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.package_kind_14_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.package_kind_14_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.package_kind_14_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.package_kind_14_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.package_kind_14_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.package_kind_14_alt_1(builder)) {
                                        altMarker1.drop();
                                    } else {
                                        altMarker1.rollbackTo();
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean package_declarator_15(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PACKAGE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.package_def_13(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PACKAGE_DECLARATION);
        return true;
    }

    private boolean statement_16_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_16_alt_2(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_105(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_16_quant_3(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_105(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_16_alt_4(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        if (!(this.statement_mod_cond_131(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_16_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean statement_16_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_16_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.statement_16_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.statement_16_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_16_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_16_alt_7(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_16_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean statement_16_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_130(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_16_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean statement_16_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_16_alt_11(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_16(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.statement_16_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.statement_16_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_16_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.statement_16_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.statement_16_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.statement_16_alt_9(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.STATEMENT);
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_17_alt_1(PsiBuilder builder) {
        if (!(this.term_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_17_alt_2(PsiBuilder builder) {
        if (!(this.variable_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_17_alt_3(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_17_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_17_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_require_17_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_require_17_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_require_17_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_require_17_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_17(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("require"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_require_17_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REQUIRE_STATEMENT);
        return true;
    }

    private boolean statement_prefix_hyper_18(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("hyper"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER);
        return true;
    }

    private boolean multi_declarator_19_alt_1(PsiBuilder builder) {
        if (!(this.declarator_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_19_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean multi_declarator_19_alt_3(PsiBuilder builder) {
        if (!(this.routine_def_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_19_alt_4(PsiBuilder builder) {
        if (!(this.declarator_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_19_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.multi_declarator_19_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.multi_declarator_19_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.multi_declarator_19_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        marker2.done(Perl6ElementTypes.MULTI_DECLARATION);
        return true;
    }

    private boolean multi_declarator_19(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.multi_declarator_19_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.multi_declarator_19_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean onlystar_20(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt3.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_1(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_7(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_8(PsiBuilder builder) {
        if (!(this.variable_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_21_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_21_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.quote_escape_21_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_21(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.quote_escape_21_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_21_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.quote_escape_21_alt_5(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.quote_escape_21_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.quote_escape_21_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.quote_escape_21_alt_2(builder)) {
                                altMarker2.drop();
                            } else {
                                altMarker2.rollbackTo();
                                PsiBuilder.Marker altMarker1;;
                                altMarker1 = builder.mark();
                                if (this.quote_escape_21_alt_1(builder)) {
                                    altMarker1.drop();
                                } else {
                                    altMarker1.rollbackTo();
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean statementlist_22_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_22_alt_2(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_22_quant_3(PsiBuilder builder) {
        if (!(this.statement_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_22(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_22_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_22_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.statementlist_22_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean EXPR_23_quant_1(PsiBuilder builder) {
        if (!(this.prefixish_134(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_23_quant_2(PsiBuilder builder) {
        if (!(this.postfixish_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_23_quant_3(PsiBuilder builder) {
        if (!(this.prefixish_134(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_23_quant_4(PsiBuilder builder) {
        if (!(this.postfixish_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_23_quant_5(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_23_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        if (!(this.termish_7(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.EXPR_23_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_23_quant_6(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        if (!(this.infixish_55(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.EXPR_23_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_23(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.EXPR_23_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        if (!(this.termish_7(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.EXPR_23_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_23_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_EXPR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.EXPR);
        return true;
    }

    private boolean sigil_24(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_25_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_25_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_25_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ENDSTMT_25_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ENDSTMT_25_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean ENDSTMT_25(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.ENDSTMT_25_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean module_name_26(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean longname_27(PsiBuilder builder) {
        if (!(this.name_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean bogus_end_28(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_29_alt_1(PsiBuilder builder) {
        if (!(this.named_param_128(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_29_alt_2(PsiBuilder builder) {
        if (!(this.param_var_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_29_quant_3(PsiBuilder builder) {
        if (!(this.post_constraint_140(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_29_quant_4(PsiBuilder builder) {
        if (!(this.default_value_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_29(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.parameter_29_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.parameter_29_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.parameter_29_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.parameter_29_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER);
        return true;
    }

    private boolean statement_control_no_30_quant_1(PsiBuilder builder) {
        if (!(this.spacey_123(builder))) {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_30_quant_2(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_no_30_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_30(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("no"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_no_30_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NO_STATEMENT);
        return true;
    }

    private boolean statement_prefix_eager_31(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("eager"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.EAGER);
        return true;
    }

    private boolean term_ident_32_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_32(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_32_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_135(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean hexints_33_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_33_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_33_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_33_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_109(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_33_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_33(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_33_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_34(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.INTEGER_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.INTEGER_LITERAL);
        return true;
    }

    private boolean statement_prefix_once_35(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("once"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONCE);
        return true;
    }

    private boolean statement_prefix_do_36(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("do"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.DO);
        return true;
    }

    private boolean comment_37(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_keyword_38_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_38_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_38_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_38_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_38(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_mod_loop_keyword_38_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_mod_loop_keyword_38_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_mod_loop_keyword_38_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.statement_mod_loop_keyword_38_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean routine_def_39_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_39_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_39_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_39_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_39_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_39_alt_5(PsiBuilder builder) {
        if (!(this.blockoid_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_39_alt_6(PsiBuilder builder) {
        if (!(this.onlystar_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_39(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_39_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_39_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.routine_def_39_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.routine_def_39_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.routine_def_39_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean postfixish_40_alt_1(PsiBuilder builder) {
        if (!(this.dotty_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_40_alt_2(PsiBuilder builder) {
        if (!(this.postcircumfix_81(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_40_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if (!(this.postfix_51(builder))) {
            return false;
        }
        marker3.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_40(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.postfixish_40_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.postfixish_40_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.postfixish_40_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean desigilname_41(PsiBuilder builder) {
        if (!(this.longname_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_42_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_42(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.default_value_42_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_DEFAULT);
        return true;
    }

    private boolean pblock_43_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean pblock_43_alt_2(PsiBuilder builder) {
        if (!(this.blockoid_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_43_quant_3(PsiBuilder builder) {
        if (!(this.blockoid_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_43_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.LAMBDA) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if (!(this.signature_136(builder))) {
            return false;
        }
        marker3.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.pblock_43_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean pblock_43(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.pblock_43_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.pblock_43_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.pblock_43_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean semilist_44_quant_1(PsiBuilder builder) {
        if (!(this.statement_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean semilist_44_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.semilist_44_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean semilist_44_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SEMI_LIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean semilist_44(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.semilist_44_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.semilist_44_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SEMI_LIST);
        return true;
    }

    private boolean name_45_quant_1(PsiBuilder builder) {
        if (!(this.morename_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_45_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.name_45_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_45_quant_3(PsiBuilder builder) {
        if (!(this.morename_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_45_alt_4(PsiBuilder builder) {
        if (!(this.identifier_46(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.name_45_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_45(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.name_45_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.name_45_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean identifier_46_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_80(builder))) {
            return false;
        }
        if (!(this.ident_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_46(PsiBuilder builder) {
        if (!(this.ident_83(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_46_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_lazy_47(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("lazy"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.LAZY);
        return true;
    }

    private boolean scope_declarator_48_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean scope_declarator_48_alt_2(PsiBuilder builder) {
        if (!(this.declarator_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_48_alt_3(PsiBuilder builder) {
        if (!(this.package_declarator_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_48(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.scope_declarator_48_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.scope_declarator_48_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.scope_declarator_48_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.SCOPED_DECLARATION);
        return true;
    }

    private boolean methodop_49_alt_1(PsiBuilder builder) {
        if (!(this.variable_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_49_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_49_quant_3(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_49_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_49_alt_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_49_alt_6(PsiBuilder builder) {
        if (!(this.args_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_49_alt_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.methodop_49_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_49_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_49_quant_8(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_49(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.methodop_49_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.methodop_49_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.methodop_49_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_49_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.methodop_49_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.methodop_49_quant_8(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean initializer_50_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_50(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.initializer_50_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean postfix_51(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_52_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_52(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("without"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_without_52_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WITHOUT_STATEMENT);
        return true;
    }

    private boolean statement_mod_cond_keyword_53_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_53_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_53_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_53_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_53_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_53(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_mod_cond_keyword_53_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_mod_cond_keyword_53_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_mod_cond_keyword_53_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.statement_mod_cond_keyword_53_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.statement_mod_cond_keyword_53_alt_1(builder)) {
                            altMarker1.drop();
                        } else {
                            altMarker1.rollbackTo();
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean param_sep_54(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_SEPARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean infixish_55(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_108(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean value_56_alt_1(PsiBuilder builder) {
        if (!(this.quote_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_56_alt_2(PsiBuilder builder) {
        if (!(this.number_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_56(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_56_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_56_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean end_keyword_57(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_QUIT_58_quant_1(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_QUIT_58(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("QUIT"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_QUIT_58_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.QUIT_STATEMENT);
        return true;
    }

    private boolean charname_59_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_59_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_59_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_59_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_59(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_59_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_59_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_while_60_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_60(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_while_60_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHILE_STATEMENT);
        return true;
    }

    private boolean block_61(PsiBuilder builder) {
        if (!(this.blockoid_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_try_62(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("try"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TRY);
        return true;
    }

    private boolean term_63_alt_1(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_126(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_2(PsiBuilder builder) {
        if (!(this.term_whatever_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_3(PsiBuilder builder) {
        if (!(this.term_name_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_4(PsiBuilder builder) {
        if (!(this.value_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_5(PsiBuilder builder) {
        if (!(this.dotty_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_6(PsiBuilder builder) {
        if (!(this.package_declarator_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_8(PsiBuilder builder) {
        if (!(this.multi_declarator_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_9(PsiBuilder builder) {
        if (!(this.routine_declarator_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_10(PsiBuilder builder) {
        if (!(this.scope_declarator_48(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_11(PsiBuilder builder) {
        if (!(this.term_ident_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63_alt_12(PsiBuilder builder) {
        if (!(this.variable_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_63(PsiBuilder builder) {
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.term_63_alt_12(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.term_63_alt_11(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.term_63_alt_10(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    PsiBuilder.Marker altMarker9;;
                    altMarker9 = builder.mark();
                    if (this.term_63_alt_9(builder)) {
                        altMarker9.drop();
                    } else {
                        altMarker9.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.term_63_alt_8(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker7;;
                            altMarker7 = builder.mark();
                            if (this.term_63_alt_7(builder)) {
                                altMarker7.drop();
                            } else {
                                altMarker7.rollbackTo();
                                PsiBuilder.Marker altMarker6;;
                                altMarker6 = builder.mark();
                                if (this.term_63_alt_6(builder)) {
                                    altMarker6.drop();
                                } else {
                                    altMarker6.rollbackTo();
                                    PsiBuilder.Marker altMarker5;;
                                    altMarker5 = builder.mark();
                                    if (this.term_63_alt_5(builder)) {
                                        altMarker5.drop();
                                    } else {
                                        altMarker5.rollbackTo();
                                        PsiBuilder.Marker altMarker4;;
                                        altMarker4 = builder.mark();
                                        if (this.term_63_alt_4(builder)) {
                                            altMarker4.drop();
                                        } else {
                                            altMarker4.rollbackTo();
                                            PsiBuilder.Marker altMarker3;;
                                            altMarker3 = builder.mark();
                                            if (this.term_63_alt_3(builder)) {
                                                altMarker3.drop();
                                            } else {
                                                altMarker3.rollbackTo();
                                                PsiBuilder.Marker altMarker2;;
                                                altMarker2 = builder.mark();
                                                if (this.term_63_alt_2(builder)) {
                                                    altMarker2.drop();
                                                } else {
                                                    altMarker2.rollbackTo();
                                                    PsiBuilder.Marker altMarker1;;
                                                    altMarker1 = builder.mark();
                                                    if (this.term_63_alt_1(builder)) {
                                                        altMarker1.drop();
                                                    } else {
                                                        altMarker1.rollbackTo();
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean binint_64_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_64_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_64_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_64(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_64_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_65_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_65_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_65_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_65(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_65_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean TOP_66_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_66_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_66(PsiBuilder builder) {
        if (!(this.statementlist_22(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_66_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_66_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_quietly_67(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("quietly"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.QUIETLY);
        return true;
    }

    private boolean statement_prefix_start_68(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("start"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.START);
        return true;
    }

    private boolean starter_69(PsiBuilder builder) {
        return true;
    }

    private boolean escale_70(PsiBuilder builder) {
        if (!(this.sign_79(builder))) {
            return false;
        }
        if (!(this.decint_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean version_71(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VERSION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.VERSION);
        return true;
    }

    private boolean xblock_72_quant_1(PsiBuilder builder) {
        if (!(this.pblock_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean xblock_72(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.xblock_72_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_need_73_alt_1(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_73_alt_2(PsiBuilder builder) {
        if (!(this.version_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_73_alt_3(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_73_alt_4(PsiBuilder builder) {
        if (!(this.version_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_73_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_need_73_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_need_73_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_need_73_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(","))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_need_73_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_73_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_need_73_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_need_73_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_need_73_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_need_73(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("need"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_need_73_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NEED_STATEMENT);
        return true;
    }

    private boolean statement_prefix_74_alt_1(PsiBuilder builder) {
        if (!(this.statement_prefix_do_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_2(PsiBuilder builder) {
        if (!(this.statement_prefix_react_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_3(PsiBuilder builder) {
        if (!(this.statement_prefix_supply_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_4(PsiBuilder builder) {
        if (!(this.statement_prefix_start_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_5(PsiBuilder builder) {
        if (!(this.statement_prefix_once_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_6(PsiBuilder builder) {
        if (!(this.statement_prefix_gather_120(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_quietly_67(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_try_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_9(PsiBuilder builder) {
        if (!(this.statement_prefix_sink_96(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_10(PsiBuilder builder) {
        if (!(this.statement_prefix_eager_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_11(PsiBuilder builder) {
        if (!(this.statement_prefix_lazy_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_12(PsiBuilder builder) {
        if (!(this.statement_prefix_hyper_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_13(PsiBuilder builder) {
        if (!(this.statement_prefix_race_115(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_14(PsiBuilder builder) {
        if (!(this.statement_prefix_phaser_92(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74_alt_15(PsiBuilder builder) {
        if (!(this.statement_prefix_DOC_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_74(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.statement_prefix_74_alt_15(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.statement_prefix_74_alt_14(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                PsiBuilder.Marker altMarker13;;
                altMarker13 = builder.mark();
                if (this.statement_prefix_74_alt_13(builder)) {
                    altMarker13.drop();
                } else {
                    altMarker13.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.statement_prefix_74_alt_12(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.statement_prefix_74_alt_11(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker10;;
                            altMarker10 = builder.mark();
                            if (this.statement_prefix_74_alt_10(builder)) {
                                altMarker10.drop();
                            } else {
                                altMarker10.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.statement_prefix_74_alt_9(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.statement_prefix_74_alt_8(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.statement_prefix_74_alt_7(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.statement_prefix_74_alt_6(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.statement_prefix_74_alt_5(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.statement_prefix_74_alt_4(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
                                                        PsiBuilder.Marker altMarker3;;
                                                        altMarker3 = builder.mark();
                                                        if (this.statement_prefix_74_alt_3(builder)) {
                                                            altMarker3.drop();
                                                        } else {
                                                            altMarker3.rollbackTo();
                                                            PsiBuilder.Marker altMarker2;;
                                                            altMarker2 = builder.mark();
                                                            if (this.statement_prefix_74_alt_2(builder)) {
                                                                altMarker2.drop();
                                                            } else {
                                                                altMarker2.rollbackTo();
                                                                PsiBuilder.Marker altMarker1;;
                                                                altMarker1 = builder.mark();
                                                                if (this.statement_prefix_74_alt_1(builder)) {
                                                                    altMarker1.drop();
                                                                } else {
                                                                    altMarker1.rollbackTo();
                                                                    return false;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean octints_75_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_75_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_75_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_75_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_86(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_75_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_75(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_75_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean phaser_name_76_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_11(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_14(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_15(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76_alt_16(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_76(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.phaser_name_76_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.phaser_name_76_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.phaser_name_76_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.phaser_name_76_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.phaser_name_76_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.phaser_name_76_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.phaser_name_76_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.phaser_name_76_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.phaser_name_76_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.phaser_name_76_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.phaser_name_76_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.phaser_name_76_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.phaser_name_76_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.phaser_name_76_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.phaser_name_76_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.phaser_name_76_alt_1(builder)) {
                                                                        altMarker1.drop();
                                                                    } else {
                                                                        altMarker1.rollbackTo();
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean arglist_77_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean arglist_77_alt_2(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_77(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.arglist_77_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.arglist_77_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean stopper_78_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_78_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_78(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_78_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_78_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean sign_79_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_79_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_79_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_79_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_79(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_79_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_79_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_79_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_79_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean apostrophe_80(PsiBuilder builder) {
        return true;
    }

    private boolean postcircumfix_81_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.postcircumfix_81_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CALL);
        return true;
    }

    private boolean postcircumfix_81_quant_3(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_4(PsiBuilder builder) {
        if (!(this.quote_q_118(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.postcircumfix_81_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_81_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt3.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.postcircumfix_81_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_81_quant_6(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt6.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_7(PsiBuilder builder) {
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.postcircumfix_81_quant_6(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_81_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt5.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.postcircumfix_81_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_81_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt8.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_10(PsiBuilder builder) {
        if (!(this.quote_qq_107(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.postcircumfix_81_quant_9(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_81_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker marker12;
        marker12 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt7.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.postcircumfix_81_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker12.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_81_quant_12(PsiBuilder builder) {
        if (!(this.semilist_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_13(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt10.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_14(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.postcircumfix_81_quant_12(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.postcircumfix_81_quant_13(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_81_alt_15(PsiBuilder builder) {
        PsiBuilder.Marker marker16;
        marker16 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt9.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker19;
        quantMarker19 = builder.mark();
        if (this.postcircumfix_81_quant_14(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        marker16.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_81_quant_16(PsiBuilder builder) {
        if (!(this.semilist_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_17(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt12.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_81_quant_18(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.postcircumfix_81_quant_16(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        PsiBuilder.Marker quantMarker23;
        quantMarker23 = builder.mark();
        if (this.postcircumfix_81_quant_17(builder)) {
            quantMarker23.drop();
        } else {
            quantMarker23.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_81_alt_19(PsiBuilder builder) {
        PsiBuilder.Marker marker21;
        marker21 = builder.mark();
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt11.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker24;
        quantMarker24 = builder.mark();
        if (this.postcircumfix_81_quant_18(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker21.done(Perl6ElementTypes.ARRAY_INDEX);
        return true;
    }

    private boolean postcircumfix_81(PsiBuilder builder) {
        PsiBuilder.Marker altMarker25;
        altMarker25 = builder.mark();
        if (this.postcircumfix_81_alt_19(builder)) {
            altMarker25.drop();
        } else {
            altMarker25.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.postcircumfix_81_alt_15(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.postcircumfix_81_alt_11(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker11;;
                    altMarker11 = builder.mark();
                    if (this.postcircumfix_81_alt_8(builder)) {
                        altMarker11.drop();
                    } else {
                        altMarker11.rollbackTo();
                        PsiBuilder.Marker altMarker7;;
                        altMarker7 = builder.mark();
                        if (this.postcircumfix_81_alt_5(builder)) {
                            altMarker7.drop();
                        } else {
                            altMarker7.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.postcircumfix_81_alt_2(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean bogus_statement_82(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ident_83_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_83_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_83_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_83(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_83_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_83_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_83_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean variable_declarator_84(PsiBuilder builder) {
        if (!(this.variable_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_85_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_85_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_85_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_85_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_85_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_85_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_85_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_85_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_85_alt_6(PsiBuilder builder) {
        if (!(this.charnames_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_85(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_85_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_85_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_85_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean octint_86_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_86_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_86_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_86(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_86_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_lex_87_alt_1(PsiBuilder builder) {
        if (!(this.decint_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_alt_2(PsiBuilder builder) {
        if (!(this.decint_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_87_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_87_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_87_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_87_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_109(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_87_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_87_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_87_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_87_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_64(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_87_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_87_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_87_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_87_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_87_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_87_alt_2(builder)) {
                            altMarker2.drop();
                        } else {
                            altMarker2.rollbackTo();
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean integer_lex_87(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_87_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_87_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_unless_88_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_unless_88(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("unless"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_unless_88_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNLESS_STATEMENT);
        return true;
    }

    private boolean vws_89(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_90_quant_1(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_90(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CATCH"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CATCH_90_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CATCH_STATEMENT);
        return true;
    }

    private boolean statement_prefix_DOC_91_quant_1(PsiBuilder builder) {
        if (!(this.statement_prefix_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_DOC_91(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PHASER) && (tt1.equals("DOC"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_prefix_DOC_91_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean statement_prefix_phaser_92(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PHASER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean blorst_93_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean blorst_93_alt_2(PsiBuilder builder) {
        if (!(this.statement_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_93_alt_3(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_93(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.blorst_93_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.blorst_93_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.blorst_93_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean declarator_94_alt_1(PsiBuilder builder) {
        if (!(this.routine_declarator_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_94_quant_2(PsiBuilder builder) {
        if (!(this.initializer_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_94_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.variable_declarator_84(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.declarator_94_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_94(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.declarator_94_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.declarator_94_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_Q_95(PsiBuilder builder) {
        if (!(this.quote_nibbler_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_sink_96(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("sink"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SINK);
        return true;
    }

    private boolean quote_nibbler_97_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_97_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_97_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_97(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_97_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_97_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_97_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_97_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_97(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_97_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_98_quant_1(PsiBuilder builder) {
        if (!(this.comment_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_98_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_98_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_98_alt_3(PsiBuilder builder) {
        if (!(this.comment_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_98(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_98_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_98_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_given_99_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_given_99(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("given"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_given_99_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.GIVEN_STATEMENT);
        return true;
    }

    private boolean statement_control_CONTROL_100_quant_1(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CONTROL_100(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CONTROL"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CONTROL_100_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CONTROL_STATEMENT);
        return true;
    }

    private boolean infixstopper_101_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_101_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_101_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.infixstopper_101_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixstopper_101_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_101_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_101(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.infixstopper_101_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.infixstopper_101_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_for_102_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_for_102(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("for"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_for_102_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FOR_STATEMENT);
        return true;
    }

    private boolean statement_control_loop_103_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_2(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_3(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt4.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_control_loop_103_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt3.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_loop_103_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_loop_103_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_7(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_loop_103_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_loop_103_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_control_loop_103_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103_quant_8(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_103(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("loop"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_loop_103_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_loop_103_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.LOOP_STATEMENT);
        return true;
    }

    private boolean statement_control_import_104_quant_1(PsiBuilder builder) {
        if (!(this.spacey_123(builder))) {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_104_quant_2(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_import_104_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_104(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("import"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_import_104_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IMPORT_STATEMENT);
        return true;
    }

    private boolean statement_mod_loop_105_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_105(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_LOOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_loop_105_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_LOOP);
        return true;
    }

    private boolean term_name_106_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_106_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_106_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_135(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_106_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker4.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean term_name_106(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_106_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_106_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_qq_107(PsiBuilder builder) {
        if (!(this.quote_nibbler_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean infix_108(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean hexint_109_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_109_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_109_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_109_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_109_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_109_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_109_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_109(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_109_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean numish_110_alt_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.NUMBER_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.NUMBER_LITERAL);
        return true;
    }

    private boolean numish_110_alt_2(PsiBuilder builder) {
        if (!(this.integer_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_110_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_110(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.numish_110_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.numish_110_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.numish_110_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean lambda_111_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_111_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_111(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.lambda_111_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.lambda_111_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean vnum_112_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_112_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_112_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.vnum_112_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean vnum_112(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.vnum_112_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.vnum_112_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean kok_113(PsiBuilder builder) {
        if (!(this.end_keyword_57(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_114_quant_1(PsiBuilder builder) {
        if (!(this.block_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_114(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("default"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_default_114_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.DEFAULT_STATEMENT);
        return true;
    }

    private boolean statement_prefix_race_115(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("race"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.RACE);
        return true;
    }

    private boolean statement_prefix_supply_116(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("supply"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUPPLY);
        return true;
    }

    private boolean prefix_117(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_q_118(PsiBuilder builder) {
        if (!(this.quote_nibbler_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean stdstopper_119_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_119_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_119(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_119_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_119_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_gather_120(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("gather"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.blorst_93(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.GATHER);
        return true;
    }

    private boolean twigil_121(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_122_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_122_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_122_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_122_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_122_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_122_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_122_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_122_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_122_alt_2(builder)) {
                                            altMarker2.drop();
                                        } else {
                                            altMarker2.rollbackTo();
                                            return false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_122_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_122(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_122_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_122_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_122_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_122_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean spacey_123_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_123_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_123(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.spacey_123_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.spacey_123_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_whenever_124_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_whenever_124(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("whenever"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_whenever_124_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHENEVER_STATEMENT);
        return true;
    }

    private boolean statement_control_when_125_quant_1(PsiBuilder builder) {
        if (!(this.xblock_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_when_125(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("when"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_when_125_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHEN_STATEMENT);
        return true;
    }

    private boolean term_hyperwhatever_126(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HYPER_WHATEVER) && (tt1.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER_WHATEVER);
        return true;
    }

    private boolean variable_127(PsiBuilder builder) {
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

    private boolean named_param_128_alt_1(PsiBuilder builder) {
        if (!(this.param_var_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_128_alt_2(PsiBuilder builder) {
        if (!(this.param_var_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_128_alt_3(PsiBuilder builder) {
        if (!(this.named_param_128(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_128_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean named_param_128_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.named_param_128_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.named_param_128_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.named_param_128_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean named_param_128_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.named_param_128_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean named_param_128_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.named_param_128_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean named_param_128_quant_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.named_param_128_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.named_param_128_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_128(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.named_param_128_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NAMED_PARAMETER);
        return true;
    }

    private boolean charnames_129_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_129_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_129_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_129_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_59(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_129_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_129(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_129_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_130_alt_1(PsiBuilder builder) {
        if (!(this.statement_control_QUIT_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_2(PsiBuilder builder) {
        if (!(this.statement_control_CONTROL_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_CATCH_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_default_114(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_5(PsiBuilder builder) {
        if (!(this.statement_control_when_125(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_6(PsiBuilder builder) {
        if (!(this.statement_control_given_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_7(PsiBuilder builder) {
        if (!(this.statement_control_require_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_use_142(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_9(PsiBuilder builder) {
        if (!(this.statement_control_no_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_10(PsiBuilder builder) {
        if (!(this.statement_control_import_104(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_11(PsiBuilder builder) {
        if (!(this.statement_control_need_73(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_12(PsiBuilder builder) {
        if (!(this.statement_control_loop_103(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_13(PsiBuilder builder) {
        if (!(this.statement_control_whenever_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_14(PsiBuilder builder) {
        if (!(this.statement_control_for_102(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_15(PsiBuilder builder) {
        if (!(this.statement_control_repeat_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_16(PsiBuilder builder) {
        if (!(this.statement_control_until_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_17(PsiBuilder builder) {
        if (!(this.statement_control_while_60(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_18(PsiBuilder builder) {
        if (!(this.statement_control_without_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_19(PsiBuilder builder) {
        if (!(this.statement_control_unless_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130_alt_20(PsiBuilder builder) {
        if (!(this.statement_control_if_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_130(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.statement_control_130_alt_20(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.statement_control_130_alt_19(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.statement_control_130_alt_18(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.statement_control_130_alt_17(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker16;;
                        altMarker16 = builder.mark();
                        if (this.statement_control_130_alt_16(builder)) {
                            altMarker16.drop();
                        } else {
                            altMarker16.rollbackTo();
                            PsiBuilder.Marker altMarker15;;
                            altMarker15 = builder.mark();
                            if (this.statement_control_130_alt_15(builder)) {
                                altMarker15.drop();
                            } else {
                                altMarker15.rollbackTo();
                                PsiBuilder.Marker altMarker14;;
                                altMarker14 = builder.mark();
                                if (this.statement_control_130_alt_14(builder)) {
                                    altMarker14.drop();
                                } else {
                                    altMarker14.rollbackTo();
                                    PsiBuilder.Marker altMarker13;;
                                    altMarker13 = builder.mark();
                                    if (this.statement_control_130_alt_13(builder)) {
                                        altMarker13.drop();
                                    } else {
                                        altMarker13.rollbackTo();
                                        PsiBuilder.Marker altMarker12;;
                                        altMarker12 = builder.mark();
                                        if (this.statement_control_130_alt_12(builder)) {
                                            altMarker12.drop();
                                        } else {
                                            altMarker12.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.statement_control_130_alt_11(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.statement_control_130_alt_10(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker9;;
                                                    altMarker9 = builder.mark();
                                                    if (this.statement_control_130_alt_9(builder)) {
                                                        altMarker9.drop();
                                                    } else {
                                                        altMarker9.rollbackTo();
                                                        PsiBuilder.Marker altMarker8;;
                                                        altMarker8 = builder.mark();
                                                        if (this.statement_control_130_alt_8(builder)) {
                                                            altMarker8.drop();
                                                        } else {
                                                            altMarker8.rollbackTo();
                                                            PsiBuilder.Marker altMarker7;;
                                                            altMarker7 = builder.mark();
                                                            if (this.statement_control_130_alt_7(builder)) {
                                                                altMarker7.drop();
                                                            } else {
                                                                altMarker7.rollbackTo();
                                                                PsiBuilder.Marker altMarker6;;
                                                                altMarker6 = builder.mark();
                                                                if (this.statement_control_130_alt_6(builder)) {
                                                                    altMarker6.drop();
                                                                } else {
                                                                    altMarker6.rollbackTo();
                                                                    PsiBuilder.Marker altMarker5;;
                                                                    altMarker5 = builder.mark();
                                                                    if (this.statement_control_130_alt_5(builder)) {
                                                                        altMarker5.drop();
                                                                    } else {
                                                                        altMarker5.rollbackTo();
                                                                        PsiBuilder.Marker altMarker4;;
                                                                        altMarker4 = builder.mark();
                                                                        if (this.statement_control_130_alt_4(builder)) {
                                                                            altMarker4.drop();
                                                                        } else {
                                                                            altMarker4.rollbackTo();
                                                                            PsiBuilder.Marker altMarker3;;
                                                                            altMarker3 = builder.mark();
                                                                            if (this.statement_control_130_alt_3(builder)) {
                                                                                altMarker3.drop();
                                                                            } else {
                                                                                altMarker3.rollbackTo();
                                                                                PsiBuilder.Marker altMarker2;;
                                                                                altMarker2 = builder.mark();
                                                                                if (this.statement_control_130_alt_2(builder)) {
                                                                                    altMarker2.drop();
                                                                                } else {
                                                                                    altMarker2.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                    altMarker1 = builder.mark();
                                                                                    if (this.statement_control_130_alt_1(builder)) {
                                                                                        altMarker1.drop();
                                                                                    } else {
                                                                                        altMarker1.rollbackTo();
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean statement_mod_cond_131_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_131(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_COND) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_113(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_cond_131_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_COND);
        return true;
    }

    private boolean semiarglist_132(PsiBuilder builder) {
        if (!(this.arglist_77(builder))) {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean param_var_133_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postcircumfix_81(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.ARRAY_SHAPE);
        return true;
    }

    private boolean param_var_133_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.param_var_133_quant_1(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_VARIABLE);
        return true;
    }

    private boolean param_var_133_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_133_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.param_var_133_quant_3(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_133_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_133_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.param_var_133_quant_5(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_133(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.param_var_133_alt_6(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.param_var_133_alt_4(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.param_var_133_alt_2(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean prefixish_134(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_117(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean args_135_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean args_135_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_135_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_135_alt_4(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_132(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_135_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_135_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_135_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_132(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_135_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_135(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_135_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_135_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_135_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_135_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean signature_136_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean signature_136_alt_2(PsiBuilder builder) {
        if (!(this.parameter_29(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_136_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_136_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.signature_136_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.signature_136_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean signature_136_quant_5(PsiBuilder builder) {
        if (!(this.param_sep_54(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.signature_136_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean signature_136_alt_6(PsiBuilder builder) {
        if (!(this.parameter_29(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.signature_136_quant_5(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean signature_136_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_136(PsiBuilder builder) {
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.signature_136_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.signature_136_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.signature_136_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean number_137(PsiBuilder builder) {
        if (!(this.numish_110(builder))) {
            return false;
        }
        return true;
    }

    private boolean blockoid_138_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_138(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_22(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.blockoid_138_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.BLOCK);
        return true;
    }

    private boolean morename_139_quant_1(PsiBuilder builder) {
        if (!(this.identifier_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_139(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_139_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean post_constraint_140_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean post_constraint_140_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.post_constraint_140_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean post_constraint_140_quant_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_140_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.post_constraint_140_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_140_quant_5(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_140_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.post_constraint_140_quant_5(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_140(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.post_constraint_140_alt_6(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.post_constraint_140_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.post_constraint_140_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_141_alt_1(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_141_alt_2(PsiBuilder builder) {
        if (!(this.unv_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_141_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_141_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_141_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_141_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_141_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_141(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_141_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_use_142_quant_1(PsiBuilder builder) {
        if (!(this.spacey_123(builder))) {
            return false;
        }
        if (!(this.arglist_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_142_alt_2(PsiBuilder builder) {
        if (!(this.module_name_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_use_142_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_use_142_alt_3(PsiBuilder builder) {
        if (!(this.version_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_142_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_use_142_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_use_142_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_use_142(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_use_142_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.ws_141(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
