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
            result = this._10_spacey();
            break;
        case 11:
            result = this._11_kok();
            break;
        case 12:
            result = this._12_ENDSTMT();
            break;
        case 13:
            result = this._13_ws();
            break;
        case 14:
            result = this._14_unsp();
            break;
        case 15:
            result = this._15_vws();
            break;
        case 16:
            result = this._16_unv();
            break;
        case 17:
            result = this._17_comment();
            break;
        case 18:
            result = this._18_vnum();
            break;
        case 19:
            result = this._19_version();
            break;
        case 20:
            result = this._20_statementlist();
            break;
        case 21:
            result = this._21_semilist();
            break;
        case 22:
            result = this._22_statement();
            break;
        case 23:
            result = this._23_bogus_statement();
            break;
        case 24:
            result = this._24_xblock();
            break;
        case 25:
            result = this._25_pblock();
            break;
        case 26:
            result = this._26_lambda();
            break;
        case 27:
            result = this._27_block();
            break;
        case 28:
            result = this._28_terminator();
            break;
        case 29:
            result = this._29_blockoid();
            break;
        case 30:
            result = this._30_stdstopper();
            break;
        case 31:
            result = this._31_statement_control();
            break;
        case 32:
            result = this._32_statement_control_if();
            break;
        case 33:
            result = this._33_statement_control_unless();
            break;
        case 34:
            result = this._34_statement_control_without();
            break;
        case 35:
            result = this._35_statement_control_while();
            break;
        case 36:
            result = this._36_statement_control_until();
            break;
        case 37:
            result = this._37_statement_control_repeat();
            break;
        case 38:
            result = this._38_statement_control_for();
            break;
        case 39:
            result = this._39_statement_control_whenever();
            break;
        case 40:
            result = this._40_statement_control_loop();
            break;
        case 41:
            result = this._41_statement_control_need();
            break;
        case 42:
            result = this._42_statement_control_import();
            break;
        case 43:
            result = this._43_statement_control_no();
            break;
        case 44:
            result = this._44_statement_control_use();
            break;
        case 45:
            result = this._45_statement_control_require();
            break;
        case 46:
            result = this._46_statement_control_given();
            break;
        case 47:
            result = this._47_statement_control_when();
            break;
        case 48:
            result = this._48_statement_control_default();
            break;
        case 49:
            result = this._49_statement_control_CATCH();
            break;
        case 50:
            result = this._50_statement_control_CONTROL();
            break;
        case 51:
            result = this._51_statement_control_QUIT();
            break;
        case 52:
            result = this._52_statement_prefix();
            break;
        case 53:
            result = this._53_phaser_name();
            break;
        case 54:
            result = this._54_statement_prefix_DOC();
            break;
        case 55:
            result = this._55_statement_prefix_phaser();
            break;
        case 56:
            result = this._56_statement_prefix_race();
            break;
        case 57:
            result = this._57_statement_prefix_hyper();
            break;
        case 58:
            result = this._58_statement_prefix_lazy();
            break;
        case 59:
            result = this._59_statement_prefix_eager();
            break;
        case 60:
            result = this._60_statement_prefix_sink();
            break;
        case 61:
            result = this._61_statement_prefix_try();
            break;
        case 62:
            result = this._62_statement_prefix_quietly();
            break;
        case 63:
            result = this._63_statement_prefix_gather();
            break;
        case 64:
            result = this._64_statement_prefix_once();
            break;
        case 65:
            result = this._65_statement_prefix_start();
            break;
        case 66:
            result = this._66_statement_prefix_supply();
            break;
        case 67:
            result = this._67_statement_prefix_react();
            break;
        case 68:
            result = this._68_statement_prefix_do();
            break;
        case 69:
            result = this._69_blorst();
            break;
        case 70:
            result = this._70_statement_mod_cond_keyword();
            break;
        case 71:
            result = this._71_statement_mod_cond();
            break;
        case 72:
            result = this._72_statement_mod_loop_keyword();
            break;
        case 73:
            result = this._73_statement_mod_loop();
            break;
        case 74:
            result = this._74_term();
            break;
        case 75:
            result = this._75_term_ident();
            break;
        case 76:
            result = this._76_term_name();
            break;
        case 77:
            result = this._77_term_whatever();
            break;
        case 78:
            result = this._78_term_hyperwhatever();
            break;
        case 79:
            result = this._79_args();
            break;
        case 80:
            result = this._80_semiarglist();
            break;
        case 81:
            result = this._81_arglist();
            break;
        case 82:
            result = this._82_variable();
            break;
        case 83:
            result = this._83_scope_declarator();
            break;
        case 84:
            result = this._84_declarator();
            break;
        case 85:
            result = this._85_multi_declarator();
            break;
        case 86:
            result = this._86_variable_declarator();
            break;
        case 87:
            result = this._87_routine_declarator();
            break;
        case 88:
            result = this._88_routine_def();
            break;
        case 89:
            result = this._89_onlystar();
            break;
        case 90:
            result = this._90_param_sep();
            break;
        case 91:
            result = this._91_signature();
            break;
        case 92:
            result = this._92_parameter();
            break;
        case 93:
            result = this._93_param_var();
            break;
        case 94:
            result = this._94_named_param();
            break;
        case 95:
            result = this._95_initializer();
            break;
        case 96:
            result = this._96_sigil();
            break;
        case 97:
            result = this._97_twigil();
            break;
        case 98:
            result = this._98_package_declarator();
            break;
        case 99:
            result = this._99_package_kind();
            break;
        case 100:
            result = this._100_package_def();
            break;
        case 101:
            result = this._101_desigilname();
            break;
        case 102:
            result = this._102_value();
            break;
        case 103:
            result = this._103_number();
            break;
        case 104:
            result = this._104_numish();
            break;
        case 105:
            result = this._105_dec_number();
            break;
        case 106:
            result = this._106_escale();
            break;
        case 107:
            result = this._107_sign();
            break;
        case 108:
            result = this._108_integer();
            break;
        case 109:
            result = this._109_integer_lex();
            break;
        case 110:
            result = this._110_decint();
            break;
        case 111:
            result = this._111_hexint();
            break;
        case 112:
            result = this._112_octint();
            break;
        case 113:
            result = this._113_binint();
            break;
        case 114:
            result = this._114_charname();
            break;
        case 115:
            result = this._115_hexints();
            break;
        case 116:
            result = this._116_octints();
            break;
        case 117:
            result = this._117_charnames();
            break;
        case 118:
            result = this._118_charspec();
            break;
        case 119:
            result = this._119_quote();
            break;
        case 120:
            result = this._120_quote_Q();
            break;
        case 121:
            result = this._121_quote_q();
            break;
        case 122:
            result = this._122_quote_qq();
            break;
        case 123:
            result = this._123_quote_nibbler();
            break;
        case 124:
            result = this._124_starter();
            break;
        case 125:
            result = this._125_stopper();
            break;
        case 126:
            result = this._126_quote_escape();
            break;
        case 127:
            result = this._127_EXPR();
            break;
        case 128:
            result = this._128_prefixish();
            break;
        case 129:
            result = this._129_prefix();
            break;
        case 130:
            result = this._130_postfixish();
            break;
        case 131:
            result = this._131_postfix();
            break;
        case 132:
            result = this._132_dotty();
            break;
        case 133:
            result = this._133_dottyop();
            break;
        case 134:
            result = this._134_methodop();
            break;
        case 135:
            result = this._135_postcircumfix();
            break;
        case 136:
            result = this._136_infixish();
            break;
        case 137:
            result = this._137_infixstopper();
            break;
        case 138:
            result = this._138_infix();
            break;
        case 139:
            result = this._139_termish();
            break;
        case 140:
            result = this.___lookahead_0();
            break;
        case 141:
            result = this.___lookahead_1();
            break;
        case 142:
            result = this.___lookahead_2();
            break;
        case 143:
            result = this.___lookahead_3();
            break;
        case 144:
            result = this.___lookahead_4();
            break;
        case 145:
            result = this.___lookahead_5();
            break;
        case 146:
            result = this.___lookahead_6();
            break;
        case 147:
            result = this.___lookahead_7();
            break;
        case 148:
            result = this.___lookahead_8();
            break;
        case 149:
            result = this.___lookahead_9();
            break;
        case 150:
            result = this.___lookahead_10();
            break;
        case 151:
            result = this.___lookahead_11();
            break;
        case 152:
            result = this.___lookahead_12();
            break;
        case 153:
            result = this.___lookahead_13();
            break;
        case 154:
            result = this.___lookahead_14();
            break;
        case 155:
            result = this.___lookahead_15();
            break;
        case 156:
            result = this.___lookahead_16();
            break;
        case 157:
            result = this.___lookahead_17();
            break;
        case 158:
            result = this.___lookahead_18();
            break;
        case 159:
            result = this.___lookahead_19();
            break;
        case 160:
            result = this.___lookahead_20();
            break;
        case 161:
            result = this.___lookahead_21();
            break;
        case 162:
            result = this.___lookahead_22();
            break;
        case 163:
            result = this.___lookahead_23();
            break;
        case 164:
            result = this.___lookahead_24();
            break;
        case 165:
            result = this.___lookahead_25();
            break;
        case 166:
            result = this.___lookahead_26();
            break;
        case 167:
            result = this.___lookahead_27();
            break;
        case 168:
            result = this.___lookahead_28();
            break;
        case 169:
            result = this.___lookahead_29();
            break;
        case 170:
            result = this.___lookahead_30();
            break;
        case 171:
            result = this.___lookahead_31();
            break;
        case 172:
            result = this.___lookahead_32();
            break;
        case 173:
            result = this.___lookahead_33();
            break;
        case 174:
            result = this.___lookahead_34();
            break;
        case 175:
            result = this.___lookahead_35();
            break;
        case 176:
            result = this.___lookahead_36();
            break;
        case 177:
            result = this.___lookahead_37();
            break;
        case 178:
            result = this.___lookahead_38();
            break;
        case 179:
            result = this.___lookahead_39();
            break;
        case 180:
            result = this.___lookahead_40();
            break;
        case 181:
            result = this.___lookahead_41();
            break;
        case 182:
            result = this.___lookahead_42();
            break;
        case 183:
            result = this.___lookahead_43();
            break;
        case 184:
            result = this.___lookahead_44();
            break;
        case 185:
            result = this.___lookahead_45();
            break;
        case 186:
            result = this.___lookahead_46();
            break;
        case 187:
            result = this.___lookahead_47();
            break;
        case 188:
            result = this.___lookahead_48();
            break;
        case 189:
            result = this.___lookahead_49();
            break;
        case 190:
            result = this.___lookahead_50();
            break;
        case 191:
            result = this.___lookahead_51();
            break;
        case 192:
            result = this.___lookahead_52();
            break;
        case 193:
            result = this.___lookahead_53();
            break;
        case 194:
            result = this.___lookahead_54();
            break;
        case 195:
            result = this.___lookahead_55();
            break;
        case 196:
            result = this.___lookahead_56();
            break;
        case 197:
            result = this.___lookahead_57();
            break;
        case 198:
            result = this.___lookahead_58();
            break;
        case 199:
            result = this.___lookahead_59();
            break;
        case 200:
            result = this.___lookahead_60();
            break;
        case 201:
            result = this.___lookahead_61();
            break;
        case 202:
            result = this.___lookahead_62();
            break;
        case 203:
            result = this.___lookahead_63();
            break;
        case 204:
            result = this.___lookahead_64();
            break;
        case 205:
            result = this.___lookahead_65();
            break;
        case 206:
            result = this.___lookahead_66();
            break;
        case 207:
            result = this.___lookahead_67();
            break;
        case 208:
            result = this.___lookahead_68();
            break;
        case 209:
            result = this.___lookahead_69();
            break;
        case 210:
            result = this.___lookahead_70();
            break;
        case 211:
            result = this.___lookahead_71();
            break;
        case 212:
            result = this.___lookahead_72();
            break;
        case 213:
            result = this.___lookahead_73();
            break;
        case 214:
            result = this.___lookahead_74();
            break;
        case 215:
            result = this.___lookahead_75();
            break;
        case 216:
            result = this.___lookahead_76();
            break;
        case 217:
            result = this.___lookahead_77();
            break;
        case 218:
            result = this.___lookahead_78();
            break;
        case 219:
            result = this.___lookahead_79();
            break;
        case 220:
            result = this.___lookahead_80();
            break;
        case 221:
            result = this.___lookahead_81();
            break;
        case 222:
            result = this.___lookahead_82();
            break;
        case 223:
            result = this.___lookahead_83();
            break;
        case 224:
            result = this.___lookahead_84();
            break;
        case 225:
            result = this.___lookahead_85();
            break;
        case 226:
            result = this.___lookahead_86();
            break;
        case 227:
            result = this.___lookahead_87();
            break;
        case 228:
            result = this.___lookahead_88();
            break;
        case 229:
            result = this.___lookahead_89();
            break;
        case 230:
            result = this.___lookahead_90();
            break;
        case 231:
            result = this.___lookahead_91();
            break;
        case 232:
            result = this.___lookahead_92();
            break;
        case 233:
            result = this.___lookahead_93();
            break;
        case 234:
            result = this.___lookahead_94();
            break;
        case 235:
            result = this.___lookahead_95();
            break;
        case 236:
            result = this.___lookahead_96();
            break;
        case 237:
            result = this.___lookahead_97();
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
                this.declareDynamicVariable("$*GOAL", "");
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
                if (this.lookahead(140)) {
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

    private int _10_spacey() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.lookahead(141))) {
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
                if (!(this.lookahead(142))) {
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

    private int _11_kok() {
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
                if (!(this.lookahead(143))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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
                return -1;

            }
        }
    }

    private int _12_ENDSTMT() {
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
                if (!(this.lookahead(144))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(145))) {
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
                if (!(this.lookahead(146))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.lookahead(147))) {
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

    private int _13_ws() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (this.lookahead(148)) {
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
                return 16;

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
                return 14;

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

    private int _14_unsp() {
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
                if (!(this.lookahead(149))) {
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
                return 15;

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
                return 16;

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
                return 14;

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

    private int _15_vws() {
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

    private int _16_unv() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(9);
                this.bsMark(2);
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
                return 17;

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

    private int _17_comment() {
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

    private int _18_vnum() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(3);
                this.bsFailMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.wordChar())) {
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
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 3:
                if (!(this.literal("*"))) {
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

    private int _19_version() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(150))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.VERSION);
                if (!(this.literal("v"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(4);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 18;

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
                rep = this.peekRep(4);
                ++rep;
                this.bsCommit(4);
                this.bsMark(4, rep);
                this.state = 3;
                continue;

            case 3:
                if (!(this.literal("."))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                continue;

            case 4:
                this.bsMark(6);
                this.state = 5;
                break;
            case 5:
                if (!(this.literal("+"))) {
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
                this.state = 7;
                return -3;

            case 7:
                return -1;

            }
        }
    }

    private int _20_statementlist() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(3);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 13;

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
                if (this.lookahead(151)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 5;
                return 22;

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

    private int _21_semilist() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.bsFailMark(7);
                this.bsMark(3);
                if (!(this.lookahead(152))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.SEMI_LIST_END);
                this.state = 2;
                return -3;

            case 2:
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 3:
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                if (this.lookahead(153)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 5;
                return 22;

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
                this.state = 7;
                continue;

            case 7:
                return -1;

            }
        }
    }

    private int _22_statement() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (this.lookahead(154)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(20);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 31;

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
                this.bsMark(18);
                this.setArgs("");
                this.state = 3;
                return 127;

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
                this.bsMark(17);
                this.state = 4;
                break;
            case 4:
                this.bsFailMark(16);
                this.bsMark(6);
                if (!(this.lookahead(155))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.END_OF_STATEMENT);
                this.state = 5;
                return -3;

            case 5:
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 6:
                this.bsMark(13);
                if (!(this.lookahead(156))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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
                this.setArgs();
                this.state = 8;
                return 71;

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
                this.bsMark(12);
                this.state = 9;
                break;
            case 9:
                if (!(this.lookahead(157))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 10;
                return 13;

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
                return 73;

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
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 13:
                if (!(this.lookahead(158))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 14;
                return 13;

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
                this.setArgs();
                this.state = 15;
                return 73;

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
                this.state = 16;
                continue;

            case 16:
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 17:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 18:
                this.setArgs();
                this.state = 19;
                return 23;

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
                this.bsFailMark(26);
                this.bsMark(22);
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 21;
                return -3;

            case 21:
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 22:
                this.bsMark(25);
                if (!(this.lookahead(159))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.END_OF_STATEMENT);
                this.state = 23;
                return -3;

            case 23:
                this.setArgs();
                this.state = 24;
                return 13;

            case 24:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 25:
                this.state = 26;
                continue;

            case 26:
                this.setArgs();
                this.state = 27;
                return 13;

            case 27:
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

    private int _23_bogus_statement() {
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

    private int _24_xblock() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.declareDynamicVariable("$*GOAL", "{");
                this.setArgs("");
                this.state = 1;
                return 127;

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
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                this.setArgs();
                this.state = 4;
                return 25;

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
                return -1;

            }
        }
    }

    private int _25_pblock() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(11);
                this.bsMark(8);
                this.startToken(Perl6TokenTypes.LAMBDA);
                this.setArgs();
                this.state = 1;
                return 26;

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
                this.declareDynamicVariable("$*GOAL", "{");
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
                this.setArgs();
                this.state = 4;
                return 91;

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
                return 29;

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
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 7:
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 8:
                this.bsMark(10);
                if (!(this.lookahead(160))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 29;

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
                return -1;

            }
        }
    }

    private int _26_lambda() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.literal("->"))) {
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
                if (!(this.literal("<->"))) {
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

    private int _27_block() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 29;

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

    private int _28_terminator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(14);
                this.bsMark(1);
                if (!(this.lookahead(161))) {
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
                if (!(this.lookahead(162))) {
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
                return 11;

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

    private int _29_blockoid() {
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
                return 20;

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
                if (!(this.lookahead(163))) {
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

    private int _30_stdstopper() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.lookahead(164))) {
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

    private int _31_statement_control() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(40);
                this.bsMark(2);
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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 2:
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 33;

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
                this.bsCommit(40);
                this.state = 40;
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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 6:
                this.bsMark(8);
                this.setArgs();
                this.state = 7;
                return 35;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 8:
                this.bsMark(10);
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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 10:
                this.bsMark(12);
                this.setArgs();
                this.state = 11;
                return 37;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 12:
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 38;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 14:
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 39;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 16:
                this.bsMark(18);
                this.setArgs();
                this.state = 17;
                return 40;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 18:
                this.bsMark(20);
                this.setArgs();
                this.state = 19;
                return 41;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 20:
                this.bsMark(22);
                this.setArgs();
                this.state = 21;
                return 42;

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
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 22:
                this.bsMark(24);
                this.setArgs();
                this.state = 23;
                return 43;

            case 23:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 24:
                this.bsMark(26);
                this.setArgs();
                this.state = 25;
                return 44;

            case 25:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 26:
                this.bsMark(28);
                this.setArgs();
                this.state = 27;
                return 45;

            case 27:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 28:
                this.bsMark(30);
                this.setArgs();
                this.state = 29;
                return 46;

            case 29:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 30:
                this.bsMark(32);
                this.setArgs();
                this.state = 31;
                return 47;

            case 31:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 32:
                this.bsMark(34);
                this.setArgs();
                this.state = 33;
                return 48;

            case 33:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 34:
                this.bsMark(36);
                this.setArgs();
                this.state = 35;
                return 49;

            case 35:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 36:
                this.bsMark(38);
                this.setArgs();
                this.state = 37;
                return 50;

            case 37:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(40);
                this.state = 40;
                continue;

            case 38:
                this.setArgs();
                this.state = 39;
                return 51;

            case 39:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 40;
                continue;

            case 40:
                return -1;

            }
        }
    }

    private int _32_statement_control_if() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(165))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(4);
                this.bsMark(2);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("if"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.bsCommit(4);
                this.state = 4;
                continue;

            case 2:
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("with"))) {
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
                this.setArgs();
                this.state = 5;
                return 11;

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
                return 13;

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
                this.bsMark(29);
                this.state = 7;
                break;
            case 7:
                this.setArgs();
                this.state = 8;
                return 24;

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
                return 13;

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
                this.bsMark(20);
                this.state = 10;
                break;
            case 10:
                if (!(this.lookahead(166))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(14);
                this.bsMark(12);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("elsif"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 11;
                return -3;

            case 11:
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 12:
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("orwith"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 13;
                return -3;

            case 13:
                this.state = 14;
                continue;

            case 14:
                this.setArgs();
                this.state = 15;
                return 13;

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
                this.bsMark(18);
                this.state = 16;
                break;
            case 16:
                this.setArgs();
                this.state = 17;
                return 24;

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
                this.setArgs();
                this.state = 19;
                return 13;

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
                rep = this.peekRep(20);
                ++rep;
                this.bsCommit(20);
                this.bsMark(20, rep);
                this.state = 10;
                continue;

            case 20:
                this.setArgs();
                this.state = 21;
                return 13;

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
                this.bsMark(28);
                this.state = 22;
                break;
            case 22:
                if (!(this.lookahead(167))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("else"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 23;
                return -3;

            case 23:
                this.setArgs();
                this.state = 24;
                return 13;

            case 24:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(27);
                this.state = 25;
                break;
            case 25:
                this.setArgs();
                this.state = 26;
                return 25;

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
                this.bsCommit(27);
                this.state = 27;
                continue;

            case 27:
                this.bsCommit(28);
                this.state = 28;
                continue;

            case 28:
                this.bsCommit(29);
                this.state = 29;
                continue;

            case 29:
                return -1;

            }
        }
    }

    private int _33_statement_control_unless() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(168))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("unless"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _34_statement_control_without() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(169))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("without"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _35_statement_control_while() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(170))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("while"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _36_statement_control_until() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(171))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("until"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _37_statement_control_repeat() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(172))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("repeat"))) {
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
                return 11;

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
                this.bsFailMark(26);
                this.bsMark(13);
                if (!(this.lookahead(173))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(7);
                this.bsMark(5);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("while"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 4;
                return -3;

            case 4:
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 5:
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 6;
                return -3;

            case 6:
                this.state = 7;
                continue;

            case 7:
                this.setArgs();
                this.state = 8;
                return 11;

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
                return 13;

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
                this.setArgs();
                this.state = 11;
                return 24;

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
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 13:
                this.bsMark(25);
                this.setArgs();
                this.state = 14;
                return 25;

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
                this.setArgs();
                this.state = 15;
                return 13;

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
                this.bsMark(24);
                this.state = 16;
                break;
            case 16:
                if (!(this.lookahead(174))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(20);
                this.bsMark(18);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("while"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 17;
                return -3;

            case 17:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 18:
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 19;
                return -3;

            case 19:
                this.state = 20;
                continue;

            case 20:
                this.bsMark(23);
                this.state = 21;
                break;
            case 21:
                this.setArgs("");
                this.state = 22;
                return 127;

            case 22:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(23);
                this.state = 23;
                continue;

            case 23:
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 24:
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 25:
                this.state = 26;
                continue;

            case 26:
                return -1;

            }
        }
    }

    private int _38_statement_control_for() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(175))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("for"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _39_statement_control_whenever() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(176))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("whenever"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _40_statement_control_loop() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(177))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("loop"))) {
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
                return 11;

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
                this.bsMark(31);
                this.state = 4;
                break;
            case 4:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 5;
                return -3;

            case 5:
                this.setArgs();
                this.state = 6;
                return 13;

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
                this.bsMark(9);
                this.state = 7;
                break;
            case 7:
                this.setArgs("");
                this.state = 8;
                return 127;

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
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 9:
                this.setArgs();
                this.state = 10;
                return 13;

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
                this.bsMark(26);
                this.state = 11;
                break;
            case 11:
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 12;
                return -3;

            case 12:
                this.setArgs();
                this.state = 13;
                return 13;

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
                this.bsMark(16);
                this.state = 14;
                break;
            case 14:
                this.setArgs("");
                this.state = 15;
                return 127;

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
                this.bsCommit(16);
                this.state = 16;
                continue;

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
                this.bsMark(25);
                this.state = 18;
                break;
            case 18:
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 19;
                return -3;

            case 19:
                this.setArgs();
                this.state = 20;
                return 13;

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
                this.setArgs("");
                this.state = 22;
                return 127;

            case 22:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(23);
                this.state = 23;
                continue;

            case 23:
                this.setArgs();
                this.state = 24;
                return 13;

            case 24:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(25);
                this.state = 25;
                continue;

            case 25:
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 26:
                this.bsMark(29);
                this.state = 27;
                break;
            case 27:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
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
                this.setArgs();
                this.state = 30;
                return 13;

            case 30:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(31);
                this.state = 31;
                continue;

            case 31:
                this.bsMark(34);
                this.state = 32;
                break;
            case 32:
                this.setArgs();
                this.state = 33;
                return 27;

            case 33:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(34);
                this.state = 34;
                continue;

            case 34:
                return -1;

            }
        }
    }

    private int _41_statement_control_need() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("need"))) {
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
                this.bsMark(20);
                this.state = 3;
                break;
            case 3:
                this.bsFailMark(7);
                this.bsMark(5);
                this.setArgs();
                this.state = 4;
                return 19;

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
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 5:
                this.setArgs();
                this.state = 6;
                return 8;

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
                this.state = 7;
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
                this.bsMark(19);
                this.state = 9;
                break;
            case 9:
                this.startToken(Perl6TokenTypes.INFIX);
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 10;
                return -3;

            case 10:
                this.setArgs();
                this.state = 11;
                return 13;

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
                this.bsMark(17);
                this.state = 12;
                break;
            case 12:
                this.bsFailMark(16);
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 19;

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
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 14:
                this.setArgs();
                this.state = 15;
                return 8;

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
                this.state = 16;
                continue;

            case 16:
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 17:
                this.setArgs();
                this.state = 18;
                return 13;

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
                this.state = 9;
                continue;

            case 19:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 20:
                return -1;

            }
        }
    }

    private int _42_statement_control_import() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("import"))) {
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
                this.bsMark(10);
                this.state = 3;
                break;
            case 3:
                this.setArgs();
                this.state = 4;
                return 8;

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
                this.bsMark(8);
                this.state = 5;
                break;
            case 5:
                this.setArgs();
                this.state = 6;
                return 10;

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
                this.setArgs();
                this.state = 7;
                return 81;

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
                this.setArgs();
                this.state = 9;
                return 13;

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
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 10:
                return -1;

            }
        }
    }

    private int _43_statement_control_no() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("no"))) {
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
                this.bsMark(10);
                this.state = 3;
                break;
            case 3:
                this.setArgs();
                this.state = 4;
                return 8;

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
                this.bsMark(8);
                this.state = 5;
                break;
            case 5:
                this.setArgs();
                this.state = 6;
                return 10;

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
                this.setArgs();
                this.state = 7;
                return 81;

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
                this.setArgs();
                this.state = 9;
                return 13;

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
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 10:
                return -1;

            }
        }
    }

    private int _44_statement_control_use() {
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
                this.bsMark(12);
                this.state = 3;
                break;
            case 3:
                this.bsFailMark(11);
                this.bsMark(5);
                this.setArgs();
                this.state = 4;
                return 19;

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
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 5:
                this.setArgs();
                this.state = 6;
                return 8;

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
                this.bsMark(10);
                this.state = 7;
                break;
            case 7:
                this.setArgs();
                this.state = 8;
                return 10;

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
                return 81;

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
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 10:
                this.state = 11;
                continue;

            case 11:
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.setArgs();
                this.state = 13;
                return 13;

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
                return -1;

            }
        }
    }

    private int _45_statement_control_require() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("require"))) {
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
                this.bsMark(14);
                this.state = 3;
                break;
            case 3:
                this.bsFailMark(9);
                this.bsMark(5);
                this.setArgs();
                this.state = 4;
                return 8;

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
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 5:
                this.bsMark(7);
                this.setArgs();
                this.state = 6;
                return 82;

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
                if (this.lookahead(178)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 8;
                return 74;

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
                this.setArgs();
                this.state = 10;
                return 13;

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
                this.bsMark(13);
                this.state = 11;
                break;
            case 11:
                this.setArgs("");
                this.state = 12;
                return 127;

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
                this.bsCommit(13);
                this.state = 13;
                continue;

            case 13:
                this.bsCommit(14);
                this.state = 14;
                continue;

            case 14:
                return -1;

            }
        }
    }

    private int _46_statement_control_given() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(179))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("given"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _47_statement_control_when() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(180))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("when"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 24;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _48_statement_control_default() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(181))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("default"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 27;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _49_statement_control_CATCH() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(182))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("CATCH"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 27;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _50_statement_control_CONTROL() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(183))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("CONTROL"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 27;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _51_statement_control_QUIT() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(184))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_CONTROL);
                if (!(this.literal("QUIT"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 27;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _52_statement_prefix() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(30);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 54;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 2:
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 55;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 4:
                this.bsMark(6);
                this.setArgs();
                this.state = 5;
                return 56;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 6:
                this.bsMark(8);
                this.setArgs();
                this.state = 7;
                return 57;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 8:
                this.bsMark(10);
                this.setArgs();
                this.state = 9;
                return 58;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 10:
                this.bsMark(12);
                this.setArgs();
                this.state = 11;
                return 59;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 12:
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 60;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 14:
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 61;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 16:
                this.bsMark(18);
                this.setArgs();
                this.state = 17;
                return 62;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 18:
                this.bsMark(20);
                this.setArgs();
                this.state = 19;
                return 63;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 20:
                this.bsMark(22);
                this.setArgs();
                this.state = 21;
                return 64;

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
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 22:
                this.bsMark(24);
                this.setArgs();
                this.state = 23;
                return 65;

            case 23:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 24:
                this.bsMark(26);
                this.setArgs();
                this.state = 25;
                return 66;

            case 25:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 26:
                this.bsMark(28);
                this.setArgs();
                this.state = 27;
                return 67;

            case 27:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(30);
                this.state = 30;
                continue;

            case 28:
                this.setArgs();
                this.state = 29;
                return 68;

            case 29:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 30;
                continue;

            case 30:
                return -1;

            }
        }
    }

    private int _53_phaser_name() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(16);
                this.bsMark(1);
                if (!(this.literal("BEGIN"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("COMPOSE"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("TEMP"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("CHECK"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("INIT"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("ENTER"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("FIRST"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 7:
                this.bsMark(8);
                if (!(this.literal("END"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 8:
                this.bsMark(9);
                if (!(this.literal("LEAVE"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 9:
                this.bsMark(10);
                if (!(this.literal("KEEP"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 10:
                this.bsMark(11);
                if (!(this.literal("UNDO"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 11:
                this.bsMark(12);
                if (!(this.literal("NEXT"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 12:
                this.bsMark(13);
                if (!(this.literal("LAST"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 13:
                this.bsMark(14);
                if (!(this.literal("PRE"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 14:
                this.bsMark(15);
                if (!(this.literal("POST"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 15:
                if (!(this.literal("CLOSE"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 16;
                continue;

            case 16:
                return -1;

            }
        }
    }

    private int _54_statement_prefix_DOC() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(185))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.PHASER);
                if (!(this.literal("DOC"))) {
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
                return 11;

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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                if (!(this.lookahead(186))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 5;
                return 52;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _55_statement_prefix_phaser() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(187))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.PHASER);
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
                this.state = 2;
                return -3;

            case 2:
                this.setArgs();
                this.state = 3;
                return 11;

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
                return 69;

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

    private int _56_statement_prefix_race() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(188))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("race"))) {
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
                return 11;

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
                return 69;

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

    private int _57_statement_prefix_hyper() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(189))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("hyper"))) {
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
                return 11;

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
                return 69;

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

    private int _58_statement_prefix_lazy() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(190))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("lazy"))) {
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
                return 11;

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
                return 69;

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

    private int _59_statement_prefix_eager() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(191))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("eager"))) {
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
                return 11;

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
                return 69;

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

    private int _60_statement_prefix_sink() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(192))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("sink"))) {
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
                return 11;

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
                return 69;

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

    private int _61_statement_prefix_try() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(193))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("try"))) {
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
                return 11;

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
                return 69;

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

    private int _62_statement_prefix_quietly() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(194))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("quietly"))) {
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
                return 11;

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
                return 69;

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

    private int _63_statement_prefix_gather() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(195))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("gather"))) {
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
                return 11;

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
                return 69;

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

    private int _64_statement_prefix_once() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(196))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("once"))) {
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
                return 11;

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
                return 69;

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

    private int _65_statement_prefix_start() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(197))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("start"))) {
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
                return 11;

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
                return 69;

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

    private int _66_statement_prefix_supply() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(198))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("supply"))) {
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
                return 11;

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
                return 69;

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

    private int _67_statement_prefix_react() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(199))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("react"))) {
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
                return 11;

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
                return 69;

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

    private int _68_statement_prefix_do() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(200))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_PREFIX);
                if (!(this.literal("do"))) {
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
                return 11;

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
                return 69;

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

    private int _69_blorst() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.bsMark(2);
                if (!(this.lookahead(201))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 27;

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
                this.bsMark(4);
                this.setArgs();
                this.state = 3;
                return 22;

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
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 4:
                this.state = 5;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _70_statement_mod_cond_keyword() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.bsMark(1);
                if (!(this.literal("if"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("unless"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("when"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("with"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 4:
                if (!(this.literal("without"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 5;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int _71_statement_mod_cond() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(202))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_MOD_COND);
                this.setArgs();
                this.state = 1;
                return 70;

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
                return 11;

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
                return 13;

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
                this.setArgs("");
                this.state = 6;
                return 127;

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
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 7:
                return -1;

            }
        }
    }

    private int _72_statement_mod_loop_keyword() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(1);
                if (!(this.literal("while"))) {
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
                if (!(this.literal("until"))) {
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
                if (!(this.literal("for"))) {
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
                if (!(this.literal("given"))) {
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

    private int _73_statement_mod_loop() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(203))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_MOD_LOOP);
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
                this.state = 2;
                return -3;

            case 2:
                this.setArgs();
                this.state = 3;
                return 11;

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
                return 13;

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
                this.setArgs("");
                this.state = 6;
                return 127;

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
                this.bsCommit(7);
                this.state = 7;
                continue;

            case 7:
                return -1;

            }
        }
    }

    private int _74_term() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(24);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 82;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 2:
                this.bsMark(4);
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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 4:
                this.bsMark(6);
                this.setArgs();
                this.state = 5;
                return 83;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 6:
                this.bsMark(8);
                this.setArgs();
                this.state = 7;
                return 87;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 8:
                this.bsMark(10);
                if (!(this.lookahead(204))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 85;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 10:
                this.bsMark(12);
                this.setArgs();
                this.state = 11;
                return 52;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 12:
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 98;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 14:
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 132;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 16:
                this.bsMark(18);
                this.setArgs();
                this.state = 17;
                return 102;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 18:
                this.bsMark(20);
                this.setArgs();
                this.state = 19;
                return 76;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 20:
                this.bsMark(22);
                this.setArgs();
                this.state = 21;
                return 77;

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
                this.bsCommit(24);
                this.state = 24;
                continue;

            case 22:
                this.setArgs();
                this.state = 23;
                return 78;

            case 23:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 24;
                continue;

            case 24:
                return -1;

            }
        }
    }

    private int _75_term_ident() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(205))) {
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
                if (!(this.lookahead(206))) {
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
                return 79;

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

    private int _76_term_name() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(10);
                this.bsMark(3);
                if (!(this.lookahead(207))) {
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
                if (!(this.lookahead(208))) {
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
                return 79;

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

    private int _77_term_whatever() {
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

    private int _78_term_hyperwhatever() {
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

    private int _79_args() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.declareDynamicVariable("$*GOAL", "");
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
                return 80;

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
                return 14;

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
                return 80;

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
                return 81;

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

    private int _80_semiarglist() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 81;

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
                return -1;

            }
        }
    }

    private int _81_arglist() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.declareDynamicVariable("$*GOAL", "endargs");
                this.setArgs();
                this.state = 1;
                return 13;

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
                if (this.lookahead(209)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs("e=");
                this.state = 2;
                return 127;

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

    private int _82_variable() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.VARIABLE);
                this.setArgs();
                this.state = 1;
                return 96;

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
                return 97;

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
                return 101;

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

    private int _83_scope_declarator() {
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
                return 13;

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
                this.bsFailMark(17);
                this.bsMark(14);
                this.setArgs();
                this.state = 13;
                return 98;

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
                this.bsMark(16);
                this.setArgs();
                this.state = 15;
                return 84;

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

    private int _84_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.bsMark(6);
                this.setArgs();
                this.state = 1;
                return 86;

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
                this.bsMark(5);
                this.state = 3;
                break;
            case 3:
                this.setArgs();
                this.state = 4;
                return 95;

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
                return 87;

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

    private int _85_multi_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(13);
                this.bsMark(11);
                if (!(this.lookahead(210))) {
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
                return 11;

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
                return 84;

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
                return 88;

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
                return 84;

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

    private int _86_variable_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 82;

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

    private int _87_routine_declarator() {
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
                return 88;

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

    private int _88_routine_def() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 13;

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
                return 13;

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
                return 91;

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
                return 13;

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
                return 89;

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
                return 29;

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

    private int _89_onlystar() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(211))) {
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
                return 13;

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
                if (!(this.lookahead(212))) {
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

    private int _90_param_sep() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(213))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.startToken(Perl6TokenTypes.PARAMETER_SEPARATOR);
                this.bsFailMark(5);
                this.bsMark(2);
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal(";;"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 4:
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 5;
                continue;

            case 5:
                this.state = 6;
                return -3;

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
                return -1;

            }
        }
    }

    private int _91_signature() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.bsFailMark(15);
                this.bsMark(3);
                if (!(this.lookahead(214))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.END_OF_PARAMETERS);
                this.state = 2;
                return -3;

            case 2:
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 3:
                this.bsMark(14);
                this.setArgs();
                this.state = 4;
                return 92;

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
                this.bsMark(13);
                this.state = 5;
                break;
            case 5:
                this.setArgs();
                this.state = 6;
                return 90;

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
                this.bsMark(12);
                this.state = 7;
                break;
            case 7:
                this.bsFailMark(11);
                this.bsMark(9);
                if (!(this.lookahead(215))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.END_OF_PARAMETERS);
                this.state = 8;
                return -3;

            case 8:
                this.bsCommit(11);
                this.state = 11;
                continue;

            case 9:
                this.setArgs();
                this.state = 10;
                return 92;

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
                continue;

            case 11:
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                rep = this.peekRep(13);
                ++rep;
                this.bsCommit(13);
                this.bsMark(13, rep);
                this.state = 5;
                continue;

            case 13:
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 14:
                this.state = 15;
                continue;

            case 15:
                this.setArgs();
                this.state = 16;
                return 13;

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
                return -1;

            }
        }
    }

    private int _92_parameter() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 93;

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
                return 94;

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

    private int _93_param_var() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(26);
                this.bsMark(6);
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("["))) {
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
                return 91;

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
                if (!(this.literal("]"))) {
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
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 6:
                this.bsMark(12);
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 7;
                return -3;

            case 7:
                this.setArgs();
                this.state = 8;
                return 91;

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
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
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
                this.bsCommit(26);
                this.state = 26;
                continue;

            case 12:
                this.startToken(Perl6TokenTypes.VARIABLE);
                this.setArgs();
                this.state = 13;
                return 96;

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
                this.bsMark(16);
                this.state = 14;
                break;
            case 14:
                this.setArgs();
                this.state = 15;
                return 97;

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
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 16:
                this.bsMark(21);
                this.state = 17;
                break;
            case 17:
                this.bsFailMark(20);
                this.bsMark(19);
                this.setArgs();
                this.state = 18;
                return 4;

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
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 19:
                if (!(this.inCharList("/!"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 20;
                continue;

            case 20:
                this.bsCommit(21);
                this.state = 21;
                continue;

            case 21:
                this.state = 22;
                return -3;

            case 22:
                this.bsMark(25);
                this.state = 23;
                break;
            case 23:
                if (!(this.lookahead(216))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 24;
                return 135;

            case 24:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsCommit(25);
                this.state = 25;
                continue;

            case 25:
                this.state = 26;
                continue;

            case 26:
                return -1;

            }
        }
    }

    private int _94_named_param() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.declareDynamicVariable("$*GOAL", ")");
                this.startToken(Perl6TokenTypes.NAMED_PARAMETER_SYNTAX);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.bsMark(20);
                this.state = 2;
                break;
            case 2:
                this.bsFailMark(19);
                this.bsMark(17);
                this.startToken(Perl6TokenTypes.NAMED_PARAMETER_NAME_ALIAS);
                this.setArgs();
                this.state = 3;
                return 4;

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
                this.bsMark(16);
                this.state = 5;
                break;
            case 5:
                this.startToken(Perl6TokenTypes.NAMED_PARAMETER_SYNTAX);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 6;
                return -3;

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
                this.bsFailMark(11);
                this.bsMark(9);
                this.setArgs();
                this.state = 8;
                return 94;

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
                this.setArgs();
                this.state = 10;
                return 93;

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
                continue;

            case 11:
                this.setArgs();
                this.state = 12;
                return 13;

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
                this.bsMark(15);
                this.state = 13;
                break;
            case 13:
                this.startToken(Perl6TokenTypes.NAMED_PARAMETER_SYNTAX);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 14;
                return -3;

            case 14:
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 15:
                this.bsCommit(16);
                this.state = 16;
                continue;

            case 16:
                this.bsCommit(19);
                this.state = 19;
                continue;

            case 17:
                this.setArgs();
                this.state = 18;
                return 93;

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
                this.state = 19;
                continue;

            case 19:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 20:
                return -1;

            }
        }
    }

    private int _95_initializer() {
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
                return 13;

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
                return 127;

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

    private int _96_sigil() {
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

    private int _97_twigil() {
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
                if (!(this.lookahead(217))) {
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

    private int _98_package_declarator() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (!(this.lookahead(218))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.PACKAGE_DECLARATOR);
                this.setArgs();
                this.state = 1;
                return 99;

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
                return 11;

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
                return 100;

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

    private int _99_package_kind() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(8);
                this.bsMark(1);
                if (!(this.literal("package"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal("module"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("class"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("grammar"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal("role"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 5:
                this.bsMark(6);
                if (!(this.literal("knowhow"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 6:
                this.bsMark(7);
                if (!(this.literal("native"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(8);
                this.state = 8;
                continue;

            case 7:
                if (!(this.literal("slang"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 8;
                continue;

            case 8:
                return -1;

            }
        }
    }

    private int _100_package_def() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.bsMark(6);
                this.state = 2;
                break;
            case 2:
                this.startToken(Perl6TokenTypes.NAME);
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
                this.setArgs();
                this.state = 5;
                return 13;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                this.bsFailMark(15);
                this.bsMark(8);
                if (!(this.lookahead(219))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 7;
                return 29;

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
                this.bsCommit(15);
                this.state = 15;
                continue;

            case 8:
                this.bsMark(14);
                if (!(this.lookahead(220))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 9;
                return -3;

            case 9:
                this.setArgs();
                this.state = 10;
                return 13;

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
                this.bsMark(13);
                this.state = 11;
                break;
            case 11:
                this.setArgs();
                this.state = 12;
                return 20;

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
                this.bsCommit(13);
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
                return -1;

            }
        }
    }

    private int _101_desigilname() {
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

    private int _102_value() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 103;

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
                return 119;

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

    private int _103_number() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 104;

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

    private int _104_numish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(9);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 105;

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
                return 108;

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

    private int _105_dec_number() {
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
                return 110;

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
                return 106;

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
                return 110;

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
                return 110;

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
                return 106;

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
                return 110;

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
                return 106;

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
                return 110;

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
                return 110;

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
                return 110;

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

    private int _106_escale() {
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
                return 107;

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
                return 110;

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

    private int _107_sign() {
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

    private int _108_integer() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.startToken(Perl6TokenTypes.INTEGER_LITERAL);
                this.setArgs();
                this.state = 1;
                return 109;

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

    private int _109_integer_lex() {
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
                return 113;

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
                return 112;

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
                return 111;

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
                return 110;

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
                return 110;

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
                return 110;

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

    private int _110_decint() {
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

    private int _111_hexint() {
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

    private int _112_octint() {
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

    private int _113_binint() {
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

    private int _114_charname() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(5);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 109;

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
                if (this.lookahead(221)) {
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

    private int _115_hexints() {
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
                return 111;

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

    private int _116_octints() {
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
                return 112;

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

    private int _117_charnames() {
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
                return 114;

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

    private int _118_charspec() {
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
                return 117;

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

    private int _119_quote() {
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
                return 121;

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
                return 121;

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
                return 121;

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
                return 121;

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
                return 122;

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
                return 122;

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
                return 122;

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
                return 122;

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
                return 120;

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

    private int _120_quote_Q() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(3);
                this.declareDynamicVariable("$*STARTER", this.getArg(0));
                this.declareDynamicVariable("$*STOPPER", this.getArg(1));
                this.declareDynamicVariable("$*ALT_STOPPER", this.getArg(2));
                this.setArgs();
                this.state = 1;
                return 123;

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

    private int _121_quote_q() {
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
                return 123;

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

    private int _122_quote_qq() {
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
                return 123;

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

    private int _123_quote_nibbler() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsMark(12);
                this.state = 1;
                break;
            case 1:
                if (this.lookahead(222)) {
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
                return 124;

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
                return 123;

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
                return 125;

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
                return 126;

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

    private int _124_starter() {
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

    private int _125_stopper() {
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

    private int _126_quote_escape() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(41);
                this.bsMark(5);
                if (!(this.lookahead(223))) {
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
                return 82;

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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 5:
                this.bsMark(24);
                if (!(this.lookahead(224))) {
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
                return 112;

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
                return 116;

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
                return 111;

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
                return 115;

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
                return 118;

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
                return 124;

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
                return 125;

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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 24:
                this.bsMark(28);
                if (!(this.lookahead(225))) {
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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 28:
                this.bsMark(30);
                if (!(this.lookahead(226))) {
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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 30:
                this.bsMark(32);
                if (!(this.lookahead(227))) {
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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 32:
                this.bsMark(39);
                if (!(this.lookahead(228))) {
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
                return 124;

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
                return 125;

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
                this.bsCommit(41);
                this.state = 41;
                continue;

            case 39:
                if (!(this.lookahead(229))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.findDynamicVariable("$*Q_CLOSURES")))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 40;
                return 27;

            case 40:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.state = 41;
                continue;

            case 41:
                return -1;

            }
        }
    }

    private int _127_EXPR() {
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
                return 128;

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
                return 139;

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
                return 130;

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
                if (!(this.lookahead(230))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 13;

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
                return 136;

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
                return 13;

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
                return 128;

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
                return 139;

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
                return 130;

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

    private int _128_prefixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.setArgs();
                this.state = 1;
                return 129;

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

    private int _129_prefix() {
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

    private int _130_postfixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(6);
                this.bsMark(2);
                this.setArgs();
                this.state = 1;
                return 131;

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
                this.setArgs();
                this.state = 3;
                return 135;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 4:
                this.setArgs();
                this.state = 5;
                return 132;

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
                this.assignDynamicVariable("$*PREC", "y=");
                this.state = 6;
                continue;

            case 6:
                return -1;

            }
        }
    }

    private int _131_postfix() {
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

    private int _132_dotty() {
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
                return 133;

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

    private int _133_dottyop() {
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
                return 14;

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
                return 134;

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

    private int _134_methodop() {
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
                if (!(this.lookahead(231))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 4;
                return 82;

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
                return 14;

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
                if (!(this.lookahead(232))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 9;
                return 79;

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
                if (!(this.lookahead(233))) {
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
                return 81;

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
                return 14;

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

    private int _135_postcircumfix() {
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
                this.bsFailMark(52);
                this.bsMark(11);
                this.startToken(Perl6TokenTypes.ARRAY_INDEX_BRACKET);
                if (!(this.literal("["))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 1;
                return -3;

            case 1:
                this.bsMark(10);
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
                this.bsMark(6);
                this.state = 4;
                break;
            case 4:
                this.setArgs();
                this.state = 5;
                return 21;

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
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 6:
                this.bsMark(9);
                this.state = 7;
                break;
            case 7:
                this.startToken(Perl6TokenTypes.ARRAY_INDEX_BRACKET);
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 8;
                return -3;

            case 8:
                this.bsCommit(9);
                this.state = 9;
                continue;

            case 9:
                this.bsCommit(10);
                this.state = 10;
                continue;

            case 10:
                this.bsCommit(52);
                this.state = 52;
                continue;

            case 11:
                this.bsMark(22);
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 12;
                return -3;

            case 12:
                this.bsMark(21);
                this.state = 13;
                break;
            case 13:
                this.setArgs();
                this.state = 14;
                return 13;

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
                this.setArgs();
                this.state = 16;
                return 21;

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
                this.bsCommit(17);
                this.state = 17;
                continue;

            case 17:
                this.bsMark(20);
                this.state = 18;
                break;
            case 18:
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("}"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 19;
                return -3;

            case 19:
                this.bsCommit(20);
                this.state = 20;
                continue;

            case 20:
                this.bsCommit(21);
                this.state = 21;
                continue;

            case 21:
                this.bsCommit(52);
                this.state = 52;
                continue;

            case 22:
                this.bsMark(30);
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("<<"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 23;
                return -3;

            case 23:
                this.bsMark(29);
                this.state = 24;
                break;
            case 24:
                this.setArgs("<<", ">>", ">>");
                this.state = 25;
                return 122;

            case 25:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(28);
                this.state = 26;
                break;
            case 26:
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal(">>"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 27;
                return -3;

            case 27:
                this.bsCommit(28);
                this.state = 28;
                continue;

            case 28:
                this.bsCommit(29);
                this.state = 29;
                continue;

            case 29:
                this.bsCommit(52);
                this.state = 52;
                continue;

            case 30:
                this.bsMark(38);
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("\u00AB"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 31;
                return -3;

            case 31:
                this.bsMark(37);
                this.state = 32;
                break;
            case 32:
                this.setArgs("\u00AB", "\u00BB", "\u00BB");
                this.state = 33;
                return 122;

            case 33:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(36);
                this.state = 34;
                break;
            case 34:
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("\u00BB"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 35;
                return -3;

            case 35:
                this.bsCommit(36);
                this.state = 36;
                continue;

            case 36:
                this.bsCommit(37);
                this.state = 37;
                continue;

            case 37:
                this.bsCommit(52);
                this.state = 52;
                continue;

            case 38:
                this.bsMark(46);
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal("<"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 39;
                return -3;

            case 39:
                this.bsMark(45);
                this.state = 40;
                break;
            case 40:
                this.setArgs("<", ">", ">");
                this.state = 41;
                return 121;

            case 41:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(44);
                this.state = 42;
                break;
            case 42:
                this.startToken(Perl6TokenTypes.HASH_INDEX_BRACKET);
                if (!(this.literal(">"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 43;
                return -3;

            case 43:
                this.bsCommit(44);
                this.state = 44;
                continue;

            case 44:
                this.bsCommit(45);
                this.state = 45;
                continue;

            case 45:
                this.bsCommit(52);
                this.state = 52;
                continue;

            case 46:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal("("))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 47;
                return -3;

            case 47:
                this.setArgs();
                this.state = 48;
                return 81;

            case 48:
                if (this.lastResult.isFailed()) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                } else {
                    this.pos = this.lastResult.getPos();
                }
                this.bsMark(51);
                this.state = 49;
                break;
            case 49:
                this.startToken(Perl6TokenTypes.PARENTHESES);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 50;
                return -3;

            case 50:
                this.bsCommit(51);
                this.state = 51;
                continue;

            case 51:
                this.state = 52;
                continue;

            case 52:
                return -1;

            }
        }
    }

    private int _136_infixish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                if (this.lookahead(234)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (this.lookahead(235)) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 138;

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

    private int _137_infixstopper() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
                this.bsFailMark(4);
                this.bsMark(1);
                if (!(this.lookahead(236))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.isValueTruthy(this.testStrEQ(this.findDynamicVariable("$*GOAL"), "!!")))) {
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
                if (!(this.lookahead(237))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(3);
                this.bsMark(2);
                if (!(this.isValueTruthy(this.testStrEQ(this.findDynamicVariable("$*GOAL"), "{")))) {
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
                if (!(this.isValueTruthy(this.testStrEQ(this.findDynamicVariable("$*GOAL"), "endargs")))) {
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
                continue;

            case 4:
                return -1;

            }
        }
    }

    private int _138_infix() {
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

    private int _139_termish() {
        while (true) {
            switch (this.state) {
            case 0:
                this.checkArgs(0);
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
                if (!(this.spaceChar())) {
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

    private int ___lookahead_2() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("#"))) {
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

    private int ___lookahead_3() {
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

    private int ___lookahead_4() {
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
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.setArgs();
                this.state = 2;
                return 16;

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
                return 13;

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

    private int ___lookahead_7() {
        while (true) {
            switch (this.state) {
            case 0:
                this.marker("endstmt");
                return -1;

            }
        }
    }

    private int ___lookahead_8() {
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

    private int ___lookahead_9() {
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

    private int ___lookahead_10() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("v"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsFailMark(2);
                this.state = 1;
                break;
            case 1:
                if (!(this.digitChar())) {
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

    private int ___lookahead_11() {
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

    private int ___lookahead_12() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList(")]}"))) {
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

    private int ___lookahead_14() {
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

    private int ___lookahead_15() {
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

    private int ___lookahead_16() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.setArgs();
                this.state = 3;
                return 11;

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

    private int ___lookahead_17() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 13;

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
                return 72;

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
                return 11;

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

    private int ___lookahead_18() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 13;

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
                return 72;

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
                return 11;

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

    private int ___lookahead_19() {
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

    private int ___lookahead_20() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("{"))) {
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

    private int ___lookahead_21() {
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

    private int ___lookahead_22() {
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

    private int ___lookahead_23() {
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
                return -1;

            }
        }
    }

    private int ___lookahead_24() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 28;

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

    private int ___lookahead_25() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.literal("if"))) {
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
                if (!(this.literal("with"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 11;

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

    private int ___lookahead_26() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.literal("elsif"))) {
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
                if (!(this.literal("orwith"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

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
                return -1;

            }
        }
    }

    private int ___lookahead_27() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("else"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.setArgs();
                this.state = 1;
                return 13;

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

    private int ___lookahead_28() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("unless"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_29() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("without"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_30() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("while"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_31() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_32() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("repeat"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_33() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.literal("while"))) {
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
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 11;

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

    private int ___lookahead_34() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(2);
                this.bsMark(1);
                if (!(this.literal("while"))) {
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
                if (!(this.literal("until"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 2;
                continue;

            case 2:
                this.setArgs();
                this.state = 3;
                return 11;

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

    private int ___lookahead_35() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("for"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_36() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("whenever"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_37() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("loop"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_38() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 96;

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

    private int ___lookahead_39() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("given"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_40() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("when"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_41() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("default"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_42() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("CATCH"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_43() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("CONTROL"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_44() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("QUIT"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_45() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("DOC"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_46() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("BEGIN"))) {
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
                if (!(this.literal("CHECK"))) {
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
                if (!(this.literal("INIT"))) {
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
                return 9;

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

    private int ___lookahead_47() {
        while (true) {
            switch (this.state) {
            case 0:
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
                return 11;

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

    private int ___lookahead_48() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("race"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_49() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("hyper"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_50() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("lazy"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_51() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("eager"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_52() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("sink"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_53() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("try"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_54() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("quietly"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_55() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("gather"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_56() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("once"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_57() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("start"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_58() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("supply"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_59() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("react"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_60() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("do"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
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

    private int ___lookahead_61() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("{"))) {
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

    private int ___lookahead_62() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 70;

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
                return 11;

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

    private int ___lookahead_63() {
        while (true) {
            switch (this.state) {
            case 0:
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
                this.setArgs();
                this.state = 2;
                return 11;

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

    private int ___lookahead_64() {
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

    private int ___lookahead_65() {
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

    private int ___lookahead_66() {
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

    private int ___lookahead_67() {
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

    private int ___lookahead_68() {
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

    private int ___lookahead_69() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 30;

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

    private int ___lookahead_70() {
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
                return 11;

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

    private int ___lookahead_71() {
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
                return 13;

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

    private int ___lookahead_72() {
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
                return -1;

            }
        }
    }

    private int ___lookahead_73() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 13;

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
                this.bsFailMark(5);
                this.bsMark(2);
                if (!(this.literal(","))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal(";;"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(5);
                this.state = 5;
                continue;

            case 4:
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.state = 5;
                continue;

            case 5:
                return -1;

            }
        }
    }

    private int ___lookahead_74() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(6);
                this.bsMark(1);
                if (!(this.literal("-->"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.spaceChar())) {
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
                if (!(this.literal(";;"))) {
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

    private int ___lookahead_75() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(6);
                this.bsMark(1);
                if (!(this.literal("-->"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 1:
                this.bsMark(2);
                if (!(this.literal(")"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 2:
                this.bsMark(3);
                if (!(this.literal("]"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 3:
                this.bsMark(4);
                if (!(this.literal("{"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(6);
                this.state = 6;
                continue;

            case 4:
                this.bsMark(5);
                if (!(this.literal(":"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                if (!(this.spaceChar())) {
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
                if (!(this.literal(";;"))) {
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

    private int ___lookahead_76() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("["))) {
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

    private int ___lookahead_77() {
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

    private int ___lookahead_78() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 99;

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
                return 11;

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

    private int ___lookahead_79() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("{"))) {
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

    private int ___lookahead_80() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList(";"))) {
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

    private int ___lookahead_81() {
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

    private int ___lookahead_82() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 125;

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

    private int ___lookahead_83() {
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

    private int ___lookahead_84() {
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

    private int ___lookahead_85() {
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

    private int ___lookahead_86() {
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

    private int ___lookahead_87() {
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

    private int ___lookahead_88() {
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

    private int ___lookahead_89() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.inCharList("{"))) {
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

    private int ___lookahead_90() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 13;

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
                return 136;

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

    private int ___lookahead_91() {
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

    private int ___lookahead_92() {
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

    private int ___lookahead_93() {
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

    private int ___lookahead_94() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 30;

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

    private int ___lookahead_95() {
        while (true) {
            switch (this.state) {
            case 0:
                this.setArgs();
                this.state = 1;
                return 137;

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

    private int ___lookahead_96() {
        while (true) {
            switch (this.state) {
            case 0:
                if (!(this.literal("!!"))) {
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

    private int ___lookahead_97() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsFailMark(3);
                this.bsMark(1);
                if (!(this.literal("{"))) {
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
                this.setArgs();
                this.state = 2;
                return 26;

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
                continue;

            case 3:
                return -1;

            }
        }
    }

}
