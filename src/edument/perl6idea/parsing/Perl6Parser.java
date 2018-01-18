package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_80(builder);
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
        if (!(this.quote_Q_118(builder))) {
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
        if (!(this.quote_qq_134(builder))) {
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
        if (!(this.quote_qq_134(builder))) {
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
        if (!(this.quote_qq_134(builder))) {
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
        if (!(this.quote_qq_134(builder))) {
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
        if (!(this.quote_q_149(builder))) {
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
        if (!(this.quote_q_149(builder))) {
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
        if (!(this.quote_q_149(builder))) {
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
        if (!(this.quote_q_149(builder))) {
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
        if (!(this.xblock_89(builder))) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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
        if (!(this.xblock_89(builder))) {
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
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_if_3_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_7(PsiBuilder builder) {
        if (!(this.pblock_51(builder))) {
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
        if (!(this.ws_179(builder))) {
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
        if (!(this.xblock_89(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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
        if (!(this.ws_179(builder))) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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
        if (!(this.unv_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_4_alt_3(PsiBuilder builder) {
        if (!(this.vws_112(builder))) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REACT);
        return true;
    }

    private boolean routine_declarator_6_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_6_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_6_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_6(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.routine_declarator_6_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.routine_declarator_6_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.routine_declarator_6_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.ROUTINE_DECLARATION);
        return true;
    }

    private boolean termish_7(PsiBuilder builder) {
        if (!(this.term_77(builder))) {
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
        if (!(this.dottyop_13(builder))) {
            return false;
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
        if (!(this.EXPR_27(builder))) {
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
        if (!(this.pblock_51(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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
        if (!(this.xblock_89(builder))) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
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

    private boolean normspace_11(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean termalt_12_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termalt_12_alt_2(PsiBuilder builder) {
        if (!(this.termconj_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean termalt_12_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termalt_12_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termalt_12_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termalt_12(PsiBuilder builder) {
        if (!(this.termconj_23(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termalt_12_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean dottyop_13_quant_1(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_13_quant_2(PsiBuilder builder) {
        if (!(this.methodop_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_13(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_13_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dottyop_13_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean dec_number_14_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_14_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_14(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_14_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_14_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean package_def_15_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_15_quant_2(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_15_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_def_15_quant_4(PsiBuilder builder) {
        if (!(this.statementlist_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_15_alt_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.package_def_15_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean package_def_15_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_15(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.package_def_15_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.package_def_15_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.package_def_15_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.package_def_15_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.package_def_15_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean package_kind_16_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_16(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.package_kind_16_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.package_kind_16_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.package_kind_16_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.package_kind_16_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.package_kind_16_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.package_kind_16_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.package_kind_16_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.package_kind_16_alt_1(builder)) {
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

    private boolean package_declarator_17(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PACKAGE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.package_def_15(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PACKAGE_DECLARATION);
        return true;
    }

    private boolean statement_18_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_101(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_18_alt_2(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_18_quant_3(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_18_alt_4(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if (!(this.statement_mod_cond_165(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_18_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean statement_18_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_18_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_18_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_18_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_18_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_18_alt_7(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_18_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_18_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_164(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_18(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.statement_18_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_18_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.statement_18_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_control_require_19_alt_1(PsiBuilder builder) {
        if (!(this.term_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_19_alt_2(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_19_alt_3(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_19_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_19_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_require_19_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_require_19_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_require_19_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_require_19_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_19(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("require"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_require_19_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REQUIRE_STATEMENT);
        return true;
    }

    private boolean statement_prefix_hyper_20(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("hyper"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER);
        return true;
    }

    private boolean multi_declarator_21_alt_1(PsiBuilder builder) {
        if (!(this.declarator_117(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_21_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean multi_declarator_21_alt_3(PsiBuilder builder) {
        if (!(this.routine_def_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_21_alt_4(PsiBuilder builder) {
        if (!(this.declarator_117(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_21_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.multi_declarator_21_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.multi_declarator_21_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.multi_declarator_21_alt_2(builder)) {
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

    private boolean multi_declarator_21(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.multi_declarator_21_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.multi_declarator_21_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean onlystar_22(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
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

    private boolean termconj_23_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconj_23_alt_2(PsiBuilder builder) {
        if (!(this.rxtermish_121(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconj_23_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconj_23_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconj_23_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconj_23(PsiBuilder builder) {
        if (!(this.rxtermish_121(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconj_23_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean quote_escape_24_alt_1(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_7(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_8(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_24_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_24_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.quote_escape_24_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_24(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.quote_escape_24_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_24_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.quote_escape_24_alt_5(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.quote_escape_24_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.quote_escape_24_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.quote_escape_24_alt_2(builder)) {
                                altMarker2.drop();
                            } else {
                                altMarker2.rollbackTo();
                                PsiBuilder.Marker altMarker1;;
                                altMarker1 = builder.mark();
                                if (this.quote_escape_24_alt_1(builder)) {
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

    private boolean statementlist_25_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_25_alt_2(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_25_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.statement_18(builder))) {
            return false;
        }
        if (!(this.eat_terminator_170(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean statementlist_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_25_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_25_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.statementlist_25_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean method_def_26_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_26_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_26_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.method_def_26_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean method_def_26_quant_4(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_26_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean method_def_26_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_26_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_26(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.method_def_26_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.method_def_26_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.method_def_26_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.method_def_26_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.method_def_26_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.method_def_26_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean EXPR_27_alt_1(PsiBuilder builder) {
        if (!(this.termish_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_quant_2(PsiBuilder builder) {
        if (!(this.prefixish_169(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_quant_3(PsiBuilder builder) {
        if (!(this.termish_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.EXPR_27_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_27_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.EXPR_27_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_27_quant_5(PsiBuilder builder) {
        if (!(this.postfixish_48(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_alt_6(PsiBuilder builder) {
        if (!(this.termish_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_quant_7(PsiBuilder builder) {
        if (!(this.prefixish_169(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_quant_8(PsiBuilder builder) {
        if (!(this.termish_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.EXPR_27_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.EXPR_27_quant_7(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.EXPR_27_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_27_quant_10(PsiBuilder builder) {
        if (!(this.postfixish_48(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_27_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.EXPR_27_alt_9(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.EXPR_27_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker13;;
            quantMarker13 = builder.mark();
            if (this.EXPR_27_quant_10(builder)) {
                quantMarker13.drop();
            } else {
                quantMarker13.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_27_quant_12(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if (!(this.infixish_67(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.EXPR_27_quant_11(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_27(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.EXPR_27_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.EXPR_27_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_27_quant_5(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker15;;
            quantMarker15 = builder.mark();
            if (this.EXPR_27_quant_12(builder)) {
                quantMarker15.drop();
            } else {
                quantMarker15.rollbackTo();
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

    private boolean sigil_28(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_29_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_29_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_29_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ENDSTMT_29_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ENDSTMT_29_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean ENDSTMT_29(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.ENDSTMT_29_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean module_name_30(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean longname_31(PsiBuilder builder) {
        if (!(this.name_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean bogus_end_32(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_33_alt_1(PsiBuilder builder) {
        if (!(this.named_param_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_33_alt_2(PsiBuilder builder) {
        if (!(this.param_var_167(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_33_quant_3(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_33_quant_4(PsiBuilder builder) {
        if (!(this.post_constraint_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_33_quant_5(PsiBuilder builder) {
        if (!(this.default_value_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_33(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.parameter_33_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.parameter_33_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.parameter_33_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.parameter_33_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.parameter_33_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER);
        return true;
    }

    private boolean rxinfixstopper_34_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_34_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_34_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_34(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.rxinfixstopper_34_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.rxinfixstopper_34_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.rxinfixstopper_34_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_control_no_35_quant_1(PsiBuilder builder) {
        if (!(this.spacey_155(builder))) {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_35_quant_2(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_no_35_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_35(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("no"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_no_35_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NO_STATEMENT);
        return true;
    }

    private boolean statement_prefix_eager_36(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("eager"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.EAGER);
        return true;
    }

    private boolean term_ident_37_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_37(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_37_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_171(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean typename_38_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_3(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt2.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.typename_38_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean typename_38_quant_6(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_7(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_38_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_alt_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.typename_38_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.typename_38_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.typename_38_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_38_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_38_alt_12(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_38_quant_13(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAME) && (tt5.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.typename_38_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.typename_38_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_38(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.typename_38_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.typename_38_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.typename_38_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.typename_38_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.typename_38_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.typename_38_quant_10(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.typename_38_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean hexints_39_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_39_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_39_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_39_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_138(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_39_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_39(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexints_39_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_39_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_40(PsiBuilder builder) {
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

    private boolean statement_prefix_once_41(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("once"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONCE);
        return true;
    }

    private boolean statement_prefix_do_42(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("do"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.DO);
        return true;
    }

    private boolean regex_nibbler_43_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt2.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt3.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt4.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_nibbler_43_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_nibbler_43_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_nibbler_43_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.regex_nibbler_43_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43_quant_6(PsiBuilder builder) {
        if (!(this.termseq_168(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_43(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.regex_nibbler_43_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.regex_nibbler_43_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean privop_44_quant_1(PsiBuilder builder) {
        if (!(this.methodop_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean privop_44(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt1.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.privop_44_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean comment_45(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_keyword_46_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_46_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_46_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_46_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_46(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_mod_loop_keyword_46_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_mod_loop_keyword_46_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_mod_loop_keyword_46_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.statement_mod_loop_keyword_46_alt_1(builder)) {
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

    private boolean routine_def_47_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_47_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_47_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_47_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_47_quant_4(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_47_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_47_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_47_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_47(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_47_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_47_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.routine_def_47_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.routine_def_47_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.routine_def_47_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.routine_def_47_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean postfixish_48_alt_1(PsiBuilder builder) {
        if (!(this.privop_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_48_alt_2(PsiBuilder builder) {
        if (!(this.dotty_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_48_alt_3(PsiBuilder builder) {
        if (!(this.postcircumfix_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_48_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.postfix_60(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_48(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.postfixish_48_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.postfixish_48_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.postfixish_48_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.postfixish_48_alt_1(builder)) {
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

    private boolean desigilname_49(PsiBuilder builder) {
        if (!(this.longname_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_50_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_50(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.default_value_50_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_DEFAULT);
        return true;
    }

    private boolean pblock_51_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLOCK) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean pblock_51_alt_2(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_51_quant_3(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_51_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.LAMBDA) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.signature_172(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.pblock_51_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.POINTY_BLOCK);
        return true;
    }

    private boolean pblock_51(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.pblock_51_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.pblock_51_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.pblock_51_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean semilist_52_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.statement_18(builder))) {
            return false;
        }
        if (!(this.eat_terminator_170(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean semilist_52_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.semilist_52_quant_1(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean semilist_52_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SEMI_LIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean semilist_52(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.semilist_52_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.semilist_52_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SEMI_LIST);
        return true;
    }

    private boolean name_53_quant_1(PsiBuilder builder) {
        if (!(this.morename_175(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_53_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.name_53_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.name_53_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_53_quant_3(PsiBuilder builder) {
        if (!(this.morename_175(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_53_alt_4(PsiBuilder builder) {
        if (!(this.identifier_54(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.name_53_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_53(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.name_53_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.name_53_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean identifier_54_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_97(builder))) {
            return false;
        }
        if (!(this.ident_102(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_54(PsiBuilder builder) {
        if (!(this.ident_102(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_54_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_lazy_55(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("lazy"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.LAZY);
        return true;
    }

    private boolean scope_declarator_56_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean scope_declarator_56_alt_2(PsiBuilder builder) {
        if (!(this.declarator_117(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_56_alt_3(PsiBuilder builder) {
        if (!(this.package_declarator_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_56(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.scope_declarator_56_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.scope_declarator_56_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.scope_declarator_56_alt_1(builder)) {
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

    private boolean termconjseq_57_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconjseq_57_alt_2(PsiBuilder builder) {
        if (!(this.termalt_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconjseq_57_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconjseq_57_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconjseq_57_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconjseq_57(PsiBuilder builder) {
        if (!(this.termalt_12(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconjseq_57_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean methodop_58_alt_1(PsiBuilder builder) {
        if (!(this.quote_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58_alt_2(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_58_quant_4(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_58_alt_6(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58_alt_7(PsiBuilder builder) {
        if (!(this.args_171(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_58_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.methodop_58_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_58_quant_9(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_58(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.methodop_58_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.methodop_58_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.methodop_58_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.methodop_58_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.methodop_58_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_58_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.methodop_58_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean initializer_59_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("::="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_59_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(":="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_59_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt3.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_59_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INITIALIZER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_59_alt_5(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_59(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.initializer_59_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.initializer_59_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.initializer_59_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.initializer_59_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.initializer_59_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean postfix_60(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_61_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt1.equals("token"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.regex_def_177(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_61_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt2.equals("rule"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.regex_def_177(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_61_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt3.equals("regex"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.regex_def_177(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_61(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_declarator_61_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_declarator_61_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_declarator_61_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_DECLARATION);
        return true;
    }

    private boolean trait_62(PsiBuilder builder) {
        if (!(this.trait_mod_140(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_63_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_63(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("without"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_without_63_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WITHOUT_STATEMENT);
        return true;
    }

    private boolean statement_mod_cond_keyword_64_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_64_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_64_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_64_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_64_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_64(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_mod_cond_keyword_64_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_mod_cond_keyword_64_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_mod_cond_keyword_64_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.statement_mod_cond_keyword_64_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.statement_mod_cond_keyword_64_alt_1(builder)) {
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

    private boolean param_sep_65(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_SEPARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxarglist_66(PsiBuilder builder) {
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean infixish_67(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_137(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean value_68_alt_1(PsiBuilder builder) {
        if (!(this.quote_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_68_alt_2(PsiBuilder builder) {
        if (!(this.number_173(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_68(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_68_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_68_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean end_keyword_69(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_QUIT_70_quant_1(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_QUIT_70(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("QUIT"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_QUIT_70_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.QUIT_STATEMENT);
        return true;
    }

    private boolean rxcodeblock_71(PsiBuilder builder) {
        if (!(this.pblock_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_72_alt_1(PsiBuilder builder) {
        if (!(this.metachar_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_72_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_LITERAL);
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_72(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.atom_72_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.atom_72_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean charname_73_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_73_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_73_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_73_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_110(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_73(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_73_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_73_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_while_74_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_74(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_while_74_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHILE_STATEMENT);
        return true;
    }

    private boolean block_75(PsiBuilder builder) {
        if (!(this.blockoid_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_try_76(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("try"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TRY);
        return true;
    }

    private boolean term_77_alt_1(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_2(PsiBuilder builder) {
        if (!(this.term_whatever_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_3(PsiBuilder builder) {
        if (!(this.term_name_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_4(PsiBuilder builder) {
        if (!(this.value_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_5(PsiBuilder builder) {
        if (!(this.pblock_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_6(PsiBuilder builder) {
        if (!(this.dotty_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_7(PsiBuilder builder) {
        if (!(this.package_declarator_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_9(PsiBuilder builder) {
        if (!(this.multi_declarator_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_10(PsiBuilder builder) {
        if (!(this.regex_declarator_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_11(PsiBuilder builder) {
        if (!(this.routine_declarator_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_12(PsiBuilder builder) {
        if (!(this.scope_declarator_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_13(PsiBuilder builder) {
        if (!(this.term_ident_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_14(PsiBuilder builder) {
        if (!(this.term_self_152(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_15(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77_alt_16(PsiBuilder builder) {
        if (!(this.fatarrow_147(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_77(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.term_77_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.term_77_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.term_77_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.term_77_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.term_77_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.term_77_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.term_77_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.term_77_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.term_77_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.term_77_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.term_77_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.term_77_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.term_77_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.term_77_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.term_77_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.term_77_alt_1(builder)) {
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

    private boolean binint_78_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_78_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.binint_78_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_78_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_78(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.binint_78_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_78_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_79_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_79_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.decint_79_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_79_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_79(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.decint_79_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_79_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean TOP_80_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_80_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_80(PsiBuilder builder) {
        if (!(this.statementlist_25(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_80_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_80_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_quietly_81(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("quietly"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.QUIETLY);
        return true;
    }

    private boolean statement_prefix_start_82(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("start"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.START);
        return true;
    }

    private boolean cclass_backslash_83(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean sigmaybe_84_alt_1(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean sigmaybe_84_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.normspace_11(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_SIGSPACE);
        return true;
    }

    private boolean sigmaybe_84(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.sigmaybe_84_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.sigmaybe_84_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean starter_85(PsiBuilder builder) {
        return true;
    }

    private boolean escale_86(PsiBuilder builder) {
        if (!(this.sign_96(builder))) {
            return false;
        }
        if (!(this.decint_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean version_87(PsiBuilder builder) {
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

    private boolean quantified_atom_88_quant_1(PsiBuilder builder) {
        if (!(this.sigmaybe_84(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_88_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker3.done(Perl6ElementTypes.REGEX_QUANTIFIER);
        return true;
    }

    private boolean quantified_atom_88_alt_3(PsiBuilder builder) {
        if (!(this.quantifier_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_88_quant_4(PsiBuilder builder) {
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        if (!(this.sigmaybe_84(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_88_quant_5(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if (!(this.separator_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_88_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.quantified_atom_88_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.quantified_atom_88_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quantified_atom_88_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.quantified_atom_88_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean quantified_atom_88(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.atom_72(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quantified_atom_88_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantified_atom_88_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_ATOM);
        return true;
    }

    private boolean xblock_89_quant_1(PsiBuilder builder) {
        if (!(this.pblock_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean xblock_89(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.xblock_89_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_need_90_alt_1(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_90_alt_2(PsiBuilder builder) {
        if (!(this.version_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_90_alt_3(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_90_alt_4(PsiBuilder builder) {
        if (!(this.version_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_90_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_need_90_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_need_90_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_need_90_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(","))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_need_90_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_90_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_need_90_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_need_90_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_need_90_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_need_90(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("need"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_need_90_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NEED_STATEMENT);
        return true;
    }

    private boolean statement_prefix_91_alt_1(PsiBuilder builder) {
        if (!(this.statement_prefix_do_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_2(PsiBuilder builder) {
        if (!(this.statement_prefix_react_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_3(PsiBuilder builder) {
        if (!(this.statement_prefix_supply_146(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_4(PsiBuilder builder) {
        if (!(this.statement_prefix_start_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_5(PsiBuilder builder) {
        if (!(this.statement_prefix_once_41(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_6(PsiBuilder builder) {
        if (!(this.statement_prefix_gather_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_quietly_81(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_try_76(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_9(PsiBuilder builder) {
        if (!(this.statement_prefix_sink_119(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_10(PsiBuilder builder) {
        if (!(this.statement_prefix_eager_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_11(PsiBuilder builder) {
        if (!(this.statement_prefix_lazy_55(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_12(PsiBuilder builder) {
        if (!(this.statement_prefix_hyper_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_13(PsiBuilder builder) {
        if (!(this.statement_prefix_race_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_14(PsiBuilder builder) {
        if (!(this.statement_prefix_phaser_115(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91_alt_15(PsiBuilder builder) {
        if (!(this.statement_prefix_DOC_114(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_91(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.statement_prefix_91_alt_15(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.statement_prefix_91_alt_14(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                PsiBuilder.Marker altMarker13;;
                altMarker13 = builder.mark();
                if (this.statement_prefix_91_alt_13(builder)) {
                    altMarker13.drop();
                } else {
                    altMarker13.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.statement_prefix_91_alt_12(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.statement_prefix_91_alt_11(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker10;;
                            altMarker10 = builder.mark();
                            if (this.statement_prefix_91_alt_10(builder)) {
                                altMarker10.drop();
                            } else {
                                altMarker10.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.statement_prefix_91_alt_9(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.statement_prefix_91_alt_8(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.statement_prefix_91_alt_7(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.statement_prefix_91_alt_6(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.statement_prefix_91_alt_5(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.statement_prefix_91_alt_4(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
                                                        PsiBuilder.Marker altMarker3;;
                                                        altMarker3 = builder.mark();
                                                        if (this.statement_prefix_91_alt_3(builder)) {
                                                            altMarker3.drop();
                                                        } else {
                                                            altMarker3.rollbackTo();
                                                            PsiBuilder.Marker altMarker2;;
                                                            altMarker2 = builder.mark();
                                                            if (this.statement_prefix_91_alt_2(builder)) {
                                                                altMarker2.drop();
                                                            } else {
                                                                altMarker2.rollbackTo();
                                                                PsiBuilder.Marker altMarker1;;
                                                                altMarker1 = builder.mark();
                                                                if (this.statement_prefix_91_alt_1(builder)) {
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

    private boolean octints_92_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_92_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_92_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_92_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_109(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_92_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_92(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octints_92_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_92_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean phaser_name_93_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_11(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_14(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_15(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93_alt_16(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_93(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.phaser_name_93_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.phaser_name_93_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.phaser_name_93_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.phaser_name_93_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.phaser_name_93_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.phaser_name_93_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.phaser_name_93_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.phaser_name_93_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.phaser_name_93_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.phaser_name_93_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.phaser_name_93_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.phaser_name_93_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.phaser_name_93_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.phaser_name_93_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.phaser_name_93_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.phaser_name_93_alt_1(builder)) {
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

    private boolean arglist_94_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_94_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.arglist_94_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean arglist_94_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_EMPTY) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean arglist_94(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_START) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.arglist_94_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.arglist_94_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean stopper_95_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_95_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_95(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_95_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_95_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean sign_96_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_96_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_96_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_96_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_96(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_96_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_96_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_96_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_96_alt_1(builder)) {
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

    private boolean apostrophe_97(PsiBuilder builder) {
        return true;
    }

    private boolean rxq_98_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_98_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxq_98_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxq_98_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_98_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxq_98_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxq_98_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_98_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxq_98_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxq_98_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_98_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxq_98_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxq_98(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxq_98_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxq_98_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxq_98_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxq_98_alt_2(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        return false;
                    }
                }
            }
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean quantifier_99_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_quant_2(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_quant_3(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_alt_5(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHATEVER) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_alt_6(PsiBuilder builder) {
        if (!(this.integer_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.quantifier_99_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quantifier_99_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quantifier_99_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantifier_99_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_99_alt_9(PsiBuilder builder) {
        if (!(this.integer_40(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.quantifier_99_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_99_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PREFIX) && (tt3.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_alt_11(PsiBuilder builder) {
        if (!(this.rxcodeblock_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_99_alt_12(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) && (tt1.equals("**"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.quantifier_99_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.quantifier_99_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.quantifier_99_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.quantifier_99_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.quantifier_99_alt_9(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.quantifier_99_alt_4(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean quantifier_99(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.quantifier_99_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quantifier_99_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_QUANTIFIER);
        return true;
    }

    private boolean postcircumfix_100_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.postcircumfix_100_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CALL);
        return true;
    }

    private boolean postcircumfix_100_quant_3(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_4(PsiBuilder builder) {
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.postcircumfix_100_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_100_alt_5(PsiBuilder builder) {
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
        if (this.postcircumfix_100_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_100_quant_6(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt6.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_7(PsiBuilder builder) {
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.postcircumfix_100_quant_6(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_100_alt_8(PsiBuilder builder) {
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
        if (this.postcircumfix_100_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_100_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt8.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_10(PsiBuilder builder) {
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.postcircumfix_100_quant_9(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_100_alt_11(PsiBuilder builder) {
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
        if (this.postcircumfix_100_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker12.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_100_quant_12(PsiBuilder builder) {
        if (!(this.semilist_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_13(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt10.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_14(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.postcircumfix_100_quant_12(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.postcircumfix_100_quant_13(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_100_alt_15(PsiBuilder builder) {
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
        if (this.postcircumfix_100_quant_14(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        marker16.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_100_quant_16(PsiBuilder builder) {
        if (!(this.semilist_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_17(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt12.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_100_quant_18(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.postcircumfix_100_quant_16(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        PsiBuilder.Marker quantMarker23;
        quantMarker23 = builder.mark();
        if (this.postcircumfix_100_quant_17(builder)) {
            quantMarker23.drop();
        } else {
            quantMarker23.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_100_alt_19(PsiBuilder builder) {
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
        if (this.postcircumfix_100_quant_18(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker21.done(Perl6ElementTypes.ARRAY_INDEX);
        return true;
    }

    private boolean postcircumfix_100(PsiBuilder builder) {
        PsiBuilder.Marker altMarker25;
        altMarker25 = builder.mark();
        if (this.postcircumfix_100_alt_19(builder)) {
            altMarker25.drop();
        } else {
            altMarker25.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.postcircumfix_100_alt_15(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.postcircumfix_100_alt_11(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker11;;
                    altMarker11 = builder.mark();
                    if (this.postcircumfix_100_alt_8(builder)) {
                        altMarker11.drop();
                    } else {
                        altMarker11.rollbackTo();
                        PsiBuilder.Marker altMarker7;;
                        altMarker7 = builder.mark();
                        if (this.postcircumfix_100_alt_5(builder)) {
                            altMarker7.drop();
                        } else {
                            altMarker7.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.postcircumfix_100_alt_2(builder)) {
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

    private boolean bogus_statement_101(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ident_102_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_102_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_102_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_102(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_102_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_102_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_102_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean variable_declarator_103_quant_1(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_103(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.variable_declarator_103_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean backslash_104_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BACKSLASH_BAD) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_104_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_104(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.backslash_104_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.backslash_104_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean rxqq_105_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_105_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqq_105_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_105_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_105_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxqq_105_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_105_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_105_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxqq_105_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_105_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_105_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_134(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxqq_105_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_105(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxqq_105_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxqq_105_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxqq_105_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxqq_105_alt_2(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        return false;
                    }
                }
            }
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean separator_106_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean separator_106(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.separator_106_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX_SEPARATOR);
        return true;
    }

    private boolean rxstopper_107(PsiBuilder builder) {
        if (!(this.stopper_95(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_108_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_108_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_108_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_108_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.charspec_108_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_108_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_108_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.charspec_108_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_108_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_108_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_108_alt_6(PsiBuilder builder) {
        if (!(this.charnames_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_108(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_108_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_108_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_108_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean octint_109_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_109_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.octint_109_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_109_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_109(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octint_109_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_109_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_lex_110_alt_1(PsiBuilder builder) {
        if (!(this.decint_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_alt_2(PsiBuilder builder) {
        if (!(this.decint_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_110_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_110_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_110_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_110_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_110_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_110_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_109(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_110_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_110_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_110_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_110_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_110_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_110_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_110_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_110_alt_2(builder)) {
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

    private boolean integer_lex_110(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_110_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_110_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_unless_111_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_unless_111(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("unless"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_unless_111_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNLESS_STATEMENT);
        return true;
    }

    private boolean vws_112(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_113_quant_1(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_113(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CATCH"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CATCH_113_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CATCH_STATEMENT);
        return true;
    }

    private boolean statement_prefix_DOC_114_quant_1(PsiBuilder builder) {
        if (!(this.statement_prefix_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_DOC_114(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PHASER) && (tt1.equals("DOC"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_prefix_DOC_114_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean statement_prefix_phaser_115(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PHASER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean blorst_116_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLORST) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blorst_116_alt_2(PsiBuilder builder) {
        if (!(this.statement_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_116_alt_3(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_116(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.blorst_116_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.blorst_116_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.blorst_116_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean declarator_117_alt_1(PsiBuilder builder) {
        if (!(this.regex_declarator_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_117_alt_2(PsiBuilder builder) {
        if (!(this.routine_declarator_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_117_quant_3(PsiBuilder builder) {
        if (!(this.initializer_59(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_117_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if (!(this.variable_declarator_103(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.declarator_117_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_117(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.declarator_117_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.declarator_117_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.declarator_117_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_Q_118(PsiBuilder builder) {
        if (!(this.quote_nibbler_123(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_sink_119(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("sink"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SINK);
        return true;
    }

    private boolean backmod_120_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_120_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_120_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_120_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_120(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.backmod_120_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.backmod_120_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.backmod_120_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.backmod_120_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rxtermish_121_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxtermish_121(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.rxtermish_121_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean termaltseq_122_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termaltseq_122_alt_2(PsiBuilder builder) {
        if (!(this.termconjseq_57(builder))) {
            return false;
        }
        return true;
    }

    private boolean termaltseq_122_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termaltseq_122_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termaltseq_122_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termaltseq_122(PsiBuilder builder) {
        if (!(this.termconjseq_57(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termaltseq_122_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean quote_nibbler_123_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_123_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_24(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_123_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_123(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_123_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_123_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_123_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_123_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_123(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_123_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_124_quant_1(PsiBuilder builder) {
        if (!(this.comment_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_124_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_124_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_124_alt_3(PsiBuilder builder) {
        if (!(this.comment_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_124(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_124_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_124_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_given_125_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_given_125(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("given"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_given_125_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.GIVEN_STATEMENT);
        return true;
    }

    private boolean statement_control_CONTROL_126_quant_1(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CONTROL_126(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CONTROL"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CONTROL_126_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CONTROL_STATEMENT);
        return true;
    }

    private boolean infixstopper_127_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_127_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_127_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.infixstopper_127_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixstopper_127_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_127_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_127(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.infixstopper_127_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.infixstopper_127_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_for_128_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_for_128(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("for"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_for_128_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FOR_STATEMENT);
        return true;
    }

    private boolean statement_control_loop_129_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_2(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_3(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt4.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_control_loop_129_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt3.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_loop_129_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_loop_129_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_7(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_loop_129_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_loop_129_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_control_loop_129_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129_quant_8(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_129(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("loop"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_loop_129_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_loop_129_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.LOOP_STATEMENT);
        return true;
    }

    private boolean statement_control_import_130_quant_1(PsiBuilder builder) {
        if (!(this.spacey_155(builder))) {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_130_quant_2(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_import_130_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_130(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("import"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_import_130_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IMPORT_STATEMENT);
        return true;
    }

    private boolean statement_mod_loop_131_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_131(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_LOOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_loop_131_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_LOOP);
        return true;
    }

    private boolean term_name_132_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_132_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_132_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_171(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_132_alt_3(PsiBuilder builder) {
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

    private boolean term_name_132(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_132_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_132_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean metachar_133_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_quant_2(PsiBuilder builder) {
        if (!(this.quantified_atom_88(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.metachar_133_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean metachar_133_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.metachar_133_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_GOAL);
        return true;
    }

    private boolean metachar_133_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) && (tt2.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statement_18(builder))) {
            return false;
        }
        if (!(this.eat_terminator_170(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_5(PsiBuilder builder) {
        if (!(this.rxcodeblock_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_6(PsiBuilder builder) {
        if (!(this.rxqq_105(builder))) {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_7(PsiBuilder builder) {
        if (!(this.rxq_98(builder))) {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt3.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_136(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.metachar_133_quant_8(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.REGEX_ASSERTION);
        return true;
    }

    private boolean metachar_133_alt_10(PsiBuilder builder) {
        if (!(this.rxqw_161(builder))) {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_11(PsiBuilder builder) {
        if (!(this.backslash_104(builder))) {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_quant_12(PsiBuilder builder) {
        if (!(this.regex_nibbler_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_quant_13(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_14(PsiBuilder builder) {
        PsiBuilder.Marker marker14;
        marker14 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.metachar_133_quant_12(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.metachar_133_quant_13(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker14.done(Perl6ElementTypes.REGEX_CAPTURE_POSITIONAL);
        return true;
    }

    private boolean metachar_133_quant_15(PsiBuilder builder) {
        if (!(this.regex_nibbler_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_quant_16(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_17(PsiBuilder builder) {
        PsiBuilder.Marker marker18;
        marker18 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt7.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker19;
        quantMarker19 = builder.mark();
        if (this.metachar_133_quant_15(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.metachar_133_quant_16(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.REGEX_GROUP);
        return true;
    }

    private boolean metachar_133_alt_18(PsiBuilder builder) {
        PsiBuilder.Marker marker22;
        marker22 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) && (tt9.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker22.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean metachar_133_alt_19(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt10.equals(")>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_20(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt11.equals("<("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_21(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt12.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_22(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt13.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_23(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt14.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_24(PsiBuilder builder) {
        String tt15;
        tt15 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt15.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_25(PsiBuilder builder) {
        String tt16;
        tt16 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt16.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_26(PsiBuilder builder) {
        String tt17;
        tt17 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt17.equals("$$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_27(PsiBuilder builder) {
        String tt18;
        tt18 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt18.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_28(PsiBuilder builder) {
        String tt19;
        tt19 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt19.equals("^^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_133_alt_29(PsiBuilder builder) {
        PsiBuilder.Marker marker24;
        marker24 = builder.mark();
        PsiBuilder.Marker altMarker34;
        altMarker34 = builder.mark();
        if (this.metachar_133_alt_28(builder)) {
            altMarker34.drop();
        } else {
            altMarker34.rollbackTo();
            PsiBuilder.Marker altMarker33;;
            altMarker33 = builder.mark();
            if (this.metachar_133_alt_27(builder)) {
                altMarker33.drop();
            } else {
                altMarker33.rollbackTo();
                PsiBuilder.Marker altMarker32;;
                altMarker32 = builder.mark();
                if (this.metachar_133_alt_26(builder)) {
                    altMarker32.drop();
                } else {
                    altMarker32.rollbackTo();
                    PsiBuilder.Marker altMarker31;;
                    altMarker31 = builder.mark();
                    if (this.metachar_133_alt_25(builder)) {
                        altMarker31.drop();
                    } else {
                        altMarker31.rollbackTo();
                        PsiBuilder.Marker altMarker30;;
                        altMarker30 = builder.mark();
                        if (this.metachar_133_alt_24(builder)) {
                            altMarker30.drop();
                        } else {
                            altMarker30.rollbackTo();
                            PsiBuilder.Marker altMarker29;;
                            altMarker29 = builder.mark();
                            if (this.metachar_133_alt_23(builder)) {
                                altMarker29.drop();
                            } else {
                                altMarker29.rollbackTo();
                                PsiBuilder.Marker altMarker28;;
                                altMarker28 = builder.mark();
                                if (this.metachar_133_alt_22(builder)) {
                                    altMarker28.drop();
                                } else {
                                    altMarker28.rollbackTo();
                                    PsiBuilder.Marker altMarker27;;
                                    altMarker27 = builder.mark();
                                    if (this.metachar_133_alt_21(builder)) {
                                        altMarker27.drop();
                                    } else {
                                        altMarker27.rollbackTo();
                                        PsiBuilder.Marker altMarker26;;
                                        altMarker26 = builder.mark();
                                        if (this.metachar_133_alt_20(builder)) {
                                            altMarker26.drop();
                                        } else {
                                            altMarker26.rollbackTo();
                                            PsiBuilder.Marker altMarker25;;
                                            altMarker25 = builder.mark();
                                            if (this.metachar_133_alt_19(builder)) {
                                                altMarker25.drop();
                                            } else {
                                                altMarker25.rollbackTo();
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
        marker24.done(Perl6ElementTypes.REGEX_ANCHOR);
        return true;
    }

    private boolean metachar_133(PsiBuilder builder) {
        PsiBuilder.Marker altMarker35;
        altMarker35 = builder.mark();
        if (this.metachar_133_alt_29(builder)) {
            altMarker35.drop();
        } else {
            altMarker35.rollbackTo();
            PsiBuilder.Marker altMarker23;;
            altMarker23 = builder.mark();
            if (this.metachar_133_alt_18(builder)) {
                altMarker23.drop();
            } else {
                altMarker23.rollbackTo();
                PsiBuilder.Marker altMarker21;;
                altMarker21 = builder.mark();
                if (this.metachar_133_alt_17(builder)) {
                    altMarker21.drop();
                } else {
                    altMarker21.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.metachar_133_alt_14(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker13;;
                        altMarker13 = builder.mark();
                        if (this.metachar_133_alt_11(builder)) {
                            altMarker13.drop();
                        } else {
                            altMarker13.rollbackTo();
                            PsiBuilder.Marker altMarker12;;
                            altMarker12 = builder.mark();
                            if (this.metachar_133_alt_10(builder)) {
                                altMarker12.drop();
                            } else {
                                altMarker12.rollbackTo();
                                PsiBuilder.Marker altMarker11;;
                                altMarker11 = builder.mark();
                                if (this.metachar_133_alt_9(builder)) {
                                    altMarker11.drop();
                                } else {
                                    altMarker11.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.metachar_133_alt_7(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.metachar_133_alt_6(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.metachar_133_alt_5(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.metachar_133_alt_4(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.metachar_133_alt_3(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
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

    private boolean quote_qq_134(PsiBuilder builder) {
        if (!(this.quote_nibbler_123(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt1.equals("-"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt2.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.cclass_elem_135_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.cclass_elem_135_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_135_quant_4(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_9(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_10(PsiBuilder builder) {
        if (!(this.cclass_backslash_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_12(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_14(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_15(PsiBuilder builder) {
        if (!(this.cclass_backslash_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_16(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.cclass_elem_135_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.cclass_elem_135_alt_15(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.cclass_elem_135_alt_14(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_135_quant_17(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.cclass_elem_135_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt4.equals(".."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.cclass_elem_135_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.cclass_elem_135_alt_12(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_135_quant_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_ATOM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.cclass_elem_135_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.cclass_elem_135_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.cclass_elem_135_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.cclass_elem_135_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean cclass_elem_135_quant_19(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135_alt_22(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker19;;
            quantMarker19 = builder.mark();
            if (this.cclass_elem_135_quant_18(builder)) {
                quantMarker19.drop();
            } else {
                quantMarker19.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.cclass_elem_135_quant_19(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.cclass_elem_135_alt_21(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.cclass_elem_135_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_135_quant_23(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_135(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.cclass_elem_135_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.cclass_elem_135_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.cclass_elem_135_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.cclass_elem_135_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.cclass_elem_135_alt_6(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.cclass_elem_135_alt_5(builder)) {
                        altMarker6.drop();
                    } else {
                        altMarker6.rollbackTo();
                        return false;
                    }
                }
            }
        }
        PsiBuilder.Marker quantMarker24;
        quantMarker24 = builder.mark();
        if (this.cclass_elem_135_quant_23(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_CCLASS_ELEM);
        return true;
    }

    private boolean assertion_136_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_ASSERTION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_2(PsiBuilder builder) {
        if (!(this.cclass_elem_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.assertion_136_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.assertion_136_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker2.done(Perl6ElementTypes.REGEX_CCLASS);
        return true;
    }

    private boolean assertion_136_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.assertion_136_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.assertion_136_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.assertion_136_alt_4(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean assertion_136_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.assertion_136_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean assertion_136_alt_9(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_11(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_66(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.assertion_136_quant_10(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean assertion_136_alt_12(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt4.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_13(PsiBuilder builder) {
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.assertion_136_alt_12(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.assertion_136_alt_11(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean assertion_136_alt_14(PsiBuilder builder) {
        if (!(this.variable_159(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.assertion_136_quant_13(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        return true;
    }

    private boolean assertion_136_alt_15(PsiBuilder builder) {
        if (!(this.rxcodeblock_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_17(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_19(PsiBuilder builder) {
        if (!(this.normspace_11(builder))) {
            return false;
        }
        if (!(this.regex_nibbler_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_66(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.assertion_136_quant_20(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        return true;
    }

    private boolean assertion_136_alt_22(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt7.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_23(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt8.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_24(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_quant_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.assertion_136_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker25;;
            altMarker25 = builder.mark();
            if (this.assertion_136_alt_23(builder)) {
                altMarker25.drop();
            } else {
                altMarker25.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.assertion_136_alt_22(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker23;;
                    altMarker23 = builder.mark();
                    if (this.assertion_136_alt_21(builder)) {
                        altMarker23.drop();
                    } else {
                        altMarker23.rollbackTo();
                        PsiBuilder.Marker altMarker21;;
                        altMarker21 = builder.mark();
                        if (this.assertion_136_alt_19(builder)) {
                            altMarker21.drop();
                        } else {
                            altMarker21.rollbackTo();
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean assertion_136_alt_26(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.assertion_136_alt_18(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.assertion_136_alt_17(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker27;
        quantMarker27 = builder.mark();
        if (this.assertion_136_quant_25(builder)) {
            quantMarker27.drop();
        } else {
            quantMarker27.rollbackTo();
        }
        return true;
    }

    private boolean assertion_136_alt_27(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt9.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_28(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt10.equals("?"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_29(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt11.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_30(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136_alt_31(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_136(PsiBuilder builder) {
        PsiBuilder.Marker altMarker33;
        altMarker33 = builder.mark();
        if (this.assertion_136_alt_31(builder)) {
            altMarker33.drop();
        } else {
            altMarker33.rollbackTo();
            PsiBuilder.Marker altMarker32;;
            altMarker32 = builder.mark();
            if (this.assertion_136_alt_30(builder)) {
                altMarker32.drop();
            } else {
                altMarker32.rollbackTo();
                PsiBuilder.Marker altMarker31;;
                altMarker31 = builder.mark();
                if (this.assertion_136_alt_29(builder)) {
                    altMarker31.drop();
                } else {
                    altMarker31.rollbackTo();
                    PsiBuilder.Marker altMarker30;;
                    altMarker30 = builder.mark();
                    if (this.assertion_136_alt_28(builder)) {
                        altMarker30.drop();
                    } else {
                        altMarker30.rollbackTo();
                        PsiBuilder.Marker altMarker29;;
                        altMarker29 = builder.mark();
                        if (this.assertion_136_alt_27(builder)) {
                            altMarker29.drop();
                        } else {
                            altMarker29.rollbackTo();
                            PsiBuilder.Marker altMarker28;;
                            altMarker28 = builder.mark();
                            if (this.assertion_136_alt_26(builder)) {
                                altMarker28.drop();
                            } else {
                                altMarker28.rollbackTo();
                                PsiBuilder.Marker altMarker18;;
                                altMarker18 = builder.mark();
                                if (this.assertion_136_alt_16(builder)) {
                                    altMarker18.drop();
                                } else {
                                    altMarker18.rollbackTo();
                                    PsiBuilder.Marker altMarker17;;
                                    altMarker17 = builder.mark();
                                    if (this.assertion_136_alt_15(builder)) {
                                        altMarker17.drop();
                                    } else {
                                        altMarker17.rollbackTo();
                                        PsiBuilder.Marker altMarker16;;
                                        altMarker16 = builder.mark();
                                        if (this.assertion_136_alt_14(builder)) {
                                            altMarker16.drop();
                                        } else {
                                            altMarker16.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.assertion_136_alt_9(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.assertion_136_alt_8(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.assertion_136_alt_3(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker1;;
                                                        altMarker1 = builder.mark();
                                                        if (this.assertion_136_alt_1(builder)) {
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
        return true;
    }

    private boolean infix_137(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean hexint_138_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_138_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_138_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_138_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_138_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_138_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexint_138_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_138_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_138(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.hexint_138_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_138_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean numish_139_alt_1(PsiBuilder builder) {
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

    private boolean numish_139_alt_2(PsiBuilder builder) {
        if (!(this.integer_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_139_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_139(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.numish_139_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.numish_139_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.numish_139_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_2(PsiBuilder builder) {
        if (!(this.term_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt1.equals("handles"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.trait_mod_140_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.trait_mod_140_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_5(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt2.equals("returns"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.trait_mod_140_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.trait_mod_140_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_8(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt3.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.trait_mod_140_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.trait_mod_140_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_12(PsiBuilder builder) {
        if (!(this.pblock_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.trait_mod_140_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.trait_mod_140_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_14(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt4.equals("will"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.trait_mod_140_alt_13(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.trait_mod_140_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_16(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_17(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt5.equals("does"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.trait_mod_140_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.trait_mod_140_alt_15(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_19(PsiBuilder builder) {
        if (!(this.typename_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt6.equals("hides"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.trait_mod_140_alt_19(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.trait_mod_140_alt_18(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140_alt_21(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_22(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_140_alt_23(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt7.equals("is"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.trait_mod_140_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.trait_mod_140_alt_21(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_140(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker24;
        altMarker24 = builder.mark();
        if (this.trait_mod_140_alt_23(builder)) {
            altMarker24.drop();
        } else {
            altMarker24.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.trait_mod_140_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.trait_mod_140_alt_17(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.trait_mod_140_alt_14(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        PsiBuilder.Marker altMarker10;;
                        altMarker10 = builder.mark();
                        if (this.trait_mod_140_alt_9(builder)) {
                            altMarker10.drop();
                        } else {
                            altMarker10.rollbackTo();
                            PsiBuilder.Marker altMarker7;;
                            altMarker7 = builder.mark();
                            if (this.trait_mod_140_alt_6(builder)) {
                                altMarker7.drop();
                            } else {
                                altMarker7.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.trait_mod_140_alt_3(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        marker1.done(Perl6ElementTypes.TRAIT);
        return true;
    }

    private boolean lambda_141_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_141_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_141(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.lambda_141_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.lambda_141_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean vnum_142_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_142_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_142_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.vnum_142_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.vnum_142_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean vnum_142(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.vnum_142_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.vnum_142_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean kok_143(PsiBuilder builder) {
        if (!(this.end_keyword_69(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_144_quant_1(PsiBuilder builder) {
        if (!(this.block_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_144(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("default"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_default_144_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.DEFAULT_STATEMENT);
        return true;
    }

    private boolean statement_prefix_race_145(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("race"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.RACE);
        return true;
    }

    private boolean statement_prefix_supply_146(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("supply"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUPPLY);
        return true;
    }

    private boolean fatarrow_147_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean fatarrow_147(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PAIR_KEY) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("=>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.fatarrow_147_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FATARROW);
        return true;
    }

    private boolean prefix_148(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_q_149(PsiBuilder builder) {
        if (!(this.quote_nibbler_123(builder))) {
            return false;
        }
        return true;
    }

    private boolean stdstopper_150_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_150_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_150(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_150_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_150_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_gather_151(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("gather"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.blorst_116(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.GATHER);
        return true;
    }

    private boolean term_self_152(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SELF) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.SELF);
        return true;
    }

    private boolean twigil_153(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_154_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_154_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_154_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_154_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_154_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_154_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_154_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_154_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_154_alt_2(builder)) {
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
        if (!(this.kok_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_154_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_154(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_154_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_154_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_154_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_154_alt_1(builder)) {
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

    private boolean spacey_155_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_155_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_155(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.spacey_155_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.spacey_155_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_whenever_156_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_whenever_156(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("whenever"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_whenever_156_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHENEVER_STATEMENT);
        return true;
    }

    private boolean statement_control_when_157_quant_1(PsiBuilder builder) {
        if (!(this.xblock_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_when_157(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("when"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_when_157_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHEN_STATEMENT);
        return true;
    }

    private boolean term_hyperwhatever_158(PsiBuilder builder) {
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

    private boolean variable_159_alt_1(PsiBuilder builder) {
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

    private boolean variable_159_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt2.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_159_alt_3(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_159_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.variable_159_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.variable_159_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_159_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.variable_159_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.postcircumfix_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_159_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SELF) {
            builder.advanceLexer();
        } else {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt1.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.variable_159_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean variable_159(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.variable_159_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.variable_159_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_160_alt_1(PsiBuilder builder) {
        if (!(this.param_var_167(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_160_alt_2(PsiBuilder builder) {
        if (!(this.param_var_167(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_160_alt_3(PsiBuilder builder) {
        if (!(this.named_param_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_160_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean named_param_160_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.named_param_160_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.named_param_160_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.named_param_160_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean named_param_160_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.named_param_160_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean named_param_160_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.named_param_160_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean named_param_160_quant_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.named_param_160_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.named_param_160_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_160(PsiBuilder builder) {
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
        if (this.named_param_160_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NAMED_PARAMETER);
        return true;
    }

    private boolean rxqw_161_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqw_161(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_149(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqw_161_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean SIGOK_162_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean SIGOK_162(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.SIGOK_162_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean charnames_163_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_163_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_163_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_163_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_73(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_163_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_163(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.charnames_163_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_163_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_164_alt_1(PsiBuilder builder) {
        if (!(this.statement_control_QUIT_70(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_2(PsiBuilder builder) {
        if (!(this.statement_control_CONTROL_126(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_CATCH_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_default_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_5(PsiBuilder builder) {
        if (!(this.statement_control_when_157(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_6(PsiBuilder builder) {
        if (!(this.statement_control_given_125(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_7(PsiBuilder builder) {
        if (!(this.statement_control_require_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_use_180(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_9(PsiBuilder builder) {
        if (!(this.statement_control_no_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_10(PsiBuilder builder) {
        if (!(this.statement_control_import_130(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_11(PsiBuilder builder) {
        if (!(this.statement_control_need_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_12(PsiBuilder builder) {
        if (!(this.statement_control_loop_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_13(PsiBuilder builder) {
        if (!(this.statement_control_whenever_156(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_14(PsiBuilder builder) {
        if (!(this.statement_control_for_128(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_15(PsiBuilder builder) {
        if (!(this.statement_control_repeat_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_16(PsiBuilder builder) {
        if (!(this.statement_control_until_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_17(PsiBuilder builder) {
        if (!(this.statement_control_while_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_18(PsiBuilder builder) {
        if (!(this.statement_control_without_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_19(PsiBuilder builder) {
        if (!(this.statement_control_unless_111(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164_alt_20(PsiBuilder builder) {
        if (!(this.statement_control_if_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_164(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.statement_control_164_alt_20(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.statement_control_164_alt_19(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.statement_control_164_alt_18(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.statement_control_164_alt_17(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker16;;
                        altMarker16 = builder.mark();
                        if (this.statement_control_164_alt_16(builder)) {
                            altMarker16.drop();
                        } else {
                            altMarker16.rollbackTo();
                            PsiBuilder.Marker altMarker15;;
                            altMarker15 = builder.mark();
                            if (this.statement_control_164_alt_15(builder)) {
                                altMarker15.drop();
                            } else {
                                altMarker15.rollbackTo();
                                PsiBuilder.Marker altMarker14;;
                                altMarker14 = builder.mark();
                                if (this.statement_control_164_alt_14(builder)) {
                                    altMarker14.drop();
                                } else {
                                    altMarker14.rollbackTo();
                                    PsiBuilder.Marker altMarker13;;
                                    altMarker13 = builder.mark();
                                    if (this.statement_control_164_alt_13(builder)) {
                                        altMarker13.drop();
                                    } else {
                                        altMarker13.rollbackTo();
                                        PsiBuilder.Marker altMarker12;;
                                        altMarker12 = builder.mark();
                                        if (this.statement_control_164_alt_12(builder)) {
                                            altMarker12.drop();
                                        } else {
                                            altMarker12.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.statement_control_164_alt_11(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.statement_control_164_alt_10(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker9;;
                                                    altMarker9 = builder.mark();
                                                    if (this.statement_control_164_alt_9(builder)) {
                                                        altMarker9.drop();
                                                    } else {
                                                        altMarker9.rollbackTo();
                                                        PsiBuilder.Marker altMarker8;;
                                                        altMarker8 = builder.mark();
                                                        if (this.statement_control_164_alt_8(builder)) {
                                                            altMarker8.drop();
                                                        } else {
                                                            altMarker8.rollbackTo();
                                                            PsiBuilder.Marker altMarker7;;
                                                            altMarker7 = builder.mark();
                                                            if (this.statement_control_164_alt_7(builder)) {
                                                                altMarker7.drop();
                                                            } else {
                                                                altMarker7.rollbackTo();
                                                                PsiBuilder.Marker altMarker6;;
                                                                altMarker6 = builder.mark();
                                                                if (this.statement_control_164_alt_6(builder)) {
                                                                    altMarker6.drop();
                                                                } else {
                                                                    altMarker6.rollbackTo();
                                                                    PsiBuilder.Marker altMarker5;;
                                                                    altMarker5 = builder.mark();
                                                                    if (this.statement_control_164_alt_5(builder)) {
                                                                        altMarker5.drop();
                                                                    } else {
                                                                        altMarker5.rollbackTo();
                                                                        PsiBuilder.Marker altMarker4;;
                                                                        altMarker4 = builder.mark();
                                                                        if (this.statement_control_164_alt_4(builder)) {
                                                                            altMarker4.drop();
                                                                        } else {
                                                                            altMarker4.rollbackTo();
                                                                            PsiBuilder.Marker altMarker3;;
                                                                            altMarker3 = builder.mark();
                                                                            if (this.statement_control_164_alt_3(builder)) {
                                                                                altMarker3.drop();
                                                                            } else {
                                                                                altMarker3.rollbackTo();
                                                                                PsiBuilder.Marker altMarker2;;
                                                                                altMarker2 = builder.mark();
                                                                                if (this.statement_control_164_alt_2(builder)) {
                                                                                    altMarker2.drop();
                                                                                } else {
                                                                                    altMarker2.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                    altMarker1 = builder.mark();
                                                                                    if (this.statement_control_164_alt_1(builder)) {
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

    private boolean statement_mod_cond_165_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_165(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_COND) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_143(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_cond_165_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_COND);
        return true;
    }

    private boolean semiarglist_166(PsiBuilder builder) {
        if (!(this.arglist_94(builder))) {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean param_var_167_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postcircumfix_100(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.ARRAY_SHAPE);
        return true;
    }

    private boolean param_var_167_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.param_var_167_quant_1(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_VARIABLE);
        return true;
    }

    private boolean param_var_167_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_167_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.param_var_167_quant_3(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_167_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_167_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.param_var_167_quant_5(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_167(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.param_var_167_alt_6(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.param_var_167_alt_4(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.param_var_167_alt_2(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean termseq_168(PsiBuilder builder) {
        if (!(this.termaltseq_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean prefixish_169(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_148(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean eat_terminator_170_alt_1(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_170_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_170_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_170_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.eat_terminator_170_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.eat_terminator_170_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.eat_terminator_170_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean eat_terminator_170(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.eat_terminator_170_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean args_171_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NO_ARGS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_171_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_171_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_171_alt_4(PsiBuilder builder) {
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
        if (!(this.semiarglist_166(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_171_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_171_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_171_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_166(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_171_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_171(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_171_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_171_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_171_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_171_alt_1(builder)) {
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

    private boolean signature_172_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean signature_172_alt_2(PsiBuilder builder) {
        if (!(this.parameter_33(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_172_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_172_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.signature_172_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.signature_172_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean signature_172_quant_5(PsiBuilder builder) {
        if (!(this.param_sep_65(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.signature_172_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean signature_172_alt_6(PsiBuilder builder) {
        if (!(this.parameter_33(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.signature_172_quant_5(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean signature_172_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_172(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.signature_172_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.signature_172_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.signature_172_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean number_173(PsiBuilder builder) {
        if (!(this.numish_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean blockoid_174_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_174(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_25(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.blockoid_174_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.BLOCK);
        return true;
    }

    private boolean morename_175_quant_1(PsiBuilder builder) {
        if (!(this.identifier_54(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_175(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_175_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean enter_regex_nibblier_176(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.regex_nibbler_43(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX);
        return true;
    }

    private boolean regex_def_177_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.regex_def_177_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean regex_def_177_quant_4(PsiBuilder builder) {
        if (!(this.trait_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_REGEX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_alt_6(PsiBuilder builder) {
        if (!(this.enter_regex_nibblier_176(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt4.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_177_quant_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt3.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.regex_def_177_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.regex_def_177_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.regex_def_177_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.regex_def_177_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean regex_def_177(PsiBuilder builder) {
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.regex_def_177_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.regex_def_177_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.regex_def_177_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.regex_def_177_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean post_constraint_178_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean post_constraint_178_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.post_constraint_178_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean post_constraint_178_quant_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_178_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.post_constraint_178_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_178_quant_5(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_178_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_172(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.post_constraint_178_quant_5(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_178(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.post_constraint_178_alt_6(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.post_constraint_178_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.post_constraint_178_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_179_alt_1(PsiBuilder builder) {
        if (!(this.unsp_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_179_alt_2(PsiBuilder builder) {
        if (!(this.unv_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_179_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_179_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_179_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_179_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_179_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_179(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_179_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_use_180_quant_1(PsiBuilder builder) {
        if (!(this.spacey_155(builder))) {
            return false;
        }
        if (!(this.arglist_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_180_alt_2(PsiBuilder builder) {
        if (!(this.module_name_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_use_180_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_use_180_alt_3(PsiBuilder builder) {
        if (!(this.version_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_180_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_use_180_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_use_180_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_use_180(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_use_180_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.ws_179(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
