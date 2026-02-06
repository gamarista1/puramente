package la;

import ja.A;
import ja.B;
import ja.M;
import java.util.ArrayList;
import java.util.zip.Inflater;
import la.e;

abstract class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList arrayList;
        B b10 = new B(bArr);
        try {
            if (c(b10)) {
                arrayList = f(b10);
            } else {
                arrayList = e(b10);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e((e.a) arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new e((e.a) arrayList.get(0), (e.a) arrayList.get(1), i10);
    }

    private static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static boolean c(B b10) {
        b10.Q(4);
        int n10 = b10.n();
        b10.P(0);
        if (n10 == 1886547818) {
            return true;
        }
        return false;
    }

    private static e.a d(B b10) {
        int n10 = b10.n();
        if (n10 > 10000) {
            return null;
        }
        float[] fArr = new float[n10];
        for (int i10 = 0; i10 < n10; i10++) {
            fArr[i10] = b10.m();
        }
        int n11 = b10.n();
        if (n11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) n10) * 2.0d) / log);
        A a10 = new A(b10.d());
        int i11 = 8;
        a10.p(b10.e() * 8);
        float[] fArr2 = new float[(n11 * 5)];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < n11) {
            int i15 = 0;
            while (i15 < i12) {
                int b11 = iArr[i15] + b(a10.h(ceil));
                if (b11 >= n10 || b11 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b11];
                iArr[i15] = b11;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        a10.p((a10.e() + 7) & -8);
        int i16 = 32;
        int h10 = a10.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = a10.h(i11);
            int h12 = a10.h(i11);
            int h13 = a10.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int i18 = h11;
            int ceil2 = (int) Math.ceil(Math.log(((double) n11) * d10) / log);
            float[] fArr3 = new float[(h13 * 3)];
            float[] fArr4 = new float[(h13 * 2)];
            int i19 = 0;
            for (int i20 = 0; i20 < h13; i20++) {
                i19 += b(a10.h(ceil2));
                if (i19 < 0 || i19 >= n11) {
                    return null;
                }
                int i21 = i20 * 3;
                int i22 = i19 * 5;
                fArr3[i21] = fArr2[i22];
                fArr3[i21 + 1] = fArr2[i22 + 1];
                fArr3[i21 + 2] = fArr2[i22 + 2];
                int i23 = i20 * 2;
                fArr4[i23] = fArr2[i22 + 3];
                fArr4[i23 + 1] = fArr2[i22 + 4];
            }
            bVarArr[i17] = new e.b(i18, fArr3, fArr4, h12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new e.a(bVarArr);
    }

    private static ArrayList e(B b10) {
        if (b10.D() != 0) {
            return null;
        }
        b10.Q(7);
        int n10 = b10.n();
        if (n10 == 1684433976) {
            B b11 = new B();
            Inflater inflater = new Inflater(true);
            try {
                if (!M.s0(b10, b11, inflater)) {
                    return null;
                }
                inflater.end();
                b10 = b11;
            } finally {
                inflater.end();
            }
        } else if (n10 != 1918990112) {
            return null;
        }
        return g(b10);
    }

    private static ArrayList f(B b10) {
        int n10;
        b10.Q(8);
        int e10 = b10.e();
        int f10 = b10.f();
        while (e10 < f10 && (n10 = b10.n() + e10) > e10 && n10 <= f10) {
            int n11 = b10.n();
            if (n11 == 2037673328 || n11 == 1836279920) {
                b10.O(n10);
                return e(b10);
            }
            b10.P(n10);
            e10 = n10;
        }
        return null;
    }

    private static ArrayList g(B b10) {
        ArrayList arrayList = new ArrayList();
        int e10 = b10.e();
        int f10 = b10.f();
        while (e10 < f10) {
            int n10 = b10.n() + e10;
            if (n10 <= e10 || n10 > f10) {
                return null;
            }
            if (b10.n() == 1835365224) {
                e.a d10 = d(b10);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            b10.P(n10);
            e10 = n10;
        }
        return arrayList;
    }
}
