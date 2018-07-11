package edument.perl6idea.debugger.event;

import com.intellij.icons.AllIcons;
import com.intellij.xdebugger.XDebugSession;
import com.intellij.xdebugger.XDebuggerManager;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import org.jetbrains.annotations.NotNull;

public class Perl6DebugEventBreakpointSet extends Perl6DebugEventBreakpointBase {
    public Perl6DebugEventBreakpointSet(String file, int line) {
        this.path = file;
        this.line = line;
    }

    @Override
    protected void processBreakPoint(@NotNull XLineBreakpoint breakpoint, XDebugSession session) {
        XDebuggerManager.getInstance(session.getProject()).getBreakpointManager().updateBreakpointPresentation(
                breakpoint, AllIcons.Debugger.Db_verified_breakpoint, "Breakpoint set"
        );
    }
}
