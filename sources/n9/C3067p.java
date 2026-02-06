package N9;

import N9.C3070t;
import O9.c;
import ia.C3604b;
import ia.J;
import ja.M;
import k9.C3732y0;
import k9.n1;

/* renamed from: N9.p  reason: case insensitive filesystem */
public final class C3067p extends C3057f {

    /* renamed from: k  reason: collision with root package name */
    private final C3070t f33265k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f33266l;

    /* renamed from: m  reason: collision with root package name */
    private final n1.d f33267m;

    /* renamed from: n  reason: collision with root package name */
    private final n1.b f33268n;

    /* renamed from: o  reason: collision with root package name */
    private a f33269o;

    /* renamed from: p  reason: collision with root package name */
    private C3066o f33270p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f33271q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f33272r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f33273s;

    /* renamed from: N9.p$a */
    private static final class a extends C3063l {

        /* renamed from: f  reason: collision with root package name */
        public static final Object f33274f = new Object();

        /* renamed from: d  reason: collision with root package name */
        private final Object f33275d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final Object f33276e;

        private a(n1 n1Var, Object obj, Object obj2) {
            super(n1Var);
            this.f33275d = obj;
            this.f33276e = obj2;
        }

        public static a A(n1 n1Var, Object obj, Object obj2) {
            return new a(n1Var, obj, obj2);
        }

        public static a z(C3732y0 y0Var) {
            return new a(new b(y0Var), n1.d.f45724r, f33274f);
        }

        public int f(Object obj) {
            Object obj2;
            n1 n1Var = this.f33244c;
            if (f33274f.equals(obj) && (obj2 = this.f33276e) != null) {
                obj = obj2;
            }
            return n1Var.f(obj);
        }

        public n1.b k(int i10, n1.b bVar, boolean z10) {
            this.f33244c.k(i10, bVar, z10);
            if (M.c(bVar.f45714b, this.f33276e) && z10) {
                bVar.f45714b = f33274f;
            }
            return bVar;
        }

        public Object q(int i10) {
            Object q10 = this.f33244c.q(i10);
            if (M.c(q10, this.f33276e)) {
                return f33274f;
            }
            return q10;
        }

        public n1.d s(int i10, n1.d dVar, long j10) {
            this.f33244c.s(i10, dVar, j10);
            if (M.c(dVar.f45728a, this.f33275d)) {
                dVar.f45728a = n1.d.f45724r;
            }
            return dVar;
        }

        public a y(n1 n1Var) {
            return new a(n1Var, this.f33275d, this.f33276e);
        }
    }

    /* renamed from: N9.p$b */
    public static final class b extends n1 {

        /* renamed from: c  reason: collision with root package name */
        private final C3732y0 f33277c;

        public b(C3732y0 y0Var) {
            this.f33277c = y0Var;
        }

        public int f(Object obj) {
            if (obj == a.f33274f) {
                return 0;
            }
            return -1;
        }

        public n1.b k(int i10, n1.b bVar, boolean z10) {
            Integer num;
            Object obj = null;
            if (z10) {
                num = 0;
            } else {
                num = null;
            }
            if (z10) {
                obj = a.f33274f;
            }
            bVar.w(num, obj, 0, -9223372036854775807L, 0, c.f33398g, true);
            return bVar;
        }

        public int m() {
            return 1;
        }

        public Object q(int i10) {
            return a.f33274f;
        }

        public n1.d s(int i10, n1.d dVar, long j10) {
            n1.d dVar2 = dVar;
            dVar.i(n1.d.f45724r, this.f33277c, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (C3732y0.g) null, 0, -9223372036854775807L, 0, 0, 0);
            n1.d dVar3 = dVar;
            dVar3.f45739l = true;
            return dVar3;
        }

        public int t() {
            return 1;
        }
    }

    public C3067p(C3070t tVar, boolean z10) {
        boolean z11;
        this.f33265k = tVar;
        if (!z10 || !tVar.d()) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f33266l = z11;
        this.f33267m = new n1.d();
        this.f33268n = new n1.b();
        n1 e10 = tVar.e();
        if (e10 != null) {
            this.f33269o = a.A(e10, (Object) null, (Object) null);
            this.f33273s = true;
            return;
        }
        this.f33269o = a.z(tVar.a());
    }

    private Object N(Object obj) {
        if (this.f33269o.f33276e == null || !this.f33269o.f33276e.equals(obj)) {
            return obj;
        }
        return a.f33274f;
    }

    private Object O(Object obj) {
        if (this.f33269o.f33276e == null || !obj.equals(a.f33274f)) {
            return obj;
        }
        return this.f33269o.f33276e;
    }

    private void S(long j10) {
        C3066o oVar = this.f33270p;
        int f10 = this.f33269o.f(oVar.f33258a.f33285a);
        if (f10 != -1) {
            long j11 = this.f33269o.j(f10, this.f33268n).f45716d;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                j10 = Math.max(0, j11 - 1);
            }
            oVar.w(j10);
        }
    }

    public void C(J j10) {
        super.C(j10);
        if (!this.f33266l) {
            this.f33271q = true;
            L((Object) null, this.f33265k);
        }
    }

    public void E() {
        this.f33272r = false;
        this.f33271q = false;
        super.E();
    }

    /* renamed from: M */
    public C3066o i(C3070t.b bVar, C3604b bVar2, long j10) {
        C3066o oVar = new C3066o(bVar, bVar2, j10);
        oVar.y(this.f33265k);
        if (this.f33272r) {
            oVar.e(bVar.c(O(bVar.f33285a)));
        } else {
            this.f33270p = oVar;
            if (!this.f33271q) {
                this.f33271q = true;
                L((Object) null, this.f33265k);
            }
        }
        return oVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public C3070t.b G(Void voidR, C3070t.b bVar) {
        return bVar.c(N(bVar.f33285a));
    }

    public n1 Q() {
        return this.f33269o;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void K(java.lang.Void r13, N9.C3070t r14, k9.n1 r15) {
        /*
            r12 = this;
            boolean r13 = r12.f33272r
            if (r13 == 0) goto L_0x0019
            N9.p$a r13 = r12.f33269o
            N9.p$a r13 = r13.y(r15)
            r12.f33269o = r13
            N9.o r13 = r12.f33270p
            if (r13 == 0) goto L_0x00ae
            long r13 = r13.i()
            r12.S(r13)
            goto L_0x00ae
        L_0x0019:
            boolean r13 = r15.u()
            if (r13 == 0) goto L_0x0036
            boolean r13 = r12.f33273s
            if (r13 == 0) goto L_0x002a
            N9.p$a r13 = r12.f33269o
            N9.p$a r13 = r13.y(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r13 = k9.n1.d.f45724r
            java.lang.Object r14 = N9.C3067p.a.f33274f
            N9.p$a r13 = N9.C3067p.a.A(r15, r13, r14)
        L_0x0032:
            r12.f33269o = r13
            goto L_0x00ae
        L_0x0036:
            k9.n1$d r13 = r12.f33267m
            r14 = 0
            r15.r(r14, r13)
            k9.n1$d r13 = r12.f33267m
            long r0 = r13.e()
            k9.n1$d r13 = r12.f33267m
            java.lang.Object r13 = r13.f45728a
            N9.o r2 = r12.f33270p
            if (r2 == 0) goto L_0x0074
            long r2 = r2.t()
            N9.p$a r4 = r12.f33269o
            N9.o r5 = r12.f33270p
            N9.t$b r5 = r5.f33258a
            java.lang.Object r5 = r5.f33285a
            k9.n1$b r6 = r12.f33268n
            r4.l(r5, r6)
            k9.n1$b r4 = r12.f33268n
            long r4 = r4.q()
            long r4 = r4 + r2
            N9.p$a r2 = r12.f33269o
            k9.n1$d r3 = r12.f33267m
            k9.n1$d r14 = r2.r(r14, r3)
            long r2 = r14.e()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0074
            r10 = r4
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            k9.n1$d r7 = r12.f33267m
            k9.n1$b r8 = r12.f33268n
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.n(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.f33273s
            if (r14 == 0) goto L_0x0094
            N9.p$a r13 = r12.f33269o
            N9.p$a r13 = r13.y(r15)
            goto L_0x0098
        L_0x0094:
            N9.p$a r13 = N9.C3067p.a.A(r15, r13, r0)
        L_0x0098:
            r12.f33269o = r13
            N9.o r13 = r12.f33270p
            if (r13 == 0) goto L_0x00ae
            r12.S(r1)
            N9.t$b r13 = r13.f33258a
            java.lang.Object r14 = r13.f33285a
            java.lang.Object r14 = r12.O(r14)
            N9.t$b r13 = r13.c(r14)
            goto L_0x00af
        L_0x00ae:
            r13 = 0
        L_0x00af:
            r14 = 1
            r12.f33273s = r14
            r12.f33272r = r14
            N9.p$a r14 = r12.f33269o
            r12.D(r14)
            if (r13 == 0) goto L_0x00c6
            N9.o r14 = r12.f33270p
            java.lang.Object r14 = ja.C3645a.e(r14)
            N9.o r14 = (N9.C3066o) r14
            r14.e(r13)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.C3067p.K(java.lang.Void, N9.t, k9.n1):void");
    }

    public C3732y0 a() {
        return this.f33265k.a();
    }

    public void g(r rVar) {
        ((C3066o) rVar).x();
        if (rVar == this.f33270p) {
            this.f33270p = null;
        }
    }

    public void c() {
    }
}
