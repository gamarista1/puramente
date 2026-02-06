package w;

/* renamed from: w.e0  reason: case insensitive filesystem */
public final class C2791e0 {

    /* renamed from: a  reason: collision with root package name */
    private float f27408a;

    /* renamed from: b  reason: collision with root package name */
    private double f27409b = Math.sqrt(50.0d);

    /* renamed from: c  reason: collision with root package name */
    private boolean f27410c;

    /* renamed from: d  reason: collision with root package name */
    private double f27411d;

    /* renamed from: e  reason: collision with root package name */
    private double f27412e;

    /* renamed from: f  reason: collision with root package name */
    private double f27413f;

    /* renamed from: g  reason: collision with root package name */
    private float f27414g = 1.0f;

    public C2791e0(float f10) {
        this.f27408a = f10;
    }

    private final void c() {
        if (!this.f27410c) {
            if (this.f27408a != C2793f0.b()) {
                float f10 = this.f27414g;
                double d10 = ((double) f10) * ((double) f10);
                if (f10 > 1.0f) {
                    double d11 = this.f27409b;
                    double d12 = d10 - ((double) 1);
                    this.f27411d = (((double) (-f10)) * d11) + (d11 * Math.sqrt(d12));
                    double d13 = this.f27409b;
                    this.f27412e = (((double) (-this.f27414g)) * d13) - (d13 * Math.sqrt(d12));
                } else if (f10 >= 0.0f && f10 < 1.0f) {
                    this.f27413f = this.f27409b * Math.sqrt(((double) 1) - d10);
                }
                this.f27410c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public final float a() {
        return this.f27414g;
    }

    public final float b() {
        double d10 = this.f27409b;
        return (float) (d10 * d10);
    }

    public final void d(float f10) {
        if (f10 >= 0.0f) {
            this.f27414g = f10;
            this.f27410c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void e(float f10) {
        this.f27408a = f10;
    }

    public final void f(float f10) {
        if (b() > 0.0f) {
            this.f27409b = Math.sqrt((double) f10);
            this.f27410c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final long g(float f10, float f11, long j10) {
        double d10;
        double d11;
        float f12 = f11;
        c();
        float f13 = f10 - this.f27408a;
        double d12 = ((double) j10) / 1000.0d;
        float f14 = this.f27414g;
        if (f14 > 1.0f) {
            double d13 = (double) f13;
            double d14 = this.f27412e;
            double d15 = (double) f12;
            double d16 = this.f27411d;
            double d17 = d13 - (((d14 * d13) - d15) / (d14 - d16));
            double d18 = ((d13 * d14) - d15) / (d14 - d16);
            d11 = (Math.exp(d14 * d12) * d17) + (Math.exp(this.f27411d * d12) * d18);
            double d19 = this.f27412e;
            double exp = d17 * d19 * Math.exp(d19 * d12);
            double d20 = this.f27411d;
            d10 = exp + (d18 * d20 * Math.exp(d20 * d12));
        } else if (f14 == 1.0f) {
            double d21 = (double) f12;
            double d22 = this.f27409b;
            double d23 = (double) f13;
            double d24 = d21 + (d22 * d23);
            double d25 = d23 + (d24 * d12);
            double exp2 = Math.exp((-d22) * d12) * d25;
            double exp3 = d25 * Math.exp((-this.f27409b) * d12);
            double d26 = this.f27409b;
            d10 = (exp3 * (-d26)) + (d24 * Math.exp((-d26) * d12));
            d11 = exp2;
        } else {
            double d27 = this.f27409b;
            double d28 = (double) f13;
            double d29 = (((double) 1) / this.f27413f) * ((((double) f14) * d27 * d28) + ((double) f12));
            double exp4 = Math.exp(((double) (-f14)) * d27 * d12) * ((Math.cos(this.f27413f * d12) * d28) + (Math.sin(this.f27413f * d12) * d29));
            double d30 = this.f27409b;
            float f15 = this.f27414g;
            double d31 = (-d30) * exp4 * ((double) f15);
            double exp5 = Math.exp(((double) (-f15)) * d30 * d12);
            double d32 = this.f27413f;
            double d33 = exp4;
            double sin = (-d32) * d28 * Math.sin(d32 * d12);
            double d34 = this.f27413f;
            d10 = d31 + (exp5 * (sin + (d29 * d34 * Math.cos(d34 * d12))));
            d11 = d33;
        }
        return C2793f0.a((float) (d11 + ((double) this.f27408a)), (float) d10);
    }
}
