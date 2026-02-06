package Ea;

import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4535q;

/* renamed from: Ea.b  reason: case insensitive filesystem */
public abstract class C4279b {
    public static boolean a(int[] iArr, int i10) {
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Object[] objArr, Object obj) {
        int i10;
        if (objArr != null) {
            i10 = objArr.length;
        } else {
            i10 = 0;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            } else if (!C4535q.b(objArr[i11], obj)) {
                i11++;
            } else if (i11 >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void c(StringBuilder sb2, double[] dArr) {
        int length = dArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(dArr[i10]);
        }
    }

    public static void d(StringBuilder sb2, float[] fArr) {
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(fArr[i10]);
        }
    }

    public static void e(StringBuilder sb2, int[] iArr) {
        int length = iArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(iArr[i10]);
        }
    }

    public static void f(StringBuilder sb2, long[] jArr) {
        int length = jArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(jArr[i10]);
        }
    }

    public static void g(StringBuilder sb2, Object[] objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(objArr[i10]);
        }
    }

    public static void h(StringBuilder sb2, boolean[] zArr) {
        int length = zArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append(zArr[i10]);
        }
    }

    public static void i(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(f.f37529a);
            }
            sb2.append("\"");
            sb2.append(strArr[i10]);
            sb2.append("\"");
        }
    }
}
