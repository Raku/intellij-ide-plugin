package edument.perl6idea.parsing;

public class MAINBraid extends Cursor<MAINBraid> {

    public int runRule() {
        int result;
        switch (this.ruleNumber) {
        case 0:
            result = this._0_TOP();
            break;
        case 1:
            result = this._1_statementlist();
            break;
        case 2:
            result = this._2_statement();
            break;
        case 3:
            result = this._3_bogus_statement();
            break;
        case 4:
            result = this._4_ws();
            break;
        case 5:
            result = this._5_statement_control();
            break;
        case 6:
            result = this._6_statement_control_use();
            break;
        case 7:
            result = this._7_name();
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
                this.state = 1;
                return 1;

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

    private int _1_statementlist() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
                this.state = 2;
                return 2;

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
                return -1;

            }
        }
    }

    private int _2_statement() {
        while (true) {
            switch (this.state) {
            case 0:
                this.bsMark(3);
                this.state = 1;
                break;
            case 1:
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
                this.bsFailMark(7);
                this.bsMark(5);
                this.state = 4;
                return 5;

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
                this.state = 6;
                return 3;

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
                this.bsMark(10);
                this.state = 8;
                break;
            case 8:
                this.state = 9;
                return 4;

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
                this.startToken(Perl6TokenTypes.STATEMENT_TERMINATOR);
                this.bsMark(12);
                this.state = 11;
                break;
            case 11:
                if (!(this.literal(";"))) {
                    if (this.backtrack()) {
                        continue;
                    } else {
                        return -2;
                    }
                }
                this.bsCommit(12);
                this.state = 12;
                continue;

            case 12:
                this.state = 13;
                return -3;

            case 13:
                this.bsMark(16);
                this.state = 14;
                break;
            case 14:
                this.state = 15;
                return 4;

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
                return -1;

            }
        }
    }

    private int _3_bogus_statement() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
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

    private int _4_ws() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.startToken(Perl6TokenTypes.WHITE_SPACE);
                this.bsFailMark(2);
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
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

    private int _5_statement_control() {
        while (true) {
            switch (this.state) {
            case 0:
                this.state = 1;
                return 6;

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

    private int _6_statement_control_use() {
        while (true) {
            switch (this.state) {
            case 0:
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
                return -1;

            }
        }
    }

    private int _7_name() {
        int rep;
        while (true) {
            switch (this.state) {
            case 0:
                this.startToken(Perl6TokenTypes.NAME);
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
                this.state = 3;
                return -3;

            case 3:
                return -1;

            }
        }
    }

}
