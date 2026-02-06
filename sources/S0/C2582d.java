package s0;

import androidx.collection.C;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C2580b;
import s0.C2586h;

/* renamed from: s0.d  reason: case insensitive filesystem */
public abstract class C2582d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16;
        double d17 = d10;
        if (d17 < 0.0d) {
            d16 = -d17;
        } else {
            d16 = d17;
        }
        return Math.copySign(o(d16, d11, d12, d13, d14, d15), d17);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16;
        double d17 = d10;
        if (d17 < 0.0d) {
            d16 = -d17;
        } else {
            d16 = d17;
        }
        return Math.copySign(q(d16, d11, d12, d13, d14, d15), d17);
    }

    public static final C2581c c(C2581c cVar, z zVar, C2579a aVar) {
        if (!C2580b.e(cVar.e(), C2580b.f25785a.b())) {
            return cVar;
        }
        C6496s.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        x xVar = (x) cVar;
        if (f(xVar.N(), zVar)) {
            return cVar;
        }
        return new x(xVar, l(e(aVar.b(), xVar.N().c(), zVar.c()), xVar.M()), zVar);
    }

    public static /* synthetic */ C2581c d(C2581c cVar, z zVar, C2579a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = C2579a.f25780b.a();
        }
        return c(cVar, zVar, aVar);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] n10 = n(fArr, fArr2);
        float[] n11 = n(fArr, fArr3);
        return l(k(fArr), m(new float[]{n11[0] / n10[0], n11[1] / n10[1], n11[2] / n10[2]}, fArr));
    }

    public static final boolean f(z zVar, z zVar2) {
        if (zVar == zVar2) {
            return true;
        }
        if (Math.abs(zVar.a() - zVar2.a()) >= 0.001f || Math.abs(zVar.b() - zVar2.b()) >= 0.001f) {
            return false;
        }
        return true;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(fArr[i10], fArr2[i10]) != 0 && Math.abs(fArr[i10] - fArr2[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final C2586h h(C2581c cVar, C2581c cVar2, int i10) {
        int b10 = cVar.b();
        int b11 = cVar2.b();
        if ((b10 | b11) < 0) {
            return j(cVar, cVar2, i10);
        }
        C a10 = C2587i.a();
        int i11 = b10 | (b11 << 6) | (i10 << 12);
        Object c10 = a10.c(i11);
        if (c10 == null) {
            c10 = j(cVar, cVar2, i10);
            a10.t(i11, c10);
        }
        return (C2586h) c10;
    }

    public static /* synthetic */ C2586h i(C2581c cVar, C2581c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = C2585g.f25794a.w();
        }
        if ((i11 & 2) != 0) {
            i10 = n.f25846a.b();
        }
        return h(cVar, cVar2, i10);
    }

    private static final C2586h j(C2581c cVar, C2581c cVar2, int i10) {
        C2586h hVar;
        if (cVar == cVar2) {
            return C2586h.f25818g.c(cVar);
        }
        long e10 = cVar.e();
        C2580b.a aVar = C2580b.f25785a;
        if (!C2580b.e(e10, aVar.b()) || !C2580b.e(cVar2.e(), aVar.b())) {
            hVar = new C2586h(cVar, cVar2, i10, (DefaultConstructorMarker) null);
        } else {
            C6496s.f(cVar, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C6496s.f(cVar2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            hVar = new C2586h.b((x) cVar, (x) cVar2, i10, (DefaultConstructorMarker) null);
        }
        return hVar;
    }

    public static final float[] k(float[] fArr) {
        float[] fArr2 = fArr;
        float f10 = fArr2[0];
        float f11 = fArr2[3];
        float f12 = fArr2[6];
        float f13 = fArr2[1];
        float f14 = fArr2[4];
        float f15 = fArr2[7];
        float f16 = fArr2[2];
        float f17 = fArr2[5];
        float f18 = fArr2[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr3 = new float[fArr2.length];
        fArr3[0] = f19 / f22;
        fArr3[1] = f20 / f22;
        fArr3[2] = f21 / f22;
        fArr3[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr3[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr3[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr3[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr3[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr3[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr3;
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0];
        float f12 = fArr[3];
        float f13 = fArr2[1];
        float f14 = fArr[6];
        float f15 = fArr2[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = fArr[1];
        float f18 = fArr[4];
        float f19 = fArr[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = fArr[2];
        float f22 = fArr[5];
        float f23 = fArr[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = fArr2[3];
        float f26 = fArr2[4];
        float f27 = fArr2[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f30 = fArr2[6];
        float f31 = fArr2[7];
        float f32 = (f10 * f30) + (f12 * f31);
        float f33 = fArr2[8];
        return new float[]{f16, f20, f24, f28, (f17 * f25) + (f18 * f26) + (f19 * f27), f29, f32 + (f14 * f33), (f17 * f30) + (f18 * f31) + (f19 * f33), (f21 * f30) + (f22 * f31) + (f23 * f33)};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f10 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = fArr[1];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[2];
        return new float[]{f11, f13, fArr2[2] * f14, fArr2[3] * f10, fArr2[4] * f12, fArr2[5] * f14, f10 * fArr2[6], f12 * fArr2[7], f14 * fArr2[8]};
    }

    public static final float[] n(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = fArr2[1];
        float f12 = fArr2[2];
        fArr2[0] = (fArr[0] * f10) + (fArr[3] * f11) + (fArr[6] * f12);
        fArr2[1] = (fArr[1] * f10) + (fArr[4] * f11) + (fArr[7] * f12);
        fArr2[2] = (fArr[2] * f10) + (fArr[5] * f11) + (fArr[8] * f12);
        return fArr2;
    }

    public static final double o(double d10, double d11, double d12, double d13, double d14, double d15) {
        if (d10 >= d14 * d13) {
            return (Math.pow(d10, 1.0d / d15) - d12) / d11;
        }
        return d10 / d13;
    }

    public static final double p(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        if (d10 >= d14 * d13) {
            return (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11;
        }
        return (d10 - d16) / d13;
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        if (d10 >= d14) {
            return Math.pow((d11 * d10) + d12, d15);
        }
        return d10 * d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        if (d10 >= d14) {
            return Math.pow((d11 * d10) + d12, d17) + d15;
        }
        return (d13 * d10) + d16;
    }
}
