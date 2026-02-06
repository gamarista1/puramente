package com.google.common.primitives;

import java.util.Arrays;
import nb.o;

public abstract class h {

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final byte[] f56798a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i10 = 0; i10 < 10; i10++) {
                bArr[i10 + 48] = (byte) i10;
            }
            for (int i11 = 0; i11 < 26; i11++) {
                byte b10 = (byte) (i11 + 10);
                bArr[i11 + 65] = b10;
                bArr[i11 + 97] = b10;
            }
            f56798a = bArr;
        }

        static int a(char c10) {
            if (c10 < 128) {
                return f56798a[c10];
            }
            return -1;
        }
    }

    public static int a(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 > 0 ? 1 : 0;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static long c(long... jArr) {
        boolean z10;
        if (jArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.d(z10);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            long j11 = jArr[i10];
            if (j11 > j10) {
                j10 = j11;
            }
        }
        return j10;
    }

    public static Long d(String str, int i10) {
        String str2 = str;
        int i11 = i10;
        if (((String) o.j(str)).isEmpty()) {
            return null;
        }
        if (i11 < 2 || i11 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i11);
        }
        int i12 = 0;
        if (str2.charAt(0) == '-') {
            i12 = 1;
        }
        if (i12 == str.length()) {
            return null;
        }
        int i13 = i12 + 1;
        int a10 = a.a(str2.charAt(i12));
        if (a10 < 0 || a10 >= i11) {
            return null;
        }
        long j10 = (long) (-a10);
        long j11 = (long) i11;
        long j12 = Long.MIN_VALUE / j11;
        while (i13 < str.length()) {
            int i14 = i13 + 1;
            int a11 = a.a(str2.charAt(i13));
            if (a11 < 0 || a11 >= i11 || j10 < j12) {
                return null;
            }
            long j13 = j10 * j11;
            long j14 = (long) a11;
            if (j13 < j14 - Long.MIN_VALUE) {
                return null;
            }
            j10 = j13 - j14;
            i13 = i14;
        }
        if (i12 != 0) {
            return Long.valueOf(j10);
        }
        if (j10 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j10);
    }
}
