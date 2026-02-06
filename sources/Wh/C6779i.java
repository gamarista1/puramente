package wh;

import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import lf.C6523g;

/* renamed from: wh.i  reason: case insensitive filesystem */
public final class C6779i extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final IOException f73860a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f73861b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6779i(IOException iOException) {
        super(iOException);
        C6496s.h(iOException, "firstConnectException");
        this.f73860a = iOException;
        this.f73861b = iOException;
    }

    public final void a(IOException iOException) {
        C6496s.h(iOException, "e");
        C6523g.a(this.f73860a, iOException);
        this.f73861b = iOException;
    }

    public final IOException b() {
        return this.f73860a;
    }

    public final IOException c() {
        return this.f73861b;
    }
}
