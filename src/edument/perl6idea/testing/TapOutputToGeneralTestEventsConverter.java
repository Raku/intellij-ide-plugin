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
    private String currentTap = "";
    private ServiceMessageVisitor myVisitor;

    public TapOutputToGeneralTestEventsConverter(@NotNull String testFrameworkName, @NotNull TestConsoleProperties consoleProperties) {
        super(testFrameworkName, consoleProperties);
        myConsumer = TapConsumerFactory.makeTap13Consumer();
    }

    @Override
    protected boolean processServiceMessages(String text, final Key outputType, final ServiceMessageVisitor visitor) throws ParseException {
        if (outputType == ProcessOutputTypes.STDOUT || outputType == ProcessOutputTypes.STDERR) {
            currentTap += text;
        }
        if (outputType == ProcessOutputTypes.SYSTEM && text.equals("\n")) {
            processTapOutput(outputType, visitor);
        }
        return true;
    }

    private void processTapOutput(final Key outputType, ServiceMessageVisitor visitor) throws ParseException {
        if (visitor != null && myVisitor == null)
            myVisitor = visitor;

        TestSet set = myConsumer.load(currentTap);
        currentTap = "";
        List<TestResult> results = set.getTestResults();
        super.processServiceMessages(new ServiceMessageBuilder("enteredTheMatrix").toString(), ProcessOutputTypes.STDOUT, visitor);
        ServiceMessageBuilder countBuilder = new ServiceMessageBuilder("testCount")
                .addAttribute("count", String.valueOf(set.getNumberOfTestResults()));
        super.processServiceMessages(countBuilder.toString(), ProcessOutputTypes.STDOUT, visitor);
        super.processServiceMessages(ServiceMessageBuilder.testSuiteStarted("testSuite").toString(), ProcessOutputTypes.STDOUT, visitor);
        for (int i = 0; i < results.size(); i++) {
            ServiceMessageBuilder testStarted = ServiceMessageBuilder.testStarted("testSuite.perl6.test.test" + i);
            super.processServiceMessages(testStarted.toString(), ProcessOutputTypes.STDOUT, myVisitor);
            ServiceMessageBuilder text = ServiceMessageBuilder.testStdOut("testSuite.perl6.test.test" + i);
            text.addAttribute("out", "text");
            super.processServiceMessages(text.toString(), ProcessOutputTypes.STDOUT, myVisitor);
            ServiceMessageBuilder testFinished = ServiceMessageBuilder.testFinished("testSuite.perl6.test.test" + i);
            super.processServiceMessages(testFinished.toString(), ProcessOutputTypes.STDOUT, myVisitor);
        }
        super.processServiceMessages(ServiceMessageBuilder.testSuiteFinished("testSuite").toString(), ProcessOutputTypes.STDOUT, myVisitor);
    }
}
