package edument.perl6idea.debugger.event;

import com.intellij.xdebugger.frame.XSuspendContext;
import edument.perl6idea.debugger.Perl6StackFrameDescriptor;
import edument.perl6idea.debugger.Perl6SuspendContext;

public class Perl6DebugEventStop extends Perl6DebugEventBase implements Perl6DebugEvent {
    private Perl6StackFrameDescriptor[] frames;

    public void setFrames(Perl6StackFrameDescriptor[] frames) {
        this.frames = frames;
    }

    public XSuspendContext getSuspendContext() {
        return new Perl6SuspendContext(frames, getDebugSession(), getDebugThread());
    }

    @Override
    public void run() {
        getDebugSession().positionReached(getSuspendContext());
    }
}
