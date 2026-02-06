package Q0;

import b1.k;
import b1.n;
import b1.t;
import c1.r;
import q0.C2421g;
import q0.C2423i;
import q0.C2424j;
import q0.C2428n;
import r0.C2514n0;
import r0.C2520p0;
import r0.C2544x0;
import r0.e2;
import t0.C2606g;
import t0.C2609j;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    public static final P f5290a = new P();

    private P() {
    }

    public final void a(C2520p0 p0Var, L l10) {
        boolean z10;
        long a10;
        float f10;
        if (!l10.i() || t.e(l10.l().f(), t.f19154a.c())) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            C2423i b10 = C2424j.b(C2421g.f25320b.c(), C2428n.a((float) r.g(l10.B()), (float) r.f(l10.B())));
            p0Var.q();
            C2520p0.t(p0Var, b10, 0, 2, (Object) null);
        }
        C y10 = l10.l().i().y();
        k s10 = y10.s();
        if (s10 == null) {
            s10 = k.f19119b.c();
        }
        k kVar = s10;
        e2 r10 = y10.r();
        if (r10 == null) {
            r10 = e2.f25491d.a();
        }
        e2 e2Var = r10;
        C2606g h10 = y10.h();
        if (h10 == null) {
            h10 = C2609j.f25944a;
        }
        C2606g gVar = h10;
        try {
            C2514n0 f11 = y10.f();
            if (f11 != null) {
                if (y10.t() != n.b.f19134b) {
                    f10 = y10.t().a();
                } else {
                    f10 = 1.0f;
                }
                C1328k.F(l10.w(), p0Var, f11, f10, e2Var, kVar, gVar, 0, 64, (Object) null);
            } else {
                if (y10.t() != n.b.f19134b) {
                    a10 = y10.t().d();
                } else {
                    a10 = C2544x0.f25560b.a();
                }
                C1328k.D(l10.w(), p0Var, a10, e2Var, kVar, gVar, 0, 32, (Object) null);
            }
        } finally {
            if (z10) {
                p0Var.h();
            }
        }
    }
}
