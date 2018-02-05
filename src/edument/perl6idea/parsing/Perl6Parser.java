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

    private boolean infix_circumfix_meta_operator_1_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.HYPER_METAOP_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infix_circumfix_meta_operator_1_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infix_circumfix_meta_operator_1_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.infix_circumfix_meta_operator_1_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.infix_circumfix_meta_operator_1_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.HYPER_METAOP);
        return true;
    }

    private boolean infix_circumfix_meta_operator_1_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.HYPER_METAOP_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infix_circumfix_meta_operator_1_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infix_circumfix_meta_operator_1_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.infix_circumfix_meta_operator_1_alt_5(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.infix_circumfix_meta_operator_1_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        marker5.done(Perl6ElementTypes.HYPER_METAOP);
        return true;
    }

    private boolean infix_circumfix_meta_operator_1(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.infix_circumfix_meta_operator_1_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.infix_circumfix_meta_operator_1_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_react_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("react"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REACT);
        return true;
    }

    private boolean unsp_3_alt_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_3_alt_2(PsiBuilder builder) {
        if (!(this.unv_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean unsp_3_alt_3(PsiBuilder builder) {
        if (!(this.vws_61(builder))) {
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

    private boolean statement_control_if_4_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("with"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("if"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("orwith"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("elsif"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_quant_5(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_if_4_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_if_4_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_if_4_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_quant_7(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_if_4_quant_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("else"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_if_4_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_if_4_quant_9(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_if_4_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_if_4_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_if_4(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_if_4_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_if_4_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_if_4_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IF_STATEMENT);
        return true;
    }

    private boolean statement_control_until_5_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_until_5(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_until_5_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNTIL_STATEMENT);
        return true;
    }

    private boolean dotty_6(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.dottyop_102(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean normspace_7(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean bare_complex_number_8(PsiBuilder builder) {
        if (!(this.signed_number_208(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signed_number_208(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_hyper_9(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("hyper"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.HYPER);
        return true;
    }

    private boolean param_term_10_quant_1(PsiBuilder builder) {
        if (!(this.defterm_215(builder))) {
            return false;
        }
        return true;
    }

    private boolean param_term_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.param_term_10_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean package_def_11_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_11_quant_2(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_11_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_def_11_quant_4(PsiBuilder builder) {
        if (!(this.statementlist_114(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_11_alt_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.package_def_11_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean package_def_11_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean package_def_11(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.package_def_11_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.package_def_11_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.package_def_11_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.package_def_11_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.package_def_11_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean termconj_12_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconj_12_alt_2(PsiBuilder builder) {
        if (!(this.rxtermish_65(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconj_12_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconj_12_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconj_12_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconj_12(PsiBuilder builder) {
        if (!(this.rxtermish_65(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconj_12_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hasdelimiter_13(PsiBuilder builder) {
        return true;
    }

    private boolean radint_14(PsiBuilder builder) {
        if (!(this.integer_lex_172(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_15_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_15_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean method_def_15_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.method_def_15_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean method_def_15_quant_4(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_15_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean method_def_15_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_15_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_107(builder))) {
            return false;
        }
        return true;
    }

    private boolean method_def_15(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.method_def_15_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.method_def_15_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.method_def_15_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.method_def_15_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.method_def_15_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.method_def_15_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean EXPR_16_alt_1(PsiBuilder builder) {
        if (!(this.termish_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_2(PsiBuilder builder) {
        if (!(this.prefixish_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_3(PsiBuilder builder) {
        if (!(this.termish_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.EXPR_16_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.EXPR_16_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.EXPR_16_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_16_quant_5(PsiBuilder builder) {
        if (!(this.postfixish_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_alt_6(PsiBuilder builder) {
        if (!(this.termish_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_7(PsiBuilder builder) {
        if (!(this.prefixish_90(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_8(PsiBuilder builder) {
        if (!(this.termish_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.EXPR_16_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.EXPR_16_quant_7(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.EXPR_16_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_16_quant_10(PsiBuilder builder) {
        if (!(this.postfixish_129(builder))) {
            return false;
        }
        return true;
    }

    private boolean EXPR_16_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.EXPR_16_alt_9(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.EXPR_16_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker13;;
            quantMarker13 = builder.mark();
            if (this.EXPR_16_quant_10(builder)) {
                quantMarker13.drop();
            } else {
                quantMarker13.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean EXPR_16_quant_12(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.EXPR_16_quant_11(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean EXPR_16(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.EXPR_16_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.EXPR_16_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.EXPR_16_quant_5(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker15;;
            quantMarker15 = builder.mark();
            if (this.EXPR_16_quant_12(builder)) {
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

    private boolean module_name_17(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ENDSTMT_18_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_18_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ENDSTMT_18_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ENDSTMT_18_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ENDSTMT_18_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean ENDSTMT_18(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.ENDSTMT_18_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean sigil_19(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_20_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_20_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_20_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean rxinfixstopper_20(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.rxinfixstopper_20_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.rxinfixstopper_20_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.rxinfixstopper_20_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean term_ident_21_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_ident_21(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_ident_21_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_209(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean mod_ident_22_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.mod_ident_22_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean mod_ident_22_quant_4(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.mod_ident_22_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean mod_ident_22_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_quant_8(PsiBuilder builder) {
        return true;
    }

    private boolean mod_ident_22_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.mod_ident_22_quant_8(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean mod_ident_22(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.mod_ident_22_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.mod_ident_22_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.mod_ident_22_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.mod_ident_22_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.mod_ident_22_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker1;;
                            altMarker1 = builder.mark();
                            if (this.mod_ident_22_alt_1(builder)) {
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

    private boolean integer_23(PsiBuilder builder) {
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

    private boolean complex_number_24(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.bare_complex_number_8(builder))) {
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

    private boolean statement_prefix_once_25(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("once"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ONCE);
        return true;
    }

    private boolean regex_nibbler_26_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt2.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt3.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt4.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_nibbler_26_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_nibbler_26_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_nibbler_26_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.regex_nibbler_26_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26_quant_6(PsiBuilder builder) {
        if (!(this.termseq_89(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_nibbler_26(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.regex_nibbler_26_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.regex_nibbler_26_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean privop_27_quant_1(PsiBuilder builder) {
        if (!(this.methodop_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean privop_27(PsiBuilder builder) {
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
        if (this.privop_27_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean statement_prefix_lazy_28(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("lazy"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.LAZY);
        return true;
    }

    private boolean name_29_quant_1(PsiBuilder builder) {
        if (!(this.morename_211(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_29_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.name_29_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.name_29_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_29_quant_3(PsiBuilder builder) {
        if (!(this.morename_211(builder))) {
            return false;
        }
        return true;
    }

    private boolean name_29_alt_4(PsiBuilder builder) {
        if (!(this.identifier_131(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.name_29_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean name_29(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.name_29_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.name_29_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean semilist_30_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.statement_105(builder))) {
            return false;
        }
        if (!(this.eat_terminator_210(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean semilist_30_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.semilist_30_quant_1(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean semilist_30_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SEMI_LIST_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean semilist_30(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.semilist_30_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.semilist_30_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.SEMI_LIST);
        return true;
    }

    private boolean pblock_31_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLOCK) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean pblock_31_alt_2(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_31_quant_3(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean pblock_31_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.LAMBDA) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.signature_92(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.pblock_31_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker3.done(Perl6ElementTypes.POINTY_BLOCK);
        return true;
    }

    private boolean pblock_31(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.pblock_31_alt_4(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.pblock_31_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.pblock_31_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean scope_declarator_32_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_SCOPED_DECLARATION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32_alt_2(PsiBuilder builder) {
        if (!(this.multi_declarator_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32_quant_3(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32_quant_4(PsiBuilder builder) {
        if (!(this.multi_declarator_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.scope_declarator_32_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.scope_declarator_32_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.scope_declarator_32_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean scope_declarator_32_alt_6(PsiBuilder builder) {
        if (!(this.package_declarator_108(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32_alt_7(PsiBuilder builder) {
        if (!(this.declarator_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean scope_declarator_32(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.scope_declarator_32_alt_7(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.scope_declarator_32_alt_6(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.scope_declarator_32_alt_5(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.scope_declarator_32_alt_2(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.scope_declarator_32_alt_1(builder)) {
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

    private boolean default_value_33_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean default_value_33(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.default_value_33_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_DEFAULT);
        return true;
    }

    private boolean termconjseq_34_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termconjseq_34_alt_2(PsiBuilder builder) {
        if (!(this.termalt_101(builder))) {
            return false;
        }
        return true;
    }

    private boolean termconjseq_34_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("&&"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termconjseq_34_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termconjseq_34_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termconjseq_34(PsiBuilder builder) {
        if (!(this.termalt_101(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termconjseq_34_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_mod_cond_keyword_35_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_35_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_35_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_35_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_35_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_cond_keyword_35(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_mod_cond_keyword_35_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_mod_cond_keyword_35_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.statement_mod_cond_keyword_35_alt_3(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.statement_mod_cond_keyword_35_alt_2(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        PsiBuilder.Marker altMarker1;;
                        altMarker1 = builder.mark();
                        if (this.statement_mod_cond_keyword_35_alt_1(builder)) {
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

    private boolean statement_control_without_36_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_without_36(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("without"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_without_36_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WITHOUT_STATEMENT);
        return true;
    }

    private boolean param_sep_37(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_SEPARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_38(PsiBuilder builder) {
        if (!(this.trait_mod_78(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxarglist_39(PsiBuilder builder) {
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_40_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt1.equals("!!!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_40_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt2.equals("???"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_40_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt3.equals("..."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_40_alt_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STUB_CODE) && (tt4.equals("\u2026"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_stub_code_40(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_stub_code_40_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.term_stub_code_40_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.term_stub_code_40_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.term_stub_code_40_alt_1(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.args_209(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.STUB_CODE);
        return true;
    }

    private boolean statement_control_QUIT_41_quant_1(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_QUIT_41(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("QUIT"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_QUIT_41_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.QUIT_STATEMENT);
        return true;
    }

    private boolean mod_internal_42_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean mod_internal_42_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean mod_internal_42_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.mod_internal_42_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.mod_internal_42_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean mod_internal_42_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean mod_internal_42_quant_5(PsiBuilder builder) {
        if (!(this.value_140(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.mod_internal_42_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean mod_internal_42_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.mod_internal_42_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean mod_internal_42_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.mod_internal_42_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean mod_internal_42_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL_NUMERIC) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean mod_internal_42_alt_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) && (tt4.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean mod_internal_42(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.mod_internal_42_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_MOD_INTERNAL) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.mod_internal_42_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.mod_internal_42_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.mod_internal_42_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    return false;
                }
            }
        }
        marker4.done(Perl6ElementTypes.REGEX_MOD_INTERNAL);
        return true;
    }

    private boolean rxcodeblock_43(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_44_alt_1(PsiBuilder builder) {
        if (!(this.metachar_184(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_44_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_LITERAL);
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean atom_44(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.atom_44_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.atom_44_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean charname_45_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charname_45_alt_2(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charname_45_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charname_45_alt_3(PsiBuilder builder) {
        if (!(this.integer_lex_172(builder))) {
            return false;
        }
        return true;
    }

    private boolean charname_45(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.charname_45_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.charname_45_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_46_alt_1(PsiBuilder builder) {
        if (!(this.capterm_71(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_2(PsiBuilder builder) {
        if (!(this.term_name_181(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_3(PsiBuilder builder) {
        if (!(this.term_type_const_113(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_4(PsiBuilder builder) {
        if (!(this.term_hyperwhatever_83(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_5(PsiBuilder builder) {
        if (!(this.term_whatever_99(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_6(PsiBuilder builder) {
        if (!(this.term_rand_197(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_7(PsiBuilder builder) {
        if (!(this.term_empty_set_95(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_8(PsiBuilder builder) {
        if (!(this.term_time_198(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_9(PsiBuilder builder) {
        if (!(this.term_now_91(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_10(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_11(PsiBuilder builder) {
        if (!(this.dotty_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_12(PsiBuilder builder) {
        if (!(this.term_stub_code_40(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_13(PsiBuilder builder) {
        if (!(this.circumfix_194(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_14(PsiBuilder builder) {
        if (!(this.term_reduce_141(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_15(PsiBuilder builder) {
        if (!(this.term_onlystar_125(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_16(PsiBuilder builder) {
        if (!(this.package_declarator_108(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_17(PsiBuilder builder) {
        if (!(this.statement_prefix_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_18(PsiBuilder builder) {
        if (!(this.type_declarator_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_19(PsiBuilder builder) {
        if (!(this.multi_declarator_106(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_20(PsiBuilder builder) {
        if (!(this.regex_declarator_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_21(PsiBuilder builder) {
        if (!(this.routine_declarator_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_22(PsiBuilder builder) {
        if (!(this.scope_declarator_32(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_23(PsiBuilder builder) {
        if (!(this.term_ident_21(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_24(PsiBuilder builder) {
        if (!(this.term_self_80(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_25(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_26(PsiBuilder builder) {
        if (!(this.colonpair_217(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_27(PsiBuilder builder) {
        if (!(this.fatarrow_188(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46_alt_28(PsiBuilder builder) {
        if (!(this.value_140(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_46(PsiBuilder builder) {
        PsiBuilder.Marker altMarker28;
        altMarker28 = builder.mark();
        if (this.term_46_alt_28(builder)) {
            altMarker28.drop();
        } else {
            altMarker28.rollbackTo();
            PsiBuilder.Marker altMarker27;;
            altMarker27 = builder.mark();
            if (this.term_46_alt_27(builder)) {
                altMarker27.drop();
            } else {
                altMarker27.rollbackTo();
                PsiBuilder.Marker altMarker26;;
                altMarker26 = builder.mark();
                if (this.term_46_alt_26(builder)) {
                    altMarker26.drop();
                } else {
                    altMarker26.rollbackTo();
                    PsiBuilder.Marker altMarker25;;
                    altMarker25 = builder.mark();
                    if (this.term_46_alt_25(builder)) {
                        altMarker25.drop();
                    } else {
                        altMarker25.rollbackTo();
                        PsiBuilder.Marker altMarker24;;
                        altMarker24 = builder.mark();
                        if (this.term_46_alt_24(builder)) {
                            altMarker24.drop();
                        } else {
                            altMarker24.rollbackTo();
                            PsiBuilder.Marker altMarker23;;
                            altMarker23 = builder.mark();
                            if (this.term_46_alt_23(builder)) {
                                altMarker23.drop();
                            } else {
                                altMarker23.rollbackTo();
                                PsiBuilder.Marker altMarker22;;
                                altMarker22 = builder.mark();
                                if (this.term_46_alt_22(builder)) {
                                    altMarker22.drop();
                                } else {
                                    altMarker22.rollbackTo();
                                    PsiBuilder.Marker altMarker21;;
                                    altMarker21 = builder.mark();
                                    if (this.term_46_alt_21(builder)) {
                                        altMarker21.drop();
                                    } else {
                                        altMarker21.rollbackTo();
                                        PsiBuilder.Marker altMarker20;;
                                        altMarker20 = builder.mark();
                                        if (this.term_46_alt_20(builder)) {
                                            altMarker20.drop();
                                        } else {
                                            altMarker20.rollbackTo();
                                            PsiBuilder.Marker altMarker19;;
                                            altMarker19 = builder.mark();
                                            if (this.term_46_alt_19(builder)) {
                                                altMarker19.drop();
                                            } else {
                                                altMarker19.rollbackTo();
                                                PsiBuilder.Marker altMarker18;;
                                                altMarker18 = builder.mark();
                                                if (this.term_46_alt_18(builder)) {
                                                    altMarker18.drop();
                                                } else {
                                                    altMarker18.rollbackTo();
                                                    PsiBuilder.Marker altMarker17;;
                                                    altMarker17 = builder.mark();
                                                    if (this.term_46_alt_17(builder)) {
                                                        altMarker17.drop();
                                                    } else {
                                                        altMarker17.rollbackTo();
                                                        PsiBuilder.Marker altMarker16;;
                                                        altMarker16 = builder.mark();
                                                        if (this.term_46_alt_16(builder)) {
                                                            altMarker16.drop();
                                                        } else {
                                                            altMarker16.rollbackTo();
                                                            PsiBuilder.Marker altMarker15;;
                                                            altMarker15 = builder.mark();
                                                            if (this.term_46_alt_15(builder)) {
                                                                altMarker15.drop();
                                                            } else {
                                                                altMarker15.rollbackTo();
                                                                PsiBuilder.Marker altMarker14;;
                                                                altMarker14 = builder.mark();
                                                                if (this.term_46_alt_14(builder)) {
                                                                    altMarker14.drop();
                                                                } else {
                                                                    altMarker14.rollbackTo();
                                                                    PsiBuilder.Marker altMarker13;;
                                                                    altMarker13 = builder.mark();
                                                                    if (this.term_46_alt_13(builder)) {
                                                                        altMarker13.drop();
                                                                    } else {
                                                                        altMarker13.rollbackTo();
                                                                        PsiBuilder.Marker altMarker12;;
                                                                        altMarker12 = builder.mark();
                                                                        if (this.term_46_alt_12(builder)) {
                                                                            altMarker12.drop();
                                                                        } else {
                                                                            altMarker12.rollbackTo();
                                                                            PsiBuilder.Marker altMarker11;;
                                                                            altMarker11 = builder.mark();
                                                                            if (this.term_46_alt_11(builder)) {
                                                                                altMarker11.drop();
                                                                            } else {
                                                                                altMarker11.rollbackTo();
                                                                                PsiBuilder.Marker altMarker10;;
                                                                                altMarker10 = builder.mark();
                                                                                if (this.term_46_alt_10(builder)) {
                                                                                    altMarker10.drop();
                                                                                } else {
                                                                                    altMarker10.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker9;;
                                                                                    altMarker9 = builder.mark();
                                                                                    if (this.term_46_alt_9(builder)) {
                                                                                        altMarker9.drop();
                                                                                    } else {
                                                                                        altMarker9.rollbackTo();
                                                                                        PsiBuilder.Marker altMarker8;;
                                                                                        altMarker8 = builder.mark();
                                                                                        if (this.term_46_alt_8(builder)) {
                                                                                            altMarker8.drop();
                                                                                        } else {
                                                                                            altMarker8.rollbackTo();
                                                                                            PsiBuilder.Marker altMarker7;;
                                                                                            altMarker7 = builder.mark();
                                                                                            if (this.term_46_alt_7(builder)) {
                                                                                                altMarker7.drop();
                                                                                            } else {
                                                                                                altMarker7.rollbackTo();
                                                                                                PsiBuilder.Marker altMarker6;;
                                                                                                altMarker6 = builder.mark();
                                                                                                if (this.term_46_alt_6(builder)) {
                                                                                                    altMarker6.drop();
                                                                                                } else {
                                                                                                    altMarker6.rollbackTo();
                                                                                                    PsiBuilder.Marker altMarker5;;
                                                                                                    altMarker5 = builder.mark();
                                                                                                    if (this.term_46_alt_5(builder)) {
                                                                                                        altMarker5.drop();
                                                                                                    } else {
                                                                                                        altMarker5.rollbackTo();
                                                                                                        PsiBuilder.Marker altMarker4;;
                                                                                                        altMarker4 = builder.mark();
                                                                                                        if (this.term_46_alt_4(builder)) {
                                                                                                            altMarker4.drop();
                                                                                                        } else {
                                                                                                            altMarker4.rollbackTo();
                                                                                                            PsiBuilder.Marker altMarker3;;
                                                                                                            altMarker3 = builder.mark();
                                                                                                            if (this.term_46_alt_3(builder)) {
                                                                                                                altMarker3.drop();
                                                                                                            } else {
                                                                                                                altMarker3.rollbackTo();
                                                                                                                PsiBuilder.Marker altMarker2;;
                                                                                                                altMarker2 = builder.mark();
                                                                                                                if (this.term_46_alt_2(builder)) {
                                                                                                                    altMarker2.drop();
                                                                                                                } else {
                                                                                                                    altMarker2.rollbackTo();
                                                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                                                    altMarker1 = builder.mark();
                                                                                                                    if (this.term_46_alt_1(builder)) {
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
        }
        return true;
    }

    private boolean statement_prefix_quietly_47(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("quietly"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.QUIETLY);
        return true;
    }

    private boolean TOP_48_alt_1(PsiBuilder builder) {
        if (!(this.bogus_end_116(builder))) {
            return false;
        }
        return true;
    }

    private boolean TOP_48_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean TOP_48(PsiBuilder builder) {
        if (!(this.statementlist_114(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.TOP_48_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.TOP_48_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rad_number_49_quant_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_quant_2(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.rad_number_49_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_49_quant_4(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.rad_number_49_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_49_alt_6(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt7.equals("0b"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_7(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt8.equals("0d"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_8(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt9.equals("0o"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_9(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt10.equals("0x"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_quant_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.rad_number_49_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.rad_number_49_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.rad_number_49_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.rad_number_49_alt_6(builder)) {
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

    private boolean rad_number_49_quant_11(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt11.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rad_number_49_alt_12(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RADIX_NUMBER) && (tt6.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.rad_number_49_quant_10(builder)) {
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
        if (this.rad_number_49_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean rad_number_49(PsiBuilder builder) {
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
        if (this.rad_number_49_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.rad_number_49_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.rad_number_49_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.rad_number_49_alt_3(builder)) {
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

    private boolean version_50(PsiBuilder builder) {
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

    private boolean quantified_atom_51_quant_1(PsiBuilder builder) {
        if (!(this.sigmaybe_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_51_alt_2(PsiBuilder builder) {
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

    private boolean quantified_atom_51_alt_3(PsiBuilder builder) {
        if (!(this.quantifier_163(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_51_quant_4(PsiBuilder builder) {
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        if (!(this.sigmaybe_151(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_51_quant_5(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if (!(this.separator_169(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantified_atom_51_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.quantified_atom_51_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.quantified_atom_51_alt_2(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quantified_atom_51_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.quantified_atom_51_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean quantified_atom_51(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.atom_44(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quantified_atom_51_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantified_atom_51_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_ATOM);
        return true;
    }

    private boolean statement_prefix_52_alt_1(PsiBuilder builder) {
        if (!(this.statement_prefix_do_124(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_2(PsiBuilder builder) {
        if (!(this.statement_prefix_react_2(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_3(PsiBuilder builder) {
        if (!(this.statement_prefix_supply_75(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_4(PsiBuilder builder) {
        if (!(this.statement_prefix_start_149(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_5(PsiBuilder builder) {
        if (!(this.statement_prefix_once_25(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_6(PsiBuilder builder) {
        if (!(this.statement_prefix_gather_196(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_7(PsiBuilder builder) {
        if (!(this.statement_prefix_quietly_47(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_8(PsiBuilder builder) {
        if (!(this.statement_prefix_try_143(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_9(PsiBuilder builder) {
        if (!(this.statement_prefix_sink_63(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_10(PsiBuilder builder) {
        if (!(this.statement_prefix_eager_119(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_11(PsiBuilder builder) {
        if (!(this.statement_prefix_lazy_28(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_12(PsiBuilder builder) {
        if (!(this.statement_prefix_hyper_9(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_13(PsiBuilder builder) {
        if (!(this.statement_prefix_race_76(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_14(PsiBuilder builder) {
        if (!(this.statement_prefix_phaser_60(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52_alt_15(PsiBuilder builder) {
        if (!(this.statement_prefix_DOC_173(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_52(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.statement_prefix_52_alt_15(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.statement_prefix_52_alt_14(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                PsiBuilder.Marker altMarker13;;
                altMarker13 = builder.mark();
                if (this.statement_prefix_52_alt_13(builder)) {
                    altMarker13.drop();
                } else {
                    altMarker13.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.statement_prefix_52_alt_12(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker11;;
                        altMarker11 = builder.mark();
                        if (this.statement_prefix_52_alt_11(builder)) {
                            altMarker11.drop();
                        } else {
                            altMarker11.rollbackTo();
                            PsiBuilder.Marker altMarker10;;
                            altMarker10 = builder.mark();
                            if (this.statement_prefix_52_alt_10(builder)) {
                                altMarker10.drop();
                            } else {
                                altMarker10.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.statement_prefix_52_alt_9(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker8;;
                                    altMarker8 = builder.mark();
                                    if (this.statement_prefix_52_alt_8(builder)) {
                                        altMarker8.drop();
                                    } else {
                                        altMarker8.rollbackTo();
                                        PsiBuilder.Marker altMarker7;;
                                        altMarker7 = builder.mark();
                                        if (this.statement_prefix_52_alt_7(builder)) {
                                            altMarker7.drop();
                                        } else {
                                            altMarker7.rollbackTo();
                                            PsiBuilder.Marker altMarker6;;
                                            altMarker6 = builder.mark();
                                            if (this.statement_prefix_52_alt_6(builder)) {
                                                altMarker6.drop();
                                            } else {
                                                altMarker6.rollbackTo();
                                                PsiBuilder.Marker altMarker5;;
                                                altMarker5 = builder.mark();
                                                if (this.statement_prefix_52_alt_5(builder)) {
                                                    altMarker5.drop();
                                                } else {
                                                    altMarker5.rollbackTo();
                                                    PsiBuilder.Marker altMarker4;;
                                                    altMarker4 = builder.mark();
                                                    if (this.statement_prefix_52_alt_4(builder)) {
                                                        altMarker4.drop();
                                                    } else {
                                                        altMarker4.rollbackTo();
                                                        PsiBuilder.Marker altMarker3;;
                                                        altMarker3 = builder.mark();
                                                        if (this.statement_prefix_52_alt_3(builder)) {
                                                            altMarker3.drop();
                                                        } else {
                                                            altMarker3.rollbackTo();
                                                            PsiBuilder.Marker altMarker2;;
                                                            altMarker2 = builder.mark();
                                                            if (this.statement_prefix_52_alt_2(builder)) {
                                                                altMarker2.drop();
                                                            } else {
                                                                altMarker2.rollbackTo();
                                                                PsiBuilder.Marker altMarker1;;
                                                                altMarker1 = builder.mark();
                                                                if (this.statement_prefix_52_alt_1(builder)) {
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

    private boolean phaser_name_53_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_11(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_14(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_15(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53_alt_16(PsiBuilder builder) {
        return true;
    }

    private boolean phaser_name_53(PsiBuilder builder) {
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.phaser_name_53_alt_16(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.phaser_name_53_alt_15(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.phaser_name_53_alt_14(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker13;;
                    altMarker13 = builder.mark();
                    if (this.phaser_name_53_alt_13(builder)) {
                        altMarker13.drop();
                    } else {
                        altMarker13.rollbackTo();
                        PsiBuilder.Marker altMarker12;;
                        altMarker12 = builder.mark();
                        if (this.phaser_name_53_alt_12(builder)) {
                            altMarker12.drop();
                        } else {
                            altMarker12.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.phaser_name_53_alt_11(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker10;;
                                altMarker10 = builder.mark();
                                if (this.phaser_name_53_alt_10(builder)) {
                                    altMarker10.drop();
                                } else {
                                    altMarker10.rollbackTo();
                                    PsiBuilder.Marker altMarker9;;
                                    altMarker9 = builder.mark();
                                    if (this.phaser_name_53_alt_9(builder)) {
                                        altMarker9.drop();
                                    } else {
                                        altMarker9.rollbackTo();
                                        PsiBuilder.Marker altMarker8;;
                                        altMarker8 = builder.mark();
                                        if (this.phaser_name_53_alt_8(builder)) {
                                            altMarker8.drop();
                                        } else {
                                            altMarker8.rollbackTo();
                                            PsiBuilder.Marker altMarker7;;
                                            altMarker7 = builder.mark();
                                            if (this.phaser_name_53_alt_7(builder)) {
                                                altMarker7.drop();
                                            } else {
                                                altMarker7.rollbackTo();
                                                PsiBuilder.Marker altMarker6;;
                                                altMarker6 = builder.mark();
                                                if (this.phaser_name_53_alt_6(builder)) {
                                                    altMarker6.drop();
                                                } else {
                                                    altMarker6.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.phaser_name_53_alt_5(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker4;;
                                                        altMarker4 = builder.mark();
                                                        if (this.phaser_name_53_alt_4(builder)) {
                                                            altMarker4.drop();
                                                        } else {
                                                            altMarker4.rollbackTo();
                                                            PsiBuilder.Marker altMarker3;;
                                                            altMarker3 = builder.mark();
                                                            if (this.phaser_name_53_alt_3(builder)) {
                                                                altMarker3.drop();
                                                            } else {
                                                                altMarker3.rollbackTo();
                                                                PsiBuilder.Marker altMarker2;;
                                                                altMarker2 = builder.mark();
                                                                if (this.phaser_name_53_alt_2(builder)) {
                                                                    altMarker2.drop();
                                                                } else {
                                                                    altMarker2.rollbackTo();
                                                                    PsiBuilder.Marker altMarker1;;
                                                                    altMarker1 = builder.mark();
                                                                    if (this.phaser_name_53_alt_1(builder)) {
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

    private boolean sign_54_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean sign_54_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean sign_54_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean sign_54_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean sign_54(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.sign_54_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.sign_54_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.sign_54_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.sign_54_alt_1(builder)) {
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

    private boolean apostrophe_55(PsiBuilder builder) {
        return true;
    }

    private boolean type_declarator_56_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CONSTANT_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_2(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM_DECLARATION_BACKSLASH) && (tt2.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.defterm_215(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_quant_4(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CONSTANT_MISSING_INITIALIZER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_6(PsiBuilder builder) {
        if (!(this.initializer_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_7(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_DECLARATOR) && (tt1.equals("constant"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.type_declarator_56_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.type_declarator_56_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.type_declarator_56_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.type_declarator_56_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.type_declarator_56_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.type_declarator_56_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.CONSTANT);
        return true;
    }

    private boolean type_declarator_56_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SUBSET_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_9(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_quant_10(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.SUBSET_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_12(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_quant_13(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt4.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.type_declarator_56_alt_12(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.type_declarator_56_alt_11(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean type_declarator_56_quant_14(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.type_declarator_56_alt_9(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.type_declarator_56_alt_8(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker12;;
            quantMarker12 = builder.mark();
            if (this.type_declarator_56_quant_10(builder)) {
                quantMarker12.drop();
            } else {
                quantMarker12.rollbackTo();
                break;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.type_declarator_56_quant_13(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_15(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_DECLARATOR) && (tt3.equals("subset"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.type_declarator_56_quant_14(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.SUBSET);
        return true;
    }

    private boolean type_declarator_56_alt_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ENUM_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_17(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_quant_19(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_20(PsiBuilder builder) {
        if (!(this.term_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_21(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ENUM_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_quant_22(PsiBuilder builder) {
        PsiBuilder.Marker altMarker21;
        altMarker21 = builder.mark();
        if (this.type_declarator_56_alt_18(builder)) {
            altMarker21.drop();
        } else {
            altMarker21.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.type_declarator_56_alt_17(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                PsiBuilder.Marker altMarker19;;
                altMarker19 = builder.mark();
                if (this.type_declarator_56_alt_16(builder)) {
                    altMarker19.drop();
                } else {
                    altMarker19.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker22;;
            quantMarker22 = builder.mark();
            if (this.type_declarator_56_quant_19(builder)) {
                quantMarker22.drop();
            } else {
                quantMarker22.rollbackTo();
                break;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker24;
        altMarker24 = builder.mark();
        if (this.type_declarator_56_alt_21(builder)) {
            altMarker24.drop();
        } else {
            altMarker24.rollbackTo();
            PsiBuilder.Marker altMarker23;;
            altMarker23 = builder.mark();
            if (this.type_declarator_56_alt_20(builder)) {
                altMarker23.drop();
            } else {
                altMarker23.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_declarator_56_alt_23(PsiBuilder builder) {
        PsiBuilder.Marker marker18;
        marker18 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_DECLARATOR) && (tt5.equals("enum"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker25;
        quantMarker25 = builder.mark();
        if (this.type_declarator_56_quant_22(builder)) {
            quantMarker25.drop();
        } else {
            quantMarker25.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.ENUM);
        return true;
    }

    private boolean type_declarator_56(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.type_declarator_56_alt_23(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.type_declarator_56_alt_15(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.type_declarator_56_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rxqq_57_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_57_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqq_57_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_57_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_57_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxqq_57_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_57_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_57_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxqq_57_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_57_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqq_57_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxqq_57_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxqq_57(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxqq_57_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxqq_57_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxqq_57_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxqq_57_alt_2(builder)) {
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

    private boolean octint_58_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octint_58_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.octint_58_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octint_58_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octint_58(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octint_58_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octint_58_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean blorst_59_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_BLORST) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blorst_59_alt_2(PsiBuilder builder) {
        if (!(this.statement_105(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_59_alt_3(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean blorst_59(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.blorst_59_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.blorst_59_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.blorst_59_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_prefix_phaser_60(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PHASER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean vws_61(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean declarator_62_alt_1(PsiBuilder builder) {
        if (!(this.type_declarator_56(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_alt_2(PsiBuilder builder) {
        if (!(this.regex_declarator_137(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_alt_3(PsiBuilder builder) {
        if (!(this.routine_declarator_97(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_quant_4(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_quant_5(PsiBuilder builder) {
        if (!(this.initializer_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.declarator_62_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.declarator_62_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean declarator_62_alt_7(PsiBuilder builder) {
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
        if (!(this.signature_92(builder))) {
            return false;
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.declarator_62_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_62_quant_8(PsiBuilder builder) {
        if (!(this.initializer_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker marker10;
        marker10 = builder.mark();
        if (!(this.variable_declarator_167(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.declarator_62_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker10.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_62_quant_10(PsiBuilder builder) {
        if (!(this.initializer_135(builder))) {
            return false;
        }
        return true;
    }

    private boolean declarator_62_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM_DECLARATION_BACKSLASH) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.defterm_215(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.declarator_62_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker13.done(Perl6ElementTypes.VARIABLE_DECLARATION);
        return true;
    }

    private boolean declarator_62(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.declarator_62_alt_11(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.declarator_62_alt_9(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.declarator_62_alt_7(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.declarator_62_alt_3(builder)) {
                        altMarker3.drop();
                    } else {
                        altMarker3.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.declarator_62_alt_2(builder)) {
                            altMarker2.drop();
                        } else {
                            altMarker2.rollbackTo();
                            PsiBuilder.Marker altMarker1;;
                            altMarker1 = builder.mark();
                            if (this.declarator_62_alt_1(builder)) {
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

    private boolean statement_prefix_sink_63(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("sink"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SINK);
        return true;
    }

    private boolean backmod_64_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_64_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_64_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_64_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean backmod_64(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.backmod_64_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.backmod_64_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.backmod_64_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.backmod_64_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean rxtermish_65_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean rxtermish_65(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.rxtermish_65_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean termaltseq_66_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termaltseq_66_alt_2(PsiBuilder builder) {
        if (!(this.termconjseq_34(builder))) {
            return false;
        }
        return true;
    }

    private boolean termaltseq_66_quant_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("||"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termaltseq_66_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termaltseq_66_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termaltseq_66(PsiBuilder builder) {
        if (!(this.termconjseq_34(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termaltseq_66_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_CONTROL_67_quant_1(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CONTROL_67(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CONTROL"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CONTROL_67_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CONTROL_STATEMENT);
        return true;
    }

    private boolean statement_control_given_68_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_given_68(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("given"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_given_68_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.GIVEN_STATEMENT);
        return true;
    }

    private boolean statement_control_loop_69_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_2(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_3(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt4.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.statement_control_loop_69_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt3.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_loop_69_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_loop_69_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_7(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_loop_69_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_loop_69_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.statement_control_loop_69_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69_quant_8(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_loop_69(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("loop"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_loop_69_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.statement_control_loop_69_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.LOOP_STATEMENT);
        return true;
    }

    private boolean statement_control_for_70_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_for_70(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("for"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_for_70_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FOR_STATEMENT);
        return true;
    }

    private boolean capterm_71_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_INVALID) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_71_alt_2(PsiBuilder builder) {
        if (!(this.termish_98(builder))) {
            return false;
        }
        return true;
    }

    private boolean capterm_71_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean capterm_71_alt_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_205(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.capterm_71_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean capterm_71(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.CAPTURE_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.capterm_71_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.capterm_71_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.capterm_71_alt_1(builder)) {
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

    private boolean assertion_72_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_ASSERTION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_2(PsiBuilder builder) {
        if (!(this.cclass_elem_186(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.assertion_72_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.assertion_72_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        marker2.done(Perl6ElementTypes.REGEX_CCLASS);
        return true;
    }

    private boolean assertion_72_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.assertion_72_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.assertion_72_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.assertion_72_alt_4(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean assertion_72_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.assertion_72_quant_7(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean assertion_72_alt_9(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_11(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_39(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.assertion_72_quant_10(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean assertion_72_alt_12(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt4.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_13(PsiBuilder builder) {
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.assertion_72_alt_12(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.assertion_72_alt_11(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean assertion_72_alt_14(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker15;
        quantMarker15 = builder.mark();
        if (this.assertion_72_quant_13(builder)) {
            quantMarker15.drop();
        } else {
            quantMarker15.rollbackTo();
        }
        return true;
    }

    private boolean assertion_72_alt_15(PsiBuilder builder) {
        if (!(this.rxcodeblock_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_17(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_19(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        if (!(this.regex_nibbler_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_39(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker22;
        quantMarker22 = builder.mark();
        if (this.assertion_72_quant_20(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        return true;
    }

    private boolean assertion_72_alt_22(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt7.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.rxarglist_39(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_23(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt8.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_24(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_END) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_quant_25(PsiBuilder builder) {
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.assertion_72_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker25;;
            altMarker25 = builder.mark();
            if (this.assertion_72_alt_23(builder)) {
                altMarker25.drop();
            } else {
                altMarker25.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.assertion_72_alt_22(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker23;;
                    altMarker23 = builder.mark();
                    if (this.assertion_72_alt_21(builder)) {
                        altMarker23.drop();
                    } else {
                        altMarker23.rollbackTo();
                        PsiBuilder.Marker altMarker21;;
                        altMarker21 = builder.mark();
                        if (this.assertion_72_alt_19(builder)) {
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

    private boolean assertion_72_alt_26(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.assertion_72_alt_18(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.assertion_72_alt_17(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker27;
        quantMarker27 = builder.mark();
        if (this.assertion_72_quant_25(builder)) {
            quantMarker27.drop();
        } else {
            quantMarker27.rollbackTo();
        }
        return true;
    }

    private boolean assertion_72_alt_27(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt9.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_28(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_LOOKAROUND) && (tt10.equals("?"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_29(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_OPERATOR) && (tt11.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_72(builder))) {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_30(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72_alt_31(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean assertion_72(PsiBuilder builder) {
        PsiBuilder.Marker altMarker33;
        altMarker33 = builder.mark();
        if (this.assertion_72_alt_31(builder)) {
            altMarker33.drop();
        } else {
            altMarker33.rollbackTo();
            PsiBuilder.Marker altMarker32;;
            altMarker32 = builder.mark();
            if (this.assertion_72_alt_30(builder)) {
                altMarker32.drop();
            } else {
                altMarker32.rollbackTo();
                PsiBuilder.Marker altMarker31;;
                altMarker31 = builder.mark();
                if (this.assertion_72_alt_29(builder)) {
                    altMarker31.drop();
                } else {
                    altMarker31.rollbackTo();
                    PsiBuilder.Marker altMarker30;;
                    altMarker30 = builder.mark();
                    if (this.assertion_72_alt_28(builder)) {
                        altMarker30.drop();
                    } else {
                        altMarker30.rollbackTo();
                        PsiBuilder.Marker altMarker29;;
                        altMarker29 = builder.mark();
                        if (this.assertion_72_alt_27(builder)) {
                            altMarker29.drop();
                        } else {
                            altMarker29.rollbackTo();
                            PsiBuilder.Marker altMarker28;;
                            altMarker28 = builder.mark();
                            if (this.assertion_72_alt_26(builder)) {
                                altMarker28.drop();
                            } else {
                                altMarker28.rollbackTo();
                                PsiBuilder.Marker altMarker18;;
                                altMarker18 = builder.mark();
                                if (this.assertion_72_alt_16(builder)) {
                                    altMarker18.drop();
                                } else {
                                    altMarker18.rollbackTo();
                                    PsiBuilder.Marker altMarker17;;
                                    altMarker17 = builder.mark();
                                    if (this.assertion_72_alt_15(builder)) {
                                        altMarker17.drop();
                                    } else {
                                        altMarker17.rollbackTo();
                                        PsiBuilder.Marker altMarker16;;
                                        altMarker16 = builder.mark();
                                        if (this.assertion_72_alt_14(builder)) {
                                            altMarker16.drop();
                                        } else {
                                            altMarker16.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.assertion_72_alt_9(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.assertion_72_alt_8(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker5;;
                                                    altMarker5 = builder.mark();
                                                    if (this.assertion_72_alt_3(builder)) {
                                                        altMarker5.drop();
                                                    } else {
                                                        altMarker5.rollbackTo();
                                                        PsiBuilder.Marker altMarker1;;
                                                        altMarker1 = builder.mark();
                                                        if (this.assertion_72_alt_1(builder)) {
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

    private boolean infix_73(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean coloncircumfix_74(PsiBuilder builder) {
        if (!(this.circumfix_194(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_supply_75(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("supply"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUPPLY);
        return true;
    }

    private boolean statement_prefix_race_76(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("race"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.RACE);
        return true;
    }

    private boolean lambda_77_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_77_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean lambda_77(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.lambda_77_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.lambda_77_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_2(PsiBuilder builder) {
        if (!(this.term_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt1.equals("handles"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.trait_mod_78_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.trait_mod_78_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_5(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt2.equals("returns"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.trait_mod_78_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.trait_mod_78_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_8(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt3.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.trait_mod_78_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.trait_mod_78_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_12(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.trait_mod_78_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.trait_mod_78_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_14(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt4.equals("will"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker14;
        altMarker14 = builder.mark();
        if (this.trait_mod_78_alt_13(builder)) {
            altMarker14.drop();
        } else {
            altMarker14.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.trait_mod_78_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_15(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_16(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_17(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt5.equals("does"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.trait_mod_78_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.trait_mod_78_alt_15(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_19(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_20(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt6.equals("hides"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.trait_mod_78_alt_19(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.trait_mod_78_alt_18(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78_alt_21(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.TRAIT_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_22(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean trait_mod_78_alt_23(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TRAIT) && (tt7.equals("is"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.trait_mod_78_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.trait_mod_78_alt_21(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean trait_mod_78(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker24;
        altMarker24 = builder.mark();
        if (this.trait_mod_78_alt_23(builder)) {
            altMarker24.drop();
        } else {
            altMarker24.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.trait_mod_78_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.trait_mod_78_alt_17(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.trait_mod_78_alt_14(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        PsiBuilder.Marker altMarker10;;
                        altMarker10 = builder.mark();
                        if (this.trait_mod_78_alt_9(builder)) {
                            altMarker10.drop();
                        } else {
                            altMarker10.rollbackTo();
                            PsiBuilder.Marker altMarker7;;
                            altMarker7 = builder.mark();
                            if (this.trait_mod_78_alt_6(builder)) {
                                altMarker7.drop();
                            } else {
                                altMarker7.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.trait_mod_78_alt_3(builder)) {
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

    private boolean rat_number_79(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.bare_rat_number_204(builder))) {
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

    private boolean term_self_80(PsiBuilder builder) {
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

    private boolean stdstopper_81_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_81_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stdstopper_81(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stdstopper_81_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stdstopper_81_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_82_alt_1(PsiBuilder builder) {
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

    private boolean variable_82_alt_2(PsiBuilder builder) {
        if (!(this.contextualizer_155(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_82_alt_3(PsiBuilder builder) {
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

    private boolean variable_82_quant_4(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) && (tt1.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_82_alt_5(PsiBuilder builder) {
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
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.variable_82_quant_4(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker6.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_82_alt_6(PsiBuilder builder) {
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

    private boolean variable_82_alt_7(PsiBuilder builder) {
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

    private boolean variable_82_alt_8(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_82_alt_9(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_82_quant_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker15;
        altMarker15 = builder.mark();
        if (this.variable_82_alt_9(builder)) {
            altMarker15.drop();
        } else {
            altMarker15.rollbackTo();
            PsiBuilder.Marker altMarker14;;
            altMarker14 = builder.mark();
            if (this.variable_82_alt_8(builder)) {
                altMarker14.drop();
            } else {
                altMarker14.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_82_quant_11(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.variable_82_quant_10(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        if (!(this.postcircumfix_164(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_82_alt_12(PsiBuilder builder) {
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
        if (this.variable_82_quant_11(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        marker13.done(Perl6ElementTypes.METHOD_CALL);
        return true;
    }

    private boolean variable_82_quant_13(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_82_quant_14(PsiBuilder builder) {
        if (!(this.infixish_138(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.variable_82_quant_13(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        return true;
    }

    private boolean variable_82_alt_15(PsiBuilder builder) {
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
        if (this.variable_82_quant_14(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        marker19.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean variable_82(PsiBuilder builder) {
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.variable_82_alt_15(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker18;;
            altMarker18 = builder.mark();
            if (this.variable_82_alt_12(builder)) {
                altMarker18.drop();
            } else {
                altMarker18.rollbackTo();
                PsiBuilder.Marker altMarker12;;
                altMarker12 = builder.mark();
                if (this.variable_82_alt_7(builder)) {
                    altMarker12.drop();
                } else {
                    altMarker12.rollbackTo();
                    PsiBuilder.Marker altMarker10;;
                    altMarker10 = builder.mark();
                    if (this.variable_82_alt_6(builder)) {
                        altMarker10.drop();
                    } else {
                        altMarker10.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.variable_82_alt_5(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.variable_82_alt_3(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker3;;
                                altMarker3 = builder.mark();
                                if (this.variable_82_alt_2(builder)) {
                                    altMarker3.drop();
                                } else {
                                    altMarker3.rollbackTo();
                                    PsiBuilder.Marker altMarker2;;
                                    altMarker2 = builder.mark();
                                    if (this.variable_82_alt_1(builder)) {
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

    private boolean term_hyperwhatever_83(PsiBuilder builder) {
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

    private boolean statement_control_when_84_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_when_84(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("when"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_when_84_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHEN_STATEMENT);
        return true;
    }

    private boolean spacey_85_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_85_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean spacey_85(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.spacey_85_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.spacey_85_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_86_alt_1(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_86_alt_2(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_86_alt_3(PsiBuilder builder) {
        if (!(this.named_param_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean named_param_86_quant_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean named_param_86_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.named_param_86_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.named_param_86_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.named_param_86_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean named_param_86_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_SYNTAX) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.named_param_86_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean named_param_86_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.named_param_86_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        return true;
    }

    private boolean named_param_86_quant_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.named_param_86_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.named_param_86_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean named_param_86(PsiBuilder builder) {
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
        if (this.named_param_86_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NAMED_PARAMETER);
        return true;
    }

    private boolean charnames_87_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_87_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charnames_87_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.charnames_87_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.charname_45(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.charnames_87_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charnames_87(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.charnames_87_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.charnames_87_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_88_alt_1(PsiBuilder builder) {
        if (!(this.statement_control_QUIT_41(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_2(PsiBuilder builder) {
        if (!(this.statement_control_CONTROL_67(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_3(PsiBuilder builder) {
        if (!(this.statement_control_CATCH_174(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_4(PsiBuilder builder) {
        if (!(this.statement_control_default_189(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_5(PsiBuilder builder) {
        if (!(this.statement_control_when_84(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_6(PsiBuilder builder) {
        if (!(this.statement_control_given_68(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_7(PsiBuilder builder) {
        if (!(this.statement_control_require_104(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_use_218(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_9(PsiBuilder builder) {
        if (!(this.statement_control_no_120(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_10(PsiBuilder builder) {
        if (!(this.statement_control_import_183(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_11(PsiBuilder builder) {
        if (!(this.statement_control_need_157(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_12(PsiBuilder builder) {
        if (!(this.statement_control_loop_69(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_13(PsiBuilder builder) {
        if (!(this.statement_control_whenever_199(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_14(PsiBuilder builder) {
        if (!(this.statement_control_for_70(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_15(PsiBuilder builder) {
        if (!(this.statement_control_repeat_100(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_16(PsiBuilder builder) {
        if (!(this.statement_control_until_5(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_17(PsiBuilder builder) {
        if (!(this.statement_control_while_145(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_18(PsiBuilder builder) {
        if (!(this.statement_control_without_36(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_19(PsiBuilder builder) {
        if (!(this.statement_control_unless_175(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88_alt_20(PsiBuilder builder) {
        if (!(this.statement_control_if_4(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_88(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.statement_control_88_alt_20(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.statement_control_88_alt_19(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker18;;
                altMarker18 = builder.mark();
                if (this.statement_control_88_alt_18(builder)) {
                    altMarker18.drop();
                } else {
                    altMarker18.rollbackTo();
                    PsiBuilder.Marker altMarker17;;
                    altMarker17 = builder.mark();
                    if (this.statement_control_88_alt_17(builder)) {
                        altMarker17.drop();
                    } else {
                        altMarker17.rollbackTo();
                        PsiBuilder.Marker altMarker16;;
                        altMarker16 = builder.mark();
                        if (this.statement_control_88_alt_16(builder)) {
                            altMarker16.drop();
                        } else {
                            altMarker16.rollbackTo();
                            PsiBuilder.Marker altMarker15;;
                            altMarker15 = builder.mark();
                            if (this.statement_control_88_alt_15(builder)) {
                                altMarker15.drop();
                            } else {
                                altMarker15.rollbackTo();
                                PsiBuilder.Marker altMarker14;;
                                altMarker14 = builder.mark();
                                if (this.statement_control_88_alt_14(builder)) {
                                    altMarker14.drop();
                                } else {
                                    altMarker14.rollbackTo();
                                    PsiBuilder.Marker altMarker13;;
                                    altMarker13 = builder.mark();
                                    if (this.statement_control_88_alt_13(builder)) {
                                        altMarker13.drop();
                                    } else {
                                        altMarker13.rollbackTo();
                                        PsiBuilder.Marker altMarker12;;
                                        altMarker12 = builder.mark();
                                        if (this.statement_control_88_alt_12(builder)) {
                                            altMarker12.drop();
                                        } else {
                                            altMarker12.rollbackTo();
                                            PsiBuilder.Marker altMarker11;;
                                            altMarker11 = builder.mark();
                                            if (this.statement_control_88_alt_11(builder)) {
                                                altMarker11.drop();
                                            } else {
                                                altMarker11.rollbackTo();
                                                PsiBuilder.Marker altMarker10;;
                                                altMarker10 = builder.mark();
                                                if (this.statement_control_88_alt_10(builder)) {
                                                    altMarker10.drop();
                                                } else {
                                                    altMarker10.rollbackTo();
                                                    PsiBuilder.Marker altMarker9;;
                                                    altMarker9 = builder.mark();
                                                    if (this.statement_control_88_alt_9(builder)) {
                                                        altMarker9.drop();
                                                    } else {
                                                        altMarker9.rollbackTo();
                                                        PsiBuilder.Marker altMarker8;;
                                                        altMarker8 = builder.mark();
                                                        if (this.statement_control_88_alt_8(builder)) {
                                                            altMarker8.drop();
                                                        } else {
                                                            altMarker8.rollbackTo();
                                                            PsiBuilder.Marker altMarker7;;
                                                            altMarker7 = builder.mark();
                                                            if (this.statement_control_88_alt_7(builder)) {
                                                                altMarker7.drop();
                                                            } else {
                                                                altMarker7.rollbackTo();
                                                                PsiBuilder.Marker altMarker6;;
                                                                altMarker6 = builder.mark();
                                                                if (this.statement_control_88_alt_6(builder)) {
                                                                    altMarker6.drop();
                                                                } else {
                                                                    altMarker6.rollbackTo();
                                                                    PsiBuilder.Marker altMarker5;;
                                                                    altMarker5 = builder.mark();
                                                                    if (this.statement_control_88_alt_5(builder)) {
                                                                        altMarker5.drop();
                                                                    } else {
                                                                        altMarker5.rollbackTo();
                                                                        PsiBuilder.Marker altMarker4;;
                                                                        altMarker4 = builder.mark();
                                                                        if (this.statement_control_88_alt_4(builder)) {
                                                                            altMarker4.drop();
                                                                        } else {
                                                                            altMarker4.rollbackTo();
                                                                            PsiBuilder.Marker altMarker3;;
                                                                            altMarker3 = builder.mark();
                                                                            if (this.statement_control_88_alt_3(builder)) {
                                                                                altMarker3.drop();
                                                                            } else {
                                                                                altMarker3.rollbackTo();
                                                                                PsiBuilder.Marker altMarker2;;
                                                                                altMarker2 = builder.mark();
                                                                                if (this.statement_control_88_alt_2(builder)) {
                                                                                    altMarker2.drop();
                                                                                } else {
                                                                                    altMarker2.rollbackTo();
                                                                                    PsiBuilder.Marker altMarker1;;
                                                                                    altMarker1 = builder.mark();
                                                                                    if (this.statement_control_88_alt_1(builder)) {
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

    private boolean termseq_89(PsiBuilder builder) {
        if (!(this.termaltseq_66(builder))) {
            return false;
        }
        return true;
    }

    private boolean prefixish_90_alt_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.prefix_193(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PREFIX);
        return true;
    }

    private boolean prefixish_90_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        if (!(this.prefix_193(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker3.done(Perl6ElementTypes.HYPER_METAOP);
        return true;
    }

    private boolean prefixish_90(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.prefixish_90_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.prefixish_90_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_now_91(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("now"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_121(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean signature_92_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean signature_92_alt_2(PsiBuilder builder) {
        if (!(this.parameter_118(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_92_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_92_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.signature_92_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.signature_92_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean signature_92_quant_5(PsiBuilder builder) {
        if (!(this.param_sep_37(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.signature_92_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean signature_92_alt_6(PsiBuilder builder) {
        if (!(this.parameter_118(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.signature_92_quant_5(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean signature_92_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_PARAMETERS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_92_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_RETURN_CONSTRAINT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean signature_92_alt_9(PsiBuilder builder) {
        if (!(this.value_140(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_92_alt_10(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_92_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.signature_92_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.signature_92_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean signature_92_quant_12(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RETURN_ARROW) && (tt1.equals("-->"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.signature_92_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.signature_92_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        marker8.done(Perl6ElementTypes.RETURN_CONSTRAINT);
        return true;
    }

    private boolean signature_92(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.signature_92_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.signature_92_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.signature_92_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.signature_92_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean post_constraint_93_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean post_constraint_93_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.post_constraint_93_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean post_constraint_93_quant_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_93_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.post_constraint_93_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_93_quant_5(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean post_constraint_93_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.post_constraint_93_quant_5(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean post_constraint_93(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.post_constraint_93_alt_6(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.post_constraint_93_alt_4(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.post_constraint_93_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.regex_def_94_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean regex_def_94_quant_4(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MISSING_REGEX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_alt_6(PsiBuilder builder) {
        if (!(this.enter_regex_nibblier_214(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_quant_8(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt4.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_def_94_quant_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt3.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.regex_def_94_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.regex_def_94_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.regex_def_94_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.regex_def_94_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean regex_def_94(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.regex_def_94_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.regex_def_94_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.regex_def_94_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.regex_def_94_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean term_empty_set_95(PsiBuilder builder) {
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

    private boolean quote_96_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\uFF63"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\uFF62"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_Q_177(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.quote_96_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_4(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.quote_96_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_6(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u201E"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.quote_96_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("\u201D"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("\u201C"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quote_96_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt8.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_10(PsiBuilder builder) {
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt7.equals("\""))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.quote_96_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_12(PsiBuilder builder) {
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt9.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.quote_96_quant_11(builder)) {
            quantMarker12.drop();
        } else {
            quantMarker12.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_14(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt10.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.quote_96_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt12.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_16(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt11.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.quote_96_quant_15(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_quant_17(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt14.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_96_alt_18(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt13.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.quote_96_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean quote_96_alt_19(PsiBuilder builder) {
        String tt15;
        tt15 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt15.equals("Q"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quibble_103(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_96(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.quote_96_alt_19(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.quote_96_alt_18(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker17;;
                altMarker17 = builder.mark();
                if (this.quote_96_alt_16(builder)) {
                    altMarker17.drop();
                } else {
                    altMarker17.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.quote_96_alt_14(builder)) {
                        altMarker15.drop();
                    } else {
                        altMarker15.rollbackTo();
                        PsiBuilder.Marker altMarker13;;
                        altMarker13 = builder.mark();
                        if (this.quote_96_alt_12(builder)) {
                            altMarker13.drop();
                        } else {
                            altMarker13.rollbackTo();
                            PsiBuilder.Marker altMarker11;;
                            altMarker11 = builder.mark();
                            if (this.quote_96_alt_10(builder)) {
                                altMarker11.drop();
                            } else {
                                altMarker11.rollbackTo();
                                PsiBuilder.Marker altMarker9;;
                                altMarker9 = builder.mark();
                                if (this.quote_96_alt_8(builder)) {
                                    altMarker9.drop();
                                } else {
                                    altMarker9.rollbackTo();
                                    PsiBuilder.Marker altMarker7;;
                                    altMarker7 = builder.mark();
                                    if (this.quote_96_alt_6(builder)) {
                                        altMarker7.drop();
                                    } else {
                                        altMarker7.rollbackTo();
                                        PsiBuilder.Marker altMarker5;;
                                        altMarker5 = builder.mark();
                                        if (this.quote_96_alt_4(builder)) {
                                            altMarker5.drop();
                                        } else {
                                            altMarker5.rollbackTo();
                                            PsiBuilder.Marker altMarker3;;
                                            altMarker3 = builder.mark();
                                            if (this.quote_96_alt_2(builder)) {
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
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean routine_declarator_97_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_97_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.method_def_15(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_97_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.routine_def_128(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_declarator_97(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.routine_declarator_97_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.routine_declarator_97_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.routine_declarator_97_alt_1(builder)) {
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

    private boolean termish_98(PsiBuilder builder) {
        if (!(this.term_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_whatever_99(PsiBuilder builder) {
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

    private boolean statement_control_repeat_100_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_control_repeat_100_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt2.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt3.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_repeat_100_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_repeat_100_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_repeat_100_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_100_alt_6(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_repeat_100_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_100_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt4.equals("until"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt5.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_quant_9(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_repeat_100_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.statement_control_repeat_100_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.statement_control_repeat_100_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                return false;
            }
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.statement_control_repeat_100_quant_9(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_repeat_100(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("repeat"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.statement_control_repeat_100_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_control_repeat_100_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_repeat_100_alt_1(builder)) {
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

    private boolean termalt_101_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_MISSING_TERM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean termalt_101_alt_2(PsiBuilder builder) {
        if (!(this.termconj_12(builder))) {
            return false;
        }
        return true;
    }

    private boolean termalt_101_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.termalt_101_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.termalt_101_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean termalt_101(PsiBuilder builder) {
        if (!(this.termconj_12(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.termalt_101_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean dottyop_102_quant_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_102_quant_2(PsiBuilder builder) {
        if (!(this.methodop_133(builder))) {
            return false;
        }
        return true;
    }

    private boolean dottyop_102(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.dottyop_102_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.dottyop_102_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean quibble_103_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quibble_103(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_178(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.quibble_103_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_104_alt_1(PsiBuilder builder) {
        if (!(this.term_46(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_104_alt_2(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_104_alt_3(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_104_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_require_104_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_require_104_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_require_104_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_control_require_104_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_require_104_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_require_104(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("require"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_require_104_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REQUIRE_STATEMENT);
        return true;
    }

    private boolean statement_105_alt_1(PsiBuilder builder) {
        if (!(this.bogus_statement_166(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_105_alt_2(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_182(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_105_quant_3(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if (!(this.statement_mod_loop_182(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_105_alt_4(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if (!(this.statement_mod_cond_206(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_105_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean statement_105_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean statement_105_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_105_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_105_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_105_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean statement_105_alt_7(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_105_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean statement_105_alt_8(PsiBuilder builder) {
        if (!(this.statement_control_88(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_105(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.statement_105_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.statement_105_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.statement_105_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean multi_declarator_106_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR_NULL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.declarator_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_106_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean multi_declarator_106_alt_3(PsiBuilder builder) {
        if (!(this.routine_def_128(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_106_alt_4(PsiBuilder builder) {
        if (!(this.declarator_62(builder))) {
            return false;
        }
        return true;
    }

    private boolean multi_declarator_106_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.MULTI_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.multi_declarator_106_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.multi_declarator_106_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.multi_declarator_106_alt_2(builder)) {
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

    private boolean multi_declarator_106(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.multi_declarator_106_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.multi_declarator_106_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean onlystar_107(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ONLY_STAR) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
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

    private boolean package_declarator_108(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PACKAGE_DECLARATOR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.package_def_11(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.PACKAGE_DECLARATION);
        return true;
    }

    private boolean package_kind_109_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean package_kind_109(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.package_kind_109_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.package_kind_109_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.package_kind_109_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.package_kind_109_alt_5(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        PsiBuilder.Marker altMarker4;;
                        altMarker4 = builder.mark();
                        if (this.package_kind_109_alt_4(builder)) {
                            altMarker4.drop();
                        } else {
                            altMarker4.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.package_kind_109_alt_3(builder)) {
                                altMarker3.drop();
                            } else {
                                altMarker3.rollbackTo();
                                PsiBuilder.Marker altMarker2;;
                                altMarker2 = builder.mark();
                                if (this.package_kind_109_alt_2(builder)) {
                                    altMarker2.drop();
                                } else {
                                    altMarker2.rollbackTo();
                                    PsiBuilder.Marker altMarker1;;
                                    altMarker1 = builder.mark();
                                    if (this.package_kind_109_alt_1(builder)) {
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

    private boolean dec_number_110_alt_1(PsiBuilder builder) {
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

    private boolean dec_number_110_alt_2(PsiBuilder builder) {
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

    private boolean dec_number_110(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.dec_number_110_alt_2(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.dec_number_110_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_111_alt_1(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_ESCAPE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_7(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BAD_ESCAPE) && (tt1.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_8(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_escape_111_alt_9(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.quote_escape_111_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.quote_escape_111_alt_7(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quote_escape_111(PsiBuilder builder) {
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.quote_escape_111_alt_9(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quote_escape_111_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.quote_escape_111_alt_5(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.quote_escape_111_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.quote_escape_111_alt_3(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.quote_escape_111_alt_2(builder)) {
                                altMarker2.drop();
                            } else {
                                altMarker2.rollbackTo();
                                PsiBuilder.Marker altMarker1;;
                                altMarker1 = builder.mark();
                                if (this.quote_escape_111_alt_1(builder)) {
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

    private boolean signed_integer_112(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_type_const_113(PsiBuilder builder) {
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

    private boolean statementlist_114_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statementlist_114_alt_2(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statementlist_114_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.statement_105(builder))) {
            return false;
        }
        if (!(this.eat_terminator_210(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.STATEMENT);
        return true;
    }

    private boolean statementlist_114(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.statementlist_114_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.statementlist_114_alt_1(builder)) {
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
            if (this.statementlist_114_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        marker3.done(Perl6ElementTypes.STATEMENT_LIST);
        return true;
    }

    private boolean postfixish_nometa_115_alt_1(PsiBuilder builder) {
        if (!(this.privop_27(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_nometa_115_alt_2(PsiBuilder builder) {
        if (!(this.dotty_6(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_nometa_115_alt_3(PsiBuilder builder) {
        if (!(this.postcircumfix_164(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_nometa_115_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.postfix_136(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.POSTFIX);
        return true;
    }

    private boolean postfixish_nometa_115(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.postfixish_nometa_115_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.postfixish_nometa_115_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.postfixish_nometa_115_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.postfixish_nometa_115_alt_1(builder)) {
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

    private boolean bogus_end_116(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean longname_117(PsiBuilder builder) {
        if (!(this.name_29(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_1(PsiBuilder builder) {
        if (!(this.named_param_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_2(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.parameter_118_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.parameter_118_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.parameter_118_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean parameter_118_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_6(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.parameter_118_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.parameter_118_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_118_alt_8(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt1.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_9(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt2.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt3.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.parameter_118_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.parameter_118_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.parameter_118_alt_8(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.param_term_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_quant_12(PsiBuilder builder) {
        if (!(this.type_constraint_146(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_ANON) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_14(PsiBuilder builder) {
        if (!(this.named_param_86(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_15(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_quant_16(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_17(PsiBuilder builder) {
        PsiBuilder.Marker altMarker17;
        altMarker17 = builder.mark();
        if (this.parameter_118_alt_15(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker16;;
            altMarker16 = builder.mark();
            if (this.parameter_118_alt_14(builder)) {
                altMarker16.drop();
            } else {
                altMarker16.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.parameter_118_quant_16(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean parameter_118_alt_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_19(PsiBuilder builder) {
        if (!(this.param_var_207(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker21;
        altMarker21 = builder.mark();
        if (this.parameter_118_alt_19(builder)) {
            altMarker21.drop();
        } else {
            altMarker21.rollbackTo();
            PsiBuilder.Marker altMarker20;;
            altMarker20 = builder.mark();
            if (this.parameter_118_alt_18(builder)) {
                altMarker20.drop();
            } else {
                altMarker20.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean parameter_118_alt_21(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt4.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_22(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARAMETER_QUANTIFIER) && (tt5.equals("|"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_23(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM_DECLARATION_BACKSLASH) && (tt6.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_24(PsiBuilder builder) {
        PsiBuilder.Marker altMarker25;
        altMarker25 = builder.mark();
        if (this.parameter_118_alt_23(builder)) {
            altMarker25.drop();
        } else {
            altMarker25.rollbackTo();
            PsiBuilder.Marker altMarker24;;
            altMarker24 = builder.mark();
            if (this.parameter_118_alt_22(builder)) {
                altMarker24.drop();
            } else {
                altMarker24.rollbackTo();
                PsiBuilder.Marker altMarker23;;
                altMarker23 = builder.mark();
                if (this.parameter_118_alt_21(builder)) {
                    altMarker23.drop();
                } else {
                    altMarker23.rollbackTo();
                    return false;
                }
            }
        }
        if (!(this.param_term_10(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_alt_25(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.parameter_118_quant_12(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker14;;
            quantMarker14 = builder.mark();
            if (this.parameter_118_quant_12(builder)) {
                quantMarker14.drop();
            } else {
                quantMarker14.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker26;
        altMarker26 = builder.mark();
        if (this.parameter_118_alt_24(builder)) {
            altMarker26.drop();
        } else {
            altMarker26.rollbackTo();
            PsiBuilder.Marker altMarker22;;
            altMarker22 = builder.mark();
            if (this.parameter_118_alt_20(builder)) {
                altMarker22.drop();
            } else {
                altMarker22.rollbackTo();
                PsiBuilder.Marker altMarker19;;
                altMarker19 = builder.mark();
                if (this.parameter_118_alt_17(builder)) {
                    altMarker19.drop();
                } else {
                    altMarker19.rollbackTo();
                    PsiBuilder.Marker altMarker15;;
                    altMarker15 = builder.mark();
                    if (this.parameter_118_alt_13(builder)) {
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

    private boolean parameter_118_quant_26(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_quant_27(PsiBuilder builder) {
        if (!(this.post_constraint_93(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118_quant_28(PsiBuilder builder) {
        if (!(this.default_value_33(builder))) {
            return false;
        }
        return true;
    }

    private boolean parameter_118(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker27;
        altMarker27 = builder.mark();
        if (this.parameter_118_alt_25(builder)) {
            altMarker27.drop();
        } else {
            altMarker27.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.parameter_118_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.parameter_118_alt_7(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.parameter_118_alt_4(builder)) {
                        altMarker5.drop();
                    } else {
                        altMarker5.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker28;;
            quantMarker28 = builder.mark();
            if (this.parameter_118_quant_26(builder)) {
                quantMarker28.drop();
            } else {
                quantMarker28.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker29;;
            quantMarker29 = builder.mark();
            if (this.parameter_118_quant_27(builder)) {
                quantMarker29.drop();
            } else {
                quantMarker29.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker30;
        quantMarker30 = builder.mark();
        if (this.parameter_118_quant_28(builder)) {
            quantMarker30.drop();
        } else {
            quantMarker30.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER);
        return true;
    }

    private boolean statement_prefix_eager_119(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("eager"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.EAGER);
        return true;
    }

    private boolean statement_control_no_120_quant_1(PsiBuilder builder) {
        if (!(this.spacey_85(builder))) {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_120_quant_2(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_no_120_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_no_120(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("no"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_no_120_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NO_STATEMENT);
        return true;
    }

    private boolean tok_121(PsiBuilder builder) {
        if (!(this.end_keyword_139(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_122_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_3(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt2.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_5(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_PARAMETER_BRACKET) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.typename_122_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean typename_122_quant_6(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_7(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_122_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_alt_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TYPE_COERCION_PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.typename_122_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.typename_122_alt_9(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.typename_122_alt_8(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_122_alt_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INCOMPLETE_TYPE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean typename_122_alt_12(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean typename_122_quant_13(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.NAME) && (tt5.equals("of"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.typename_122_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.typename_122_alt_11(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean typename_122(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.typename_122_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.typename_122_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.typename_122_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.typename_122_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.typename_122_quant_6(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.typename_122_quant_10(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.typename_122_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.TYPE_NAME);
        return true;
    }

    private boolean hexints_123_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_123_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexints_123_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.hexints_123_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.hexint_187(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.hexints_123_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexints_123(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexints_123_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexints_123_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_do_124(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("do"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.DO);
        return true;
    }

    private boolean term_onlystar_125(PsiBuilder builder) {
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

    private boolean statement_mod_loop_keyword_126_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_126_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_126_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_126_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean statement_mod_loop_keyword_126(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_mod_loop_keyword_126_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_mod_loop_keyword_126_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.statement_mod_loop_keyword_126_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.statement_mod_loop_keyword_126_alt_1(builder)) {
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

    private boolean comment_127(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_128_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ROUTINE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_128_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean routine_def_128_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.routine_def_128_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean routine_def_128_quant_4(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_128_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean routine_def_128_alt_6(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_128_alt_7(PsiBuilder builder) {
        if (!(this.onlystar_107(builder))) {
            return false;
        }
        return true;
    }

    private boolean routine_def_128(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.routine_def_128_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.routine_def_128_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.routine_def_128_quant_4(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.routine_def_128_alt_7(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.routine_def_128_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.routine_def_128_alt_5(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean postfixish_129_alt_1(PsiBuilder builder) {
        if (!(this.postfixish_nometa_115(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_129_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.HYPER_METAOP_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postfixish_129_alt_3(PsiBuilder builder) {
        if (!(this.postfixish_nometa_115(builder))) {
            return false;
        }
        return true;
    }

    private boolean postfixish_129_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.postfixish_129_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.postfixish_129_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        marker2.done(Perl6ElementTypes.HYPER_METAOP);
        return true;
    }

    private boolean postfixish_129(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.postfixish_129_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.postfixish_129_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean colonpair_variable_130_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_130_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_variable_130(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.colonpair_variable_130_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.colonpair_variable_130_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.VARIABLE);
        return true;
    }

    private boolean identifier_131_quant_1(PsiBuilder builder) {
        if (!(this.apostrophe_55(builder))) {
            return false;
        }
        if (!(this.ident_165(builder))) {
            return false;
        }
        return true;
    }

    private boolean identifier_131(PsiBuilder builder) {
        if (!(this.ident_165(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.identifier_131_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean desigilname_132(PsiBuilder builder) {
        if (!(this.longname_117(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_1(PsiBuilder builder) {
        if (!(this.quote_96(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_2(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean methodop_133_quant_4(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean methodop_133_alt_6(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INVOCANT_MARKER) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_7(PsiBuilder builder) {
        if (!(this.args_209(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.methodop_133_alt_7(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.methodop_133_alt_6(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean methodop_133_quant_9(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean methodop_133(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.methodop_133_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.methodop_133_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.methodop_133_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.methodop_133_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.methodop_133_alt_8(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.methodop_133_alt_5(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.methodop_133_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean rad_digits_134_quant_1(PsiBuilder builder) {
        if (!(this.rad_digit_142(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_digits_134_quant_2(PsiBuilder builder) {
        if (!(this.rad_digit_142(builder))) {
            return false;
        }
        return true;
    }

    private boolean rad_digits_134_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.rad_digits_134_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.rad_digits_134_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean rad_digits_134(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.rad_digits_134_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.rad_digits_134_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.rad_digits_134_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean initializer_135_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("::="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_135_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(":="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_135_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt3.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_135_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INITIALIZER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean initializer_135_alt_5(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean initializer_135(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.initializer_135_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.initializer_135_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.initializer_135_alt_1(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    return false;
                }
            }
        }
        marker1.done(Perl6ElementTypes.INFIX);
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.initializer_135_alt_5(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.initializer_135_alt_4(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean postfix_136(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.POSTFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_137_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt1.equals("token"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.regex_def_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_137_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt2.equals("rule"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.regex_def_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_137_alt_3(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_DECLARATOR) && (tt3.equals("regex"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.regex_def_94(builder))) {
            return false;
        }
        return true;
    }

    private boolean regex_declarator_137(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.regex_declarator_137_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.regex_declarator_137_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.regex_declarator_137_alt_1(builder)) {
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

    private boolean infixish_138_alt_1(PsiBuilder builder) {
        if (!(this.infixish_non_assignment_meta_176(builder))) {
            return false;
        }
        return true;
    }

    private boolean infixish_138_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.ASSIGN_METAOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_non_assignment_meta_176(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt1.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker2.done(Perl6ElementTypes.ASSIGN_METAOP);
        return true;
    }

    private boolean infixish_138(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.infixish_138_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixish_138_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean end_keyword_139(PsiBuilder builder) {
        return true;
    }

    private boolean value_140_alt_1(PsiBuilder builder) {
        if (!(this.quote_96(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_140_alt_2(PsiBuilder builder) {
        if (!(this.number_213(builder))) {
            return false;
        }
        return true;
    }

    private boolean value_140(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.value_140_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.value_140_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_reduce_141_alt_1(PsiBuilder builder) {
        if (!(this.infixish_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_reduce_141_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt2.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        return true;
    }

    private boolean term_reduce_141(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.term_reduce_141_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.term_reduce_141_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt3.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.args_209(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REDUCE_METAOP);
        return true;
    }

    private boolean rad_digit_142_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean rad_digit_142_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean rad_digit_142(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.rad_digit_142_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.rad_digit_142_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_try_143(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("try"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TRY);
        return true;
    }

    private boolean block_144(PsiBuilder builder) {
        if (!(this.blockoid_212(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_145_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_while_145(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("while"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_while_145_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHILE_STATEMENT);
        return true;
    }

    private boolean type_constraint_146_alt_1(PsiBuilder builder) {
        if (!(this.typename_122(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_146_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.numish_192(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_146_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker4;
        marker4 = builder.mark();
        if (!(this.value_140(builder))) {
            return false;
        }
        marker4.done(Perl6ElementTypes.VALUE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_146_quant_4(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean type_constraint_146_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker6;
        marker6 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHERE_CONSTRAINT) && (tt1.equals("where"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.type_constraint_146_quant_4(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker6.done(Perl6ElementTypes.WHERE_CONSTRAINT);
        return true;
    }

    private boolean type_constraint_146(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.type_constraint_146_alt_5(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker5;;
            altMarker5 = builder.mark();
            if (this.type_constraint_146_alt_3(builder)) {
                altMarker5.drop();
            } else {
                altMarker5.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.type_constraint_146_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.type_constraint_146_alt_1(builder)) {
                        altMarker1.drop();
                    } else {
                        altMarker1.rollbackTo();
                        return false;
                    }
                }
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean binint_147_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean binint_147_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.binint_147_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.binint_147_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean binint_147(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.binint_147_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.binint_147_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_148_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean decint_148_quant_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.decint_148_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.decint_148_quant_1(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean decint_148(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.decint_148_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.decint_148_quant_2(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_prefix_start_149(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("start"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.START);
        return true;
    }

    private boolean cclass_backslash_150(PsiBuilder builder) {
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

    private boolean sigmaybe_151_alt_1(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean sigmaybe_151_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_SIGSPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.normspace_7(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.REGEX_SIGSPACE);
        return true;
    }

    private boolean sigmaybe_151(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.sigmaybe_151_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.sigmaybe_151_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infix_prefix_meta_operator_152_alt_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt1.equals("Z"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.ZIP_METAOP);
        return true;
    }

    private boolean infix_prefix_meta_operator_152_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker3;
        marker3 = builder.mark();
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt2.equals("X"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        marker3.done(Perl6ElementTypes.CROSS_METAOP);
        return true;
    }

    private boolean infix_prefix_meta_operator_152_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt3.equals("S"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        marker5.done(Perl6ElementTypes.SEQUENTIAL_METAOP);
        return true;
    }

    private boolean infix_prefix_meta_operator_152_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt4.equals("R"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        marker7.done(Perl6ElementTypes.REVERSE_METAOP);
        return true;
    }

    private boolean infix_prefix_meta_operator_152_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker marker9;
        marker9 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.METAOP) && (tt5.equals("!"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.infixish_138(builder))) {
            return false;
        }
        marker9.done(Perl6ElementTypes.NEGATION_METAOP);
        return true;
    }

    private boolean infix_prefix_meta_operator_152(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.infix_prefix_meta_operator_152_alt_5(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.infix_prefix_meta_operator_152_alt_4(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.infix_prefix_meta_operator_152_alt_3(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.infix_prefix_meta_operator_152_alt_2(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.infix_prefix_meta_operator_152_alt_1(builder)) {
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

    private boolean starter_153(PsiBuilder builder) {
        return true;
    }

    private boolean escale_154(PsiBuilder builder) {
        if (!(this.sign_54(builder))) {
            return false;
        }
        if (!(this.decint_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean contextualizer_155_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.circumfix_194(builder))) {
            return false;
        }
        return true;
    }

    private boolean contextualizer_155_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.CONTEXTUALIZER) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean contextualizer_155_alt_3(PsiBuilder builder) {
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
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.contextualizer_155_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean contextualizer_155(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.contextualizer_155_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.contextualizer_155_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.CONTEXTUALIZER);
        return true;
    }

    private boolean regex_nibbler_fresh_rx_156(PsiBuilder builder) {
        if (!(this.regex_nibbler_26(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_alt_1(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_alt_2(PsiBuilder builder) {
        if (!(this.version_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_alt_3(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_alt_4(PsiBuilder builder) {
        if (!(this.version_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_quant_5(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.statement_control_need_157_alt_4(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.statement_control_need_157_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_need_157_quant_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals(","))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.statement_control_need_157_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_need_157_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.statement_control_need_157_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.statement_control_need_157_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.statement_control_need_157_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean statement_control_need_157(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("need"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.statement_control_need_157_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.NEED_STATEMENT);
        return true;
    }

    private boolean xblock_158_quant_1(PsiBuilder builder) {
        if (!(this.pblock_31(builder))) {
            return false;
        }
        return true;
    }

    private boolean xblock_158(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.xblock_158_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean octints_159_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean octints_159_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean octints_159_quant_3(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker1;;
            quantMarker1 = builder.mark();
            if (this.octints_159_quant_1(builder)) {
                quantMarker1.drop();
            } else {
                quantMarker1.rollbackTo();
                break;
            }
        }
        if (!(this.octint_58(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker2;;
            quantMarker2 = builder.mark();
            if (this.octints_159_quant_2(builder)) {
                quantMarker2.drop();
            } else {
                quantMarker2.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean octints_159(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.octints_159_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.octints_159_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean arglist_160_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean arglist_160_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.arglist_160_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean arglist_160_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_EMPTY) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean arglist_160(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.ARGLIST_START) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.arglist_160_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.arglist_160_alt_2(builder)) {
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

    private boolean stopper_161_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_161_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean stopper_161(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.stopper_161_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.stopper_161_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean rxq_162_quant_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_162_alt_2(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxq_162_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean rxq_162_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_162_alt_4(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals("\u201A"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.rxq_162_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean rxq_162_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u2019"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_162_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt3.equals("\u2018"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.rxq_162_quant_5(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean rxq_162_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxq_162_alt_8(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt5.equals("'"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.rxq_162_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean rxq_162(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker9;
        altMarker9 = builder.mark();
        if (this.rxq_162_alt_8(builder)) {
            altMarker9.drop();
        } else {
            altMarker9.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.rxq_162_alt_6(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.rxq_162_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker3;;
                    altMarker3 = builder.mark();
                    if (this.rxq_162_alt_2(builder)) {
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

    private boolean quantifier_163_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_quant_2(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_quant_3(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER_MISSING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_alt_5(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHATEVER) && (tt2.equals("*"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_alt_6(PsiBuilder builder) {
        if (!(this.integer_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.quantifier_163_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.quantifier_163_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean quantifier_163_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.quantifier_163_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_163_alt_9(PsiBuilder builder) {
        if (!(this.integer_23(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.quantifier_163_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean quantifier_163_alt_10(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PREFIX) && (tt3.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_alt_11(PsiBuilder builder) {
        if (!(this.rxcodeblock_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean quantifier_163_alt_12(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) && (tt1.equals("**"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.quantifier_163_quant_2(builder)) {
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
        if (this.quantifier_163_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.quantifier_163_alt_11(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker11;;
            altMarker11 = builder.mark();
            if (this.quantifier_163_alt_10(builder)) {
                altMarker11.drop();
            } else {
                altMarker11.rollbackTo();
                PsiBuilder.Marker altMarker10;;
                altMarker10 = builder.mark();
                if (this.quantifier_163_alt_9(builder)) {
                    altMarker10.drop();
                } else {
                    altMarker10.rollbackTo();
                    PsiBuilder.Marker altMarker5;;
                    altMarker5 = builder.mark();
                    if (this.quantifier_163_alt_4(builder)) {
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

    private boolean quantifier_163(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.quantifier_163_alt_12(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quantifier_163_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_QUANTIFIER);
        return true;
    }

    private boolean postcircumfix_164_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.postcircumfix_164_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CALL);
        return true;
    }

    private boolean postcircumfix_164_quant_3(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_quant_4(PsiBuilder builder) {
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.postcircumfix_164_quant_3(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_164_alt_5(PsiBuilder builder) {
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
        if (this.postcircumfix_164_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker4.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_164_quant_6(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt6.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_quant_7(PsiBuilder builder) {
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.postcircumfix_164_quant_6(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_164_alt_8(PsiBuilder builder) {
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
        if (this.postcircumfix_164_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_164_quant_9(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt8.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_quant_10(PsiBuilder builder) {
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker13;
        quantMarker13 = builder.mark();
        if (this.postcircumfix_164_quant_9(builder)) {
            quantMarker13.drop();
        } else {
            quantMarker13.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_164_alt_11(PsiBuilder builder) {
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
        if (this.postcircumfix_164_quant_10(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        marker12.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_164_quant_12(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.HASH_INDEX_BRACKET) && (tt10.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_quant_13(PsiBuilder builder) {
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.postcircumfix_164_quant_12(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_164_alt_14(PsiBuilder builder) {
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
        if (this.postcircumfix_164_quant_13(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        marker16.done(Perl6ElementTypes.HASH_INDEX);
        return true;
    }

    private boolean postcircumfix_164_quant_15(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_INDEX_BRACKET) && (tt12.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean postcircumfix_164_quant_16(PsiBuilder builder) {
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker21;
        quantMarker21 = builder.mark();
        if (this.postcircumfix_164_quant_15(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        return true;
    }

    private boolean postcircumfix_164_alt_17(PsiBuilder builder) {
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
        if (this.postcircumfix_164_quant_16(builder)) {
            quantMarker22.drop();
        } else {
            quantMarker22.rollbackTo();
        }
        marker20.done(Perl6ElementTypes.ARRAY_INDEX);
        return true;
    }

    private boolean postcircumfix_164(PsiBuilder builder) {
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.postcircumfix_164_alt_17(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker19;;
            altMarker19 = builder.mark();
            if (this.postcircumfix_164_alt_14(builder)) {
                altMarker19.drop();
            } else {
                altMarker19.rollbackTo();
                PsiBuilder.Marker altMarker15;;
                altMarker15 = builder.mark();
                if (this.postcircumfix_164_alt_11(builder)) {
                    altMarker15.drop();
                } else {
                    altMarker15.rollbackTo();
                    PsiBuilder.Marker altMarker11;;
                    altMarker11 = builder.mark();
                    if (this.postcircumfix_164_alt_8(builder)) {
                        altMarker11.drop();
                    } else {
                        altMarker11.rollbackTo();
                        PsiBuilder.Marker altMarker7;;
                        altMarker7 = builder.mark();
                        if (this.postcircumfix_164_alt_5(builder)) {
                            altMarker7.drop();
                        } else {
                            altMarker7.rollbackTo();
                            PsiBuilder.Marker altMarker3;;
                            altMarker3 = builder.mark();
                            if (this.postcircumfix_164_alt_2(builder)) {
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

    private boolean ident_165_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean ident_165_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean ident_165_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean ident_165(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.ident_165_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.ident_165_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.ident_165_quant_3(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean bogus_statement_166(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BAD_CHARACTER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167_quant_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167_quant_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.variable_declarator_167_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean variable_declarator_167_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167_alt_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SHAPE_DECLARATION) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.variable_declarator_167_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean variable_declarator_167_quant_6(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.variable_declarator_167_alt_5(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.variable_declarator_167_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean variable_declarator_167_quant_7(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.variable_declarator_167_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.variable_declarator_167_quant_6(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker7;;
            quantMarker7 = builder.mark();
            if (this.variable_declarator_167_quant_6(builder)) {
                quantMarker7.drop();
            } else {
                quantMarker7.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean variable_declarator_167_quant_8(PsiBuilder builder) {
        if (!(this.trait_38(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167_quant_9(PsiBuilder builder) {
        if (!(this.post_constraint_93(builder))) {
            return false;
        }
        return true;
    }

    private boolean variable_declarator_167(PsiBuilder builder) {
        if (!(this.variable_82(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.variable_declarator_167_quant_7(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker9;;
            quantMarker9 = builder.mark();
            if (this.variable_declarator_167_quant_8(builder)) {
                quantMarker9.drop();
            } else {
                quantMarker9.rollbackTo();
                break;
            }
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker10;;
            quantMarker10 = builder.mark();
            if (this.variable_declarator_167_quant_9(builder)) {
                quantMarker10.drop();
            } else {
                quantMarker10.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean backslash_168_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BACKSLASH_BAD) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_168_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean backslash_168(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.backslash_168_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.backslash_168_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        marker1.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean separator_169_quant_1(PsiBuilder builder) {
        if (!(this.quantified_atom_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean separator_169(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_QUANTIFIER) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.separator_169_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX_SEPARATOR);
        return true;
    }

    private boolean rxstopper_170(PsiBuilder builder) {
        if (!(this.stopper_161(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_171_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_171_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_171_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean charspec_171_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.charspec_171_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker5;;
            quantMarker5 = builder.mark();
            if (this.charspec_171_quant_3(builder)) {
                quantMarker5.drop();
            } else {
                quantMarker5.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_171_alt_5(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.charspec_171_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.charspec_171_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.charspec_171_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean charspec_171_alt_6(PsiBuilder builder) {
        if (!(this.charnames_87(builder))) {
            return false;
        }
        return true;
    }

    private boolean charspec_171(PsiBuilder builder) {
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.charspec_171_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.charspec_171_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.charspec_171_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean integer_lex_172_alt_1(PsiBuilder builder) {
        if (!(this.decint_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_alt_2(PsiBuilder builder) {
        if (!(this.decint_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_quant_3(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_172_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.integer_lex_172_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.decint_148(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_quant_5(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_172_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.integer_lex_172_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.hexint_187(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_quant_7(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_172_alt_8(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker7;
        quantMarker7 = builder.mark();
        if (this.integer_lex_172_quant_7(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        if (!(this.octint_58(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_quant_9(PsiBuilder builder) {
        return true;
    }

    private boolean integer_lex_172_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.integer_lex_172_quant_9(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        if (!(this.binint_147(builder))) {
            return false;
        }
        return true;
    }

    private boolean integer_lex_172_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.integer_lex_172_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.integer_lex_172_alt_8(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.integer_lex_172_alt_6(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.integer_lex_172_alt_4(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker2;;
                        altMarker2 = builder.mark();
                        if (this.integer_lex_172_alt_2(builder)) {
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

    private boolean integer_lex_172(PsiBuilder builder) {
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.integer_lex_172_alt_11(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.integer_lex_172_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_prefix_DOC_173_quant_1(PsiBuilder builder) {
        if (!(this.statement_prefix_52(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_DOC_173(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PHASER) && (tt1.equals("DOC"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_prefix_DOC_173_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PHASER);
        return true;
    }

    private boolean statement_control_CATCH_174_quant_1(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_CATCH_174(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("CATCH"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_CATCH_174_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.CATCH_STATEMENT);
        return true;
    }

    private boolean statement_control_unless_175_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_unless_175(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("unless"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_unless_175_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.UNLESS_STATEMENT);
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_1(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.infix_73(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.INFIX);
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_2(PsiBuilder builder) {
        if (!(this.infix_circumfix_meta_operator_1(builder))) {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_3(PsiBuilder builder) {
        if (!(this.infix_prefix_meta_operator_152(builder))) {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_4(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BRACKETED_INFIX_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BRACKETED_INFIX_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_6(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt2.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_7(PsiBuilder builder) {
        if (!(this.infixish_138(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker8;
        altMarker8 = builder.mark();
        if (this.infixish_non_assignment_meta_176_alt_6(builder)) {
            altMarker8.drop();
        } else {
            altMarker8.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.infixish_non_assignment_meta_176_alt_5(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.BRACKETED_INFIX_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_9(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt3.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_10(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.INFIX_FUNCTION) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.variable_82(builder))) {
            return false;
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.infixish_non_assignment_meta_176_alt_9(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.infixish_non_assignment_meta_176_alt_8(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixish_non_assignment_meta_176_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt1.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker12;
        altMarker12 = builder.mark();
        if (this.infixish_non_assignment_meta_176_alt_10(builder)) {
            altMarker12.drop();
        } else {
            altMarker12.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.infixish_non_assignment_meta_176_alt_7(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker6;;
                altMarker6 = builder.mark();
                if (this.infixish_non_assignment_meta_176_alt_4(builder)) {
                    altMarker6.drop();
                } else {
                    altMarker6.rollbackTo();
                    return false;
                }
            }
        }
        marker5.done(Perl6ElementTypes.BRACKETED_INFIX);
        return true;
    }

    private boolean infixish_non_assignment_meta_176(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.infixish_non_assignment_meta_176_alt_11(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.infixish_non_assignment_meta_176_alt_3(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker3;;
                altMarker3 = builder.mark();
                if (this.infixish_non_assignment_meta_176_alt_2(builder)) {
                    altMarker3.drop();
                } else {
                    altMarker3.rollbackTo();
                    PsiBuilder.Marker altMarker2;;
                    altMarker2 = builder.mark();
                    if (this.infixish_non_assignment_meta_176_alt_1(builder)) {
                        altMarker2.drop();
                    } else {
                        altMarker2.rollbackTo();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean quote_Q_177(PsiBuilder builder) {
        if (!(this.quote_nibbler_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_178_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_178_alt_2(PsiBuilder builder) {
        if (!(this.quote_escape_111(builder))) {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_178_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_nibbler_178(builder))) {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean quote_nibbler_178_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.quote_nibbler_178_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.quote_nibbler_178_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.quote_nibbler_178_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean quote_nibbler_178(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.quote_nibbler_178_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean unv_179_quant_1(PsiBuilder builder) {
        if (!(this.comment_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_179_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.unv_179_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean unv_179_alt_3(PsiBuilder builder) {
        if (!(this.comment_127(builder))) {
            return false;
        }
        return true;
    }

    private boolean unv_179(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.unv_179_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.unv_179_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_180_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_180_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_180_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.infixstopper_180_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.infixstopper_180_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean infixstopper_180_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean infixstopper_180(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.infixstopper_180_alt_4(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.infixstopper_180_alt_3(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean term_name_181_quant_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) && (tt1.equals("\\"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean term_name_181_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.SUB_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.term_name_181_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.args_209(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.SUB_CALL);
        return true;
    }

    private boolean term_name_181_alt_3(PsiBuilder builder) {
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

    private boolean term_name_181(PsiBuilder builder) {
        PsiBuilder.Marker altMarker5;
        altMarker5 = builder.mark();
        if (this.term_name_181_alt_3(builder)) {
            altMarker5.drop();
        } else {
            altMarker5.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.term_name_181_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_mod_loop_182_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_loop_182(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_LOOP) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_loop_182_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_LOOP);
        return true;
    }

    private boolean statement_control_import_183_quant_1(PsiBuilder builder) {
        if (!(this.spacey_85(builder))) {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_183_quant_2(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_import_183_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_import_183(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("import"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.statement_control_import_183_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.IMPORT_STATEMENT);
        return true;
    }

    private boolean metachar_184_alt_1(PsiBuilder builder) {
        if (!(this.mod_internal_42(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_2(PsiBuilder builder) {
        if (!(this.quantified_atom_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_3(PsiBuilder builder) {
        if (!(this.quantified_atom_51(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.metachar_184_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean metachar_184_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_INFIX) && (tt1.equals("~"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.metachar_184_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        marker2.done(Perl6ElementTypes.REGEX_GOAL);
        return true;
    }

    private boolean metachar_184_alt_5(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.SCOPE_DECLARATOR) && (tt2.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statement_105(builder))) {
            return false;
        }
        if (!(this.eat_terminator_210(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_6(PsiBuilder builder) {
        if (!(this.rxcodeblock_43(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_7(PsiBuilder builder) {
        if (!(this.rxqq_57(builder))) {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_8(PsiBuilder builder) {
        if (!(this.rxq_162(builder))) {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_9(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt4.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker marker10;
        marker10 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ASSERTION_ANGLE) && (tt3.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.assertion_72(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker11;
        quantMarker11 = builder.mark();
        if (this.metachar_184_quant_9(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker10.done(Perl6ElementTypes.REGEX_ASSERTION);
        return true;
    }

    private boolean metachar_184_alt_11(PsiBuilder builder) {
        if (!(this.rxqw_202(builder))) {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_12(PsiBuilder builder) {
        if (!(this.backslash_168(builder))) {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_13(PsiBuilder builder) {
        if (!(this.regex_nibbler_fresh_rx_156(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_14(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt6.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_15(PsiBuilder builder) {
        PsiBuilder.Marker marker15;
        marker15 = builder.mark();
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CAPTURE_PARENTHESES) && (tt5.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.metachar_184_quant_13(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        PsiBuilder.Marker quantMarker17;
        quantMarker17 = builder.mark();
        if (this.metachar_184_quant_14(builder)) {
            quantMarker17.drop();
        } else {
            quantMarker17.rollbackTo();
        }
        marker15.done(Perl6ElementTypes.REGEX_CAPTURE_POSITIONAL);
        return true;
    }

    private boolean metachar_184_quant_16(PsiBuilder builder) {
        if (!(this.regex_nibbler_fresh_rx_156(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_17(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_18(PsiBuilder builder) {
        PsiBuilder.Marker marker19;
        marker19 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_GROUP_BRACKET) && (tt7.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.metachar_184_quant_16(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        PsiBuilder.Marker quantMarker21;
        quantMarker21 = builder.mark();
        if (this.metachar_184_quant_17(builder)) {
            quantMarker21.drop();
        } else {
            quantMarker21.rollbackTo();
        }
        marker19.done(Perl6ElementTypes.REGEX_GROUP);
        return true;
    }

    private boolean metachar_184_alt_19(PsiBuilder builder) {
        PsiBuilder.Marker marker23;
        marker23 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) && (tt9.equals("."))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        marker23.done(Perl6ElementTypes.REGEX_BUILTIN_CCLASS);
        return true;
    }

    private boolean metachar_184_alt_20(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt10.equals(")>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_21(PsiBuilder builder) {
        String tt11;
        tt11 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt11.equals("<("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_22(PsiBuilder builder) {
        String tt12;
        tt12 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt12.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_23(PsiBuilder builder) {
        String tt13;
        tt13 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt13.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_24(PsiBuilder builder) {
        String tt14;
        tt14 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt14.equals("\u00AB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_25(PsiBuilder builder) {
        String tt15;
        tt15 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt15.equals("<<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_26(PsiBuilder builder) {
        String tt16;
        tt16 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt16.equals("$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_27(PsiBuilder builder) {
        String tt17;
        tt17 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt17.equals("$$"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_28(PsiBuilder builder) {
        String tt18;
        tt18 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt18.equals("^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_29(PsiBuilder builder) {
        String tt19;
        tt19 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_ANCHOR) && (tt19.equals("^^"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.SIGOK_203(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_30(PsiBuilder builder) {
        PsiBuilder.Marker marker25;
        marker25 = builder.mark();
        PsiBuilder.Marker altMarker35;
        altMarker35 = builder.mark();
        if (this.metachar_184_alt_29(builder)) {
            altMarker35.drop();
        } else {
            altMarker35.rollbackTo();
            PsiBuilder.Marker altMarker34;;
            altMarker34 = builder.mark();
            if (this.metachar_184_alt_28(builder)) {
                altMarker34.drop();
            } else {
                altMarker34.rollbackTo();
                PsiBuilder.Marker altMarker33;;
                altMarker33 = builder.mark();
                if (this.metachar_184_alt_27(builder)) {
                    altMarker33.drop();
                } else {
                    altMarker33.rollbackTo();
                    PsiBuilder.Marker altMarker32;;
                    altMarker32 = builder.mark();
                    if (this.metachar_184_alt_26(builder)) {
                        altMarker32.drop();
                    } else {
                        altMarker32.rollbackTo();
                        PsiBuilder.Marker altMarker31;;
                        altMarker31 = builder.mark();
                        if (this.metachar_184_alt_25(builder)) {
                            altMarker31.drop();
                        } else {
                            altMarker31.rollbackTo();
                            PsiBuilder.Marker altMarker30;;
                            altMarker30 = builder.mark();
                            if (this.metachar_184_alt_24(builder)) {
                                altMarker30.drop();
                            } else {
                                altMarker30.rollbackTo();
                                PsiBuilder.Marker altMarker29;;
                                altMarker29 = builder.mark();
                                if (this.metachar_184_alt_23(builder)) {
                                    altMarker29.drop();
                                } else {
                                    altMarker29.rollbackTo();
                                    PsiBuilder.Marker altMarker28;;
                                    altMarker28 = builder.mark();
                                    if (this.metachar_184_alt_22(builder)) {
                                        altMarker28.drop();
                                    } else {
                                        altMarker28.rollbackTo();
                                        PsiBuilder.Marker altMarker27;;
                                        altMarker27 = builder.mark();
                                        if (this.metachar_184_alt_21(builder)) {
                                            altMarker27.drop();
                                        } else {
                                            altMarker27.rollbackTo();
                                            PsiBuilder.Marker altMarker26;;
                                            altMarker26 = builder.mark();
                                            if (this.metachar_184_alt_20(builder)) {
                                                altMarker26.drop();
                                            } else {
                                                altMarker26.rollbackTo();
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
        marker25.done(Perl6ElementTypes.REGEX_ANCHOR);
        return true;
    }

    private boolean metachar_184_alt_31(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_VARIABLE_BINDING_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean metachar_184_alt_32(PsiBuilder builder) {
        if (!(this.quantified_atom_51(builder))) {
            return false;
        }
        return true;
    }

    private boolean metachar_184_quant_33(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_VARIABLE_BINDING) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        String tt20;
        tt20 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.INFIX) && (tt20.equals("="))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker altMarker39;
        altMarker39 = builder.mark();
        if (this.metachar_184_alt_32(builder)) {
            altMarker39.drop();
        } else {
            altMarker39.rollbackTo();
            PsiBuilder.Marker altMarker38;;
            altMarker38 = builder.mark();
            if (this.metachar_184_alt_31(builder)) {
                altMarker38.drop();
            } else {
                altMarker38.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean metachar_184_alt_34(PsiBuilder builder) {
        PsiBuilder.Marker marker37;
        marker37 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.variable_82(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker40;
        quantMarker40 = builder.mark();
        if (this.metachar_184_quant_33(builder)) {
            quantMarker40.drop();
        } else {
            quantMarker40.rollbackTo();
        }
        marker37.done(Perl6ElementTypes.REGEX_VARIABLE);
        return true;
    }

    private boolean metachar_184(PsiBuilder builder) {
        PsiBuilder.Marker altMarker41;
        altMarker41 = builder.mark();
        if (this.metachar_184_alt_34(builder)) {
            altMarker41.drop();
        } else {
            altMarker41.rollbackTo();
            PsiBuilder.Marker altMarker36;;
            altMarker36 = builder.mark();
            if (this.metachar_184_alt_30(builder)) {
                altMarker36.drop();
            } else {
                altMarker36.rollbackTo();
                PsiBuilder.Marker altMarker24;;
                altMarker24 = builder.mark();
                if (this.metachar_184_alt_19(builder)) {
                    altMarker24.drop();
                } else {
                    altMarker24.rollbackTo();
                    PsiBuilder.Marker altMarker22;;
                    altMarker22 = builder.mark();
                    if (this.metachar_184_alt_18(builder)) {
                        altMarker22.drop();
                    } else {
                        altMarker22.rollbackTo();
                        PsiBuilder.Marker altMarker18;;
                        altMarker18 = builder.mark();
                        if (this.metachar_184_alt_15(builder)) {
                            altMarker18.drop();
                        } else {
                            altMarker18.rollbackTo();
                            PsiBuilder.Marker altMarker14;;
                            altMarker14 = builder.mark();
                            if (this.metachar_184_alt_12(builder)) {
                                altMarker14.drop();
                            } else {
                                altMarker14.rollbackTo();
                                PsiBuilder.Marker altMarker13;;
                                altMarker13 = builder.mark();
                                if (this.metachar_184_alt_11(builder)) {
                                    altMarker13.drop();
                                } else {
                                    altMarker13.rollbackTo();
                                    PsiBuilder.Marker altMarker12;;
                                    altMarker12 = builder.mark();
                                    if (this.metachar_184_alt_10(builder)) {
                                        altMarker12.drop();
                                    } else {
                                        altMarker12.rollbackTo();
                                        PsiBuilder.Marker altMarker9;;
                                        altMarker9 = builder.mark();
                                        if (this.metachar_184_alt_8(builder)) {
                                            altMarker9.drop();
                                        } else {
                                            altMarker9.rollbackTo();
                                            PsiBuilder.Marker altMarker8;;
                                            altMarker8 = builder.mark();
                                            if (this.metachar_184_alt_7(builder)) {
                                                altMarker8.drop();
                                            } else {
                                                altMarker8.rollbackTo();
                                                PsiBuilder.Marker altMarker7;;
                                                altMarker7 = builder.mark();
                                                if (this.metachar_184_alt_6(builder)) {
                                                    altMarker7.drop();
                                                } else {
                                                    altMarker7.rollbackTo();
                                                    PsiBuilder.Marker altMarker6;;
                                                    altMarker6 = builder.mark();
                                                    if (this.metachar_184_alt_5(builder)) {
                                                        altMarker6.drop();
                                                    } else {
                                                        altMarker6.rollbackTo();
                                                        PsiBuilder.Marker altMarker5;;
                                                        altMarker5 = builder.mark();
                                                        if (this.metachar_184_alt_4(builder)) {
                                                            altMarker5.drop();
                                                        } else {
                                                            altMarker5.rollbackTo();
                                                            PsiBuilder.Marker altMarker1;;
                                                            altMarker1 = builder.mark();
                                                            if (this.metachar_184_alt_1(builder)) {
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
        return true;
    }

    private boolean quote_qq_185(PsiBuilder builder) {
        if (!(this.quote_nibbler_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt1.equals("-"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_2(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt2.equals("+"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.cclass_elem_186_alt_2(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.cclass_elem_186_alt_1(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_186_quant_4(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_5(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_6(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_BUILTIN_CCLASS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_7(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.METHOD_CALL_NAME) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_quant_8(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_9(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_10(PsiBuilder builder) {
        if (!(this.cclass_backslash_150(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_quant_11(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_12(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_quant_13(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_14(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_CHAR) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_15(PsiBuilder builder) {
        if (!(this.cclass_backslash_150(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_16(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker14;
        quantMarker14 = builder.mark();
        if (this.cclass_elem_186_quant_13(builder)) {
            quantMarker14.drop();
        } else {
            quantMarker14.rollbackTo();
        }
        PsiBuilder.Marker altMarker16;
        altMarker16 = builder.mark();
        if (this.cclass_elem_186_alt_15(builder)) {
            altMarker16.drop();
        } else {
            altMarker16.rollbackTo();
            PsiBuilder.Marker altMarker15;;
            altMarker15 = builder.mark();
            if (this.cclass_elem_186_alt_14(builder)) {
                altMarker15.drop();
            } else {
                altMarker15.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_186_quant_17(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker12;
        quantMarker12 = builder.mark();
        if (this.cclass_elem_186_quant_11(builder)) {
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
        if (this.cclass_elem_186_alt_16(builder)) {
            altMarker17.drop();
        } else {
            altMarker17.rollbackTo();
            PsiBuilder.Marker altMarker13;;
            altMarker13 = builder.mark();
            if (this.cclass_elem_186_alt_12(builder)) {
                altMarker13.drop();
            } else {
                altMarker13.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_186_quant_18(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_ATOM) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.cclass_elem_186_quant_8(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.cclass_elem_186_alt_10(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.cclass_elem_186_alt_9(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                return false;
            }
        }
        PsiBuilder.Marker quantMarker18;
        quantMarker18 = builder.mark();
        if (this.cclass_elem_186_quant_17(builder)) {
            quantMarker18.drop();
        } else {
            quantMarker18.rollbackTo();
        }
        return true;
    }

    private boolean cclass_elem_186_quant_19(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_20(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_INCOMPLETE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_21(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.REGEX_CCLASS_SYNTAX) && (tt5.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186_alt_22(PsiBuilder builder) {
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
            if (this.cclass_elem_186_quant_18(builder)) {
                quantMarker19.drop();
            } else {
                quantMarker19.rollbackTo();
                break;
            }
        }
        PsiBuilder.Marker quantMarker20;
        quantMarker20 = builder.mark();
        if (this.cclass_elem_186_quant_19(builder)) {
            quantMarker20.drop();
        } else {
            quantMarker20.rollbackTo();
        }
        PsiBuilder.Marker altMarker22;
        altMarker22 = builder.mark();
        if (this.cclass_elem_186_alt_21(builder)) {
            altMarker22.drop();
        } else {
            altMarker22.rollbackTo();
            PsiBuilder.Marker altMarker21;;
            altMarker21 = builder.mark();
            if (this.cclass_elem_186_alt_20(builder)) {
                altMarker21.drop();
            } else {
                altMarker21.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean cclass_elem_186_quant_23(PsiBuilder builder) {
        if (!(this.normspace_7(builder))) {
            return false;
        }
        return true;
    }

    private boolean cclass_elem_186(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.cclass_elem_186_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.cclass_elem_186_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        PsiBuilder.Marker altMarker23;
        altMarker23 = builder.mark();
        if (this.cclass_elem_186_alt_22(builder)) {
            altMarker23.drop();
        } else {
            altMarker23.rollbackTo();
            PsiBuilder.Marker altMarker8;;
            altMarker8 = builder.mark();
            if (this.cclass_elem_186_alt_7(builder)) {
                altMarker8.drop();
            } else {
                altMarker8.rollbackTo();
                PsiBuilder.Marker altMarker7;;
                altMarker7 = builder.mark();
                if (this.cclass_elem_186_alt_6(builder)) {
                    altMarker7.drop();
                } else {
                    altMarker7.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.cclass_elem_186_alt_5(builder)) {
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
        if (this.cclass_elem_186_quant_23(builder)) {
            quantMarker24.drop();
        } else {
            quantMarker24.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.REGEX_CCLASS_ELEM);
        return true;
    }

    private boolean hexint_187_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_187_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean hexint_187_quant_3(PsiBuilder builder) {
        PsiBuilder.Marker altMarker2;
        altMarker2 = builder.mark();
        if (this.hexint_187_alt_2(builder)) {
            altMarker2.drop();
        } else {
            altMarker2.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.hexint_187_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean hexint_187_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.hexint_187_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.hexint_187_quant_3(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean hexint_187(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.hexint_187_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker6;;
            quantMarker6 = builder.mark();
            if (this.hexint_187_quant_4(builder)) {
                quantMarker6.drop();
            } else {
                quantMarker6.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean fatarrow_188_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean fatarrow_188(PsiBuilder builder) {
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
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.fatarrow_188_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.FATARROW);
        return true;
    }

    private boolean statement_control_default_189_quant_1(PsiBuilder builder) {
        if (!(this.block_144(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_default_189(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("default"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_default_189_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.DEFAULT_STATEMENT);
        return true;
    }

    private boolean kok_190(PsiBuilder builder) {
        if (!(this.end_keyword_139(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean vnum_191_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_191_quant_2(PsiBuilder builder) {
        return true;
    }

    private boolean vnum_191_alt_3(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.vnum_191_quant_2(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
            return false;
        }
        while (true) {
            PsiBuilder.Marker quantMarker3;;
            quantMarker3 = builder.mark();
            if (this.vnum_191_quant_2(builder)) {
                quantMarker3.drop();
            } else {
                quantMarker3.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean vnum_191(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.vnum_191_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker1;;
            altMarker1 = builder.mark();
            if (this.vnum_191_alt_1(builder)) {
                altMarker1.drop();
            } else {
                altMarker1.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean numish_192_alt_1(PsiBuilder builder) {
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

    private boolean numish_192_alt_2(PsiBuilder builder) {
        if (!(this.integer_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_192_alt_3(PsiBuilder builder) {
        if (!(this.dec_number_110(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_192_alt_4(PsiBuilder builder) {
        if (!(this.rad_number_49(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_192_alt_5(PsiBuilder builder) {
        if (!(this.rat_number_79(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_192_alt_6(PsiBuilder builder) {
        if (!(this.complex_number_24(builder))) {
            return false;
        }
        return true;
    }

    private boolean numish_192(PsiBuilder builder) {
        PsiBuilder.Marker altMarker7;
        altMarker7 = builder.mark();
        if (this.numish_192_alt_6(builder)) {
            altMarker7.drop();
        } else {
            altMarker7.rollbackTo();
            PsiBuilder.Marker altMarker6;;
            altMarker6 = builder.mark();
            if (this.numish_192_alt_5(builder)) {
                altMarker6.drop();
            } else {
                altMarker6.rollbackTo();
                PsiBuilder.Marker altMarker5;;
                altMarker5 = builder.mark();
                if (this.numish_192_alt_4(builder)) {
                    altMarker5.drop();
                } else {
                    altMarker5.rollbackTo();
                    PsiBuilder.Marker altMarker4;;
                    altMarker4 = builder.mark();
                    if (this.numish_192_alt_3(builder)) {
                        altMarker4.drop();
                    } else {
                        altMarker4.rollbackTo();
                        PsiBuilder.Marker altMarker3;;
                        altMarker3 = builder.mark();
                        if (this.numish_192_alt_2(builder)) {
                            altMarker3.drop();
                        } else {
                            altMarker3.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.numish_192_alt_1(builder)) {
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

    private boolean prefix_193(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.PREFIX) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_quant_2(PsiBuilder builder) {
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.circumfix_194_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_194_alt_3(PsiBuilder builder) {
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
        if (this.circumfix_194_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_194_quant_4(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt4.equals("\u00BB"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_quant_5(PsiBuilder builder) {
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.circumfix_194_quant_4(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_194_alt_6(PsiBuilder builder) {
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
        if (this.circumfix_194_quant_5(builder)) {
            quantMarker7.drop();
        } else {
            quantMarker7.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_194_quant_7(PsiBuilder builder) {
        String tt6;
        tt6 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt6.equals(">>"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_quant_8(PsiBuilder builder) {
        if (!(this.quote_qq_185(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker10;
        quantMarker10 = builder.mark();
        if (this.circumfix_194_quant_7(builder)) {
            quantMarker10.drop();
        } else {
            quantMarker10.rollbackTo();
        }
        return true;
    }

    private boolean circumfix_194_alt_9(PsiBuilder builder) {
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
        if (this.circumfix_194_quant_8(builder)) {
            quantMarker11.drop();
        } else {
            quantMarker11.rollbackTo();
        }
        marker9.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean circumfix_194_alt_10(PsiBuilder builder) {
        PsiBuilder.Marker marker13;
        marker13 = builder.mark();
        if (!(this.pblock_31(builder))) {
            return false;
        }
        marker13.done(Perl6ElementTypes.BLOCK_OR_HASH);
        return true;
    }

    private boolean circumfix_194_quant_11(PsiBuilder builder) {
        String tt8;
        tt8 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt8.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_alt_12(PsiBuilder builder) {
        PsiBuilder.Marker marker15;
        marker15 = builder.mark();
        String tt7;
        tt7 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.ARRAY_COMPOSER) && (tt7.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker16;
        quantMarker16 = builder.mark();
        if (this.circumfix_194_quant_11(builder)) {
            quantMarker16.drop();
        } else {
            quantMarker16.rollbackTo();
        }
        marker15.done(Perl6ElementTypes.ARRAY_COMPOSER);
        return true;
    }

    private boolean circumfix_194_quant_13(PsiBuilder builder) {
        String tt10;
        tt10 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt10.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean circumfix_194_alt_14(PsiBuilder builder) {
        PsiBuilder.Marker marker18;
        marker18 = builder.mark();
        String tt9;
        tt9 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt9.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semilist_30(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker19;
        quantMarker19 = builder.mark();
        if (this.circumfix_194_quant_13(builder)) {
            quantMarker19.drop();
        } else {
            quantMarker19.rollbackTo();
        }
        marker18.done(Perl6ElementTypes.PARENTHESIZED_EXPRESSION);
        return true;
    }

    private boolean circumfix_194(PsiBuilder builder) {
        PsiBuilder.Marker altMarker20;
        altMarker20 = builder.mark();
        if (this.circumfix_194_alt_14(builder)) {
            altMarker20.drop();
        } else {
            altMarker20.rollbackTo();
            PsiBuilder.Marker altMarker17;;
            altMarker17 = builder.mark();
            if (this.circumfix_194_alt_12(builder)) {
                altMarker17.drop();
            } else {
                altMarker17.rollbackTo();
                PsiBuilder.Marker altMarker14;;
                altMarker14 = builder.mark();
                if (this.circumfix_194_alt_10(builder)) {
                    altMarker14.drop();
                } else {
                    altMarker14.rollbackTo();
                    PsiBuilder.Marker altMarker12;;
                    altMarker12 = builder.mark();
                    if (this.circumfix_194_alt_9(builder)) {
                        altMarker12.drop();
                    } else {
                        altMarker12.rollbackTo();
                        PsiBuilder.Marker altMarker8;;
                        altMarker8 = builder.mark();
                        if (this.circumfix_194_alt_6(builder)) {
                            altMarker8.drop();
                        } else {
                            altMarker8.rollbackTo();
                            PsiBuilder.Marker altMarker4;;
                            altMarker4 = builder.mark();
                            if (this.circumfix_194_alt_3(builder)) {
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

    private boolean quote_q_195(PsiBuilder builder) {
        if (!(this.quote_nibbler_178(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_prefix_gather_196(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_PREFIX) && (tt1.equals("gather"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.blorst_59(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.GATHER);
        return true;
    }

    private boolean term_rand_197(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("rand"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.end_keyword_139(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean term_time_198(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.TERM) && (tt1.equals("time"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.tok_121(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.TERM);
        return true;
    }

    private boolean statement_control_whenever_199_quant_1(PsiBuilder builder) {
        if (!(this.xblock_158(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_whenever_199(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("whenever"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_whenever_199_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.WHENEVER_STATEMENT);
        return true;
    }

    private boolean terminator_200_alt_1(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_2(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_3(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_4(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_5(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_6(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_7(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_8(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_9(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_10(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_11(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.terminator_200_alt_10(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker9;;
            altMarker9 = builder.mark();
            if (this.terminator_200_alt_9(builder)) {
                altMarker9.drop();
            } else {
                altMarker9.rollbackTo();
                PsiBuilder.Marker altMarker8;;
                altMarker8 = builder.mark();
                if (this.terminator_200_alt_8(builder)) {
                    altMarker8.drop();
                } else {
                    altMarker8.rollbackTo();
                    PsiBuilder.Marker altMarker7;;
                    altMarker7 = builder.mark();
                    if (this.terminator_200_alt_7(builder)) {
                        altMarker7.drop();
                    } else {
                        altMarker7.rollbackTo();
                        PsiBuilder.Marker altMarker6;;
                        altMarker6 = builder.mark();
                        if (this.terminator_200_alt_6(builder)) {
                            altMarker6.drop();
                        } else {
                            altMarker6.rollbackTo();
                            PsiBuilder.Marker altMarker5;;
                            altMarker5 = builder.mark();
                            if (this.terminator_200_alt_5(builder)) {
                                altMarker5.drop();
                            } else {
                                altMarker5.rollbackTo();
                                PsiBuilder.Marker altMarker4;;
                                altMarker4 = builder.mark();
                                if (this.terminator_200_alt_4(builder)) {
                                    altMarker4.drop();
                                } else {
                                    altMarker4.rollbackTo();
                                    PsiBuilder.Marker altMarker3;;
                                    altMarker3 = builder.mark();
                                    if (this.terminator_200_alt_3(builder)) {
                                        altMarker3.drop();
                                    } else {
                                        altMarker3.rollbackTo();
                                        PsiBuilder.Marker altMarker2;;
                                        altMarker2 = builder.mark();
                                        if (this.terminator_200_alt_2(builder)) {
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
        if (!(this.kok_190(builder))) {
            return false;
        }
        return true;
    }

    private boolean terminator_200_alt_12(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200_alt_13(PsiBuilder builder) {
        return true;
    }

    private boolean terminator_200(PsiBuilder builder) {
        PsiBuilder.Marker altMarker13;
        altMarker13 = builder.mark();
        if (this.terminator_200_alt_13(builder)) {
            altMarker13.drop();
        } else {
            altMarker13.rollbackTo();
            PsiBuilder.Marker altMarker12;;
            altMarker12 = builder.mark();
            if (this.terminator_200_alt_12(builder)) {
                altMarker12.drop();
            } else {
                altMarker12.rollbackTo();
                PsiBuilder.Marker altMarker11;;
                altMarker11 = builder.mark();
                if (this.terminator_200_alt_11(builder)) {
                    altMarker11.drop();
                } else {
                    altMarker11.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.terminator_200_alt_1(builder)) {
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

    private boolean twigil_201(PsiBuilder builder) {
        return true;
    }

    private boolean rxqw_202_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt2.equals(">"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean rxqw_202(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STRING_LITERAL_QUOTE) && (tt1.equals("<"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.quote_q_195(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.rxqw_202_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STRING_LITERAL);
        return true;
    }

    private boolean SIGOK_203_quant_1(PsiBuilder builder) {
        return true;
    }

    private boolean SIGOK_203(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.SIGOK_203_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean bare_rat_number_204(PsiBuilder builder) {
        if (!(this.signed_integer_112(builder))) {
            return false;
        }
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.RAT_LITERAL) && (tt1.equals("/"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.integer_23(builder))) {
            return false;
        }
        return true;
    }

    private boolean semiarglist_205(PsiBuilder builder) {
        if (!(this.arglist_160(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_206_quant_1(PsiBuilder builder) {
        if (!(this.EXPR_16(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_mod_cond_206(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_MOD_COND) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.kok_190(builder))) {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_mod_cond_206_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.STATEMENT_MOD_COND);
        return true;
    }

    private boolean param_var_207_quant_1(PsiBuilder builder) {
        PsiBuilder.Marker marker2;
        marker2 = builder.mark();
        if (!(this.postcircumfix_164(builder))) {
            return false;
        }
        marker2.done(Perl6ElementTypes.ARRAY_SHAPE);
        return true;
    }

    private boolean param_var_207_alt_2(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if ((builder.getTokenType()) == Perl6TokenTypes.VARIABLE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.param_var_207_quant_1(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.PARAMETER_VARIABLE);
        return true;
    }

    private boolean param_var_207_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_207_alt_4(PsiBuilder builder) {
        PsiBuilder.Marker marker5;
        marker5 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt1.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker6;
        quantMarker6 = builder.mark();
        if (this.param_var_207_quant_3(builder)) {
            quantMarker6.drop();
        } else {
            quantMarker6.rollbackTo();
        }
        marker5.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_207_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals("]"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean param_var_207_alt_6(PsiBuilder builder) {
        PsiBuilder.Marker marker8;
        marker8 = builder.mark();
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("["))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.signature_92(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker9;
        quantMarker9 = builder.mark();
        if (this.param_var_207_quant_5(builder)) {
            quantMarker9.drop();
        } else {
            quantMarker9.rollbackTo();
        }
        marker8.done(Perl6ElementTypes.SIGNATURE);
        return true;
    }

    private boolean param_var_207(PsiBuilder builder) {
        PsiBuilder.Marker altMarker10;
        altMarker10 = builder.mark();
        if (this.param_var_207_alt_6(builder)) {
            altMarker10.drop();
        } else {
            altMarker10.rollbackTo();
            PsiBuilder.Marker altMarker7;;
            altMarker7 = builder.mark();
            if (this.param_var_207_alt_4(builder)) {
                altMarker7.drop();
            } else {
                altMarker7.rollbackTo();
                PsiBuilder.Marker altMarker4;;
                altMarker4 = builder.mark();
                if (this.param_var_207_alt_2(builder)) {
                    altMarker4.drop();
                } else {
                    altMarker4.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean signed_number_208(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COMPLEX_LITERAL) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.number_213(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_209_alt_1(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.NO_ARGS) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_209_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean args_209_quant_3(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt2.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_209_alt_4(PsiBuilder builder) {
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
        if (!(this.semiarglist_205(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.args_209_quant_3(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        return true;
    }

    private boolean args_209_quant_5(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt4.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean args_209_alt_6(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.PARENTHESES) && (tt3.equals("("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.semiarglist_205(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.args_209_quant_5(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        return true;
    }

    private boolean args_209(PsiBuilder builder) {
        PsiBuilder.Marker altMarker6;
        altMarker6 = builder.mark();
        if (this.args_209_alt_6(builder)) {
            altMarker6.drop();
        } else {
            altMarker6.rollbackTo();
            PsiBuilder.Marker altMarker4;;
            altMarker4 = builder.mark();
            if (this.args_209_alt_4(builder)) {
                altMarker4.drop();
            } else {
                altMarker4.rollbackTo();
                PsiBuilder.Marker altMarker2;;
                altMarker2 = builder.mark();
                if (this.args_209_alt_2(builder)) {
                    altMarker2.drop();
                } else {
                    altMarker2.rollbackTo();
                    PsiBuilder.Marker altMarker1;;
                    altMarker1 = builder.mark();
                    if (this.args_209_alt_1(builder)) {
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

    private boolean eat_terminator_210_alt_1(PsiBuilder builder) {
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_210_alt_2(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.END_OF_STATEMENT) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_210_alt_3(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_TERMINATOR) && (tt1.equals(";"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        return true;
    }

    private boolean eat_terminator_210_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.eat_terminator_210_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.eat_terminator_210_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.eat_terminator_210_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean eat_terminator_210(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker4;
        quantMarker4 = builder.mark();
        if (this.eat_terminator_210_quant_4(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean morename_211_quant_1(PsiBuilder builder) {
        if (!(this.identifier_131(builder))) {
            return false;
        }
        return true;
    }

    private boolean morename_211(PsiBuilder builder) {
        PsiBuilder.Marker quantMarker1;
        quantMarker1 = builder.mark();
        if (this.morename_211_quant_1(builder)) {
            quantMarker1.drop();
        } else {
            quantMarker1.rollbackTo();
        }
        return true;
    }

    private boolean blockoid_212_quant_1(PsiBuilder builder) {
        String tt2;
        tt2 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt2.equals("}"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean blockoid_212(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.BLOCK_CURLY_BRACKET) && (tt1.equals("{"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.statementlist_114(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.blockoid_212_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        marker1.done(Perl6ElementTypes.BLOCK);
        return true;
    }

    private boolean number_213(PsiBuilder builder) {
        if (!(this.numish_192(builder))) {
            return false;
        }
        return true;
    }

    private boolean enter_regex_nibblier_214(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        if (!(this.regex_nibbler_26(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.REGEX);
        return true;
    }

    private boolean defterm_215(PsiBuilder builder) {
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

    private boolean ws_216_alt_1(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_216_alt_2(PsiBuilder builder) {
        if (!(this.unv_179(builder))) {
            return false;
        }
        return true;
    }

    private boolean ws_216_alt_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.WHITE_SPACE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean ws_216_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker3;
        altMarker3 = builder.mark();
        if (this.ws_216_alt_3(builder)) {
            altMarker3.drop();
        } else {
            altMarker3.rollbackTo();
            PsiBuilder.Marker altMarker2;;
            altMarker2 = builder.mark();
            if (this.ws_216_alt_2(builder)) {
                altMarker2.drop();
            } else {
                altMarker2.rollbackTo();
                PsiBuilder.Marker altMarker1;;
                altMarker1 = builder.mark();
                if (this.ws_216_alt_1(builder)) {
                    altMarker1.drop();
                } else {
                    altMarker1.rollbackTo();
                    return false;
                }
            }
        }
        return true;
    }

    private boolean ws_216(PsiBuilder builder) {
        while (true) {
            PsiBuilder.Marker quantMarker4;;
            quantMarker4 = builder.mark();
            if (this.ws_216_quant_4(builder)) {
                quantMarker4.drop();
            } else {
                quantMarker4.rollbackTo();
                break;
            }
        }
        return true;
    }

    private boolean colonpair_217_alt_1(PsiBuilder builder) {
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt1.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.coloncircumfix_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_217_quant_2(PsiBuilder builder) {
        if (!(this.unsp_3(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_217_quant_3(PsiBuilder builder) {
        if ((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR_HAS_VALUE) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker quantMarker3;
        quantMarker3 = builder.mark();
        if (this.colonpair_217_quant_2(builder)) {
            quantMarker3.drop();
        } else {
            quantMarker3.rollbackTo();
        }
        if (!(this.coloncircumfix_74(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_217_alt_4(PsiBuilder builder) {
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
        if (this.colonpair_217_quant_3(builder)) {
            quantMarker4.drop();
        } else {
            quantMarker4.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_217_alt_5(PsiBuilder builder) {
        String tt3;
        tt3 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt3.equals(":"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.colonpair_variable_130(builder))) {
            return false;
        }
        return true;
    }

    private boolean colonpair_217_quant_6(PsiBuilder builder) {
        String tt5;
        tt5 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt5.equals(")"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        return true;
    }

    private boolean colonpair_217_alt_7(PsiBuilder builder) {
        String tt4;
        tt4 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.COLON_PAIR) && (tt4.equals(":("))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        PsiBuilder.Marker marker7;
        marker7 = builder.mark();
        if (!(this.signature_92(builder))) {
            return false;
        }
        marker7.done(Perl6ElementTypes.SIGNATURE);
        PsiBuilder.Marker quantMarker8;
        quantMarker8 = builder.mark();
        if (this.colonpair_217_quant_6(builder)) {
            quantMarker8.drop();
        } else {
            quantMarker8.rollbackTo();
        }
        return true;
    }

    private boolean colonpair_217_alt_8(PsiBuilder builder) {
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

    private boolean colonpair_217_alt_9(PsiBuilder builder) {
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

    private boolean colonpair_217(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        PsiBuilder.Marker altMarker11;
        altMarker11 = builder.mark();
        if (this.colonpair_217_alt_9(builder)) {
            altMarker11.drop();
        } else {
            altMarker11.rollbackTo();
            PsiBuilder.Marker altMarker10;;
            altMarker10 = builder.mark();
            if (this.colonpair_217_alt_8(builder)) {
                altMarker10.drop();
            } else {
                altMarker10.rollbackTo();
                PsiBuilder.Marker altMarker9;;
                altMarker9 = builder.mark();
                if (this.colonpair_217_alt_7(builder)) {
                    altMarker9.drop();
                } else {
                    altMarker9.rollbackTo();
                    PsiBuilder.Marker altMarker6;;
                    altMarker6 = builder.mark();
                    if (this.colonpair_217_alt_5(builder)) {
                        altMarker6.drop();
                    } else {
                        altMarker6.rollbackTo();
                        PsiBuilder.Marker altMarker5;;
                        altMarker5 = builder.mark();
                        if (this.colonpair_217_alt_4(builder)) {
                            altMarker5.drop();
                        } else {
                            altMarker5.rollbackTo();
                            PsiBuilder.Marker altMarker2;;
                            altMarker2 = builder.mark();
                            if (this.colonpair_217_alt_1(builder)) {
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

    private boolean statement_control_use_218_quant_1(PsiBuilder builder) {
        if (!(this.spacey_85(builder))) {
            return false;
        }
        if (!(this.arglist_160(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_218_alt_2(PsiBuilder builder) {
        if (!(this.module_name_17(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker2;
        quantMarker2 = builder.mark();
        if (this.statement_control_use_218_quant_1(builder)) {
            quantMarker2.drop();
        } else {
            quantMarker2.rollbackTo();
        }
        return true;
    }

    private boolean statement_control_use_218_alt_3(PsiBuilder builder) {
        if (!(this.version_50(builder))) {
            return false;
        }
        return true;
    }

    private boolean statement_control_use_218_quant_4(PsiBuilder builder) {
        PsiBuilder.Marker altMarker4;
        altMarker4 = builder.mark();
        if (this.statement_control_use_218_alt_3(builder)) {
            altMarker4.drop();
        } else {
            altMarker4.rollbackTo();
            PsiBuilder.Marker altMarker3;;
            altMarker3 = builder.mark();
            if (this.statement_control_use_218_alt_2(builder)) {
                altMarker3.drop();
            } else {
                altMarker3.rollbackTo();
                return false;
            }
        }
        return true;
    }

    private boolean statement_control_use_218(PsiBuilder builder) {
        PsiBuilder.Marker marker1;
        marker1 = builder.mark();
        String tt1;
        tt1 = builder.getTokenText();
        if (((builder.getTokenType()) == Perl6TokenTypes.STATEMENT_CONTROL) && (tt1.equals("use"))) {
            builder.advanceLexer();
        } else {
            return false;
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        PsiBuilder.Marker quantMarker5;
        quantMarker5 = builder.mark();
        if (this.statement_control_use_218_quant_4(builder)) {
            quantMarker5.drop();
        } else {
            quantMarker5.rollbackTo();
        }
        if (!(this.ws_216(builder))) {
            return false;
        }
        marker1.done(Perl6ElementTypes.USE_STATEMENT);
        return true;
    }

}
