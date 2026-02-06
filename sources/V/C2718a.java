package v;

import Ef.m;

/* renamed from: v.a  reason: case insensitive filesystem */
public final class C2718a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2718a f26786a = new C2718a();

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f26787b;

    /* renamed from: c  reason: collision with root package name */
    private static final float[] f26788c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f26789d = 8;

    /* renamed from: v.a$a  reason: collision with other inner class name */
    public static final class C0444a {

        /* renamed from: a  reason: collision with root package name */
        private final float f26790a;

        /* renamed from: b  reason: collision with root package name */
        private final float f26791b;

        public C0444a(float f10, float f11) {
            this.f26790a = f10;
            this.f26791b = f11;
        }

        public final float a() {
            return this.f26790a;
        }

        public final float b() {
            return this.f26791b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0444a)) {
                return false;
            }
            C0444a aVar = (C0444a) obj;
            if (Float.compare(this.f26790a, aVar.f26790a) == 0 && Float.compare(this.f26791b, aVar.f26791b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f26790a) * 31) + Float.hashCode(this.f26791b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f26790a + ", velocityCoefficient=" + this.f26791b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f26787b = fArr;
        float[] fArr2 = new float[101];
        f26788c = fArr2;
        C2740w.b(fArr, fArr2, 100);
    }

    private C2718a() {
    }

    public final double a(float f10, float f11) {
        return Math.log(((double) (Math.abs(f10) * 0.35f)) / ((double) f11));
    }

    public final C0444a b(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float k10 = m.k(f10, 0.0f, 1.0f);
        float f13 = (float) 100;
        int i10 = (int) (f13 * k10);
        if (i10 < 100) {
            float f14 = ((float) i10) / f13;
            int i11 = i10 + 1;
            float f15 = ((float) i11) / f13;
            float[] fArr = f26787b;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f17;
            f12 = ((k10 - f14) * f17) + f16;
        }
        return new C0444a(f12, f11);
    }
}
