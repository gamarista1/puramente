package t2;

import androidx.media3.exoplayer.U;
import f2.C1960A;
import f2.s;
import i2.C2076a;
import i2.L;
import l2.f;
import m2.C2190B;
import m2.w;
import t2.C2614B;
import t2.C2639e;
import v2.x;

/* renamed from: t2.d  reason: case insensitive filesystem */
public final class C2638d implements C2614B, C2614B.a {

    /* renamed from: a  reason: collision with root package name */
    public final C2614B f26183a;

    /* renamed from: b  reason: collision with root package name */
    private C2614B.a f26184b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f26185c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f26186d;

    /* renamed from: e  reason: collision with root package name */
    long f26187e;

    /* renamed from: f  reason: collision with root package name */
    long f26188f;

    /* renamed from: g  reason: collision with root package name */
    private C2639e.b f26189g;

    /* renamed from: t2.d$a */
    private final class a implements Z {

        /* renamed from: a  reason: collision with root package name */
        public final Z f26190a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f26191b;

        public a(Z z10) {
            this.f26190a = z10;
        }

        public int a(w wVar, f fVar, int i10) {
            if (C2638d.this.l()) {
                return -3;
            }
            if (this.f26191b) {
                fVar.s(4);
                return -4;
            }
            long c10 = C2638d.this.c();
            int a10 = this.f26190a.a(wVar, fVar, i10);
            if (a10 == -5) {
                s sVar = (s) C2076a.e(wVar.f23734b);
                int i11 = sVar.f20062E;
                if (!(i11 == 0 && sVar.f20063F == 0)) {
                    C2638d dVar = C2638d.this;
                    int i12 = 0;
                    if (dVar.f26187e != 0) {
                        i11 = 0;
                    }
                    if (dVar.f26188f == Long.MIN_VALUE) {
                        i12 = sVar.f20063F;
                    }
                    wVar.f23734b = sVar.a().V(i11).W(i12).K();
                }
                return -5;
            }
            long j10 = C2638d.this.f26188f;
            if (j10 == Long.MIN_VALUE || ((a10 != -4 || fVar.f23522f < j10) && (a10 != -3 || c10 != Long.MIN_VALUE || fVar.f23521e))) {
                return a10;
            }
            fVar.i();
            fVar.s(4);
            this.f26191b = true;
            return -4;
        }

        public void b() {
            this.f26191b = false;
        }

        public boolean d() {
            if (C2638d.this.l() || !this.f26190a.d()) {
                return false;
            }
            return true;
        }

        public void e() {
            this.f26190a.e();
        }

        public int k(long j10) {
            if (C2638d.this.l()) {
                return -3;
            }
            return this.f26190a.k(j10);
        }
    }

    public C2638d(C2614B b10, boolean z10, long j10, long j11) {
        long j12;
        this.f26183a = b10;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f26186d = j12;
        this.f26187e = j10;
        this.f26188f = j11;
    }

    private C2190B k(long j10, C2190B b10) {
        long j11;
        long p10 = L.p(b10.f23693a, 0, j10 - this.f26187e);
        long j12 = b10.f23694b;
        long j13 = this.f26188f;
        if (j13 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j13 - j10;
        }
        long p11 = L.p(j12, 0, j11);
        if (p10 == b10.f23693a && p11 == b10.f23694b) {
            return b10;
        }
        return new C2190B(p10, p11);
    }

    private static boolean r(long j10, x[] xVarArr) {
        if (j10 != 0) {
            for (x xVar : xVarArr) {
                if (xVar != null) {
                    s j11 = xVar.j();
                    if (!C1960A.a(j11.f20083n, j11.f20079j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long a() {
        long a10 = this.f26183a.a();
        if (a10 != Long.MIN_VALUE) {
            long j10 = this.f26188f;
            if (j10 == Long.MIN_VALUE || a10 < j10) {
                return a10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean b() {
        return this.f26183a.b();
    }

    public long c() {
        long c10 = this.f26183a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f26188f;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean e(U u10) {
        return this.f26183a.e(u10);
    }

    public void f(long j10) {
        this.f26183a.f(j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long g(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f26186d = r0
            t2.d$a[] r0 = r5.f26185c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.b()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            t2.B r0 = r5.f26183a
            long r0 = r0.g(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f26187e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f26188f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            i2.C2076a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2638d.g(long):long");
    }

    public long h() {
        boolean z10;
        if (l()) {
            long j10 = this.f26186d;
            this.f26186d = -9223372036854775807L;
            long h10 = h();
            if (h10 != -9223372036854775807L) {
                return h10;
            }
            return j10;
        }
        long h11 = this.f26183a.h();
        if (h11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (h11 >= this.f26187e) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        long j11 = this.f26188f;
        if (j11 == Long.MIN_VALUE || h11 <= j11) {
            z11 = true;
        }
        C2076a.g(z11);
        return h11;
    }

    public void i(C2614B b10) {
        if (this.f26189g == null) {
            ((C2614B.a) C2076a.e(this.f26184b)).i(this);
        }
    }

    public void j() {
        C2639e.b bVar = this.f26189g;
        if (bVar == null) {
            this.f26183a.j();
            return;
        }
        throw bVar;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        if (this.f26186d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public void d(C2614B b10) {
        ((C2614B.a) C2076a.e(this.f26184b)).d(this);
    }

    public j0 n() {
        return this.f26183a.n();
    }

    public void o(long j10, boolean z10) {
        this.f26183a.o(j10, z10);
    }

    public void p(C2614B.a aVar, long j10) {
        this.f26184b = aVar;
        this.f26183a.p(this, j10);
    }

    public void q(C2639e.b bVar) {
        this.f26189g = bVar;
    }

    public long s(long j10, C2190B b10) {
        long j11 = this.f26187e;
        if (j10 == j11) {
            return j11;
        }
        return this.f26183a.s(j10, k(j10, b10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long t(v2.x[] r13, boolean[] r14, t2.Z[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            t2.d$a[] r2 = new t2.C2638d.a[r2]
            r0.f26185c = r2
            int r2 = r1.length
            t2.Z[] r9 = new t2.Z[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            t2.d$a[] r3 = r0.f26185c
            r4 = r1[r2]
            t2.d$a r4 = (t2.C2638d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            t2.Z r11 = r4.f26190a
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            t2.B r2 = r0.f26183a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.t(r3, r4, r5, r6, r7)
            boolean r4 = r12.l()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.f26187e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = r(r4, r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f26186d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.f26187e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            long r4 = r0.f26188f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0063
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r4 = r10
            goto L_0x0064
        L_0x0063:
            r4 = 1
        L_0x0064:
            i2.C2076a.g(r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x008d
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            t2.d$a[] r4 = r0.f26185c
            r4[r10] = r11
            goto L_0x0084
        L_0x0073:
            t2.d$a[] r5 = r0.f26185c
            r6 = r5[r10]
            if (r6 == 0) goto L_0x007d
            t2.Z r6 = r6.f26190a
            if (r6 == r4) goto L_0x0084
        L_0x007d:
            t2.d$a r6 = new t2.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0084:
            t2.d$a[] r4 = r0.f26185c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2638d.t(v2.x[], boolean[], t2.Z[], boolean[], long):long");
    }

    public void u(long j10, long j11) {
        this.f26187e = j10;
        this.f26188f = j11;
    }
}
