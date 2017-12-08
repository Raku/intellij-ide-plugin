package edument.perl6idea.testing;

import com.intellij.execution.process.ProcessHandler;
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

import javax.annotation.Nullable;
import java.text.ParseException;
import java.util.List;

public class TapOutputToGeneralTestEventsConverter extends OutputToGeneralTestEventsConverter {
    @Nullable
    private ServiceMessageVisitor myVisitor;
    @NotNull
    private TapConsumer myConsumer;
    private String currentTap;
    private int newTest = 1;
    private ProcessHandler ph;

    public TapOutputToGeneralTestEventsConverter(@NotNull String testFrameworkName, @NotNull TestConsoleProperties consoleProperties, ProcessHandler ph) {
        super(testFrameworkName, consoleProperties);
        myConsumer = TapConsumerFactory.makeTap13Consumer();
        this.ph = ph;
    }

    @Override
    protected boolean processServiceMessages(String text, final Key outputType, final ServiceMessageVisitor visitor) throws ParseException {
        if (myVisitor == null && visitor != null) {
            myVisitor = visitor;
        }

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
            ph.notifyTextAvailable(new ServiceMessageBuilder("enteredTheMatrix").toString() + "\n", ProcessOutputTypes.STDOUT);
            ph.notifyTextAvailable(ServiceMessageBuilder.testSuiteFinished("My suite").addAttribute("count", String.valueOf(results.size())).toString() + "\n", ProcessOutputTypes.STDOUT);
            for (int i = 0; i < results.size(); i++) {
                System.out.println("Text");
                ph.notifyTextAvailable(ServiceMessageBuilder.testStarted("My test" + i).toString() + "\n", ProcessOutputTypes.STDOUT);
                ph.notifyTextAvailable(ServiceMessageBuilder.testFinished("My test" + i).addAttribute("duration", String.valueOf(1)).toString() + "\n", ProcessOutputTypes.STDOUT);
            }
            ph.notifyTextAvailable(ServiceMessageBuilder.testSuiteFinished("My suite").toString() + "\n", ProcessOutputTypes.STDOUT);
        }
        return true;
    }
}
