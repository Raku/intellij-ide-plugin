package edument.perl6idea.testing;

import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.execution.testframework.TestConsoleProperties;
import com.intellij.execution.testframework.sm.ServiceMessageBuilder;
import com.intellij.execution.testframework.sm.runner.OutputToGeneralTestEventsConverter;
import com.intellij.openapi.util.Key;
import jetbrains.buildServer.messages.serviceMessages.ServiceMessageVisitor;
import org.jetbrains.annotations.NotNull;
import org.tap4j.consumer.TapConsumer;
import org.tap4j.consumer.TapConsumerFactory;
import org.tap4j.model.TestResult;
import org.tap4j.model.TestSet;

import java.text.ParseException;
import java.util.List;

public class TapOutputToGeneralTestEventsConverter extends OutputToGeneralTestEventsConverter {
    @NotNull
    private TapConsumer myConsumer;
    private String currentTap;
    private int newTest = 1;
    private Key myOutputType;

    public TapOutputToGeneralTestEventsConverter(@NotNull String testFrameworkName, @NotNull TestConsoleProperties consoleProperties) {
        super(testFrameworkName, consoleProperties);
        myConsumer = TapConsumerFactory.makeTap13Consumer();
    }

    @Override
    protected boolean processServiceMessages(String text, final Key outputType, final ServiceMessageVisitor visitor) throws ParseException {
        myOutputType = outputType;

        if (outputType == ProcessOutputTypes.STDOUT || outputType == ProcessOutputTypes.STDERR) {
            currentTap += text;
        } else {
            if (newTest != 3) {
                newTest++;
                return true;
            }
            newTest = 1;
            TestSet set = myConsumer.load(currentTap);
            currentTap = "";
            List<TestResult> results = set.getTestResults();
            super.processServiceMessages(new ServiceMessageBuilder("enteredTheMatrix").toString(), myOutputType, visitor);
            super.processServiceMessages(
                    new ServiceMessageBuilder("testCount")
                            .addAttribute(
                                    "count",
                                    String.valueOf(set.getNumberOfTestResults())).toString(),
                    myOutputType, visitor);
            super.processServiceMessages(ServiceMessageBuilder.testSuiteStarted("My Perl6 suite").toString(), myOutputType, visitor);
            for (int i = 0; i < results.size(); i++) {
                super.processServiceMessages(ServiceMessageBuilder.testStarted("My test" + i).toString(), myOutputType, visitor);
                super.processServiceMessages(ServiceMessageBuilder.testStdOut("Bang!").toString(), myOutputType, visitor);
                //super.processServiceMessages(ServiceMessageBuilder.testFinished("My test" + i).toString(), myOutputType, visitor);
                System.out.println("Text");
            }
            super.processServiceMessages(ServiceMessageBuilder.testSuiteFinished("My Perl6 suite").toString(), myOutputType, visitor);
        }
        return true;
    }
}
