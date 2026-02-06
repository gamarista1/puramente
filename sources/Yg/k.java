package Yg;

import java.util.concurrent.CancellationException;

public final class k extends CancellationException {
    public k() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
