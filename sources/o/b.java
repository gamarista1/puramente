package O;

import Ef.m;
import J.J;
import b1.t;
import com.google.android.gms.common.api.a;

public abstract class b {
    public static final long a(long j10, boolean z10, int i10, float f10) {
        return c1.b.f19206b.b(0, c(j10, z10, i10, f10), 0, c1.b.k(j10));
    }

    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !t.e(i10, t.f19154a.b())) {
            return m.d(i11, 1);
        }
        return 1;
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int i11;
        if ((z10 || t.e(i10, t.f19154a.b())) && c1.b.h(j10)) {
            i11 = c1.b.l(j10);
        } else {
            i11 = a.e.API_PRIORITY_OTHER;
        }
        if (c1.b.n(j10) == i11) {
            return i11;
        }
        return m.l(J.a(f10), c1.b.n(j10), i11);
    }
}
