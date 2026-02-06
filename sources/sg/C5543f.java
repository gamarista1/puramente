package Sg;

import Sg.C5544g;
import kotlin.jvm.internal.C6496s;
import lf.C6508G;
import mf.C6550c;

/* renamed from: Sg.f  reason: case insensitive filesystem */
public abstract class C5543f {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f65047a;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f65048b;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f65049c;

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f65050d;

    static {
        int[] iArr = new int[256];
        int i10 = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = "0123456789abcdef".charAt(i11 & 15) | ("0123456789abcdef".charAt(i11 >> 4) << 8);
        }
        f65047a = iArr;
        int[] iArr2 = new int[256];
        for (int i12 = 0; i12 < 256; i12++) {
            iArr2[i12] = "0123456789ABCDEF".charAt(i12 & 15) | ("0123456789ABCDEF".charAt(i12 >> 4) << 8);
        }
        f65048b = iArr2;
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13++) {
            iArr3[i13] = -1;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i14)] = i15;
            i14++;
            i15++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i16)] = i17;
            i16++;
            i17++;
        }
        f65049c = iArr3;
        long[] jArr = new long[256];
        for (int i18 = 0; i18 < 256; i18++) {
            jArr[i18] = -1;
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i19)] = (long) i20;
            i19++;
            i20++;
        }
        int i21 = 0;
        while (i10 < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i10)] = (long) i21;
            i10++;
            i21++;
        }
        f65050d = jArr;
    }

    private static final int a(long j10) {
        if (0 <= j10 && j10 <= 2147483647L) {
            return (int) j10;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + C6508G.i(C6508G.b(j10)));
    }

    private static final int b(byte[] bArr, int i10, String str, String str2, int[] iArr, char[] cArr, int i11) {
        return f(str2, cArr, c(bArr, i10, iArr, cArr, f(str, cArr, i11)));
    }

    private static final int c(byte[] bArr, int i10, int[] iArr, char[] cArr, int i11) {
        int i12 = iArr[bArr[i10] & 255];
        cArr[i11] = (char) (i12 >> 8);
        cArr[i11 + 1] = (char) (i12 & 255);
        return i11 + 2;
    }

    private static final int d(int i10, int i11, int i12, int i13) {
        if (i10 > 0) {
            long j10 = (long) i11;
            return a((((long) i10) * (((((long) i12) + 2) + ((long) i13)) + j10)) - j10);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i10 > 0) {
            int i17 = i10 - 1;
            int i18 = i17 / i11;
            int i19 = (i11 - 1) / i12;
            int i20 = i10 % i11;
            if (i20 != 0) {
                i11 = i20;
            }
            int i21 = (i19 * i18) + ((i11 - 1) / i12);
            return a(((long) i18) + (((long) i21) * ((long) i13)) + (((long) ((i17 - i18) - i21)) * ((long) i14)) + (((long) i10) * (((long) i15) + 2 + ((long) i16))));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final int f(String str, char[] cArr, int i10) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                C6496s.f(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i10);
            } else {
                cArr[i10] = str.charAt(0);
            }
        }
        return i10 + str.length();
    }

    public static final String g(byte[] bArr, int i10, int i11, C5544g gVar) {
        int[] iArr;
        C6496s.h(bArr, "<this>");
        C6496s.h(gVar, "format");
        C6550c.f72053a.a(i10, i11, bArr.length);
        if (i10 == i11) {
            return "";
        }
        if (gVar.c()) {
            iArr = f65048b;
        } else {
            iArr = f65047a;
        }
        C5544g.a b10 = gVar.b();
        if (b10.i()) {
            return j(bArr, i10, i11, b10, iArr);
        }
        return m(bArr, i10, i11, b10, iArr);
    }

    public static final String h(byte[] bArr, C5544g gVar) {
        C6496s.h(bArr, "<this>");
        C6496s.h(gVar, "format");
        return g(bArr, 0, bArr.length, gVar);
    }

    public static /* synthetic */ String i(byte[] bArr, C5544g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = C5544g.f65051d.a();
        }
        return h(bArr, gVar);
    }

    private static final String j(byte[] bArr, int i10, int i11, C5544g.a aVar, int[] iArr) {
        if (aVar.j()) {
            return l(bArr, i10, i11, aVar, iArr);
        }
        return k(bArr, i10, i11, aVar, iArr);
    }

    private static final String k(byte[] bArr, int i10, int i11, C5544g.a aVar, int[] iArr) {
        String c10 = aVar.c();
        String e10 = aVar.e();
        String d10 = aVar.d();
        char[] cArr = new char[d(i11 - i10, d10.length(), c10.length(), e10.length())];
        int b10 = b(bArr, i10, c10, e10, iArr, cArr, 0);
        while (true) {
            i10++;
            if (i10 >= i11) {
                return p.q(cArr);
            }
            b10 = b(bArr, i10, c10, e10, iArr, cArr, f(d10, cArr, b10));
        }
    }

    private static final String l(byte[] bArr, int i10, int i11, C5544g.a aVar, int[] iArr) {
        int length = aVar.d().length();
        if (length <= 1) {
            int i12 = i11 - i10;
            int i13 = 0;
            if (length == 0) {
                char[] cArr = new char[a(((long) i12) * 2)];
                while (i10 < i11) {
                    i13 = c(bArr, i10, iArr, cArr, i13);
                    i10++;
                }
                return p.q(cArr);
            }
            char[] cArr2 = new char[a((((long) i12) * 3) - 1)];
            char charAt = aVar.d().charAt(0);
            int c10 = c(bArr, i10, iArr, cArr2, 0);
            for (int i14 = i10 + 1; i14 < i11; i14++) {
                cArr2[c10] = charAt;
                c10 = c(bArr, i14, iArr, cArr2, c10 + 1);
            }
            return p.q(cArr2);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final String m(byte[] bArr, int i10, int i11, C5544g.a aVar, int[] iArr) {
        int i12;
        int i13;
        int i14 = i11;
        int g10 = aVar.g();
        int f10 = aVar.f();
        String c10 = aVar.c();
        String e10 = aVar.e();
        String d10 = aVar.d();
        String h10 = aVar.h();
        int e11 = e(i14 - i10, g10, f10, h10.length(), d10.length(), c10.length(), e10.length());
        char[] cArr = new char[e11];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = i10; i18 < i14; i18++) {
            if (i16 == g10) {
                cArr[i15] = 10;
                i15++;
                i13 = 0;
                i12 = 0;
            } else if (i17 == f10) {
                i15 = f(h10, cArr, i15);
                i13 = i16;
                i12 = 0;
            } else {
                i13 = i16;
                i12 = i17;
            }
            if (i12 != 0) {
                i15 = f(d10, cArr, i15);
            }
            i15 = b(bArr, i18, c10, e10, iArr, cArr, i15);
            i17 = i12 + 1;
            i16 = i13 + 1;
        }
        if (i15 == e11) {
            return p.q(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }
}
