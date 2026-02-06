package androidx.compose.material3.internal;

import java.util.concurrent.CancellationException;

final class a extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
