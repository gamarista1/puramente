package v;

import c1.d;

/* renamed from: v.m  reason: case insensitive filesystem */
public final class C2730m {

    /* renamed from: a  reason: collision with root package name */
    private final float f26888a;

    /* renamed from: b  reason: collision with root package name */
    private final d f26889b;

    /* renamed from: c  reason: collision with root package name */
    private final float f26890c;

    /* renamed from: v.m$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final float f26891a;

        /* renamed from: b  reason: collision with root package name */
        private final float f26892b;

        /* renamed from: c  reason: collision with root package name */
        private final long f26893c;

        public a(float f10, float f11, long j10) {
            this.f26891a = f10;
            this.f26892b = f11;
            this.f26893c = j10;
        }

        public final float a(long j10) {
            float f10;
            long j11 = this.f26893c;
            if (j11 > 0) {
                f10 = ((float) j10) / ((float) j11);
            } else {
                f10 = 1.0f;
            }
            return this.f26892b * Math.signum(this.f26891a) * C2718a.f26786a.b(f10).a();
        }

        public final float b(long j10) {
            float f10;
            long j11 = this.f26893c;
            if (j11 > 0) {
                f10 = ((float) j10) / ((float) j11);
            } else {
                f10 = 1.0f;
            }
            return (((C2718a.f26786a.b(f10).b() * Math.signum(this.f26891a)) * this.f26892b) / ((float) this.f26893c)) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Float.compare(this.f26891a, aVar.f26891a) == 0 && Float.compare(this.f26892b, aVar.f26892b) == 0 && this.f26893c == aVar.f26893c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f26891a) * 31) + Float.hashCode(this.f26892b)) * 31) + Long.hashCode(this.f26893c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f26891a + ", distance=" + this.f26892b + ", duration=" + this.f26893c + ')';
        }
    }

    public C2730m(float f10, d dVar) {
        this.f26888a = f10;
        this.f26889b = dVar;
        this.f26890c = a(dVar);
    }

    private final float a(d dVar) {
        return C2731n.c(0.84f, dVar.getDensity());
    }

    private final double e(float f10) {
        return C2718a.f26786a.a(f10, this.f26888a * this.f26890c);
    }

    public final float b(float f10) {
        double e10 = e(f10);
        return (float) (((double) (this.f26888a * this.f26890c)) * Math.exp((((double) C2731n.f26894a) / (((double) C2731n.f26894a) - 1.0d)) * e10));
    }

    public final long c(float f10) {
        return (long) (Math.exp(e(f10) / (((double) C2731n.f26894a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f10) {
        double e10 = e(f10);
        double b10 = ((double) C2731n.f26894a) - 1.0d;
        return new a(f10, (float) (((double) (this.f26888a * this.f26890c)) * Math.exp((((double) C2731n.f26894a) / b10) * e10)), (long) (Math.exp(e10 / b10) * 1000.0d));
    }
}
