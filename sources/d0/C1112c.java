package D0;

import java.util.concurrent.CancellationException;

/* renamed from: D0.c  reason: case insensitive filesystem */
public final class C1112c extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public static final C1112c f1453a = new C1112c();

    private C1112c() {
    }

    public Throwable fillInStackTrace() {
        setStackTrace(U.f1421a);
        return this;
    }
}
