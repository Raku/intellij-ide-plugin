package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_72(builder);
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
        if (!(this.quote_Q_27(builder))) {
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
        if (!(this.quote_qq_38(builder))) {
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
        if (!(this.quote_qq_38(builder))) {
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
        if (!(this.quote_qq_38(builder))) {
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
        if (!(this.quote_qq_38(builder))) {
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
        if (!(this.quote_q_52(builder))) {
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
        if (!(this.quote_q_52(builder))) {
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
        if (!(this.quote_q_52(builder))) {
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
        if (!(this.quote_q_52(builder))) {
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

    private boolean octints_2_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_2_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_2_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_2_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_21(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_2_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_2_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unsp_3_alt_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_3_alt_2(PsiBuilder builder) {
        if (!(this.unv_33(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_3_alt_3(PsiBuilder builder) {
        if (!(this.vws_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_3_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unsp_3_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unsp_3_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.unsp_3_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean unsp_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.unsp_3_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean arglist_4_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean arglist_4_alt_2(PsiBuilder builder) {
        if (!(this.EXPR_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_4(PsiBuilder builder) {
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.arglist_4_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.arglist_4_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean routine_declarator_5(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_40(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ROUTINE_DECLARATION);
        return true;
    }

    private boolean termish_6(PsiBuilder builder) {
        if (!(this.term_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean dotty_7_quant_1(PsiBuilder builder) {
        if (!(this.dottyop_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean dotty_7(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dotty_7_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean stopper_8_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_8_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_8_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_8_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean sign_9_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_9_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_9_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_9_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_9_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_9_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_9_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_9_alt_1(builder)) {
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

    private boolean apostrophe_10(PsiBuilder builder) {
        return true;
    }

    private boolean term_whatever_11(PsiBuilder builder) {
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

    private boolean dottyop_12_quant_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_12(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_12_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.methodop_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean ident_13_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_13_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_13_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_13(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_13_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_13_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_13_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_14_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_14_alt_2(PsiBuilder builder) {
        if (!(this.EXPR_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_14_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_14(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_14_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_14_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_14_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.STATEMENT);
        if (!(this.ws_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean bogus_statement_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_16(PsiBuilder builder) {
        if (!(this.variable_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean onlystar_17(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_78(builder))) {
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

    private boolean dec_number_18_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_18_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_18(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_18_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_18_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_19_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_6(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_7(PsiBuilder builder) {
        if (!(this.variable_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_19_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.quote_escape_19_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_19_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_19(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_19_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.quote_escape_19_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.quote_escape_19_alt_4(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.quote_escape_19_alt_3(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.quote_escape_19_alt_2(builder)) {
                            altMarker2.drop();
                        } else {
                            altMarker2.rollbackTo();
                            PsiBuilder.Marker altMarker1;;
                            altMarker1 = builder.mark();
                            if (this.quote_escape_19_alt_1(builder)) {
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
        return true;
    }

    private boolean charspec_20_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_20_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_20_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_20_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_20_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_20_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_20_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_20_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_20_alt_6(PsiBuilder builder) {
        if (!(this.charnames_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_20(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_20_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_20_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_20_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean octint_21_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_21_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_21_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_21(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_21_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_lex_22_alt_1(PsiBuilder builder) {
        if (!(this.decint_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_alt_2(PsiBuilder builder) {
        if (!(this.decint_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_22_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_22_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_22_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_22_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_22_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_22_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_22_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_22_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_70(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_22_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_22_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_22_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_22_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_22_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_22_alt_2(builder)) {
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

    private boolean integer_lex_22(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_22_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_22_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean vws_23(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statementlist_24_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_24_alt_2(PsiBuilder builder) {
        if (!(this.ws_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_24_quant_3(PsiBuilder builder) {
        if (!(this.statement_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_24(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_24_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_24_alt_1(builder)) {
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
            if (this.statementlist_24_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean declarator_25_alt_1(PsiBuilder builder) {
        if (!(this.routine_declarator_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_25_quant_2(PsiBuilder builder) {
        if (!(this.ws_78(builder))) {
            return false;
        }
        if (!(this.initializer_54(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_25_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.variable_declarator_16(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.declarator_25_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.declarator_25_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.declarator_25_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean EXPR_26_quant_1(PsiBuilder builder) {
        if (!(this.prefixish_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_26_quant_2(PsiBuilder builder) {
        if (!(this.postfixish_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_26_quant_3(PsiBuilder builder) {
        if (!(this.prefixish_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_26_quant_4(PsiBuilder builder) {
        if (!(this.postfixish_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_26_quant_5(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_26_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        if (!(this.termish_6(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.EXPR_26_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_26_quant_6(PsiBuilder builder) {
        if (!(this.infixish_60(builder))) {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.EXPR_26_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_26(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.EXPR_26_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        if (!(this.termish_6(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.EXPR_26_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_26_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        marker1.done(Perl6ElementTypes.EXPR);
        return true;
    }

    private boolean quote_Q_27(PsiBuilder builder) {
        if (!(this.quote_nibbler_32(builder))) {
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

    private boolean longname_29(PsiBuilder builder) {
        if (!(this.name_45(builder))) {
            return false;
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

    private boolean sigil_31(PsiBuilder builder) {
        return true;
    }

    private boolean quote_nibbler_32_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_32_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_32_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_32(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_32_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_32_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_32_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_32_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_32(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_32_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_33_quant_1(PsiBuilder builder) {
        if (!(this.comment_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_33_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_33_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_33_alt_3(PsiBuilder builder) {
        if (!(this.comment_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_33(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_33_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_33_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_ident_34_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_34(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_34_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_69(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean hexints_35_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_35_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_35_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_35_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_43(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_35_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_35(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_35_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean integer_36(PsiBuilder builder) {
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

    private boolean term_name_37_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_37_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_37_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_69(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_37_alt_3(PsiBuilder builder) {
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

    private boolean term_name_37(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_37_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_37_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_qq_38(PsiBuilder builder) {
        if (!(this.quote_nibbler_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean comment_39(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_40_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_40_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_40_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_40_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_40_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_40_alt_5(PsiBuilder builder) {
        if (!(this.blockoid_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_40_alt_6(PsiBuilder builder) {
        if (!(this.onlystar_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_40(PsiBuilder builder) {
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_40_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_40_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.routine_def_40_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.routine_def_40_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.routine_def_40_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean infix_41(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postfixish_42_alt_1(PsiBuilder builder) {
        if (!(this.dotty_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_42_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postfix_55(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_42(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.postfixish_42_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.postfixish_42_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_43_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_43_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_43_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_43_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_43_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_43_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_43_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_43(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_43_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean identifier_44_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_10(builder))) {
            return false;
        }
        if (!(this.ident_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_44(PsiBuilder builder) {
        if (!(this.ident_13(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_44_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_45_quant_1(PsiBuilder builder) {
        if (!(this.morename_73(builder))) {
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
        if (!(this.morename_73(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_45_alt_4(PsiBuilder builder) {
        if (!(this.identifier_44(builder))) {
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

    private boolean kok_46(PsiBuilder builder) {
        if (!(this.end_keyword_62(builder))) {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_47_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean scope_declarator_47_alt_2(PsiBuilder builder) {
        if (!(this.declarator_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_47(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.scope_declarator_47_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.scope_declarator_47_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SCOPED_DECLARATION);
        return true;
    }

    private boolean desigilname_48(PsiBuilder builder) {
        if (!(this.longname_29(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_49_alt_1(PsiBuilder builder) {
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

    private boolean numish_49_alt_2(PsiBuilder builder) {
        if (!(this.integer_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_49_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_49(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.numish_49_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.numish_49_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.numish_49_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean methodop_50_alt_1(PsiBuilder builder) {
        if (!(this.variable_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_50_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_50_quant_3(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_50_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_50_alt_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_50_alt_6(PsiBuilder builder) {
        if (!(this.args_69(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_50_alt_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.methodop_50_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_50_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_50_quant_8(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_50(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.methodop_50_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.methodop_50_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.methodop_50_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_50_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.methodop_50_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.methodop_50_quant_8(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean prefix_51(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_q_52(PsiBuilder builder) {
        if (!(this.quote_nibbler_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean stdstopper_53_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_53_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_53(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_53_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_53_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean initializer_54_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_54(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.initializer_54_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean postfix_55(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean terminator_56_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_56_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_56_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_56_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_56_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_56_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_56_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_56_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_56_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_56_alt_2(builder)) {
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
        if (!(this.kok_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_56_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_56(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_56_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_56_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_56_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_56_alt_1(builder)) {
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

    private boolean term_hyperwhatever_57(PsiBuilder builder) {
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

    private boolean variable_58(PsiBuilder builder) {
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

    private boolean twigil_59(PsiBuilder builder) {
        return true;
    }

    private boolean infixish_60(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_41(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean charnames_61_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_61_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_61_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_61_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_67(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_61_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_61(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_61_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean end_keyword_62(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_63(PsiBuilder builder) {
        if (!(this.statement_control_use_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean semiarglist_64(PsiBuilder builder) {
        if (!(this.arglist_4(builder))) {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_65_alt_1(PsiBuilder builder) {
        if (!(this.quote_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_65_alt_2(PsiBuilder builder) {
        if (!(this.number_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_65(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_65_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_65_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean prefixish_66(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_51(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean charname_67_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_67_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_67_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_67_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_67(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_67_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_67_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_68_alt_1(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_57(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_2(PsiBuilder builder) {
        if (!(this.term_whatever_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_3(PsiBuilder builder) {
        if (!(this.term_name_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_4(PsiBuilder builder) {
        if (!(this.value_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_5(PsiBuilder builder) {
        if (!(this.routine_declarator_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_6(PsiBuilder builder) {
        if (!(this.scope_declarator_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_7(PsiBuilder builder) {
        if (!(this.term_ident_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68_alt_8(PsiBuilder builder) {
        if (!(this.variable_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_68(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.term_68_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.term_68_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.term_68_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.term_68_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.term_68_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.term_68_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.term_68_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.term_68_alt_1(builder)) {
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

    private boolean args_69_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean args_69_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_69_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_69_alt_4(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_64(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_69_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_69_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_69_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_64(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_69_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_69(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_69_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_69_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_69_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_69_alt_1(builder)) {
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

    private boolean binint_70_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_70_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_70_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_70(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_70_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_71_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_71_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_71_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_71(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_71_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean TOP_72_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_72_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_72(PsiBuilder builder) {
        if (!(this.statementlist_24(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_72_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_72_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean morename_73_quant_1(PsiBuilder builder) {
        if (!(this.identifier_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_73(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_73_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean blockoid_74_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_74(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_24(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.blockoid_74_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean number_75(PsiBuilder builder) {
        if (!(this.numish_49(builder))) {
            return false;
        }
        return true;
    }

    private boolean starter_76(PsiBuilder builder) {
        return true;
    }

    private boolean escale_77(PsiBuilder builder) {
        if (!(this.sign_9(builder))) {
            return false;
        }
        if (!(this.decint_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_78_alt_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_78_alt_2(PsiBuilder builder) {
        if (!(this.unv_33(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_78_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_78_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_78_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_78_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_78_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_78(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_78_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_use_79(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_78(builder))) {
            return false;
        }
        if (!(this.module_name_30(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
