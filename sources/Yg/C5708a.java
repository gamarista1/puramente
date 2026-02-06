package Yg;

import java.util.concurrent.CancellationException;

/* renamed from: Yg.a  reason: case insensitive filesystem */
public final class C5708a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient Object f66777a;

    public C5708a(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.f66777a = obj;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
