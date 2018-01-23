package edument.perl6idea.debugger;

import com.intellij.icons.AllIcons;
import com.intellij.ui.ColoredTextContainer;
import com.intellij.ui.SimpleTextAttributes;
import com.intellij.xdebugger.frame.XStackFrame;
import org.jetbrains.annotations.NotNull;

public class Perl6StackFrame extends XStackFrame {
    private final Perl6StackFrameDescriptor myFrameDescriptor;
    private final Perl6ExecutionStack myStack;
    private final Perl6DebugThread myDebugThread;

    public Perl6StackFrame(Perl6StackFrameDescriptor frame, Perl6ExecutionStack stack) {
        myFrameDescriptor = frame;
        myStack = stack;
        myDebugThread = stack.getSuspendContext().getDebugThread();
    }

    @Override
    public void customizePresentation(@NotNull ColoredTextContainer component) {
        component.append(myFrameDescriptor.getPresentableName(), SimpleTextAttributes.REGULAR_ATTRIBUTES);
        component.setIcon(AllIcons.Debugger.StackFrame);
    }
}
