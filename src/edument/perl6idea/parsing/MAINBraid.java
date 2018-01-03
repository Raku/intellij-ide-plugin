package edument.perl6idea.parsing;

public class MAINBraid extends Cursor<MAINBraid> {

    public int runRule() {
        int result;
        switch (this.ruleNumber) {
        case 0:
            result = this._0_TOP();
            break;
        case 1:
            result = this._1_bogus_end();
            break;
        case 2:
            result = this._2_apostrophe();
            break;
        case 3:
            result = this._3_ident();
            break;
        case 4:
            result = this._4_identifier();
            break;
        case 5:
            result = this._5_name();
            break;
        case 6:
            result = this._6_morename();
            break;
        case 7:
            result = this._7_longname();
            break;
        case 8:
            result = this._8_module_name();
            break;
        case 9:
            result = this._9_end_keyword();
            break;
        case 10:
            result = this._10_kok();
            break;
        case 11:
            result = this._11_ENDSTMT();
            break;
        case 12:
            result = this._12_ws();
            break;
        case 13:
            result = this._13_unsp();
            break;
        case 14:
            result = this._14_vws();
            break;
        case 15:
            result = this._15_unv();
            break;
        case 16:
            result = this._16_comment();
            break;
        case 17:
            result = this._17_statementlist();
            break;
        case 18:
            result = this._18_statement();
            break;
        case 19:
            result = this._19_bogus_statement();
            break;
        case 20:
            result = this._20_terminator();
            break;
        case 21:
            result = this._21_blockoid();
            break;
        case 22:
            result = this._22_stdstopper();
            break;
        case 23:
            result = this._23_statement_control();
            break;
        case 24:
            result = this._24_statement_control_use();
            break;
        case 25:
            result = this._25_term();
            break;
        case 26:
            result = this._26_term_ident();
            break;
        case 27:
            result = this._27_term_name();
            break;
        case 28:
            result = this._28_term_whatever();
            break;
        case 29:
            result = this._29_term_hyperwhatever();
            break;
        case 30:
            result = this._30_args();
            break;
        case 31:
            result = this._31_semiarglist();
            break;
        case 32:
            result = this._32_arglist();
            break;
        case 33:
            result = this._33_variable();
            break;
        case 34:
            result = this._34_scope_declarator();
            break;
        case 35:
            result = this._35_declarator();
            break;
        case 36:
            result = this._36_multi_declarator();
            break;
        case 37:
            result = this._37_variable_declarator();
            break;
        case 38:
            result = this._38_routine_declarator();
            break;
        case 39:
            result = this._39_routine_def();
            break;
        case 40:
            result = this._40_onlystar();
            break;
        case 41:
            result = this._41_initializer();
            break;
        case 42:
            result = this._42_sigil();
            break;
        case 43:
            result = this._43_twigil();
            break;
        case 44:
            result = this._44_desigilname();
            break;
        case 45:
            result = this._45_value();
            break;
        case 46:
            result = this._46_number();
            break;
        case 47:
            result = this._47_numish();
            break;
        case 48:
            result = this._48_dec_number();
            break;
        case 49:
            result = this._49_escale();
            break;
        case 50:
            result = this._50_sign();
            break;
        case 51:
            result = this._51_integer();
            break;
        case 52:
            result = this._52_integer_lex();
            break;
        case 53:
            result = this._53_decint();
            break;
        case 54:
            result = this._54_hexint();
            break;
        case 55:
            result = this._55_octint();
            break;
        case 56:
            result = this._56_binint();
            break;
        case 57:
            result = this._57_charname();
            break;
        case 58:
            result = this._58_hexints();
            break;
        case 59:
            result = this._59_octints();
            break;
        case 60:
            result = this._60_charnames();
            break;
        case 61:
            result = this._61_charspec();
            break;
        case 62:
            result = this._62_quote();
            break;
        case 63:
            result = this._63_quote_Q();
            break;
        case 64:
            result = this._64_quote_q();
            break;
        case 65:
            result = this._65_quote_qq();
            break;
        case 66:
            result = this._66_quote_nibbler();
            break;
        case 67:
            result = this._67_starter();
            break;
        case 68:
            result = this._68_stopper();
            break;
        case 69:
            result = this._69_quote_escape();
            break;
        case 70:
            result = this._70_EXPR();
            break;
        case 71:
            result = this._71_prefixish();
            break;
        case 72:
            result = this._72_prefix();
            break;
        case 73:
            result = this._73_postfixish();
            break;
        case 74:
            result = this._74_postfix();
            break;
        case 75:
            result = this._75_dotty();
            break;
        case 76:
            result = this._76_dottyop();
            break;
        case 77:
            result = this._77_methodop();
            break;
        case 78:
            result = this._78_infixish();
            break;
        case 79:
            result = this._79_infix();
            break;
        case 80:
            result = this._80_termish();
            break;
        case 81:
            result = this.___lookahead_0();
            break;
        case 82:
            result = this.___lookahead_1();
            break;
        case 83:
            result = this.___lookahead_2();
            break;
        case 84:
            result = this.___lookahead_3();
            break;
        case 85:
            result = this.___lookahead_4();
            break;
        case 86:
            result = this.___lookahead_5();
            break;
        case 87:
            result = this.___lookahead_6();
            break;
        case 88:
            result = this.___lookahead_7();
            break;
        case 89:
            result = this.___lookahead_8();
            break;
        case 90:
            result = this.___lookahead_9();
            break;
        case 91:
            result = this.___lookahead_10();
            break;
        case 92:
            result = this.___lookahead_11();
            break;
        case 93:
            result = this.___lookahead_12();
            break;
        case 94:
            result = this.___lookahead_13();
            break;
        case 95:
            result = this.___lookahead_14();
            break;
        case 96:
            result = this.___lookahead_15();
            break;
        case 97:
            result = this.___lookahead_16();
            break;
        case 98:
            result = this.___lookahead_17();
            break;
        case 99:
            result = this.___lookahead_18();
            break;
        case 100:
            result = this.___lookahead_19();
            break;
        case 101:
            result = this.___lookahead_20();
            break;
        case 102:
            result = this.___lookahead_21();
            break;
        case 103:
            result = this.___lookahead_22();
            break;
        case 104:
            result = this.___lookahead_23();
            break;
        case 105:
            result = this.___lookahead_24();
            break;
        case 106:
            result = this.___lookahead_25();
            break;
        case 107:
            result = this.___lookahead_26();
            break;
        case 108:
            result = this.___lookahead_27();
            break;
        case 109:
            result = this.___lookahead_28();
            break;
        case 110:
            result = this.___lookahead_29();
            break;
        case 111:
            result = this.___lookahead_30();
            break;
        case 112:
            result = this.___lookahead_31();
            break;
        case 113:
            result = this.___lookahead_32();
            break;
        case 114:
            result = this.___lookahead_33();
            break;
        case 115:
            result = this.___lookahead_34();
            break;
        case 116:
            result = this.___lookahead_35();
            break;
        case 117:
            result = this.___lookahead_36();
            break;
        default:
            throw new RuntimeException();

        }
        return result;
    }

    private int _0_TOP() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 17;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(4);
                this.bsMark(2);
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 1;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _1_bogus_end() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.BAD_CHARACTER);
                this.bsFailMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.anyChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

    private int _2_apostrophe() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.inCharList("'-"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _3_ident() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.alphaChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                this.bsMark(4);
                this.state = 3;
                break;
            case 3:
                if (!(this.wordChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 3;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _4_identifier() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 3;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 2;
                break;
            case 2:
                this.setArgs();
                this.state = 3;
                return 2;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 4;
                return 3;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(5);
                ++rep;
                this.bsCommit(5);
                this.bsMark(5, rep);
                this.state = 2;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _5_name() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(9);
                this.bsMark(5);
                this.setArgs();
                this.state = 1;
                return 4;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(4);
                this.state = 2;
                break;
            case 2:
                this.setArgs();
                this.state = 3;
                return 6;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 2;
                continue;

            case 4:
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 5:
                this.bsFailMark(8);
                this.state = 6;
                break;
            case 6:
                this.setArgs();
                this.state = 7;
                return 6;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(8);
                ++rep;
                this.bsCommit(8);
                this.bsMark(8, rep);
                this.state = 6;
                continue;

            case 8:
                this.state = 9;
                continue;

            case 9:
                return -1;

            }
        }
    }

    private int _6_morename() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.literal("::"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 4;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 3:
                return -1;

            }
        }
    }

    private int _7_longname() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 5;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _8_module_name() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.NAME);
                this.setArgs();
                this.state = 1;
                return 7;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                return -1;

            }
        }
    }

    private int _9_end_keyword() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (this.lookahead(81)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _10_kok() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 9;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.lookahead(82))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 2;
                return 12;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _11_ENDSTMT() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsMark(4);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(3);
                this.bsMark(2);
                if (!(this.lookahead(83))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(84))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.lookahead(85))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(86))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _12_ws() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (this.lookahead(87)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(10);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(9);
                this.bsMark(5);
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                this.bsFailMark(3);
                this.bsMark(2);
                if (!(this.inCharList("\r"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.newlineChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.inCharList("\n                \r\u0085\u2028\u2029\r\n"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 5:
                this.bsMark(7);
                this.setArgs();
                this.state = 6;
                return 15;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 7:
                this.setArgs();
                this.state = 8;
                return 13;

            case 8:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 9;
                continue;

            case 9:
                rep = this.peekRep(10);
                ++rep;
                this.bsCommit(10);
                this.bsMark(10, rep);
                this.state = 1;
                continue;

            case 10:
                return -1;

            }
        }
    }

    private int _13_unsp() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(88))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.bsMark(9);
                this.state = 2;
                break;
            case 2:
                this.bsFailMark(8);
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 14;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 4:
                this.bsMark(6);
                this.setArgs();
                this.state = 5;
                return 15;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 6:
                this.setArgs();
                this.state = 7;
                return 13;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 8;
                continue;

            case 8:
                rep = this.peekRep(9);
                ++rep;
                this.bsCommit(9);
                this.bsMark(9, rep);
                this.state = 2;
                continue;

            case 9:
                return -1;

            }
        }
    }

    private int _14_vws() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                this.bsFailMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.inCharList("\n                \r\u0085\u2028\u2029\r\n"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

    private int _15_unv() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(9);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 16;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 2:
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                this.bsFailMark(4);
                this.state = 3;
                break;
            case 3:
                if (!(this.inCharList("	 \u00A0\u1680\u180E\u2002\u2003\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 3;
                continue;

            case 4:
                this.state = 5;
                return -3;

            case 5:
                this.bsMark(8);
                this.state = 6;
                break;
            case 6:
                this.setArgs();
                this.state = 7;
                return 16;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 8:
                this.state = 9;
                continue;

            case 9:
                return -1;

            }
        }
    }

    private int _16_comment() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.COMMENT);
                if (!(this.literal("#"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.notNewlineChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

    private int _17_statementlist() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(3);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 12;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                if (this.lookahead(89)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 5;
                return 18;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(6);
                ++rep;
                this.bsCommit(6);
                this.bsMark(6, rep);
                this.state = 4;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _18_statement() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (this.lookahead(90)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(6);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 23;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 2:
                this.bsMark(4);
                this.setArgs("");
                this.state = 3;
                return 70;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 4:
                this.setArgs();
                this.state = 5;
                return 19;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 6;
                continue;

            case 6:
                this.bsFailMark(11);
                this.bsMark(8);
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 7;
                return -3;

            case 7:
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 8:
                this.bsMark(10);
                if (!(this.lookahead(91))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 12;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 10:
                this.state = 11;
                continue;

            case 11:
                this.setArgs();
                this.state = 12;
                return 12;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _19_bogus_statement() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.BAD_CHARACTER);
                this.bsFailMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.notInCharList(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

    private int _20_terminator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(14);
                this.bsMark(1);
                if (!(this.lookahead(92))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.lookahead(93))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 2:
                this.bsMark(13);
                this.bsFailMark(11);
                this.bsMark(3);
                if (!(this.literal("if"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("unless"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("while"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("for"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 7:
                this.bsMark(8);
                if (!(this.literal("given"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 8:
                this.bsMark(9);
                if (!(this.literal("when"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 9:
                this.bsMark(10);
                if (!(this.literal("with"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 10:
                if (!(this.literal("without"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 11;
                continue;

            case 11:
                this.setArgs();
                this.state = 12;
                return 10;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 13:
                if (!(this.literal("-->"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 14;
                continue;

            case 14:
                return -1;

            }
        }
    }

    private int _21_blockoid() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.BLOCK_CURLY_BRACKET);
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.setArgs();
                this.state = 2;
                return 17;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                this.startToken(Perl6TokenTypes.BLOCK_CURLY_BRACKET);
                if (!(this.literal("}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                return -3;

            case 4:
                if (!(this.lookahead(94))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _22_stdstopper() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.lookahead(95))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

    private int _23_statement_control() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 24;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _24_statement_control_use() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("use"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.setArgs();
                this.state = 2;
                return 12;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 3;
                return 8;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _25_term() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(20);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 33;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 2:
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 26;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 4:
                this.bsMark(6);
                this.setArgs();
                this.state = 5;
                return 34;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 6:
                this.bsMark(8);
                this.setArgs();
                this.state = 7;
                return 38;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 8:
                this.bsMark(10);
                if (!(this.lookahead(96))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 36;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 10:
                this.bsMark(12);
                this.setArgs();
                this.state = 11;
                return 75;

            case 11:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 12:
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 45;

            case 13:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 14:
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 27;

            case 15:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 16:
                this.bsMark(18);
                this.setArgs();
                this.state = 17;
                return 28;

            case 17:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 18:
                this.setArgs();
                this.state = 19;
                return 29;

            case 19:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 20;
                continue;

            case 20:
                return -1;

            }
        }
    }

    private int _26_term_ident() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(97))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.SUB_CALL_NAME);
                this.setArgs();
                this.state = 1;
                return 4;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                if (!(this.lookahead(98))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                this.setArgs();
                this.state = 6;
                return 30;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _27_term_name() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(10);
                this.bsMark(3);
                if (!(this.lookahead(99))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.NAME);
                this.setArgs();
                this.state = 1;
                return 7;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 3:
                this.startToken(Perl6TokenTypes.SUB_CALL_NAME);
                this.setArgs();
                this.state = 4;
                return 7;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 5;
                return -3;

            case 5:
                this.bsMark(8);
                this.state = 6;
                break;
            case 6:
                if (!(this.lookahead(100))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 7;
                return -3;

            case 7:
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 8:
                this.setArgs();
                this.state = 9;
                return 30;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 10;
                continue;

            case 10:
                return -1;

            }
        }
    }

    private int _28_term_whatever() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.WHATEVER);
                if (!(this.literal("*"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                return -1;

            }
        }
    }

    private int _29_term_hyperwhatever() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.HYPER_WHATEVER);
                if (!(this.literal("*"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                return -1;

            }
        }
    }

    private int _30_args() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(17);
                this.bsMark(6);
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.setArgs();
                this.state = 2;
                return 31;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 6:
                this.bsMark(13);
                this.setArgs();
                this.state = 7;
                return 13;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 8;
                return -3;

            case 8:
                this.setArgs();
                this.state = 9;
                return 31;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(12);
                this.state = 10;
                break;
            case 10:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 11;
                return -3;

            case 11:
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 13:
                this.bsMark(16);
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 14;
                return -3;

            case 14:
                this.setArgs();
                this.state = 15;
                return 32;

            case 15:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 16:
                this.state = 17;
                continue;

            case 17:
                return -1;

            }
        }
    }

    private int _31_semiarglist() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 32;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 2;
                return 12;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _32_arglist() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 12;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(4);
                this.bsMark(3);
                if (this.lookahead(101)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs("e=");
                this.state = 2;
                return 70;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 3:
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _33_variable() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.VARIABLE);
                this.setArgs();
                this.state = 1;
                return 42;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(4);
                this.state = 2;
                break;
            case 2:
                this.setArgs();
                this.state = 3;
                return 43;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 4:
                this.setArgs();
                this.state = 5;
                return 44;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 6;
                return -3;

            case 6:
                return -1;

            }
        }
    }

    private int _34_scope_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.SCOPE_DECLARATOR);
                this.bsFailMark(9);
                this.bsMark(1);
                if (!(this.literal("my"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("our"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("has"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("HAS"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("augment"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("anon"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("state"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 7:
                this.bsMark(8);
                if (!(this.literal("supersede"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 8:
                if (!(this.literal("unit"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 9;
                continue;

            case 9:
                this.setArgs();
                this.state = 10;
                return 9;

            case 10:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 11;
                return -3;

            case 11:
                this.setArgs();
                this.state = 12;
                return 12;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(15);
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 35;

            case 13:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 14:
                this.state = 15;
                continue;

            case 15:
                return -1;

            }
        }
    }

    private int _35_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.bsMark(6);
                this.setArgs();
                this.state = 1;
                return 37;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 2;
                break;
            case 2:
                this.setArgs();
                this.state = 3;
                return 12;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 4;
                return 41;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 6:
                this.setArgs();
                this.state = 7;
                return 38;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 8;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _36_multi_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(13);
                this.bsMark(11);
                if (!(this.lookahead(102))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.MULTI_DECLARATOR);
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("multi"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("proto"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.literal("only"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.state = 4;
                return -3;

            case 4:
                this.setArgs();
                this.state = 5;
                return 10;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(10);
                this.bsMark(7);
                this.setArgs();
                this.state = 6;
                return 35;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 7:
                this.bsMark(9);
                this.setArgs();
                this.state = 8;
                return 39;

            case 8:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 9:
                this.state = 10;
                continue;

            case 10:
                this.bsCommit(13);
                this.state = 13;
                continue;

            case 11:
                this.setArgs();
                this.state = 12;
                return 35;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 13;
                continue;

            case 13:
                return -1;

            }
        }
    }

    private int _37_variable_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 33;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _38_routine_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.ROUTINE_DECLARATOR);
                if (!(this.literal("sub"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 9;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                this.setArgs();
                this.state = 3;
                return 39;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _39_routine_def() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 12;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 2;
                break;
            case 2:
                this.startToken(Perl6TokenTypes.ROUTINE_NAME);
                this.setArgs();
                this.state = 3;
                return 7;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                this.setArgs();
                this.state = 6;
                return 12;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(13);
                this.state = 7;
                break;
            case 7:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 8;
                return -3;

            case 8:
                this.setArgs();
                this.state = 9;
                return 12;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(12);
                this.state = 10;
                break;
            case 10:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 11;
                return -3;

            case 11:
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.bsCommit(13);
                this.state = 13;
                continue;

            case 13:
                this.setArgs();
                this.state = 14;
                return 12;

            case 14:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(19);
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 40;

            case 15:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(19);
                this.state = 19;
                continue;

            case 16:
                this.bsMark(18);
                this.setArgs();
                this.state = 17;
                return 21;

            case 17:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(19);
                this.state = 19;
                continue;

            case 18:
                this.state = 19;
                continue;

            case 19:
                return -1;

            }
        }
    }

    private int _40_onlystar() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(103))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.BLOCK_CURLY_BRACKET);
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.setArgs();
                this.state = 2;
                return 12;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.startToken(Perl6TokenTypes.ONLY_STAR);
                if (!(this.literal("*"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                return -3;

            case 3:
                this.setArgs();
                this.state = 4;
                return 12;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.startToken(Perl6TokenTypes.BLOCK_CURLY_BRACKET);
                if (!(this.literal("}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 5;
                return -3;

            case 5:
                if (!(this.lookahead(104))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _41_initializer() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.INFIX);
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal(":="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.literal("::="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.state = 4;
                return -3;

            case 4:
                this.setArgs();
                this.state = 5;
                return 12;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(8);
                this.state = 6;
                break;
            case 6:
                this.setArgs("e=");
                this.state = 7;
                return 70;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _42_sigil() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.inCharList("$@%&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _43_twigil() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.inCharList(".!^:*?=~"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(105))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _44_desigilname() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 7;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _45_value() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 46;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 62;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _46_number() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 47;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _47_numish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(9);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 48;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 2:
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 51;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 4:
                this.startToken(Perl6TokenTypes.NUMBER_LITERAL);
                this.bsFailMark(7);
                this.bsMark(5);
                if (!(this.literal("\u221E"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("NaN"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 6:
                if (!(this.literal("Inf"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 7;
                continue;

            case 7:
                this.state = 8;
                return -3;

            case 8:
                this.state = 9;
                continue;

            case 9:
                return -1;

            }
        }
    }

    private int _48_dec_number() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(19);
                this.bsMark(12);
                this.startToken(Perl6TokenTypes.NUMBER_LITERAL);
                this.bsFailMark(10);
                this.bsMark(3);
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 53;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 2;
                return 49;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 3:
                this.bsMark(7);
                this.setArgs();
                this.state = 4;
                return 53;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 5;
                return 53;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 6;
                return 49;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 7:
                this.setArgs();
                this.state = 8;
                return 53;

            case 8:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 9;
                return 49;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 10;
                continue;

            case 10:
                this.state = 11;
                return -3;

            case 11:
                this.bsCommit(19);
                this.state = 19;
                continue;

            case 12:
                this.startToken(Perl6TokenTypes.RAT_LITERAL);
                this.bsFailMark(17);
                this.bsMark(14);
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 13;
                return 53;

            case 13:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 14:
                this.setArgs();
                this.state = 15;
                return 53;

            case 15:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 16;
                return 53;

            case 16:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 17;
                continue;

            case 17:
                this.state = 18;
                return -3;

            case 18:
                this.state = 19;
                continue;

            case 19:
                return -1;

            }
        }
    }

    private int _49_escale() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.inCharList("Ee"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 50;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 2;
                return 53;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _50_sign() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(1);
                if (!(this.literal("+"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("-"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("\u2212"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 3:
                if (!(this.literal(""))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _51_integer() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.INTEGER_LITERAL);
                this.setArgs();
                this.state = 1;
                return 52;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                return -1;

            }
        }
    }

    private int _52_integer_lex() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(21);
                this.bsMark(19);
                if (!(this.literal("0"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(18);
                this.bsMark(4);
                if (!(this.literal("b"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 56;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(18);
                this.state = 18;
                continue;

            case 4:
                this.bsMark(8);
                if (!(this.literal("o"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                this.setArgs();
                this.state = 7;
                return 55;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(18);
                this.state = 18;
                continue;

            case 8:
                this.bsMark(12);
                if (!(this.literal("x"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(10);
                this.state = 9;
                break;
            case 9:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 10:
                this.setArgs();
                this.state = 11;
                return 54;

            case 11:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(18);
                this.state = 18;
                continue;

            case 12:
                this.bsMark(16);
                if (!(this.literal("d"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(14);
                this.state = 13;
                break;
            case 13:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 14:
                this.setArgs();
                this.state = 15;
                return 53;

            case 15:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(18);
                this.state = 18;
                continue;

            case 16:
                this.setArgs();
                this.state = 17;
                return 53;

            case 17:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 18;
                continue;

            case 18:
                this.bsCommit(21);
                this.state = 21;
                continue;

            case 19:
                this.setArgs();
                this.state = 20;
                return 53;

            case 20:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 21;
                continue;

            case 21:
                return -1;

            }
        }
    }

    private int _53_decint() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                rep = this.peekRep(5);
                ++rep;
                this.bsCommit(5);
                this.bsMark(5, rep);
                this.state = 4;
                continue;

            case 4:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _54_hexint() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(7);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(5);
                this.state = 2;
                break;
            case 2:
                this.bsFailMark(4);
                this.bsMark(3);
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 3:
                if (!(this.inCharList("abcdefABCDEF\uFF41\uFF42\uFF43\uFF44\uFF45\uFF46\uFF21\uFF22\uFF23\uFF24\uFF25\uFF26"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                continue;

            case 4:
                rep = this.peekRep(5);
                ++rep;
                this.bsCommit(5);
                this.bsMark(5, rep);
                this.state = 2;
                continue;

            case 5:
                rep = this.peekRep(7);
                ++rep;
                this.bsCommit(7);
                this.bsMark(7, rep);
                this.state = 6;
                continue;

            case 6:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 7:
                return -1;

            }
        }
    }

    private int _55_octint() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                rep = this.peekRep(5);
                ++rep;
                this.bsCommit(5);
                this.bsMark(5, rep);
                this.state = 4;
                continue;

            case 4:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _56_binint() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                rep = this.peekRep(5);
                ++rep;
                this.bsCommit(5);
                this.bsMark(5, rep);
                this.state = 4;
                continue;

            case 4:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _57_charname() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 52;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 2:
                if (!(this.alphaChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(4);
                this.state = 3;
                break;
            case 3:
                if (this.lookahead(106)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.anyChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 3;
                continue;

            case 4:
                this.state = 5;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _58_hexints() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.state = 1;
                break;
            case 1:
                this.bsMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 54;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(6);
                ++rep;
                this.bsCommit(6);
                this.bsMark(6, rep);
                this.state = 5;
                continue;

            case 6:
                rep = this.peekRep(8);
                ++rep;
                this.bsCommit(8);
                this.bsMark(8, rep);
                this.state = 7;
                continue;

            case 7:
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _59_octints() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.state = 1;
                break;
            case 1:
                this.bsMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 55;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(6);
                ++rep;
                this.bsCommit(6);
                this.bsMark(6, rep);
                this.state = 5;
                continue;

            case 6:
                rep = this.peekRep(8);
                ++rep;
                this.bsCommit(8);
                this.bsMark(8, rep);
                this.state = 7;
                continue;

            case 7:
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _60_charnames() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.state = 1;
                break;
            case 1:
                this.bsMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 57;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(6);
                ++rep;
                this.bsCommit(6);
                this.bsMark(6, rep);
                this.state = 5;
                continue;

            case 6:
                rep = this.peekRep(8);
                ++rep;
                this.bsCommit(8);
                this.bsMark(8, rep);
                this.state = 7;
                continue;

            case 7:
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _61_charspec() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(10);
                this.bsMark(2);
                if (!(this.literal("["))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 60;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 2:
                this.bsMark(9);
                this.bsFailMark(4);
                this.state = 3;
                break;
            case 3:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 3;
                continue;

            case 4:
                this.bsMark(8);
                this.state = 5;
                break;
            case 5:
                if (!(this.literal("_"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(7);
                this.state = 6;
                break;
            case 6:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(7);
                ++rep;
                this.bsCommit(7);
                this.bsMark(7, rep);
                this.state = 6;
                continue;

            case 7:
                rep = this.peekRep(8);
                ++rep;
                this.bsCommit(8);
                this.bsMark(8, rep);
                this.state = 5;
                continue;

            case 8:
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 9:
                if (!(this.inCharList("?@ABCDEFGHIJKLMNOPQRSTUVWXYZ"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 10;
                continue;

            case 10:
                return -1;

            }
        }
    }

    private int _62_quote() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.declareDynamicVariable("$*Q_BACKSLASH", 0);
                this.declareDynamicVariable("$*Q_QBACKSLASH", 0);
                this.declareDynamicVariable("$*Q_QQBACKSLASH", 0);
                this.declareDynamicVariable("$*Q_CLOSURES", 0);
                this.declareDynamicVariable("$*Q_SCALARS", 0);
                this.declareDynamicVariable("$*Q_ARRAYS", 0);
                this.declareDynamicVariable("$*Q_HASHES", 0);
                this.declareDynamicVariable("$*Q_FUNCTIONS", 0);
                this.bsFailMark(54);
                this.bsMark(6);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("'"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.setArgs("'", "'", "'");
                this.state = 2;
                return 64;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("'"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 5:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 6:
                this.bsMark(12);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u2018"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 7;
                return -3;

            case 7:
                this.setArgs("\u2018", "\u2019", "\u2019");
                this.state = 8;
                return 64;

            case 8:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(11);
                this.state = 9;
                break;
            case 9:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u2019"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 10;
                return -3;

            case 10:
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 11:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 12:
                this.bsMark(18);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u201A"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 13;
                return -3;

            case 13:
                this.setArgs("\u201A", "\u2019", "\u2018");
                this.state = 14;
                return 64;

            case 14:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(17);
                this.state = 15;
                break;
            case 15:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.inCharList("\u2019\u2018"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 16;
                return -3;

            case 16:
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 17:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 18:
                this.bsMark(24);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u2019"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 19;
                return -3;

            case 19:
                this.setArgs("\u2019", "\u2019", "\u2018");
                this.state = 20;
                return 64;

            case 20:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(23);
                this.state = 21;
                break;
            case 21:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.inCharList("\u2019\u2018"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 22;
                return -3;

            case 22:
                this.bsCommit(23);
                this.state = 23;
                continue;

            case 23:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 24:
                this.bsMark(30);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\""))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 25;
                return -3;

            case 25:
                this.setArgs("\"", "\"", "\"");
                this.state = 26;
                return 65;

            case 26:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(29);
                this.state = 27;
                break;
            case 27:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\""))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 28;
                return -3;

            case 28:
                this.bsCommit(29);
                this.state = 29;
                continue;

            case 29:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 30:
                this.bsMark(36);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u201C"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 31;
                return -3;

            case 31:
                this.setArgs("\u201C", "\u201D", "\u201D");
                this.state = 32;
                return 65;

            case 32:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(35);
                this.state = 33;
                break;
            case 33:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u201D"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 34;
                return -3;

            case 34:
                this.bsCommit(35);
                this.state = 35;
                continue;

            case 35:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 36:
                this.bsMark(42);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u201E"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 37;
                return -3;

            case 37:
                this.setArgs("\u201E", "\u201D", "\u201C");
                this.state = 38;
                return 65;

            case 38:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(41);
                this.state = 39;
                break;
            case 39:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.inCharList("\u201D\u201C"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 40;
                return -3;

            case 40:
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 41:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 42:
                this.bsMark(48);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\u201D"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 43;
                return -3;

            case 43:
                this.setArgs("\u201D", "\u201D", "\u201C");
                this.state = 44;
                return 65;

            case 44:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(47);
                this.state = 45;
                break;
            case 45:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.inCharList("\u201D\u201C"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 46;
                return -3;

            case 46:
                this.bsCommit(47);
                this.state = 47;
                continue;

            case 47:
                this.bsCommit(54);
                this.state = 54;
                continue;

            case 48:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\uFF62"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 49;
                return -3;

            case 49:
                this.setArgs("\uFF62", "\uFF63", "\uFF63");
                this.state = 50;
                return 63;

            case 50:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(53);
                this.state = 51;
                break;
            case 51:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                if (!(this.literal("\uFF63"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 52;
                return -3;

            case 52:
                this.bsCommit(53);
                this.state = 53;
                continue;

            case 53:
                this.state = 54;
                continue;

            case 54:
                return -1;

            }
        }
    }

    private int _63_quote_Q() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(3);
                this.declareDynamicVariable("$*STARTER", this.getArg(0));
                this.declareDynamicVariable("$*STOPPER", this.getArg(1));
                this.declareDynamicVariable("$*ALT_STOPPER", this.getArg(2));
                this.setArgs();
                this.state = 1;
                return 66;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _64_quote_q() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(3);
                this.declareDynamicVariable("$*STARTER", this.getArg(0));
                this.declareDynamicVariable("$*STOPPER", this.getArg(1));
                this.declareDynamicVariable("$*ALT_STOPPER", this.getArg(2));
                this.assignDynamicVariable("$*Q_QBACKSLASH", 1);
                this.setArgs();
                this.state = 1;
                return 66;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _65_quote_qq() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(3);
                this.declareDynamicVariable("$*STARTER", this.getArg(0));
                this.declareDynamicVariable("$*STOPPER", this.getArg(1));
                this.declareDynamicVariable("$*ALT_STOPPER", this.getArg(2));
                this.assignDynamicVariable("$*Q_BACKSLASH", 1);
                this.assignDynamicVariable("$*Q_QQBACKSLASH", 1);
                this.assignDynamicVariable("$*Q_CLOSURES", 1);
                this.assignDynamicVariable("$*Q_SCALARS", 1);
                this.assignDynamicVariable("$*Q_ARRAYS", 1);
                this.assignDynamicVariable("$*Q_HASHES", 1);
                this.assignDynamicVariable("$*Q_FUNCTIONS", 1);
                this.setArgs();
                this.state = 1;
                return 66;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _66_quote_nibbler() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsMark(12);
                this.state = 1;
                break;
            case 1:
                if (this.lookahead(107)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(11);
                this.bsMark(7);
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                this.setArgs();
                this.state = 2;
                return 67;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 3;
                return -3;

            case 3:
                this.setArgs();
                this.state = 4;
                return 66;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.startToken(Perl6TokenTypes.STRING_LITERAL_QUOTE);
                this.setArgs();
                this.state = 5;
                return 68;

            case 5:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 6;
                return -3;

            case 6:
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 7:
                this.bsMark(9);
                this.setArgs();
                this.state = 8;
                return 69;

            case 8:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 9:
                this.startToken(Perl6TokenTypes.STRING_LITERAL_CHAR);
                if (!(this.anyChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 10;
                return -3;

            case 10:
                this.state = 11;
                continue;

            case 11:
                rep = this.peekRep(12);
                ++rep;
                this.bsCommit(12);
                this.bsMark(12, rep);
                this.state = 1;
                continue;

            case 12:
                return -1;

            }
        }
    }

    private int _67_starter() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.interpolate("$*STARTER"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int _68_stopper() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.interpolate("$*STOPPER"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.interpolate("$*ALT_STOPPER"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

    private int _69_quote_escape() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(39);
                this.bsMark(5);
                if (!(this.lookahead(108))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_SCALARS")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(4);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 33;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.startToken(Perl6TokenTypes.BAD_ESCAPE);
                if (!(this.literal("$"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                return -3;

            case 3:
                this.state = 4;
                continue;

            case 4:
                this.bsCommit(39);
                this.state = 39;
                continue;

            case 5:
                this.bsMark(24);
                if (!(this.lookahead(109))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_BACKSLASH")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STRING_LITERAL_ESCAPE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(22);
                this.bsMark(6);
                if (!(this.inCharList("abefnrt0\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(22);
                this.state = 22;
                continue;

            case 6:
                this.bsMark(11);
                if (!(this.literal("o"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(10);
                this.bsMark(8);
                this.setArgs();
                this.state = 7;
                return 55;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 8:
                if (!(this.literal("["))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 59;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 10;
                continue;

            case 10:
                this.bsCommit(22);
                this.state = 22;
                continue;

            case 11:
                this.bsMark(16);
                if (!(this.literal("x"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(15);
                this.bsMark(13);
                this.setArgs();
                this.state = 12;
                return 54;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 13:
                if (!(this.literal("["))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 14;
                return 58;

            case 14:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 15;
                continue;

            case 15:
                this.bsCommit(22);
                this.state = 22;
                continue;

            case 16:
                this.bsMark(18);
                if (!(this.literal("c"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 17;
                return 61;

            case 17:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(22);
                this.state = 22;
                continue;

            case 18:
                this.bsMark(20);
                this.setArgs();
                this.state = 19;
                return 67;

            case 19:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(22);
                this.state = 22;
                continue;

            case 20:
                this.setArgs();
                this.state = 21;
                return 68;

            case 21:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 22;
                continue;

            case 22:
                this.state = 23;
                return -3;

            case 23:
                this.bsCommit(39);
                this.state = 39;
                continue;

            case 24:
                this.bsMark(28);
                if (!(this.lookahead(110))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_BACKSLASH")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.BAD_ESCAPE);
                if (!(this.inCharList("123456789"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(26);
                this.state = 25;
                break;
            case 25:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(26);
                ++rep;
                this.bsCommit(26);
                this.bsMark(26, rep);
                this.state = 25;
                continue;

            case 26:
                this.state = 27;
                return -3;

            case 27:
                this.bsCommit(39);
                this.state = 39;
                continue;

            case 28:
                this.bsMark(30);
                if (!(this.lookahead(111))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_QQBACKSLASH")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STRING_LITERAL_ESCAPE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.notWordChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 29;
                return -3;

            case 29:
                this.bsCommit(39);
                this.state = 39;
                continue;

            case 30:
                this.bsMark(32);
                if (!(this.lookahead(112))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_QQBACKSLASH")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.BAD_ESCAPE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.wordChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 31;
                return -3;

            case 31:
                this.bsCommit(39);
                this.state = 39;
                continue;

            case 32:
                if (!(this.lookahead(113))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_QBACKSLASH")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STRING_LITERAL_ESCAPE);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(37);
                this.bsMark(33);
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(37);
                this.state = 37;
                continue;

            case 33:
                this.bsMark(35);
                this.setArgs();
                this.state = 34;
                return 67;

            case 34:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(37);
                this.state = 37;
                continue;

            case 35:
                this.setArgs();
                this.state = 36;
                return 68;

            case 36:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 37;
                continue;

            case 37:
                this.state = 38;
                return -3;

            case 38:
                this.state = 39;
                continue;

            case 39:
                return -1;

            }
        }
    }

    private int _70_EXPR() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(1);
                this.declareDynamicVariable("$*PRECLIM", this.getArg(0));
                this.declareDynamicVariable("$*PREC", "");
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 71;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 1;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 80;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(7);
                this.state = 5;
                break;
            case 5:
                this.setArgs();
                this.state = 6;
                return 73;

            case 6:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(7);
                ++rep;
                this.bsCommit(7);
                this.bsMark(7, rep);
                this.state = 5;
                continue;

            case 7:
                this.bsMark(21);
                this.state = 8;
                break;
            case 8:
                if (!(this.lookahead(114))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 12;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 10;
                return 78;

            case 10:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 11;
                return 12;

            case 11:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(20);
                this.state = 12;
                break;
            case 12:
                this.bsMark(15);
                this.state = 13;
                break;
            case 13:
                this.setArgs();
                this.state = 14;
                return 71;

            case 14:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(15);
                ++rep;
                this.bsCommit(15);
                this.bsMark(15, rep);
                this.state = 13;
                continue;

            case 15:
                this.setArgs();
                this.state = 16;
                return 80;

            case 16:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(19);
                this.state = 17;
                break;
            case 17:
                this.setArgs();
                this.state = 18;
                return 73;

            case 18:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                rep = this.peekRep(19);
                ++rep;
                this.bsCommit(19);
                this.bsMark(19, rep);
                this.state = 17;
                continue;

            case 19:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 20:
                rep = this.peekRep(21);
                ++rep;
                this.bsCommit(21);
                this.bsMark(21, rep);
                this.state = 8;
                continue;

            case 21:
                this.startToken(Perl6TokenTypes.END_OF_EXPR);
                this.state = 22;
                return -3;

            case 22:
                return -1;

            }
        }
    }

    private int _71_prefixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 72;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _72_prefix() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.PREFIX);
                this.bsFailMark(16);
                this.bsMark(1);
                if (!(this.literal("++\u269B"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("--\u269B"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("++"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("--"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("+^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("~^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("?^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 7:
                this.bsMark(8);
                if (!(this.literal("+"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 8:
                this.bsMark(9);
                if (!(this.literal("~"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 9:
                this.bsMark(10);
                if (!(this.literal("-"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 10:
                this.bsMark(11);
                if (!(this.literal("\u2212"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 11:
                this.bsMark(12);
                if (!(this.literal("?"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 12:
                this.bsMark(13);
                if (!(this.literal("!"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 13:
                this.bsMark(14);
                if (!(this.literal("|"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 14:
                this.bsMark(15);
                if (!(this.literal("^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 15:
                if (!(this.literal("\u269B"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.state = 16;
                continue;

            case 16:
                this.state = 17;
                return -3;

            case 17:
                return -1;

            }
        }
    }

    private int _73_postfixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 74;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 75;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.assignDynamicVariable("$*PREC", "y=");
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _74_postfix() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.POSTFIX);
                this.bsFailMark(10);
                this.bsMark(1);
                if (!(this.literal("i"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "y=");
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("\u269B++"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("\u269B--"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("++"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("--"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "x=");
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 5:
                this.bsMark(7);
                this.state = 6;
                break;
            case 6:
                if (!(this.inCharList("\u207B\u207A\u00AF"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 7:
                this.bsFailMark(9);
                this.state = 8;
                break;
            case 8:
                if (!(this.inCharList("\u2070\u00B9\u00B2\u00B3\u2074\u2075\u2076\u2077\u2078\u2079"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(9);
                ++rep;
                this.bsCommit(9);
                this.bsMark(9, rep);
                this.state = 8;
                continue;

            case 9:
                this.assignDynamicVariable("$*PREC", "x=");
                this.state = 10;
                continue;

            case 10:
                this.state = 11;
                return -3;

            case 11:
                return -1;

            }
        }
    }

    private int _75_dotty() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.METHOD_CALL_OPERATOR);
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsMark(4);
                this.state = 1;
                break;
            case 1:
                this.bsFailMark(3);
                this.bsMark(2);
                if (!(this.inCharList("+*?="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.literal("^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 4:
                this.state = 5;
                return -3;

            case 5:
                this.bsMark(8);
                this.state = 6;
                break;
            case 6:
                this.setArgs();
                this.state = 7;
                return 76;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _76_dottyop() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 13;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 77;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _77_methodop() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.bsMark(3);
                this.startToken(Perl6TokenTypes.METHOD_CALL_NAME);
                this.setArgs();
                this.state = 1;
                return 7;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 2;
                return -3;

            case 2:
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 3:
                if (!(this.lookahead(115))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 4;
                return 33;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 5;
                continue;

            case 5:
                this.bsMark(8);
                this.state = 6;
                break;
            case 6:
                this.setArgs();
                this.state = 7;
                return 13;

            case 7:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 8:
                this.bsFailMark(15);
                this.bsMark(14);
                this.bsFailMark(13);
                this.bsMark(10);
                if (!(this.lookahead(116))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 30;

            case 9:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(13);
                this.state = 13;
                continue;

            case 10:
                if (!(this.lookahead(117))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.INVOCANT_MARKER);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 11;
                return -3;

            case 11:
                this.setArgs();
                this.state = 12;
                return 32;

            case 12:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 13;
                continue;

            case 13:
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 14:
                this.state = 15;
                continue;

            case 15:
                this.bsMark(18);
                this.state = 16;
                break;
            case 16:
                this.setArgs();
                this.state = 17;
                return 13;

            case 17:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(18);
                this.state = 18;
                continue;

            case 18:
                return -1;

            }
        }
    }

    private int _78_infixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 79;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int _79_infix() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.INFIX);
                this.bsFailMark(144);
                this.bsMark(1);
                if (!(this.literal("notandthen"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "d=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("andthen"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "d=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("(elem)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("(cont)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("orelse"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "c=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("unicmp"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("minmax"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 7:
                this.bsMark(8);
                if (!(this.literal("before"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 8:
                this.bsMark(9);
                if (!(this.literal("after"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 9:
                this.bsMark(10);
                if (!(this.literal("^fff^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 10:
                this.bsMark(11);
                if (!(this.literal("...^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 11:
                this.bsMark(12);
                if (!(this.literal("^ff^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 12:
                this.bsMark(13);
                if (!(this.literal("^fff"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 13:
                this.bsMark(14);
                if (!(this.literal("fff^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 14:
                this.bsMark(15);
                if (!(this.literal("<<=="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "b=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 15:
                this.bsMark(16);
                if (!(this.literal("==>>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "b=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 16:
                this.bsMark(17);
                if (!(this.literal("^..^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 17:
                this.bsMark(18);
                if (!(this.literal("coll"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 18:
                this.bsMark(19);
                if (!(this.literal("does"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 19:
                this.bsMark(20);
                if (!(this.literal("div"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 20:
                this.bsMark(21);
                if (!(this.literal("gcd"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 21:
                this.bsMark(22);
                if (!(this.literal("lcm"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 22:
                this.bsMark(23);
                if (!(this.literal("mod"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 23:
                this.bsMark(24);
                if (!(this.literal("(&)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "q=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 24:
                this.bsMark(25);
                if (!(this.literal("(.)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "q=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 25:
                this.bsMark(26);
                if (!(this.literal("(|)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 26:
                this.bsMark(27);
                if (!(this.literal("(^)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 27:
                this.bsMark(28);
                if (!(this.literal("(+)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 28:
                this.bsMark(29);
                if (!(this.literal("(-)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 29:
                this.bsMark(30);
                if (!(this.literal("=~="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 30:
                this.bsMark(31);
                if (!(this.literal("=:="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 31:
                this.bsMark(32);
                if (!(this.literal("==="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 32:
                this.bsMark(33);
                if (!(this.literal("eqv"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 33:
                this.bsMark(34);
                if (!(this.literal("!~~"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 34:
                this.bsMark(35);
                if (!(this.literal("(<)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 35:
                this.bsMark(36);
                if (!(this.literal("(>)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 36:
                this.bsMark(37);
                if (!(this.literal("(<=)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 37:
                this.bsMark(38);
                if (!(this.literal("(>=)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 38:
                this.bsMark(39);
                if (!(this.literal("(<+)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 39:
                this.bsMark(40);
                if (!(this.literal("(>+)"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 40:
                this.bsMark(41);
                if (!(this.literal("min"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "k=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 41:
                this.bsMark(42);
                if (!(this.literal("max"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "k=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 42:
                this.bsMark(43);
                if (!(this.literal("::="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 43:
                this.bsMark(44);
                if (!(this.literal("..."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 44:
                this.bsMark(45);
                if (!(this.literal("^ff"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 45:
                this.bsMark(46);
                if (!(this.literal("ff^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 46:
                this.bsMark(47);
                if (!(this.literal("fff"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 47:
                this.bsMark(48);
                if (!(this.literal("\u269B+="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 48:
                this.bsMark(49);
                if (!(this.literal("\u269B-="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 49:
                this.bsMark(50);
                if (!(this.literal("\u269B\u2212="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 50:
                this.bsMark(51);
                if (!(this.literal("and"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "d=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 51:
                this.bsMark(52);
                if (!(this.literal("xor"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "c=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 52:
                this.bsMark(53);
                if (!(this.literal("<=="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "b=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 53:
                this.bsMark(54);
                if (!(this.literal("==>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "b=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 54:
                this.bsMark(55);
                if (!(this.literal("^.."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 55:
                this.bsMark(56);
                if (!(this.literal("..^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 56:
                this.bsMark(57);
                if (!(this.literal("leg"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 57:
                this.bsMark(58);
                if (!(this.literal("cmp"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 58:
                this.bsMark(59);
                if (!(this.literal("<=>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 59:
                this.bsMark(60);
                if (!(this.literal("but"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 60:
                this.bsMark(61);
                if (!(this.literal("**"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "w=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 61:
                this.bsMark(62);
                if (!(this.literal("%%"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 62:
                this.bsMark(63);
                if (!(this.literal("+&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 63:
                this.bsMark(64);
                if (!(this.literal("~&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 64:
                this.bsMark(65);
                if (!(this.literal("?&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 65:
                this.bsMark(66);
                if (!(this.literal("+<"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 66:
                this.bsMark(67);
                if (!(this.literal("+>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 67:
                this.bsMark(68);
                if (!(this.literal("~<"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 68:
                this.bsMark(69);
                if (!(this.literal("~>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 69:
                this.bsMark(70);
                if (!(this.literal("+|"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 70:
                this.bsMark(71);
                if (!(this.literal("+^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 71:
                this.bsMark(72);
                if (!(this.literal("~|"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 72:
                this.bsMark(73);
                if (!(this.literal("~^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 73:
                this.bsMark(74);
                if (!(this.literal("?|"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 74:
                this.bsMark(75);
                if (!(this.literal("?^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 75:
                this.bsMark(76);
                if (!(this.literal("xx"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "s=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 76:
                this.bsMark(77);
                if (!(this.literal("=="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 77:
                this.bsMark(78);
                if (!(this.literal("!="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 78:
                this.bsMark(79);
                if (!(this.literal("<="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 79:
                this.bsMark(80);
                if (!(this.literal(">="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 80:
                this.bsMark(81);
                if (!(this.literal("eq"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 81:
                this.bsMark(82);
                if (!(this.literal("ne"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 82:
                this.bsMark(83);
                if (!(this.literal("le"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 83:
                this.bsMark(84);
                if (!(this.literal("ge"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 84:
                this.bsMark(85);
                if (!(this.literal("lt"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 85:
                this.bsMark(86);
                if (!(this.literal("gt"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 86:
                this.bsMark(87);
                if (!(this.literal("~~"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 87:
                this.bsMark(88);
                if (!(this.literal("&&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "l=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 88:
                this.bsMark(89);
                if (!(this.literal("||"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "k=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 89:
                this.bsMark(90);
                if (!(this.literal("^^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "k=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 90:
                this.bsMark(91);
                if (!(this.literal("//"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "k=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 91:
                this.bsMark(92);
                if (!(this.literal(":="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 92:
                this.bsMark(93);
                if (!(this.literal(".="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "v=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 93:
                this.bsMark(94);
                if (!(this.literal("\u2026^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 94:
                this.bsMark(95);
                if (!(this.literal("ff"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "j=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 95:
                this.bsMark(96);
                if (!(this.literal("\u269B="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 96:
                this.bsMark(97);
                if (!(this.literal("or"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "c=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 97:
                this.bsMark(98);
                if (!(this.literal(".."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "n=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 98:
                this.bsMark(99);
                if (!(this.literal("*"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 99:
                this.bsMark(100);
                if (!(this.literal("\u00D7"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 100:
                this.bsMark(101);
                if (!(this.literal("/"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 101:
                this.bsMark(102);
                if (!(this.literal("\u00F7"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 102:
                this.bsMark(103);
                if (!(this.literal("%"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "u=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 103:
                this.bsMark(104);
                if (!(this.literal("+"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 104:
                this.bsMark(105);
                if (!(this.literal("-"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 105:
                this.bsMark(106);
                if (!(this.literal("\u2212"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "t=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 106:
                this.bsMark(107);
                if (!(this.literal("x"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "s=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 107:
                this.bsMark(108);
                if (!(this.literal("~"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "r=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 108:
                this.bsMark(109);
                if (!(this.literal("\u2218"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "r=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 109:
                this.bsMark(110);
                if (!(this.literal("o"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "r=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 110:
                this.bsMark(111);
                if (!(this.literal("&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "q=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 111:
                this.bsMark(112);
                if (!(this.literal("\u2229"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "q=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 112:
                this.bsMark(113);
                if (!(this.literal("\u228D"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "q=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 113:
                this.bsMark(114);
                if (!(this.literal("|"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 114:
                this.bsMark(115);
                if (!(this.literal("^"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 115:
                this.bsMark(116);
                if (!(this.literal("\u222A"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 116:
                this.bsMark(117);
                if (!(this.literal("\u2296"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 117:
                this.bsMark(118);
                if (!(this.literal("\u228E"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 118:
                this.bsMark(119);
                if (!(this.literal("\u2216"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "p=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 119:
                this.bsMark(120);
                if (!(this.literal("\u2245"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 120:
                this.bsMark(121);
                if (!(this.literal("\u2260"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 121:
                this.bsMark(122);
                if (!(this.literal("\u2264"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 122:
                this.bsMark(123);
                if (!(this.literal("\u2265"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 123:
                this.bsMark(124);
                if (!(this.literal("<"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 124:
                this.bsMark(125);
                if (!(this.literal(">"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 125:
                this.bsMark(126);
                if (!(this.literal("\u2208"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 126:
                this.bsMark(127);
                if (!(this.literal("\u2209"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 127:
                this.bsMark(128);
                if (!(this.literal("\u220B"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 128:
                this.bsMark(129);
                if (!(this.literal("\u220C"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 129:
                this.bsMark(130);
                if (!(this.literal("\u2282"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 130:
                this.bsMark(131);
                if (!(this.literal("\u2284"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 131:
                this.bsMark(132);
                if (!(this.literal("\u2283"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 132:
                this.bsMark(133);
                if (!(this.literal("\u2285"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 133:
                this.bsMark(134);
                if (!(this.literal("\u2286"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 134:
                this.bsMark(135);
                if (!(this.literal("\u2288"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 135:
                this.bsMark(136);
                if (!(this.literal("\u2287"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 136:
                this.bsMark(137);
                if (!(this.literal("\u2289"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 137:
                this.bsMark(138);
                if (!(this.literal("\u227C"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 138:
                this.bsMark(139);
                if (!(this.literal("\u227D"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "m=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 139:
                this.bsMark(140);
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "g=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 140:
                this.bsMark(141);
                if (!(this.literal("Z"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 141:
                this.bsMark(142);
                if (!(this.literal("X"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 142:
                this.bsMark(143);
                if (!(this.literal("\u2026"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "f=");
                this.bsCommit(144);
                this.state = 144;
                continue;

            case 143:
                if (!(this.literal("="))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.assignDynamicVariable("$*PREC", "i=");
                this.state = 144;
                continue;

            case 144:
                if (this.isValueTruthy(this.testStrLE(this.findDynamicVariable("$*PREC"), this.findDynamicVariable("$*PRECLIM")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 145;
                return -3;

            case 145:
                return -1;

            }
        }
    }

    private int _80_termish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 25;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_0() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(4);
                this.bsMark(1);
                if (!(this.inCharList("(\\'-"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 1:
                this.bsMark(3);
                this.state = 2;
                break;
            case 2:
                if (!(this.inCharList("	 \u00A0\u1680\u180E\u2002\u2003\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(3);
                ++rep;
                this.bsCommit(3);
                this.bsMark(3, rep);
                this.state = 2;
                continue;

            case 3:
                if (!(this.literal("=>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int ___lookahead_1() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("#"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                return -1;

            }
        }
    }

    private int ___lookahead_2() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.bsMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.inCharList("	 \u00A0\u1680\u180E\u2002\u2003\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                if (!(this.endOfLine())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 3;
                return 12;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_3() {
        while (true) {
            switch (this.state) {
            case 0:
                this.marker("endstmt");
                return -1;

            }
        }
    }

    private int ___lookahead_4() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 15;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 3:
                if (!(this.endOfLine())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 4;
                return 12;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_5() {
        while (true) {
            switch (this.state) {
            case 0:
                this.marker("endstmt");
                return -1;

            }
        }
    }

    private int ___lookahead_6() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.ww())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_7() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.literal("#"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

    private int ___lookahead_8() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.inCharList(")]}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

    private int ___lookahead_9() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.inCharList("])}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.endOfString())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

    private int ___lookahead_10() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.marked("endstmt"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_11() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList(";)]}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_12() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList(">"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_13() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 11;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_14() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 20;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_15() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("multi"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("proto"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.literal("only"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                return -1;

            }
        }
    }

    private int ___lookahead_16() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 4;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsFailMark(6);
                this.bsMark(5);
                this.bsMark(4);
                this.state = 2;
                break;
            case 2:
                this.setArgs();
                this.state = 3;
                return 13;

            case 3:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 4:
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 5:
                if (!(this.literal("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int ___lookahead_17() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("\\("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_18() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(12);
                this.bsMark(1);
                if (!(this.inCharList("ABCDEFGHIJKLMNOPQRSTUVWXYZ"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("::"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 2:
                this.bsMark(7);
                this.bsMark(4);
                this.state = 3;
                break;
            case 3:
                if (!(this.literal("u"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 4:
                if (!(this.literal("int"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(6);
                ++rep;
                this.bsCommit(6);
                this.bsMark(6, rep);
                this.state = 5;
                continue;

            case 6:
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 7:
                this.bsMark(10);
                if (!(this.literal("num"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(9);
                this.state = 8;
                break;
            case 8:
                if (!(this.digitChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(9);
                ++rep;
                this.bsCommit(9);
                this.bsMark(9, rep);
                this.state = 8;
                continue;

            case 9:
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 10:
                this.bsMark(11);
                if (!(this.literal("str"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 11:
                if (!(this.literal("array"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.rightWordBoundary())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 12;
                continue;

            case 12:
                return -1;

            }
        }
    }

    private int ___lookahead_19() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("\\("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_20() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 22;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_21() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("multi"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("proto"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(3);
                this.state = 3;
                continue;

            case 2:
                if (!(this.literal("only"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 3;
                continue;

            case 3:
                this.setArgs();
                this.state = 4;
                return 10;

            case 4:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_22() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 12;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("*"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 2;
                return 12;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                if (!(this.literal("}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_23() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 11;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_24() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.wordChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_25() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.bsMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                rep = this.peekRep(2);
                ++rep;
                this.bsCommit(2);
                this.bsMark(2, rep);
                this.state = 1;
                continue;

            case 2:
                if (!(this.inCharList("],#"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_26() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 68;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_27() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("$"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_28() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_29() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_30() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_31() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_32() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("\\"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_33() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 12;

            case 1:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.setArgs();
                this.state = 2;
                return 78;

            case 2:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                return -1;

            }
        }
    }

    private int ___lookahead_34() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("$@&"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_35() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                return -1;

            }
        }
    }

    private int ___lookahead_36() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.spaceChar())) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(2);
                this.state = 2;
                continue;

            case 1:
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                return -1;

            }
        }
    }

}
