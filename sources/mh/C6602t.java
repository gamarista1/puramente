package mh;

import Sg.C;

/* renamed from: mh.t  reason: case insensitive filesystem */
public abstract /* synthetic */ class C6602t {
    public static /* synthetic */ String a(long j10, int i10) {
        long j11;
        int i11 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i11 == 0) {
            return "0";
        }
        if (i11 > 0) {
            return Long.toString(j10, i10);
        }
        if (i10 < 2 || i10 > 36) {
            i10 = 10;
        }
        int i12 = 64;
        char[] cArr = new char[64];
        int i13 = i10 - 1;
        if ((i10 & i13) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
            do {
                i12--;
                cArr[i12] = Character.forDigit(((int) j10) & i13, i10);
                j10 >>>= numberOfTrailingZeros;
            } while (j10 != 0);
        } else {
            if ((i10 & 1) == 0) {
                j11 = (j10 >>> 1) / ((long) (i10 >>> 1));
            } else {
                j11 = C.a(j10, (long) i10);
            }
            long j12 = (long) i10;
            cArr[63] = Character.forDigit((int) (j10 - (j11 * j12)), i10);
            i12 = 63;
            while (j11 > 0) {
                i12--;
                cArr[i12] = Character.forDigit((int) (j11 % j12), i10);
                j11 /= j12;
            }
        }
        return new String(cArr, i12, 64 - i12);
    }
}
