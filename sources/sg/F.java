package Sg;

import kotlin.jvm.internal.C6496s;
import lf.C6504C;
import lf.C6506E;
import lf.C6508G;
import lf.C6511J;
import lf.C6527k;

public abstract class F {
    public static final byte a(String str) {
        C6496s.h(str, "<this>");
        C6504C b10 = b(str);
        if (b10 != null) {
            return b10.i();
        }
        x.l(str);
        throw new C6527k();
    }

    public static final C6504C b(String str) {
        C6496s.h(str, "<this>");
        return c(str, 10);
    }

    public static final C6504C c(String str, int i10) {
        C6496s.h(str, "<this>");
        C6506E f10 = f(str, i10);
        if (f10 == null) {
            return null;
        }
        int i11 = f10.i();
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, C6506E.b(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C6504C.a(C6504C.b((byte) i11));
    }

    public static final int d(String str) {
        C6496s.h(str, "<this>");
        C6506E e10 = e(str);
        if (e10 != null) {
            return e10.i();
        }
        x.l(str);
        throw new C6527k();
    }

    public static final C6506E e(String str) {
        C6496s.h(str, "<this>");
        return f(str, 10);
    }

    public static final C6506E f(String str, int i10) {
        int i11;
        C6496s.h(str, "<this>");
        C5538a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        if (C6496s.i(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i11 = 0;
        }
        int b10 = C6506E.b(i10);
        int i13 = 119304647;
        while (i11 < length) {
            int b11 = C5539b.b(str.charAt(i11), i10);
            if (b11 < 0) {
                return null;
            }
            if (Integer.compare(i12 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) > 0) {
                if (i13 == 119304647) {
                    i13 = E.a(-1, b10);
                    if (Integer.compare(i12 ^ Integer.MIN_VALUE, i13 ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int b12 = C6506E.b(i12 * b10);
            int b13 = C6506E.b(C6506E.b(b11) + b12);
            if (Integer.compare(b13 ^ Integer.MIN_VALUE, b12 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i11++;
            i12 = b13;
        }
        return C6506E.a(i12);
    }

    public static final long g(String str) {
        C6496s.h(str, "<this>");
        C6508G h10 = h(str);
        if (h10 != null) {
            return h10.j();
        }
        x.l(str);
        throw new C6527k();
    }

    public static final C6508G h(String str) {
        C6496s.h(str, "<this>");
        return i(str, 10);
    }

    public static final C6508G i(String str, int i10) {
        String str2 = str;
        int i11 = i10;
        C6496s.h(str2, "<this>");
        C5538a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str2.charAt(0);
        if (C6496s.i(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long b10 = C6508G.b((long) i11);
        long j10 = 0;
        long j11 = 512409557603043100L;
        while (i12 < length) {
            int b11 = C5539b.b(str2.charAt(i12), i11);
            if (b11 < 0) {
                return null;
            }
            if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
                if (j11 == 512409557603043100L) {
                    j11 = C.a(-1, b10);
                    if (Long.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long b12 = C6508G.b(j10 * b10);
            long b13 = C6508G.b(C6508G.b(((long) C6506E.b(b11)) & 4294967295L) + b12);
            if (Long.compare(b13 ^ Long.MIN_VALUE, b12 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            j10 = b13;
        }
        return C6508G.a(j10);
    }

    public static final short j(String str) {
        C6496s.h(str, "<this>");
        C6511J k10 = k(str);
        if (k10 != null) {
            return k10.i();
        }
        x.l(str);
        throw new C6527k();
    }

    public static final C6511J k(String str) {
        C6496s.h(str, "<this>");
        return l(str, 10);
    }

    public static final C6511J l(String str, int i10) {
        C6496s.h(str, "<this>");
        C6506E f10 = f(str, i10);
        if (f10 == null) {
            return null;
        }
        int i11 = f10.i();
        if (Integer.compare(i11 ^ Integer.MIN_VALUE, C6506E.b(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return C6511J.a(C6511J.b((short) i11));
    }
}
