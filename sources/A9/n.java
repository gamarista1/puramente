package A9;

import A9.I;
import ja.B;
import ja.x;
import java.util.Arrays;
import q9.C3962B;
import q9.m;

public final class n implements m {

    /* renamed from: q  reason: collision with root package name */
    private static final double[] f29599q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    private String f29600a;

    /* renamed from: b  reason: collision with root package name */
    private C3962B f29601b;

    /* renamed from: c  reason: collision with root package name */
    private final K f29602c;

    /* renamed from: d  reason: collision with root package name */
    private final B f29603d;

    /* renamed from: e  reason: collision with root package name */
    private final u f29604e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f29605f;

    /* renamed from: g  reason: collision with root package name */
    private final a f29606g;

    /* renamed from: h  reason: collision with root package name */
    private long f29607h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29608i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f29609j;

    /* renamed from: k  reason: collision with root package name */
    private long f29610k;

    /* renamed from: l  reason: collision with root package name */
    private long f29611l;

    /* renamed from: m  reason: collision with root package name */
    private long f29612m;

    /* renamed from: n  reason: collision with root package name */
    private long f29613n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f29614o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29615p;

    private static final class a {

        /* renamed from: e  reason: collision with root package name */
        private static final byte[] f29616e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        private boolean f29617a;

        /* renamed from: b  reason: collision with root package name */
        public int f29618b;

        /* renamed from: c  reason: collision with root package name */
        public int f29619c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f29620d;

        public a(int i10) {
            this.f29620d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f29617a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f29620d;
                int length = bArr2.length;
                int i13 = this.f29618b;
                if (length < i13 + i12) {
                    this.f29620d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f29620d, this.f29618b, i12);
                this.f29618b += i12;
            }
        }

        public boolean b(int i10, int i11) {
            if (this.f29617a) {
                int i12 = this.f29618b - i11;
                this.f29618b = i12;
                if (this.f29619c == 0 && i10 == 181) {
                    this.f29619c = i12;
                } else {
                    this.f29617a = false;
                    return true;
                }
            } else if (i10 == 179) {
                this.f29617a = true;
            }
            byte[] bArr = f29616e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f29617a = false;
            this.f29618b = 0;
            this.f29619c = 0;
        }
    }

    public n() {
        this((K) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair b(A9.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f29620d
            int r1 = r8.f29618b
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
            k9.q0$b r6 = new k9.q0$b
            r6.<init>()
            k9.q0$b r9 = r6.S(r9)
            java.lang.String r6 = "video/mpeg2"
            k9.q0$b r9 = r9.e0(r6)
            k9.q0$b r9 = r9.j0(r2)
            k9.q0$b r9 = r9.Q(r4)
            k9.q0$b r9 = r9.a0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            k9.q0$b r9 = r9.T(r1)
            k9.q0 r9 = r9.E()
            byte r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0098
            double[] r2 = f29599q
            int r4 = r2.length
            if (r1 >= r4) goto L_0x0098
            r1 = r2[r1]
            int r8 = r8.f29619c
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
        throw new UnsupportedOperationException("Method not decompiled: A9.n.b(A9.n$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        x.a(this.f29605f);
        this.f29606g.c();
        u uVar = this.f29604e;
        if (uVar != null) {
            uVar.d();
        }
        this.f29607h = 0;
        this.f29608i = false;
        this.f29611l = -9223372036854775807L;
        this.f29613n = -9223372036854775807L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(ja.B r21) {
        /*
            r20 = this;
            r0 = r20
            q9.B r1 = r0.f29601b
            ja.C3645a.h(r1)
            int r1 = r21.e()
            int r2 = r21.f()
            byte[] r3 = r21.d()
            long r4 = r0.f29607h
            int r6 = r21.a()
            long r6 = (long) r6
            long r4 = r4 + r6
            r0.f29607h = r4
            q9.B r4 = r0.f29601b
            int r5 = r21.a()
            r6 = r21
            r4.d(r6, r5)
        L_0x0028:
            boolean[] r4 = r0.f29605f
            int r4 = ja.x.c(r3, r1, r2, r4)
            if (r4 != r2) goto L_0x0041
            boolean r4 = r0.f29609j
            if (r4 != 0) goto L_0x0039
            A9.n$a r4 = r0.f29606g
            r4.a(r3, r1, r2)
        L_0x0039:
            A9.u r4 = r0.f29604e
            if (r4 == 0) goto L_0x0040
            r4.a(r3, r1, r2)
        L_0x0040:
            return
        L_0x0041:
            byte[] r5 = r21.d()
            int r7 = r4 + 3
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r4 - r1
            boolean r9 = r0.f29609j
            r10 = 0
            r11 = 1
            if (r9 != 0) goto L_0x008a
            if (r8 <= 0) goto L_0x005a
            A9.n$a r9 = r0.f29606g
            r9.a(r3, r1, r4)
        L_0x005a:
            if (r8 >= 0) goto L_0x005e
            int r9 = -r8
            goto L_0x005f
        L_0x005e:
            r9 = r10
        L_0x005f:
            A9.n$a r12 = r0.f29606g
            boolean r9 = r12.b(r5, r9)
            if (r9 == 0) goto L_0x008a
            A9.n$a r9 = r0.f29606g
            java.lang.String r12 = r0.f29600a
            java.lang.Object r12 = ja.C3645a.e(r12)
            java.lang.String r12 = (java.lang.String) r12
            android.util.Pair r9 = b(r9, r12)
            q9.B r12 = r0.f29601b
            java.lang.Object r13 = r9.first
            k9.q0 r13 = (k9.C3717q0) r13
            r12.c(r13)
            java.lang.Object r9 = r9.second
            java.lang.Long r9 = (java.lang.Long) r9
            long r12 = r9.longValue()
            r0.f29610k = r12
            r0.f29609j = r11
        L_0x008a:
            A9.u r9 = r0.f29604e
            if (r9 == 0) goto L_0x00d9
            if (r8 <= 0) goto L_0x0095
            r9.a(r3, r1, r4)
            r1 = r10
            goto L_0x0096
        L_0x0095:
            int r1 = -r8
        L_0x0096:
            A9.u r8 = r0.f29604e
            boolean r1 = r8.b(r1)
            if (r1 == 0) goto L_0x00c6
            A9.u r1 = r0.f29604e
            byte[] r8 = r1.f29765d
            int r1 = r1.f29766e
            int r1 = ja.x.q(r8, r1)
            ja.B r8 = r0.f29603d
            java.lang.Object r8 = ja.M.j(r8)
            ja.B r8 = (ja.B) r8
            A9.u r9 = r0.f29604e
            byte[] r9 = r9.f29765d
            r8.N(r9, r1)
            A9.K r1 = r0.f29602c
            java.lang.Object r1 = ja.M.j(r1)
            A9.K r1 = (A9.K) r1
            long r8 = r0.f29613n
            ja.B r12 = r0.f29603d
            r1.a(r8, r12)
        L_0x00c6:
            r1 = 178(0xb2, float:2.5E-43)
            if (r5 != r1) goto L_0x00d9
            byte[] r1 = r21.d()
            int r8 = r4 + 2
            byte r1 = r1[r8]
            if (r1 != r11) goto L_0x00d9
            A9.u r1 = r0.f29604e
            r1.e(r5)
        L_0x00d9:
            if (r5 == 0) goto L_0x00e7
            r1 = 179(0xb3, float:2.51E-43)
            if (r5 != r1) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            r1 = 184(0xb8, float:2.58E-43)
            if (r5 != r1) goto L_0x0145
            r0.f29614o = r11
            goto L_0x0145
        L_0x00e7:
            int r1 = r2 - r4
            boolean r4 = r0.f29615p
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0112
            boolean r4 = r0.f29609j
            if (r4 == 0) goto L_0x0112
            long r13 = r0.f29613n
            int r4 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0112
            boolean r15 = r0.f29614o
            long r11 = r0.f29607h
            r19 = r5
            long r4 = r0.f29612m
            long r11 = r11 - r4
            int r4 = (int) r11
            int r16 = r4 - r1
            q9.B r12 = r0.f29601b
            r18 = 0
            r17 = r1
            r12.f(r13, r15, r16, r17, r18)
            goto L_0x0114
        L_0x0112:
            r19 = r5
        L_0x0114:
            boolean r4 = r0.f29608i
            if (r4 == 0) goto L_0x011f
            boolean r4 = r0.f29615p
            if (r4 == 0) goto L_0x011d
            goto L_0x011f
        L_0x011d:
            r1 = 1
            goto L_0x0140
        L_0x011f:
            long r4 = r0.f29607h
            long r11 = (long) r1
            long r4 = r4 - r11
            r0.f29612m = r4
            long r4 = r0.f29611l
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x012c
            goto L_0x0137
        L_0x012c:
            long r4 = r0.f29613n
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x0136
            long r11 = r0.f29610k
            long r4 = r4 + r11
            goto L_0x0137
        L_0x0136:
            r4 = r8
        L_0x0137:
            r0.f29613n = r4
            r0.f29614o = r10
            r0.f29611l = r8
            r1 = 1
            r0.f29608i = r1
        L_0x0140:
            if (r19 != 0) goto L_0x0143
            r10 = r1
        L_0x0143:
            r0.f29615p = r10
        L_0x0145:
            r1 = r7
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.n.c(ja.B):void");
    }

    public void d(long j10, int i10) {
        this.f29611l = j10;
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29600a = dVar.b();
        this.f29601b = mVar.d(dVar.c(), 2);
        K k10 = this.f29602c;
        if (k10 != null) {
            k10.b(mVar, dVar);
        }
    }

    n(K k10) {
        this.f29602c = k10;
        this.f29605f = new boolean[4];
        this.f29606g = new a(128);
        if (k10 != null) {
            this.f29604e = new u(178, 128);
            this.f29603d = new B();
        } else {
            this.f29604e = null;
            this.f29603d = null;
        }
        this.f29611l = -9223372036854775807L;
        this.f29613n = -9223372036854775807L;
    }

    public void e() {
    }
}
