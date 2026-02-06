package r0;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
import mf.C6565s;
import q0.C2421g;

/* renamed from: r0.Z  reason: case insensitive filesystem */
public abstract class C2473Z {
    public static final Shader a(long j10, long j11, List list, List list2, int i10) {
        List list3 = list;
        f(list, list2);
        int c10 = c(list);
        return new LinearGradient(C2421g.m(j10), C2421g.n(j10), C2421g.m(j11), C2421g.n(j11), d(list, c10), e(list2, list, c10), C2475a0.a(i10));
    }

    public static final Shader b(long j10, float f10, List list, List list2, int i10) {
        f(list, list2);
        int c10 = c(list);
        return new RadialGradient(C2421g.m(j10), C2421g.n(j10), f10, d(list, c10), e(list2, list, c10), C2475a0.a(i10));
    }

    public static final int c(List list) {
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int p10 = C6565s.p(list);
        for (int i11 = 1; i11 < p10; i11++) {
            if (C2544x0.r(((C2544x0) list.get(i11)).y()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] d(List list, int i10) {
        int i11;
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = C2550z0.k(((C2544x0) list.get(i12)).y());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[(list.size() + i10)];
        int p10 = C6565s.p(list);
        int size2 = list.size();
        int i13 = 0;
        while (i12 < size2) {
            long y10 = ((C2544x0) list.get(i12)).y();
            if (C2544x0.r(y10) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = C2550z0.k(C2544x0.o(((C2544x0) list.get(1)).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else if (i12 == p10) {
                    i11 = i13 + 1;
                    iArr2[i13] = C2550z0.k(C2544x0.o(((C2544x0) list.get(i12 - 1)).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = C2550z0.k(C2544x0.o(((C2544x0) list.get(i12 - 1)).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    i13 += 2;
                    iArr2[i14] = C2550z0.k(C2544x0.o(((C2544x0) list.get(i12 + 1)).y(), 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = C2550z0.k(y10);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] e(List list, List list2, int i10) {
        float f10;
        float f11;
        float f12;
        if (i10 != 0) {
            float[] fArr = new float[(list2.size() + i10)];
            if (list != null) {
                f10 = ((Number) list.get(0)).floatValue();
            } else {
                f10 = 0.0f;
            }
            fArr[0] = f10;
            int p10 = C6565s.p(list2);
            int i11 = 1;
            for (int i12 = 1; i12 < p10; i12++) {
                long y10 = ((C2544x0) list2.get(i12)).y();
                if (list != null) {
                    f12 = ((Number) list.get(i12)).floatValue();
                } else {
                    f12 = ((float) i12) / ((float) C6565s.p(list2));
                }
                int i13 = i11 + 1;
                fArr[i11] = f12;
                if (C2544x0.r(y10) == 0.0f) {
                    i11 += 2;
                    fArr[i13] = f12;
                } else {
                    i11 = i13;
                }
            }
            if (list != null) {
                f11 = ((Number) list.get(C6565s.p(list2))).floatValue();
            } else {
                f11 = 1.0f;
            }
            fArr[i11] = f11;
            return fArr;
        } else if (list != null) {
            return C6565s.b1(list);
        } else {
            return null;
        }
    }

    private static final void f(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
