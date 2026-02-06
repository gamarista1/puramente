package lf;

import Sg.C5538a;
import kotlin.jvm.internal.C6496s;

/* renamed from: lf.O  reason: case insensitive filesystem */
public abstract class C6516O {
    public static final int a(int i10, int i11) {
        return C6496s.i(i10 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j10, long j11) {
        return C6496s.j(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    public static final double c(long j10) {
        return (((double) (j10 >>> 11)) * ((double) 2048)) + ((double) (j10 & 2047));
    }

    public static final String d(long j10, int i10) {
        if (j10 >= 0) {
            String l10 = Long.toString(j10, C5538a.a(i10));
            C6496s.g(l10, "toString(...)");
            return l10;
        }
        long j11 = (long) i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l11 = Long.toString(j12, C5538a.a(i10));
        C6496s.g(l11, "toString(...)");
        sb2.append(l11);
        String l12 = Long.toString(j13, C5538a.a(i10));
        C6496s.g(l12, "toString(...)");
        sb2.append(l12);
        return sb2.toString();
    }
}
