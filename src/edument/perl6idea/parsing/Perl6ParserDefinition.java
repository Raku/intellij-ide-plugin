package edument.perl6idea.parsing;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import edument.perl6idea.psi.impl.*;
import org.jetbrains.annotations.NotNull;

public class Perl6ParserDefinition implements ParserDefinition {
    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new Perl6Lexer();
    }

    @Override
    public PsiParser createParser(Project project) {
        return new Perl6Parser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return Perl6ElementTypes.FILE;
    }

    @NotNull
    @Override
    public TokenSet getWhitespaceTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode astNode) {
        IElementType type = astNode.getElementType();
        if (type == Perl6ElementTypes.STATEMENT_LIST)
            return new Perl6StatementListImpl(astNode);
        if (type == Perl6ElementTypes.STATEMENT)
            return new Perl6StatementImpl(astNode);
        if (type == Perl6ElementTypes.IF_STATEMENT)
            return new Perl6IfStatementImpl(astNode);
        if (type == Perl6ElementTypes.UNLESS_STATEMENT)
            return new Perl6UnlessStatementImpl(astNode);
        if (type == Perl6ElementTypes.WITHOUT_STATEMENT)
            return new Perl6WithoutStatementImpl(astNode);
        if (type == Perl6ElementTypes.WHILE_STATEMENT)
            return new Perl6WhileStatementImpl(astNode);
        if (type == Perl6ElementTypes.UNTIL_STATEMENT)
            return new Perl6UntilStatementImpl(astNode);
        if (type == Perl6ElementTypes.REPEAT_STATEMENT)
            return new Perl6RepeatStatementImpl(astNode);
        if (type == Perl6ElementTypes.FOR_STATEMENT)
            return new Perl6ForStatementImpl(astNode);
        if (type == Perl6ElementTypes.WHENEVER_STATEMENT)
            return new Perl6WheneverStatementImpl(astNode);
        if (type == Perl6ElementTypes.LOOP_STATEMENT)
            return new Perl6LoopStatementImpl(astNode);
        if (type == Perl6ElementTypes.USE_STATEMENT)
            return new Perl6UseStatementImpl(astNode);
        if (type == Perl6ElementTypes.GIVEN_STATEMENT)
            return new Perl6GivenStatementImpl(astNode);
        if (type == Perl6ElementTypes.WHEN_STATEMENT)
            return new Perl6WheneverStatementImpl(astNode);
        if (type == Perl6ElementTypes.DEFAULT_STATEMENT)
            return new Perl6DefaultStatementImpl(astNode);
        if (type == Perl6ElementTypes.STATEMENT_MOD_COND)
            return new Perl6StatementModCondImpl(astNode);
        if (type == Perl6ElementTypes.STATEMENT_MOD_LOOP)
            return new Perl6StatementModLoopImpl(astNode);
        if (type == Perl6ElementTypes.SCOPED_DECLARATION)
            return new Perl6ScopedDeclImpl(astNode);
        if (type == Perl6ElementTypes.VARIABLE_DECLARATION)
            return new Perl6VariableDeclImpl(astNode);
        if (type == Perl6ElementTypes.PREFIX)
            return new Perl6PrefixImpl(astNode);
        if (type == Perl6ElementTypes.INFIX)
            return new Perl6InfixImpl(astNode);
        if (type == Perl6ElementTypes.POSTFIX)
            return new Perl6PostfixImpl(astNode);
        // TODO Kill this off once we have proper operator parsing
        if (type == Perl6ElementTypes.EXPR)
            return new Perl6ExpressionImpl(astNode);
        if (type == Perl6ElementTypes.VARIABLE)
            return new Perl6VariableImpl(astNode);
        if (type == Perl6ElementTypes.INTEGER_LITERAL)
            return new Perl6IntLiteralImpl(astNode);
        if (type == Perl6ElementTypes.NUMBER_LITERAL)
            return new Perl6NumLiteralImpl(astNode);
        if (type == Perl6ElementTypes.RAT_LITERAL)
            return new Perl6RatLiteralImpl(astNode);
        if (type == Perl6ElementTypes.STRING_LITERAL)
            return new Perl6StrLiteralImpl(astNode);
        if (type == Perl6ElementTypes.SUB_CALL)
            return new Perl6SubCallImpl(astNode);
        if (type == Perl6ElementTypes.METHOD_CALL)
            return new Perl6MethodCallImpl(astNode);
        if (type == Perl6ElementTypes.TYPE_NAME)
            return new Perl6TypeNameImpl(astNode);
        if (type == Perl6ElementTypes.WHATEVER)
            return new Perl6WhateverImpl(astNode);
        if (type == Perl6ElementTypes.HYPER_WHATEVER)
            return new Perl6HyperWhateverImpl(astNode);
        if (type == Perl6ElementTypes.ROUTINE_DECLARATION)
            return new Perl6RoutineDeclImpl(astNode);
        if (type == Perl6ElementTypes.MULTI_DECLARATION)
            return new Perl6MultiDeclImpl(astNode);
        if (type == Perl6ElementTypes.SIGNATURE)
            return new Perl6RoutineDeclImpl(astNode);
        return null;
    }

    @Override
    public PsiFile createFile(FileViewProvider fileViewProvider) {
        return new Perl6FileImpl(fileViewProvider);
    }

    @Override
    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode astNode, ASTNode astNode1) {
        return SpaceRequirements.MAY;
    }
}
