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
import org.tap4j.model.Directive;
import org.tap4j.model.TestResult;
import org.tap4j.model.TestSet;
import org.tap4j.util.DirectiveValues;
import org.tap4j.util.StatusValues;

import java.text.ParseException;
import java.util.List;

public class TapOutputToGeneralTestEventsConverter extends OutputToGeneralTestEventsConverter {
    @NotNull
    private TapConsumer myConsumer;
    private String currentTap = "";
    private ServiceMessageVisitor myVisitor;
    private String currentFile = "";

    public TapOutputToGeneralTestEventsConverter(@NotNull String testFrameworkName, @NotNull TestConsoleProperties consoleProperties) {
        super(testFrameworkName, consoleProperties);
        myConsumer = TapConsumerFactory.makeTap13Consumer();
    }

    @Override
    protected boolean processServiceMessages(String text, final Key outputType, final ServiceMessageVisitor visitor) throws ParseException {
        if (visitor != null && myVisitor == null) {
            myVisitor = visitor;
            String theMatrix = new ServiceMessageBuilder("enteredTheMatrix").toString();
            handleMessageSend(theMatrix);
        }

        if (outputType == ProcessOutputTypes.STDOUT) {
            if (text.startsWith("===")) {
                currentFile = text.substring(3);
                if (!currentTap.equals(""))
                    processTapOutput();
            } else {
                currentTap += text;
            }
        } else if (outputType == ProcessOutputTypes.SYSTEM && text.equals("\n")) {
            // Last time.
            processTapOutput();
        }
        return true;
    }

    private void processTapOutput() throws ParseException {
        TestSet set = myConsumer.load(currentTap);
        currentTap = "";
        List<TestResult> results = set.getTestResults();
        processTestsCount(set);
        processSingleSuite(results);
    }

    private void processSingleSuite(List<TestResult> results) throws ParseException {
        super.processServiceMessages(ServiceMessageBuilder.testSuiteStarted(currentFile).toString(), ProcessOutputTypes.STDOUT, myVisitor);
        for (TestResult result : results) {
            processSingleTest(result);
        }
        super.processServiceMessages(ServiceMessageBuilder.testSuiteFinished(currentFile).toString(), ProcessOutputTypes.STDOUT, myVisitor);
    }

    private void processTestsCount(TestSet set) throws ParseException {
        String message = new ServiceMessageBuilder("testCount")
                .addAttribute("count", String.valueOf(set.getNumberOfTestResults())).toString();
        handleMessageSend(message);
    }

    private void processSingleTest(TestResult testResult) throws ParseException {
        String testName = String.format("%d %s", testResult.getTestNumber(), testResult.getDescription());
        Directive directive = testResult.getDirective();
        handleMessageSend(ServiceMessageBuilder.testStarted(testName).toString());
        if (testResult.getStatus() == StatusValues.OK &&
            testResult.getDirective() == null) {
        } else if ((directive != null && directive.getDirectiveValue() == DirectiveValues.SKIP) ||
                   (directive != null && directive.getDirectiveValue() == DirectiveValues.TODO)) {
            String message = ServiceMessageBuilder.testIgnored(testName)
                    .addAttribute("message", String.format("%s %s", testName, testResult.getDirective().getReason())).toString();
            handleMessageSend(message);
        } else if (testResult.getStatus() == StatusValues.NOT_OK) {
            String message = ServiceMessageBuilder.testFailed(testName)
                    .addAttribute("error", "true")
                    .addAttribute("message", testResult.getDescription()).toString();
            handleMessageSend(message);
        }
        handleMessageSend(ServiceMessageBuilder.testFinished(testName).toString());
    }

    private void handleMessageSend(String message) throws ParseException {
        super.processServiceMessages(message, ProcessOutputTypes.STDOUT, myVisitor);
    }
}
