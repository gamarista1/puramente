package n0;

import H0.C1197s;
import H0.C1198t;
import J0.A0;
import J0.B0;
import J0.C0;
import J0.C1245k;
import c1.r;
import q0.C2421g;
import yf.C6798l;

/* renamed from: n0.f  reason: case insensitive filesystem */
public abstract class C2233f {
    /* access modifiers changed from: private */
    public static final boolean d(C2231d dVar, long j10) {
        if (!dVar.v0().S1()) {
            return false;
        }
        C1197s m10 = C1245k.m(dVar).m();
        if (!m10.G()) {
            return false;
        }
        long b10 = m10.b();
        int g10 = r.g(b10);
        int f10 = r.f(b10);
        long e10 = C1198t.e(m10);
        float m11 = C2421g.m(e10);
        float n10 = C2421g.n(e10);
        float f11 = ((float) g10) + m11;
        float f12 = ((float) f10) + n10;
        float m12 = C2421g.m(j10);
        if (m11 > m12 || m12 > f11) {
            return false;
        }
        float n11 = C2421g.n(j10);
        if (n10 > n11 || n11 > f12) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final void e(C2234g gVar, C2229b bVar) {
        gVar.n1(bVar);
        gVar.R0(bVar);
    }

    /* access modifiers changed from: private */
    public static final void f(B0 b02, C6798l lVar) {
        if (lVar.invoke(b02) == A0.ContinueTraversal) {
            C0.f(b02, lVar);
        }
    }
}
