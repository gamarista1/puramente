package D0;

import J0.C1254u;
import J0.G;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final G f1391a;

    /* renamed from: b  reason: collision with root package name */
    private final C1115f f1392b;

    /* renamed from: c  reason: collision with root package name */
    private final B f1393c = new B();

    /* renamed from: d  reason: collision with root package name */
    private final C1254u f1394d = new C1254u();

    /* renamed from: e  reason: collision with root package name */
    private boolean f1395e;

    public E(G g10) {
        this.f1391a = g10;
        this.f1392b = new C1115f(g10.m());
    }

    public final void a() {
        this.f1392b.b();
    }

    public final int b(C c10, P p10, boolean z10) {
        boolean z11;
        if (this.f1395e) {
            return F.a(false, false);
        }
        boolean z12 = true;
        try {
            this.f1395e = true;
            C1116g b10 = this.f1393c.b(c10, p10);
            int m10 = b10.b().m();
            int i10 = 0;
            while (true) {
                if (i10 >= m10) {
                    z11 = true;
                    break;
                }
                A a10 = (A) b10.b().o(i10);
                if (a10.i()) {
                    break;
                } else if (a10.l()) {
                    break;
                } else {
                    i10++;
                }
            }
            z11 = false;
            int m11 = b10.b().m();
            for (int i11 = 0; i11 < m11; i11++) {
                A a11 = (A) b10.b().o(i11);
                if (z11 || C1125p.b(a11)) {
                    G.x0(this.f1391a, a11.h(), this.f1394d, O.g(a11.n(), O.f1413a.d()), false, 8, (Object) null);
                    if (!this.f1394d.isEmpty()) {
                        this.f1392b.a(a11.f(), this.f1394d, C1125p.b(a11));
                        this.f1394d.clear();
                    }
                }
            }
            this.f1392b.e();
            boolean c11 = this.f1392b.c(b10, z10);
            if (!b10.d()) {
                int m12 = b10.b().m();
                int i12 = 0;
                while (true) {
                    if (i12 >= m12) {
                        break;
                    }
                    A a12 = (A) b10.b().o(i12);
                    if (C1125p.j(a12) && a12.p()) {
                        break;
                    }
                    i12++;
                }
            }
            z12 = false;
            int a13 = F.a(c11, z12);
            this.f1395e = false;
            return a13;
        } catch (Throwable th2) {
            this.f1395e = false;
            throw th2;
        }
    }

    public final void c() {
        if (!this.f1395e) {
            this.f1393c.a();
            this.f1392b.d();
        }
    }
}
