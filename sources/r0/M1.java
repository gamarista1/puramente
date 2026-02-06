package r0;

import Sg.p;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2419e;
import q0.C2421g;
import q0.C2422h;

public final class M1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f25444b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float[] f25445a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private /* synthetic */ M1(float[] fArr) {
        this.f25445a = fArr;
    }

    public static final /* synthetic */ M1 a(float[] fArr) {
        return new M1(fArr);
    }

    public static /* synthetic */ float[] c(float[] fArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        if ((obj instanceof M1) && C6496s.c(fArr, ((M1) obj).r())) {
            return true;
        }
        return false;
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j10) {
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        float f10 = ((float) 1) / (((fArr[3] * m10) + (fArr[7] * n10)) + fArr[15]);
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        return C2422h.a(((fArr[0] * m10) + (fArr[4] * n10) + fArr[12]) * f10, f10 * ((fArr[1] * m10) + (fArr[5] * n10) + fArr[13]));
    }

    public static final void g(float[] fArr, C2419e eVar) {
        long f10 = f(fArr, C2422h.a(eVar.b(), eVar.d()));
        long f11 = f(fArr, C2422h.a(eVar.b(), eVar.a()));
        long f12 = f(fArr, C2422h.a(eVar.c(), eVar.d()));
        long f13 = f(fArr, C2422h.a(eVar.c(), eVar.a()));
        eVar.i(Math.min(Math.min(C2421g.m(f10), C2421g.m(f11)), Math.min(C2421g.m(f12), C2421g.m(f13))));
        eVar.k(Math.min(Math.min(C2421g.n(f10), C2421g.n(f11)), Math.min(C2421g.n(f12), C2421g.n(f13))));
        eVar.j(Math.max(Math.max(C2421g.m(f10), C2421g.m(f11)), Math.max(C2421g.m(f12), C2421g.m(f13))));
        eVar.h(Math.max(Math.max(C2421g.n(f10), C2421g.n(f11)), Math.max(C2421g.n(f12), C2421g.n(f13))));
    }

    public static final void h(float[] fArr) {
        float f10;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                if (i10 == i11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                fArr[(i11 * 4) + i10] = f10;
            }
        }
    }

    public static final void i(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[5];
        float f14 = fArr[6];
        float f15 = fArr[9];
        float f16 = fArr[10];
        float f17 = fArr[13];
        float f18 = fArr[14];
        fArr[1] = (f11 * cos) - (f12 * sin);
        fArr[2] = (f11 * sin) + (f12 * cos);
        fArr[5] = (f13 * cos) - (f14 * sin);
        fArr[6] = (f13 * sin) + (f14 * cos);
        fArr[9] = (f15 * cos) - (f16 * sin);
        fArr[10] = (f15 * sin) + (f16 * cos);
        fArr[13] = (f17 * cos) - (f18 * sin);
        fArr[14] = (f17 * sin) + (f18 * cos);
    }

    public static final void j(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[2];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[8];
        float f16 = fArr[10];
        float f17 = fArr[12];
        float f18 = fArr[14];
        fArr[0] = (f11 * cos) + (f12 * sin);
        fArr[2] = ((-f11) * sin) + (f12 * cos);
        fArr[4] = (f13 * cos) + (f14 * sin);
        fArr[6] = ((-f13) * sin) + (f14 * cos);
        fArr[8] = (f15 * cos) + (f16 * sin);
        fArr[10] = ((-f15) * sin) + (f16 * cos);
        fArr[12] = (f17 * cos) + (f18 * sin);
        fArr[14] = ((-f17) * sin) + (f18 * cos);
    }

    public static final void k(float[] fArr, float f10) {
        double d10 = (((double) f10) * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f11 = fArr[0];
        float f12 = fArr[4];
        float f13 = -sin;
        float f14 = fArr[1];
        float f15 = fArr[5];
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = fArr[3];
        float f19 = fArr[7];
        fArr[0] = (cos * f11) + (sin * f12);
        fArr[1] = (cos * f14) + (sin * f15);
        fArr[2] = (cos * f16) + (sin * f17);
        fArr[3] = (cos * f18) + (sin * f19);
        fArr[4] = (f11 * f13) + (f12 * cos);
        fArr[5] = (f14 * f13) + (f15 * cos);
        fArr[6] = (f16 * f13) + (f17 * cos);
        fArr[7] = (f13 * f18) + (cos * f19);
    }

    public static final void l(float[] fArr, float f10, float f11, float f12) {
        fArr[0] = fArr[0] * f10;
        fArr[1] = fArr[1] * f10;
        fArr[2] = fArr[2] * f10;
        fArr[3] = fArr[3] * f10;
        fArr[4] = fArr[4] * f11;
        fArr[5] = fArr[5] * f11;
        fArr[6] = fArr[6] * f11;
        fArr[7] = fArr[7] * f11;
        fArr[8] = fArr[8] * f12;
        fArr[9] = fArr[9] * f12;
        fArr[10] = fArr[10] * f12;
        fArr[11] = fArr[11] * f12;
    }

    public static /* synthetic */ void m(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 1.0f;
        }
        l(fArr, f10, f11, f12);
    }

    public static final void n(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float a10 = N1.b(fArr3, 0, fArr4, 0);
        float a11 = N1.b(fArr3, 0, fArr4, 1);
        float a12 = N1.b(fArr3, 0, fArr4, 2);
        float a13 = N1.b(fArr3, 0, fArr4, 3);
        float a14 = N1.b(fArr3, 1, fArr4, 0);
        float a15 = N1.b(fArr3, 1, fArr4, 1);
        float a16 = N1.b(fArr3, 1, fArr4, 2);
        float a17 = N1.b(fArr3, 1, fArr4, 3);
        float a18 = N1.b(fArr3, 2, fArr4, 0);
        float a19 = N1.b(fArr3, 2, fArr4, 1);
        float a20 = N1.b(fArr3, 2, fArr4, 2);
        float a21 = N1.b(fArr3, 2, fArr4, 3);
        float a22 = N1.b(fArr3, 3, fArr4, 0);
        float a23 = N1.b(fArr3, 3, fArr4, 1);
        float a24 = N1.b(fArr3, 3, fArr4, 2);
        float a25 = N1.b(fArr3, 3, fArr4, 3);
        fArr3[0] = a10;
        fArr3[1] = a11;
        fArr3[2] = a12;
        fArr3[3] = a13;
        fArr3[4] = a14;
        fArr3[5] = a15;
        fArr3[6] = a16;
        fArr3[7] = a17;
        fArr3[8] = a18;
        fArr3[9] = a19;
        fArr3[10] = a20;
        fArr3[11] = a21;
        fArr3[12] = a22;
        fArr3[13] = a23;
        fArr3[14] = a24;
        fArr3[15] = a25;
    }

    public static String o(float[] fArr) {
        return p.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void p(float[] fArr, float f10, float f11, float f12) {
        float f13 = (fArr[0] * f10) + (fArr[4] * f11) + (fArr[8] * f12) + fArr[12];
        float f14 = (fArr[1] * f10) + (fArr[5] * f11) + (fArr[9] * f12) + fArr[13];
        float f15 = (fArr[2] * f10) + (fArr[6] * f11) + (fArr[10] * f12) + fArr[14];
        fArr[12] = f13;
        fArr[13] = f14;
        fArr[14] = f15;
        fArr[15] = (fArr[3] * f10) + (fArr[7] * f11) + (fArr[11] * f12) + fArr[15];
    }

    public static /* synthetic */ void q(float[] fArr, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        p(fArr, f10, f11, f12);
    }

    public boolean equals(Object obj) {
        return d(this.f25445a, obj);
    }

    public int hashCode() {
        return e(this.f25445a);
    }

    public final /* synthetic */ float[] r() {
        return this.f25445a;
    }

    public String toString() {
        return o(this.f25445a);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }
}
