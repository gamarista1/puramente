package D0;

import java.util.concurrent.CancellationException;

public final class r extends CancellationException {
    public r(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(U.f1421a);
        return this;
    }
}
