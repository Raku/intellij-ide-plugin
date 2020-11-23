package edument.perl6idea.cro.template.parsing;

import com.intellij.psi.stubs.IStubElementType;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.IStubFileElementType;
import edument.perl6idea.cro.template.psi.stub.CroTemplateMacroStubElementType;
import edument.perl6idea.cro.template.psi.stub.CroTemplateSubStubElementType;

public interface CroTemplateElementTypes {
    IStubFileElementType FILE = new CroTemplateFileElementType();
    IStubElementType MACRO = new CroTemplateMacroStubElementType();
    IStubElementType SUB = new CroTemplateSubStubElementType();
    IElementType APPLY = new CroTemplateElementType("APPLY");
    IElementType ARGLIST = new CroTemplateElementType("ARGLIST");
    IElementType BODY = new CroTemplateElementType("BODY");
    IElementType BOOL_LITERAL = new CroTemplateElementType("BOOL_LITERAL");
    IElementType CALL = new CroTemplateElementType("CALL");
    IElementType COMMENT = new CroTemplateElementType("COMMENT");
    IElementType CONDITION = new CroTemplateElementType("CONDITION");
    IElementType DEREF_ARRAY = new CroTemplateElementType("DEREF_ARRAY");
    IElementType DEREF_HASH = new CroTemplateElementType("DEREF_HASH");
    IElementType DEREF_HASH_LITERAL = new CroTemplateElementType("DEREF_HASH_LITERAL");
    IElementType DEREF_METHOD = new CroTemplateElementType("DEREF_METHOD");
    IElementType DEREF_SMART = new CroTemplateElementType("DEREF_SMART");
    IElementType INFIX = new CroTemplateElementType("INFIX");
    IElementType INT_LITERAL = new CroTemplateElementType("INT_LITERAL");
    IElementType ITERATION = new CroTemplateElementType("ITERATION");
    IElementType LITERAL_CLOSE_TAG = new CroTemplateElementType("LITERAL_CLOSE_TAG");
    IElementType LITERAL_OPEN_TAG = new CroTemplateElementType("LITERAL_OPEN_TAG");
    IElementType LITERAL_TAG_ATTRIBUTE = new CroTemplateElementType("LITERAL_TAG_ATTRIBUTE");
    IElementType NAMED_ARGUMENT = new CroTemplateElementType("NAMED_ARGUMENT");
    IElementType NUM_LITERAL = new CroTemplateElementType("NUM_LITERAL");
    IElementType PARAMETER = new CroTemplateElementType("PARAMETER");
    IElementType PARAMETER_DEFAULT = new CroTemplateElementType("PARAMETER_DEFAULT");
    IElementType PARENTHESIZED_EXPRESSION = new CroTemplateElementType("PARENTHESIZED_EXPRESSION");
    IElementType RAT_LITERAL = new CroTemplateElementType("RAT_LITERAL");
    IElementType SIGNATURE = new CroTemplateElementType("SIGNATURE");
    IElementType STRING_LITERAL = new CroTemplateElementType("STRING_LITERAL");
    IElementType TAG_SEQUENCE = new CroTemplateElementType("TAG_SEQUENCE");
    IElementType TOPIC_ACCESS = new CroTemplateElementType("TOPIC_ACCESS");
    IElementType USE = new CroTemplateElementType("USE");
    IElementType VARIABLE_ACCESS = new CroTemplateElementType("VARIABLE_ACCESS");
}
