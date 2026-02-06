package P;

import Ef.m;
import Q0.L;
import c1.r;
import q0.C2421g;
import q0.C2422h;

public abstract class M {
    public static final float a(L l10, int i10, boolean z10, boolean z11) {
        int i11;
        boolean z12 = false;
        if ((!z10 || z11) && (z10 || !z11)) {
            i11 = Math.max(i10 - 1, 0);
        } else {
            i11 = i10;
        }
        if (l10.c(i11) == l10.y(i10)) {
            z12 = true;
        }
        return l10.j(i10, z12);
    }

    public static final long b(L l10, int i10, boolean z10, boolean z11) {
        int q10 = l10.q(i10);
        if (q10 >= l10.n()) {
            return C2421g.f25320b.b();
        }
        return C2422h.a(m.k(a(l10, i10, z10, z11), 0.0f, (float) r.g(l10.B())), m.k(l10.m(q10), 0.0f, (float) r.f(l10.B())));
    }
}
