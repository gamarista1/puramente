package J0;

import J0.G;
import J0.m0;
import a0.C1538b;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import yf.C6787a;

public final class S {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f3730a;

    /* renamed from: b  reason: collision with root package name */
    private final C1249o f3731b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3732c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3733d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f3734e = new k0();

    /* renamed from: f  reason: collision with root package name */
    private final C1538b f3735f = new C1538b(new m0.b[16], 0);

    /* renamed from: g  reason: collision with root package name */
    private long f3736g = 1;

    /* renamed from: h  reason: collision with root package name */
    private final C1538b f3737h;

    /* renamed from: i  reason: collision with root package name */
    private c1.b f3738i;

    /* renamed from: j  reason: collision with root package name */
    private final N f3739j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final G f3740a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f3741b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f3742c;

        public a(G g10, boolean z10, boolean z11) {
            this.f3740a = g10;
            this.f3741b = z10;
            this.f3742c = z11;
        }

        public final G a() {
            return this.f3740a;
        }

        public final boolean b() {
            return this.f3742c;
        }

        public final boolean c() {
            return this.f3741b;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3743a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                J0.G$e[] r0 = J0.G.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                J0.G$e r1 = J0.G.e.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                J0.G$e r1 = J0.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                J0.G$e r1 = J0.G.e.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                J0.G$e r1 = J0.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                J0.G$e r1 = J0.G.e.Idle     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f3743a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: J0.S.b.<clinit>():void");
        }
    }

    public S(G g10) {
        N n10;
        this.f3730a = g10;
        m0.a aVar = m0.f3894K;
        C1249o oVar = new C1249o(aVar.a());
        this.f3731b = oVar;
        C1538b bVar = new C1538b(new a[16], 0);
        this.f3737h = bVar;
        if (aVar.a()) {
            n10 = new N(g10, oVar, bVar.h());
        } else {
            n10 = null;
        }
        this.f3739j = n10;
    }

    private final void A(G g10, boolean z10) {
        c1.b bVar;
        if (!g10.K0()) {
            if (g10 == this.f3730a) {
                bVar = this.f3738i;
                C6496s.e(bVar);
            } else {
                bVar = null;
            }
            if (z10) {
                e(g10, bVar);
            } else {
                f(g10, bVar);
            }
        }
    }

    public static /* synthetic */ boolean G(S s10, G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s10.F(g10, z10);
    }

    private final void b() {
        C1538b bVar = this.f3735f;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            int i10 = 0;
            do {
                ((m0.b) p10[i10]).k();
                i10++;
            } while (i10 < q10);
        }
        this.f3735f.i();
    }

    public static /* synthetic */ void d(S s10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        s10.c(z10);
    }

    private final boolean e(G g10, c1.b bVar) {
        boolean z10;
        if (g10.a0() == null) {
            return false;
        }
        if (bVar != null) {
            z10 = g10.O0(bVar);
        } else {
            z10 = G.P0(g10, (c1.b) null, 1, (Object) null);
        }
        G n02 = g10.n0();
        if (z10 && n02 != null) {
            if (n02.a0() == null) {
                G.w1(n02, false, false, false, 3, (Object) null);
            } else if (g10.g0() == G.g.InMeasureBlock) {
                G.s1(n02, false, false, false, 3, (Object) null);
            } else if (g10.g0() == G.g.InLayoutBlock) {
                G.q1(n02, false, 1, (Object) null);
            }
        }
        return z10;
    }

    private final boolean f(G g10, c1.b bVar) {
        boolean z10;
        if (bVar != null) {
            z10 = g10.k1(bVar);
        } else {
            z10 = G.l1(g10, (c1.b) null, 1, (Object) null);
        }
        G n02 = g10.n0();
        if (z10 && n02 != null) {
            if (g10.f0() == G.g.InMeasureBlock) {
                G.w1(n02, false, false, false, 3, (Object) null);
            } else if (g10.f0() == G.g.InLayoutBlock) {
                G.u1(n02, false, 1, (Object) null);
            }
        }
        return z10;
    }

    private final void g() {
        if (this.f3737h.t()) {
            C1538b bVar = this.f3737h;
            int q10 = bVar.q();
            if (q10 > 0) {
                Object[] p10 = bVar.p();
                int i10 = 0;
                do {
                    a aVar = (a) p10[i10];
                    if (aVar.a().J0()) {
                        if (!aVar.c()) {
                            G.w1(aVar.a(), aVar.b(), false, false, 2, (Object) null);
                        } else {
                            G.s1(aVar.a(), aVar.b(), false, false, 2, (Object) null);
                        }
                    }
                    i10++;
                } while (i10 < q10);
            }
            this.f3737h.i();
        }
    }

    private final void h(G g10) {
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g11 = (G) p10[i10];
                if (C6496s.c(g11.M0(), Boolean.TRUE) && !g11.K0()) {
                    if (this.f3731b.e(g11, true)) {
                        g11.Q0();
                    }
                    h(g11);
                }
                i10++;
            } while (i10 < q10);
        }
    }

    private final void j(G g10, boolean z10) {
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g11 = (G) p10[i10];
                if ((!z10 && o(g11)) || (z10 && p(g11))) {
                    if (M.a(g11) && !z10) {
                        if (!g11.Y() || !this.f3731b.e(g11, true)) {
                            i(g11, true);
                        } else {
                            x(g11, true, false);
                        }
                    }
                    w(g11, z10);
                    if (!u(g11, z10)) {
                        j(g11, z10);
                    }
                }
                i10++;
            } while (i10 < q10);
        }
        w(g10, z10);
    }

    private final boolean k(G g10) {
        if (!g10.d0() || !o(g10)) {
            return false;
        }
        return true;
    }

    private final boolean l(G g10) {
        if (!g10.Y() || !p(g10)) {
            return false;
        }
        return true;
    }

    private final boolean o(G g10) {
        if (g10.f0() == G.g.InMeasureBlock || g10.U().r().p().k()) {
            return true;
        }
        return false;
    }

    private final boolean p(G g10) {
        C1230a p10;
        if (g10.g0() == G.g.InMeasureBlock) {
            return true;
        }
        C1232b C10 = g10.U().C();
        if (C10 == null || (p10 = C10.p()) == null || !p10.k()) {
            return false;
        }
        return true;
    }

    private final boolean u(G g10, boolean z10) {
        if (z10) {
            return g10.Y();
        }
        return g10.d0();
    }

    private final void w(G g10, boolean z10) {
        if (u(g10, z10) && this.f3731b.e(g10, z10)) {
            x(g10, z10, false);
        }
    }

    private final boolean x(G g10, boolean z10, boolean z11) {
        c1.b bVar;
        boolean z12;
        G n02;
        boolean z13 = false;
        if (g10.K0()) {
            return false;
        }
        if (g10.e() || g10.L0() || k(g10) || C6496s.c(g10.M0(), Boolean.TRUE) || l(g10) || g10.C()) {
            if (g10 == this.f3730a) {
                bVar = this.f3738i;
                C6496s.e(bVar);
            } else {
                bVar = null;
            }
            if (z10) {
                if (g10.Y()) {
                    z13 = e(g10, bVar);
                }
                if (z11 && ((z13 || g10.X()) && C6496s.c(g10.M0(), Boolean.TRUE))) {
                    g10.Q0();
                }
            } else {
                if (g10.d0()) {
                    z12 = f(g10, bVar);
                } else {
                    z12 = false;
                }
                if (z11 && g10.V() && (g10 == this.f3730a || ((n02 = g10.n0()) != null && n02.e() && g10.L0()))) {
                    if (g10 == this.f3730a) {
                        g10.i1(0, 0);
                    } else {
                        g10.o1();
                    }
                    this.f3734e.d(g10);
                    N n10 = this.f3739j;
                    if (n10 != null) {
                        n10.a();
                    }
                }
                z13 = z12;
            }
            g();
        }
        return z13;
    }

    static /* synthetic */ boolean y(S s10, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        return s10.x(g10, z10, z11);
    }

    private final void z(G g10) {
        C1538b v02 = g10.v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g11 = (G) p10[i10];
                if (o(g11)) {
                    if (M.a(g11)) {
                        A(g11, true);
                    } else {
                        z(g11);
                    }
                }
                i10++;
            } while (i10 < q10);
        }
    }

    public final boolean B(G g10, boolean z10) {
        int i10 = b.f3743a[g10.W().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!(i10 == 4 || i10 == 5)) {
                        throw new C6535s();
                    }
                }
            }
            if ((g10.Y() || g10.X()) && !z10) {
                N n10 = this.f3739j;
                if (n10 == null) {
                    return false;
                }
                n10.a();
                return false;
            }
            g10.S0();
            g10.R0();
            if (g10.K0()) {
                return false;
            }
            G n02 = g10.n0();
            if (C6496s.c(g10.M0(), Boolean.TRUE) && ((n02 == null || !n02.Y()) && (n02 == null || !n02.X()))) {
                this.f3731b.c(g10, true);
            } else if (g10.e() && ((n02 == null || !n02.V()) && (n02 == null || !n02.d0()))) {
                this.f3731b.c(g10, false);
            }
            if (!this.f3733d) {
                return true;
            }
            return false;
        }
        N n11 = this.f3739j;
        if (n11 == null) {
            return false;
        }
        n11.a();
        return false;
    }

    public final boolean C(G g10, boolean z10) {
        boolean z11;
        G n02;
        G n03;
        if (g10.a0() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            G0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = b.f3743a[g10.W().ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            this.f3737h.b(new a(g10, true, z10));
            N n10 = this.f3739j;
            if (n10 == null) {
                return false;
            }
            n10.a();
            return false;
        } else if (i10 != 5) {
            throw new C6535s();
        } else if (g10.Y() && !z10) {
            return false;
        } else {
            g10.T0();
            g10.U0();
            if (g10.K0()) {
                return false;
            }
            if ((C6496s.c(g10.M0(), Boolean.TRUE) || l(g10)) && ((n03 = g10.n0()) == null || !n03.Y())) {
                this.f3731b.c(g10, true);
            } else if ((g10.e() || k(g10)) && ((n02 = g10.n0()) == null || !n02.d0())) {
                this.f3731b.c(g10, false);
            }
            if (!this.f3733d) {
                return true;
            }
            return false;
        }
    }

    public final void D(G g10) {
        this.f3734e.d(g10);
    }

    public final boolean E(G g10, boolean z10) {
        int i10 = b.f3743a[g10.W().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            N n10 = this.f3739j;
            if (n10 != null) {
                n10.a();
            }
        } else if (i10 != 5) {
            throw new C6535s();
        } else if (z10 || g10.e() != g10.L0() || (!g10.d0() && !g10.V())) {
            g10.R0();
            if (!g10.K0() && g10.L0()) {
                G n02 = g10.n0();
                if ((n02 == null || !n02.V()) && (n02 == null || !n02.d0())) {
                    this.f3731b.c(g10, false);
                }
                if (!this.f3733d) {
                    return true;
                }
            }
        } else {
            N n11 = this.f3739j;
            if (n11 != null) {
                n11.a();
            }
        }
        return false;
    }

    public final boolean F(G g10, boolean z10) {
        int i10 = b.f3743a[g10.W().ordinal()];
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3 || i10 == 4) {
                this.f3737h.b(new a(g10, false, z10));
                N n10 = this.f3739j;
                if (n10 != null) {
                    n10.a();
                }
            } else if (i10 != 5) {
                throw new C6535s();
            } else if (!g10.d0() || z10) {
                g10.U0();
                if (!g10.K0() && (g10.e() || k(g10))) {
                    G n02 = g10.n0();
                    if (n02 == null || !n02.d0()) {
                        this.f3731b.c(g10, false);
                    }
                    if (!this.f3733d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void H(long j10) {
        boolean z10;
        c1.b bVar = this.f3738i;
        boolean z11 = false;
        if (bVar == null) {
            z10 = false;
        } else {
            z10 = c1.b.f(bVar.r(), j10);
        }
        if (!z10) {
            if (this.f3732c) {
                G0.a.a("updateRootConstraints called while measuring");
            }
            this.f3738i = c1.b.a(j10);
            if (this.f3730a.a0() != null) {
                this.f3730a.T0();
            }
            this.f3730a.U0();
            C1249o oVar = this.f3731b;
            G g10 = this.f3730a;
            if (g10.a0() != null) {
                z11 = true;
            }
            oVar.c(g10, z11);
        }
    }

    public final void c(boolean z10) {
        if (z10) {
            this.f3734e.e(this.f3730a);
        }
        this.f3734e.a();
    }

    public final void i(G g10, boolean z10) {
        if (!this.f3731b.g(z10)) {
            if (!this.f3732c) {
                G0.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            }
            if (u(g10, z10)) {
                G0.a.a("node not yet measured");
            }
            j(g10, z10);
        }
    }

    public final boolean m() {
        return this.f3731b.h();
    }

    public final boolean n() {
        return this.f3734e.c();
    }

    public final long q() {
        if (!this.f3732c) {
            G0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return this.f3736g;
    }

    public final boolean r(C6787a aVar) {
        boolean z10;
        C1248n b10;
        if (!this.f3730a.J0()) {
            G0.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!this.f3730a.e()) {
            G0.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f3732c) {
            G0.a.a("performMeasureAndLayout called during measure layout");
        }
        boolean z11 = false;
        if (this.f3738i != null) {
            this.f3732c = true;
            this.f3733d = true;
            try {
                if (this.f3731b.h()) {
                    C1249o oVar = this.f3731b;
                    z10 = false;
                    while (oVar.h()) {
                        boolean d10 = oVar.f3902a.d();
                        boolean z12 = !d10;
                        if (!d10) {
                            b10 = oVar.f3902a;
                        } else {
                            b10 = oVar.f3903b;
                        }
                        G e10 = b10.e();
                        boolean y10 = y(this, e10, z12, false, 4, (Object) null);
                        if (e10 == this.f3730a && y10) {
                            z10 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z10 = false;
                }
                this.f3732c = false;
                this.f3733d = false;
                N n10 = this.f3739j;
                if (n10 != null) {
                    n10.a();
                }
                z11 = z10;
            } catch (Throwable th2) {
                this.f3732c = false;
                this.f3733d = false;
                throw th2;
            }
        }
        b();
        return z11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(J0.G r4, long r5) {
        /*
            r3 = this;
            boolean r0 = r4.K0()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            J0.G r0 = r3.f3730a
            boolean r0 = kotlin.jvm.internal.C6496s.c(r4, r0)
            if (r0 == 0) goto L_0x0014
            java.lang.String r0 = "measureAndLayout called on root"
            G0.a.a(r0)
        L_0x0014:
            J0.G r0 = r3.f3730a
            boolean r0 = r0.J0()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "performMeasureAndLayout called with unattached root"
            G0.a.a(r0)
        L_0x0021:
            J0.G r0 = r3.f3730a
            boolean r0 = r0.e()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "performMeasureAndLayout called with unplaced root"
            G0.a.a(r0)
        L_0x002e:
            boolean r0 = r3.f3732c
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "performMeasureAndLayout called during measure layout"
            G0.a.a(r0)
        L_0x0037:
            c1.b r0 = r3.f3738i
            if (r0 == 0) goto L_0x009a
            r0 = 1
            r3.f3732c = r0
            r0 = 0
            r3.f3733d = r0
            J0.o r1 = r3.f3731b     // Catch:{ all -> 0x0057 }
            r1.i(r4)     // Catch:{ all -> 0x0057 }
            c1.b r1 = c1.b.a(r5)     // Catch:{ all -> 0x0057 }
            boolean r1 = r3.e(r4, r1)     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0059
            boolean r1 = r4.X()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            goto L_0x0059
        L_0x0057:
            r4 = move-exception
            goto L_0x0095
        L_0x0059:
            java.lang.Boolean r1 = r4.M0()     // Catch:{ all -> 0x0057 }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0057 }
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0068
            r4.Q0()     // Catch:{ all -> 0x0057 }
        L_0x0068:
            r3.h(r4)     // Catch:{ all -> 0x0057 }
            c1.b r5 = c1.b.a(r5)     // Catch:{ all -> 0x0057 }
            r3.f(r4, r5)     // Catch:{ all -> 0x0057 }
            boolean r5 = r4.V()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            boolean r5 = r4.e()     // Catch:{ all -> 0x0057 }
            if (r5 == 0) goto L_0x0086
            r4.o1()     // Catch:{ all -> 0x0057 }
            J0.k0 r5 = r3.f3734e     // Catch:{ all -> 0x0057 }
            r5.d(r4)     // Catch:{ all -> 0x0057 }
        L_0x0086:
            r3.g()     // Catch:{ all -> 0x0057 }
            r3.f3732c = r0
            r3.f3733d = r0
            J0.N r4 = r3.f3739j
            if (r4 == 0) goto L_0x009a
            r4.a()
            goto L_0x009a
        L_0x0095:
            r3.f3732c = r0
            r3.f3733d = r0
            throw r4
        L_0x009a:
            r3.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.S.s(J0.G, long):void");
    }

    public final void t() {
        if (this.f3731b.h()) {
            if (!this.f3730a.J0()) {
                G0.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!this.f3730a.e()) {
                G0.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f3732c) {
                G0.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f3738i != null) {
                this.f3732c = true;
                this.f3733d = false;
                try {
                    if (!this.f3731b.g(true)) {
                        if (this.f3730a.a0() != null) {
                            A(this.f3730a, true);
                        } else {
                            z(this.f3730a);
                        }
                    }
                    A(this.f3730a, false);
                    this.f3732c = false;
                    this.f3733d = false;
                    N n10 = this.f3739j;
                    if (n10 != null) {
                        n10.a();
                    }
                } catch (Throwable th2) {
                    this.f3732c = false;
                    this.f3733d = false;
                    throw th2;
                }
            }
        }
    }

    public final void v(G g10) {
        this.f3731b.i(g10);
        this.f3734e.f(g10);
    }
}
