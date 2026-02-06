package k0;

import java.util.concurrent.CancellationException;

public final class j extends CancellationException {
    public j() {
        super("The Modifier.Node was detached");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(k.f23089a);
        return this;
    }
}
