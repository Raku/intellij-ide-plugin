package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_48(builder);
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private boolean unsp_1_alt_1(PsiBuilder builder) {
        if (!(this.unsp_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_1_alt_2(PsiBuilder builder) {
        if (!(this.unv_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_1_alt_3(PsiBuilder builder) {
        if (!(this.vws_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_1_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unsp_1_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unsp_1_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.unsp_1_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean unsp_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.unsp_1_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean arglist_2_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean arglist_2_alt_2(PsiBuilder builder) {
        if (!(this.EXPR_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_2(PsiBuilder builder) {
        if (!(this.ws_53(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.arglist_2_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.arglist_2_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termish_3(PsiBuilder builder) {
        if (!(this.term_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean apostrophe_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_5_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_5_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_5_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_5_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_5_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_5_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_5_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_5_alt_1(builder)) {
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

    private boolean ident_6_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_6_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_6_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_6_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_6_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_6_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_7_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_7_alt_2(PsiBuilder builder) {
        if (!(this.EXPR_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_7_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_7(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_7_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_7_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_7_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.STATEMENT);
        if (!(this.ws_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean bogus_statement_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_9(PsiBuilder builder) {
        if (!(this.variable_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean dec_number_10_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_10_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_10_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_10_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean vws_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statementlist_12_quant_1(PsiBuilder builder) {
        if (!(this.statement_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_12(PsiBuilder builder) {
        if (!(this.ws_53(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.statementlist_12_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        marker1.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean declarator_13_quant_1(PsiBuilder builder) {
        if (!(this.ws_53(builder))) {
            return false;
        }
        if (!(this.initializer_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_13(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.variable_declarator_9(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.declarator_13_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean octint_14_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_14_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_14_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_14(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_14_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean longname_15(PsiBuilder builder) {
        if (!(this.name_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean module_name_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean sigil_17(PsiBuilder builder) {
        return true;
    }

    private boolean EXPR_18_quant_1(PsiBuilder builder) {
        if (!(this.prefixish_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_18_quant_2(PsiBuilder builder) {
        if (!(this.postfixish_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_18_quant_3(PsiBuilder builder) {
        if (!(this.prefixish_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_18_quant_4(PsiBuilder builder) {
        if (!(this.postfixish_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_18_quant_5(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_18_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        if (!(this.termish_3(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.EXPR_18_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_18_quant_6(PsiBuilder builder) {
        if (!(this.infixish_40(builder))) {
            return false;
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.EXPR_18_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_18(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.EXPR_18_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        if (!(this.termish_3(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.EXPR_18_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_18_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        marker1.done(Perl6ElementTypes.EXPR);
        return true;
    }

    private boolean unv_19_quant_1(PsiBuilder builder) {
        if (!(this.comment_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_19_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_19_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_19_alt_3(PsiBuilder builder) {
        if (!(this.comment_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_19(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_19_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_19_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_ident_20_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_20(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_20_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_46(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_21_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_21_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_21_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_46(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_21_alt_3(PsiBuilder builder) {
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

    private boolean term_name_21(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_21_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_21_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean integer_22(PsiBuilder builder) {
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

    private boolean comment_23(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infix_24(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean identifier_25_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_4(builder))) {
            return false;
        }
        if (!(this.ident_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_25(PsiBuilder builder) {
        if (!(this.ident_6(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_25_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_26_quant_1(PsiBuilder builder) {
        if (!(this.morename_49(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_26_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.name_26_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_26_quant_3(PsiBuilder builder) {
        if (!(this.morename_49(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_26_alt_4(PsiBuilder builder) {
        if (!(this.identifier_25(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.name_26_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_26(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.name_26_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.name_26_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean kok_27(PsiBuilder builder) {
        if (!(this.end_keyword_41(builder))) {
            return false;
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_28_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean scope_declarator_28_alt_2(PsiBuilder builder) {
        if (!(this.declarator_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_28(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.scope_declarator_28_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.scope_declarator_28_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SCOPED_DECLARATION);
        return true;
    }

    private boolean desigilname_29(PsiBuilder builder) {
        if (!(this.longname_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_30_alt_1(PsiBuilder builder) {
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

    private boolean numish_30_alt_2(PsiBuilder builder) {
        if (!(this.integer_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_30_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_30(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.numish_30_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.numish_30_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.numish_30_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean hexint_31_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_31_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_31_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_31_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_31_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_31_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_31_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_31(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_31_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean postfixish_32(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.postfix_36(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean stdstopper_33_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_33_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_33(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_33_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_33_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean initializer_34_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_34(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_53(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.initializer_34_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean prefix_35(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postfix_36(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean terminator_37_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_37_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_37_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_37_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_37_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_37_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_37_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_37_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_37_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_37_alt_2(builder)) {
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
        if (!(this.kok_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_37_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_37(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_37_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_37_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_37_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_37_alt_1(builder)) {
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

    private boolean variable_38(PsiBuilder builder) {
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

    private boolean twigil_39(PsiBuilder builder) {
        return true;
    }

    private boolean infixish_40(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_24(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean end_keyword_41(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_42(PsiBuilder builder) {
        if (!(this.statement_control_use_55(builder))) {
            return false;
        }
        return true;
    }

    private boolean semiarglist_43(PsiBuilder builder) {
        if (!(this.arglist_2(builder))) {
            return false;
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_44(PsiBuilder builder) {
        if (!(this.number_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45_alt_1(PsiBuilder builder) {
        if (!(this.term_name_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45_alt_2(PsiBuilder builder) {
        if (!(this.value_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45_alt_3(PsiBuilder builder) {
        if (!(this.scope_declarator_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45_alt_4(PsiBuilder builder) {
        if (!(this.term_ident_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45_alt_5(PsiBuilder builder) {
        if (!(this.variable_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_45(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_45_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.term_45_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.term_45_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.term_45_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.term_45_alt_1(builder)) {
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

    private boolean args_46_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean args_46_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_46_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_46_alt_4(PsiBuilder builder) {
        if (!(this.unsp_1(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_43(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_46_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_46_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_46_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_43(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_46_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_46(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_46_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_46_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_46_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_46_alt_1(builder)) {
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

    private boolean prefixish_47(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_35(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean TOP_48(PsiBuilder builder) {
        if (!(this.statementlist_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_49_quant_1(PsiBuilder builder) {
        if (!(this.identifier_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_49(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_49_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean number_50(PsiBuilder builder) {
        if (!(this.numish_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean decint_51_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_51_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_51_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_51(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_51_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_52_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_52_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_52_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_52(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_52_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean ws_53_alt_1(PsiBuilder builder) {
        if (!(this.unsp_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_53_alt_2(PsiBuilder builder) {
        if (!(this.unv_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_53_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_53_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_53_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_53_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_53_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_53(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_53_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean escale_54(PsiBuilder builder) {
        if (!(this.sign_5(builder))) {
            return false;
        }
        if (!(this.decint_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_55(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_53(builder))) {
            return false;
        }
        if (!(this.module_name_16(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
