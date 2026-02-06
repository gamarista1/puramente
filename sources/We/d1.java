package We;

import We.M0;
import java.io.Closeable;

public final class d1 implements J, M0.a, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private M0 f65843a;

    /* renamed from: b  reason: collision with root package name */
    private C5654u f65844b = P.c();

    /* renamed from: c  reason: collision with root package name */
    private C5662y f65845c = U.c();

    public void close() {
        this.f65845c.a(0);
        M0 m02 = this.f65843a;
        if (m02 != null && m02.i() == this) {
            this.f65843a.I((M0.a) null);
        }
    }
}
