package Ef;

import Cf.c;
import Cf.d;
import Ef.g;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C6496s;

abstract class o extends n {
    public static float c(float f10, float f11) {
        if (f10 < f11) {
            return f11;
        }
        return f10;
    }

    public static int d(int i10, int i11) {
        if (i10 < i11) {
            return i11;
        }
        return i10;
    }

    public static long e(long j10, long j11) {
        if (j10 < j11) {
            return j11;
        }
        return j10;
    }

    public static double f(double d10, double d11) {
        if (d10 > d11) {
            return d11;
        }
        return d10;
    }

    public static float g(float f10, float f11) {
        if (f10 > f11) {
            return f11;
        }
        return f10;
    }

    public static int h(int i10, int i11) {
        if (i10 > i11) {
            return i11;
        }
        return i10;
    }

    public static long i(long j10, long j11) {
        if (j10 > j11) {
            return j11;
        }
        return j10;
    }

    public static double j(double d10, double d11, double d12) {
        if (d11 > d12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
        } else if (d10 < d11) {
            return d11;
        } else {
            if (d10 > d12) {
                return d12;
            }
            return d10;
        }
    }

    public static float k(float f10, float f11, float f12) {
        if (f11 > f12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f12 + " is less than minimum " + f11 + '.');
        } else if (f10 < f11) {
            return f11;
        } else {
            if (f10 > f12) {
                return f12;
            }
            return f10;
        }
    }

    public static int l(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
        } else if (i10 < i11) {
            return i11;
        } else {
            if (i10 > i12) {
                return i12;
            }
            return i10;
        }
    }

    public static long m(long j10, long j11, long j12) {
        if (j11 > j12) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
        } else if (j10 < j11) {
            return j11;
        } else {
            if (j10 > j12) {
                return j12;
            }
            return j10;
        }
    }

    public static long n(long j10, f fVar) {
        C6496s.h(fVar, "range");
        if (fVar instanceof e) {
            return ((Number) m.o(Long.valueOf(j10), (e) fVar)).longValue();
        }
        if (fVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + fVar + '.');
        } else if (j10 < ((Number) fVar.a()).longValue()) {
            return ((Number) fVar.a()).longValue();
        } else {
            if (j10 > ((Number) fVar.g()).longValue()) {
                return ((Number) fVar.g()).longValue();
            }
            return j10;
        }
    }

    public static Comparable o(Comparable comparable, e eVar) {
        C6496s.h(comparable, "<this>");
        C6496s.h(eVar, "range");
        if (eVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + eVar + '.');
        } else if (eVar.b(comparable, eVar.a()) && !eVar.b(eVar.a(), comparable)) {
            return eVar.a();
        } else {
            if (!eVar.b(eVar.g(), comparable) || eVar.b(comparable, eVar.g())) {
                return comparable;
            }
            return eVar.g();
        }
    }

    public static g p(int i10, int i11) {
        return g.f62817d.a(i10, i11, -1);
    }

    public static int q(i iVar, c cVar) {
        C6496s.h(iVar, "<this>");
        C6496s.h(cVar, "random");
        try {
            return d.e(cVar, iVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static long r(l lVar, c cVar) {
        C6496s.h(lVar, "<this>");
        C6496s.h(cVar, "random");
        try {
            return d.f(cVar, lVar);
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public static g s(g gVar) {
        C6496s.h(gVar, "<this>");
        return g.f62817d.a(gVar.n(), gVar.k(), -gVar.r());
    }

    public static g t(g gVar, int i10) {
        boolean z10;
        C6496s.h(gVar, "<this>");
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        n.a(z10, Integer.valueOf(i10));
        g.a aVar = g.f62817d;
        int k10 = gVar.k();
        int n10 = gVar.n();
        if (gVar.r() <= 0) {
            i10 = -i10;
        }
        return aVar.a(k10, n10, i10);
    }

    public static i u(int i10, int i11) {
        if (i11 <= Integer.MIN_VALUE) {
            return i.f62825e.a();
        }
        return new i(i10, i11 - 1);
    }
}
