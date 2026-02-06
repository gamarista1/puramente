package f3;

import f3.K;
import i2.C2073A;
import i2.C2076a;
import j2.d;
import java.util.Arrays;
import z2.O;
import z2.r;

public final class n implements C1997m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f20581q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f20582a;

    /* renamed from: b  reason: collision with root package name */
    private O f20583b;

    /* renamed from: c  reason: collision with root package name */
    private final M f20584c;

    /* renamed from: d  reason: collision with root package name */
    private final C2073A f20585d;

    /* renamed from: e  reason: collision with root package name */
    private final w f20586e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f20587f;

    /* renamed from: g  reason: collision with root package name */
    private final a f20588g;

    /* renamed from: h  reason: collision with root package name */
    private long f20589h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20590i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20591j;

    /* renamed from: k  reason: collision with root package name */
    private long f20592k;

    /* renamed from: l  reason: collision with root package name */
    private long f20593l;

    /* renamed from: m  reason: collision with root package name */
    private long f20594m;

    /* renamed from: n  reason: collision with root package name */
    private long f20595n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f20596o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20597p;

    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f20598e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f20599a;

        /* renamed from: b  reason: collision with root package name */
        public int f20600b;

        /* renamed from: c  reason: collision with root package name */
        public int f20601c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f20602d;

        public a(int i10) {
            this.f20602d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f20599a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f20602d;
                int length = bArr2.length;
                int i13 = this.f20600b;
                if (length < i13 + i12) {
                    this.f20602d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f20602d, this.f20600b, i12);
                this.f20600b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f20599a) {
                int i12 = this.f20600b - i11;
                this.f20600b = i12;
                if (this.f20601c == 0 && i10 == 181) {
                    this.f20601c = i12;
                } else {
                    this.f20599a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f20599a = true;
            }
            byte[] bArr = f20598e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f20599a = false;
            this.f20600b = 0;
            this.f20601c = 0;
        }
    }

    public n() {
        this((M) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair f(f3.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f20602d
            int r1 = r8.f20600b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            byte r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            byte r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            byte r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            byte r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L_0x003e
            r7 = 3
            if (r6 == r7) goto L_0x0038
            if (r6 == r1) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0030:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L_0x0035:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L_0x0044
        L_0x0038:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L_0x0035
        L_0x003e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L_0x0035
        L_0x0044:
            f2.s$b r6 = new f2.s$b
            r6.<init>()
            f2.s$b r9 = r6.a0(r9)
            java.lang.String r6 = "video/mpeg2"
            f2.s$b r9 = r9.o0(r6)
            f2.s$b r9 = r9.t0(r2)
            f2.s$b r9 = r9.Y(r4)
            f2.s$b r9 = r9.k0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            f2.s$b r9 = r9.b0(r1)
            f2.s r9 = r9.K()
            byte r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0098
            double[] r2 = f20581q
            int r4 = r2.length
            if (r1 >= r4) goto L_0x0098
            r1 = r2[r1]
            int r8 = r8.f20601c
            int r8 = r8 + 9
            byte r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L_0x0090
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L_0x0090:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L_0x009a
        L_0x0098:
            r0 = 0
        L_0x009a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.n.f(f3.n$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        d.a(this.f20587f);
        this.f20588g.c();
        w wVar = this.f20586e;
        if (wVar != null) {
            wVar.d();
        }
        this.f20589h = 0;
        this.f20590i = false;
        this.f20593l = -9223372036854775807L;
        this.f20595n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(i2.C2073A r21) {
        /*
            r20 = this;
            r0 = r20
            z2.O r1 = r0.f20583b
            i2.C2076a.i(r1)
            int r1 = r21.f()
            int r2 = r21.g()
            byte[] r3 = r21.e()
            long r4 = r0.f20589h
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f20589h = r4
            z2.O r4 = r0.f20583b
            int r5 = r21.a()
            r6 = r21
            r4.f(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f20587f
            int r4 = j2.d.c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f20591j
            if (r4 != 0) goto L_0x0039
            f3.n$a r4 = r0.f20588g
            r4.a(r3, r1, r2)
        L_0x0039:
            f3.w r4 = r0.f20586e
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.e()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f20591j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            f3.n$a r9 = r0.f20588g
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = r10
        L_0x005f:
            f3.n$a r12 = r0.f20588g
            boolean r9 = r12.b(r5, r9)
            if (r9 == 0) goto L_0x008a
            f3.n$a r9 = r0.f20588g
            java.lang.String r12 = r0.f20582a
            java.lang.Object r12 = i2.C2076a.e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = f(r9, r12)
            z2.O r12 = r0.f20583b
            java.lang.Object r13 = r9.first
            f2.s r13 = (f2.s) r13
            r12.c(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f20592k = r12
            r0.f20591j = r11
        L_0x008a:
            f3.w r9 = r0.f20586e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = r10
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            f3.w r8 = r0.f20586e
            boolean r1 = r8.b(r1)
            if (r1 == 0) goto L_0x00c6
            f3.w r1 = r0.f20586e
            byte[] r8 = r1.f20778d
            int r1 = r1.f20779e
            int r1 = j2.d.r(r8, r1)
            i2.A r8 = r0.f20585d
            java.lang.Object r8 = i2.L.h(r8)
            i2.A r8 = (i2.C2073A) r8
            f3.w r9 = r0.f20586e
            byte[] r9 = r9.f20778d
            r8.S(r9, r1)
            f3.M r1 = r0.f20584c
            java.lang.Object r1 = i2.L.h(r1)
            f3.M r1 = (f3.M) r1
            long r8 = r0.f20595n
            i2.A r12 = r0.f20585d
            r1.a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.e()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            f3.w r1 = r0.f20586e
            r1.e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f20596o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f20597p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f20591j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f20595n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f20596o
            long r11 = r0.f20589h
            r19 = r5
            long r4 = r0.f20594m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            z2.O r12 = r0.f20583b
            r18 = 0
            r17 = r1
            r12.d(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f20590i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f20597p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f20589h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f20594m = r4
            long r4 = r0.f20593l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f20595n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f20592k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f20595n = r4
            r0.f20596o = r10
            r0.f20593l = r8
            r1 = 1
            r0.f20590i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = r1
        L_0x0143:
            r0.f20597p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.n.b(i2.A):void");
    }

    public void c(boolean z10) {
        C2076a.i(this.f20583b);
        if (z10) {
            boolean z11 = this.f20596o;
            this.f20583b.d(this.f20595n, z11 ? 1 : 0, (int) (this.f20589h - this.f20594m), 0, (O.a) null);
        }
    }

    public void d(long j10, int i10) {
        this.f20593l = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20582a = dVar.b();
        this.f20583b = rVar.d(dVar.c(), 2);
        M m10 = this.f20584c;
        if (m10 != null) {
            m10.b(rVar, dVar);
        }
    }

    n(M m10) {
        this.f20584c = m10;
        this.f20587f = new boolean[4];
        this.f20588g = new a(128);
        if (m10 != null) {
            this.f20586e = new w(178, 128);
            this.f20585d = new C2073A();
        } else {
            this.f20586e = null;
            this.f20585d = null;
        }
        this.f20593l = -9223372036854775807L;
        this.f20595n = -9223372036854775807L;
    }
}
