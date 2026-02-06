package g1;

/* renamed from: g1.b  reason: case insensitive filesystem */
public abstract class C2007b {

    /* renamed from: g1.b$a */
    static class a extends C2007b {

        /* renamed from: a  reason: collision with root package name */
        double f20886a;

        /* renamed from: b  reason: collision with root package name */
        double[] f20887b;

        a(double d10, double[] dArr) {
            this.f20886a = d10;
            this.f20887b = dArr;
        }

        public double c(double d10, int i10) {
            return this.f20887b[i10];
        }

        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f20887b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f20887b;
                if (i10 < dArr.length) {
                    fArr[i10] = (float) dArr[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f20887b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        public double[] g() {
            return new double[]{this.f20886a};
        }
    }

    public static C2007b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        if (i10 == 0) {
            return new g(dArr, dArr2);
        }
        if (i10 != 2) {
            return new f(dArr, dArr2);
        }
        return new a(dArr[0], dArr2[0]);
    }

    public static C2007b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C2006a(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
