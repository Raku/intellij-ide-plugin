package edument.perl6idea.parsing;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;

public class Perl6Parser implements PsiParser {

    public ASTNode parse(IElementType root, PsiBuilder builder) {
        PsiBuilder.Marker rootMarker;
        rootMarker = builder.mark();
        this.TOP_44(builder);
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
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
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
        if (!(this.unv_169(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_2_alt_3(PsiBuilder builder) {
        if (!(this.vws_57(builder))) {
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
        if (!(this.xblock_149(builder))) {
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
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_if_3_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_3_quant_7(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
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
        if (!(this.ws_206(builder))) {
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
        if (!(this.xblock_149(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
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
        if (!(this.ws_206(builder))) {
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
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
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
        if (!(this.xblock_149(builder))) {
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
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
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
        if (!(this.dottyop_98(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean normspace_6(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean bare_complex_number_7(PsiBuilder builder) {
        if (!(this.signed_number_198(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signed_number_198(builder))) {
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
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER);
        return true;
    }

    private boolean param_term_9_quant_1(PsiBuilder builder) {
        if (!(this.defterm_205(builder))) {
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
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10_quant_2(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_def_10_quant_4(PsiBuilder builder) {
        if (!(this.statementlist_109(builder))) {
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
        if (!(this.ws_206(builder))) {
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
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_10(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
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
        if (!(this.rxtermish_61(builder))) {
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
        if (!(this.ws_206(builder))) {
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
        if (!(this.rxtermish_61(builder))) {
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

    private boolean radint_12(PsiBuilder builder) {
        if (!(this.integer_lex_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_13_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_13_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_13_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.method_def_13_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean method_def_13_quant_4(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_13_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean method_def_13_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_13_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_102(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_13(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.method_def_13_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.method_def_13_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.method_def_13_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.method_def_13_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.method_def_13_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.method_def_13_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean EXPR_14_alt_1(PsiBuilder builder) {
        if (!(this.termish_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_quant_2(PsiBuilder builder) {
        if (!(this.prefixish_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_quant_3(PsiBuilder builder) {
        if (!(this.termish_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.EXPR_14_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_14_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.EXPR_14_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_14_quant_5(PsiBuilder builder) {
        if (!(this.postfixish_123(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_alt_6(PsiBuilder builder) {
        if (!(this.termish_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_quant_7(PsiBuilder builder) {
        if (!(this.prefixish_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_quant_8(PsiBuilder builder) {
        if (!(this.termish_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.EXPR_14_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.EXPR_14_quant_7(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.EXPR_14_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_14_quant_10(PsiBuilder builder) {
        if (!(this.postfixish_123(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_14_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.EXPR_14_alt_9(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.EXPR_14_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker13;;
            quantMarker13 = builder.mark();
            if (this.EXPR_14_quant_10(builder)) {
                quantMarker13.drop();
            } else {
                quantMarker13.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_14_quant_12(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if (!(this.infixish_132(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.EXPR_14_quant_11(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_14(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.EXPR_14_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.EXPR_14_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_14_quant_5(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker15;;
            quantMarker15 = builder.mark();
            if (this.EXPR_14_quant_12(builder)) {
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

    private boolean module_name_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ENDSTMT_16_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_16_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_16_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ENDSTMT_16_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ENDSTMT_16_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean ENDSTMT_16(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.ENDSTMT_16_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean sigil_17(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_18_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_18_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_18_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_18(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.rxinfixstopper_18_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.rxinfixstopper_18_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.rxinfixstopper_18_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean term_ident_19_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_19(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_19_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_199(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean integer_20(PsiBuilder builder) {
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

    private boolean complex_number_21(PsiBuilder builder) {
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

    private boolean statement_prefix_once_22(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("once"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONCE);
        return true;
    }

    private boolean regex_nibbler_23_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt2.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt3.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt4.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_nibbler_23_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_nibbler_23_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_nibbler_23_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.regex_nibbler_23_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23_quant_6(PsiBuilder builder) {
        if (!(this.termseq_85(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_23(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.regex_nibbler_23_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.regex_nibbler_23_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean privop_24_quant_1(PsiBuilder builder) {
        if (!(this.methodop_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean privop_24(PsiBuilder builder) {
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
        if (this.privop_24_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean statement_prefix_lazy_25(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("lazy"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.LAZY);
        return true;
    }

    private boolean name_26_quant_1(PsiBuilder builder) {
        if (!(this.morename_201(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_26_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.name_26_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
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
        if (!(this.morename_201(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_26_alt_4(PsiBuilder builder) {
        if (!(this.identifier_125(builder))) {
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

    private boolean semilist_27_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.statement_100(builder))) {
            return false;
        }
        if (!(this.eat_terminator_200(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean semilist_27_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.semilist_27_quant_1(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean semilist_27_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SEMI_LIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean semilist_27(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.semilist_27_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.semilist_27_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SEMI_LIST);
        return true;
    }

    private boolean pblock_28_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLOCK) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean pblock_28_alt_2(PsiBuilder builder) {
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_28_quant_3(PsiBuilder builder) {
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_28_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.LAMBDA) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.signature_88(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.pblock_28_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.POINTY_BLOCK);
        return true;
    }

    private boolean pblock_28(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.pblock_28_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.pblock_28_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.pblock_28_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean scope_declarator_29_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_SCOPED_DECLARATION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29_alt_2(PsiBuilder builder) {
        if (!(this.multi_declarator_101(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29_quant_3(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29_quant_4(PsiBuilder builder) {
        if (!(this.multi_declarator_101(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.scope_declarator_29_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.scope_declarator_29_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.scope_declarator_29_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean scope_declarator_29_alt_6(PsiBuilder builder) {
        if (!(this.package_declarator_103(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29_alt_7(PsiBuilder builder) {
        if (!(this.declarator_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_29(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.scope_declarator_29_alt_7(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.scope_declarator_29_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.scope_declarator_29_alt_5(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.scope_declarator_29_alt_2(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.scope_declarator_29_alt_1(builder)) {
                            altMarker2.drop();
                        } else {
                            altMarker2.rollbackTo();
                            return false;
                        }
                    }
                }
            }
        }
        marker1.done(Perl6ElementTypes.SCOPED_DECLARATION);
        return true;
    }

    private boolean default_value_30_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_30(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.default_value_30_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_DEFAULT);
        return true;
    }

    private boolean termconjseq_31_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconjseq_31_alt_2(PsiBuilder builder) {
        if (!(this.termalt_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconjseq_31_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconjseq_31_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconjseq_31_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconjseq_31(PsiBuilder builder) {
        if (!(this.termalt_97(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconjseq_31_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_mod_cond_keyword_32_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_32_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_32_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_32_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_32_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_32(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_mod_cond_keyword_32_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_mod_cond_keyword_32_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_mod_cond_keyword_32_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.statement_mod_cond_keyword_32_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.statement_mod_cond_keyword_32_alt_1(builder)) {
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

    private boolean statement_control_without_33_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_33(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("without"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_without_33_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WITHOUT_STATEMENT);
        return true;
    }

    private boolean param_sep_34(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_SEPARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_35(PsiBuilder builder) {
        if (!(this.trait_mod_74(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxarglist_36(PsiBuilder builder) {
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_37_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt1.equals("!!!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_37_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt2.equals("???"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_37_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt3.equals("..."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_37_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt4.equals("\u2026"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_37(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_stub_code_37_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.term_stub_code_37_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.term_stub_code_37_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.term_stub_code_37_alt_1(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.args_199(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.STUB_CODE);
        return true;
    }

    private boolean statement_control_QUIT_38_quant_1(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_QUIT_38(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("QUIT"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_QUIT_38_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.QUIT_STATEMENT);
        return true;
    }

    private boolean rxcodeblock_39(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_40_alt_1(PsiBuilder builder) {
        if (!(this.metachar_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_40_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_LITERAL);
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_40(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.atom_40_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.atom_40_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean charname_41_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_41_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_41_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_41_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_41(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_41_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_41_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_42_alt_1(PsiBuilder builder) {
        if (!(this.capterm_67(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_2(PsiBuilder builder) {
        if (!(this.term_name_171(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_3(PsiBuilder builder) {
        if (!(this.term_type_const_108(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_4(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_5(PsiBuilder builder) {
        if (!(this.term_whatever_95(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_6(PsiBuilder builder) {
        if (!(this.term_rand_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_7(PsiBuilder builder) {
        if (!(this.term_empty_set_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_8(PsiBuilder builder) {
        if (!(this.term_time_188(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_9(PsiBuilder builder) {
        if (!(this.term_now_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_10(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_11(PsiBuilder builder) {
        if (!(this.dotty_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_12(PsiBuilder builder) {
        if (!(this.term_stub_code_37(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_13(PsiBuilder builder) {
        if (!(this.circumfix_184(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_14(PsiBuilder builder) {
        if (!(this.term_onlystar_119(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_15(PsiBuilder builder) {
        if (!(this.package_declarator_103(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_16(PsiBuilder builder) {
        if (!(this.statement_prefix_48(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_17(PsiBuilder builder) {
        if (!(this.type_declarator_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_18(PsiBuilder builder) {
        if (!(this.multi_declarator_101(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_19(PsiBuilder builder) {
        if (!(this.regex_declarator_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_20(PsiBuilder builder) {
        if (!(this.routine_declarator_93(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_21(PsiBuilder builder) {
        if (!(this.scope_declarator_29(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_22(PsiBuilder builder) {
        if (!(this.term_ident_19(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_23(PsiBuilder builder) {
        if (!(this.term_self_76(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_24(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_25(PsiBuilder builder) {
        if (!(this.colonpair_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_26(PsiBuilder builder) {
        if (!(this.fatarrow_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42_alt_27(PsiBuilder builder) {
        if (!(this.value_134(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_42(PsiBuilder builder) {
        PsiBuilder.Marker altMarker27;
        altMarker27 = builder.mark();
        if (this.term_42_alt_27(builder)) {
            altMarker27.drop();
        } else {
            altMarker27.rollbackTo();
            PsiBuilder.Marker altMarker26;;
            altMarker26 = builder.mark();
            if (this.term_42_alt_26(builder)) {
                altMarker26.drop();
            } else {
                altMarker26.rollbackTo();
                PsiBuilder.Marker altMarker25;;
                altMarker25 = builder.mark();
                if (this.term_42_alt_25(builder)) {
                    altMarker25.drop();
                } else {
                    altMarker25.rollbackTo();
                    PsiBuilder.Marker altMarker24;;
                    altMarker24 = builder.mark();
                    if (this.term_42_alt_24(builder)) {
                        altMarker24.drop();
                    } else {
                        altMarker24.rollbackTo();
                        PsiBuilder.Marker altMarker23;;
                        altMarker23 = builder.mark();
                        if (this.term_42_alt_23(builder)) {
                            altMarker23.drop();
                        } else {
                            altMarker23.rollbackTo();
                            PsiBuilder.Marker altMarker22;;
                            altMarker22 = builder.mark();
                            if (this.term_42_alt_22(builder)) {
                                altMarker22.drop();
                            } else {
                                altMarker22.rollbackTo();
                                PsiBuilder.Marker altMarker21;;
                                altMarker21 = builder.mark();
                                if (this.term_42_alt_21(builder)) {
                                    altMarker21.drop();
                                } else {
                                    altMarker21.rollbackTo();
                                    PsiBuilder.Marker altMarker20;;
                                    altMarker20 = builder.mark();
                                    if (this.term_42_alt_20(builder)) {
                                        altMarker20.drop();
                                    } else {
                                        altMarker20.rollbackTo();
                                        PsiBuilder.Marker altMarker19;;
                                        altMarker19 = builder.mark();
                                        if (this.term_42_alt_19(builder)) {
                                            altMarker19.drop();
                                        } else {
                                            altMarker19.rollbackTo();
                                            PsiBuilder.Marker altMarker18;;
                                            altMarker18 = builder.mark();
                                            if (this.term_42_alt_18(builder)) {
                                                altMarker18.drop();
                                            } else {
                                                altMarker18.rollbackTo();
                                                PsiBuilder.Marker altMarker17;;
                                                altMarker17 = builder.mark();
                                                if (this.term_42_alt_17(builder)) {
                                                    altMarker17.drop();
                                                } else {
                                                    altMarker17.rollbackTo();
                                                    PsiBuilder.Marker altMarker16;;
                                                    altMarker16 = builder.mark();
                                                    if (this.term_42_alt_16(builder)) {
                                                        altMarker16.drop();
                                                    } else {
                                                        altMarker16.rollbackTo();
                                                        PsiBuilder.Marker altMarker15;;
                                                        altMarker15 = builder.mark();
                                                        if (this.term_42_alt_15(builder)) {
                                                            altMarker15.drop();
                                                        } else {
                                                            altMarker15.rollbackTo();
                                                            PsiBuilder.Marker altMarker14;;
                                                            altMarker14 = builder.mark();
                                                            if (this.term_42_alt_14(builder)) {
                                                                altMarker14.drop();
                                                            } else {
                                                                altMarker14.rollbackTo();
                                                                PsiBuilder.Marker altMarker13;;
                                                                altMarker13 = builder.mark();
                                                                if (this.term_42_alt_13(builder)) {
                                                                    altMarker13.drop();
                                                                } else {
                                                                    altMarker13.rollbackTo();
                                                                    PsiBuilder.Marker altMarker12;;
                                                                    altMarker12 = builder.mark();
                                                                    if (this.term_42_alt_12(builder)) {
                                                                        altMarker12.drop();
                                                                    } else {
                                                                        altMarker12.rollbackTo();
                                                                        PsiBuilder.Marker altMarker11;;
                                                                        altMarker11 = builder.mark();
                                                                        if (this.term_42_alt_11(builder)) {
                                                                            altMarker11.drop();
                                                                        } else {
                                                                            altMarker11.rollbackTo();
                                                                            PsiBuilder.Marker altMarker10;;
                                                                            altMarker10 = builder.mark();
                                                                            if (this.term_42_alt_10(builder)) {
                                                                                altMarker10.drop();
                                                                            } else {
                                                                                altMarker10.rollbackTo();
                                                                                PsiBuilder.Marker altMarker9;;
                                                                                altMarker9 = builder.mark();
                                                                                if (this.term_42_alt_9(builder)) {
                                                                                    altMarker9.drop();
                                                                                } else {
                                                                                    altMarker9.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker8;;
                                                                                    altMarker8 = builder.mark();
                                                                                    if (this.term_42_alt_8(builder)) {
                                                                                        altMarker8.drop();
                                                                                    } else {
                                                                                        altMarker8.rollbackTo();
                                                                                        PsiBuilder.Marker altMarker7;;
                                                                                        altMarker7 = builder.mark();
                                                                                        if (this.term_42_alt_7(builder)) {
                                                                                            altMarker7.drop();
                                                                                        } else {
                                                                                            altMarker7.rollbackTo();
                                                                                            PsiBuilder.Marker altMarker6;;
                                                                                            altMarker6 = builder.mark();
                                                                                            if (this.term_42_alt_6(builder)) {
                                                                                                altMarker6.drop();
                                                                                            } else {
                                                                                                altMarker6.rollbackTo();
                                                                                                PsiBuilder.Marker altMarker5;;
                                                                                                altMarker5 = builder.mark();
                                                                                                if (this.term_42_alt_5(builder)) {
                                                                                                    altMarker5.drop();
                                                                                                } else {
                                                                                                    altMarker5.rollbackTo();
                                                                                                    PsiBuilder.Marker altMarker4;;
                                                                                                    altMarker4 = builder.mark();
                                                                                                    if (this.term_42_alt_4(builder)) {
                                                                                                        altMarker4.drop();
                                                                                                    } else {
                                                                                                        altMarker4.rollbackTo();
                                                                                                        PsiBuilder.Marker altMarker3;;
                                                                                                        altMarker3 = builder.mark();
                                                                                                        if (this.term_42_alt_3(builder)) {
                                                                                                            altMarker3.drop();
                                                                                                        } else {
                                                                                                            altMarker3.rollbackTo();
                                                                                                            PsiBuilder.Marker altMarker2;;
                                                                                                            altMarker2 = builder.mark();
                                                                                                            if (this.term_42_alt_2(builder)) {
                                                                                                                altMarker2.drop();
                                                                                                            } else {
                                                                                                                altMarker2.rollbackTo();
                                                                                                                PsiBuilder.Marker altMarker1;;
                                                                                                                altMarker1 = builder.mark();
                                                                                                                if (this.term_42_alt_1(builder)) {
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
        }
        return true;
    }

    private boolean statement_prefix_quietly_43(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("quietly"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.QUIETLY);
        return true;
    }

    private boolean TOP_44_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_110(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_44_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_44(PsiBuilder builder) {
        if (!(this.statementlist_109(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_44_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_44_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rad_number_45_quant_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_quant_2(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.rad_number_45_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_45_quant_4(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.rad_number_45_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_45_alt_6(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt7.equals("0b"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_7(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt8.equals("0d"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_8(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt9.equals("0o"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_9(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt10.equals("0x"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_quant_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.rad_number_45_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.rad_number_45_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.rad_number_45_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.rad_number_45_alt_6(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean rad_number_45_quant_11(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt11.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_45_alt_12(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt6.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.rad_number_45_quant_10(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.rad_number_45_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_45(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rad_number_45_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.rad_number_45_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.rad_number_45_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.rad_number_45_alt_3(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.RADIX_NUMBER);
        return true;
    }

    private boolean version_46(PsiBuilder builder) {
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

    private boolean quantified_atom_47_quant_1(PsiBuilder builder) {
        if (!(this.sigmaybe_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_47_alt_2(PsiBuilder builder) {
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

    private boolean quantified_atom_47_alt_3(PsiBuilder builder) {
        if (!(this.quantifier_154(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_47_quant_4(PsiBuilder builder) {
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        if (!(this.sigmaybe_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_47_quant_5(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if (!(this.separator_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_47_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.quantified_atom_47_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.quantified_atom_47_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quantified_atom_47_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.quantified_atom_47_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean quantified_atom_47(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.atom_40(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quantified_atom_47_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantified_atom_47_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_ATOM);
        return true;
    }

    private boolean statement_prefix_48_alt_1(PsiBuilder builder) {
        if (!(this.statement_prefix_do_118(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_2(PsiBuilder builder) {
        if (!(this.statement_prefix_react_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_3(PsiBuilder builder) {
        if (!(this.statement_prefix_supply_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_4(PsiBuilder builder) {
        if (!(this.statement_prefix_start_142(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_5(PsiBuilder builder) {
        if (!(this.statement_prefix_once_22(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_6(PsiBuilder builder) {
        if (!(this.statement_prefix_gather_186(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_quietly_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_try_136(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_9(PsiBuilder builder) {
        if (!(this.statement_prefix_sink_59(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_10(PsiBuilder builder) {
        if (!(this.statement_prefix_eager_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_11(PsiBuilder builder) {
        if (!(this.statement_prefix_lazy_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_12(PsiBuilder builder) {
        if (!(this.statement_prefix_hyper_8(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_13(PsiBuilder builder) {
        if (!(this.statement_prefix_race_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_14(PsiBuilder builder) {
        if (!(this.statement_prefix_phaser_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48_alt_15(PsiBuilder builder) {
        if (!(this.statement_prefix_DOC_164(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_48(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.statement_prefix_48_alt_15(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.statement_prefix_48_alt_14(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                PsiBuilder.Marker altMarker13;;
                altMarker13 = builder.mark();
                if (this.statement_prefix_48_alt_13(builder)) {
                    altMarker13.drop();
                } else {
                    altMarker13.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.statement_prefix_48_alt_12(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.statement_prefix_48_alt_11(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker10;;
                            altMarker10 = builder.mark();
                            if (this.statement_prefix_48_alt_10(builder)) {
                                altMarker10.drop();
                            } else {
                                altMarker10.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.statement_prefix_48_alt_9(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.statement_prefix_48_alt_8(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.statement_prefix_48_alt_7(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.statement_prefix_48_alt_6(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.statement_prefix_48_alt_5(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.statement_prefix_48_alt_4(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
                                                        PsiBuilder.Marker altMarker3;;
                                                        altMarker3 = builder.mark();
                                                        if (this.statement_prefix_48_alt_3(builder)) {
                                                            altMarker3.drop();
                                                        } else {
                                                            altMarker3.rollbackTo();
                                                            PsiBuilder.Marker altMarker2;;
                                                            altMarker2 = builder.mark();
                                                            if (this.statement_prefix_48_alt_2(builder)) {
                                                                altMarker2.drop();
                                                            } else {
                                                                altMarker2.rollbackTo();
                                                                PsiBuilder.Marker altMarker1;;
                                                                altMarker1 = builder.mark();
                                                                if (this.statement_prefix_48_alt_1(builder)) {
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

    private boolean phaser_name_49_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_11(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_14(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_15(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49_alt_16(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_49(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.phaser_name_49_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.phaser_name_49_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.phaser_name_49_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.phaser_name_49_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.phaser_name_49_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.phaser_name_49_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.phaser_name_49_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.phaser_name_49_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.phaser_name_49_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.phaser_name_49_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.phaser_name_49_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.phaser_name_49_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.phaser_name_49_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.phaser_name_49_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.phaser_name_49_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.phaser_name_49_alt_1(builder)) {
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

    private boolean sign_50_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_50_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_50_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_50_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_50(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_50_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_50_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_50_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_50_alt_1(builder)) {
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

    private boolean apostrophe_51(PsiBuilder builder) {
        return true;
    }

    private boolean type_declarator_52_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ENUM_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_alt_2(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_quant_4(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_alt_5(PsiBuilder builder) {
        if (!(this.term_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ENUM_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.type_declarator_52_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.type_declarator_52_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.type_declarator_52_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.type_declarator_52_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.type_declarator_52_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.type_declarator_52_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_52(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_DECLARATOR) && (tt1.equals("enum"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.type_declarator_52_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.ENUM);
        return true;
    }

    private boolean rxqq_53_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_53_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqq_53_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_53_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_53_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxqq_53_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_53_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_53_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxqq_53_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_53_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_53_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxqq_53_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_53(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxqq_53_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxqq_53_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxqq_53_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxqq_53_alt_2(builder)) {
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

    private boolean octint_54_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_54_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.octint_54_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_54_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_54(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octint_54_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_54_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean blorst_55_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLORST) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blorst_55_alt_2(PsiBuilder builder) {
        if (!(this.statement_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_55_alt_3(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_55(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.blorst_55_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.blorst_55_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.blorst_55_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_prefix_phaser_56(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PHASER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean vws_57(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean declarator_58_alt_1(PsiBuilder builder) {
        if (!(this.type_declarator_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_alt_2(PsiBuilder builder) {
        if (!(this.regex_declarator_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_alt_3(PsiBuilder builder) {
        if (!(this.routine_declarator_93(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_quant_4(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_quant_5(PsiBuilder builder) {
        if (!(this.initializer_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.declarator_58_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.declarator_58_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean declarator_58_alt_7(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        if (!(this.signature_88(builder))) {
            return false;
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.declarator_58_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_58_quant_8(PsiBuilder builder) {
        if (!(this.initializer_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker10;
        marker10 = builder.mark();
        if (!(this.variable_declarator_158(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.declarator_58_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker10.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_58_quant_10(PsiBuilder builder) {
        if (!(this.initializer_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_58_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM_DECLARATION_BACKSLASH) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.defterm_205(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.declarator_58_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker13.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_58(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.declarator_58_alt_11(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.declarator_58_alt_9(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.declarator_58_alt_7(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.declarator_58_alt_3(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.declarator_58_alt_2(builder)) {
                            altMarker2.drop();
                        } else {
                            altMarker2.rollbackTo();
                            PsiBuilder.Marker altMarker1;;
                            altMarker1 = builder.mark();
                            if (this.declarator_58_alt_1(builder)) {
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

    private boolean statement_prefix_sink_59(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("sink"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SINK);
        return true;
    }

    private boolean backmod_60_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_60_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_60_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_60_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_60(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.backmod_60_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.backmod_60_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.backmod_60_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.backmod_60_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rxtermish_61_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxtermish_61(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.rxtermish_61_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean termaltseq_62_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termaltseq_62_alt_2(PsiBuilder builder) {
        if (!(this.termconjseq_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean termaltseq_62_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termaltseq_62_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termaltseq_62_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termaltseq_62(PsiBuilder builder) {
        if (!(this.termconjseq_31(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termaltseq_62_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_CONTROL_63_quant_1(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CONTROL_63(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CONTROL"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CONTROL_63_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CONTROL_STATEMENT);
        return true;
    }

    private boolean statement_control_given_64_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_given_64(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("given"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_given_64_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.GIVEN_STATEMENT);
        return true;
    }

    private boolean statement_control_loop_65_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_2(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_3(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt4.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_control_loop_65_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt3.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_loop_65_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_loop_65_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_7(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_loop_65_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_loop_65_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_control_loop_65_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65_quant_8(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_65(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("loop"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_loop_65_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_loop_65_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.LOOP_STATEMENT);
        return true;
    }

    private boolean statement_control_for_66_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_for_66(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("for"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_for_66_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FOR_STATEMENT);
        return true;
    }

    private boolean capterm_67_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_INVALID) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_67_alt_2(PsiBuilder builder) {
        if (!(this.termish_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean capterm_67_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_67_alt_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.capterm_67_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean capterm_67(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.capterm_67_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.capterm_67_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.capterm_67_alt_1(builder)) {
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

    private boolean assertion_68_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_ASSERTION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_2(PsiBuilder builder) {
        if (!(this.cclass_elem_176(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.assertion_68_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.assertion_68_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker2.done(Perl6ElementTypes.REGEX_CCLASS);
        return true;
    }

    private boolean assertion_68_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.assertion_68_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.assertion_68_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.assertion_68_alt_4(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean assertion_68_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.assertion_68_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean assertion_68_alt_9(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_11(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_36(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.assertion_68_quant_10(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean assertion_68_alt_12(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt4.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_13(PsiBuilder builder) {
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.assertion_68_alt_12(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.assertion_68_alt_11(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean assertion_68_alt_14(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.assertion_68_quant_13(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        return true;
    }

    private boolean assertion_68_alt_15(PsiBuilder builder) {
        if (!(this.rxcodeblock_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_17(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_19(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        if (!(this.regex_nibbler_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_36(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.assertion_68_quant_20(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        return true;
    }

    private boolean assertion_68_alt_22(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt7.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_23(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt8.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_24(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_quant_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.assertion_68_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker25;;
            altMarker25 = builder.mark();
            if (this.assertion_68_alt_23(builder)) {
                altMarker25.drop();
            } else {
                altMarker25.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.assertion_68_alt_22(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker23;;
                    altMarker23 = builder.mark();
                    if (this.assertion_68_alt_21(builder)) {
                        altMarker23.drop();
                    } else {
                        altMarker23.rollbackTo();
                        PsiBuilder.Marker altMarker21;;
                        altMarker21 = builder.mark();
                        if (this.assertion_68_alt_19(builder)) {
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

    private boolean assertion_68_alt_26(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.assertion_68_alt_18(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.assertion_68_alt_17(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker27;
        quantMarker27 = builder.mark();
        if (this.assertion_68_quant_25(builder)) {
            quantMarker27.drop();
        } else {
            quantMarker27.rollbackTo();
        }
        return true;
    }

    private boolean assertion_68_alt_27(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt9.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_28(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt10.equals("?"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_29(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt11.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_30(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68_alt_31(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_68(PsiBuilder builder) {
        PsiBuilder.Marker altMarker33;
        altMarker33 = builder.mark();
        if (this.assertion_68_alt_31(builder)) {
            altMarker33.drop();
        } else {
            altMarker33.rollbackTo();
            PsiBuilder.Marker altMarker32;;
            altMarker32 = builder.mark();
            if (this.assertion_68_alt_30(builder)) {
                altMarker32.drop();
            } else {
                altMarker32.rollbackTo();
                PsiBuilder.Marker altMarker31;;
                altMarker31 = builder.mark();
                if (this.assertion_68_alt_29(builder)) {
                    altMarker31.drop();
                } else {
                    altMarker31.rollbackTo();
                    PsiBuilder.Marker altMarker30;;
                    altMarker30 = builder.mark();
                    if (this.assertion_68_alt_28(builder)) {
                        altMarker30.drop();
                    } else {
                        altMarker30.rollbackTo();
                        PsiBuilder.Marker altMarker29;;
                        altMarker29 = builder.mark();
                        if (this.assertion_68_alt_27(builder)) {
                            altMarker29.drop();
                        } else {
                            altMarker29.rollbackTo();
                            PsiBuilder.Marker altMarker28;;
                            altMarker28 = builder.mark();
                            if (this.assertion_68_alt_26(builder)) {
                                altMarker28.drop();
                            } else {
                                altMarker28.rollbackTo();
                                PsiBuilder.Marker altMarker18;;
                                altMarker18 = builder.mark();
                                if (this.assertion_68_alt_16(builder)) {
                                    altMarker18.drop();
                                } else {
                                    altMarker18.rollbackTo();
                                    PsiBuilder.Marker altMarker17;;
                                    altMarker17 = builder.mark();
                                    if (this.assertion_68_alt_15(builder)) {
                                        altMarker17.drop();
                                    } else {
                                        altMarker17.rollbackTo();
                                        PsiBuilder.Marker altMarker16;;
                                        altMarker16 = builder.mark();
                                        if (this.assertion_68_alt_14(builder)) {
                                            altMarker16.drop();
                                        } else {
                                            altMarker16.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.assertion_68_alt_9(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.assertion_68_alt_8(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.assertion_68_alt_3(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker1;;
                                                        altMarker1 = builder.mark();
                                                        if (this.assertion_68_alt_1(builder)) {
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

    private boolean infix_69(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean coloncircumfix_70(PsiBuilder builder) {
        if (!(this.circumfix_184(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_supply_71(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("supply"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUPPLY);
        return true;
    }

    private boolean statement_prefix_race_72(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("race"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.RACE);
        return true;
    }

    private boolean lambda_73_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_73_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_73(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.lambda_73_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.lambda_73_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_2(PsiBuilder builder) {
        if (!(this.term_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt1.equals("handles"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.trait_mod_74_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.trait_mod_74_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_5(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt2.equals("returns"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.trait_mod_74_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.trait_mod_74_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_8(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt3.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.trait_mod_74_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.trait_mod_74_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_12(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.trait_mod_74_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.trait_mod_74_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_14(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt4.equals("will"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.trait_mod_74_alt_13(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.trait_mod_74_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_16(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_17(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt5.equals("does"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.trait_mod_74_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.trait_mod_74_alt_15(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_19(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt6.equals("hides"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.trait_mod_74_alt_19(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.trait_mod_74_alt_18(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74_alt_21(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_22(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_74_alt_23(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt7.equals("is"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.trait_mod_74_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.trait_mod_74_alt_21(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_74(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker24;
        altMarker24 = builder.mark();
        if (this.trait_mod_74_alt_23(builder)) {
            altMarker24.drop();
        } else {
            altMarker24.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.trait_mod_74_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.trait_mod_74_alt_17(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.trait_mod_74_alt_14(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        PsiBuilder.Marker altMarker10;;
                        altMarker10 = builder.mark();
                        if (this.trait_mod_74_alt_9(builder)) {
                            altMarker10.drop();
                        } else {
                            altMarker10.rollbackTo();
                            PsiBuilder.Marker altMarker7;;
                            altMarker7 = builder.mark();
                            if (this.trait_mod_74_alt_6(builder)) {
                                altMarker7.drop();
                            } else {
                                altMarker7.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.trait_mod_74_alt_3(builder)) {
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

    private boolean rat_number_75(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.bare_rat_number_194(builder))) {
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

    private boolean term_self_76(PsiBuilder builder) {
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

    private boolean stdstopper_77_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_77_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_77(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_77_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_77_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_78_alt_1(PsiBuilder builder) {
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

    private boolean variable_78_alt_2(PsiBuilder builder) {
        if (!(this.contextualizer_147(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_78_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker4.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_78_quant_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) && (tt1.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_78_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE_REGEX_NAMED_CAPTURE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker marker6;
        marker6 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.variable_78_quant_4(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker6.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_78_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker9.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_78_alt_7(PsiBuilder builder) {
        PsiBuilder.Marker marker11;
        marker11 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker11.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_78_alt_8(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_78_alt_9(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_78_quant_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.variable_78_alt_9(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.variable_78_alt_8(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_78_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.variable_78_quant_10(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        if (!(this.postcircumfix_155(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_78_alt_12(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SELF) {
            builder.advanceLexer();
        } else {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt2.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.variable_78_quant_11(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        marker13.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean variable_78_quant_13(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_78_quant_14(PsiBuilder builder) {
        if (!(this.infixish_132(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.variable_78_quant_13(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        return true;
    }

    private boolean variable_78_alt_15(PsiBuilder builder) {
        PsiBuilder.Marker marker19;
        marker19 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) && (tt4.equals("&["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker21;
        quantMarker21 = builder.mark();
        if (this.variable_78_quant_14(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        marker19.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_78(PsiBuilder builder) {
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.variable_78_alt_15(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker18;;
            altMarker18 = builder.mark();
            if (this.variable_78_alt_12(builder)) {
                altMarker18.drop();
            } else {
                altMarker18.rollbackTo();
                PsiBuilder.Marker altMarker12;;
                altMarker12 = builder.mark();
                if (this.variable_78_alt_7(builder)) {
                    altMarker12.drop();
                } else {
                    altMarker12.rollbackTo();
                    PsiBuilder.Marker altMarker10;;
                    altMarker10 = builder.mark();
                    if (this.variable_78_alt_6(builder)) {
                        altMarker10.drop();
                    } else {
                        altMarker10.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.variable_78_alt_5(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.variable_78_alt_3(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker3;;
                                altMarker3 = builder.mark();
                                if (this.variable_78_alt_2(builder)) {
                                    altMarker3.drop();
                                } else {
                                    altMarker3.rollbackTo();
                                    PsiBuilder.Marker altMarker2;;
                                    altMarker2 = builder.mark();
                                    if (this.variable_78_alt_1(builder)) {
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
        return true;
    }

    private boolean term_hyperwhatever_79(PsiBuilder builder) {
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

    private boolean statement_control_when_80_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_when_80(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("when"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_when_80_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHEN_STATEMENT);
        return true;
    }

    private boolean spacey_81_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_81_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_81(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.spacey_81_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.spacey_81_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_82_alt_1(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_82_alt_2(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_82_alt_3(PsiBuilder builder) {
        if (!(this.named_param_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_82_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean named_param_82_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.named_param_82_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.named_param_82_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.named_param_82_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean named_param_82_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.named_param_82_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean named_param_82_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.named_param_82_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean named_param_82_quant_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.named_param_82_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.named_param_82_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_82(PsiBuilder builder) {
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
        if (this.named_param_82_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NAMED_PARAMETER);
        return true;
    }

    private boolean charnames_83_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_83_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_83_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_83_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_41(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_83_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_83(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.charnames_83_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_83_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_84_alt_1(PsiBuilder builder) {
        if (!(this.statement_control_QUIT_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_2(PsiBuilder builder) {
        if (!(this.statement_control_CONTROL_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_CATCH_165(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_default_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_5(PsiBuilder builder) {
        if (!(this.statement_control_when_80(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_6(PsiBuilder builder) {
        if (!(this.statement_control_given_64(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_7(PsiBuilder builder) {
        if (!(this.statement_control_require_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_use_208(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_9(PsiBuilder builder) {
        if (!(this.statement_control_no_114(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_10(PsiBuilder builder) {
        if (!(this.statement_control_import_173(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_11(PsiBuilder builder) {
        if (!(this.statement_control_need_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_12(PsiBuilder builder) {
        if (!(this.statement_control_loop_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_13(PsiBuilder builder) {
        if (!(this.statement_control_whenever_189(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_14(PsiBuilder builder) {
        if (!(this.statement_control_for_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_15(PsiBuilder builder) {
        if (!(this.statement_control_repeat_96(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_16(PsiBuilder builder) {
        if (!(this.statement_control_until_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_17(PsiBuilder builder) {
        if (!(this.statement_control_while_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_18(PsiBuilder builder) {
        if (!(this.statement_control_without_33(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_19(PsiBuilder builder) {
        if (!(this.statement_control_unless_166(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84_alt_20(PsiBuilder builder) {
        if (!(this.statement_control_if_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_84(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.statement_control_84_alt_20(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.statement_control_84_alt_19(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.statement_control_84_alt_18(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.statement_control_84_alt_17(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker16;;
                        altMarker16 = builder.mark();
                        if (this.statement_control_84_alt_16(builder)) {
                            altMarker16.drop();
                        } else {
                            altMarker16.rollbackTo();
                            PsiBuilder.Marker altMarker15;;
                            altMarker15 = builder.mark();
                            if (this.statement_control_84_alt_15(builder)) {
                                altMarker15.drop();
                            } else {
                                altMarker15.rollbackTo();
                                PsiBuilder.Marker altMarker14;;
                                altMarker14 = builder.mark();
                                if (this.statement_control_84_alt_14(builder)) {
                                    altMarker14.drop();
                                } else {
                                    altMarker14.rollbackTo();
                                    PsiBuilder.Marker altMarker13;;
                                    altMarker13 = builder.mark();
                                    if (this.statement_control_84_alt_13(builder)) {
                                        altMarker13.drop();
                                    } else {
                                        altMarker13.rollbackTo();
                                        PsiBuilder.Marker altMarker12;;
                                        altMarker12 = builder.mark();
                                        if (this.statement_control_84_alt_12(builder)) {
                                            altMarker12.drop();
                                        } else {
                                            altMarker12.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.statement_control_84_alt_11(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.statement_control_84_alt_10(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker9;;
                                                    altMarker9 = builder.mark();
                                                    if (this.statement_control_84_alt_9(builder)) {
                                                        altMarker9.drop();
                                                    } else {
                                                        altMarker9.rollbackTo();
                                                        PsiBuilder.Marker altMarker8;;
                                                        altMarker8 = builder.mark();
                                                        if (this.statement_control_84_alt_8(builder)) {
                                                            altMarker8.drop();
                                                        } else {
                                                            altMarker8.rollbackTo();
                                                            PsiBuilder.Marker altMarker7;;
                                                            altMarker7 = builder.mark();
                                                            if (this.statement_control_84_alt_7(builder)) {
                                                                altMarker7.drop();
                                                            } else {
                                                                altMarker7.rollbackTo();
                                                                PsiBuilder.Marker altMarker6;;
                                                                altMarker6 = builder.mark();
                                                                if (this.statement_control_84_alt_6(builder)) {
                                                                    altMarker6.drop();
                                                                } else {
                                                                    altMarker6.rollbackTo();
                                                                    PsiBuilder.Marker altMarker5;;
                                                                    altMarker5 = builder.mark();
                                                                    if (this.statement_control_84_alt_5(builder)) {
                                                                        altMarker5.drop();
                                                                    } else {
                                                                        altMarker5.rollbackTo();
                                                                        PsiBuilder.Marker altMarker4;;
                                                                        altMarker4 = builder.mark();
                                                                        if (this.statement_control_84_alt_4(builder)) {
                                                                            altMarker4.drop();
                                                                        } else {
                                                                            altMarker4.rollbackTo();
                                                                            PsiBuilder.Marker altMarker3;;
                                                                            altMarker3 = builder.mark();
                                                                            if (this.statement_control_84_alt_3(builder)) {
                                                                                altMarker3.drop();
                                                                            } else {
                                                                                altMarker3.rollbackTo();
                                                                                PsiBuilder.Marker altMarker2;;
                                                                                altMarker2 = builder.mark();
                                                                                if (this.statement_control_84_alt_2(builder)) {
                                                                                    altMarker2.drop();
                                                                                } else {
                                                                                    altMarker2.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                    altMarker1 = builder.mark();
                                                                                    if (this.statement_control_84_alt_1(builder)) {
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

    private boolean termseq_85(PsiBuilder builder) {
        if (!(this.termaltseq_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean prefixish_86(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_183(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean term_now_87(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("now"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_115(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean signature_88_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean signature_88_alt_2(PsiBuilder builder) {
        if (!(this.parameter_112(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_88_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_88_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.signature_88_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.signature_88_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean signature_88_quant_5(PsiBuilder builder) {
        if (!(this.param_sep_34(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.signature_88_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean signature_88_alt_6(PsiBuilder builder) {
        if (!(this.parameter_112(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.signature_88_quant_5(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean signature_88_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_88_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_RETURN_CONSTRAINT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_88_alt_9(PsiBuilder builder) {
        if (!(this.value_134(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_88_alt_10(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_88_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.signature_88_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.signature_88_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_88_quant_12(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RETURN_ARROW) && (tt1.equals("-->"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.signature_88_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.signature_88_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        marker8.done(Perl6ElementTypes.RETURN_CONSTRAINT);
        return true;
    }

    private boolean signature_88(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.signature_88_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.signature_88_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.signature_88_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.signature_88_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean post_constraint_89_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean post_constraint_89_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.post_constraint_89_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean post_constraint_89_quant_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_89_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.post_constraint_89_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_89_quant_5(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_89_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.post_constraint_89_quant_5(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_89(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.post_constraint_89_alt_6(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.post_constraint_89_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.post_constraint_89_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.regex_def_90_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean regex_def_90_quant_4(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_REGEX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_alt_6(PsiBuilder builder) {
        if (!(this.enter_regex_nibblier_204(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt4.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_90_quant_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt3.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.regex_def_90_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.regex_def_90_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.regex_def_90_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.regex_def_90_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean regex_def_90(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.regex_def_90_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.regex_def_90_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.regex_def_90_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.regex_def_90_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean term_empty_set_91(PsiBuilder builder) {
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

    private boolean quote_92_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\uFF63"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\uFF62"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_Q_167(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quote_92_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.quote_92_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_6(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quote_92_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quote_92_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt8.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_10(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt7.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.quote_92_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_12(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt9.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.quote_92_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_14(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt10.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.quote_92_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt12.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_16(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt11.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.quote_92_quant_15(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        return true;
    }

    private boolean quote_92_quant_17(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt14.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_92_alt_18(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt13.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.quote_92_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean quote_92(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker19;
        altMarker19 = builder.mark();
        if (this.quote_92_alt_18(builder)) {
            altMarker19.drop();
        } else {
            altMarker19.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.quote_92_alt_16(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.quote_92_alt_14(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.quote_92_alt_12(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.quote_92_alt_10(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker9;;
                            altMarker9 = builder.mark();
                            if (this.quote_92_alt_8(builder)) {
                                altMarker9.drop();
                            } else {
                                altMarker9.rollbackTo();
                                PsiBuilder.Marker altMarker7;;
                                altMarker7 = builder.mark();
                                if (this.quote_92_alt_6(builder)) {
                                    altMarker7.drop();
                                } else {
                                    altMarker7.rollbackTo();
                                    PsiBuilder.Marker altMarker5;;
                                    altMarker5 = builder.mark();
                                    if (this.quote_92_alt_4(builder)) {
                                        altMarker5.drop();
                                    } else {
                                        altMarker5.rollbackTo();
                                        PsiBuilder.Marker altMarker3;;
                                        altMarker3 = builder.mark();
                                        if (this.quote_92_alt_2(builder)) {
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

    private boolean routine_declarator_93_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_93_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_13(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_93_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_93(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.routine_declarator_93_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.routine_declarator_93_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.routine_declarator_93_alt_1(builder)) {
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

    private boolean termish_94(PsiBuilder builder) {
        if (!(this.term_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_whatever_95(PsiBuilder builder) {
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

    private boolean statement_control_repeat_96_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_repeat_96_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_repeat_96_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_repeat_96_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_repeat_96_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_96_alt_6(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_repeat_96_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_96_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_quant_9(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_96_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.statement_control_repeat_96_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.statement_control_repeat_96_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_repeat_96_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_96(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("repeat"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.statement_control_repeat_96_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_control_repeat_96_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_repeat_96_alt_1(builder)) {
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

    private boolean termalt_97_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termalt_97_alt_2(PsiBuilder builder) {
        if (!(this.termconj_11(builder))) {
            return false;
        }
        return true;
    }

    private boolean termalt_97_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termalt_97_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termalt_97_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termalt_97(PsiBuilder builder) {
        if (!(this.termconj_11(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termalt_97_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean dottyop_98_quant_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_98_quant_2(PsiBuilder builder) {
        if (!(this.methodop_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_98(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_98_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dottyop_98_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_99_alt_1(PsiBuilder builder) {
        if (!(this.term_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_99_alt_2(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_99_alt_3(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_99_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_99_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_require_99_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_require_99_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_require_99_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_require_99_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_99(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("require"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_require_99_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REQUIRE_STATEMENT);
        return true;
    }

    private boolean statement_100_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_157(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_100_alt_2(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_172(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_100_quant_3(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_172(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_100_alt_4(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if (!(this.statement_mod_cond_196(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_100_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean statement_100_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_100_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_100_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_100_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_100_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_100_alt_7(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_100_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_100_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_84(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_100(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.statement_100_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_100_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.statement_100_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean multi_declarator_101_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR_NULL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.declarator_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_101_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean multi_declarator_101_alt_3(PsiBuilder builder) {
        if (!(this.routine_def_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_101_alt_4(PsiBuilder builder) {
        if (!(this.declarator_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_101_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.multi_declarator_101_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.multi_declarator_101_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.multi_declarator_101_alt_2(builder)) {
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

    private boolean multi_declarator_101(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.multi_declarator_101_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.multi_declarator_101_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean onlystar_102(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
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

    private boolean package_declarator_103(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PACKAGE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.package_def_10(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PACKAGE_DECLARATION);
        return true;
    }

    private boolean package_kind_104_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_104(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.package_kind_104_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.package_kind_104_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.package_kind_104_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.package_kind_104_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.package_kind_104_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.package_kind_104_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.package_kind_104_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.package_kind_104_alt_1(builder)) {
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

    private boolean dec_number_105_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_105_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_105(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_105_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_105_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_106_alt_1(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_7(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_8(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_106_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_106_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.quote_escape_106_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_106(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.quote_escape_106_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_106_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.quote_escape_106_alt_5(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.quote_escape_106_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.quote_escape_106_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.quote_escape_106_alt_2(builder)) {
                                altMarker2.drop();
                            } else {
                                altMarker2.rollbackTo();
                                PsiBuilder.Marker altMarker1;;
                                altMarker1 = builder.mark();
                                if (this.quote_escape_106_alt_1(builder)) {
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

    private boolean signed_integer_107(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_type_const_108(PsiBuilder builder) {
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

    private boolean statementlist_109_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_109_alt_2(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_109_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.statement_100(builder))) {
            return false;
        }
        if (!(this.eat_terminator_200(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean statementlist_109(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_109_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_109_alt_1(builder)) {
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
            if (this.statementlist_109_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean bogus_end_110(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean longname_111(PsiBuilder builder) {
        if (!(this.name_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_1(PsiBuilder builder) {
        if (!(this.named_param_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_2(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.parameter_112_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.parameter_112_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.parameter_112_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean parameter_112_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_6(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.parameter_112_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.parameter_112_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_112_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt1.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_9(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt2.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.parameter_112_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.parameter_112_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.parameter_112_alt_8(builder)) {
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

    private boolean parameter_112_quant_12(PsiBuilder builder) {
        if (!(this.type_constraint_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_14(PsiBuilder builder) {
        if (!(this.named_param_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_15(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_quant_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_17(PsiBuilder builder) {
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.parameter_112_alt_15(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.parameter_112_alt_14(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.parameter_112_quant_16(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean parameter_112_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_19(PsiBuilder builder) {
        if (!(this.param_var_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker21;
        altMarker21 = builder.mark();
        if (this.parameter_112_alt_19(builder)) {
            altMarker21.drop();
        } else {
            altMarker21.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.parameter_112_alt_18(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_112_alt_21(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt4.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_22(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt5.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_23(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM_DECLARATION_BACKSLASH) && (tt6.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_112_alt_24(PsiBuilder builder) {
        PsiBuilder.Marker altMarker25;
        altMarker25 = builder.mark();
        if (this.parameter_112_alt_23(builder)) {
            altMarker25.drop();
        } else {
            altMarker25.rollbackTo();
            PsiBuilder.Marker altMarker24;;
            altMarker24 = builder.mark();
            if (this.parameter_112_alt_22(builder)) {
                altMarker24.drop();
            } else {
                altMarker24.rollbackTo();
                PsiBuilder.Marker altMarker23;;
                altMarker23 = builder.mark();
                if (this.parameter_112_alt_21(builder)) {
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

    private boolean parameter_112_alt_25(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.parameter_112_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker14;;
            quantMarker14 = builder.mark();
            if (this.parameter_112_quant_12(builder)) {
                quantMarker14.drop();
            } else {
                quantMarker14.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.parameter_112_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.parameter_112_alt_20(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                PsiBuilder.Marker altMarker19;;
                altMarker19 = builder.mark();
                if (this.parameter_112_alt_17(builder)) {
                    altMarker19.drop();
                } else {
                    altMarker19.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.parameter_112_alt_13(builder)) {
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

    private boolean parameter_112_quant_26(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_quant_27(PsiBuilder builder) {
        if (!(this.post_constraint_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112_quant_28(PsiBuilder builder) {
        if (!(this.default_value_30(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_112(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker27;
        altMarker27 = builder.mark();
        if (this.parameter_112_alt_25(builder)) {
            altMarker27.drop();
        } else {
            altMarker27.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.parameter_112_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.parameter_112_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.parameter_112_alt_4(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker28;;
            quantMarker28 = builder.mark();
            if (this.parameter_112_quant_26(builder)) {
                quantMarker28.drop();
            } else {
                quantMarker28.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker29;;
            quantMarker29 = builder.mark();
            if (this.parameter_112_quant_27(builder)) {
                quantMarker29.drop();
            } else {
                quantMarker29.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker30;
        quantMarker30 = builder.mark();
        if (this.parameter_112_quant_28(builder)) {
            quantMarker30.drop();
        } else {
            quantMarker30.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER);
        return true;
    }

    private boolean statement_prefix_eager_113(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("eager"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.EAGER);
        return true;
    }

    private boolean statement_control_no_114_quant_1(PsiBuilder builder) {
        if (!(this.spacey_81(builder))) {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_114_quant_2(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_no_114_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_114(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("no"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_no_114_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NO_STATEMENT);
        return true;
    }

    private boolean tok_115(PsiBuilder builder) {
        if (!(this.end_keyword_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_116_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_3(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt2.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.typename_116_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean typename_116_quant_6(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_7(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_116_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_alt_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.typename_116_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.typename_116_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.typename_116_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_116_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_116_alt_12(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_116_quant_13(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAME) && (tt5.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.typename_116_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.typename_116_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_116(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.typename_116_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.typename_116_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.typename_116_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.typename_116_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.typename_116_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.typename_116_quant_10(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.typename_116_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean hexints_117_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_117_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_117_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_117_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_177(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_117_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_117(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexints_117_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_117_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_do_118(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("do"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.DO);
        return true;
    }

    private boolean term_onlystar_119(PsiBuilder builder) {
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

    private boolean statement_mod_loop_keyword_120_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_120_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_120_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_120_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_120(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_mod_loop_keyword_120_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_mod_loop_keyword_120_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_mod_loop_keyword_120_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.statement_mod_loop_keyword_120_alt_1(builder)) {
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

    private boolean comment_121(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_122_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_122_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_122_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_122_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_122_quant_4(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_122_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_122_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_122_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_102(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_122(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_122_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_122_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.routine_def_122_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.routine_def_122_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.routine_def_122_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.routine_def_122_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean postfixish_123_alt_1(PsiBuilder builder) {
        if (!(this.privop_24(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_123_alt_2(PsiBuilder builder) {
        if (!(this.dotty_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_123_alt_3(PsiBuilder builder) {
        if (!(this.postcircumfix_155(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_123_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.postfix_130(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_123(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.postfixish_123_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.postfixish_123_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.postfixish_123_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.postfixish_123_alt_1(builder)) {
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

    private boolean colonpair_variable_124_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_124_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_124(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.colonpair_variable_124_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.colonpair_variable_124_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean identifier_125_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_51(builder))) {
            return false;
        }
        if (!(this.ident_156(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_125(PsiBuilder builder) {
        if (!(this.ident_156(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_125_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean desigilname_126(PsiBuilder builder) {
        if (!(this.longname_111(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_1(PsiBuilder builder) {
        if (!(this.quote_92(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_2(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_127_quant_4(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_127_alt_6(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_7(PsiBuilder builder) {
        if (!(this.args_199(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_127_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.methodop_127_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_127_quant_9(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_127(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.methodop_127_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.methodop_127_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.methodop_127_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.methodop_127_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.methodop_127_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_127_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.methodop_127_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean rad_digits_128_quant_1(PsiBuilder builder) {
        if (!(this.rad_digit_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_digits_128_quant_2(PsiBuilder builder) {
        if (!(this.rad_digit_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_digits_128_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.rad_digits_128_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.rad_digits_128_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean rad_digits_128(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.rad_digits_128_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.rad_digits_128_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.rad_digits_128_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean initializer_129_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("::="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_129_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(":="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_129_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt3.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_129_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INITIALIZER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_129_alt_5(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_129(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.initializer_129_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.initializer_129_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.initializer_129_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.initializer_129_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.initializer_129_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean postfix_130(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_131_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt1.equals("token"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.regex_def_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_131_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt2.equals("rule"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.regex_def_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_131_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt3.equals("regex"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.regex_def_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_131(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_declarator_131_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_declarator_131_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_declarator_131_alt_1(builder)) {
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

    private boolean infixish_132(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_69(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean end_keyword_133(PsiBuilder builder) {
        return true;
    }

    private boolean value_134_alt_1(PsiBuilder builder) {
        if (!(this.quote_92(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_134_alt_2(PsiBuilder builder) {
        if (!(this.number_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_134(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_134_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_134_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rad_digit_135_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rad_digit_135_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rad_digit_135(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.rad_digit_135_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.rad_digit_135_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_try_136(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("try"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TRY);
        return true;
    }

    private boolean block_137(PsiBuilder builder) {
        if (!(this.blockoid_202(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_138_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_138(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_while_138_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHILE_STATEMENT);
        return true;
    }

    private boolean type_constraint_139_alt_1(PsiBuilder builder) {
        if (!(this.typename_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_139_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.numish_182(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_139_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.value_134(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_139_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_139_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker6;
        marker6 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.type_constraint_139_quant_4(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker6.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_139(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.type_constraint_139_alt_5(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.type_constraint_139_alt_3(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.type_constraint_139_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.type_constraint_139_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean binint_140_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_140_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.binint_140_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_140_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_140(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.binint_140_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_140_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_141_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_141_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.decint_141_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_141_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_141(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.decint_141_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_141_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_start_142(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("start"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.START);
        return true;
    }

    private boolean cclass_backslash_143(PsiBuilder builder) {
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

    private boolean sigmaybe_144_alt_1(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean sigmaybe_144_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.normspace_6(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_SIGSPACE);
        return true;
    }

    private boolean sigmaybe_144(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.sigmaybe_144_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.sigmaybe_144_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean starter_145(PsiBuilder builder) {
        return true;
    }

    private boolean escale_146(PsiBuilder builder) {
        if (!(this.sign_50(builder))) {
            return false;
        }
        if (!(this.decint_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean contextualizer_147_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.circumfix_184(builder))) {
            return false;
        }
        return true;
    }

    private boolean contextualizer_147_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean contextualizer_147_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.contextualizer_147_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean contextualizer_147(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.contextualizer_147_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.contextualizer_147_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.CONTEXTUALIZER);
        return true;
    }

    private boolean statement_control_need_148_alt_1(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_148_alt_2(PsiBuilder builder) {
        if (!(this.version_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_148_alt_3(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_148_alt_4(PsiBuilder builder) {
        if (!(this.version_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_148_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_need_148_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_need_148_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_need_148_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(","))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_need_148_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_148_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_need_148_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_need_148_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_need_148_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_need_148(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("need"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_need_148_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NEED_STATEMENT);
        return true;
    }

    private boolean xblock_149_quant_1(PsiBuilder builder) {
        if (!(this.pblock_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean xblock_149(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.xblock_149_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean octints_150_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_150_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_150_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_150_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_54(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_150_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_150(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octints_150_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_150_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean arglist_151_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_151_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.arglist_151_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean arglist_151_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_EMPTY) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean arglist_151(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_START) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.arglist_151_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.arglist_151_alt_2(builder)) {
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

    private boolean stopper_152_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_152_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_152(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_152_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_152_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rxq_153_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_153_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxq_153_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxq_153_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_153_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxq_153_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxq_153_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_153_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxq_153_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxq_153_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_153_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxq_153_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxq_153(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxq_153_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxq_153_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxq_153_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxq_153_alt_2(builder)) {
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

    private boolean quantifier_154_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_quant_2(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_quant_3(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_alt_5(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHATEVER) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_alt_6(PsiBuilder builder) {
        if (!(this.integer_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.quantifier_154_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quantifier_154_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quantifier_154_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantifier_154_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_154_alt_9(PsiBuilder builder) {
        if (!(this.integer_20(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.quantifier_154_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_154_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PREFIX) && (tt3.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_alt_11(PsiBuilder builder) {
        if (!(this.rxcodeblock_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_154_alt_12(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) && (tt1.equals("**"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.quantifier_154_quant_2(builder)) {
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
        if (this.quantifier_154_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.quantifier_154_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.quantifier_154_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.quantifier_154_alt_9(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.quantifier_154_alt_4(builder)) {
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

    private boolean quantifier_154(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.quantifier_154_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quantifier_154_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_QUANTIFIER);
        return true;
    }

    private boolean postcircumfix_155_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.postcircumfix_155_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CALL);
        return true;
    }

    private boolean postcircumfix_155_quant_3(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_quant_4(PsiBuilder builder) {
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.postcircumfix_155_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_155_alt_5(PsiBuilder builder) {
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
        if (this.postcircumfix_155_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_155_quant_6(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt6.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_quant_7(PsiBuilder builder) {
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.postcircumfix_155_quant_6(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_155_alt_8(PsiBuilder builder) {
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
        if (this.postcircumfix_155_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_155_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt8.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_quant_10(PsiBuilder builder) {
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.postcircumfix_155_quant_9(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_155_alt_11(PsiBuilder builder) {
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
        if (this.postcircumfix_155_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker12.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_155_quant_12(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt10.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_quant_13(PsiBuilder builder) {
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.postcircumfix_155_quant_12(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_155_alt_14(PsiBuilder builder) {
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
        if (this.postcircumfix_155_quant_13(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        marker16.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_155_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt12.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_155_quant_16(PsiBuilder builder) {
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker21;
        quantMarker21 = builder.mark();
        if (this.postcircumfix_155_quant_15(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_155_alt_17(PsiBuilder builder) {
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
        if (this.postcircumfix_155_quant_16(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        marker20.done(Perl6ElementTypes.ARRAY_INDEX);
        return true;
    }

    private boolean postcircumfix_155(PsiBuilder builder) {
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.postcircumfix_155_alt_17(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.postcircumfix_155_alt_14(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.postcircumfix_155_alt_11(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker11;;
                    altMarker11 = builder.mark();
                    if (this.postcircumfix_155_alt_8(builder)) {
                        altMarker11.drop();
                    } else {
                        altMarker11.rollbackTo();
                        PsiBuilder.Marker altMarker7;;
                        altMarker7 = builder.mark();
                        if (this.postcircumfix_155_alt_5(builder)) {
                            altMarker7.drop();
                        } else {
                            altMarker7.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.postcircumfix_155_alt_2(builder)) {
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

    private boolean ident_156_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_156_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_156_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_156(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_156_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_156_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_156_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean bogus_statement_157(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158_quant_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.variable_declarator_158_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean variable_declarator_158_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158_alt_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.variable_declarator_158_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean variable_declarator_158_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.variable_declarator_158_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.variable_declarator_158_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_declarator_158_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.variable_declarator_158_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.variable_declarator_158_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.variable_declarator_158_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean variable_declarator_158_quant_8(PsiBuilder builder) {
        if (!(this.trait_35(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158_quant_9(PsiBuilder builder) {
        if (!(this.post_constraint_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_158(PsiBuilder builder) {
        if (!(this.variable_78(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.variable_declarator_158_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker9;;
            quantMarker9 = builder.mark();
            if (this.variable_declarator_158_quant_8(builder)) {
                quantMarker9.drop();
            } else {
                quantMarker9.rollbackTo();
                break;
            }
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.variable_declarator_158_quant_9(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean backslash_159_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BACKSLASH_BAD) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_159_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_159(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.backslash_159_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.backslash_159_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean separator_160_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean separator_160(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.separator_160_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX_SEPARATOR);
        return true;
    }

    private boolean rxstopper_161(PsiBuilder builder) {
        if (!(this.stopper_152(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_162_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_162_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_162_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_162_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.charspec_162_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_162_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_162_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.charspec_162_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_162_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_162_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_162_alt_6(PsiBuilder builder) {
        if (!(this.charnames_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_162(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_162_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_162_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_162_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean integer_lex_163_alt_1(PsiBuilder builder) {
        if (!(this.decint_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_alt_2(PsiBuilder builder) {
        if (!(this.decint_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_163_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_163_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_163_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_163_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_177(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_163_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_163_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_54(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_163_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_163_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_140(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_163_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_163_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_163_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_163_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_163_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_163_alt_2(builder)) {
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

    private boolean integer_lex_163(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_163_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_163_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_DOC_164_quant_1(PsiBuilder builder) {
        if (!(this.statement_prefix_48(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_DOC_164(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PHASER) && (tt1.equals("DOC"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_prefix_DOC_164_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean statement_control_CATCH_165_quant_1(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_165(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CATCH"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CATCH_165_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CATCH_STATEMENT);
        return true;
    }

    private boolean statement_control_unless_166_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_unless_166(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("unless"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_unless_166_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNLESS_STATEMENT);
        return true;
    }

    private boolean quote_Q_167(PsiBuilder builder) {
        if (!(this.quote_nibbler_168(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_168_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_168_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_168_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_168(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_168_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_168_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_168_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_168_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_168(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_168_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_169_quant_1(PsiBuilder builder) {
        if (!(this.comment_121(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_169_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_169_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_169_alt_3(PsiBuilder builder) {
        if (!(this.comment_121(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_169(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_169_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_169_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_170_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_170_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_170_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.infixstopper_170_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixstopper_170_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_170_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_170(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.infixstopper_170_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.infixstopper_170_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_name_171_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_171_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_171_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_199(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_171_alt_3(PsiBuilder builder) {
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

    private boolean term_name_171(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_171_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_171_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_mod_loop_172_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_172(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_LOOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_loop_172_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_LOOP);
        return true;
    }

    private boolean statement_control_import_173_quant_1(PsiBuilder builder) {
        if (!(this.spacey_81(builder))) {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_173_quant_2(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_import_173_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_173(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("import"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_import_173_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IMPORT_STATEMENT);
        return true;
    }

    private boolean metachar_174_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_quant_2(PsiBuilder builder) {
        if (!(this.quantified_atom_47(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.metachar_174_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean metachar_174_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.metachar_174_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_GOAL);
        return true;
    }

    private boolean metachar_174_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) && (tt2.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statement_100(builder))) {
            return false;
        }
        if (!(this.eat_terminator_200(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_5(PsiBuilder builder) {
        if (!(this.rxcodeblock_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_6(PsiBuilder builder) {
        if (!(this.rxqq_53(builder))) {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_7(PsiBuilder builder) {
        if (!(this.rxq_153(builder))) {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt3.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_68(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.metachar_174_quant_8(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.REGEX_ASSERTION);
        return true;
    }

    private boolean metachar_174_alt_10(PsiBuilder builder) {
        if (!(this.rxqw_192(builder))) {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_11(PsiBuilder builder) {
        if (!(this.backslash_159(builder))) {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_quant_12(PsiBuilder builder) {
        if (!(this.regex_nibbler_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_quant_13(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_14(PsiBuilder builder) {
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
        if (this.metachar_174_quant_12(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.metachar_174_quant_13(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker14.done(Perl6ElementTypes.REGEX_CAPTURE_POSITIONAL);
        return true;
    }

    private boolean metachar_174_quant_15(PsiBuilder builder) {
        if (!(this.regex_nibbler_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_quant_16(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_17(PsiBuilder builder) {
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
        if (this.metachar_174_quant_15(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.metachar_174_quant_16(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.REGEX_GROUP);
        return true;
    }

    private boolean metachar_174_alt_18(PsiBuilder builder) {
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

    private boolean metachar_174_alt_19(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt10.equals(")>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_20(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt11.equals("<("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_21(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt12.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_22(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt13.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_23(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt14.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_24(PsiBuilder builder) {
        String tt15;
        tt15 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt15.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_25(PsiBuilder builder) {
        String tt16;
        tt16 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt16.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_26(PsiBuilder builder) {
        String tt17;
        tt17 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt17.equals("$$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_27(PsiBuilder builder) {
        String tt18;
        tt18 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt18.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_28(PsiBuilder builder) {
        String tt19;
        tt19 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt19.equals("^^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_193(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_174_alt_29(PsiBuilder builder) {
        PsiBuilder.Marker marker24;
        marker24 = builder.mark();
        PsiBuilder.Marker altMarker34;
        altMarker34 = builder.mark();
        if (this.metachar_174_alt_28(builder)) {
            altMarker34.drop();
        } else {
            altMarker34.rollbackTo();
            PsiBuilder.Marker altMarker33;;
            altMarker33 = builder.mark();
            if (this.metachar_174_alt_27(builder)) {
                altMarker33.drop();
            } else {
                altMarker33.rollbackTo();
                PsiBuilder.Marker altMarker32;;
                altMarker32 = builder.mark();
                if (this.metachar_174_alt_26(builder)) {
                    altMarker32.drop();
                } else {
                    altMarker32.rollbackTo();
                    PsiBuilder.Marker altMarker31;;
                    altMarker31 = builder.mark();
                    if (this.metachar_174_alt_25(builder)) {
                        altMarker31.drop();
                    } else {
                        altMarker31.rollbackTo();
                        PsiBuilder.Marker altMarker30;;
                        altMarker30 = builder.mark();
                        if (this.metachar_174_alt_24(builder)) {
                            altMarker30.drop();
                        } else {
                            altMarker30.rollbackTo();
                            PsiBuilder.Marker altMarker29;;
                            altMarker29 = builder.mark();
                            if (this.metachar_174_alt_23(builder)) {
                                altMarker29.drop();
                            } else {
                                altMarker29.rollbackTo();
                                PsiBuilder.Marker altMarker28;;
                                altMarker28 = builder.mark();
                                if (this.metachar_174_alt_22(builder)) {
                                    altMarker28.drop();
                                } else {
                                    altMarker28.rollbackTo();
                                    PsiBuilder.Marker altMarker27;;
                                    altMarker27 = builder.mark();
                                    if (this.metachar_174_alt_21(builder)) {
                                        altMarker27.drop();
                                    } else {
                                        altMarker27.rollbackTo();
                                        PsiBuilder.Marker altMarker26;;
                                        altMarker26 = builder.mark();
                                        if (this.metachar_174_alt_20(builder)) {
                                            altMarker26.drop();
                                        } else {
                                            altMarker26.rollbackTo();
                                            PsiBuilder.Marker altMarker25;;
                                            altMarker25 = builder.mark();
                                            if (this.metachar_174_alt_19(builder)) {
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

    private boolean metachar_174(PsiBuilder builder) {
        PsiBuilder.Marker altMarker35;
        altMarker35 = builder.mark();
        if (this.metachar_174_alt_29(builder)) {
            altMarker35.drop();
        } else {
            altMarker35.rollbackTo();
            PsiBuilder.Marker altMarker23;;
            altMarker23 = builder.mark();
            if (this.metachar_174_alt_18(builder)) {
                altMarker23.drop();
            } else {
                altMarker23.rollbackTo();
                PsiBuilder.Marker altMarker21;;
                altMarker21 = builder.mark();
                if (this.metachar_174_alt_17(builder)) {
                    altMarker21.drop();
                } else {
                    altMarker21.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.metachar_174_alt_14(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker13;;
                        altMarker13 = builder.mark();
                        if (this.metachar_174_alt_11(builder)) {
                            altMarker13.drop();
                        } else {
                            altMarker13.rollbackTo();
                            PsiBuilder.Marker altMarker12;;
                            altMarker12 = builder.mark();
                            if (this.metachar_174_alt_10(builder)) {
                                altMarker12.drop();
                            } else {
                                altMarker12.rollbackTo();
                                PsiBuilder.Marker altMarker11;;
                                altMarker11 = builder.mark();
                                if (this.metachar_174_alt_9(builder)) {
                                    altMarker11.drop();
                                } else {
                                    altMarker11.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.metachar_174_alt_7(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.metachar_174_alt_6(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.metachar_174_alt_5(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.metachar_174_alt_4(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.metachar_174_alt_3(builder)) {
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

    private boolean quote_qq_175(PsiBuilder builder) {
        if (!(this.quote_nibbler_168(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt1.equals("-"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt2.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.cclass_elem_176_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.cclass_elem_176_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_176_quant_4(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_9(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_10(PsiBuilder builder) {
        if (!(this.cclass_backslash_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_12(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_14(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_15(PsiBuilder builder) {
        if (!(this.cclass_backslash_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_16(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.cclass_elem_176_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.cclass_elem_176_alt_15(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.cclass_elem_176_alt_14(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_176_quant_17(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.cclass_elem_176_quant_11(builder)) {
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
        if (this.cclass_elem_176_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.cclass_elem_176_alt_12(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_176_quant_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_ATOM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.cclass_elem_176_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.cclass_elem_176_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.cclass_elem_176_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.cclass_elem_176_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean cclass_elem_176_quant_19(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176_alt_22(PsiBuilder builder) {
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
            if (this.cclass_elem_176_quant_18(builder)) {
                quantMarker19.drop();
            } else {
                quantMarker19.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.cclass_elem_176_quant_19(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.cclass_elem_176_alt_21(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.cclass_elem_176_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_176_quant_23(PsiBuilder builder) {
        if (!(this.normspace_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_176(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.cclass_elem_176_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.cclass_elem_176_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.cclass_elem_176_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.cclass_elem_176_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.cclass_elem_176_alt_6(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.cclass_elem_176_alt_5(builder)) {
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
        if (this.cclass_elem_176_quant_23(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_CCLASS_ELEM);
        return true;
    }

    private boolean hexint_177_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_177_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_177_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_177_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_177_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_177_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexint_177_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_177_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_177(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.hexint_177_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_177_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean fatarrow_178_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean fatarrow_178(PsiBuilder builder) {
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
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.fatarrow_178_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FATARROW);
        return true;
    }

    private boolean statement_control_default_179_quant_1(PsiBuilder builder) {
        if (!(this.block_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_179(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("default"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_default_179_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.DEFAULT_STATEMENT);
        return true;
    }

    private boolean kok_180(PsiBuilder builder) {
        if (!(this.end_keyword_133(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean vnum_181_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_181_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_181_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.vnum_181_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.vnum_181_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean vnum_181(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.vnum_181_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.vnum_181_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean numish_182_alt_1(PsiBuilder builder) {
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

    private boolean numish_182_alt_2(PsiBuilder builder) {
        if (!(this.integer_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_182_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_105(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_182_alt_4(PsiBuilder builder) {
        if (!(this.rad_number_45(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_182_alt_5(PsiBuilder builder) {
        if (!(this.rat_number_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_182_alt_6(PsiBuilder builder) {
        if (!(this.complex_number_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_182(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.numish_182_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.numish_182_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.numish_182_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.numish_182_alt_3(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.numish_182_alt_2(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.numish_182_alt_1(builder)) {
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
        return true;
    }

    private boolean prefix_183(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_quant_2(PsiBuilder builder) {
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.circumfix_184_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_184_alt_3(PsiBuilder builder) {
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
        if (this.circumfix_184_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_184_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_quant_5(PsiBuilder builder) {
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.circumfix_184_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_184_alt_6(PsiBuilder builder) {
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
        if (this.circumfix_184_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_184_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_quant_8(PsiBuilder builder) {
        if (!(this.quote_qq_175(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.circumfix_184_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_184_alt_9(PsiBuilder builder) {
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
        if (this.circumfix_184_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_184_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        if (!(this.pblock_28(builder))) {
            return false;
        }
        marker13.done(Perl6ElementTypes.BLOCK_OR_HASH);
        return true;
    }

    private boolean circumfix_184_quant_11(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_alt_12(PsiBuilder builder) {
        PsiBuilder.Marker marker15;
        marker15 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt7.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.circumfix_184_quant_11(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker15.done(Perl6ElementTypes.ARRAY_COMPOSER);
        return true;
    }

    private boolean circumfix_184_quant_13(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt10.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_184_alt_14(PsiBuilder builder) {
        PsiBuilder.Marker marker18;
        marker18 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt9.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_27(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker19;
        quantMarker19 = builder.mark();
        if (this.circumfix_184_quant_13(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.PARENTHESIZED_EXPRESSION);
        return true;
    }

    private boolean circumfix_184(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.circumfix_184_alt_14(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.circumfix_184_alt_12(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.circumfix_184_alt_10(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.circumfix_184_alt_9(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.circumfix_184_alt_6(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker4;;
                            altMarker4 = builder.mark();
                            if (this.circumfix_184_alt_3(builder)) {
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

    private boolean quote_q_185(PsiBuilder builder) {
        if (!(this.quote_nibbler_168(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_gather_186(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("gather"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.blorst_55(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.GATHER);
        return true;
    }

    private boolean term_rand_187(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("rand"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.end_keyword_133(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean term_time_188(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("time"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_115(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean statement_control_whenever_189_quant_1(PsiBuilder builder) {
        if (!(this.xblock_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_whenever_189(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("whenever"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_whenever_189_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHENEVER_STATEMENT);
        return true;
    }

    private boolean terminator_190_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_190_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_190_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_190_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_190_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_190_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_190_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_190_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_190_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_190_alt_2(builder)) {
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
        if (!(this.kok_180(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_190_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_190(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_190_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_190_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_190_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_190_alt_1(builder)) {
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

    private boolean twigil_191(PsiBuilder builder) {
        return true;
    }

    private boolean rxqw_192_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqw_192(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqw_192_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean SIGOK_193_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean SIGOK_193(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.SIGOK_193_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean bare_rat_number_194(PsiBuilder builder) {
        if (!(this.signed_integer_107(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("/"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_20(builder))) {
            return false;
        }
        return true;
    }

    private boolean semiarglist_195(PsiBuilder builder) {
        if (!(this.arglist_151(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_196_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_14(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_196(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_COND) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_180(builder))) {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_cond_196_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_COND);
        return true;
    }

    private boolean param_var_197_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postcircumfix_155(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.ARRAY_SHAPE);
        return true;
    }

    private boolean param_var_197_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.param_var_197_quant_1(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_VARIABLE);
        return true;
    }

    private boolean param_var_197_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_197_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.param_var_197_quant_3(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_197_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_197_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_88(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.param_var_197_quant_5(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_197(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.param_var_197_alt_6(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.param_var_197_alt_4(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.param_var_197_alt_2(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean signed_number_198(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.number_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_199_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NO_ARGS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_199_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_199_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_199_alt_4(PsiBuilder builder) {
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
        if (!(this.semiarglist_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_199_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_199_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_199_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_199_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_199(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_199_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_199_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_199_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_199_alt_1(builder)) {
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

    private boolean eat_terminator_200_alt_1(PsiBuilder builder) {
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_200_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_200_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_200_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.eat_terminator_200_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.eat_terminator_200_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.eat_terminator_200_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean eat_terminator_200(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.eat_terminator_200_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean morename_201_quant_1(PsiBuilder builder) {
        if (!(this.identifier_125(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_201(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_201_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean blockoid_202_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_202(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_109(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.blockoid_202_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.BLOCK);
        return true;
    }

    private boolean number_203(PsiBuilder builder) {
        if (!(this.numish_182(builder))) {
            return false;
        }
        return true;
    }

    private boolean enter_regex_nibblier_204(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.regex_nibbler_23(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX);
        return true;
    }

    private boolean defterm_205(PsiBuilder builder) {
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

    private boolean ws_206_alt_1(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_206_alt_2(PsiBuilder builder) {
        if (!(this.unv_169(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_206_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_206_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_206_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_206_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_206_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_206(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_206_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean colonpair_207_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.coloncircumfix_70(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_207_quant_2(PsiBuilder builder) {
        if (!(this.unsp_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_207_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR_HAS_VALUE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.colonpair_207_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.coloncircumfix_70(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_207_alt_4(PsiBuilder builder) {
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
        if (this.colonpair_207_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_207_alt_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt3.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.colonpair_variable_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_207_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_207_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt4.equals(":("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        if (!(this.signature_88(builder))) {
            return false;
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.colonpair_207_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_207_alt_8(PsiBuilder builder) {
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

    private boolean colonpair_207_alt_9(PsiBuilder builder) {
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

    private boolean colonpair_207(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.colonpair_207_alt_9(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.colonpair_207_alt_8(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.colonpair_207_alt_7(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.colonpair_207_alt_5(builder)) {
                        altMarker6.drop();
                    } else {
                        altMarker6.rollbackTo();
                        PsiBuilder.Marker altMarker5;;
                        altMarker5 = builder.mark();
                        if (this.colonpair_207_alt_4(builder)) {
                            altMarker5.drop();
                        } else {
                            altMarker5.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.colonpair_207_alt_1(builder)) {
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

    private boolean statement_control_use_208_quant_1(PsiBuilder builder) {
        if (!(this.spacey_81(builder))) {
            return false;
        }
        if (!(this.arglist_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_208_alt_2(PsiBuilder builder) {
        if (!(this.module_name_15(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_use_208_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_use_208_alt_3(PsiBuilder builder) {
        if (!(this.version_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_208_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_use_208_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_use_208_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_use_208(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_use_208_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.ws_206(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
