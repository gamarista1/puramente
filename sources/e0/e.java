package E0;

import D0.A;
import D0.C1114e;
import D0.C1125p;
import G0.a;
import java.util.List;
import mf.C6559l;
import q0.C2421g;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f1735a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f1736b;

    public static final void c(d dVar, A a10) {
        if (f1735a) {
            e(dVar, a10);
        } else {
            d(dVar, a10);
        }
    }

    private static final void d(d dVar, A a10) {
        if (C1125p.b(a10)) {
            dVar.f(a10.h());
            dVar.e();
        }
        long k10 = a10.k();
        List e10 = a10.e();
        int size = e10.size();
        int i10 = 0;
        while (i10 < size) {
            C1114e eVar = (C1114e) e10.get(i10);
            long q10 = C2421g.q(eVar.b(), k10);
            long b10 = eVar.b();
            dVar.f(C2421g.r(dVar.c(), q10));
            dVar.a(eVar.c(), dVar.c());
            i10++;
            k10 = b10;
        }
        dVar.f(C2421g.r(dVar.c(), C2421g.q(a10.h(), k10)));
        dVar.a(a10.o(), dVar.c());
    }

    private static final void e(d dVar, A a10) {
        if (C1125p.b(a10)) {
            dVar.e();
        }
        if (!C1125p.d(a10)) {
            List e10 = a10.e();
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1114e eVar = (C1114e) e10.get(i10);
                dVar.a(eVar.c(), eVar.a());
            }
            dVar.a(a10.o(), a10.g());
        }
        if (C1125p.d(a10) && a10.o() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(a10.o());
    }

    /* access modifiers changed from: private */
    public static final float f(float[] fArr, float[] fArr2, int i10, boolean z10) {
        float f10;
        int i11 = i10 - 1;
        float f11 = fArr2[i11];
        float f12 = 0.0f;
        int i12 = i11;
        while (i12 > 0) {
            int i13 = i12 - 1;
            float f13 = fArr2[i13];
            if (f11 != f13) {
                if (z10) {
                    f10 = -fArr[i13];
                } else {
                    f10 = fArr[i12] - fArr[i13];
                }
                float f14 = f10 / (f11 - f13);
                f12 += (f14 - (Math.signum(f12) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f12)))))) * Math.abs(f14);
                if (i12 == i11) {
                    f12 *= 0.5f;
                }
            }
            i12--;
            f11 = f13;
        }
        return Math.signum(f12) * ((float) Math.sqrt((double) (((float) 2) * Math.abs(f12))));
    }

    private static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < length; i10++) {
            f10 += fArr[i10] * fArr2[i10];
        }
        return f10;
    }

    public static final boolean h() {
        return f1736b;
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i10, int i11, float[] fArr3) {
        float f10;
        int i12 = i10;
        int i13 = i11;
        if (i13 < 1) {
            a.a("The degree must be at positive integer");
        }
        if (i12 == 0) {
            a.a("At least one point must be provided");
        }
        if (i13 >= i12) {
            i13 = i12 - 1;
        }
        int i14 = i13 + 1;
        float[][] fArr4 = new float[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            fArr4[i15] = new float[i12];
        }
        for (int i16 = 0; i16 < i12; i16++) {
            fArr4[0][i16] = 1.0f;
            for (int i17 = 1; i17 < i14; i17++) {
                fArr4[i17][i16] = fArr4[i17 - 1][i16] * fArr[i16];
            }
        }
        float[][] fArr5 = new float[i14][];
        for (int i18 = 0; i18 < i14; i18++) {
            fArr5[i18] = new float[i12];
        }
        float[][] fArr6 = new float[i14][];
        for (int i19 = 0; i19 < i14; i19++) {
            fArr6[i19] = new float[i14];
        }
        for (int i20 = 0; i20 < i14; i20++) {
            float[] fArr7 = fArr5[i20];
            C6559l.j(fArr4[i20], fArr7, 0, 0, i12);
            for (int i21 = 0; i21 < i20; i21++) {
                float[] fArr8 = fArr5[i21];
                float g10 = g(fArr7, fArr8);
                for (int i22 = 0; i22 < i12; i22++) {
                    fArr7[i22] = fArr7[i22] - (fArr8[i22] * g10);
                }
            }
            float sqrt = (float) Math.sqrt((double) g(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f11 = 1.0f / sqrt;
            for (int i23 = 0; i23 < i12; i23++) {
                fArr7[i23] = fArr7[i23] * f11;
            }
            float[] fArr9 = fArr6[i20];
            for (int i24 = 0; i24 < i14; i24++) {
                if (i24 < i20) {
                    f10 = 0.0f;
                } else {
                    f10 = g(fArr7, fArr4[i24]);
                }
                fArr9[i24] = f10;
            }
        }
        for (int i25 = i13; -1 < i25; i25--) {
            float g11 = g(fArr5[i25], fArr2);
            float[] fArr10 = fArr6[i25];
            int i26 = i25 + 1;
            if (i26 <= i13) {
                int i27 = i13;
                while (true) {
                    g11 -= fArr10[i27] * fArr3[i27];
                    if (i27 == i26) {
                        break;
                    }
                    i27--;
                }
            }
            fArr3[i25] = g11 / fArr10[i25];
        }
        return fArr3;
    }

    /* access modifiers changed from: private */
    public static final void j(a[] aVarArr, int i10, long j10, float f10) {
        a aVar = aVarArr[i10];
        if (aVar == null) {
            aVarArr[i10] = new a(j10, f10);
            return;
        }
        aVar.d(j10);
        aVar.c(f10);
    }
}
