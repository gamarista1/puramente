package w;

import r0.C2487e0;

/* renamed from: w.x  reason: case insensitive filesystem */
public final class C2812x implements C2760D {

    /* renamed from: a  reason: collision with root package name */
    private final float f27635a;

    /* renamed from: b  reason: collision with root package name */
    private final float f27636b;

    /* renamed from: c  reason: collision with root package name */
    private final float f27637c;

    /* renamed from: d  reason: collision with root package name */
    private final float f27638d;

    /* renamed from: e  reason: collision with root package name */
    private final float f27639e;

    /* renamed from: f  reason: collision with root package name */
    private final float f27640f;

    public C2812x(float f10, float f11, float f12, float f13) {
        boolean z10;
        this.f27635a = f10;
        this.f27636b = f11;
        this.f27637c = f12;
        this.f27638d = f13;
        if (Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C2783a0.a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long b10 = C2487e0.b(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.f27639e = Float.intBitsToFloat((int) (b10 >> 32));
        this.f27640f = Float.intBitsToFloat((int) (b10 & 4294967295L));
    }

    private final void b(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f27635a + ", " + this.f27636b + ", " + this.f27637c + ", " + this.f27638d + ") has no solution at " + f10);
    }

    public float a(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            return f10;
        }
        float e10 = C2487e0.e(0.0f - f10, this.f27635a - f10, this.f27637c - f10, 1.0f - f10);
        if (Float.isNaN(e10)) {
            b(f10);
        }
        float c10 = C2487e0.c(this.f27636b, this.f27638d, e10);
        float f11 = this.f27639e;
        float f12 = this.f27640f;
        if (c10 < f11) {
            c10 = f11;
        }
        if (c10 > f12) {
            return f12;
        }
        return c10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2812x) {
            C2812x xVar = (C2812x) obj;
            if (this.f27635a == xVar.f27635a && this.f27636b == xVar.f27636b && this.f27637c == xVar.f27637c && this.f27638d == xVar.f27638d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f27635a) * 31) + Float.hashCode(this.f27636b)) * 31) + Float.hashCode(this.f27637c)) * 31) + Float.hashCode(this.f27638d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f27635a + ", b=" + this.f27636b + ", c=" + this.f27637c + ", d=" + this.f27638d + ')';
    }
}
