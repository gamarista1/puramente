package o1;

import p1.C2387c;

/* renamed from: o1.a  reason: case insensitive filesystem */
public class C2350a {

    /* renamed from: a  reason: collision with root package name */
    private final float f24713a;

    /* renamed from: b  reason: collision with root package name */
    private final float f24714b;

    /* renamed from: c  reason: collision with root package name */
    private final float f24715c;

    /* renamed from: d  reason: collision with root package name */
    private final float f24716d;

    /* renamed from: e  reason: collision with root package name */
    private final float f24717e;

    /* renamed from: f  reason: collision with root package name */
    private final float f24718f;

    /* renamed from: g  reason: collision with root package name */
    private final float f24719g;

    /* renamed from: h  reason: collision with root package name */
    private final float f24720h;

    /* renamed from: i  reason: collision with root package name */
    private final float f24721i;

    C2350a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f24713a = f10;
        this.f24714b = f11;
        this.f24715c = f12;
        this.f24716d = f13;
        this.f24717e = f14;
        this.f24718f = f15;
        this.f24719g = f16;
        this.f24720h = f17;
        this.f24721i = f18;
    }

    private static C2350a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C2350a aVar = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int p10 = e(f17, f11, f10).p();
            float b10 = b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                C2350a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f14 = abs;
                    f16 = a10;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            } else if (b10 < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return aVar;
    }

    static C2350a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, l.f24759k, fArr, fArr2);
        return new C2350a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i10, l lVar, float[] fArr, float[] fArr2) {
        float f10;
        float[] fArr3 = fArr2;
        b.f(i10, fArr3);
        float[][] fArr4 = b.f24722a;
        float f11 = fArr3[0];
        float[] fArr5 = fArr4[0];
        float f12 = fArr3[1];
        float f13 = fArr3[2];
        float f14 = (fArr5[0] * f11) + (fArr5[1] * f12) + (fArr5[2] * f13);
        float[] fArr6 = fArr4[1];
        float f15 = (fArr6[0] * f11) + (fArr6[1] * f12) + (fArr6[2] * f13);
        float[] fArr7 = fArr4[2];
        float f16 = lVar.i()[0] * f14;
        float f17 = lVar.i()[1] * f15;
        float f18 = lVar.i()[2] * ((f11 * fArr7[0]) + (f12 * fArr7[1]) + (f13 * fArr7[2]));
        float pow = (float) Math.pow(((double) (lVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (lVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (lVar.c() * Math.abs(f18))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f19 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d10)) / 11.0f;
        float f20 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f21 = signum2 * 20.0f;
        float f22 = (((signum * 20.0f) + f21) + (21.0f * signum3)) / 20.0f;
        float f23 = (((signum * 40.0f) + f21) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f20, (double) f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f24 = (3.1415927f * atan2) / 180.0f;
        float f25 = f22;
        float f26 = f20;
        float pow4 = ((float) Math.pow((double) ((f23 * lVar.f()) / lVar.a()), (double) (lVar.b() * lVar.j()))) * 100.0f;
        float b10 = (4.0f / lVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (lVar.a() + 4.0f) * lVar.d();
        if (((double) atan2) < 20.14d) {
            f10 = 360.0f + atan2;
        } else {
            f10 = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) f10) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((double) ((f19 * f19) + (f26 * f26))))) / (f25 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        float d11 = lVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d11) + 1.0f))) * 43.85965f;
        double d12 = (double) f24;
        float cos = ((float) Math.cos(d12)) * log;
        float sin = log * ((float) Math.sin(d12));
        fArr3[0] = atan2;
        fArr3[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b10;
            fArr[2] = d11;
            fArr[3] = sqrt2;
            fArr[4] = f27;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static C2350a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, l.f24759k);
    }

    private static C2350a f(float f10, float f11, float f12, l lVar) {
        float f13 = f10;
        double d10 = ((double) f13) / 100.0d;
        float b10 = (4.0f / lVar.b()) * ((float) Math.sqrt(d10)) * (lVar.a() + 4.0f) * lVar.d();
        float d11 = f11 * lVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * lVar.b()) / (lVar.a() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float log = ((float) Math.log((((double) d11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (double) ((3.1415927f * f12) / 180.0f);
        return new C2350a(f12, f11, f13, b10, d11, sqrt, f14, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, l.f24759k);
    }

    static int n(float f10, float f11, float f12, l lVar) {
        float f13;
        if (((double) f11) < 1.0d || ((double) Math.round(f12)) <= 0.0d || ((double) Math.round(f12)) >= 100.0d) {
            return b.a(f12);
        }
        if (f10 < 0.0f) {
            f13 = 0.0f;
        } else {
            f13 = Math.min(360.0f, f10);
        }
        C2350a aVar = null;
        boolean z10 = true;
        float f14 = 0.0f;
        float f15 = f11;
        while (Math.abs(f14 - f11) >= 0.4f) {
            C2350a b10 = b(f13, f15, f12);
            if (!z10) {
                if (b10 == null) {
                    f11 = f15;
                } else {
                    f14 = f15;
                    aVar = b10;
                }
                f15 = ((f11 - f14) / 2.0f) + f14;
            } else if (b10 != null) {
                return b10.o(lVar);
            } else {
                f15 = ((f11 - f14) / 2.0f) + f14;
                z10 = false;
            }
        }
        if (aVar == null) {
            return b.a(f12);
        }
        return aVar.o(lVar);
    }

    /* access modifiers changed from: package-private */
    public float a(C2350a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l10 * l10) + (g10 * g10) + (h10 * h10))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f24720h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f24721i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f24714b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f24713a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f24715c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f24719g;
    }

    /* access modifiers changed from: package-private */
    public int o(l lVar) {
        float f10;
        if (((double) i()) == 0.0d || ((double) k()) == 0.0d) {
            f10 = 0.0f;
        } else {
            f10 = i() / ((float) Math.sqrt(((double) k()) / 100.0d));
        }
        float pow = (float) Math.pow(((double) f10) / Math.pow(1.64d - Math.pow(0.29d, (double) lVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (double) ((j() * 3.1415927f) / 180.0f);
        float a10 = lVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) lVar.b())) / ((double) lVar.j())));
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f * 3846.1538f * lVar.g() * lVar.h();
        float f11 = a10 / lVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f12 = (((0.305f + f11) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f13 = cos2 * f12;
        float f14 = f12 * sin;
        float f15 = f11 * 460.0f;
        float f16 = (((451.0f * f13) + f15) + (288.0f * f14)) / 1403.0f;
        float f17 = ((f15 - (891.0f * f13)) - (261.0f * f14)) / 1403.0f;
        float f18 = ((f15 - (f13 * 220.0f)) - (f14 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f16) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
        float signum2 = Math.signum(f17) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
        float signum3 = Math.signum(f18) * (100.0f / lVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f18)) * 27.13d) / (400.0d - ((double) Math.abs(f18))))), 2.380952380952381d));
        float f19 = signum / lVar.i()[0];
        float f20 = signum2 / lVar.i()[1];
        float f21 = signum3 / lVar.i()[2];
        float[][] fArr = b.f24723b;
        float[] fArr2 = fArr[0];
        float f22 = (fArr2[0] * f19) + (fArr2[1] * f20) + (fArr2[2] * f21);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C2387c.d((double) f22, (double) ((fArr3[0] * f19) + (fArr3[1] * f20) + (fArr3[2] * f21)), (double) ((f19 * fArr4[0]) + (f20 * fArr4[1]) + (f21 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(l.f24759k);
    }
}
