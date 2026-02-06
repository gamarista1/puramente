package x;

import java.util.concurrent.CancellationException;

/* renamed from: x.M  reason: case insensitive filesystem */
public final class C2849M extends CancellationException {
    public C2849M() {
        super("Mutation interrupted");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
