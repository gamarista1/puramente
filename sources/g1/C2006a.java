package g1;

import java.util.Arrays;

/* renamed from: g1.a  reason: case insensitive filesystem */
public class C2006a extends C2007b {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f20864a;

    /* renamed from: b  reason: collision with root package name */
    C0348a[] f20865b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f20866c = true;

    /* renamed from: g1.a$a  reason: collision with other inner class name */
    private static class C0348a {

        /* renamed from: s  reason: collision with root package name */
        private static double[] f20867s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        double[] f20868a;

        /* renamed from: b  reason: collision with root package name */
        double f20869b;

        /* renamed from: c  reason: collision with root package name */
        double f20870c;

        /* renamed from: d  reason: collision with root package name */
        double f20871d;

        /* renamed from: e  reason: collision with root package name */
        double f20872e;

        /* renamed from: f  reason: collision with root package name */
        double f20873f;

        /* renamed from: g  reason: collision with root package name */
        double f20874g;

        /* renamed from: h  reason: collision with root package name */
        double f20875h;

        /* renamed from: i  reason: collision with root package name */
        double f20876i;

        /* renamed from: j  reason: collision with root package name */
        double f20877j;

        /* renamed from: k  reason: collision with root package name */
        double f20878k;

        /* renamed from: l  reason: collision with root package name */
        double f20879l;

        /* renamed from: m  reason: collision with root package name */
        double f20880m;

        /* renamed from: n  reason: collision with root package name */
        double f20881n;

        /* renamed from: o  reason: collision with root package name */
        double f20882o;

        /* renamed from: p  reason: collision with root package name */
        double f20883p;

        /* renamed from: q  reason: collision with root package name */
        boolean f20884q;

        /* renamed from: r  reason: collision with root package name */
        boolean f20885r = false;

        C0348a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            int i11;
            double d16;
            double d17;
            int i12 = i10;
            double d18 = d10;
            double d19 = d11;
            double d20 = d12;
            double d21 = d13;
            double d22 = d14 - d20;
            double d23 = d15 - d21;
            int i13 = 1;
            if (i12 == 1) {
                this.f20884q = true;
            } else if (i12 == 4) {
                this.f20884q = d23 > 0.0d;
            } else if (i12 != 5) {
                this.f20884q = false;
            } else {
                this.f20884q = d23 < 0.0d;
            }
            this.f20870c = d18;
            this.f20871d = d19;
            this.f20876i = 1.0d / (d19 - d18);
            if (3 == i12) {
                this.f20885r = true;
            }
            if (this.f20885r || Math.abs(d22) < 0.001d || Math.abs(d23) < 0.001d) {
                this.f20885r = true;
                this.f20872e = d20;
                double d24 = d23;
                this.f20873f = d14;
                this.f20874g = d21;
                this.f20875h = d15;
                double hypot = Math.hypot(d24, d22);
                this.f20869b = hypot;
                this.f20881n = hypot * this.f20876i;
                double d25 = this.f20871d;
                double d26 = this.f20870c;
                this.f20879l = d22 / (d25 - d26);
                this.f20880m = d24 / (d25 - d26);
                return;
            }
            this.f20868a = new double[101];
            boolean z10 = this.f20884q;
            if (z10) {
                i11 = -1;
            } else {
                i11 = 1;
            }
            this.f20877j = d22 * ((double) i11);
            this.f20878k = d23 * ((double) (!z10 ? -1 : i13));
            if (z10) {
                d16 = d14;
            } else {
                d16 = d20;
            }
            this.f20879l = d16;
            if (z10) {
                d17 = d21;
            } else {
                d17 = d15;
            }
            this.f20880m = d17;
            a(d12, d13, d14, d15);
            this.f20881n = this.f20869b * this.f20876i;
        }

        private void a(double d10, double d11, double d12, double d13) {
            double d14;
            double d15 = d12 - d10;
            double d16 = d11 - d13;
            int i10 = 0;
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            while (true) {
                double[] dArr = f20867s;
                if (i10 >= dArr.length) {
                    break;
                }
                double d20 = d17;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d15;
                double cos = Math.cos(radians) * d16;
                if (i10 > 0) {
                    d14 = Math.hypot(sin - d18, cos - d19) + d20;
                    f20867s[i10] = d14;
                } else {
                    d14 = d20;
                }
                i10++;
                d19 = cos;
                double d21 = sin;
                d17 = d14;
                d18 = d21;
            }
            double d22 = d17;
            this.f20869b = d22;
            int i11 = 0;
            while (true) {
                double[] dArr2 = f20867s;
                if (i11 >= dArr2.length) {
                    break;
                }
                dArr2[i11] = dArr2[i11] / d22;
                i11++;
            }
            int i12 = 0;
            while (true) {
                double[] dArr3 = this.f20868a;
                if (i12 < dArr3.length) {
                    double length = ((double) i12) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f20867s, length);
                    if (binarySearch >= 0) {
                        this.f20868a[i12] = ((double) binarySearch) / ((double) (f20867s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f20868a[i12] = 0.0d;
                    } else {
                        int i13 = -binarySearch;
                        int i14 = i13 - 2;
                        double[] dArr4 = f20867s;
                        double d23 = dArr4[i14];
                        this.f20868a[i12] = (((double) i14) + ((length - d23) / (dArr4[i13 - 1] - d23))) / ((double) (dArr4.length - 1));
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public double b() {
            double d10 = this.f20877j * this.f20883p;
            double hypot = this.f20881n / Math.hypot(d10, (-this.f20878k) * this.f20882o);
            if (this.f20884q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double c() {
            double d10 = this.f20877j * this.f20883p;
            double d11 = (-this.f20878k) * this.f20882o;
            double hypot = this.f20881n / Math.hypot(d10, d11);
            if (this.f20884q) {
                return (-d11) * hypot;
            }
            return d11 * hypot;
        }

        public double d(double d10) {
            return this.f20879l;
        }

        public double e(double d10) {
            return this.f20880m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f20870c) * this.f20876i;
            double d12 = this.f20872e;
            return d12 + (d11 * (this.f20873f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f20870c) * this.f20876i;
            double d12 = this.f20874g;
            return d12 + (d11 * (this.f20875h - d12));
        }

        /* access modifiers changed from: package-private */
        public double h() {
            return this.f20879l + (this.f20877j * this.f20882o);
        }

        /* access modifiers changed from: package-private */
        public double i() {
            return this.f20880m + (this.f20878k * this.f20883p);
        }

        /* access modifiers changed from: package-private */
        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f20868a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        /* access modifiers changed from: package-private */
        public void k(double d10) {
            double d11;
            if (this.f20884q) {
                d11 = this.f20871d - d10;
            } else {
                d11 = d10 - this.f20870c;
            }
            double j10 = j(d11 * this.f20876i) * 1.5707963267948966d;
            this.f20882o = Math.sin(j10);
            this.f20883p = Math.cos(j10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r5 == 1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2006a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f20866c = r2
            r0.f20864a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            g1.a$a[] r3 = new g1.C2006a.C0348a[r3]
            r0.f20865b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L_0x0016:
            g1.a$a[] r7 = r0.f20865b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0058
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L_0x002e
            if (r8 == r2) goto L_0x0037
            r10 = 2
            if (r8 == r10) goto L_0x0035
            if (r8 == r9) goto L_0x0030
            r9 = 4
            if (r8 == r9) goto L_0x002e
            r9 = 5
            if (r8 == r9) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            r6 = r9
            goto L_0x0039
        L_0x0030:
            if (r5 != r2) goto L_0x0037
            goto L_0x0035
        L_0x0033:
            r6 = r5
            goto L_0x0039
        L_0x0035:
            r5 = r10
            goto L_0x0033
        L_0x0037:
            r5 = r2
            goto L_0x0033
        L_0x0039:
            g1.a$a r22 = new g1.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0016
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.C2006a.<init>(int[], double[], double[][]):void");
    }

    public double c(double d10, int i10) {
        double g10;
        double e10;
        double i11;
        double c10;
        double g11;
        double e11;
        int i12 = 0;
        if (this.f20866c) {
            C0348a[] aVarArr = this.f20865b;
            C0348a aVar = aVarArr[0];
            double d11 = aVar.f20870c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f20885r) {
                    if (i10 == 0) {
                        g11 = aVar.f(d11);
                        e11 = this.f20865b[0].d(d11);
                    } else {
                        g11 = aVar.g(d11);
                        e11 = this.f20865b[0].e(d11);
                    }
                    return g11 + (d12 * e11);
                }
                aVar.k(d11);
                if (i10 == 0) {
                    i11 = this.f20865b[0].h();
                    c10 = this.f20865b[0].b();
                } else {
                    i11 = this.f20865b[0].i();
                    c10 = this.f20865b[0].c();
                }
                return i11 + (d12 * c10);
            } else if (d10 > aVarArr[aVarArr.length - 1].f20871d) {
                double d13 = aVarArr[aVarArr.length - 1].f20871d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                if (i10 == 0) {
                    g10 = aVarArr[length].f(d13);
                    e10 = this.f20865b[length].d(d13);
                } else {
                    g10 = aVarArr[length].g(d13);
                    e10 = this.f20865b[length].e(d13);
                }
                return g10 + (d14 * e10);
            }
        } else {
            C0348a[] aVarArr2 = this.f20865b;
            double d15 = aVarArr2[0].f20870c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f20871d) {
                d10 = aVarArr2[aVarArr2.length - 1].f20871d;
            }
        }
        while (true) {
            C0348a[] aVarArr3 = this.f20865b;
            if (i12 >= aVarArr3.length) {
                return Double.NaN;
            }
            C0348a aVar2 = aVarArr3[i12];
            if (d10 > aVar2.f20871d) {
                i12++;
            } else if (!aVar2.f20885r) {
                aVar2.k(d10);
                if (i10 == 0) {
                    return this.f20865b[i12].h();
                }
                return this.f20865b[i12].i();
            } else if (i10 == 0) {
                return aVar2.f(d10);
            } else {
                return aVar2.g(d10);
            }
        }
    }

    public void d(double d10, double[] dArr) {
        if (this.f20866c) {
            C0348a[] aVarArr = this.f20865b;
            C0348a aVar = aVarArr[0];
            double d11 = aVar.f20870c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f20885r) {
                    dArr[0] = aVar.f(d11) + (this.f20865b[0].d(d11) * d12);
                    dArr[1] = this.f20865b[0].g(d11) + (d12 * this.f20865b[0].e(d11));
                    return;
                }
                aVar.k(d11);
                dArr[0] = this.f20865b[0].h() + (this.f20865b[0].b() * d12);
                dArr[1] = this.f20865b[0].i() + (d12 * this.f20865b[0].c());
                return;
            } else if (d10 > aVarArr[aVarArr.length - 1].f20871d) {
                double d13 = aVarArr[aVarArr.length - 1].f20871d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                C0348a aVar2 = aVarArr[length];
                if (aVar2.f20885r) {
                    dArr[0] = aVar2.f(d13) + (this.f20865b[length].d(d13) * d14);
                    dArr[1] = this.f20865b[length].g(d13) + (d14 * this.f20865b[length].e(d13));
                    return;
                }
                aVar2.k(d10);
                dArr[0] = this.f20865b[length].h() + (this.f20865b[length].b() * d14);
                dArr[1] = this.f20865b[length].i() + (d14 * this.f20865b[length].c());
                return;
            }
        } else {
            C0348a[] aVarArr2 = this.f20865b;
            double d15 = aVarArr2[0].f20870c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > aVarArr2[aVarArr2.length - 1].f20871d) {
                d10 = aVarArr2[aVarArr2.length - 1].f20871d;
            }
        }
        int i10 = 0;
        while (true) {
            C0348a[] aVarArr3 = this.f20865b;
            if (i10 < aVarArr3.length) {
                C0348a aVar3 = aVarArr3[i10];
                if (d10 > aVar3.f20871d) {
                    i10++;
                } else if (aVar3.f20885r) {
                    dArr[0] = aVar3.f(d10);
                    dArr[1] = this.f20865b[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    dArr[0] = this.f20865b[i10].h();
                    dArr[1] = this.f20865b[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void e(double d10, float[] fArr) {
        if (this.f20866c) {
            C0348a[] aVarArr = this.f20865b;
            C0348a aVar = aVarArr[0];
            double d11 = aVar.f20870c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f20885r) {
                    fArr[0] = (float) (aVar.f(d11) + (this.f20865b[0].d(d11) * d12));
                    fArr[1] = (float) (this.f20865b[0].g(d11) + (d12 * this.f20865b[0].e(d11)));
                    return;
                }
                aVar.k(d11);
                fArr[0] = (float) (this.f20865b[0].h() + (this.f20865b[0].b() * d12));
                fArr[1] = (float) (this.f20865b[0].i() + (d12 * this.f20865b[0].c()));
                return;
            } else if (d10 > aVarArr[aVarArr.length - 1].f20871d) {
                double d13 = aVarArr[aVarArr.length - 1].f20871d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                C0348a aVar2 = aVarArr[length];
                if (aVar2.f20885r) {
                    fArr[0] = (float) (aVar2.f(d13) + (this.f20865b[length].d(d13) * d14));
                    fArr[1] = (float) (this.f20865b[length].g(d13) + (d14 * this.f20865b[length].e(d13)));
                    return;
                }
                aVar2.k(d10);
                fArr[0] = (float) this.f20865b[length].h();
                fArr[1] = (float) this.f20865b[length].i();
                return;
            }
        } else {
            C0348a[] aVarArr2 = this.f20865b;
            double d15 = aVarArr2[0].f20870c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f20871d) {
                d10 = aVarArr2[aVarArr2.length - 1].f20871d;
            }
        }
        int i10 = 0;
        while (true) {
            C0348a[] aVarArr3 = this.f20865b;
            if (i10 < aVarArr3.length) {
                C0348a aVar3 = aVarArr3[i10];
                if (d10 > aVar3.f20871d) {
                    i10++;
                } else if (aVar3.f20885r) {
                    fArr[0] = (float) aVar3.f(d10);
                    fArr[1] = (float) this.f20865b[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    fArr[0] = (float) this.f20865b[i10].h();
                    fArr[1] = (float) this.f20865b[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void f(double d10, double[] dArr) {
        C0348a[] aVarArr = this.f20865b;
        double d11 = aVarArr[0].f20870c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f20871d) {
            d10 = aVarArr[aVarArr.length - 1].f20871d;
        }
        int i10 = 0;
        while (true) {
            C0348a[] aVarArr2 = this.f20865b;
            if (i10 < aVarArr2.length) {
                C0348a aVar = aVarArr2[i10];
                if (d10 > aVar.f20871d) {
                    i10++;
                } else if (aVar.f20885r) {
                    dArr[0] = aVar.d(d10);
                    dArr[1] = this.f20865b[i10].e(d10);
                    return;
                } else {
                    aVar.k(d10);
                    dArr[0] = this.f20865b[i10].b();
                    dArr[1] = this.f20865b[i10].c();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public double[] g() {
        return this.f20864a;
    }
}
