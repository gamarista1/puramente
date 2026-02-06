package g1;

public class f extends C2007b {

    /* renamed from: a  reason: collision with root package name */
    private double[] f20927a;

    /* renamed from: b  reason: collision with root package name */
    private double[][] f20928b;

    /* renamed from: c  reason: collision with root package name */
    private double f20929c = Double.NaN;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20930d = true;

    /* renamed from: e  reason: collision with root package name */
    double[] f20931e;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr2[0].length;
        this.f20931e = new double[length];
        this.f20927a = dArr;
        this.f20928b = dArr2;
        if (length > 2) {
            int i10 = 0;
            double d10 = 0.0d;
            while (true) {
                double d11 = d10;
                if (i10 < dArr.length) {
                    double d12 = dArr2[i10][0];
                    if (i10 > 0) {
                        Math.hypot(d12 - d10, d12 - d11);
                    }
                    i10++;
                    d10 = d12;
                } else {
                    this.f20929c = 0.0d;
                    return;
                }
            }
        }
    }

    public double c(double d10, int i10) {
        double d11;
        double d12;
        double h10;
        double[] dArr = this.f20927a;
        int length = dArr.length;
        int i11 = 0;
        if (this.f20930d) {
            double d13 = dArr[0];
            if (d10 <= d13) {
                d11 = this.f20928b[0][i10];
                d12 = d10 - d13;
                h10 = h(d13, i10);
            } else {
                int i12 = length - 1;
                double d14 = dArr[i12];
                if (d10 >= d14) {
                    d11 = this.f20928b[i12][i10];
                    d12 = d10 - d14;
                    h10 = h(d14, i10);
                }
            }
            return d11 + (d12 * h10);
        } else if (d10 <= dArr[0]) {
            return this.f20928b[0][i10];
        } else {
            int i13 = length - 1;
            if (d10 >= dArr[i13]) {
                return this.f20928b[i13][i10];
            }
        }
        while (i11 < length - 1) {
            double[] dArr2 = this.f20927a;
            double d15 = dArr2[i11];
            if (d10 == d15) {
                return this.f20928b[i11][i10];
            }
            int i14 = i11 + 1;
            double d16 = dArr2[i14];
            if (d10 < d16) {
                double d17 = (d10 - d15) / (d16 - d15);
                double[][] dArr3 = this.f20928b;
                return (dArr3[i11][i10] * (1.0d - d17)) + (dArr3[i14][i10] * d17);
            }
            i11 = i14;
        }
        return 0.0d;
    }

    public void d(double d10, double[] dArr) {
        double[] dArr2 = this.f20927a;
        int length = dArr2.length;
        int i10 = 0;
        int length2 = this.f20928b[0].length;
        if (this.f20930d) {
            double d11 = dArr2[0];
            if (d10 <= d11) {
                f(d11, this.f20931e);
                for (int i11 = 0; i11 < length2; i11++) {
                    dArr[i11] = this.f20928b[0][i11] + ((d10 - this.f20927a[0]) * this.f20931e[i11]);
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr2[i12];
            if (d10 >= d12) {
                f(d12, this.f20931e);
                while (i10 < length2) {
                    dArr[i10] = this.f20928b[i12][i10] + ((d10 - this.f20927a[i12]) * this.f20931e[i10]);
                    i10++;
                }
                return;
            }
        } else if (d10 <= dArr2[0]) {
            for (int i13 = 0; i13 < length2; i13++) {
                dArr[i13] = this.f20928b[0][i13];
            }
            return;
        } else {
            int i14 = length - 1;
            if (d10 >= dArr2[i14]) {
                while (i10 < length2) {
                    dArr[i10] = this.f20928b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f20927a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    dArr[i16] = this.f20928b[i15][i16];
                }
            }
            double[] dArr3 = this.f20927a;
            int i17 = i15 + 1;
            double d13 = dArr3[i17];
            if (d10 < d13) {
                double d14 = dArr3[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr4 = this.f20928b;
                    dArr[i10] = (dArr4[i15][i10] * (1.0d - d15)) + (dArr4[i17][i10] * d15);
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    public void e(double d10, float[] fArr) {
        double[] dArr = this.f20927a;
        int length = dArr.length;
        int i10 = 0;
        int length2 = this.f20928b[0].length;
        if (this.f20930d) {
            double d11 = dArr[0];
            if (d10 <= d11) {
                f(d11, this.f20931e);
                for (int i11 = 0; i11 < length2; i11++) {
                    fArr[i11] = (float) (this.f20928b[0][i11] + ((d10 - this.f20927a[0]) * this.f20931e[i11]));
                }
                return;
            }
            int i12 = length - 1;
            double d12 = dArr[i12];
            if (d10 >= d12) {
                f(d12, this.f20931e);
                while (i10 < length2) {
                    fArr[i10] = (float) (this.f20928b[i12][i10] + ((d10 - this.f20927a[i12]) * this.f20931e[i10]));
                    i10++;
                }
                return;
            }
        } else if (d10 <= dArr[0]) {
            for (int i13 = 0; i13 < length2; i13++) {
                fArr[i13] = (float) this.f20928b[0][i13];
            }
            return;
        } else {
            int i14 = length - 1;
            if (d10 >= dArr[i14]) {
                while (i10 < length2) {
                    fArr[i10] = (float) this.f20928b[i14][i10];
                    i10++;
                }
                return;
            }
        }
        int i15 = 0;
        while (i15 < length - 1) {
            if (d10 == this.f20927a[i15]) {
                for (int i16 = 0; i16 < length2; i16++) {
                    fArr[i16] = (float) this.f20928b[i15][i16];
                }
            }
            double[] dArr2 = this.f20927a;
            int i17 = i15 + 1;
            double d13 = dArr2[i17];
            if (d10 < d13) {
                double d14 = dArr2[i15];
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    double[][] dArr3 = this.f20928b;
                    fArr[i10] = (float) ((dArr3[i15][i10] * (1.0d - d15)) + (dArr3[i17][i10] * d15));
                    i10++;
                }
                return;
            }
            i15 = i17;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r13 >= r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.f20927a
            int r1 = r0.length
            double[][] r2 = r12.f20928b
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0011
        L_0x000f:
            r13 = r4
            goto L_0x001a
        L_0x0011:
            int r4 = r1 + -1
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x001a
            goto L_0x000f
        L_0x001a:
            r0 = r3
        L_0x001b:
            int r4 = r1 + -1
            if (r0 >= r4) goto L_0x0041
            double[] r4 = r12.f20927a
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x003f
            r13 = r4[r0]
            double r6 = r6 - r13
        L_0x002c:
            if (r3 >= r2) goto L_0x0041
            double[][] r13 = r12.f20928b
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L_0x002c
        L_0x003f:
            r0 = r5
            goto L_0x001b
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.f(double, double[]):void");
    }

    public double[] g() {
        return this.f20927a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r8 >= r3) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public double h(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.f20927a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x000c
        L_0x000a:
            r8 = r3
            goto L_0x0015
        L_0x000c:
            int r3 = r1 + -1
            r3 = r0[r3]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            int r0 = r1 + -1
            if (r2 >= r0) goto L_0x0035
            double[] r0 = r7.f20927a
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0033
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r8 = r7.f20928b
            r9 = r8[r2]
            r0 = r9[r10]
            r8 = r8[r3]
            r9 = r8[r10]
            double r9 = r9 - r0
            double r9 = r9 / r4
            return r9
        L_0x0033:
            r2 = r3
            goto L_0x0015
        L_0x0035:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.f.h(double, int):double");
    }
}
