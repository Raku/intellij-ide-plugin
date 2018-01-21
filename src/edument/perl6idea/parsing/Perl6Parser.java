package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_43(builder);
        rootMarker.done(root);
        return builder.getTreeBuilt();
    }

    private boolean statement_prefix_react_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("react"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REACT);
        return true;
    }

    private boolean unsp_2_alt_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_2_alt_2(PsiBuilder builder) {
        if (!(this.unv_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_2_alt_3(PsiBuilder builder) {
        if (!(this.vws_54(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_2_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unsp_2_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unsp_2_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.unsp_2_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean unsp_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.unsp_2_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
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
        if (!(this.xblock_143(builder))) {
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
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_if_3_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_7(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
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
        if (!(this.ws_200(builder))) {
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
        if (!(this.xblock_143(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
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
        if (!(this.ws_200(builder))) {
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
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
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

    private boolean statement_control_until_4_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_until_4(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_until_4_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNTIL_STATEMENT);
        return true;
    }

    private boolean dotty_5(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.dottyop_95(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean normspace_6(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean bare_complex_number_7(PsiBuilder builder) {
        if (!(this.signed_number_192(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signed_number_192(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_hyper_8(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("hyper"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER);
        return true;
    }

    private boolean param_term_9_quant_1(PsiBuilder builder) {
        if (!(this.defterm_199(builder))) {
            return false;
        }
        return true;
    }

    private boolean param_term_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.param_term_9_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean package_def_10_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10_quant_2(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_def_10_quant_4(PsiBuilder builder) {
        if (!(this.statementlist_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10_alt_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.package_def_10_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean package_def_10_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.package_def_10_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.package_def_10_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.package_def_10_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.package_def_10_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.package_def_10_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean termconj_11_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconj_11_alt_2(PsiBuilder builder) {
        if (!(this.rxtermish_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconj_11_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconj_11_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconj_11_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconj_11(PsiBuilder builder) {
        if (!(this.rxtermish_58(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconj_11_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean method_def_12_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_12_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_12_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.method_def_12_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean method_def_12_quant_4(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_12_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean method_def_12_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_12_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_12(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.method_def_12_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.method_def_12_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.method_def_12_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.method_def_12_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.method_def_12_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.method_def_12_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean EXPR_13_alt_1(PsiBuilder builder) {
        if (!(this.termish_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_quant_2(PsiBuilder builder) {
        if (!(this.prefixish_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_quant_3(PsiBuilder builder) {
        if (!(this.termish_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.EXPR_13_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_13_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.EXPR_13_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_13_quant_5(PsiBuilder builder) {
        if (!(this.postfixish_120(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_alt_6(PsiBuilder builder) {
        if (!(this.termish_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_quant_7(PsiBuilder builder) {
        if (!(this.prefixish_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_quant_8(PsiBuilder builder) {
        if (!(this.termish_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.EXPR_13_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.EXPR_13_quant_7(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.EXPR_13_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_13_quant_10(PsiBuilder builder) {
        if (!(this.postfixish_120(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_13_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.EXPR_13_alt_9(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.EXPR_13_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker13;;
            quantMarker13 = builder.mark();
            if (this.EXPR_13_quant_10(builder)) {
                quantMarker13.drop();
            } else {
                quantMarker13.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_13_quant_12(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if (!(this.infixish_128(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.EXPR_13_quant_11(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_13(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.EXPR_13_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.EXPR_13_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_13_quant_5(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker15;;
            quantMarker15 = builder.mark();
            if (this.EXPR_13_quant_12(builder)) {
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

    private boolean module_name_14(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ENDSTMT_15_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_15_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_15_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ENDSTMT_15_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ENDSTMT_15_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean ENDSTMT_15(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.ENDSTMT_15_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean sigil_16(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_17_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_17_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_17_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_17(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.rxinfixstopper_17_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.rxinfixstopper_17_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.rxinfixstopper_17_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean term_ident_18_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_18(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_18_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_193(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean integer_19(PsiBuilder builder) {
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

    private boolean complex_number_20(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.bare_complex_number_7(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.COMPLEX_LITERAL);
        return true;
    }

    private boolean statement_prefix_once_21(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("once"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONCE);
        return true;
    }

    private boolean regex_nibbler_22_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt2.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt3.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt4.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_nibbler_22_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_nibbler_22_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_nibbler_22_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.regex_nibbler_22_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22_quant_6(PsiBuilder builder) {
        if (!(this.termseq_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_22(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.regex_nibbler_22_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.regex_nibbler_22_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean privop_23_quant_1(PsiBuilder builder) {
        if (!(this.methodop_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean privop_23(PsiBuilder builder) {
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
        if (this.privop_23_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean statement_prefix_lazy_24(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("lazy"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.LAZY);
        return true;
    }

    private boolean name_25_quant_1(PsiBuilder builder) {
        if (!(this.morename_195(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_25_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.name_25_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.name_25_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_25_quant_3(PsiBuilder builder) {
        if (!(this.morename_195(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_25_alt_4(PsiBuilder builder) {
        if (!(this.identifier_122(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.name_25_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.name_25_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.name_25_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean semilist_26_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.statement_97(builder))) {
            return false;
        }
        if (!(this.eat_terminator_194(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean semilist_26_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.semilist_26_quant_1(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean semilist_26_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SEMI_LIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean semilist_26(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.semilist_26_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.semilist_26_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SEMI_LIST);
        return true;
    }

    private boolean pblock_27_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLOCK) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean pblock_27_alt_2(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_27_quant_3(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_27_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.LAMBDA) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.signature_85(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.pblock_27_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.POINTY_BLOCK);
        return true;
    }

    private boolean pblock_27(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.pblock_27_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.pblock_27_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.pblock_27_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean scope_declarator_28_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean scope_declarator_28_alt_2(PsiBuilder builder) {
        if (!(this.declarator_55(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_28_alt_3(PsiBuilder builder) {
        if (!(this.package_declarator_100(builder))) {
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
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.scope_declarator_28_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
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
        }
        marker1.done(Perl6ElementTypes.SCOPED_DECLARATION);
        return true;
    }

    private boolean default_value_29_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_29(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.default_value_29_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_DEFAULT);
        return true;
    }

    private boolean termconjseq_30_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconjseq_30_alt_2(PsiBuilder builder) {
        if (!(this.termalt_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconjseq_30_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconjseq_30_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconjseq_30_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconjseq_30(PsiBuilder builder) {
        if (!(this.termalt_94(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconjseq_30_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_mod_cond_keyword_31_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_31_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_31_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_31_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_31_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_31(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_mod_cond_keyword_31_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_mod_cond_keyword_31_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_mod_cond_keyword_31_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.statement_mod_cond_keyword_31_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.statement_mod_cond_keyword_31_alt_1(builder)) {
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

    private boolean statement_control_without_32_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_32(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("without"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_without_32_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WITHOUT_STATEMENT);
        return true;
    }

    private boolean param_sep_33(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_SEPARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_34(PsiBuilder builder) {
        if (!(this.trait_mod_71(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxarglist_35(PsiBuilder builder) {
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_36_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt1.equals("!!!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_36_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt2.equals("???"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_36_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt3.equals("..."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_36_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt4.equals("\u2026"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_36(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_stub_code_36_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.term_stub_code_36_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.term_stub_code_36_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.term_stub_code_36_alt_1(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.args_193(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.STUB_CODE);
        return true;
    }

    private boolean statement_control_QUIT_37_quant_1(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_QUIT_37(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("QUIT"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_QUIT_37_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.QUIT_STATEMENT);
        return true;
    }

    private boolean rxcodeblock_38(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_39_alt_1(PsiBuilder builder) {
        if (!(this.metachar_168(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_39_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_LITERAL);
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_39(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.atom_39_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.atom_39_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean charname_40_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_40_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_40_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_40_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_157(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_40(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_40_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_40_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_41_alt_1(PsiBuilder builder) {
        if (!(this.capterm_64(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_2(PsiBuilder builder) {
        if (!(this.term_name_165(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_3(PsiBuilder builder) {
        if (!(this.term_type_const_105(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_4(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_76(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_5(PsiBuilder builder) {
        if (!(this.term_whatever_92(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_6(PsiBuilder builder) {
        if (!(this.term_rand_181(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_7(PsiBuilder builder) {
        if (!(this.term_empty_set_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_8(PsiBuilder builder) {
        if (!(this.term_time_182(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_9(PsiBuilder builder) {
        if (!(this.term_now_84(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_10(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_11(PsiBuilder builder) {
        if (!(this.dotty_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_12(PsiBuilder builder) {
        if (!(this.term_stub_code_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_13(PsiBuilder builder) {
        if (!(this.circumfix_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_14(PsiBuilder builder) {
        if (!(this.term_onlystar_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_15(PsiBuilder builder) {
        if (!(this.package_declarator_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_16(PsiBuilder builder) {
        if (!(this.statement_prefix_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_17(PsiBuilder builder) {
        if (!(this.multi_declarator_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_18(PsiBuilder builder) {
        if (!(this.regex_declarator_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_19(PsiBuilder builder) {
        if (!(this.routine_declarator_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_20(PsiBuilder builder) {
        if (!(this.scope_declarator_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_21(PsiBuilder builder) {
        if (!(this.term_ident_18(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_22(PsiBuilder builder) {
        if (!(this.term_self_73(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_23(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_24(PsiBuilder builder) {
        if (!(this.colonpair_201(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_25(PsiBuilder builder) {
        if (!(this.fatarrow_172(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41_alt_26(PsiBuilder builder) {
        if (!(this.value_130(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_41(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.term_41_alt_26(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker25;;
            altMarker25 = builder.mark();
            if (this.term_41_alt_25(builder)) {
                altMarker25.drop();
            } else {
                altMarker25.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.term_41_alt_24(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker23;;
                    altMarker23 = builder.mark();
                    if (this.term_41_alt_23(builder)) {
                        altMarker23.drop();
                    } else {
                        altMarker23.rollbackTo();
                        PsiBuilder.Marker altMarker22;;
                        altMarker22 = builder.mark();
                        if (this.term_41_alt_22(builder)) {
                            altMarker22.drop();
                        } else {
                            altMarker22.rollbackTo();
                            PsiBuilder.Marker altMarker21;;
                            altMarker21 = builder.mark();
                            if (this.term_41_alt_21(builder)) {
                                altMarker21.drop();
                            } else {
                                altMarker21.rollbackTo();
                                PsiBuilder.Marker altMarker20;;
                                altMarker20 = builder.mark();
                                if (this.term_41_alt_20(builder)) {
                                    altMarker20.drop();
                                } else {
                                    altMarker20.rollbackTo();
                                    PsiBuilder.Marker altMarker19;;
                                    altMarker19 = builder.mark();
                                    if (this.term_41_alt_19(builder)) {
                                        altMarker19.drop();
                                    } else {
                                        altMarker19.rollbackTo();
                                        PsiBuilder.Marker altMarker18;;
                                        altMarker18 = builder.mark();
                                        if (this.term_41_alt_18(builder)) {
                                            altMarker18.drop();
                                        } else {
                                            altMarker18.rollbackTo();
                                            PsiBuilder.Marker altMarker17;;
                                            altMarker17 = builder.mark();
                                            if (this.term_41_alt_17(builder)) {
                                                altMarker17.drop();
                                            } else {
                                                altMarker17.rollbackTo();
                                                PsiBuilder.Marker altMarker16;;
                                                altMarker16 = builder.mark();
                                                if (this.term_41_alt_16(builder)) {
                                                    altMarker16.drop();
                                                } else {
                                                    altMarker16.rollbackTo();
                                                    PsiBuilder.Marker altMarker15;;
                                                    altMarker15 = builder.mark();
                                                    if (this.term_41_alt_15(builder)) {
                                                        altMarker15.drop();
                                                    } else {
                                                        altMarker15.rollbackTo();
                                                        PsiBuilder.Marker altMarker14;;
                                                        altMarker14 = builder.mark();
                                                        if (this.term_41_alt_14(builder)) {
                                                            altMarker14.drop();
                                                        } else {
                                                            altMarker14.rollbackTo();
                                                            PsiBuilder.Marker altMarker13;;
                                                            altMarker13 = builder.mark();
                                                            if (this.term_41_alt_13(builder)) {
                                                                altMarker13.drop();
                                                            } else {
                                                                altMarker13.rollbackTo();
                                                                PsiBuilder.Marker altMarker12;;
                                                                altMarker12 = builder.mark();
                                                                if (this.term_41_alt_12(builder)) {
                                                                    altMarker12.drop();
                                                                } else {
                                                                    altMarker12.rollbackTo();
                                                                    PsiBuilder.Marker altMarker11;;
                                                                    altMarker11 = builder.mark();
                                                                    if (this.term_41_alt_11(builder)) {
                                                                        altMarker11.drop();
                                                                    } else {
                                                                        altMarker11.rollbackTo();
                                                                        PsiBuilder.Marker altMarker10;;
                                                                        altMarker10 = builder.mark();
                                                                        if (this.term_41_alt_10(builder)) {
                                                                            altMarker10.drop();
                                                                        } else {
                                                                            altMarker10.rollbackTo();
                                                                            PsiBuilder.Marker altMarker9;;
                                                                            altMarker9 = builder.mark();
                                                                            if (this.term_41_alt_9(builder)) {
                                                                                altMarker9.drop();
                                                                            } else {
                                                                                altMarker9.rollbackTo();
                                                                                PsiBuilder.Marker altMarker8;;
                                                                                altMarker8 = builder.mark();
                                                                                if (this.term_41_alt_8(builder)) {
                                                                                    altMarker8.drop();
                                                                                } else {
                                                                                    altMarker8.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker7;;
                                                                                    altMarker7 = builder.mark();
                                                                                    if (this.term_41_alt_7(builder)) {
                                                                                        altMarker7.drop();
                                                                                    } else {
                                                                                        altMarker7.rollbackTo();
                                                                                        PsiBuilder.Marker altMarker6;;
                                                                                        altMarker6 = builder.mark();
                                                                                        if (this.term_41_alt_6(builder)) {
                                                                                            altMarker6.drop();
                                                                                        } else {
                                                                                            altMarker6.rollbackTo();
                                                                                            PsiBuilder.Marker altMarker5;;
                                                                                            altMarker5 = builder.mark();
                                                                                            if (this.term_41_alt_5(builder)) {
                                                                                                altMarker5.drop();
                                                                                            } else {
                                                                                                altMarker5.rollbackTo();
                                                                                                PsiBuilder.Marker altMarker4;;
                                                                                                altMarker4 = builder.mark();
                                                                                                if (this.term_41_alt_4(builder)) {
                                                                                                    altMarker4.drop();
                                                                                                } else {
                                                                                                    altMarker4.rollbackTo();
                                                                                                    PsiBuilder.Marker altMarker3;;
                                                                                                    altMarker3 = builder.mark();
                                                                                                    if (this.term_41_alt_3(builder)) {
                                                                                                        altMarker3.drop();
                                                                                                    } else {
                                                                                                        altMarker3.rollbackTo();
                                                                                                        PsiBuilder.Marker altMarker2;;
                                                                                                        altMarker2 = builder.mark();
                                                                                                        if (this.term_41_alt_2(builder)) {
                                                                                                            altMarker2.drop();
                                                                                                        } else {
                                                                                                            altMarker2.rollbackTo();
                                                                                                            PsiBuilder.Marker altMarker1;;
                                                                                                            altMarker1 = builder.mark();
                                                                                                            if (this.term_41_alt_1(builder)) {
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
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean statement_prefix_quietly_42(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("quietly"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.QUIETLY);
        return true;
    }

    private boolean TOP_43_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_107(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_43_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_43(PsiBuilder builder) {
        if (!(this.statementlist_106(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_43_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_43_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean version_44(PsiBuilder builder) {
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

    private boolean quantified_atom_45_quant_1(PsiBuilder builder) {
        if (!(this.sigmaybe_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_45_alt_2(PsiBuilder builder) {
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

    private boolean quantified_atom_45_alt_3(PsiBuilder builder) {
        if (!(this.quantifier_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_45_quant_4(PsiBuilder builder) {
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        if (!(this.sigmaybe_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_45_quant_5(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if (!(this.separator_154(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_45_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.quantified_atom_45_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.quantified_atom_45_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quantified_atom_45_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.quantified_atom_45_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean quantified_atom_45(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.atom_39(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quantified_atom_45_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantified_atom_45_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_ATOM);
        return true;
    }

    private boolean statement_prefix_46_alt_1(PsiBuilder builder) {
        if (!(this.statement_prefix_do_115(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_2(PsiBuilder builder) {
        if (!(this.statement_prefix_react_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_3(PsiBuilder builder) {
        if (!(this.statement_prefix_supply_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_4(PsiBuilder builder) {
        if (!(this.statement_prefix_start_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_5(PsiBuilder builder) {
        if (!(this.statement_prefix_once_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_6(PsiBuilder builder) {
        if (!(this.statement_prefix_gather_180(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_quietly_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_try_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_9(PsiBuilder builder) {
        if (!(this.statement_prefix_sink_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_10(PsiBuilder builder) {
        if (!(this.statement_prefix_eager_110(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_11(PsiBuilder builder) {
        if (!(this.statement_prefix_lazy_24(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_12(PsiBuilder builder) {
        if (!(this.statement_prefix_hyper_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_13(PsiBuilder builder) {
        if (!(this.statement_prefix_race_69(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_14(PsiBuilder builder) {
        if (!(this.statement_prefix_phaser_53(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46_alt_15(PsiBuilder builder) {
        if (!(this.statement_prefix_DOC_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_46(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.statement_prefix_46_alt_15(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.statement_prefix_46_alt_14(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                PsiBuilder.Marker altMarker13;;
                altMarker13 = builder.mark();
                if (this.statement_prefix_46_alt_13(builder)) {
                    altMarker13.drop();
                } else {
                    altMarker13.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.statement_prefix_46_alt_12(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.statement_prefix_46_alt_11(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker10;;
                            altMarker10 = builder.mark();
                            if (this.statement_prefix_46_alt_10(builder)) {
                                altMarker10.drop();
                            } else {
                                altMarker10.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.statement_prefix_46_alt_9(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.statement_prefix_46_alt_8(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.statement_prefix_46_alt_7(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.statement_prefix_46_alt_6(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.statement_prefix_46_alt_5(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.statement_prefix_46_alt_4(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
                                                        PsiBuilder.Marker altMarker3;;
                                                        altMarker3 = builder.mark();
                                                        if (this.statement_prefix_46_alt_3(builder)) {
                                                            altMarker3.drop();
                                                        } else {
                                                            altMarker3.rollbackTo();
                                                            PsiBuilder.Marker altMarker2;;
                                                            altMarker2 = builder.mark();
                                                            if (this.statement_prefix_46_alt_2(builder)) {
                                                                altMarker2.drop();
                                                            } else {
                                                                altMarker2.rollbackTo();
                                                                PsiBuilder.Marker altMarker1;;
                                                                altMarker1 = builder.mark();
                                                                if (this.statement_prefix_46_alt_1(builder)) {
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

    private boolean phaser_name_47_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_11(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_14(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_15(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47_alt_16(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_47(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.phaser_name_47_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.phaser_name_47_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.phaser_name_47_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.phaser_name_47_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.phaser_name_47_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.phaser_name_47_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.phaser_name_47_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.phaser_name_47_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.phaser_name_47_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.phaser_name_47_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.phaser_name_47_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.phaser_name_47_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.phaser_name_47_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.phaser_name_47_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.phaser_name_47_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.phaser_name_47_alt_1(builder)) {
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

    private boolean sign_48_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_48_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_48_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_48_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_48(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_48_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_48_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_48_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_48_alt_1(builder)) {
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

    private boolean apostrophe_49(PsiBuilder builder) {
        return true;
    }

    private boolean rxqq_50_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_50_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqq_50_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_50_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_50_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxqq_50_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_50_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_50_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxqq_50_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_50_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_50_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxqq_50_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_50(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxqq_50_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxqq_50_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxqq_50_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxqq_50_alt_2(builder)) {
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

    private boolean octint_51_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_51_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.octint_51_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_51_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_51(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octint_51_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_51_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean blorst_52_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLORST) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blorst_52_alt_2(PsiBuilder builder) {
        if (!(this.statement_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_52_alt_3(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_52(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.blorst_52_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.blorst_52_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.blorst_52_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_prefix_phaser_53(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PHASER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean vws_54(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean declarator_55_alt_1(PsiBuilder builder) {
        if (!(this.regex_declarator_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_55_alt_2(PsiBuilder builder) {
        if (!(this.routine_declarator_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_55_quant_3(PsiBuilder builder) {
        if (!(this.initializer_125(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_55_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if (!(this.variable_declarator_152(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.declarator_55_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_55(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.declarator_55_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.declarator_55_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.declarator_55_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_prefix_sink_56(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("sink"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SINK);
        return true;
    }

    private boolean backmod_57_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_57_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_57_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_57_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_57(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.backmod_57_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.backmod_57_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.backmod_57_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.backmod_57_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rxtermish_58_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxtermish_58(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.rxtermish_58_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean termaltseq_59_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termaltseq_59_alt_2(PsiBuilder builder) {
        if (!(this.termconjseq_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean termaltseq_59_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termaltseq_59_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termaltseq_59_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termaltseq_59(PsiBuilder builder) {
        if (!(this.termconjseq_30(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termaltseq_59_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_CONTROL_60_quant_1(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CONTROL_60(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CONTROL"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CONTROL_60_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CONTROL_STATEMENT);
        return true;
    }

    private boolean statement_control_given_61_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_given_61(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("given"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_given_61_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.GIVEN_STATEMENT);
        return true;
    }

    private boolean statement_control_loop_62_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_2(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_3(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt4.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_control_loop_62_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt3.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_loop_62_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_loop_62_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_7(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_loop_62_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_loop_62_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_control_loop_62_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62_quant_8(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_62(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("loop"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_loop_62_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_loop_62_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.LOOP_STATEMENT);
        return true;
    }

    private boolean statement_control_for_63_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_for_63(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("for"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_for_63_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FOR_STATEMENT);
        return true;
    }

    private boolean capterm_64_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_INVALID) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_64_alt_2(PsiBuilder builder) {
        if (!(this.termish_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean capterm_64_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_64_alt_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_189(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.capterm_64_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean capterm_64(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.capterm_64_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.capterm_64_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.capterm_64_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.CAPTURE);
        return true;
    }

    private boolean assertion_65_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_ASSERTION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_2(PsiBuilder builder) {
        if (!(this.cclass_elem_170(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.assertion_65_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.assertion_65_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker2.done(Perl6ElementTypes.REGEX_CCLASS);
        return true;
    }

    private boolean assertion_65_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.assertion_65_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.assertion_65_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.assertion_65_alt_4(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean assertion_65_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.assertion_65_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean assertion_65_alt_9(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_11(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_35(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.assertion_65_quant_10(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean assertion_65_alt_12(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt4.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_13(PsiBuilder builder) {
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.assertion_65_alt_12(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.assertion_65_alt_11(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean assertion_65_alt_14(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.assertion_65_quant_13(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        return true;
    }

    private boolean assertion_65_alt_15(PsiBuilder builder) {
        if (!(this.rxcodeblock_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_17(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_19(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        if (!(this.regex_nibbler_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_35(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.assertion_65_quant_20(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        return true;
    }

    private boolean assertion_65_alt_22(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt7.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_23(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt8.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_24(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_quant_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.assertion_65_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker25;;
            altMarker25 = builder.mark();
            if (this.assertion_65_alt_23(builder)) {
                altMarker25.drop();
            } else {
                altMarker25.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.assertion_65_alt_22(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker23;;
                    altMarker23 = builder.mark();
                    if (this.assertion_65_alt_21(builder)) {
                        altMarker23.drop();
                    } else {
                        altMarker23.rollbackTo();
                        PsiBuilder.Marker altMarker21;;
                        altMarker21 = builder.mark();
                        if (this.assertion_65_alt_19(builder)) {
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

    private boolean assertion_65_alt_26(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.assertion_65_alt_18(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.assertion_65_alt_17(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker27;
        quantMarker27 = builder.mark();
        if (this.assertion_65_quant_25(builder)) {
            quantMarker27.drop();
        } else {
            quantMarker27.rollbackTo();
        }
        return true;
    }

    private boolean assertion_65_alt_27(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt9.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_28(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt10.equals("?"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_29(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt11.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_30(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65_alt_31(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_65(PsiBuilder builder) {
        PsiBuilder.Marker altMarker33;
        altMarker33 = builder.mark();
        if (this.assertion_65_alt_31(builder)) {
            altMarker33.drop();
        } else {
            altMarker33.rollbackTo();
            PsiBuilder.Marker altMarker32;;
            altMarker32 = builder.mark();
            if (this.assertion_65_alt_30(builder)) {
                altMarker32.drop();
            } else {
                altMarker32.rollbackTo();
                PsiBuilder.Marker altMarker31;;
                altMarker31 = builder.mark();
                if (this.assertion_65_alt_29(builder)) {
                    altMarker31.drop();
                } else {
                    altMarker31.rollbackTo();
                    PsiBuilder.Marker altMarker30;;
                    altMarker30 = builder.mark();
                    if (this.assertion_65_alt_28(builder)) {
                        altMarker30.drop();
                    } else {
                        altMarker30.rollbackTo();
                        PsiBuilder.Marker altMarker29;;
                        altMarker29 = builder.mark();
                        if (this.assertion_65_alt_27(builder)) {
                            altMarker29.drop();
                        } else {
                            altMarker29.rollbackTo();
                            PsiBuilder.Marker altMarker28;;
                            altMarker28 = builder.mark();
                            if (this.assertion_65_alt_26(builder)) {
                                altMarker28.drop();
                            } else {
                                altMarker28.rollbackTo();
                                PsiBuilder.Marker altMarker18;;
                                altMarker18 = builder.mark();
                                if (this.assertion_65_alt_16(builder)) {
                                    altMarker18.drop();
                                } else {
                                    altMarker18.rollbackTo();
                                    PsiBuilder.Marker altMarker17;;
                                    altMarker17 = builder.mark();
                                    if (this.assertion_65_alt_15(builder)) {
                                        altMarker17.drop();
                                    } else {
                                        altMarker17.rollbackTo();
                                        PsiBuilder.Marker altMarker16;;
                                        altMarker16 = builder.mark();
                                        if (this.assertion_65_alt_14(builder)) {
                                            altMarker16.drop();
                                        } else {
                                            altMarker16.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.assertion_65_alt_9(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.assertion_65_alt_8(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.assertion_65_alt_3(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker1;;
                                                        altMarker1 = builder.mark();
                                                        if (this.assertion_65_alt_1(builder)) {
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

    private boolean infix_66(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean coloncircumfix_67(PsiBuilder builder) {
        if (!(this.circumfix_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_supply_68(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("supply"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUPPLY);
        return true;
    }

    private boolean statement_prefix_race_69(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("race"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.RACE);
        return true;
    }

    private boolean lambda_70_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_70_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_70(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.lambda_70_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.lambda_70_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_2(PsiBuilder builder) {
        if (!(this.term_41(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt1.equals("handles"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.trait_mod_71_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.trait_mod_71_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_5(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt2.equals("returns"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.trait_mod_71_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.trait_mod_71_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_8(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt3.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.trait_mod_71_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.trait_mod_71_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_12(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.trait_mod_71_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.trait_mod_71_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_14(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt4.equals("will"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.trait_mod_71_alt_13(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.trait_mod_71_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_16(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_17(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt5.equals("does"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.trait_mod_71_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.trait_mod_71_alt_15(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_19(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt6.equals("hides"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.trait_mod_71_alt_19(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.trait_mod_71_alt_18(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71_alt_21(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_22(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_71_alt_23(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt7.equals("is"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.trait_mod_71_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.trait_mod_71_alt_21(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_71(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker24;
        altMarker24 = builder.mark();
        if (this.trait_mod_71_alt_23(builder)) {
            altMarker24.drop();
        } else {
            altMarker24.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.trait_mod_71_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.trait_mod_71_alt_17(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.trait_mod_71_alt_14(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        PsiBuilder.Marker altMarker10;;
                        altMarker10 = builder.mark();
                        if (this.trait_mod_71_alt_9(builder)) {
                            altMarker10.drop();
                        } else {
                            altMarker10.rollbackTo();
                            PsiBuilder.Marker altMarker7;;
                            altMarker7 = builder.mark();
                            if (this.trait_mod_71_alt_6(builder)) {
                                altMarker7.drop();
                            } else {
                                altMarker7.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.trait_mod_71_alt_3(builder)) {
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

    private boolean rat_number_72(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.bare_rat_number_188(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.RAT_LITERAL);
        return true;
    }

    private boolean term_self_73(PsiBuilder builder) {
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

    private boolean stdstopper_74_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_74_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_74(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_74_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_74_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_75_alt_1(PsiBuilder builder) {
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

    private boolean variable_75_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt2.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_75_alt_3(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_75_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.variable_75_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.variable_75_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_75_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.variable_75_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.postcircumfix_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_75_alt_6(PsiBuilder builder) {
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
        if (this.variable_75_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean variable_75(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.variable_75_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.variable_75_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_hyperwhatever_76(PsiBuilder builder) {
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

    private boolean statement_control_when_77_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_when_77(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("when"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_when_77_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHEN_STATEMENT);
        return true;
    }

    private boolean spacey_78_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_78_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_78(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.spacey_78_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.spacey_78_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_79_alt_1(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_79_alt_2(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_79_alt_3(PsiBuilder builder) {
        if (!(this.named_param_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_79_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean named_param_79_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.named_param_79_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.named_param_79_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.named_param_79_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean named_param_79_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.named_param_79_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean named_param_79_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.named_param_79_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean named_param_79_quant_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.named_param_79_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.named_param_79_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_79(PsiBuilder builder) {
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
        if (this.named_param_79_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NAMED_PARAMETER);
        return true;
    }

    private boolean charnames_80_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_80_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_80_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_80_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_40(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_80_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_80(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.charnames_80_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_80_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_81_alt_1(PsiBuilder builder) {
        if (!(this.statement_control_QUIT_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_2(PsiBuilder builder) {
        if (!(this.statement_control_CONTROL_60(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_CATCH_159(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_default_173(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_5(PsiBuilder builder) {
        if (!(this.statement_control_when_77(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_6(PsiBuilder builder) {
        if (!(this.statement_control_given_61(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_7(PsiBuilder builder) {
        if (!(this.statement_control_require_96(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_use_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_9(PsiBuilder builder) {
        if (!(this.statement_control_no_111(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_10(PsiBuilder builder) {
        if (!(this.statement_control_import_167(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_11(PsiBuilder builder) {
        if (!(this.statement_control_need_142(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_12(PsiBuilder builder) {
        if (!(this.statement_control_loop_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_13(PsiBuilder builder) {
        if (!(this.statement_control_whenever_183(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_14(PsiBuilder builder) {
        if (!(this.statement_control_for_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_15(PsiBuilder builder) {
        if (!(this.statement_control_repeat_93(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_16(PsiBuilder builder) {
        if (!(this.statement_control_until_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_17(PsiBuilder builder) {
        if (!(this.statement_control_while_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_18(PsiBuilder builder) {
        if (!(this.statement_control_without_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_19(PsiBuilder builder) {
        if (!(this.statement_control_unless_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81_alt_20(PsiBuilder builder) {
        if (!(this.statement_control_if_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_81(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.statement_control_81_alt_20(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.statement_control_81_alt_19(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.statement_control_81_alt_18(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.statement_control_81_alt_17(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker16;;
                        altMarker16 = builder.mark();
                        if (this.statement_control_81_alt_16(builder)) {
                            altMarker16.drop();
                        } else {
                            altMarker16.rollbackTo();
                            PsiBuilder.Marker altMarker15;;
                            altMarker15 = builder.mark();
                            if (this.statement_control_81_alt_15(builder)) {
                                altMarker15.drop();
                            } else {
                                altMarker15.rollbackTo();
                                PsiBuilder.Marker altMarker14;;
                                altMarker14 = builder.mark();
                                if (this.statement_control_81_alt_14(builder)) {
                                    altMarker14.drop();
                                } else {
                                    altMarker14.rollbackTo();
                                    PsiBuilder.Marker altMarker13;;
                                    altMarker13 = builder.mark();
                                    if (this.statement_control_81_alt_13(builder)) {
                                        altMarker13.drop();
                                    } else {
                                        altMarker13.rollbackTo();
                                        PsiBuilder.Marker altMarker12;;
                                        altMarker12 = builder.mark();
                                        if (this.statement_control_81_alt_12(builder)) {
                                            altMarker12.drop();
                                        } else {
                                            altMarker12.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.statement_control_81_alt_11(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.statement_control_81_alt_10(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker9;;
                                                    altMarker9 = builder.mark();
                                                    if (this.statement_control_81_alt_9(builder)) {
                                                        altMarker9.drop();
                                                    } else {
                                                        altMarker9.rollbackTo();
                                                        PsiBuilder.Marker altMarker8;;
                                                        altMarker8 = builder.mark();
                                                        if (this.statement_control_81_alt_8(builder)) {
                                                            altMarker8.drop();
                                                        } else {
                                                            altMarker8.rollbackTo();
                                                            PsiBuilder.Marker altMarker7;;
                                                            altMarker7 = builder.mark();
                                                            if (this.statement_control_81_alt_7(builder)) {
                                                                altMarker7.drop();
                                                            } else {
                                                                altMarker7.rollbackTo();
                                                                PsiBuilder.Marker altMarker6;;
                                                                altMarker6 = builder.mark();
                                                                if (this.statement_control_81_alt_6(builder)) {
                                                                    altMarker6.drop();
                                                                } else {
                                                                    altMarker6.rollbackTo();
                                                                    PsiBuilder.Marker altMarker5;;
                                                                    altMarker5 = builder.mark();
                                                                    if (this.statement_control_81_alt_5(builder)) {
                                                                        altMarker5.drop();
                                                                    } else {
                                                                        altMarker5.rollbackTo();
                                                                        PsiBuilder.Marker altMarker4;;
                                                                        altMarker4 = builder.mark();
                                                                        if (this.statement_control_81_alt_4(builder)) {
                                                                            altMarker4.drop();
                                                                        } else {
                                                                            altMarker4.rollbackTo();
                                                                            PsiBuilder.Marker altMarker3;;
                                                                            altMarker3 = builder.mark();
                                                                            if (this.statement_control_81_alt_3(builder)) {
                                                                                altMarker3.drop();
                                                                            } else {
                                                                                altMarker3.rollbackTo();
                                                                                PsiBuilder.Marker altMarker2;;
                                                                                altMarker2 = builder.mark();
                                                                                if (this.statement_control_81_alt_2(builder)) {
                                                                                    altMarker2.drop();
                                                                                } else {
                                                                                    altMarker2.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                    altMarker1 = builder.mark();
                                                                                    if (this.statement_control_81_alt_1(builder)) {
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

    private boolean termseq_82(PsiBuilder builder) {
        if (!(this.termaltseq_59(builder))) {
            return false;
        }
        return true;
    }

    private boolean prefixish_83(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_177(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean term_now_84(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("now"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_112(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean signature_85_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean signature_85_alt_2(PsiBuilder builder) {
        if (!(this.parameter_109(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_85_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_85_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.signature_85_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.signature_85_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean signature_85_quant_5(PsiBuilder builder) {
        if (!(this.param_sep_33(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.signature_85_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean signature_85_alt_6(PsiBuilder builder) {
        if (!(this.parameter_109(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.signature_85_quant_5(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean signature_85_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_85_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_RETURN_CONSTRAINT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_85_alt_9(PsiBuilder builder) {
        if (!(this.value_130(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_85_alt_10(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_85_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.signature_85_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.signature_85_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_85_quant_12(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RETURN_ARROW) && (tt1.equals("-->"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.signature_85_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.signature_85_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        marker8.done(Perl6ElementTypes.RETURN_CONSTRAINT);
        return true;
    }

    private boolean signature_85(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.signature_85_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.signature_85_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.signature_85_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.signature_85_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean post_constraint_86_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean post_constraint_86_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.post_constraint_86_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean post_constraint_86_quant_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_86_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.post_constraint_86_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_86_quant_5(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_86_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.post_constraint_86_quant_5(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_86(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.post_constraint_86_alt_6(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.post_constraint_86_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.post_constraint_86_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.regex_def_87_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean regex_def_87_quant_4(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_REGEX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_alt_6(PsiBuilder builder) {
        if (!(this.enter_regex_nibblier_198(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt4.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_87_quant_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt3.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.regex_def_87_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.regex_def_87_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.regex_def_87_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.regex_def_87_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean regex_def_87(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.regex_def_87_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.regex_def_87_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.regex_def_87_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.regex_def_87_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean term_empty_set_88(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("\u2205"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean quote_89_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\uFF63"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\uFF62"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_Q_161(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quote_89_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.quote_89_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_6(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quote_89_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quote_89_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt8.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_10(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt7.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.quote_89_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_12(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt9.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.quote_89_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_14(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt10.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.quote_89_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt12.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_16(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt11.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.quote_89_quant_15(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        return true;
    }

    private boolean quote_89_quant_17(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt14.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_89_alt_18(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt13.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.quote_89_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean quote_89(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker19;
        altMarker19 = builder.mark();
        if (this.quote_89_alt_18(builder)) {
            altMarker19.drop();
        } else {
            altMarker19.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.quote_89_alt_16(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.quote_89_alt_14(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.quote_89_alt_12(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.quote_89_alt_10(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker9;;
                            altMarker9 = builder.mark();
                            if (this.quote_89_alt_8(builder)) {
                                altMarker9.drop();
                            } else {
                                altMarker9.rollbackTo();
                                PsiBuilder.Marker altMarker7;;
                                altMarker7 = builder.mark();
                                if (this.quote_89_alt_6(builder)) {
                                    altMarker7.drop();
                                } else {
                                    altMarker7.rollbackTo();
                                    PsiBuilder.Marker altMarker5;;
                                    altMarker5 = builder.mark();
                                    if (this.quote_89_alt_4(builder)) {
                                        altMarker5.drop();
                                    } else {
                                        altMarker5.rollbackTo();
                                        PsiBuilder.Marker altMarker3;;
                                        altMarker3 = builder.mark();
                                        if (this.quote_89_alt_2(builder)) {
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

    private boolean routine_declarator_90_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_90_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_90_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_119(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_90(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.routine_declarator_90_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.routine_declarator_90_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.routine_declarator_90_alt_1(builder)) {
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

    private boolean termish_91(PsiBuilder builder) {
        if (!(this.term_41(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_whatever_92(PsiBuilder builder) {
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

    private boolean statement_control_repeat_93_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_repeat_93_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_repeat_93_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_repeat_93_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_repeat_93_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_93_alt_6(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_repeat_93_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_93_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_quant_9(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_93_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.statement_control_repeat_93_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.statement_control_repeat_93_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_repeat_93_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_93(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("repeat"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.statement_control_repeat_93_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_control_repeat_93_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_repeat_93_alt_1(builder)) {
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

    private boolean termalt_94_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termalt_94_alt_2(PsiBuilder builder) {
        if (!(this.termconj_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean termalt_94_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termalt_94_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termalt_94_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termalt_94(PsiBuilder builder) {
        if (!(this.termconj_11(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termalt_94_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean dottyop_95_quant_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_95_quant_2(PsiBuilder builder) {
        if (!(this.methodop_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_95(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_95_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dottyop_95_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_96_alt_1(PsiBuilder builder) {
        if (!(this.term_41(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_96_alt_2(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_96_alt_3(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_96_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_96_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_require_96_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_require_96_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_require_96_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_require_96_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_96(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("require"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_require_96_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REQUIRE_STATEMENT);
        return true;
    }

    private boolean statement_97_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_97_alt_2(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_166(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_97_quant_3(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_166(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_97_alt_4(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if (!(this.statement_mod_cond_190(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_97_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean statement_97_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_97_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_97_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_97_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_97_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_97_alt_7(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_97_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_97_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_81(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_97(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.statement_97_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_97_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.statement_97_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean multi_declarator_98_alt_1(PsiBuilder builder) {
        if (!(this.declarator_55(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_98_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean multi_declarator_98_alt_3(PsiBuilder builder) {
        if (!(this.routine_def_119(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_98_alt_4(PsiBuilder builder) {
        if (!(this.declarator_55(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_98_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.multi_declarator_98_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.multi_declarator_98_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.multi_declarator_98_alt_2(builder)) {
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

    private boolean multi_declarator_98(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.multi_declarator_98_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.multi_declarator_98_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean onlystar_99(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
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

    private boolean package_declarator_100(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PACKAGE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.package_def_10(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PACKAGE_DECLARATION);
        return true;
    }

    private boolean package_kind_101_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_101(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.package_kind_101_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.package_kind_101_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.package_kind_101_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.package_kind_101_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.package_kind_101_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.package_kind_101_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.package_kind_101_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.package_kind_101_alt_1(builder)) {
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

    private boolean dec_number_102_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_102_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_102(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_102_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_102_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_103_alt_1(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_7(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_8(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_103_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_103_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.quote_escape_103_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_103(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.quote_escape_103_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_103_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.quote_escape_103_alt_5(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.quote_escape_103_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.quote_escape_103_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.quote_escape_103_alt_2(builder)) {
                                altMarker2.drop();
                            } else {
                                altMarker2.rollbackTo();
                                PsiBuilder.Marker altMarker1;;
                                altMarker1 = builder.mark();
                                if (this.quote_escape_103_alt_1(builder)) {
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

    private boolean signed_integer_104(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_type_const_105(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean statementlist_106_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_106_alt_2(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_106_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.statement_97(builder))) {
            return false;
        }
        if (!(this.eat_terminator_194(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean statementlist_106(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_106_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_106_alt_1(builder)) {
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
            if (this.statementlist_106_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean bogus_end_107(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean longname_108(PsiBuilder builder) {
        if (!(this.name_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_1(PsiBuilder builder) {
        if (!(this.named_param_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_2(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.parameter_109_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.parameter_109_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.parameter_109_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean parameter_109_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_6(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.parameter_109_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.parameter_109_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_109_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt1.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_9(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt2.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.parameter_109_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.parameter_109_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.parameter_109_alt_8(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.param_term_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_quant_12(PsiBuilder builder) {
        if (!(this.type_constraint_134(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_14(PsiBuilder builder) {
        if (!(this.named_param_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_15(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_quant_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_17(PsiBuilder builder) {
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.parameter_109_alt_15(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.parameter_109_alt_14(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.parameter_109_quant_16(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean parameter_109_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_19(PsiBuilder builder) {
        if (!(this.param_var_191(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker21;
        altMarker21 = builder.mark();
        if (this.parameter_109_alt_19(builder)) {
            altMarker21.drop();
        } else {
            altMarker21.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.parameter_109_alt_18(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_109_alt_21(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt4.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_22(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt5.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_23(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt6.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_24(PsiBuilder builder) {
        PsiBuilder.Marker altMarker25;
        altMarker25 = builder.mark();
        if (this.parameter_109_alt_23(builder)) {
            altMarker25.drop();
        } else {
            altMarker25.rollbackTo();
            PsiBuilder.Marker altMarker24;;
            altMarker24 = builder.mark();
            if (this.parameter_109_alt_22(builder)) {
                altMarker24.drop();
            } else {
                altMarker24.rollbackTo();
                PsiBuilder.Marker altMarker23;;
                altMarker23 = builder.mark();
                if (this.parameter_109_alt_21(builder)) {
                    altMarker23.drop();
                } else {
                    altMarker23.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.param_term_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_alt_25(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.parameter_109_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker14;;
            quantMarker14 = builder.mark();
            if (this.parameter_109_quant_12(builder)) {
                quantMarker14.drop();
            } else {
                quantMarker14.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.parameter_109_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.parameter_109_alt_20(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                PsiBuilder.Marker altMarker19;;
                altMarker19 = builder.mark();
                if (this.parameter_109_alt_17(builder)) {
                    altMarker19.drop();
                } else {
                    altMarker19.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.parameter_109_alt_13(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean parameter_109_quant_26(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_quant_27(PsiBuilder builder) {
        if (!(this.post_constraint_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109_quant_28(PsiBuilder builder) {
        if (!(this.default_value_29(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_109(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker27;
        altMarker27 = builder.mark();
        if (this.parameter_109_alt_25(builder)) {
            altMarker27.drop();
        } else {
            altMarker27.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.parameter_109_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.parameter_109_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.parameter_109_alt_4(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker28;;
            quantMarker28 = builder.mark();
            if (this.parameter_109_quant_26(builder)) {
                quantMarker28.drop();
            } else {
                quantMarker28.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker29;;
            quantMarker29 = builder.mark();
            if (this.parameter_109_quant_27(builder)) {
                quantMarker29.drop();
            } else {
                quantMarker29.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker30;
        quantMarker30 = builder.mark();
        if (this.parameter_109_quant_28(builder)) {
            quantMarker30.drop();
        } else {
            quantMarker30.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER);
        return true;
    }

    private boolean statement_prefix_eager_110(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("eager"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.EAGER);
        return true;
    }

    private boolean statement_control_no_111_quant_1(PsiBuilder builder) {
        if (!(this.spacey_78(builder))) {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_111_quant_2(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_no_111_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_111(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("no"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_no_111_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NO_STATEMENT);
        return true;
    }

    private boolean tok_112(PsiBuilder builder) {
        if (!(this.end_keyword_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_113_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_3(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt2.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.typename_113_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean typename_113_quant_6(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_7(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_113_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_alt_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.typename_113_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.typename_113_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.typename_113_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_113_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_113_alt_12(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_113_quant_13(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAME) && (tt5.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.typename_113_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.typename_113_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_113(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.typename_113_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.typename_113_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.typename_113_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.typename_113_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.typename_113_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.typename_113_quant_10(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.typename_113_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean hexints_114_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_114_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_114_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_114_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_171(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_114_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_114(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexints_114_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_114_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_do_115(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("do"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.DO);
        return true;
    }

    private boolean term_onlystar_116(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt1.equals("{*}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONLY_STAR);
        return true;
    }

    private boolean statement_mod_loop_keyword_117_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_117_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_117_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_117_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_117(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_mod_loop_keyword_117_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_mod_loop_keyword_117_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_mod_loop_keyword_117_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.statement_mod_loop_keyword_117_alt_1(builder)) {
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

    private boolean comment_118(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_119_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_119_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_119_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_119_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_119_quant_4(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_119_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_119_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_119_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_119(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_119_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_119_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.routine_def_119_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.routine_def_119_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.routine_def_119_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.routine_def_119_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean postfixish_120_alt_1(PsiBuilder builder) {
        if (!(this.privop_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_120_alt_2(PsiBuilder builder) {
        if (!(this.dotty_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_120_alt_3(PsiBuilder builder) {
        if (!(this.postcircumfix_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_120_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.postfix_126(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_120(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.postfixish_120_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.postfixish_120_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.postfixish_120_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.postfixish_120_alt_1(builder)) {
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

    private boolean colonpair_variable_121_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_121_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_121(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.colonpair_variable_121_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.colonpair_variable_121_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean identifier_122_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_49(builder))) {
            return false;
        }
        if (!(this.ident_150(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_122(PsiBuilder builder) {
        if (!(this.ident_150(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_122_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean desigilname_123(PsiBuilder builder) {
        if (!(this.longname_108(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_1(PsiBuilder builder) {
        if (!(this.quote_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_2(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_124_quant_4(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_124_alt_6(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_7(PsiBuilder builder) {
        if (!(this.args_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_124_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.methodop_124_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_124_quant_9(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_124(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.methodop_124_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.methodop_124_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.methodop_124_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.methodop_124_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.methodop_124_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_124_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.methodop_124_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean initializer_125_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("::="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_125_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(":="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_125_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt3.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_125_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INITIALIZER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_125_alt_5(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_125(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.initializer_125_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.initializer_125_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.initializer_125_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.initializer_125_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.initializer_125_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean postfix_126(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_127_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt1.equals("token"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.regex_def_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_127_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt2.equals("rule"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.regex_def_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_127_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt3.equals("regex"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.regex_def_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_127(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_declarator_127_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_declarator_127_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_declarator_127_alt_1(builder)) {
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

    private boolean infixish_128(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_66(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean end_keyword_129(PsiBuilder builder) {
        return true;
    }

    private boolean value_130_alt_1(PsiBuilder builder) {
        if (!(this.quote_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_130_alt_2(PsiBuilder builder) {
        if (!(this.number_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_130(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_130_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_130_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_try_131(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("try"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TRY);
        return true;
    }

    private boolean block_132(PsiBuilder builder) {
        if (!(this.blockoid_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_133_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_133(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_while_133_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHILE_STATEMENT);
        return true;
    }

    private boolean type_constraint_134_alt_1(PsiBuilder builder) {
        if (!(this.typename_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_134_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.numish_176(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_134_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.value_130(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_134_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_134_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker6;
        marker6 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.type_constraint_134_quant_4(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker6.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_134(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.type_constraint_134_alt_5(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.type_constraint_134_alt_3(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.type_constraint_134_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.type_constraint_134_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean binint_135_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_135_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.binint_135_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_135_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_135(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.binint_135_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_135_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_136_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_136_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.decint_136_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_136_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_136(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.decint_136_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_136_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_start_137(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("start"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.START);
        return true;
    }

    private boolean cclass_backslash_138(PsiBuilder builder) {
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

    private boolean sigmaybe_139_alt_1(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean sigmaybe_139_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.normspace_6(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_SIGSPACE);
        return true;
    }

    private boolean sigmaybe_139(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.sigmaybe_139_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.sigmaybe_139_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean starter_140(PsiBuilder builder) {
        return true;
    }

    private boolean escale_141(PsiBuilder builder) {
        if (!(this.sign_48(builder))) {
            return false;
        }
        if (!(this.decint_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_alt_1(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_alt_2(PsiBuilder builder) {
        if (!(this.version_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_alt_3(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_alt_4(PsiBuilder builder) {
        if (!(this.version_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_need_142_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_need_142_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_need_142_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(","))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_need_142_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_142_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_need_142_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_need_142_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_need_142_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_need_142(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("need"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_need_142_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NEED_STATEMENT);
        return true;
    }

    private boolean xblock_143_quant_1(PsiBuilder builder) {
        if (!(this.pblock_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean xblock_143(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.xblock_143_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean octints_144_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_144_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_144_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_144_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_51(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_144_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_144(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octints_144_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_144_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean arglist_145_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_145_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.arglist_145_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean arglist_145_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_EMPTY) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean arglist_145(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_START) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.arglist_145_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.arglist_145_alt_2(builder)) {
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

    private boolean stopper_146_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_146_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_146(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_146_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_146_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rxq_147_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_147_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxq_147_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxq_147_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_147_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxq_147_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxq_147_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_147_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxq_147_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxq_147_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_147_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxq_147_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxq_147(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxq_147_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxq_147_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxq_147_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxq_147_alt_2(builder)) {
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

    private boolean quantifier_148_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_quant_2(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_quant_3(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_alt_5(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHATEVER) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_alt_6(PsiBuilder builder) {
        if (!(this.integer_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.quantifier_148_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quantifier_148_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quantifier_148_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantifier_148_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_148_alt_9(PsiBuilder builder) {
        if (!(this.integer_19(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.quantifier_148_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_148_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PREFIX) && (tt3.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_alt_11(PsiBuilder builder) {
        if (!(this.rxcodeblock_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_148_alt_12(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) && (tt1.equals("**"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.quantifier_148_quant_2(builder)) {
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
        if (this.quantifier_148_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.quantifier_148_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.quantifier_148_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.quantifier_148_alt_9(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.quantifier_148_alt_4(builder)) {
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

    private boolean quantifier_148(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.quantifier_148_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quantifier_148_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_QUANTIFIER);
        return true;
    }

    private boolean postcircumfix_149_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.postcircumfix_149_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CALL);
        return true;
    }

    private boolean postcircumfix_149_quant_3(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_quant_4(PsiBuilder builder) {
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.postcircumfix_149_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_149_alt_5(PsiBuilder builder) {
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
        if (this.postcircumfix_149_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_149_quant_6(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt6.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_quant_7(PsiBuilder builder) {
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.postcircumfix_149_quant_6(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_149_alt_8(PsiBuilder builder) {
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
        if (this.postcircumfix_149_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_149_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt8.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_quant_10(PsiBuilder builder) {
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.postcircumfix_149_quant_9(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_149_alt_11(PsiBuilder builder) {
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
        if (this.postcircumfix_149_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker12.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_149_quant_12(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt10.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_quant_13(PsiBuilder builder) {
        if (!(this.semilist_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.postcircumfix_149_quant_12(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_149_alt_14(PsiBuilder builder) {
        PsiBuilder.Marker marker16;
        marker16 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt9.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.postcircumfix_149_quant_13(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        marker16.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_149_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt12.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_149_quant_16(PsiBuilder builder) {
        if (!(this.semilist_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker21;
        quantMarker21 = builder.mark();
        if (this.postcircumfix_149_quant_15(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_149_alt_17(PsiBuilder builder) {
        PsiBuilder.Marker marker20;
        marker20 = builder.mark();
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt11.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.postcircumfix_149_quant_16(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        marker20.done(Perl6ElementTypes.ARRAY_INDEX);
        return true;
    }

    private boolean postcircumfix_149(PsiBuilder builder) {
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.postcircumfix_149_alt_17(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.postcircumfix_149_alt_14(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.postcircumfix_149_alt_11(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker11;;
                    altMarker11 = builder.mark();
                    if (this.postcircumfix_149_alt_8(builder)) {
                        altMarker11.drop();
                    } else {
                        altMarker11.rollbackTo();
                        PsiBuilder.Marker altMarker7;;
                        altMarker7 = builder.mark();
                        if (this.postcircumfix_149_alt_5(builder)) {
                            altMarker7.drop();
                        } else {
                            altMarker7.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.postcircumfix_149_alt_2(builder)) {
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

    private boolean ident_150_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_150_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_150_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_150(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_150_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_150_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_150_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean bogus_statement_151(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_152_quant_1(PsiBuilder builder) {
        if (!(this.trait_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_152(PsiBuilder builder) {
        if (!(this.variable_75(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.variable_declarator_152_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean backslash_153_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BACKSLASH_BAD) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_153_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_153(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.backslash_153_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.backslash_153_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean separator_154_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean separator_154(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.separator_154_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX_SEPARATOR);
        return true;
    }

    private boolean rxstopper_155(PsiBuilder builder) {
        if (!(this.stopper_146(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_156_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_156_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_156_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_156_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.charspec_156_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_156_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_156_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.charspec_156_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_156_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_156_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_156_alt_6(PsiBuilder builder) {
        if (!(this.charnames_80(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_156(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_156_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_156_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_156_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean integer_lex_157_alt_1(PsiBuilder builder) {
        if (!(this.decint_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_alt_2(PsiBuilder builder) {
        if (!(this.decint_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_157_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_157_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_157_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_157_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_171(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_157_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_157_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_157_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_157_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_157_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_157_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_157_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_157_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_157_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_157_alt_2(builder)) {
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

    private boolean integer_lex_157(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_157_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_157_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_DOC_158_quant_1(PsiBuilder builder) {
        if (!(this.statement_prefix_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_DOC_158(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PHASER) && (tt1.equals("DOC"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_prefix_DOC_158_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean statement_control_CATCH_159_quant_1(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_159(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CATCH"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CATCH_159_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CATCH_STATEMENT);
        return true;
    }

    private boolean statement_control_unless_160_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_unless_160(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("unless"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_unless_160_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNLESS_STATEMENT);
        return true;
    }

    private boolean quote_Q_161(PsiBuilder builder) {
        if (!(this.quote_nibbler_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_162_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_162_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_103(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_162_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_162(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_162_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_162_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_162_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_162_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_162(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_162_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_163_quant_1(PsiBuilder builder) {
        if (!(this.comment_118(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_163_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_163_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_163_alt_3(PsiBuilder builder) {
        if (!(this.comment_118(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_163(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_163_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_163_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_164_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_164_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_164_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.infixstopper_164_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixstopper_164_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_164_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_164(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.infixstopper_164_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.infixstopper_164_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_name_165_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_165_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_165_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_193(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_165_alt_3(PsiBuilder builder) {
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

    private boolean term_name_165(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_165_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_165_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_mod_loop_166_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_166(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_LOOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_loop_166_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_LOOP);
        return true;
    }

    private boolean statement_control_import_167_quant_1(PsiBuilder builder) {
        if (!(this.spacey_78(builder))) {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_167_quant_2(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_import_167_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_167(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("import"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_import_167_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IMPORT_STATEMENT);
        return true;
    }

    private boolean metachar_168_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_quant_2(PsiBuilder builder) {
        if (!(this.quantified_atom_45(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.metachar_168_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean metachar_168_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.metachar_168_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_GOAL);
        return true;
    }

    private boolean metachar_168_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) && (tt2.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statement_97(builder))) {
            return false;
        }
        if (!(this.eat_terminator_194(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_5(PsiBuilder builder) {
        if (!(this.rxcodeblock_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_6(PsiBuilder builder) {
        if (!(this.rxqq_50(builder))) {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_7(PsiBuilder builder) {
        if (!(this.rxq_147(builder))) {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt3.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_65(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.metachar_168_quant_8(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.REGEX_ASSERTION);
        return true;
    }

    private boolean metachar_168_alt_10(PsiBuilder builder) {
        if (!(this.rxqw_186(builder))) {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_11(PsiBuilder builder) {
        if (!(this.backslash_153(builder))) {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_quant_12(PsiBuilder builder) {
        if (!(this.regex_nibbler_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_quant_13(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_14(PsiBuilder builder) {
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
        if (this.metachar_168_quant_12(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.metachar_168_quant_13(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker14.done(Perl6ElementTypes.REGEX_CAPTURE_POSITIONAL);
        return true;
    }

    private boolean metachar_168_quant_15(PsiBuilder builder) {
        if (!(this.regex_nibbler_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_quant_16(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_17(PsiBuilder builder) {
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
        if (this.metachar_168_quant_15(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.metachar_168_quant_16(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.REGEX_GROUP);
        return true;
    }

    private boolean metachar_168_alt_18(PsiBuilder builder) {
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

    private boolean metachar_168_alt_19(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt10.equals(")>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_20(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt11.equals("<("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_21(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt12.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_22(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt13.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_23(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt14.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_24(PsiBuilder builder) {
        String tt15;
        tt15 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt15.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_25(PsiBuilder builder) {
        String tt16;
        tt16 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt16.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_26(PsiBuilder builder) {
        String tt17;
        tt17 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt17.equals("$$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_27(PsiBuilder builder) {
        String tt18;
        tt18 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt18.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_28(PsiBuilder builder) {
        String tt19;
        tt19 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt19.equals("^^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_168_alt_29(PsiBuilder builder) {
        PsiBuilder.Marker marker24;
        marker24 = builder.mark();
        PsiBuilder.Marker altMarker34;
        altMarker34 = builder.mark();
        if (this.metachar_168_alt_28(builder)) {
            altMarker34.drop();
        } else {
            altMarker34.rollbackTo();
            PsiBuilder.Marker altMarker33;;
            altMarker33 = builder.mark();
            if (this.metachar_168_alt_27(builder)) {
                altMarker33.drop();
            } else {
                altMarker33.rollbackTo();
                PsiBuilder.Marker altMarker32;;
                altMarker32 = builder.mark();
                if (this.metachar_168_alt_26(builder)) {
                    altMarker32.drop();
                } else {
                    altMarker32.rollbackTo();
                    PsiBuilder.Marker altMarker31;;
                    altMarker31 = builder.mark();
                    if (this.metachar_168_alt_25(builder)) {
                        altMarker31.drop();
                    } else {
                        altMarker31.rollbackTo();
                        PsiBuilder.Marker altMarker30;;
                        altMarker30 = builder.mark();
                        if (this.metachar_168_alt_24(builder)) {
                            altMarker30.drop();
                        } else {
                            altMarker30.rollbackTo();
                            PsiBuilder.Marker altMarker29;;
                            altMarker29 = builder.mark();
                            if (this.metachar_168_alt_23(builder)) {
                                altMarker29.drop();
                            } else {
                                altMarker29.rollbackTo();
                                PsiBuilder.Marker altMarker28;;
                                altMarker28 = builder.mark();
                                if (this.metachar_168_alt_22(builder)) {
                                    altMarker28.drop();
                                } else {
                                    altMarker28.rollbackTo();
                                    PsiBuilder.Marker altMarker27;;
                                    altMarker27 = builder.mark();
                                    if (this.metachar_168_alt_21(builder)) {
                                        altMarker27.drop();
                                    } else {
                                        altMarker27.rollbackTo();
                                        PsiBuilder.Marker altMarker26;;
                                        altMarker26 = builder.mark();
                                        if (this.metachar_168_alt_20(builder)) {
                                            altMarker26.drop();
                                        } else {
                                            altMarker26.rollbackTo();
                                            PsiBuilder.Marker altMarker25;;
                                            altMarker25 = builder.mark();
                                            if (this.metachar_168_alt_19(builder)) {
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

    private boolean metachar_168(PsiBuilder builder) {
        PsiBuilder.Marker altMarker35;
        altMarker35 = builder.mark();
        if (this.metachar_168_alt_29(builder)) {
            altMarker35.drop();
        } else {
            altMarker35.rollbackTo();
            PsiBuilder.Marker altMarker23;;
            altMarker23 = builder.mark();
            if (this.metachar_168_alt_18(builder)) {
                altMarker23.drop();
            } else {
                altMarker23.rollbackTo();
                PsiBuilder.Marker altMarker21;;
                altMarker21 = builder.mark();
                if (this.metachar_168_alt_17(builder)) {
                    altMarker21.drop();
                } else {
                    altMarker21.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.metachar_168_alt_14(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker13;;
                        altMarker13 = builder.mark();
                        if (this.metachar_168_alt_11(builder)) {
                            altMarker13.drop();
                        } else {
                            altMarker13.rollbackTo();
                            PsiBuilder.Marker altMarker12;;
                            altMarker12 = builder.mark();
                            if (this.metachar_168_alt_10(builder)) {
                                altMarker12.drop();
                            } else {
                                altMarker12.rollbackTo();
                                PsiBuilder.Marker altMarker11;;
                                altMarker11 = builder.mark();
                                if (this.metachar_168_alt_9(builder)) {
                                    altMarker11.drop();
                                } else {
                                    altMarker11.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.metachar_168_alt_7(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.metachar_168_alt_6(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.metachar_168_alt_5(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.metachar_168_alt_4(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.metachar_168_alt_3(builder)) {
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

    private boolean quote_qq_169(PsiBuilder builder) {
        if (!(this.quote_nibbler_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt1.equals("-"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt2.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.cclass_elem_170_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.cclass_elem_170_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_170_quant_4(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_9(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_10(PsiBuilder builder) {
        if (!(this.cclass_backslash_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_12(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_14(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_15(PsiBuilder builder) {
        if (!(this.cclass_backslash_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_16(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.cclass_elem_170_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.cclass_elem_170_alt_15(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.cclass_elem_170_alt_14(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_170_quant_17(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.cclass_elem_170_quant_11(builder)) {
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
        if (this.cclass_elem_170_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.cclass_elem_170_alt_12(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_170_quant_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_ATOM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.cclass_elem_170_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.cclass_elem_170_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.cclass_elem_170_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.cclass_elem_170_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean cclass_elem_170_quant_19(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170_alt_22(PsiBuilder builder) {
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
            if (this.cclass_elem_170_quant_18(builder)) {
                quantMarker19.drop();
            } else {
                quantMarker19.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.cclass_elem_170_quant_19(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.cclass_elem_170_alt_21(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.cclass_elem_170_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_170_quant_23(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_170(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.cclass_elem_170_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.cclass_elem_170_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.cclass_elem_170_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.cclass_elem_170_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.cclass_elem_170_alt_6(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.cclass_elem_170_alt_5(builder)) {
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
        if (this.cclass_elem_170_quant_23(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_CCLASS_ELEM);
        return true;
    }

    private boolean hexint_171_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_171_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_171_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_171_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_171_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_171_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexint_171_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_171_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_171(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.hexint_171_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_171_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean fatarrow_172_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean fatarrow_172(PsiBuilder builder) {
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
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.fatarrow_172_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FATARROW);
        return true;
    }

    private boolean statement_control_default_173_quant_1(PsiBuilder builder) {
        if (!(this.block_132(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_173(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("default"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_default_173_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.DEFAULT_STATEMENT);
        return true;
    }

    private boolean kok_174(PsiBuilder builder) {
        if (!(this.end_keyword_129(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean vnum_175_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_175_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_175_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.vnum_175_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.vnum_175_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean vnum_175(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.vnum_175_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.vnum_175_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean numish_176_alt_1(PsiBuilder builder) {
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

    private boolean numish_176_alt_2(PsiBuilder builder) {
        if (!(this.integer_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_176_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_102(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_176_alt_4(PsiBuilder builder) {
        if (!(this.rat_number_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_176_alt_5(PsiBuilder builder) {
        if (!(this.complex_number_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_176(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.numish_176_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.numish_176_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.numish_176_alt_3(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.numish_176_alt_2(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.numish_176_alt_1(builder)) {
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

    private boolean prefix_177(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_quant_2(PsiBuilder builder) {
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.circumfix_178_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_178_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.circumfix_178_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_178_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_quant_5(PsiBuilder builder) {
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.circumfix_178_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_178_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.circumfix_178_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_178_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_quant_8(PsiBuilder builder) {
        if (!(this.quote_qq_169(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.circumfix_178_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_178_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.circumfix_178_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_178_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        if (!(this.pblock_27(builder))) {
            return false;
        }
        marker13.done(Perl6ElementTypes.BLOCK_OR_HASH);
        return true;
    }

    private boolean circumfix_178_quant_11(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_alt_12(PsiBuilder builder) {
        PsiBuilder.Marker marker15;
        marker15 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt7.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.circumfix_178_quant_11(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker15.done(Perl6ElementTypes.ARRAY_COMPOSER);
        return true;
    }

    private boolean circumfix_178_quant_13(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt10.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_178_alt_14(PsiBuilder builder) {
        PsiBuilder.Marker marker18;
        marker18 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt9.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_26(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker19;
        quantMarker19 = builder.mark();
        if (this.circumfix_178_quant_13(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.PARENTHESIZED_EXPRESSION);
        return true;
    }

    private boolean circumfix_178(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.circumfix_178_alt_14(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.circumfix_178_alt_12(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.circumfix_178_alt_10(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.circumfix_178_alt_9(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.circumfix_178_alt_6(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker4;;
                            altMarker4 = builder.mark();
                            if (this.circumfix_178_alt_3(builder)) {
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
        return true;
    }

    private boolean quote_q_179(PsiBuilder builder) {
        if (!(this.quote_nibbler_162(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_gather_180(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("gather"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.blorst_52(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.GATHER);
        return true;
    }

    private boolean term_rand_181(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("rand"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.end_keyword_129(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean term_time_182(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("time"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_112(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean statement_control_whenever_183_quant_1(PsiBuilder builder) {
        if (!(this.xblock_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_whenever_183(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("whenever"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_whenever_183_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHENEVER_STATEMENT);
        return true;
    }

    private boolean terminator_184_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_184_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_184_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_184_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_184_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_184_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_184_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_184_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_184_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_184_alt_2(builder)) {
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
        if (!(this.kok_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_184_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_184(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_184_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_184_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_184_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_184_alt_1(builder)) {
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

    private boolean twigil_185(PsiBuilder builder) {
        return true;
    }

    private boolean rxqw_186_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqw_186(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_179(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqw_186_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean SIGOK_187_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean SIGOK_187(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.SIGOK_187_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean bare_rat_number_188(PsiBuilder builder) {
        if (!(this.signed_integer_104(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("/"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean semiarglist_189(PsiBuilder builder) {
        if (!(this.arglist_145(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_190_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_190(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_COND) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_174(builder))) {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_cond_190_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_COND);
        return true;
    }

    private boolean param_var_191_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postcircumfix_149(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.ARRAY_SHAPE);
        return true;
    }

    private boolean param_var_191_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.param_var_191_quant_1(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_VARIABLE);
        return true;
    }

    private boolean param_var_191_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_191_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.param_var_191_quant_3(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_191_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_191_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_85(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.param_var_191_quant_5(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_191(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.param_var_191_alt_6(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.param_var_191_alt_4(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.param_var_191_alt_2(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean signed_number_192(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.number_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_193_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NO_ARGS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_193_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_193_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_193_alt_4(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_189(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_193_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_193_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_193_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_189(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_193_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_193(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_193_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_193_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_193_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_193_alt_1(builder)) {
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

    private boolean eat_terminator_194_alt_1(PsiBuilder builder) {
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_194_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_194_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_194_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.eat_terminator_194_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.eat_terminator_194_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.eat_terminator_194_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean eat_terminator_194(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.eat_terminator_194_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean morename_195_quant_1(PsiBuilder builder) {
        if (!(this.identifier_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_195(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_195_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean blockoid_196_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_196(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_106(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.blockoid_196_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.BLOCK);
        return true;
    }

    private boolean number_197(PsiBuilder builder) {
        if (!(this.numish_176(builder))) {
            return false;
        }
        return true;
    }

    private boolean enter_regex_nibblier_198(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.regex_nibbler_22(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX);
        return true;
    }

    private boolean defterm_199(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM_DEFINITION);
        return true;
    }

    private boolean ws_200_alt_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_200_alt_2(PsiBuilder builder) {
        if (!(this.unv_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_200_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_200_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_200_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_200_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_200_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_200(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_200_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean colonpair_201_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.coloncircumfix_67(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_quant_2(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR_HAS_VALUE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.colonpair_201_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.coloncircumfix_67(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt2.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.colonpair_201_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_201_alt_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt3.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.colonpair_variable_121(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt4.equals(":("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        if (!(this.signature_85(builder))) {
            return false;
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.colonpair_201_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_201_alt_8(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt6.equals(":!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_201_alt_9(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt7.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.INTEGER_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_201(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.colonpair_201_alt_9(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.colonpair_201_alt_8(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.colonpair_201_alt_7(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.colonpair_201_alt_5(builder)) {
                        altMarker6.drop();
                    } else {
                        altMarker6.rollbackTo();
                        PsiBuilder.Marker altMarker5;;
                        altMarker5 = builder.mark();
                        if (this.colonpair_201_alt_4(builder)) {
                            altMarker5.drop();
                        } else {
                            altMarker5.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.colonpair_201_alt_1(builder)) {
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
        marker1.done(Perl6ElementTypes.COLON_PAIR);
        return true;
    }

    private boolean statement_control_use_202_quant_1(PsiBuilder builder) {
        if (!(this.spacey_78(builder))) {
            return false;
        }
        if (!(this.arglist_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_202_alt_2(PsiBuilder builder) {
        if (!(this.module_name_14(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_use_202_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_use_202_alt_3(PsiBuilder builder) {
        if (!(this.version_44(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_202_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_use_202_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_use_202_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_use_202(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_use_202_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.ws_200(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
