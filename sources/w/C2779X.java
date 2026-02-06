package w;

import java.util.concurrent.CancellationException;

/* renamed from: w.X  reason: case insensitive filesystem */
public final class C2779X extends CancellationException {
    public C2779X() {
        super("Mutation interrupted");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
