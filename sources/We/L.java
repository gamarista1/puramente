package We;

import java.io.Closeable;
import p003if.a;
import p003if.h;

public final class L implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f65595a;

    /* renamed from: b  reason: collision with root package name */
    private final R0 f65596b;

    /* renamed from: c  reason: collision with root package name */
    private final C5665z0 f65597c;

    /* renamed from: d  reason: collision with root package name */
    private final a f65598d = new a();

    public L(M0 m02) {
        M0 m03 = (M0) h.c(m02, "The SentryOptions is required.");
        this.f65595a = m03;
        Q0 q02 = new Q0(m03);
        this.f65597c = new C5665z0(q02);
        this.f65596b = new R0(q02, m03);
    }

    public void close() {
    }
}
