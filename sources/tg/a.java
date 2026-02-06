package Tg;

import Ef.l;
import Ef.m;
import Sg.p;
import com.revenuecat.purchases.common.UtilsKt;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class a implements Comparable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0955a f65168b = new C0955a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final long f65169c = l(0);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final long f65170d = c.j(4611686018427387903L);

    /* renamed from: e  reason: collision with root package name */
    private static final long f65171e = c.j(-4611686018427387903L);

    /* renamed from: a  reason: collision with root package name */
    private final long f65172a;

    /* renamed from: Tg.a$a  reason: collision with other inner class name */
    public static final class C0955a {
        public /* synthetic */ C0955a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f65170d;
        }

        public final long b() {
            return a.f65169c;
        }

        public final long c(String str) {
            C6496s.h(str, "value");
            try {
                return c.p(str, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e10);
            }
        }

        private C0955a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f65172a = j10;
    }

    public static final int A(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (x(j10) % ((long) 60));
    }

    private static final d C(long j10) {
        if (H(j10)) {
            return d.NANOSECONDS;
        }
        return d.MILLISECONDS;
    }

    private static final long D(long j10) {
        return j10 >> 1;
    }

    public static int E(long j10) {
        return Long.hashCode(j10);
    }

    public static final boolean F(long j10) {
        return !I(j10);
    }

    private static final boolean G(long j10) {
        if ((((int) j10) & 1) == 1) {
            return true;
        }
        return false;
    }

    private static final boolean H(long j10) {
        if ((((int) j10) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean I(long j10) {
        if (j10 == f65170d || j10 == f65171e) {
            return true;
        }
        return false;
    }

    public static final boolean J(long j10) {
        if (j10 < 0) {
            return true;
        }
        return false;
    }

    public static final boolean N(long j10) {
        if (j10 > 0) {
            return true;
        }
        return false;
    }

    public static final long O(long j10, long j11) {
        if (I(j10)) {
            if (F(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        } else if (I(j11)) {
            return j11;
        } else {
            if ((((int) j10) & 1) == (((int) j11) & 1)) {
                long D10 = D(j10) + D(j11);
                if (H(j10)) {
                    return c.m(D10);
                }
                return c.k(D10);
            } else if (G(j10)) {
                return c(j10, D(j10), D(j11));
            } else {
                return c(j10, D(j11), D(j10));
            }
        }
    }

    public static final long P(long j10, int i10) {
        if (I(j10)) {
            if (i10 == 0) {
                throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
            } else if (i10 > 0) {
                return j10;
            } else {
                return W(j10);
            }
        } else if (i10 == 0) {
            return f65169c;
        } else {
            long D10 = D(j10);
            long j11 = (long) i10;
            long j12 = D10 * j11;
            if (H(j10)) {
                if (-2147483647L <= D10 && D10 < 2147483648L) {
                    return c.l(j12);
                }
                if (j12 / j11 == D10) {
                    return c.m(j12);
                }
                long g10 = c.o(D10);
                long j13 = g10 * j11;
                long g11 = c.o((D10 - c.n(g10)) * j11) + j13;
                if (j13 / j11 == g10 && (g11 ^ j13) >= 0) {
                    return c.j(m.n(g11, new l(-4611686018427387903L, 4611686018427387903L)));
                }
                if (Af.a.b(D10) * Af.a.a(i10) > 0) {
                    return f65170d;
                }
                return f65171e;
            } else if (j12 / j11 == D10) {
                return c.j(m.n(j12, new l(-4611686018427387903L, 4611686018427387903L)));
            } else {
                if (Af.a.b(D10) * Af.a.a(i10) > 0) {
                    return f65170d;
                }
                return f65171e;
            }
        }
    }

    public static final double Q(long j10, d dVar) {
        C6496s.h(dVar, "unit");
        if (j10 == f65170d) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f65171e) {
            return Double.NEGATIVE_INFINITY;
        }
        return e.a((double) D(j10), C(j10), dVar);
    }

    public static final String R(long j10) {
        boolean z10;
        boolean z11;
        StringBuilder sb2 = new StringBuilder();
        if (J(j10)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long o10 = o(j10);
        long s10 = s(o10);
        int y10 = y(o10);
        int A10 = A(o10);
        int z12 = z(o10);
        if (I(j10)) {
            s10 = 9999999999999L;
        }
        boolean z13 = false;
        if (s10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A10 == 0 && z12 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (y10 != 0 || (z11 && z10)) {
            z13 = true;
        }
        if (z10) {
            sb2.append(s10);
            sb2.append('H');
        }
        if (z13) {
            sb2.append(y10);
            sb2.append('M');
        }
        if (z11 || (!z10 && !z13)) {
            e(j10, sb2, A10, z12, 9, "S", true);
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final long S(long j10, d dVar) {
        C6496s.h(dVar, "unit");
        if (j10 == f65170d) {
            return Long.MAX_VALUE;
        }
        if (j10 == f65171e) {
            return Long.MIN_VALUE;
        }
        return e.b(D(j10), C(j10), dVar);
    }

    public static String T(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f65170d) {
            return "Infinity";
        }
        if (j10 == f65171e) {
            return "-Infinity";
        }
        boolean J10 = J(j10);
        StringBuilder sb2 = new StringBuilder();
        if (J10) {
            sb2.append('-');
        }
        long o10 = o(j10);
        long r10 = r(o10);
        int p10 = p(o10);
        int y10 = y(o10);
        int A10 = A(o10);
        int z14 = z(o10);
        int i10 = 0;
        if (r10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (p10 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (y10 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (A10 == 0 && z14 == 0) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (z10) {
            sb2.append(r10);
            sb2.append('d');
            i10 = 1;
        }
        if (z11 || (z10 && (z12 || z13))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(p10);
            sb2.append('h');
            i10 = i11;
        }
        if (z12 || (z13 && (z11 || z10))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            sb2.append(y10);
            sb2.append('m');
            i10 = i12;
        }
        if (z13) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb2.append(' ');
            }
            if (A10 != 0 || z10 || z11 || z12) {
                e(j10, sb2, A10, z14, 9, "s", false);
            } else if (z14 >= 1000000) {
                e(j10, sb2, z14 / UtilsKt.MICROS_MULTIPLIER, z14 % UtilsKt.MICROS_MULTIPLIER, 6, "ms", false);
            } else if (z14 >= 1000) {
                e(j10, sb2, z14 / 1000, z14 % 1000, 3, "us", false);
            } else {
                sb2.append(z14);
                sb2.append("ns");
            }
            i10 = i13;
        }
        if (J10 && i10 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }

    public static final long W(long j10) {
        return c.i(-D(j10), ((int) j10) & 1);
    }

    private static final long c(long j10, long j11, long j12) {
        long g10 = c.o(j12);
        long j13 = j11 + g10;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return c.j(m.m(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return c.l(c.n(j13) + (j12 - c.n(g10)));
    }

    private static final void e(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String p02 = p.p0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = p02.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (p02.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append(p02, 0, ((i13 + 3) / 3) * 3);
                C6496s.g(sb2, "append(...)");
            } else {
                sb2.append(p02, 0, i15);
                C6496s.g(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    public static final /* synthetic */ a f(long j10) {
        return new a(j10);
    }

    public static int j(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return C6496s.j(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        if (J(j10)) {
            return -i10;
        }
        return i10;
    }

    public static long l(long j10) {
        if (b.a()) {
            if (H(j10)) {
                long D10 = D(j10);
                if (-4611686018426999999L > D10 || D10 >= 4611686018427000000L) {
                    throw new AssertionError(D(j10) + " ns is out of nanoseconds range");
                }
            } else {
                long D11 = D(j10);
                if (-4611686018427387903L > D11 || D11 >= 4611686018427387904L) {
                    throw new AssertionError(D(j10) + " ms is out of milliseconds range");
                }
                long D12 = D(j10);
                if (-4611686018426L <= D12 && D12 < 4611686018427L) {
                    throw new AssertionError(D(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    public static boolean m(long j10, Object obj) {
        if ((obj instanceof a) && j10 == ((a) obj).X()) {
            return true;
        }
        return false;
    }

    public static final long o(long j10) {
        if (J(j10)) {
            return W(j10);
        }
        return j10;
    }

    public static final int p(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (s(j10) % ((long) 24));
    }

    public static final long r(long j10) {
        return S(j10, d.DAYS);
    }

    public static final long s(long j10) {
        return S(j10, d.HOURS);
    }

    public static final long t(long j10) {
        if (!G(j10) || !F(j10)) {
            return S(j10, d.MILLISECONDS);
        }
        return D(j10);
    }

    public static final long u(long j10) {
        return S(j10, d.MINUTES);
    }

    public static final long x(long j10) {
        return S(j10, d.SECONDS);
    }

    public static final int y(long j10) {
        if (I(j10)) {
            return 0;
        }
        return (int) (u(j10) % ((long) 60));
    }

    public static final int z(long j10) {
        long D10;
        if (I(j10)) {
            return 0;
        }
        if (G(j10)) {
            D10 = c.n(D(j10) % ((long) 1000));
        } else {
            D10 = D(j10) % ((long) 1000000000);
        }
        return (int) D10;
    }

    public final /* synthetic */ long X() {
        return this.f65172a;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return i(((a) obj).X());
    }

    public boolean equals(Object obj) {
        return m(this.f65172a, obj);
    }

    public int hashCode() {
        return E(this.f65172a);
    }

    public int i(long j10) {
        return j(this.f65172a, j10);
    }

    public String toString() {
        return T(this.f65172a);
    }
}
