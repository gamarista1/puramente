package g1;

public class n implements m {

    /* renamed from: a  reason: collision with root package name */
    private float f20964a;

    /* renamed from: b  reason: collision with root package name */
    private float f20965b;

    /* renamed from: c  reason: collision with root package name */
    private float f20966c;

    /* renamed from: d  reason: collision with root package name */
    private float f20967d;

    /* renamed from: e  reason: collision with root package name */
    private float f20968e;

    /* renamed from: f  reason: collision with root package name */
    private float f20969f;

    /* renamed from: g  reason: collision with root package name */
    private float f20970g;

    /* renamed from: h  reason: collision with root package name */
    private float f20971h;

    /* renamed from: i  reason: collision with root package name */
    private float f20972i;

    /* renamed from: j  reason: collision with root package name */
    private int f20973j;

    /* renamed from: k  reason: collision with root package name */
    private String f20974k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20975l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f20976m;

    /* renamed from: n  reason: collision with root package name */
    private float f20977n;

    /* renamed from: o  reason: collision with root package name */
    private float f20978o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20979p = false;

    private float c(float f10) {
        this.f20979p = false;
        float f11 = this.f20967d;
        if (f10 <= f11) {
            float f12 = this.f20964a;
            return (f12 * f10) + ((((this.f20965b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f20973j;
        if (i10 == 1) {
            return this.f20970g;
        }
        float f13 = f10 - f11;
        float f14 = this.f20968e;
        if (f13 < f14) {
            float f15 = this.f20970g;
            float f16 = this.f20965b;
            return f15 + (f16 * f13) + ((((this.f20966c - f16) * f13) * f13) / (f14 * 2.0f));
        } else if (i10 == 2) {
            return this.f20971h;
        } else {
            float f17 = f13 - f14;
            float f18 = this.f20969f;
            if (f17 <= f18) {
                float f19 = this.f20971h;
                float f20 = this.f20966c;
                return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
            }
            this.f20979p = true;
            return this.f20972i;
        }
    }

    private void f(float f10, float f11, float f12, float f13, float f14) {
        this.f20979p = false;
        this.f20972i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12));
            if (sqrt < f13) {
                this.f20974k = "backward accelerate, decelerate";
                this.f20973j = 2;
                this.f20964a = f10;
                this.f20965b = sqrt;
                this.f20966c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.f20967d = f17;
                this.f20968e = sqrt / f12;
                this.f20970g = ((f10 + sqrt) * f17) / 2.0f;
                this.f20971h = f11;
                this.f20972i = f11;
                return;
            }
            this.f20974k = "backward accelerate cruse decelerate";
            this.f20973j = 3;
            this.f20964a = f10;
            this.f20965b = f13;
            this.f20966c = f13;
            float f18 = (f13 - f10) / f12;
            this.f20967d = f18;
            float f19 = f13 / f12;
            this.f20969f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f20968e = ((f11 - f20) - f21) / f13;
            this.f20970g = f20;
            this.f20971h = f11 - f21;
            this.f20972i = f11;
        } else if (f16 >= f11) {
            this.f20974k = "hard stop";
            this.f20973j = 1;
            this.f20964a = f10;
            this.f20965b = 0.0f;
            this.f20970g = f11;
            this.f20967d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f20974k = "cruse decelerate";
                this.f20973j = 2;
                this.f20964a = f10;
                this.f20965b = f10;
                this.f20966c = 0.0f;
                this.f20970g = f22;
                this.f20971h = f11;
                this.f20967d = f23;
                this.f20968e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f12 * f11) + ((f10 * f10) / 2.0f)));
            float f24 = (sqrt2 - f10) / f12;
            this.f20967d = f24;
            float f25 = sqrt2 / f12;
            this.f20968e = f25;
            if (sqrt2 < f13) {
                this.f20974k = "accelerate decelerate";
                this.f20973j = 2;
                this.f20964a = f10;
                this.f20965b = sqrt2;
                this.f20966c = 0.0f;
                this.f20967d = f24;
                this.f20968e = f25;
                this.f20970g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f20971h = f11;
                return;
            }
            this.f20974k = "accelerate cruse decelerate";
            this.f20973j = 3;
            this.f20964a = f10;
            this.f20965b = f13;
            this.f20966c = f13;
            float f26 = (f13 - f10) / f12;
            this.f20967d = f26;
            float f27 = f13 / f12;
            this.f20969f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f20968e = ((f11 - f28) - f29) / f13;
            this.f20970g = f28;
            this.f20971h = f11 - f29;
            this.f20972i = f11;
        }
    }

    public float a() {
        if (this.f20975l) {
            return -e(this.f20978o);
        }
        return e(this.f20978o);
    }

    public boolean b() {
        if (a() >= 1.0E-5f || Math.abs(this.f20972i - this.f20977n) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10 = false;
        this.f20979p = false;
        this.f20976m = f10;
        if (f10 > f11) {
            z10 = true;
        }
        this.f20975l = z10;
        if (z10) {
            f(-f12, f10 - f11, f14, f15, f13);
            return;
        }
        f(f12, f11 - f10, f14, f15, f13);
    }

    public float e(float f10) {
        float f11 = this.f20967d;
        if (f10 <= f11) {
            float f12 = this.f20964a;
            return f12 + (((this.f20965b - f12) * f10) / f11);
        }
        int i10 = this.f20973j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f20968e;
        if (f13 < f14) {
            float f15 = this.f20965b;
            return f15 + (((this.f20966c - f15) * f13) / f14);
        } else if (i10 == 2) {
            return 0.0f;
        } else {
            float f16 = f13 - f14;
            float f17 = this.f20969f;
            if (f16 >= f17) {
                return 0.0f;
            }
            float f18 = this.f20966c;
            return f18 - ((f16 * f18) / f17);
        }
    }

    public float getInterpolation(float f10) {
        float c10 = c(f10);
        this.f20977n = c10;
        this.f20978o = f10;
        if (this.f20975l) {
            return this.f20976m - c10;
        }
        return this.f20976m + c10;
    }
}
