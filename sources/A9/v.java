package A9;

import A9.I;
import ja.B;
import ja.C3645a;
import ja.I;
import ja.M;
import k9.C3717q0;
import q9.C3962B;
import q9.m;

public final class v implements B {

    /* renamed from: a  reason: collision with root package name */
    private C3717q0 f29767a;

    /* renamed from: b  reason: collision with root package name */
    private I f29768b;

    /* renamed from: c  reason: collision with root package name */
    private C3962B f29769c;

    public v(String str) {
        this.f29767a = new C3717q0.b().e0(str).E();
    }

    private void a() {
        C3645a.h(this.f29768b);
        M.j(this.f29769c);
    }

    public void b(I i10, m mVar, I.d dVar) {
        this.f29768b = i10;
        dVar.a();
        C3962B d10 = mVar.d(dVar.c(), 5);
        this.f29769c = d10;
        d10.c(this.f29767a);
    }

    public void c(B b10) {
        a();
        long d10 = this.f29768b.d();
        long e10 = this.f29768b.e();
        if (d10 != -9223372036854775807L && e10 != -9223372036854775807L) {
            C3717q0 q0Var = this.f29767a;
            if (e10 != q0Var.f45774p) {
                C3717q0 E10 = q0Var.b().i0(e10).E();
                this.f29767a = E10;
                this.f29769c.c(E10);
            }
            int a10 = b10.a();
            this.f29769c.d(b10, a10);
            this.f29769c.f(d10, 1, a10, 0, (C3962B.a) null);
        }
    }
}
