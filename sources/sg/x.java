package Sg;

import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

abstract class x extends w {
    public static final Void l(String str) {
        C6496s.h(str, MetricTracker.Object.INPUT);
        throw new NumberFormatException("Invalid number format: '" + str + '\'');
    }

    public static Integer m(String str) {
        C6496s.h(str, "<this>");
        return n(str, 10);
    }

    public static final Integer n(String str, int i10) {
        int i11;
        boolean z10;
        int i12;
        C6496s.h(str, "<this>");
        C5538a.a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        int i14 = -2147483647;
        if (C6496s.i(charAt, 48) < 0) {
            i11 = 1;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
            } else if (charAt != '-') {
                return null;
            } else {
                i14 = Integer.MIN_VALUE;
                z10 = true;
            }
        } else {
            z10 = false;
            i11 = 0;
        }
        int i15 = -59652323;
        while (i11 < length) {
            int b10 = C5539b.b(str.charAt(i11), i10);
            if (b10 < 0) {
                return null;
            }
            if ((i13 < i15 && (i15 != -59652323 || i13 < (i15 = i14 / i10))) || (i12 = i13 * i10) < i14 + b10) {
                return null;
            }
            i13 = i12 - b10;
            i11++;
        }
        if (z10) {
            return Integer.valueOf(i13);
        }
        return Integer.valueOf(-i13);
    }

    public static Long o(String str) {
        C6496s.h(str, "<this>");
        return p.p(str, 10);
    }

    public static Long p(String str, int i10) {
        boolean z10;
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
        long j10 = -9223372036854775807L;
        if (C6496s.i(charAt, 48) < 0) {
            z10 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z10 = false;
                i12 = 1;
            } else if (charAt != '-') {
                return null;
            } else {
                j10 = Long.MIN_VALUE;
                i12 = 1;
            }
        } else {
            z10 = false;
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i12 < length) {
            int b10 = C5539b.b(str2.charAt(i12), i11);
            if (b10 < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / ((long) i11);
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * ((long) i11);
            long j15 = (long) b10;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i12++;
            j11 = -256204778801521550L;
        }
        if (z10) {
            return Long.valueOf(j12);
        }
        return Long.valueOf(-j12);
    }
}
