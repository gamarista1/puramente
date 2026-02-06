package D0;

import java.util.concurrent.CancellationException;

public final class I extends CancellationException {
    public I() {
        super("Pointer input was reset");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(U.f1421a);
        return this;
    }
}
