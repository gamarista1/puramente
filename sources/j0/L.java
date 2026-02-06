package J0;

import H0.C1180a;
import H0.E;
import H0.U;
import J0.G;
import a0.C1538b;
import c1.n;
import c1.r;
import c1.s;
import com.google.android.gms.common.api.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import u0.C2673c;
import yf.C6787a;
import yf.C6798l;

public final class L {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final G f3606a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public boolean f3607b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public G.e f3608c = G.e.Idle;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3609d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f3610e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f3611f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f3612g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f3613h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f3614i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f3615j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f3616k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f3617l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f3618m;

    /* renamed from: n  reason: collision with root package name */
    private int f3619n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3620o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3621p;

    /* renamed from: q  reason: collision with root package name */
    private int f3622q;

    /* renamed from: r  reason: collision with root package name */
    private final b f3623r = new b();

    /* renamed from: s  reason: collision with root package name */
    private a f3624s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public long f3625t = c1.c.b(0, 0, 0, 0, 15, (Object) null);

    /* renamed from: u  reason: collision with root package name */
    private final C6787a f3626u = new d(this);

    public final class a extends U implements E, C1232b, W {

        /* renamed from: f  reason: collision with root package name */
        private boolean f3628f;

        /* renamed from: g  reason: collision with root package name */
        private int f3629g = a.e.API_PRIORITY_OTHER;

        /* renamed from: h  reason: collision with root package name */
        private int f3630h = a.e.API_PRIORITY_OTHER;

        /* renamed from: i  reason: collision with root package name */
        private G.g f3631i = G.g.NotUsed;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3632j;

        /* renamed from: k  reason: collision with root package name */
        private boolean f3633k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3634l;

        /* renamed from: m  reason: collision with root package name */
        private c1.b f3635m;

        /* renamed from: n  reason: collision with root package name */
        private long f3636n = n.f19226b.a();

        /* renamed from: o  reason: collision with root package name */
        private float f3637o;

        /* renamed from: p  reason: collision with root package name */
        private C6798l f3638p;

        /* renamed from: q  reason: collision with root package name */
        private C2673c f3639q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f3640r;

        /* renamed from: s  reason: collision with root package name */
        private final C1230a f3641s = new O(this);

        /* renamed from: t  reason: collision with root package name */
        private final C1538b f3642t = new C1538b(new a[16], 0);

        /* renamed from: u  reason: collision with root package name */
        private boolean f3643u = true;

        /* renamed from: v  reason: collision with root package name */
        private boolean f3644v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f3645w = true;

        /* renamed from: x  reason: collision with root package name */
        private Object f3646x = D1().a();

        /* renamed from: y  reason: collision with root package name */
        private boolean f3647y;

        /* renamed from: z  reason: collision with root package name */
        private boolean f3648z;

        /* renamed from: J0.L$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C0079a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3649a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f3650b;

            /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|5|6|7|8|9|10|11|13|14|15|16|17|19) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003c */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
            static {
                /*
                    J0.G$e[] r0 = J0.G.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    J0.G$e r2 = J0.G.e.LookaheadMeasuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    J0.G$e r3 = J0.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    J0.G$e r3 = J0.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r4 = 3
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    J0.G$e r3 = J0.G.e.LookaheadLayingOut     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r4 = 4
                    r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f3649a = r0
                    J0.G$g[] r0 = J0.G.g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    J0.G$g r3 = J0.G.g.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x003c }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
                L_0x003c:
                    J0.G$g r1 = J0.G.g.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0044 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
                L_0x0044:
                    f3650b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: J0.L.a.C0079a.<clinit>():void");
            }
        }

        static final class b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f3651a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f3652b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ L f3653c;

            /* renamed from: J0.L$a$b$a  reason: collision with other inner class name */
            static final class C0080a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                public static final C0080a f3654a = new C0080a();

                C0080a() {
                    super(1);
                }

                public final void a(C1232b bVar) {
                    bVar.p().t(false);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C1232b) obj);
                    return C6514M.f71813a;
                }
            }

            /* renamed from: J0.L$a$b$b  reason: collision with other inner class name */
            static final class C0081b extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                public static final C0081b f3655a = new C0081b();

                C0081b() {
                    super(1);
                }

                public final void a(C1232b bVar) {
                    bVar.p().q(bVar.p().l());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C1232b) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, Q q10, L l10) {
                super(0);
                this.f3651a = aVar;
                this.f3652b = q10;
                this.f3653c = l10;
            }

            public final void invoke() {
                this.f3651a.q1();
                this.f3651a.u(C0080a.f3654a);
                Q z22 = this.f3651a.o0().z2();
                if (z22 != null) {
                    boolean O12 = z22.O1();
                    List H10 = this.f3653c.f3606a.H();
                    int size = H10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Q z23 = ((G) H10.get(i10)).l0().z2();
                        if (z23 != null) {
                            z23.S1(O12);
                        }
                    }
                }
                this.f3652b.E1().q();
                Q z24 = this.f3651a.o0().z2();
                if (z24 != null) {
                    z24.O1();
                    List H11 = this.f3653c.f3606a.H();
                    int size2 = H11.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        Q z25 = ((G) H11.get(i11)).l0().z2();
                        if (z25 != null) {
                            z25.S1(false);
                        }
                    }
                }
                this.f3651a.p1();
                this.f3651a.u(C0081b.f3655a);
            }
        }

        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ L f3656a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m0 f3657b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ long f3658c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(L l10, m0 m0Var, long j10) {
                super(0);
                this.f3656a = l10;
                this.f3657b = m0Var;
                this.f3658c = j10;
            }

            public final void invoke() {
                Q z22;
                U.a aVar = null;
                if (M.a(this.f3656a.f3606a)) {
                    C1235c0 F22 = this.f3656a.K().F2();
                    if (F22 != null) {
                        aVar = F22.I1();
                    }
                } else {
                    C1235c0 F23 = this.f3656a.K().F2();
                    if (!(F23 == null || (z22 = F23.z2()) == null)) {
                        aVar = z22.I1();
                    }
                }
                if (aVar == null) {
                    aVar = this.f3657b.getPlacementScope();
                }
                L l10 = this.f3656a;
                long j10 = this.f3658c;
                Q z23 = l10.K().z2();
                C6496s.e(z23);
                U.a.j(aVar, z23, j10, 0.0f, 2, (Object) null);
            }
        }

        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final d f3659a = new d();

            d() {
                super(1);
            }

            public final void a(C1232b bVar) {
                bVar.p().u(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C1232b) obj);
                return C6514M.f71813a;
            }
        }

        public a() {
        }

        private final void K1() {
            boolean e10 = e();
            X1(true);
            if (!e10 && L.this.G()) {
                G.s1(L.this.f3606a, true, false, false, 6, (Object) null);
            }
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    a Z10 = g10.Z();
                    if (Z10 != null) {
                        if (Z10.f3630h != Integer.MAX_VALUE) {
                            Z10.K1();
                            g10.x1(g10);
                        }
                        i10++;
                    } else {
                        throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                    }
                } while (i10 < q10);
            }
        }

        private final void L1() {
            if (e()) {
                int i10 = 0;
                X1(false);
                C1538b v02 = L.this.f3606a.v0();
                int q10 = v02.q();
                if (q10 > 0) {
                    Object[] p10 = v02.p();
                    do {
                        a H10 = ((G) p10[i10]).U().H();
                        C6496s.e(H10);
                        H10.L1();
                        i10++;
                    } while (i10 < q10);
                }
            }
        }

        private final void N1() {
            G a10 = L.this.f3606a;
            L l10 = L.this;
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (g10.Y() && g10.g0() == G.g.InMeasureBlock) {
                        a H10 = g10.U().H();
                        C6496s.e(H10);
                        c1.b z10 = g10.U().z();
                        C6496s.e(z10);
                        if (H10.S1(z10.r())) {
                            G.s1(l10.f3606a, false, false, false, 7, (Object) null);
                        }
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        private final void O1() {
            G.g gVar;
            G.s1(L.this.f3606a, false, false, false, 7, (Object) null);
            G n02 = L.this.f3606a.n0();
            if (n02 != null && L.this.f3606a.T() == G.g.NotUsed) {
                G a10 = L.this.f3606a;
                int i10 = C0079a.f3649a[n02.W().ordinal()];
                if (i10 == 2) {
                    gVar = G.g.InMeasureBlock;
                } else if (i10 != 3) {
                    gVar = n02.T();
                } else {
                    gVar = G.g.InLayoutBlock;
                }
                a10.D1(gVar);
            }
        }

        private final void R1(long j10, float f10, C6798l lVar, C2673c cVar) {
            if (L.this.f3606a.K0()) {
                G0.a.a("place is called on a deactivated node");
            }
            L.this.f3608c = G.e.LookaheadLayingOut;
            this.f3633k = true;
            this.f3648z = false;
            if (!n.i(j10, this.f3636n)) {
                if (L.this.D() || L.this.E()) {
                    L.this.f3613h = true;
                }
                M1();
            }
            m0 b10 = K.b(L.this.f3606a);
            if (L.this.F() || !e()) {
                L.this.a0(false);
                p().r(false);
                o0.d(b10.getSnapshotObserver(), L.this.f3606a, false, new c(L.this, b10, j10), 2, (Object) null);
            } else {
                Q z22 = L.this.K().z2();
                C6496s.e(z22);
                z22.e2(j10);
                Q1();
            }
            this.f3636n = j10;
            this.f3637o = f10;
            this.f3638p = lVar;
            this.f3639q = cVar;
            L.this.f3608c = G.e.Idle;
        }

        private final void Y1(G g10) {
            boolean z10;
            G.g gVar;
            G n02 = g10.n0();
            if (n02 != null) {
                if (this.f3631i == G.g.NotUsed || g10.E()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    G0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i10 = C0079a.f3649a[n02.W().ordinal()];
                if (i10 == 1 || i10 == 2) {
                    gVar = G.g.InMeasureBlock;
                } else if (i10 == 3 || i10 == 4) {
                    gVar = G.g.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + n02.W());
                }
                this.f3631i = gVar;
                return;
            }
            this.f3631i = G.g.NotUsed;
        }

        /* access modifiers changed from: private */
        public final void p1() {
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    a H10 = ((G) p10[i10]).U().H();
                    C6496s.e(H10);
                    int i11 = H10.f3629g;
                    int i12 = H10.f3630h;
                    if (i11 != i12 && i12 == Integer.MAX_VALUE) {
                        H10.L1();
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        /* access modifiers changed from: private */
        public final void q1() {
            int i10 = 0;
            L.this.f3615j = 0;
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                do {
                    a H10 = ((G) p10[i10]).U().H();
                    C6496s.e(H10);
                    H10.f3629g = H10.f3630h;
                    H10.f3630h = a.e.API_PRIORITY_OTHER;
                    if (H10.f3631i == G.g.InLayoutBlock) {
                        H10.f3631i = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        public final boolean C1() {
            return this.f3644v;
        }

        public C1232b D() {
            L U10;
            G n02 = L.this.f3606a.n0();
            if (n02 == null || (U10 = n02.U()) == null) {
                return null;
            }
            return U10.C();
        }

        public void D0(boolean z10) {
            Boolean bool;
            Q z22;
            Q z23 = L.this.K().z2();
            if (z23 != null) {
                bool = Boolean.valueOf(z23.N1());
            } else {
                bool = null;
            }
            if (!C6496s.c(Boolean.valueOf(z10), bool) && (z22 = L.this.K().z2()) != null) {
                z22.D0(z10);
            }
            this.f3647y = z10;
        }

        public final b D1() {
            return L.this.I();
        }

        public final G.g E1() {
            return this.f3631i;
        }

        public final boolean F1() {
            return this.f3633k;
        }

        public final void I1(boolean z10) {
            G g10;
            G n02 = L.this.f3606a.n0();
            G.g T10 = L.this.f3606a.T();
            if (n02 != null && T10 != G.g.NotUsed) {
                do {
                    g10 = n02;
                    if (g10.T() != T10 || (n02 = g10.n0()) == null) {
                        int i10 = C0079a.f3650b[T10.ordinal()];
                    }
                    g10 = n02;
                    break;
                } while ((n02 = g10.n0()) == null);
                int i102 = C0079a.f3650b[T10.ordinal()];
                if (i102 != 1) {
                    if (i102 != 2) {
                        throw new IllegalStateException("Intrinsics isn't used by the parent");
                    } else if (g10.a0() != null) {
                        g10.p1(z10);
                    } else {
                        g10.t1(z10);
                    }
                } else if (g10.a0() != null) {
                    G.s1(g10, z10, false, false, 6, (Object) null);
                } else {
                    G.w1(g10, z10, false, false, 6, (Object) null);
                }
            }
        }

        public void J0() {
            G.s1(L.this.f3606a, false, false, false, 7, (Object) null);
        }

        public final void J1() {
            this.f3645w = true;
        }

        public final void M1() {
            C1538b v02;
            int q10;
            if (L.this.t() > 0 && (q10 = v02.q()) > 0) {
                Object[] p10 = (v02 = L.this.f3606a.v0()).p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    L U10 = g10.U();
                    if ((U10.E() || U10.D()) && !U10.F()) {
                        G.q1(g10, false, 1, (Object) null);
                    }
                    a H10 = U10.H();
                    if (H10 != null) {
                        H10.M1();
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        public final void P1() {
            this.f3630h = a.e.API_PRIORITY_OTHER;
            this.f3629g = a.e.API_PRIORITY_OTHER;
            X1(false);
        }

        public final void Q1() {
            this.f3648z = true;
            G n02 = L.this.f3606a.n0();
            boolean z10 = false;
            if (!e()) {
                K1();
                if (this.f3628f && n02 != null) {
                    G.q1(n02, false, 1, (Object) null);
                }
            }
            if (n02 == null) {
                this.f3630h = 0;
            } else if (!this.f3628f && (n02.W() == G.e.LayingOut || n02.W() == G.e.LookaheadLayingOut)) {
                if (this.f3630h == Integer.MAX_VALUE) {
                    z10 = true;
                }
                if (!z10) {
                    G0.a.b("Place was called on a node which was placed already");
                }
                this.f3630h = n02.U().f3615j;
                L U10 = n02.U();
                U10.f3615j = U10.f3615j + 1;
            }
            T();
        }

        public int S0() {
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.S0();
        }

        public final boolean S1(long j10) {
            boolean z10;
            long j11;
            boolean z11;
            boolean z12;
            if (L.this.f3606a.K0()) {
                G0.a.a("measure is called on a deactivated node");
            }
            G n02 = L.this.f3606a.n0();
            G a10 = L.this.f3606a;
            if (L.this.f3606a.E() || (n02 != null && n02.E())) {
                z10 = true;
            } else {
                z10 = false;
            }
            a10.A1(z10);
            if (!L.this.f3606a.Y()) {
                c1.b bVar = this.f3635m;
                if (bVar == null) {
                    z12 = false;
                } else {
                    z12 = c1.b.f(bVar.r(), j10);
                }
                if (z12) {
                    m0 m02 = L.this.f3606a.m0();
                    if (m02 != null) {
                        m02.e(L.this.f3606a, true);
                    }
                    L.this.f3606a.z1();
                    return false;
                }
            }
            this.f3635m = c1.b.a(j10);
            k1(j10);
            p().s(false);
            u(d.f3659a);
            if (this.f3634l) {
                j11 = T0();
            } else {
                j11 = s.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
            this.f3634l = true;
            Q z22 = L.this.K().z2();
            if (z22 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                G0.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            L.this.T(j10);
            i1(s.a(z22.X0(), z22.R0()));
            if (r.g(j11) == z22.X0() && r.f(j11) == z22.R0()) {
                return false;
            }
            return true;
        }

        public void T() {
            this.f3644v = true;
            p().o();
            if (L.this.F()) {
                N1();
            }
            Q z22 = o0().z2();
            C6496s.e(z22);
            if (L.this.f3614i || (!this.f3632j && !z22.O1() && L.this.F())) {
                L.this.f3613h = false;
                G.e B10 = L.this.B();
                L.this.f3608c = G.e.LookaheadLayingOut;
                m0 b10 = K.b(L.this.f3606a);
                L.this.b0(false);
                o0.f(b10.getSnapshotObserver(), L.this.f3606a, false, new b(this, z22, L.this), 2, (Object) null);
                L.this.f3608c = B10;
                if (L.this.E() && z22.O1()) {
                    requestLayout();
                }
                L.this.f3614i = false;
            }
            if (p().l()) {
                p().q(true);
            }
            if (p().g() && p().k()) {
                p().n();
            }
            this.f3644v = false;
        }

        public final void T1() {
            G n02;
            try {
                this.f3628f = true;
                if (!this.f3633k) {
                    G0.a.b("replace() called on item that was not placed");
                }
                this.f3648z = false;
                boolean e10 = e();
                R1(this.f3636n, 0.0f, this.f3638p, this.f3639q);
                if (e10 && !this.f3648z && (n02 = L.this.f3606a.n0()) != null) {
                    G.q1(n02, false, 1, (Object) null);
                }
                this.f3628f = false;
            } catch (Throwable th2) {
                this.f3628f = false;
                throw th2;
            }
        }

        public int U0() {
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.U0();
        }

        public final void U1(boolean z10) {
            this.f3643u = z10;
        }

        public final void V1(G.g gVar) {
            this.f3631i = gVar;
        }

        public final void W1(int i10) {
            this.f3630h = i10;
        }

        public void X1(boolean z10) {
            this.f3640r = z10;
        }

        public final boolean Z1() {
            if (a() == null) {
                Q z22 = L.this.K().z2();
                C6496s.e(z22);
                if (z22.a() == null) {
                    return false;
                }
            }
            if (!this.f3645w) {
                return false;
            }
            this.f3645w = false;
            Q z23 = L.this.K().z2();
            C6496s.e(z23);
            this.f3646x = z23.a();
            return true;
        }

        public Object a() {
            return this.f3646x;
        }

        public boolean e() {
            return this.f3640r;
        }

        public int e0(int i10) {
            O1();
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.e0(i10);
        }

        /* access modifiers changed from: protected */
        public void e1(long j10, float f10, C2673c cVar) {
            R1(j10, f10, (C6798l) null, cVar);
        }

        /* access modifiers changed from: protected */
        public void f1(long j10, float f10, C6798l lVar) {
            R1(j10, f10, lVar, (C2673c) null);
        }

        public int k0(C1180a aVar) {
            G.e eVar;
            G n02 = L.this.f3606a.n0();
            G.e eVar2 = null;
            if (n02 != null) {
                eVar = n02.W();
            } else {
                eVar = null;
            }
            if (eVar == G.e.LookaheadMeasuring) {
                p().u(true);
            } else {
                G n03 = L.this.f3606a.n0();
                if (n03 != null) {
                    eVar2 = n03.W();
                }
                if (eVar2 == G.e.LookaheadLayingOut) {
                    p().t(true);
                }
            }
            this.f3632j = true;
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            int k02 = z22.k0(aVar);
            this.f3632j = false;
            return k02;
        }

        public C1235c0 o0() {
            return L.this.f3606a.P();
        }

        public C1230a p() {
            return this.f3641s;
        }

        public void requestLayout() {
            G.q1(L.this.f3606a, false, 1, (Object) null);
        }

        public int s(int i10) {
            O1();
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.s(i10);
        }

        public int s0(int i10) {
            O1();
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.s0(i10);
        }

        public int t0(int i10) {
            O1();
            Q z22 = L.this.K().z2();
            C6496s.e(z22);
            return z22.t0(i10);
        }

        public void u(C6798l lVar) {
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    C1232b C10 = ((G) p10[i10]).U().C();
                    C6496s.e(C10);
                    lVar.invoke(C10);
                    i10++;
                } while (i10 < q10);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r1 == J0.G.e.LookaheadLayingOut) goto L_0x002b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public H0.U v0(long r4) {
            /*
                r3 = this;
                J0.L r0 = J0.L.this
                J0.G r0 = r0.f3606a
                J0.G r0 = r0.n0()
                r1 = 0
                if (r0 == 0) goto L_0x0012
                J0.G$e r0 = r0.W()
                goto L_0x0013
            L_0x0012:
                r0 = r1
            L_0x0013:
                J0.G$e r2 = J0.G.e.LookaheadMeasuring
                if (r0 == r2) goto L_0x002b
                J0.L r0 = J0.L.this
                J0.G r0 = r0.f3606a
                J0.G r0 = r0.n0()
                if (r0 == 0) goto L_0x0027
                J0.G$e r1 = r0.W()
            L_0x0027:
                J0.G$e r0 = J0.G.e.LookaheadLayingOut
                if (r1 != r0) goto L_0x0031
            L_0x002b:
                J0.L r0 = J0.L.this
                r1 = 0
                r0.f3607b = r1
            L_0x0031:
                J0.L r0 = J0.L.this
                J0.G r0 = r0.f3606a
                r3.Y1(r0)
                J0.L r0 = J0.L.this
                J0.G r0 = r0.f3606a
                J0.G$g r0 = r0.T()
                J0.G$g r1 = J0.G.g.NotUsed
                if (r0 != r1) goto L_0x0051
                J0.L r0 = J0.L.this
                J0.G r0 = r0.f3606a
                r0.v()
            L_0x0051:
                r3.S1(r4)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: J0.L.a.v0(long):H0.U");
        }

        public final List v1() {
            L.this.f3606a.H();
            if (!this.f3643u) {
                return this.f3642t.h();
            }
            G a10 = L.this.f3606a;
            C1538b bVar = this.f3642t;
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (bVar.q() <= i10) {
                        a H10 = g10.U().H();
                        C6496s.e(H10);
                        bVar.b(H10);
                    } else {
                        a H11 = g10.U().H();
                        C6496s.e(H11);
                        bVar.B(i10, H11);
                    }
                    i10++;
                } while (i10 < q10);
            }
            bVar.z(a10.H().size(), bVar.q());
            this.f3643u = false;
            return this.f3642t.h();
        }

        public Map x() {
            if (!this.f3632j) {
                if (L.this.B() == G.e.LookaheadMeasuring) {
                    p().s(true);
                    if (p().g()) {
                        L.this.P();
                    }
                } else {
                    p().r(true);
                }
            }
            Q z22 = o0().z2();
            if (z22 != null) {
                z22.S1(true);
            }
            T();
            Q z23 = o0().z2();
            if (z23 != null) {
                z23.S1(false);
            }
            return p().h();
        }

        public final c1.b z1() {
            return this.f3635m;
        }
    }

    public final class b extends U implements E, C1232b, W {

        /* renamed from: A  reason: collision with root package name */
        private boolean f3660A;
        /* access modifiers changed from: private */

        /* renamed from: B  reason: collision with root package name */
        public C6798l f3661B;
        /* access modifiers changed from: private */

        /* renamed from: C  reason: collision with root package name */
        public C2673c f3662C;
        /* access modifiers changed from: private */

        /* renamed from: D  reason: collision with root package name */
        public long f3663D;
        /* access modifiers changed from: private */

        /* renamed from: E  reason: collision with root package name */
        public float f3664E;

        /* renamed from: F  reason: collision with root package name */
        private final C6787a f3665F;

        /* renamed from: G  reason: collision with root package name */
        private boolean f3666G;

        /* renamed from: H  reason: collision with root package name */
        private boolean f3667H;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3669f;

        /* renamed from: g  reason: collision with root package name */
        private int f3670g = a.e.API_PRIORITY_OTHER;

        /* renamed from: h  reason: collision with root package name */
        private int f3671h = a.e.API_PRIORITY_OTHER;

        /* renamed from: i  reason: collision with root package name */
        private boolean f3672i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f3673j;

        /* renamed from: k  reason: collision with root package name */
        private G.g f3674k = G.g.NotUsed;

        /* renamed from: l  reason: collision with root package name */
        private boolean f3675l;

        /* renamed from: m  reason: collision with root package name */
        private long f3676m;

        /* renamed from: n  reason: collision with root package name */
        private C6798l f3677n;

        /* renamed from: o  reason: collision with root package name */
        private C2673c f3678o;

        /* renamed from: p  reason: collision with root package name */
        private float f3679p;

        /* renamed from: q  reason: collision with root package name */
        private boolean f3680q;

        /* renamed from: r  reason: collision with root package name */
        private Object f3681r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f3682s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f3683t;

        /* renamed from: u  reason: collision with root package name */
        private final C1230a f3684u;

        /* renamed from: v  reason: collision with root package name */
        private final C1538b f3685v;

        /* renamed from: w  reason: collision with root package name */
        private boolean f3686w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f3687x;

        /* renamed from: y  reason: collision with root package name */
        private final C6787a f3688y;

        /* renamed from: z  reason: collision with root package name */
        private float f3689z;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f3690a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f3691b;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
            static {
                /*
                    J0.G$e[] r0 = J0.G.e.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    r1 = 1
                    J0.G$e r2 = J0.G.e.Measuring     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    r2 = 2
                    J0.G$e r3 = J0.G.e.LayingOut     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f3690a = r0
                    J0.G$g[] r0 = J0.G.g.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    J0.G$g r3 = J0.G.g.InMeasureBlock     // Catch:{ NoSuchFieldError -> 0x002a }
                    int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                    r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
                L_0x002a:
                    J0.G$g r1 = J0.G.g.InLayoutBlock     // Catch:{ NoSuchFieldError -> 0x0032 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
                L_0x0032:
                    f3691b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: J0.L.b.a.<clinit>():void");
            }
        }

        /* renamed from: J0.L$b$b  reason: collision with other inner class name */
        static final class C0082b extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f3692a;

            /* renamed from: J0.L$b$b$a */
            static final class a extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                public static final a f3693a = new a();

                a() {
                    super(1);
                }

                public final void a(C1232b bVar) {
                    bVar.p().t(false);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C1232b) obj);
                    return C6514M.f71813a;
                }
            }

            /* renamed from: J0.L$b$b$b  reason: collision with other inner class name */
            static final class C0083b extends C6498u implements C6798l {

                /* renamed from: a  reason: collision with root package name */
                public static final C0083b f3694a = new C0083b();

                C0083b() {
                    super(1);
                }

                public final void a(C1232b bVar) {
                    bVar.p().q(bVar.p().l());
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C1232b) obj);
                    return C6514M.f71813a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0082b(b bVar) {
                super(0);
                this.f3692a = bVar;
            }

            public final void invoke() {
                this.f3692a.D1();
                this.f3692a.u(a.f3693a);
                this.f3692a.o0().E1().q();
                this.f3692a.C1();
                this.f3692a.u(C0083b.f3694a);
            }
        }

        static final class c extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ L f3695a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f3696b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(L l10, b bVar) {
                super(0);
                this.f3695a = l10;
                this.f3696b = bVar;
            }

            public final void invoke() {
                U.a placementScope;
                C1235c0 F22 = this.f3695a.K().F2();
                if (F22 == null || (placementScope = F22.I1()) == null) {
                    placementScope = K.b(this.f3695a.f3606a).getPlacementScope();
                }
                U.a aVar = placementScope;
                b bVar = this.f3696b;
                L l10 = this.f3695a;
                C6798l q12 = bVar.f3661B;
                C2673c p12 = bVar.f3662C;
                if (p12 != null) {
                    aVar.x(l10.K(), bVar.f3663D, p12, bVar.f3664E);
                } else if (q12 == null) {
                    aVar.i(l10.K(), bVar.f3663D, bVar.f3664E);
                } else {
                    aVar.w(l10.K(), bVar.f3663D, bVar.f3664E, q12);
                }
            }
        }

        static final class d extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            public static final d f3697a = new d();

            d() {
                super(1);
            }

            public final void a(C1232b bVar) {
                bVar.p().u(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C1232b) obj);
                return C6514M.f71813a;
            }
        }

        public b() {
            n.a aVar = n.f19226b;
            this.f3676m = aVar.a();
            this.f3680q = true;
            this.f3684u = new H(this);
            this.f3685v = new C1538b(new b[16], 0);
            this.f3686w = true;
            this.f3688y = new C0082b(this);
            this.f3663D = aVar.a();
            this.f3665F = new c(L.this, this);
        }

        /* access modifiers changed from: private */
        public final void C1() {
            G a10 = L.this.f3606a;
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (g10.c0().f3670g != g10.o0()) {
                        a10.h1();
                        a10.C0();
                        if (g10.o0() == Integer.MAX_VALUE) {
                            g10.c0().R1();
                        }
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        /* access modifiers changed from: private */
        public final void D1() {
            L.this.f3616k = 0;
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    b c02 = ((G) p10[i10]).c0();
                    c02.f3670g = c02.f3671h;
                    c02.f3671h = a.e.API_PRIORITY_OTHER;
                    c02.f3683t = false;
                    if (c02.f3674k == G.g.InLayoutBlock) {
                        c02.f3674k = G.g.NotUsed;
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        private final void Q1() {
            boolean e10 = e();
            d2(true);
            G a10 = L.this.f3606a;
            if (!e10) {
                if (a10.d0()) {
                    G.w1(a10, true, false, false, 6, (Object) null);
                } else if (a10.Y()) {
                    G.s1(a10, true, false, false, 6, (Object) null);
                }
            }
            C1235c0 l02 = a10.l0();
            C1235c0 E22 = a10.P().E2();
            while (!C6496s.c(l02, E22) && l02 != null) {
                if (l02.w2()) {
                    l02.O2();
                }
                l02 = l02.E2();
            }
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (g10.o0() != Integer.MAX_VALUE) {
                        g10.c0().Q1();
                        a10.x1(g10);
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        private final void R1() {
            if (e()) {
                int i10 = 0;
                d2(false);
                G a10 = L.this.f3606a;
                C1235c0 l02 = a10.l0();
                C1235c0 E22 = a10.P().E2();
                while (!C6496s.c(l02, E22) && l02 != null) {
                    l02.e3();
                    l02 = l02.E2();
                }
                C1538b v02 = L.this.f3606a.v0();
                int q10 = v02.q();
                if (q10 > 0) {
                    Object[] p10 = v02.p();
                    do {
                        ((G) p10[i10]).c0().R1();
                        i10++;
                    } while (i10 < q10);
                }
            }
        }

        private final void T1() {
            G a10 = L.this.f3606a;
            L l10 = L.this;
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (g10.d0() && g10.f0() == G.g.InMeasureBlock && G.l1(g10, (c1.b) null, 1, (Object) null)) {
                        G.w1(l10.f3606a, false, false, false, 7, (Object) null);
                    }
                    i10++;
                } while (i10 < q10);
            }
        }

        private final void U1() {
            G.g gVar;
            G.w1(L.this.f3606a, false, false, false, 7, (Object) null);
            G n02 = L.this.f3606a.n0();
            if (n02 != null && L.this.f3606a.T() == G.g.NotUsed) {
                G a10 = L.this.f3606a;
                int i10 = a.f3690a[n02.W().ordinal()];
                if (i10 == 1) {
                    gVar = G.g.InMeasureBlock;
                } else if (i10 != 2) {
                    gVar = n02.T();
                } else {
                    gVar = G.g.InLayoutBlock;
                }
                a10.D1(gVar);
            }
        }

        private final void X1(long j10, float f10, C6798l lVar, C2673c cVar) {
            if (L.this.f3606a.K0()) {
                G0.a.a("place is called on a deactivated node");
            }
            L.this.f3608c = G.e.LayingOut;
            this.f3676m = j10;
            this.f3679p = f10;
            this.f3677n = lVar;
            this.f3678o = cVar;
            this.f3673j = true;
            this.f3660A = false;
            m0 b10 = K.b(L.this.f3606a);
            if (L.this.A() || !e()) {
                p().r(false);
                L.this.Y(false);
                this.f3661B = lVar;
                this.f3663D = j10;
                this.f3664E = f10;
                this.f3662C = cVar;
                b10.getSnapshotObserver().c(L.this.f3606a, false, this.f3665F);
            } else {
                L.this.K().b3(j10, f10, lVar, cVar);
                W1();
            }
            L.this.f3608c = G.e.Idle;
        }

        private final void Y1(long j10, float f10, C6798l lVar, C2673c cVar) {
            U.a placementScope;
            boolean z10 = true;
            this.f3683t = true;
            if (!n.i(j10, this.f3676m) || this.f3666G) {
                if (L.this.u() || L.this.v() || this.f3666G) {
                    L.this.f3610e = true;
                    this.f3666G = false;
                }
                S1();
            }
            if (M.a(L.this.f3606a)) {
                C1235c0 F22 = L.this.K().F2();
                if (F22 == null || (placementScope = F22.I1()) == null) {
                    placementScope = K.b(L.this.f3606a).getPlacementScope();
                }
                U.a aVar = placementScope;
                L l10 = L.this;
                a H10 = l10.H();
                C6496s.e(H10);
                G n02 = l10.f3606a.n0();
                if (n02 != null) {
                    n02.U().f3615j = 0;
                }
                H10.W1(a.e.API_PRIORITY_OTHER);
                U.a.h(aVar, H10, n.j(j10), n.k(j10), 0.0f, 4, (Object) null);
            }
            a H11 = L.this.H();
            if (H11 == null || H11.F1()) {
                z10 = false;
            }
            if (z10) {
                G0.a.b("Error: Placement happened before lookahead.");
            }
            X1(j10, f10, lVar, cVar);
        }

        private final void e2(G g10) {
            boolean z10;
            G.g gVar;
            G n02 = g10.n0();
            if (n02 != null) {
                if (this.f3674k == G.g.NotUsed || g10.E()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    G0.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
                int i10 = a.f3690a[n02.W().ordinal()];
                if (i10 == 1) {
                    gVar = G.g.InMeasureBlock;
                } else if (i10 == 2) {
                    gVar = G.g.InLayoutBlock;
                } else {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + n02.W());
                }
                this.f3674k = gVar;
                return;
            }
            this.f3674k = G.g.NotUsed;
        }

        public C1232b D() {
            L U10;
            G n02 = L.this.f3606a.n0();
            if (n02 == null || (U10 = n02.U()) == null) {
                return null;
            }
            return U10.r();
        }

        public void D0(boolean z10) {
            boolean N12 = L.this.K().N1();
            if (z10 != N12) {
                L.this.K().D0(N12);
                this.f3666G = true;
            }
            this.f3667H = z10;
        }

        public final List E1() {
            L.this.f3606a.K1();
            if (!this.f3686w) {
                return this.f3685v.h();
            }
            G a10 = L.this.f3606a;
            C1538b bVar = this.f3685v;
            C1538b v02 = a10.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    if (bVar.q() <= i10) {
                        bVar.b(g10.U().I());
                    } else {
                        bVar.B(i10, g10.U().I());
                    }
                    i10++;
                } while (i10 < q10);
            }
            bVar.z(a10.H().size(), bVar.q());
            this.f3686w = false;
            return this.f3685v.h();
        }

        public final c1.b F1() {
            if (this.f3672i) {
                return c1.b.a(W0());
            }
            return null;
        }

        public final boolean I1() {
            return this.f3687x;
        }

        public void J0() {
            G.w1(L.this.f3606a, false, false, false, 7, (Object) null);
        }

        public final G.g J1() {
            return this.f3674k;
        }

        public final int K1() {
            return this.f3671h;
        }

        public final float L1() {
            return this.f3689z;
        }

        public final void M1(boolean z10) {
            G g10;
            G n02 = L.this.f3606a.n0();
            G.g T10 = L.this.f3606a.T();
            if (n02 != null && T10 != G.g.NotUsed) {
                do {
                    g10 = n02;
                    if (g10.T() != T10 || (n02 = g10.n0()) == null) {
                        int i10 = a.f3691b[T10.ordinal()];
                    }
                    g10 = n02;
                    break;
                } while ((n02 = g10.n0()) == null);
                int i102 = a.f3691b[T10.ordinal()];
                if (i102 == 1) {
                    G.w1(g10, z10, false, false, 6, (Object) null);
                } else if (i102 == 2) {
                    g10.t1(z10);
                } else {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
            }
        }

        public final void N1() {
            this.f3680q = true;
        }

        public final boolean O1() {
            return this.f3683t;
        }

        public final void P1() {
            L.this.f3607b = true;
        }

        public int S0() {
            return L.this.K().S0();
        }

        public final void S1() {
            C1538b v02;
            int q10;
            if (L.this.s() > 0 && (q10 = v02.q()) > 0) {
                Object[] p10 = (v02 = L.this.f3606a.v0()).p();
                int i10 = 0;
                do {
                    G g10 = (G) p10[i10];
                    L U10 = g10.U();
                    if ((U10.v() || U10.u()) && !U10.A()) {
                        G.u1(g10, false, 1, (Object) null);
                    }
                    U10.I().S1();
                    i10++;
                } while (i10 < q10);
            }
        }

        public void T() {
            this.f3687x = true;
            p().o();
            if (L.this.A()) {
                T1();
            }
            if (L.this.f3611f || (!this.f3675l && !o0().O1() && L.this.A())) {
                L.this.f3610e = false;
                G.e B10 = L.this.B();
                L.this.f3608c = G.e.LayingOut;
                L.this.Z(false);
                G a10 = L.this.f3606a;
                K.b(a10).getSnapshotObserver().e(a10, false, this.f3688y);
                L.this.f3608c = B10;
                if (o0().O1() && L.this.v()) {
                    requestLayout();
                }
                L.this.f3611f = false;
            }
            if (p().l()) {
                p().q(true);
            }
            if (p().g() && p().k()) {
                p().n();
            }
            this.f3687x = false;
        }

        public int U0() {
            return L.this.K().U0();
        }

        public final void V1() {
            this.f3671h = a.e.API_PRIORITY_OTHER;
            this.f3670g = a.e.API_PRIORITY_OTHER;
            d2(false);
        }

        public final void W1() {
            this.f3660A = true;
            G n02 = L.this.f3606a.n0();
            float G22 = o0().G2();
            G a10 = L.this.f3606a;
            C1235c0 l02 = a10.l0();
            C1235c0 P10 = a10.P();
            while (l02 != P10) {
                C6496s.f(l02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                C c10 = (C) l02;
                G22 += c10.G2();
                l02 = c10.E2();
            }
            if (G22 != this.f3689z) {
                this.f3689z = G22;
                if (n02 != null) {
                    n02.h1();
                }
                if (n02 != null) {
                    n02.C0();
                }
            }
            boolean z10 = false;
            if (!e()) {
                if (n02 != null) {
                    n02.C0();
                }
                Q1();
                if (this.f3669f && n02 != null) {
                    G.u1(n02, false, 1, (Object) null);
                }
            }
            if (n02 == null) {
                this.f3671h = 0;
            } else if (!this.f3669f && n02.W() == G.e.LayingOut) {
                if (this.f3671h == Integer.MAX_VALUE) {
                    z10 = true;
                }
                if (!z10) {
                    G0.a.b("Place was called on a node which was placed already");
                }
                this.f3671h = n02.U().f3616k;
                L U10 = n02.U();
                U10.f3616k = U10.f3616k + 1;
            }
            T();
        }

        public final boolean Z1(long j10) {
            boolean z10;
            if (L.this.f3606a.K0()) {
                G0.a.a("measure is called on a deactivated node");
            }
            m0 b10 = K.b(L.this.f3606a);
            G n02 = L.this.f3606a.n0();
            G a10 = L.this.f3606a;
            boolean z11 = true;
            if (L.this.f3606a.E() || (n02 != null && n02.E())) {
                z10 = true;
            } else {
                z10 = false;
            }
            a10.A1(z10);
            if (L.this.f3606a.d0() || !c1.b.f(W0(), j10)) {
                p().s(false);
                u(d.f3697a);
                this.f3672i = true;
                long b11 = L.this.K().b();
                k1(j10);
                L.this.U(j10);
                if (r.e(L.this.K().b(), b11) && L.this.K().X0() == X0() && L.this.K().R0() == R0()) {
                    z11 = false;
                }
                i1(s.a(L.this.K().X0(), L.this.K().R0()));
                return z11;
            }
            m0.q(b10, L.this.f3606a, false, 2, (Object) null);
            L.this.f3606a.z1();
            return false;
        }

        public Object a() {
            return this.f3681r;
        }

        public final void a2() {
            G n02;
            try {
                this.f3669f = true;
                if (!this.f3673j) {
                    G0.a.b("replace called on unplaced item");
                }
                boolean e10 = e();
                X1(this.f3676m, this.f3679p, this.f3677n, this.f3678o);
                if (e10 && !this.f3660A && (n02 = L.this.f3606a.n0()) != null) {
                    G.u1(n02, false, 1, (Object) null);
                }
                this.f3669f = false;
            } catch (Throwable th2) {
                this.f3669f = false;
                throw th2;
            }
        }

        public final void b2(boolean z10) {
            this.f3686w = z10;
        }

        public final void c2(G.g gVar) {
            this.f3674k = gVar;
        }

        public void d2(boolean z10) {
            this.f3682s = z10;
        }

        public boolean e() {
            return this.f3682s;
        }

        public int e0(int i10) {
            U1();
            return L.this.K().e0(i10);
        }

        /* access modifiers changed from: protected */
        public void e1(long j10, float f10, C2673c cVar) {
            Y1(j10, f10, (C6798l) null, cVar);
        }

        /* access modifiers changed from: protected */
        public void f1(long j10, float f10, C6798l lVar) {
            Y1(j10, f10, lVar, (C2673c) null);
        }

        public final boolean f2() {
            if ((a() == null && L.this.K().a() == null) || !this.f3680q) {
                return false;
            }
            this.f3680q = false;
            this.f3681r = L.this.K().a();
            return true;
        }

        public int k0(C1180a aVar) {
            G.e eVar;
            G n02 = L.this.f3606a.n0();
            G.e eVar2 = null;
            if (n02 != null) {
                eVar = n02.W();
            } else {
                eVar = null;
            }
            if (eVar == G.e.Measuring) {
                p().u(true);
            } else {
                G n03 = L.this.f3606a.n0();
                if (n03 != null) {
                    eVar2 = n03.W();
                }
                if (eVar2 == G.e.LayingOut) {
                    p().t(true);
                }
            }
            this.f3675l = true;
            int k02 = L.this.K().k0(aVar);
            this.f3675l = false;
            return k02;
        }

        public C1235c0 o0() {
            return L.this.f3606a.P();
        }

        public C1230a p() {
            return this.f3684u;
        }

        public void requestLayout() {
            G.u1(L.this.f3606a, false, 1, (Object) null);
        }

        public int s(int i10) {
            U1();
            return L.this.K().s(i10);
        }

        public int s0(int i10) {
            U1();
            return L.this.K().s0(i10);
        }

        public int t0(int i10) {
            U1();
            return L.this.K().t0(i10);
        }

        public void u(C6798l lVar) {
            C1538b v02 = L.this.f3606a.v0();
            int q10 = v02.q();
            if (q10 > 0) {
                Object[] p10 = v02.p();
                int i10 = 0;
                do {
                    lVar.invoke(((G) p10[i10]).U().r());
                    i10++;
                } while (i10 < q10);
            }
        }

        public U v0(long j10) {
            G.g T10 = L.this.f3606a.T();
            G.g gVar = G.g.NotUsed;
            if (T10 == gVar) {
                L.this.f3606a.v();
            }
            if (M.a(L.this.f3606a)) {
                a H10 = L.this.H();
                C6496s.e(H10);
                H10.V1(gVar);
                H10.v0(j10);
            }
            e2(L.this.f3606a);
            Z1(j10);
            return this;
        }

        public Map x() {
            if (!this.f3675l) {
                if (L.this.B() == G.e.Measuring) {
                    p().s(true);
                    if (p().g()) {
                        L.this.O();
                    }
                } else {
                    p().r(true);
                }
            }
            o0().S1(true);
            T();
            o0().S1(false);
            return p().h();
        }
    }

    static final class c extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f3698a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f3699b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(L l10, long j10) {
            super(0);
            this.f3698a = l10;
            this.f3699b = j10;
        }

        public final void invoke() {
            Q z22 = this.f3698a.K().z2();
            C6496s.e(z22);
            z22.v0(this.f3699b);
        }
    }

    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L f3700a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(L l10) {
            super(0);
            this.f3700a = l10;
        }

        public final void invoke() {
            this.f3700a.K().v0(this.f3700a.f3625t);
        }
    }

    public L(G g10) {
        this.f3606a = g10;
    }

    /* access modifiers changed from: private */
    public final void T(long j10) {
        this.f3608c = G.e.LookaheadMeasuring;
        this.f3612g = false;
        o0.h(K.b(this.f3606a).getSnapshotObserver(), this.f3606a, false, new c(this, j10), 2, (Object) null);
        P();
        if (M.a(this.f3606a)) {
            O();
        } else {
            R();
        }
        this.f3608c = G.e.Idle;
    }

    /* access modifiers changed from: private */
    public final void U(long j10) {
        boolean z10;
        G.e eVar = this.f3608c;
        G.e eVar2 = G.e.Idle;
        if (eVar == eVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.b("layout state is not idle before measure starts");
        }
        G.e eVar3 = G.e.Measuring;
        this.f3608c = eVar3;
        this.f3609d = false;
        this.f3625t = j10;
        K.b(this.f3606a).getSnapshotObserver().g(this.f3606a, false, this.f3626u);
        if (this.f3608c == eVar3) {
            O();
            this.f3608c = eVar2;
        }
    }

    public final boolean A() {
        return this.f3610e;
    }

    public final G.e B() {
        return this.f3608c;
    }

    public final C1232b C() {
        return this.f3624s;
    }

    public final boolean D() {
        return this.f3621p;
    }

    public final boolean E() {
        return this.f3620o;
    }

    public final boolean F() {
        return this.f3613h;
    }

    public final boolean G() {
        return this.f3612g;
    }

    public final a H() {
        return this.f3624s;
    }

    public final b I() {
        return this.f3623r;
    }

    public final boolean J() {
        return this.f3609d;
    }

    public final C1235c0 K() {
        return this.f3606a.j0().n();
    }

    public final int L() {
        return this.f3623r.X0();
    }

    public final void M() {
        this.f3623r.N1();
        a aVar = this.f3624s;
        if (aVar != null) {
            aVar.J1();
        }
    }

    public final void N() {
        this.f3623r.b2(true);
        a aVar = this.f3624s;
        if (aVar != null) {
            aVar.U1(true);
        }
    }

    public final void O() {
        this.f3610e = true;
        this.f3611f = true;
    }

    public final void P() {
        this.f3613h = true;
        this.f3614i = true;
    }

    public final void Q() {
        this.f3612g = true;
    }

    public final void R() {
        this.f3609d = true;
    }

    public final void S() {
        G.e W10 = this.f3606a.W();
        if (W10 == G.e.LayingOut || W10 == G.e.LookaheadLayingOut) {
            if (this.f3623r.I1()) {
                Z(true);
            } else {
                Y(true);
            }
        }
        if (W10 == G.e.LookaheadLayingOut) {
            a aVar = this.f3624s;
            if (aVar == null || !aVar.C1()) {
                a0(true);
            } else {
                b0(true);
            }
        }
    }

    public final void V() {
        C1230a p10;
        this.f3623r.p().p();
        a aVar = this.f3624s;
        if (aVar != null && (p10 = aVar.p()) != null) {
            p10.p();
        }
    }

    public final void W(int i10) {
        boolean z10;
        L l10;
        int i11 = this.f3619n;
        this.f3619n = i10;
        boolean z11 = false;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            G n02 = this.f3606a.n0();
            if (n02 != null) {
                l10 = n02.U();
            } else {
                l10 = null;
            }
            if (l10 == null) {
                return;
            }
            if (i10 == 0) {
                l10.W(l10.f3619n - 1);
            } else {
                l10.W(l10.f3619n + 1);
            }
        }
    }

    public final void X(int i10) {
        boolean z10;
        L l10;
        int i11 = this.f3622q;
        this.f3622q = i10;
        boolean z11 = false;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 0) {
            z11 = true;
        }
        if (z10 != z11) {
            G n02 = this.f3606a.n0();
            if (n02 != null) {
                l10 = n02.U();
            } else {
                l10 = null;
            }
            if (l10 == null) {
                return;
            }
            if (i10 == 0) {
                l10.X(l10.f3622q - 1);
            } else {
                l10.X(l10.f3622q + 1);
            }
        }
    }

    public final void Y(boolean z10) {
        if (this.f3618m != z10) {
            this.f3618m = z10;
            if (z10 && !this.f3617l) {
                W(this.f3619n + 1);
            } else if (!z10 && !this.f3617l) {
                W(this.f3619n - 1);
            }
        }
    }

    public final void Z(boolean z10) {
        if (this.f3617l != z10) {
            this.f3617l = z10;
            if (z10 && !this.f3618m) {
                W(this.f3619n + 1);
            } else if (!z10 && !this.f3618m) {
                W(this.f3619n - 1);
            }
        }
    }

    public final void a0(boolean z10) {
        if (this.f3621p != z10) {
            this.f3621p = z10;
            if (z10 && !this.f3620o) {
                X(this.f3622q + 1);
            } else if (!z10 && !this.f3620o) {
                X(this.f3622q - 1);
            }
        }
    }

    public final void b0(boolean z10) {
        if (this.f3620o != z10) {
            this.f3620o = z10;
            if (z10 && !this.f3621p) {
                X(this.f3622q + 1);
            } else if (!z10 && !this.f3621p) {
                X(this.f3622q - 1);
            }
        }
    }

    public final void c0() {
        G n02;
        if (this.f3623r.f2() && (n02 = this.f3606a.n0()) != null) {
            G.w1(n02, false, false, false, 7, (Object) null);
        }
        a aVar = this.f3624s;
        if (aVar != null && aVar.Z1()) {
            if (M.a(this.f3606a)) {
                G n03 = this.f3606a.n0();
                if (n03 != null) {
                    G.w1(n03, false, false, false, 7, (Object) null);
                    return;
                }
                return;
            }
            G n04 = this.f3606a.n0();
            if (n04 != null) {
                G.s1(n04, false, false, false, 7, (Object) null);
            }
        }
    }

    public final void q() {
        if (this.f3624s == null) {
            this.f3624s = new a();
        }
    }

    public final C1232b r() {
        return this.f3623r;
    }

    public final int s() {
        return this.f3619n;
    }

    public final int t() {
        return this.f3622q;
    }

    public final boolean u() {
        return this.f3618m;
    }

    public final boolean v() {
        return this.f3617l;
    }

    public final boolean w() {
        return this.f3607b;
    }

    public final int x() {
        return this.f3623r.R0();
    }

    public final c1.b y() {
        return this.f3623r.F1();
    }

    public final c1.b z() {
        a aVar = this.f3624s;
        if (aVar != null) {
            return aVar.z1();
        }
        return null;
    }
}
