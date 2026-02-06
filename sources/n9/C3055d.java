package N9;

import N9.r;
import ja.C3645a;
import ja.M;
import ja.w;
import k9.C3717q0;
import k9.C3718r0;
import k9.e1;
import n9.C3871g;

/* renamed from: N9.d  reason: case insensitive filesystem */
public final class C3055d implements r, r.a {

    /* renamed from: a  reason: collision with root package name */
    public final r f33210a;

    /* renamed from: b  reason: collision with root package name */
    private r.a f33211b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f33212c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f33213d;

    /* renamed from: e  reason: collision with root package name */
    long f33214e;

    /* renamed from: f  reason: collision with root package name */
    long f33215f;

    /* renamed from: N9.d$a */
    private final class a implements M {

        /* renamed from: a  reason: collision with root package name */
        public final M f33216a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f33217b;

        public a(M m10) {
            this.f33216a = m10;
        }

        public void a() {
            this.f33217b = false;
        }

        public boolean d() {
            if (C3055d.this.i() || !this.f33216a.d()) {
                return false;
            }
            return true;
        }

        public void e() {
            this.f33216a.e();
        }

        public int k(long j10) {
            if (C3055d.this.i()) {
                return -3;
            }
            return this.f33216a.k(j10);
        }

        public int q(C3718r0 r0Var, C3871g gVar, int i10) {
            if (C3055d.this.i()) {
                return -3;
            }
            if (this.f33217b) {
                gVar.t(4);
                return -4;
            }
            int q10 = this.f33216a.q(r0Var, gVar, i10);
            if (q10 == -5) {
                C3717q0 q0Var = (C3717q0) C3645a.e(r0Var.f45824b);
                int i11 = q0Var.f45754B;
                if (!(i11 == 0 && q0Var.f45755C == 0)) {
                    C3055d dVar = C3055d.this;
                    int i12 = 0;
                    if (dVar.f33214e != 0) {
                        i11 = 0;
                    }
                    if (dVar.f33215f == Long.MIN_VALUE) {
                        i12 = q0Var.f45755C;
                    }
                    r0Var.f45824b = q0Var.b().N(i11).O(i12).E();
                }
                return -5;
            }
            C3055d dVar2 = C3055d.this;
            long j10 = dVar2.f33215f;
            if (j10 == Long.MIN_VALUE || ((q10 != -4 || gVar.f46952e < j10) && (q10 != -3 || dVar2.c() != Long.MIN_VALUE || gVar.f46951d))) {
                return q10;
            }
            gVar.i();
            gVar.t(4);
            this.f33217b = true;
            return -4;
        }
    }

    public C3055d(r rVar, boolean z10, long j10, long j11) {
        long j12;
        this.f33210a = rVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f33213d = j12;
        this.f33214e = j10;
        this.f33215f = j11;
    }

    private e1 e(long j10, e1 e1Var) {
        long j11;
        long r10 = M.r(e1Var.f45540a, 0, j10 - this.f33214e);
        long j12 = e1Var.f45541b;
        long j13 = this.f33215f;
        if (j13 == Long.MIN_VALUE) {
            j11 = Long.MAX_VALUE;
        } else {
            j11 = j13 - j10;
        }
        long r11 = M.r(j12, 0, j11);
        if (r10 == e1Var.f45540a && r11 == e1Var.f45541b) {
            return e1Var;
        }
        return new e1(r10, r11);
    }

    private static boolean u(long j10, ga.r[] rVarArr) {
        if (j10 != 0) {
            for (ga.r rVar : rVarArr) {
                if (rVar != null) {
                    C3717q0 j11 = rVar.j();
                    if (!w.a(j11.f45770l, j11.f45767i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public long a() {
        long a10 = this.f33210a.a();
        if (a10 != Long.MIN_VALUE) {
            long j10 = this.f33215f;
            if (j10 == Long.MIN_VALUE || a10 < j10) {
                return a10;
            }
        }
        return Long.MIN_VALUE;
    }

    public boolean b() {
        return this.f33210a.b();
    }

    public long c() {
        long c10 = this.f33210a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f33215f;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void f(long j10) {
        this.f33210a.f(j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long g(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f33213d = r0
            N9.d$a[] r0 = r5.f33212c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            N9.r r0 = r5.f33210a
            long r0 = r0.g(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f33214e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f33215f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            ja.C3645a.f(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.C3055d.g(long):long");
    }

    public long h() {
        boolean z10;
        if (i()) {
            long j10 = this.f33213d;
            this.f33213d = -9223372036854775807L;
            long h10 = h();
            if (h10 != -9223372036854775807L) {
                return h10;
            }
            return j10;
        }
        long h11 = this.f33210a.h();
        if (h11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z11 = false;
        if (h11 >= this.f33214e) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.f(z10);
        long j11 = this.f33215f;
        if (j11 == Long.MIN_VALUE || h11 <= j11) {
            z11 = true;
        }
        C3645a.f(z11);
        return h11;
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        if (this.f33213d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public void j() {
        this.f33210a.j();
    }

    public void k(r rVar) {
        ((r.a) C3645a.e(this.f33211b)).k(this);
    }

    public long l(long j10, e1 e1Var) {
        long j11 = this.f33214e;
        if (j10 == j11) {
            return j11;
        }
        return this.f33210a.l(j10, e(j10, e1Var));
    }

    public boolean m(long j10) {
        return this.f33210a.m(j10);
    }

    public V n() {
        return this.f33210a.n();
    }

    public void o(long j10, boolean z10) {
        this.f33210a.o(j10, z10);
    }

    public void r(r.a aVar, long j10) {
        this.f33211b = aVar;
        this.f33210a.r(this, j10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r2 > r4) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long s(ga.r[] r13, boolean[] r14, N9.M[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            N9.d$a[] r2 = new N9.C3055d.a[r2]
            r0.f33212c = r2
            int r2 = r1.length
            N9.M[] r9 = new N9.M[r2]
            r10 = 0
            r2 = r10
        L_0x000c:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L_0x0021
            N9.d$a[] r3 = r0.f33212c
            r4 = r1[r2]
            N9.d$a r4 = (N9.C3055d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L_0x001c
            N9.M r11 = r4.f33216a
        L_0x001c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto L_0x000c
        L_0x0021:
            N9.r r2 = r0.f33210a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.s(r3, r4, r5, r6, r7)
            boolean r4 = r12.i()
            if (r4 == 0) goto L_0x0043
            long r4 = r0.f33214e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0043
            r6 = r13
            boolean r4 = u(r4, r13)
            if (r4 == 0) goto L_0x0043
            r4 = r2
            goto L_0x0048
        L_0x0043:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f33213d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x0063
            long r4 = r0.f33214e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0061
            long r4 = r0.f33215f
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
            ja.C3645a.f(r4)
        L_0x0067:
            int r4 = r1.length
            if (r10 >= r4) goto L_0x008d
            r4 = r9[r10]
            if (r4 != 0) goto L_0x0073
            N9.d$a[] r4 = r0.f33212c
            r4[r10] = r11
            goto L_0x0084
        L_0x0073:
            N9.d$a[] r5 = r0.f33212c
            r6 = r5[r10]
            if (r6 == 0) goto L_0x007d
            N9.M r6 = r6.f33216a
            if (r6 == r4) goto L_0x0084
        L_0x007d:
            N9.d$a r6 = new N9.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L_0x0084:
            N9.d$a[] r4 = r0.f33212c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.C3055d.s(ga.r[], boolean[], N9.M[], boolean[], long):long");
    }

    /* renamed from: t */
    public void p(r rVar) {
        ((r.a) C3645a.e(this.f33211b)).p(this);
    }

    public void v(long j10, long j11) {
        this.f33214e = j10;
        this.f33215f = j11;
    }
}
