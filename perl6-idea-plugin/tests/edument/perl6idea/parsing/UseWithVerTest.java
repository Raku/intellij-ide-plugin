package edument.perl6idea.parsing;

import com.intellij.testFramework.ParsingTestCase;

public class UseWithVerTest extends ParsingTestCase {
  public UseWithVerTest() {
    super("", "p6", new Perl6ParserDefinition());
  }

  public void testParsingTestData() {
    doTest(true);
  }

  @Override
  protected String getTestDataPath() {
    return "perl6-idea-plugin/testData/parsing/use-with-ver";
  }

  @Override
  protected boolean skipSpaces() {
    return false;
  }

  @Override
  protected boolean includeRanges() {
    return true;
  }
}
