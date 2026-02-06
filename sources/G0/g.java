package g0;

import java.util.concurrent.CancellationException;

public abstract class g extends CancellationException {
    public g(String str) {
        super(str);
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
