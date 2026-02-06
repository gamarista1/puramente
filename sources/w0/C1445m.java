package W0;

import Q0.Q;
import Q0.S;

/* renamed from: W0.m  reason: case insensitive filesystem */
public abstract class C1445m {
    public static final long a(long j10, long j11) {
        int j12;
        int l10 = Q.l(j10);
        int k10 = Q.k(j10);
        if (Q.p(j11, j10)) {
            if (Q.d(j11, j10)) {
                l10 = Q.l(j11);
                k10 = l10;
            } else if (Q.d(j10, j11)) {
                j12 = Q.j(j11);
            } else if (Q.e(j11, l10)) {
                l10 = Q.l(j11);
                j12 = Q.j(j11);
            } else {
                k10 = Q.l(j11);
            }
            return S.b(l10, k10);
        }
        if (k10 > Q.l(j11)) {
            l10 -= Q.j(j11);
            j12 = Q.j(j11);
        }
        return S.b(l10, k10);
        k10 -= j12;
        return S.b(l10, k10);
    }
}
