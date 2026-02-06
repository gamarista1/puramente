package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6559l;

/* renamed from: w.u  reason: case insensitive filesystem */
public final class C2809u {

    /* renamed from: c  reason: collision with root package name */
    public static final b f27606c = new b((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f27607d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final a[][] f27608a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f27609b = true;

    /* renamed from: w.u$a */
    public static final class a {

        /* renamed from: s  reason: collision with root package name */
        public static final C0458a f27610s = new C0458a((DefaultConstructorMarker) null);

        /* renamed from: t  reason: collision with root package name */
        public static final int f27611t = 8;
        /* access modifiers changed from: private */

        /* renamed from: u  reason: collision with root package name */
        public static float[] f27612u;

        /* renamed from: a  reason: collision with root package name */
        private final float f27613a;

        /* renamed from: b  reason: collision with root package name */
        private final float f27614b;

        /* renamed from: c  reason: collision with root package name */
        private final float f27615c;

        /* renamed from: d  reason: collision with root package name */
        private final float f27616d;

        /* renamed from: e  reason: collision with root package name */
        private final float f27617e;

        /* renamed from: f  reason: collision with root package name */
        private final float f27618f;

        /* renamed from: g  reason: collision with root package name */
        private float f27619g;

        /* renamed from: h  reason: collision with root package name */
        private float f27620h;

        /* renamed from: i  reason: collision with root package name */
        private float f27621i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f27622j;

        /* renamed from: k  reason: collision with root package name */
        private final float f27623k;

        /* renamed from: l  reason: collision with root package name */
        private final float f27624l;

        /* renamed from: m  reason: collision with root package name */
        private final float f27625m;

        /* renamed from: n  reason: collision with root package name */
        private final float f27626n;

        /* renamed from: o  reason: collision with root package name */
        private final float f27627o;

        /* renamed from: p  reason: collision with root package name */
        private final float f27628p;

        /* renamed from: q  reason: collision with root package name */
        private final boolean f27629q;

        /* renamed from: r  reason: collision with root package name */
        private final boolean f27630r;

        /* renamed from: w.u$a$a  reason: collision with other inner class name */
        public static final class C0458a {
            public /* synthetic */ C0458a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final float[] b() {
                if (a.f27612u != null) {
                    float[] a10 = a.f27612u;
                    C6496s.e(a10);
                    return a10;
                }
                a.f27612u = new float[91];
                float[] a11 = a.f27612u;
                C6496s.e(a11);
                return a11;
            }

            private C0458a() {
            }
        }

        public a(int i10, float f10, float f11, float f12, float f13, float f14, float f15) {
            boolean z10;
            int i11;
            float f16;
            float f17;
            this.f27613a = f10;
            this.f27614b = f11;
            this.f27615c = f12;
            this.f27616d = f13;
            this.f27617e = f14;
            this.f27618f = f15;
            float f18 = f14 - f12;
            float f19 = f15 - f13;
            boolean z11 = false;
            boolean z12 = true;
            if (i10 == 1 || (i10 == 4 ? f19 > 0.0f : !(i10 != 5 || f19 >= 0.0f))) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f27629q = z10;
            float f20 = ((float) 1) / (f11 - f10);
            this.f27623k = f20;
            z11 = 3 == i10 ? true : z11;
            if (z11 || Math.abs(f18) < 0.001f || Math.abs(f19) < 0.001f) {
                float hypot = (float) Math.hypot((double) f19, (double) f18);
                this.f27619g = hypot;
                this.f27628p = hypot * f20;
                this.f27626n = f18 / (f11 - f10);
                this.f27627o = f19 / (f11 - f10);
                this.f27622j = new float[101];
                this.f27624l = Float.NaN;
                this.f27625m = Float.NaN;
            } else {
                this.f27622j = new float[101];
                if (z10) {
                    i11 = -1;
                } else {
                    i11 = 1;
                }
                this.f27624l = f18 * ((float) i11);
                this.f27625m = f19 * (!z10 ? true : z12 ? 1.0f : 0.0f);
                if (z10) {
                    f16 = f14;
                } else {
                    f16 = f12;
                }
                this.f27626n = f16;
                if (z10) {
                    f17 = f13;
                } else {
                    f17 = f15;
                }
                this.f27627o = f17;
                c(f12, f13, f14, f15);
                this.f27628p = this.f27619g * f20;
                z12 = z11;
            }
            this.f27630r = z12;
        }

        private final void c(float f10, float f11, float f12, float f13) {
            float f14 = f12 - f10;
            float f15 = f11 - f13;
            int length = f27610s.b().length;
            float f16 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            int i10 = 0;
            while (i10 < length) {
                C0458a aVar = f27610s;
                double radians = (double) ((float) Math.toRadians((((double) i10) * 90.0d) / ((double) (aVar.b().length - 1))));
                float sin = ((float) Math.sin(radians)) * f14;
                float cos = ((float) Math.cos(radians)) * f15;
                if (i10 > 0) {
                    f16 += (float) Math.hypot((double) (sin - f17), (double) (cos - f18));
                    aVar.b()[i10] = f16;
                }
                i10++;
                f18 = cos;
                f17 = sin;
            }
            this.f27619g = f16;
            int length2 = f27610s.b().length;
            for (int i11 = 0; i11 < length2; i11++) {
                float[] a10 = f27610s.b();
                a10[i11] = a10[i11] / f16;
            }
            int length3 = this.f27622j.length;
            for (int i12 = 0; i12 < length3; i12++) {
                float length4 = ((float) i12) / ((float) (this.f27622j.length - 1));
                C0458a aVar2 = f27610s;
                int g10 = C6559l.g(aVar2.b(), length4, 0, 0, 6, (Object) null);
                if (g10 >= 0) {
                    this.f27622j[i12] = ((float) g10) / ((float) (aVar2.b().length - 1));
                } else if (g10 == -1) {
                    this.f27622j[i12] = 0.0f;
                } else {
                    int i13 = -g10;
                    int i14 = i13 - 2;
                    this.f27622j[i12] = (((float) i14) + ((length4 - aVar2.b()[i14]) / (aVar2.b()[i13 - 1] - aVar2.b()[i14]))) / ((float) (aVar2.b().length - 1));
                }
            }
        }

        private final float o(float f10) {
            if (f10 <= 0.0f) {
                return 0.0f;
            }
            if (f10 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.f27622j;
            float length = f10 * ((float) (fArr.length - 1));
            int i10 = (int) length;
            float f11 = length - ((float) i10);
            float f12 = fArr[i10];
            return f12 + (f11 * (fArr[i10 + 1] - f12));
        }

        public final float d() {
            float f10 = this.f27624l * this.f27621i;
            float hypot = this.f27628p / ((float) Math.hypot((double) f10, (double) ((-this.f27625m) * this.f27620h)));
            if (this.f27629q) {
                f10 = -f10;
            }
            return f10 * hypot;
        }

        public final float e() {
            float f10 = this.f27624l * this.f27621i;
            float f11 = (-this.f27625m) * this.f27620h;
            float hypot = this.f27628p / ((float) Math.hypot((double) f10, (double) f11));
            if (this.f27629q) {
                return (-f11) * hypot;
            }
            return f11 * hypot;
        }

        public final float f() {
            return this.f27626n + (this.f27624l * this.f27620h);
        }

        public final float g() {
            return this.f27627o + (this.f27625m * this.f27621i);
        }

        public final float h() {
            return this.f27626n;
        }

        public final float i() {
            return this.f27627o;
        }

        public final float j(float f10) {
            float f11 = (f10 - this.f27613a) * this.f27623k;
            float f12 = this.f27615c;
            return f12 + (f11 * (this.f27617e - f12));
        }

        public final float k(float f10) {
            float f11 = (f10 - this.f27613a) * this.f27623k;
            float f12 = this.f27616d;
            return f12 + (f11 * (this.f27618f - f12));
        }

        public final float l() {
            return this.f27613a;
        }

        public final float m() {
            return this.f27614b;
        }

        public final boolean n() {
            return this.f27630r;
        }

        public final void p(float f10) {
            float f11;
            if (this.f27629q) {
                f11 = this.f27614b - f10;
            } else {
                f11 = f10 - this.f27613a;
            }
            double o10 = (double) (o(f11 * this.f27623k) * 1.5707964f);
            this.f27620h = (float) Math.sin(o10);
            this.f27621i = (float) Math.cos(o10);
        }
    }

    /* renamed from: w.u$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r9 != 5) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r7 == 1) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e A[LOOP:1: B:17:0x003c->B:18:0x003e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2809u(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.f27609b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            w.u$a[][] r4 = new w.C2809u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L_0x0012:
            if (r6 >= r3) goto L_0x006e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L_0x0027
            if (r9 == r2) goto L_0x0030
            if (r9 == r11) goto L_0x002e
            if (r9 == r10) goto L_0x0029
            r10 = 4
            if (r9 == r10) goto L_0x0027
            r10 = 5
            if (r9 == r10) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            r8 = r10
            goto L_0x0032
        L_0x0029:
            if (r7 != r2) goto L_0x0030
            goto L_0x002e
        L_0x002c:
            r8 = r7
            goto L_0x0032
        L_0x002e:
            r7 = r11
            goto L_0x002c
        L_0x0030:
            r7 = r2
            goto L_0x002c
        L_0x0032:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            w.u$a[] r9 = new w.C2809u.a[r10]
            r11 = r5
        L_0x003c:
            if (r11 >= r10) goto L_0x0069
            int r12 = r11 * 2
            w.u$a r20 = new w.u$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L_0x003c
        L_0x0069:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L_0x0012
        L_0x006e:
            r0.f27608a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2809u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r9 > r0[r0.length - 1][0].m()) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(float r9, float[] r10) {
        /*
            r8 = this;
            boolean r0 = r8.f27609b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00d4
            w.u$a[][] r0 = r8.f27608a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0024
            w.u$a[][] r0 = r8.f27608a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
        L_0x0024:
            w.u$a[][] r0 = r8.f27608a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0043
            w.u$a[][] r0 = r8.f27608a
            int r3 = r0.length
            int r3 = r3 - r1
            int r4 = r0.length
            int r4 = r4 - r1
            r0 = r0[r4]
            r0 = r0[r2]
            float r0 = r0.m()
            goto L_0x004e
        L_0x0043:
            w.u$a[][] r0 = r8.f27608a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            r3 = r2
        L_0x004e:
            float r9 = r9 - r0
            r1 = r2
        L_0x0050:
            int r4 = r10.length
            if (r2 >= r4) goto L_0x00d3
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r1]
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0092
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r1]
            float r4 = r4.j(r0)
            w.u$a[][] r5 = r8.f27608a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.h()
            float r5 = r5 * r9
            float r4 = r4 + r5
            r10[r2] = r4
            int r4 = r2 + 1
            w.u$a[][] r5 = r8.f27608a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.k(r0)
            w.u$a[][] r6 = r8.f27608a
            r6 = r6[r3]
            r6 = r6[r1]
            float r6 = r6.i()
            float r6 = r6 * r9
            float r5 = r5 + r6
            r10[r4] = r5
            goto L_0x00cd
        L_0x0092:
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r1]
            r4.p(r0)
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r1]
            float r4 = r4.f()
            w.u$a[][] r5 = r8.f27608a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.d()
            float r5 = r5 * r9
            float r4 = r4 + r5
            r10[r2] = r4
            int r4 = r2 + 1
            w.u$a[][] r5 = r8.f27608a
            r5 = r5[r3]
            r5 = r5[r1]
            float r5 = r5.g()
            w.u$a[][] r6 = r8.f27608a
            r6 = r6[r3]
            r6 = r6[r1]
            float r6 = r6.e()
            float r6 = r6 * r9
            float r5 = r5 + r6
            r10[r4] = r5
        L_0x00cd:
            int r2 = r2 + 2
            int r1 = r1 + 1
            goto L_0x0050
        L_0x00d3:
            return
        L_0x00d4:
            w.u$a[][] r0 = r8.f27608a
            r0 = r0[r2]
            r0 = r0[r2]
            float r0 = r0.l()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ec
            w.u$a[][] r9 = r8.f27608a
            r9 = r9[r2]
            r9 = r9[r2]
            float r9 = r9.l()
        L_0x00ec:
            w.u$a[][] r0 = r8.f27608a
            int r3 = r0.length
            int r3 = r3 - r1
            r0 = r0[r3]
            r0 = r0[r2]
            float r0 = r0.m()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0108
            w.u$a[][] r9 = r8.f27608a
            int r0 = r9.length
            int r0 = r0 - r1
            r9 = r9[r0]
            r9 = r9[r2]
            float r9 = r9.m()
        L_0x0108:
            w.u$a[][] r0 = r8.f27608a
            int r0 = r0.length
            r3 = r2
            r4 = r3
        L_0x010d:
            if (r3 >= r0) goto L_0x0179
            r5 = r2
            r6 = r5
        L_0x0111:
            int r7 = r10.length
            if (r5 >= r7) goto L_0x0173
            w.u$a[][] r7 = r8.f27608a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.m()
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x016e
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r6]
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x014a
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r6]
            float r4 = r4.j(r9)
            r10[r5] = r4
            int r4 = r5 + 1
            w.u$a[][] r7 = r8.f27608a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.k(r9)
            r10[r4] = r7
        L_0x0148:
            r4 = r1
            goto L_0x016e
        L_0x014a:
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r6]
            r4.p(r9)
            w.u$a[][] r4 = r8.f27608a
            r4 = r4[r3]
            r4 = r4[r6]
            float r4 = r4.f()
            r10[r5] = r4
            int r4 = r5 + 1
            w.u$a[][] r7 = r8.f27608a
            r7 = r7[r3]
            r7 = r7[r6]
            float r7 = r7.g()
            r10[r4] = r7
            goto L_0x0148
        L_0x016e:
            int r5 = r5 + 2
            int r6 = r6 + 1
            goto L_0x0111
        L_0x0173:
            if (r4 == 0) goto L_0x0176
            return
        L_0x0176:
            int r3 = r3 + 1
            goto L_0x010d
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2809u.a(float, float[]):void");
    }

    public final void b(float f10, float[] fArr) {
        if (f10 < this.f27608a[0][0].l()) {
            f10 = this.f27608a[0][0].l();
        } else {
            a[][] aVarArr = this.f27608a;
            if (f10 > aVarArr[aVarArr.length - 1][0].m()) {
                a[][] aVarArr2 = this.f27608a;
                f10 = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.f27608a.length;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < length) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < fArr.length) {
                if (f10 <= this.f27608a[i10][i12].m()) {
                    if (this.f27608a[i10][i12].n()) {
                        fArr[i11] = this.f27608a[i10][i12].h();
                        fArr[i11 + 1] = this.f27608a[i10][i12].i();
                    } else {
                        this.f27608a[i10][i12].p(f10);
                        fArr[i11] = this.f27608a[i10][i12].d();
                        fArr[i11 + 1] = this.f27608a[i10][i12].e();
                    }
                    z10 = true;
                }
                i11 += 2;
                i12++;
            }
            if (!z10) {
                i10++;
            } else {
                return;
            }
        }
    }
}
