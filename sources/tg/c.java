package Tg;

import Ef.i;
import Ef.m;
import Sg.p;
import Tg.a;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.L;

public abstract class c {
    /* access modifiers changed from: private */
    public static final long i(long j10, int i10) {
        return a.l((j10 << 1) + ((long) i10));
    }

    /* access modifiers changed from: private */
    public static final long j(long j10) {
        return a.l((j10 << 1) + 1);
    }

    /* access modifiers changed from: private */
    public static final long k(long j10) {
        if (-4611686018426L > j10 || j10 >= 4611686018427L) {
            return j(m.m(j10, -4611686018427387903L, 4611686018427387903L));
        }
        return l(n(j10));
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        return a.l(j10 << 1);
    }

    /* access modifiers changed from: private */
    public static final long m(long j10) {
        if (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) {
            return j(o(j10));
        }
        return l(j10);
    }

    /* access modifiers changed from: private */
    public static final long n(long j10) {
        return j10 * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* access modifiers changed from: private */
    public static final long o(long j10) {
        return j10 / ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    /* access modifiers changed from: private */
    public static final long p(String str, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        long j10;
        long j11;
        int i11;
        String str2 = str;
        int length = str.length();
        if (length != 0) {
            a.C0955a aVar = a.f65168b;
            long b10 = aVar.b();
            char charAt = str2.charAt(0);
            boolean z13 = true;
            if (charAt == '+' || charAt == '-') {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 || !p.M0(str2, '-', false, 2, (Object) null)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (length > i10) {
                char c10 = ':';
                String str3 = "No components";
                char c11 = '0';
                if (str2.charAt(i10) == 'P') {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        d dVar = null;
                        boolean z14 = false;
                        while (i12 < length) {
                            if (str2.charAt(i12) != 'T') {
                                int i13 = i12;
                                while (true) {
                                    if (i13 >= str.length()) {
                                        break;
                                    }
                                    char charAt2 = str2.charAt(i13);
                                    if (c11 > charAt2 || charAt2 >= c10) {
                                        if (!p.N("+-.", charAt2, false, 2, (Object) null)) {
                                            break;
                                        }
                                    }
                                    i13++;
                                    c10 = ':';
                                    c11 = '0';
                                }
                                C6496s.f(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring = str2.substring(i12, i13);
                                C6496s.g(substring, "substring(...)");
                                if (substring.length() != 0) {
                                    int length2 = i12 + substring.length();
                                    if (length2 < 0 || length2 >= str.length()) {
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                    char charAt3 = str2.charAt(length2);
                                    int i14 = length2 + 1;
                                    d d10 = f.d(charAt3, z14);
                                    if (dVar == null || dVar.compareTo(d10) > 0) {
                                        int a02 = p.a0(substring, '.', 0, false, 6, (Object) null);
                                        if (d10 != d.SECONDS || a02 <= 0) {
                                            i11 = i14;
                                            b10 = a.O(b10, t(q(substring), d10));
                                        } else {
                                            C6496s.f(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring2 = substring.substring(0, a02);
                                            C6496s.g(substring2, "substring(...)");
                                            i11 = i14;
                                            long O10 = a.O(b10, t(q(substring2), d10));
                                            C6496s.f(substring, "null cannot be cast to non-null type java.lang.String");
                                            String substring3 = substring.substring(a02);
                                            C6496s.g(substring3, "substring(...)");
                                            b10 = a.O(O10, r(Double.parseDouble(substring3), d10));
                                        }
                                        i12 = i11;
                                        dVar = d10;
                                        c10 = ':';
                                        c11 = '0';
                                        z13 = true;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected order of duration components");
                                    }
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else if (z14 || (i12 = i12 + 1) == length) {
                                throw new IllegalArgumentException();
                            } else {
                                z14 = z13;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else if (!z10) {
                    String str4 = "substring(...)";
                    String str5 = "Unexpected order of duration components";
                    long j12 = b10;
                    String str6 = str3;
                    if (p.y(str, i10, "Infinity", 0, Math.max(length - i10, 8), true)) {
                        b10 = aVar.a();
                    } else {
                        boolean z15 = !z11;
                        if (z11 && str2.charAt(i10) == '(' && p.k1(str) == ')') {
                            i10++;
                            length--;
                            if (i10 != length) {
                                j10 = j12;
                                z15 = true;
                            } else {
                                throw new IllegalArgumentException(str6);
                            }
                        } else {
                            j10 = j12;
                        }
                        d dVar2 = null;
                        boolean z16 = false;
                        while (i10 < length) {
                            if (z16 && z15) {
                                while (i10 < str.length() && str2.charAt(i10) == ' ') {
                                    i10++;
                                }
                            }
                            int i15 = i10;
                            while (true) {
                                if (i15 >= str.length()) {
                                    break;
                                }
                                char charAt4 = str2.charAt(i15);
                                if (('0' > charAt4 || charAt4 >= ':') && charAt4 != '.') {
                                    break;
                                }
                                i15++;
                            }
                            C6496s.f(str2, "null cannot be cast to non-null type java.lang.String");
                            String substring4 = str2.substring(i10, i15);
                            C6496s.g(substring4, str4);
                            if (substring4.length() != 0) {
                                int length3 = i10 + substring4.length();
                                int i16 = length3;
                                while (i16 < str.length() && 'a' <= (r9 = str2.charAt(i16)) && r9 < '{') {
                                    i16++;
                                }
                                C6496s.f(str2, "null cannot be cast to non-null type java.lang.String");
                                String substring5 = str2.substring(length3, i16);
                                C6496s.g(substring5, str4);
                                int length4 = length3 + substring5.length();
                                d e10 = f.e(substring5);
                                if (dVar2 == null || dVar2.compareTo(e10) > 0) {
                                    String str7 = str5;
                                    int a03 = p.a0(substring4, '.', 0, false, 6, (Object) null);
                                    if (a03 > 0) {
                                        C6496s.f(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring6 = substring4.substring(0, a03);
                                        C6496s.g(substring6, str4);
                                        long O11 = a.O(j11, t(Long.parseLong(substring6), e10));
                                        C6496s.f(substring4, "null cannot be cast to non-null type java.lang.String");
                                        String substring7 = substring4.substring(a03);
                                        C6496s.g(substring7, str4);
                                        j11 = a.O(O11, r(Double.parseDouble(substring7), e10));
                                        length4 = length4;
                                        if (length4 < length) {
                                            throw new IllegalArgumentException("Fractional component must be last");
                                        }
                                    } else {
                                        j11 = a.O(j11, t(Long.parseLong(substring4), e10));
                                    }
                                    str5 = str7;
                                    dVar2 = e10;
                                    z16 = true;
                                } else {
                                    throw new IllegalArgumentException(str5);
                                }
                            } else {
                                throw new IllegalArgumentException();
                            }
                        }
                        b10 = j11;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
                if (z12) {
                    return a.W(b10);
                }
                return b10;
            }
            throw new IllegalArgumentException("No components");
        }
        throw new IllegalArgumentException("The string is empty");
    }

    private static final long q(String str) {
        int i10;
        int length = str.length();
        if (length <= 0 || !p.N("+-", str.charAt(0), false, 2, (Object) null)) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        if (length - i10 > 16) {
            i iVar = new i(i10, p.V(str));
            if (!(iVar instanceof Collection) || !((Collection) iVar).isEmpty()) {
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    char charAt = str.charAt(((L) it).a());
                    if ('0' <= charAt) {
                        if (charAt >= ':') {
                        }
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
        if (p.J(str, "+", false, 2, (Object) null)) {
            str = p.h1(str, 1);
        }
        return Long.parseLong(str);
    }

    public static final long r(double d10, d dVar) {
        C6496s.h(dVar, "unit");
        double a10 = e.a(d10, dVar, d.NANOSECONDS);
        if (!Double.isNaN(a10)) {
            long e10 = Af.a.e(a10);
            if (-4611686018426999999L > e10 || e10 >= 4611686018427000000L) {
                return k(Af.a.e(e.a(d10, dVar, d.MILLISECONDS)));
            }
            return l(e10);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.");
    }

    public static final long s(int i10, d dVar) {
        C6496s.h(dVar, "unit");
        if (dVar.compareTo(d.SECONDS) <= 0) {
            return l(e.c((long) i10, dVar, d.NANOSECONDS));
        }
        return t((long) i10, dVar);
    }

    public static final long t(long j10, d dVar) {
        C6496s.h(dVar, "unit");
        d dVar2 = d.NANOSECONDS;
        long c10 = e.c(4611686018426999999L, dVar2, dVar);
        if ((-c10) > j10 || j10 > c10) {
            return j(m.m(e.b(j10, dVar, d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
        }
        return l(e.c(j10, dVar, dVar2));
    }
}
