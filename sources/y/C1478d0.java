package Y;

import Ug.C5600w0;
import Ug.K;
import Ug.L;
import Ug.M;
import qf.g;
import yf.p;

/* renamed from: Y.d0  reason: case insensitive filesystem */
public final class C1478d0 implements T0 {

    /* renamed from: a  reason: collision with root package name */
    private final p f9969a;

    /* renamed from: b  reason: collision with root package name */
    private final K f9970b;

    /* renamed from: c  reason: collision with root package name */
    private C5600w0 f9971c;

    public C1478d0(g gVar, p pVar) {
        this.f9969a = pVar;
        this.f9970b = L.a(gVar);
    }

    public void b() {
        C5600w0 w0Var = this.f9971c;
        if (w0Var != null) {
            C0.e(w0Var, "Old job was still running!", (Throwable) null, 2, (Object) null);
        }
        this.f9971c = C5576k.d(this.f9970b, (g) null, (M) null, this.f9969a, 3, (Object) null);
    }

    public void c() {
        C5600w0 w0Var = this.f9971c;
        if (w0Var != null) {
            w0Var.n(new C1484f0());
        }
        this.f9971c = null;
    }

    public void d() {
        C5600w0 w0Var = this.f9971c;
        if (w0Var != null) {
            w0Var.n(new C1484f0());
        }
        this.f9971c = null;
    }
}
