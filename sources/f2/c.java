package F2;

import i2.C2073A;
import i2.C2076a;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.r;
import z2.u;

public final class c implements C2972p {

    /* renamed from: q  reason: collision with root package name */
    public static final u f2133q = new b();

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f2134a = new C2073A(4);

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f2135b = new C2073A(9);

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f2136c = new C2073A(11);

    /* renamed from: d  reason: collision with root package name */
    private final C2073A f2137d = new C2073A();

    /* renamed from: e  reason: collision with root package name */
    private final d f2138e = new d();

    /* renamed from: f  reason: collision with root package name */
    private r f2139f;

    /* renamed from: g  reason: collision with root package name */
    private int f2140g = 1;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2141h;

    /* renamed from: i  reason: collision with root package name */
    private long f2142i;

    /* renamed from: j  reason: collision with root package name */
    private int f2143j;

    /* renamed from: k  reason: collision with root package name */
    private int f2144k;

    /* renamed from: l  reason: collision with root package name */
    private int f2145l;

    /* renamed from: m  reason: collision with root package name */
    private long f2146m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f2147n;

    /* renamed from: o  reason: collision with root package name */
    private a f2148o;

    /* renamed from: p  reason: collision with root package name */
    private f f2149p;

    private void c() {
        if (!this.f2147n) {
            this.f2139f.u(new J.b(-9223372036854775807L));
            this.f2147n = true;
        }
    }

    private long d() {
        if (this.f2141h) {
            return this.f2142i + this.f2146m;
        }
        if (this.f2138e.d() == -9223372036854775807L) {
            return 0;
        }
        return this.f2146m;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] e() {
        return new C2972p[]{new c()};
    }

    private C2073A g(C2973q qVar) {
        if (this.f2145l > this.f2137d.b()) {
            C2073A a10 = this.f2137d;
            a10.S(new byte[Math.max(a10.b() * 2, this.f2145l)], 0);
        } else {
            this.f2137d.U(0);
        }
        this.f2137d.T(this.f2145l);
        qVar.readFully(this.f2137d.e(), 0, this.f2145l);
        return this.f2137d;
    }

    private boolean l(C2973q qVar) {
        boolean z10;
        boolean z11 = false;
        if (!qVar.f(this.f2135b.e(), 0, 9, true)) {
            return false;
        }
        this.f2135b.U(0);
        this.f2135b.V(4);
        int H10 = this.f2135b.H();
        if ((H10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((H10 & 1) != 0) {
            z11 = true;
        }
        if (z10 && this.f2148o == null) {
            this.f2148o = new a(this.f2139f.d(8, 1));
        }
        if (z11 && this.f2149p == null) {
            this.f2149p = new f(this.f2139f.d(9, 2));
        }
        this.f2139f.k();
        this.f2143j = this.f2135b.q() - 5;
        this.f2140g = 2;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m(z2.C2973q r10) {
        /*
            r9 = this;
            long r0 = r9.d()
            int r2 = r9.f2144k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L_0x0023
            F2.a r3 = r9.f2148o
            if (r3 == 0) goto L_0x0023
            r9.c()
            F2.a r2 = r9.f2148o
            i2.A r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
        L_0x0021:
            r0 = r6
            goto L_0x0075
        L_0x0023:
            r3 = 9
            if (r2 != r3) goto L_0x0039
            F2.f r3 = r9.f2149p
            if (r3 == 0) goto L_0x0039
            r9.c()
            F2.f r2 = r9.f2149p
            i2.A r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            goto L_0x0021
        L_0x0039:
            r3 = 18
            if (r2 != r3) goto L_0x006e
            boolean r2 = r9.f2147n
            if (r2 != 0) goto L_0x006e
            F2.d r2 = r9.f2138e
            i2.A r10 = r9.g(r10)
            boolean r10 = r2.a(r10, r0)
            F2.d r0 = r9.f2138e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
            z2.r r2 = r9.f2139f
            z2.E r3 = new z2.E
            F2.d r7 = r9.f2138e
            long[] r7 = r7.e()
            F2.d r8 = r9.f2138e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.u(r3)
            r9.f2147n = r6
            goto L_0x0021
        L_0x006e:
            int r0 = r9.f2145l
            r10.j(r0)
            r10 = 0
            r0 = r10
        L_0x0075:
            boolean r1 = r9.f2141h
            if (r1 != 0) goto L_0x008f
            if (r10 == 0) goto L_0x008f
            r9.f2141h = r6
            F2.d r10 = r9.f2138e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x008b
            long r1 = r9.f2146m
            long r1 = -r1
            goto L_0x008d
        L_0x008b:
            r1 = 0
        L_0x008d:
            r9.f2142i = r1
        L_0x008f:
            r10 = 4
            r9.f2143j = r10
            r10 = 2
            r9.f2140g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.c.m(z2.q):boolean");
    }

    private boolean n(C2973q qVar) {
        if (!qVar.f(this.f2136c.e(), 0, 11, true)) {
            return false;
        }
        this.f2136c.U(0);
        this.f2144k = this.f2136c.H();
        this.f2145l = this.f2136c.K();
        this.f2146m = (long) this.f2136c.K();
        this.f2146m = (((long) (this.f2136c.H() << 24)) | this.f2146m) * 1000;
        this.f2136c.V(3);
        this.f2140g = 4;
        return true;
    }

    private void o(C2973q qVar) {
        qVar.j(this.f2143j);
        this.f2143j = 0;
        this.f2140g = 3;
    }

    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f2140g = 1;
            this.f2141h = false;
        } else {
            this.f2140g = 3;
        }
        this.f2143j = 0;
    }

    public void f(r rVar) {
        this.f2139f = rVar;
    }

    public int i(C2973q qVar, I i10) {
        C2076a.i(this.f2139f);
        while (true) {
            int i11 = this.f2140g;
            if (i11 != 1) {
                if (i11 == 2) {
                    o(qVar);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    } else if (m(qVar)) {
                        return 0;
                    }
                } else if (!n(qVar)) {
                    return -1;
                }
            } else if (!l(qVar)) {
                return -1;
            }
        }
    }

    public boolean j(C2973q qVar) {
        qVar.l(this.f2134a.e(), 0, 3);
        this.f2134a.U(0);
        if (this.f2134a.K() != 4607062) {
            return false;
        }
        qVar.l(this.f2134a.e(), 0, 2);
        this.f2134a.U(0);
        if ((this.f2134a.N() & 250) != 0) {
            return false;
        }
        qVar.l(this.f2134a.e(), 0, 4);
        this.f2134a.U(0);
        int q10 = this.f2134a.q();
        qVar.e();
        qVar.h(q10);
        qVar.l(this.f2134a.e(), 0, 4);
        this.f2134a.U(0);
        if (this.f2134a.q() == 0) {
            return true;
        }
        return false;
    }

    public void release() {
    }
}
