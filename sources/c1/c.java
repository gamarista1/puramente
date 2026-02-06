package c1;

import Ef.m;
import lf.C6527k;

public abstract class c {
    public static final long a(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            m.a("maxWidth(" + i11 + ") must be >= than minWidth(" + i10 + ')');
        }
        if (i13 >= i12) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            m.a("maxHeight(" + i13 + ") must be >= than minHeight(" + i12 + ')');
        }
        if (i10 >= 0 && i12 >= 0) {
            z12 = true;
        }
        if (!z12) {
            m.a("minWidth(" + i10 + ") and minHeight(" + i12 + ") must be >= 0");
        }
        return j(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    private static final int d(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        return m.d(i10 + i11, 0);
    }

    private static final int e(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        if (i10 < 262143) {
            return 18;
        }
        return 255;
    }

    public static final long f(long j10, long j11) {
        return s.a(m.l(r.g(j11), b.n(j10), b.l(j10)), m.l(r.f(j11), b.m(j10), b.k(j10)));
    }

    public static final long g(long j10, long j11) {
        return a(m.l(b.n(j11), b.n(j10), b.l(j10)), m.l(b.l(j11), b.n(j10), b.l(j10)), m.l(b.m(j11), b.m(j10), b.k(j10)), m.l(b.k(j11), b.m(j10), b.k(j10)));
    }

    public static final int h(long j10, int i10) {
        return m.l(i10, b.m(j10), b.k(j10));
    }

    public static final int i(long j10, int i10) {
        return m.l(i10, b.n(j10), b.l(j10));
    }

    public static final long j(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (i13 == Integer.MAX_VALUE) {
            i14 = i12;
        } else {
            i14 = i13;
        }
        int e10 = e(i14);
        if (i11 == Integer.MAX_VALUE) {
            i15 = i10;
        } else {
            i15 = i11;
        }
        int e11 = e(i15);
        if (e10 + e11 > 31) {
            k(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i16 & (~(i16 >> 31));
        int i18 = i13 + 1;
        int i19 = i18 & (~(i18 >> 31));
        int i20 = 0;
        if (e11 != 13) {
            if (e11 == 18) {
                i20 = 3;
            } else if (e11 == 15) {
                i20 = 1;
            } else if (e11 == 16) {
                i20 = 2;
            }
        }
        int i21 = ((i20 & 1) << 1) + (((i20 & 2) >> 1) * 3);
        return b.b((((long) i17) << 33) | ((long) i20) | (((long) i10) << 2) | (((long) i12) << (i21 + 15)) | (((long) i19) << (i21 + 46)));
    }

    private static final void k(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    private static final Void l(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    /* access modifiers changed from: private */
    public static final int m(int i10) {
        if (i10 < 8191) {
            return 262142;
        }
        if (i10 < 32767) {
            return 65534;
        }
        if (i10 < 65535) {
            return 32766;
        }
        if (i10 < 262143) {
            return 8190;
        }
        l(i10);
        throw new C6527k();
    }

    public static final long n(long j10, int i10, int i11) {
        return a(m.d(b.n(j10) + i10, 0), d(b.l(j10), i10), m.d(b.m(j10) + i11, 0), d(b.k(j10), i11));
    }

    public static /* synthetic */ long o(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return n(j10, i10, i11);
    }
}
