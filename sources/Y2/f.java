package y2;

import i2.C2073A;
import i2.L;
import i2.z;
import java.util.ArrayList;
import java.util.zip.Inflater;
import y2.e;

abstract class f {
    public static e a(byte[] bArr, int i10) {
        ArrayList arrayList;
        C2073A a10 = new C2073A(bArr);
        try {
            if (c(a10)) {
                arrayList = f(a10);
            } else {
                arrayList = e(a10);
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

    private static boolean c(C2073A a10) {
        a10.V(4);
        int q10 = a10.q();
        a10.U(0);
        if (q10 == 1886547818) {
            return true;
        }
        return false;
    }

    private static e.a d(C2073A a10) {
        int q10 = a10.q();
        if (q10 > 10000) {
            return null;
        }
        float[] fArr = new float[q10];
        for (int i10 = 0; i10 < q10; i10++) {
            fArr[i10] = a10.p();
        }
        int q11 = a10.q();
        if (q11 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) q10) * 2.0d) / log);
        z zVar = new z(a10.e());
        int i11 = 8;
        zVar.p(a10.f() * 8);
        float[] fArr2 = new float[(q11 * 5)];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < q11) {
            int i15 = 0;
            while (i15 < i12) {
                int b10 = iArr[i15] + b(zVar.h(ceil));
                if (b10 >= q10 || b10 < 0) {
                    return null;
                }
                fArr2[i14] = fArr[b10];
                iArr[i15] = b10;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        zVar.p((zVar.e() + 7) & -8);
        int i16 = 32;
        int h10 = zVar.h(32);
        e.b[] bVarArr = new e.b[h10];
        int i17 = 0;
        while (i17 < h10) {
            int h11 = zVar.h(i11);
            int h12 = zVar.h(i11);
            int h13 = zVar.h(i16);
            if (h13 > 128000) {
                return null;
            }
            int i18 = h11;
            int ceil2 = (int) Math.ceil(Math.log(((double) q11) * d10) / log);
            float[] fArr3 = new float[(h13 * 3)];
            float[] fArr4 = new float[(h13 * 2)];
            int i19 = 0;
            for (int i20 = 0; i20 < h13; i20++) {
                i19 += b(zVar.h(ceil2));
                if (i19 < 0 || i19 >= q11) {
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

    private static ArrayList e(C2073A a10) {
        if (a10.H() != 0) {
            return null;
        }
        a10.V(7);
        int q10 = a10.q();
        if (q10 == 1684433976) {
            C2073A a11 = new C2073A();
            Inflater inflater = new Inflater(true);
            try {
                if (!L.x0(a10, a11, inflater)) {
                    return null;
                }
                inflater.end();
                a10 = a11;
            } finally {
                inflater.end();
            }
        } else if (q10 != 1918990112) {
            return null;
        }
        return g(a10);
    }

    private static ArrayList f(C2073A a10) {
        int q10;
        a10.V(8);
        int f10 = a10.f();
        int g10 = a10.g();
        while (f10 < g10 && (q10 = a10.q() + f10) > f10 && q10 <= g10) {
            int q11 = a10.q();
            if (q11 == 2037673328 || q11 == 1836279920) {
                a10.T(q10);
                return e(a10);
            }
            a10.U(q10);
            f10 = q10;
        }
        return null;
    }

    private static ArrayList g(C2073A a10) {
        ArrayList arrayList = new ArrayList();
        int f10 = a10.f();
        int g10 = a10.g();
        while (f10 < g10) {
            int q10 = a10.q() + f10;
            if (q10 <= f10 || q10 > g10) {
                return null;
            }
            if (a10.q() == 1835365224) {
                e.a d10 = d(a10);
                if (d10 == null) {
                    return null;
                }
                arrayList.add(d10);
            }
            a10.U(q10);
            f10 = q10;
        }
        return arrayList;
    }
}
