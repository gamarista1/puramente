package g1;

public class k implements m {

    /* renamed from: a  reason: collision with root package name */
    double f20952a = 0.5d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f20953b = false;

    /* renamed from: c  reason: collision with root package name */
    private double f20954c;

    /* renamed from: d  reason: collision with root package name */
    private double f20955d;

    /* renamed from: e  reason: collision with root package name */
    private double f20956e;

    /* renamed from: f  reason: collision with root package name */
    private float f20957f;

    /* renamed from: g  reason: collision with root package name */
    private float f20958g;

    /* renamed from: h  reason: collision with root package name */
    private float f20959h;

    /* renamed from: i  reason: collision with root package name */
    private float f20960i;

    /* renamed from: j  reason: collision with root package name */
    private float f20961j;

    /* renamed from: k  reason: collision with root package name */
    private int f20962k = 0;

    private void c(double d10) {
        if (d10 > 0.0d) {
            double d11 = this.f20954c;
            double d12 = this.f20952a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f20960i)) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / ((double) sqrt);
            int i10 = 0;
            while (i10 < sqrt) {
                float f10 = this.f20958g;
                double d14 = this.f20955d;
                float f11 = this.f20959h;
                double d15 = d11;
                float f12 = this.f20960i;
                double d16 = d12;
                double d17 = ((double) f11) + ((((((-d11) * (((double) f10) - d14)) - (((double) f11) * d12)) / ((double) f12)) * d13) / 2.0d);
                double d18 = ((((-((((double) f10) + ((d13 * d17) / 2.0d)) - d14)) * d15) - (d17 * d16)) / ((double) f12)) * d13;
                double d19 = ((double) f11) + (d18 / 2.0d);
                float f13 = f11 + ((float) d18);
                this.f20959h = f13;
                float f14 = f10 + ((float) (d19 * d13));
                this.f20958g = f14;
                int i11 = this.f20962k;
                if (i11 > 0) {
                    if (f14 < 0.0f && (i11 & 1) == 1) {
                        this.f20958g = -f14;
                        this.f20959h = -f13;
                    }
                    float f15 = this.f20958g;
                    if (f15 > 1.0f && (i11 & 2) == 2) {
                        this.f20958g = 2.0f - f15;
                        this.f20959h = -this.f20959h;
                    }
                }
                i10++;
                d11 = d15;
                d12 = d16;
            }
        }
    }

    public float a() {
        return 0.0f;
    }

    public boolean b() {
        double d10 = ((double) this.f20958g) - this.f20955d;
        double d11 = this.f20954c;
        double d12 = (double) this.f20959h;
        if (Math.sqrt((((d12 * d12) * ((double) this.f20960i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f20961j)) {
            return true;
        }
        return false;
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f20955d = (double) f11;
        this.f20952a = (double) f15;
        this.f20953b = false;
        this.f20958g = f10;
        this.f20956e = (double) f12;
        this.f20954c = (double) f14;
        this.f20960i = f13;
        this.f20961j = f16;
        this.f20962k = i10;
        this.f20957f = 0.0f;
    }

    public float getInterpolation(float f10) {
        c((double) (f10 - this.f20957f));
        this.f20957f = f10;
        if (b()) {
            this.f20958g = (float) this.f20955d;
        }
        return this.f20958g;
    }
}
