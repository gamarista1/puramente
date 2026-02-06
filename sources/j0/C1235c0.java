package J0;

import H0.C;
import H0.C1197s;
import H0.C1198t;
import H0.E;
import H0.G;
import a0.C1538b;
import c1.n;
import c1.o;
import c1.r;
import c1.s;
import c1.t;
import i0.C2057k;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.C6527k;
import q0.C2419e;
import q0.C2420f;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import q0.C2427m;
import q0.C2428n;
import r0.C2520p0;
import r0.M1;
import r0.Q1;
import u0.C2673c;
import yf.C6787a;
import yf.C6798l;
import yf.p;

/* renamed from: J0.c0  reason: case insensitive filesystem */
public abstract class C1235c0 extends P implements E, C1197s, n0 {

    /* renamed from: Z  reason: collision with root package name */
    public static final e f3784Z = new e((DefaultConstructorMarker) null);

    /* renamed from: f0  reason: collision with root package name */
    private static final C6798l f3785f0 = d.f3815a;
    /* access modifiers changed from: private */

    /* renamed from: g0  reason: collision with root package name */
    public static final C6798l f3786g0 = c.f3814a;
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public static final androidx.compose.ui.graphics.d f3787h0 = new androidx.compose.ui.graphics.d();
    /* access modifiers changed from: private */

    /* renamed from: i0  reason: collision with root package name */
    public static final C1259z f3788i0 = new C1259z();

    /* renamed from: j0  reason: collision with root package name */
    private static final float[] f3789j0 = M1.c((float[]) null, 1, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: k0  reason: collision with root package name */
    public static final f f3790k0 = new a();
    /* access modifiers changed from: private */

    /* renamed from: l0  reason: collision with root package name */
    public static final f f3791l0 = new b();

    /* renamed from: A  reason: collision with root package name */
    private G f3792A;

    /* renamed from: B  reason: collision with root package name */
    private Map f3793B;

    /* renamed from: C  reason: collision with root package name */
    private long f3794C = n.f19226b.a();

    /* renamed from: D  reason: collision with root package name */
    private float f3795D;

    /* renamed from: E  reason: collision with root package name */
    private C2419e f3796E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public C1259z f3797F;

    /* renamed from: G  reason: collision with root package name */
    private final p f3798G = new g(this);

    /* renamed from: H  reason: collision with root package name */
    private final C6787a f3799H = new j(this);
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public boolean f3800I;

    /* renamed from: X  reason: collision with root package name */
    private l0 f3801X;

    /* renamed from: Y  reason: collision with root package name */
    private C2673c f3802Y;

    /* renamed from: p  reason: collision with root package name */
    private final G f3803p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3804q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3805r;

    /* renamed from: s  reason: collision with root package name */
    private C1235c0 f3806s;

    /* renamed from: t  reason: collision with root package name */
    private C1235c0 f3807t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f3808u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3809v;

    /* renamed from: w  reason: collision with root package name */
    private C6798l f3810w;

    /* renamed from: x  reason: collision with root package name */
    private c1.d f3811x = A1().K();

    /* renamed from: y  reason: collision with root package name */
    private t f3812y = A1().getLayoutDirection();

    /* renamed from: z  reason: collision with root package name */
    private float f3813z = 0.8f;

    /* renamed from: J0.c0$a */
    public static final class a implements f {
        a() {
        }

        public int a() {
            return C1239e0.a(16);
        }

        public boolean b(i.c cVar) {
            int a10 = C1239e0.a(16);
            C1538b bVar = null;
            while (cVar != null) {
                if (cVar instanceof s0) {
                    if (((s0) cVar).k0()) {
                        return true;
                    }
                } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                    int i10 = 0;
                    for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                        if ((m22.N1() & a10) != 0) {
                            i10++;
                            if (i10 == 1) {
                                cVar = m22;
                            } else {
                                if (bVar == null) {
                                    bVar = new C1538b(new i.c[16], 0);
                                }
                                if (cVar != null) {
                                    bVar.b(cVar);
                                    cVar = null;
                                }
                                bVar.b(m22);
                            }
                        }
                    }
                    if (i10 == 1) {
                    }
                }
                cVar = C1245k.g(bVar);
            }
            return false;
        }

        public void c(G g10, long j10, C1254u uVar, boolean z10, boolean z11) {
            g10.w0(j10, uVar, z10, z11);
        }

        public boolean d(G g10) {
            return true;
        }
    }

    /* renamed from: J0.c0$b */
    public static final class b implements f {
        b() {
        }

        public int a() {
            return C1239e0.a(8);
        }

        public boolean b(i.c cVar) {
            return false;
        }

        public void c(G g10, long j10, C1254u uVar, boolean z10, boolean z11) {
            g10.y0(j10, uVar, z10, z11);
        }

        public boolean d(G g10) {
            O0.j I10 = g10.I();
            boolean z10 = false;
            if (I10 != null && I10.x()) {
                z10 = true;
            }
            return !z10;
        }
    }

    /* renamed from: J0.c0$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3814a = new c();

        c() {
            super(1);
        }

        public final void a(C1235c0 c0Var) {
            l0 y22 = c0Var.y2();
            if (y22 != null) {
                y22.invalidate();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1235c0) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J0.c0$d */
    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3815a = new d();

        d() {
            super(1);
        }

        public final void a(C1235c0 c0Var) {
            if (c0Var.Y0()) {
                C1259z W12 = c0Var.f3797F;
                if (W12 == null) {
                    C1235c0.v3(c0Var, false, 1, (Object) null);
                    return;
                }
                C1235c0.f3788i0.a(W12);
                C1235c0.v3(c0Var, false, 1, (Object) null);
                if (!C1235c0.f3788i0.c(W12)) {
                    G A12 = c0Var.A1();
                    L U10 = A12.U();
                    if (U10.s() > 0) {
                        if (U10.u() || U10.v()) {
                            G.u1(A12, false, 1, (Object) null);
                        }
                        U10.I().S1();
                    }
                    m0 m02 = A12.m0();
                    if (m02 != null) {
                        m02.s(A12);
                    }
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1235c0) obj);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J0.c0$e */
    public static final class e {
        public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return C1235c0.f3790k0;
        }

        public final f b() {
            return C1235c0.f3791l0;
        }

        private e() {
        }
    }

    /* renamed from: J0.c0$f */
    public interface f {
        int a();

        boolean b(i.c cVar);

        void c(G g10, long j10, C1254u uVar, boolean z10, boolean z11);

        boolean d(G g10);
    }

    /* renamed from: J0.c0$g */
    static final class g extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1235c0 f3816a;

        /* renamed from: J0.c0$g$a */
        static final class a extends C6498u implements C6787a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C1235c0 f3817a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C2520p0 f3818b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C2673c f3819c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C1235c0 c0Var, C2520p0 p0Var, C2673c cVar) {
                super(0);
                this.f3817a = c0Var;
                this.f3818b = p0Var;
                this.f3819c = cVar;
            }

            public final void invoke() {
                this.f3817a.o2(this.f3818b, this.f3819c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C1235c0 c0Var) {
            super(2);
            this.f3816a = c0Var;
        }

        public final void a(C2520p0 p0Var, C2673c cVar) {
            if (this.f3816a.A1().e()) {
                this.f3816a.C2().i(this.f3816a, C1235c0.f3786g0, new a(this.f3816a, p0Var, cVar));
                this.f3816a.f3800I = false;
                return;
            }
            this.f3816a.f3800I = true;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C2520p0) obj, (C2673c) obj2);
            return C6514M.f71813a;
        }
    }

    /* renamed from: J0.c0$h */
    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1235c0 f3820a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i.c f3821b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f3822c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f3823d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1254u f3824e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f3825f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f3826g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C1235c0 c0Var, i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11) {
            super(0);
            this.f3820a = c0Var;
            this.f3821b = cVar;
            this.f3822c = fVar;
            this.f3823d = j10;
            this.f3824e = uVar;
            this.f3825f = z10;
            this.f3826g = z11;
        }

        public final void invoke() {
            this.f3820a.K2(C1237d0.b(this.f3821b, this.f3822c.a(), C1239e0.a(2)), this.f3822c, this.f3823d, this.f3824e, this.f3825f, this.f3826g);
        }
    }

    /* renamed from: J0.c0$i */
    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1235c0 f3827a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i.c f3828b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f3829c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f3830d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1254u f3831e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f3832f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f3833g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f3834h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C1235c0 c0Var, i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f3827a = c0Var;
            this.f3828b = cVar;
            this.f3829c = fVar;
            this.f3830d = j10;
            this.f3831e = uVar;
            this.f3832f = z10;
            this.f3833g = z11;
            this.f3834h = f10;
        }

        public final void invoke() {
            this.f3827a.L2(C1237d0.b(this.f3828b, this.f3829c.a(), C1239e0.a(2)), this.f3829c, this.f3830d, this.f3831e, this.f3832f, this.f3833g, this.f3834h);
        }
    }

    /* renamed from: J0.c0$j */
    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1235c0 f3835a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C1235c0 c0Var) {
            super(0);
            this.f3835a = c0Var;
        }

        public final void invoke() {
            C1235c0 F22 = this.f3835a.F2();
            if (F22 != null) {
                F22.O2();
            }
        }
    }

    /* renamed from: J0.c0$k */
    static final class k extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1235c0 f3836a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i.c f3837b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f3838c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f3839d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C1254u f3840e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f3841f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f3842g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f3843h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C1235c0 c0Var, i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11, float f10) {
            super(0);
            this.f3836a = c0Var;
            this.f3837b = cVar;
            this.f3838c = fVar;
            this.f3839d = j10;
            this.f3840e = uVar;
            this.f3841f = z10;
            this.f3842g = z11;
            this.f3843h = f10;
        }

        public final void invoke() {
            this.f3836a.l3(C1237d0.b(this.f3837b, this.f3838c.a(), C1239e0.a(2)), this.f3838c, this.f3839d, this.f3840e, this.f3841f, this.f3842g, this.f3843h);
        }
    }

    /* renamed from: J0.c0$l */
    static final class l extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6798l f3844a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C6798l lVar) {
            super(0);
            this.f3844a = lVar;
        }

        public final void invoke() {
            this.f3844a.invoke(C1235c0.f3787h0);
            C1235c0.f3787h0.k0();
        }
    }

    public C1235c0(G g10) {
        this.f3803p = g10;
    }

    /* access modifiers changed from: private */
    public final o0 C2() {
        return K.b(A1()).getSnapshotObserver();
    }

    private final boolean H2(int i10) {
        i.c J22 = J2(f0.i(i10));
        if (J22 == null || !C1245k.e(J22, i10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final i.c J2(boolean z10) {
        i.c D22;
        if (A1().l0() == this) {
            return A1().j0().k();
        }
        if (z10) {
            C1235c0 c0Var = this.f3807t;
            if (!(c0Var == null || (D22 = c0Var.D2()) == null)) {
                return D22.J1();
            }
        } else {
            C1235c0 c0Var2 = this.f3807t;
            if (c0Var2 != null) {
                return c0Var2.D2();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final void K2(i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11) {
        if (cVar == null) {
            N2(fVar, j10, uVar, z10, z11);
            return;
        }
        uVar.C(cVar, z11, new h(this, cVar, fVar, j10, uVar, z10, z11));
    }

    /* access modifiers changed from: private */
    public final void L2(i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            N2(fVar, j10, uVar, z10, z11);
            return;
        }
        float f11 = f10;
        uVar.D(cVar, f11, z11, new i(this, cVar, fVar, j10, uVar, z10, z11, f10));
    }

    private final long R2(long j10) {
        float f10;
        float f11;
        float m10 = C2421g.m(j10);
        if (m10 < 0.0f) {
            f10 = -m10;
        } else {
            f10 = m10 - ((float) U0());
        }
        float max = Math.max(0.0f, f10);
        float n10 = C2421g.n(j10);
        if (n10 < 0.0f) {
            f11 = -n10;
        } else {
            f11 = n10 - ((float) S0());
        }
        return C2422h.a(max, Math.max(0.0f, f11));
    }

    private final void a3(long j10, float f10, C6798l lVar, C2673c cVar) {
        boolean z10;
        if (cVar != null) {
            if (lVar == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                G0.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.f3802Y != cVar) {
                this.f3802Y = null;
                t3(this, (C6798l) null, false, 2, (Object) null);
                this.f3802Y = cVar;
            }
            if (this.f3801X == null) {
                l0 w10 = K.b(A1()).w(this.f3798G, this.f3799H, cVar);
                w10.d(T0());
                w10.j(j10);
                this.f3801X = w10;
                A1().B1(true);
                this.f3799H.invoke();
            }
        } else {
            if (this.f3802Y != null) {
                this.f3802Y = null;
                t3(this, (C6798l) null, false, 2, (Object) null);
            }
            t3(this, lVar, false, 2, (Object) null);
        }
        if (!n.i(J1(), j10)) {
            h3(j10);
            A1().U().I().S1();
            l0 l0Var = this.f3801X;
            if (l0Var != null) {
                l0Var.j(j10);
            } else {
                C1235c0 c0Var = this.f3807t;
                if (c0Var != null) {
                    c0Var.O2();
                }
            }
            L1(this);
            m0 m02 = A1().m0();
            if (m02 != null) {
                m02.t(A1());
            }
        }
        this.f3795D = f10;
        if (!O1()) {
            q1(E1());
        }
    }

    public static /* synthetic */ void d3(C1235c0 c0Var, C2419e eVar, boolean z10, boolean z11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            c0Var.c3(eVar, z10, z11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
    }

    private final void i2(C1235c0 c0Var, C2419e eVar, boolean z10) {
        if (c0Var != this) {
            C1235c0 c0Var2 = this.f3807t;
            if (c0Var2 != null) {
                c0Var2.i2(c0Var, eVar, z10);
            }
            t2(eVar, z10);
        }
    }

    private final long j2(C1235c0 c0Var, long j10, boolean z10) {
        if (c0Var == this) {
            return j10;
        }
        C1235c0 c0Var2 = this.f3807t;
        if (c0Var2 == null || C6496s.c(c0Var, c0Var2)) {
            return r2(j10, z10);
        }
        return r2(c0Var2.j2(c0Var, j10, z10), z10);
    }

    /* access modifiers changed from: private */
    public final void l3(i.c cVar, f fVar, long j10, C1254u uVar, boolean z10, boolean z11, float f10) {
        if (cVar == null) {
            N2(fVar, j10, uVar, z10, z11);
            return;
        }
        f fVar2 = fVar;
        if (fVar.b(cVar)) {
            boolean z12 = z11;
            float f11 = f10;
            uVar.P(cVar, f11, z12, new k(this, cVar, fVar, j10, uVar, z10, z12, f11));
            return;
        }
        C1254u uVar2 = uVar;
        l3(C1237d0.b(cVar, fVar.a(), C1239e0.a(2)), fVar, j10, uVar, z10, z11, f10);
    }

    private final C1235c0 m3(C1197s sVar) {
        C c10;
        C1235c0 a10;
        if (sVar instanceof C) {
            c10 = (C) sVar;
        } else {
            c10 = null;
        }
        if (c10 != null && (a10 = c10.a()) != null) {
            return a10;
        }
        C6496s.f(sVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (C1235c0) sVar;
    }

    /* access modifiers changed from: private */
    public final void o2(C2520p0 p0Var, C2673c cVar) {
        i.c I22 = I2(C1239e0.a(4));
        if (I22 == null) {
            Z2(p0Var, cVar);
            return;
        }
        A1().b0().a(p0Var, s.d(b()), this, I22, cVar);
    }

    public static /* synthetic */ long o3(C1235c0 c0Var, long j10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return c0Var.n3(j10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
    }

    private final void q3(C1235c0 c0Var, float[] fArr) {
        if (!C6496s.c(c0Var, this)) {
            C1235c0 c0Var2 = this.f3807t;
            C6496s.e(c0Var2);
            c0Var2.q3(c0Var, fArr);
            if (!n.i(J1(), n.f19226b.a())) {
                float[] fArr2 = f3789j0;
                M1.h(fArr2);
                M1.q(fArr2, -((float) n.j(J1())), -((float) n.k(J1())), 0.0f, 4, (Object) null);
                M1.n(fArr, fArr2);
            }
            l0 l0Var = this.f3801X;
            if (l0Var != null) {
                l0Var.i(fArr);
            }
        }
    }

    private final void r3(C1235c0 c0Var, float[] fArr) {
        C1235c0 c0Var2 = this;
        while (!C6496s.c(c0Var2, c0Var)) {
            l0 l0Var = c0Var2.f3801X;
            if (l0Var != null) {
                l0Var.a(fArr);
            }
            long J12 = c0Var2.J1();
            if (!n.i(J12, n.f19226b.a())) {
                float[] fArr2 = f3789j0;
                M1.h(fArr2);
                M1.q(fArr2, (float) n.j(J12), (float) n.k(J12), 0.0f, 4, (Object) null);
                M1.n(fArr, fArr2);
            }
            c0Var2 = c0Var2.f3807t;
            C6496s.e(c0Var2);
        }
    }

    public static /* synthetic */ long s2(C1235c0 c0Var, long j10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return c0Var.r2(j10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
    }

    private final void t2(C2419e eVar, boolean z10) {
        float j10 = (float) n.j(J1());
        eVar.i(eVar.b() - j10);
        eVar.j(eVar.c() - j10);
        float k10 = (float) n.k(J1());
        eVar.k(eVar.d() - k10);
        eVar.h(eVar.a() - k10);
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.b(eVar, true);
            if (this.f3809v && z10) {
                eVar.e(0.0f, 0.0f, (float) r.g(b()), (float) r.f(b()));
                eVar.f();
            }
        }
    }

    public static /* synthetic */ void t3(C1235c0 c0Var, C6798l lVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            c0Var.s3(lVar, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
    }

    private final void u3(boolean z10) {
        boolean z11;
        m0 m02;
        if (this.f3802Y == null) {
            l0 l0Var = this.f3801X;
            if (l0Var != null) {
                C6798l lVar = this.f3810w;
                if (lVar != null) {
                    androidx.compose.ui.graphics.d dVar = f3787h0;
                    dVar.T();
                    dVar.W(A1().K());
                    dVar.b0(A1().getLayoutDirection());
                    dVar.e0(s.d(b()));
                    C2().i(this, f3785f0, new l(lVar));
                    C1259z zVar = this.f3797F;
                    if (zVar == null) {
                        zVar = new C1259z();
                        this.f3797F = zVar;
                    }
                    zVar.b(dVar);
                    l0Var.g(dVar);
                    this.f3809v = dVar.o();
                    this.f3813z = dVar.a();
                    if (z10 && (m02 = A1().m0()) != null) {
                        m02.t(A1());
                        return;
                    }
                    return;
                }
                G0.a.c("updateLayerParameters requires a non-null layerBlock");
                throw new C6527k();
            }
            if (this.f3810w == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                G0.a.b("null layer with a non-null layerBlock");
            }
        }
    }

    static /* synthetic */ void v3(C1235c0 c0Var, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            c0Var.u3(z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
    }

    public long A0(C1197s sVar, long j10, boolean z10) {
        if (sVar instanceof C) {
            ((C) sVar).a().S2();
            return C2421g.u(sVar.A0(this, C2421g.u(j10), z10));
        }
        C1235c0 m32 = m3(sVar);
        m32.S2();
        C1235c0 q22 = q2(m32);
        while (m32 != q22) {
            j10 = m32.n3(j10, z10);
            m32 = m32.f3807t;
            C6496s.e(m32);
        }
        return j2(q22, j10, z10);
    }

    public G A1() {
        return this.f3803p;
    }

    public final long A2() {
        return this.f3811x.B1(A1().r0().e());
    }

    public final C1197s B() {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S2();
        return this.f3807t;
    }

    /* access modifiers changed from: protected */
    public final C2419e B2() {
        C2419e eVar = this.f3796E;
        if (eVar != null) {
            return eVar;
        }
        C2419e eVar2 = new C2419e(0.0f, 0.0f, 0.0f, 0.0f);
        this.f3796E = eVar2;
        return eVar2;
    }

    public boolean D1() {
        if (this.f3792A != null) {
            return true;
        }
        return false;
    }

    public abstract i.c D2();

    public G E1() {
        G g10 = this.f3792A;
        if (g10 != null) {
            return g10;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    public final C1235c0 E2() {
        return this.f3806s;
    }

    public P F1() {
        return this.f3807t;
    }

    public final C1235c0 F2() {
        return this.f3807t;
    }

    public boolean G() {
        return D2().S1();
    }

    public final float G2() {
        return this.f3795D;
    }

    public long H0(long j10) {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S2();
        long j11 = j10;
        for (C1235c0 c0Var = this; c0Var != null; c0Var = c0Var.f3807t) {
            j11 = o3(c0Var, j11, false, 2, (Object) null);
        }
        return j11;
    }

    public final i.c I2(int i10) {
        boolean i11 = f0.i(i10);
        i.c D22 = D2();
        if (!i11 && (D22 = D22.P1()) == null) {
            return null;
        }
        i.c c22 = J2(i11);
        while (c22 != null && (c22.I1() & i10) != 0) {
            if ((c22.N1() & i10) != 0) {
                return c22;
            }
            if (c22 == D22) {
                return null;
            }
            c22 = c22.J1();
        }
        return null;
    }

    public long J1() {
        return this.f3794C;
    }

    public long L(long j10) {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        C1197s d10 = C1198t.d(this);
        return W(d10, C2421g.q(K.b(A1()).r(j10), C1198t.e(d10)));
    }

    public final void M2(f fVar, long j10, C1254u uVar, boolean z10, boolean z11) {
        float l22;
        long j11 = j10;
        C1254u uVar2 = uVar;
        i.c I22 = I2(fVar.a());
        if (!w3(j10)) {
            if (z10) {
                float l23 = l2(j10, A2());
                if (!Float.isInfinite(l23) && !Float.isNaN(l23) && uVar.H(l23, false)) {
                    L2(I22, fVar, j10, uVar, z10, false, l23);
                }
            }
        } else if (I22 == null) {
            N2(fVar, j10, uVar, z10, z11);
        } else if (P2(j10)) {
            K2(I22, fVar, j10, uVar, z10, z11);
        } else {
            if (!z10) {
                l22 = Float.POSITIVE_INFINITY;
            } else {
                l22 = l2(j10, A2());
            }
            float f10 = l22;
            if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                boolean z12 = z11;
            } else if (uVar.H(f10, z11)) {
                L2(I22, fVar, j10, uVar, z10, z11, f10);
                return;
            }
            l3(I22, fVar, j10, uVar, z10, z11, f10);
        }
    }

    public void N2(f fVar, long j10, C1254u uVar, boolean z10, boolean z11) {
        C1235c0 c0Var = this.f3806s;
        if (c0Var != null) {
            C1235c0 c0Var2 = c0Var;
            c0Var2.M2(fVar, s2(c0Var2, j10, false, 2, (Object) null), uVar, z10, z11);
        }
    }

    public void O(C1197s sVar, float[] fArr) {
        C1235c0 m32 = m3(sVar);
        m32.S2();
        C1235c0 q22 = q2(m32);
        M1.h(fArr);
        m32.r3(q22, fArr);
        q3(q22, fArr);
    }

    public void O2() {
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.invalidate();
            return;
        }
        C1235c0 c0Var = this.f3807t;
        if (c0Var != null) {
            c0Var.O2();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean P2(long j10) {
        float m10 = C2421g.m(j10);
        float n10 = C2421g.n(j10);
        if (m10 < 0.0f || n10 < 0.0f || m10 >= ((float) U0()) || n10 >= ((float) S0())) {
            return false;
        }
        return true;
    }

    public final boolean Q2() {
        if (this.f3801X != null && this.f3813z <= 0.0f) {
            return true;
        }
        C1235c0 c0Var = this.f3807t;
        if (c0Var != null) {
            return c0Var.Q2();
        }
        return false;
    }

    public void R1() {
        C2673c cVar = this.f3802Y;
        if (cVar != null) {
            e1(J1(), this.f3795D, cVar);
        } else {
            f1(J1(), this.f3795D, this.f3810w);
        }
    }

    public final void S2() {
        A1().U().S();
    }

    public void T2() {
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    public final void U2() {
        s3(this.f3810w, true);
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void V2(int i10, int i11) {
        C1235c0 c0Var;
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.d(s.a(i10, i11));
        } else if (A1().e() && (c0Var = this.f3807t) != null) {
            c0Var.O2();
        }
        i1(s.a(i10, i11));
        if (this.f3810w != null) {
            u3(false);
        }
        int a10 = C1239e0.a(4);
        boolean i12 = f0.i(a10);
        i.c D22 = D2();
        if (i12 || (D22 = D22.P1()) != null) {
            i.c c22 = J2(i12);
            while (c22 != null && (c22.I1() & a10) != 0) {
                if ((c22.N1() & a10) != 0) {
                    i.c cVar = c22;
                    C1538b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof r) {
                            ((r) cVar).l1();
                        } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                            int i13 = 0;
                            for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                if ((m22.N1() & a10) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        cVar = m22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new C1538b(new i.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(m22);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        cVar = C1245k.g(bVar);
                    }
                }
                if (c22 == D22) {
                    break;
                }
                c22 = c22.J1();
            }
        }
        m0 m02 = A1().m0();
        if (m02 != null) {
            m02.t(A1());
        }
    }

    public long W(C1197s sVar, long j10) {
        return A0(sVar, j10, true);
    }

    public final void W2() {
        C6798l lVar;
        i.c cVar;
        if (H2(C1239e0.a(128))) {
            C2057k.a aVar = C2057k.f21728e;
            C2057k d10 = aVar.d();
            if (d10 != null) {
                lVar = d10.h();
            } else {
                lVar = null;
            }
            C2057k f10 = aVar.f(d10);
            try {
                int a10 = C1239e0.a(128);
                boolean i10 = f0.i(a10);
                if (i10) {
                    cVar = D2();
                } else {
                    cVar = D2().P1();
                    if (cVar == null) {
                        C6514M m10 = C6514M.f71813a;
                        aVar.m(d10, f10, lVar);
                    }
                }
                i.c c22 = J2(i10);
                while (c22 != null && (c22.I1() & a10) != 0) {
                    if ((c22.N1() & a10) != 0) {
                        C1538b bVar = null;
                        i.c cVar2 = c22;
                        while (cVar2 != null) {
                            if (cVar2 instanceof A) {
                                ((A) cVar2).O(T0());
                            } else if ((cVar2.N1() & a10) != 0 && (cVar2 instanceof C1247m)) {
                                int i11 = 0;
                                for (i.c m22 = ((C1247m) cVar2).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            cVar2 = m22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar2 != null) {
                                                bVar.b(cVar2);
                                                cVar2 = null;
                                            }
                                            bVar.b(m22);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            cVar2 = C1245k.g(bVar);
                        }
                    }
                    if (c22 == cVar) {
                        break;
                    }
                    c22 = c22.J1();
                }
                C6514M m102 = C6514M.f71813a;
                aVar.m(d10, f10, lVar);
            } catch (Throwable th2) {
                aVar.m(d10, f10, lVar);
                throw th2;
            }
        }
    }

    public final void X2() {
        int a10 = C1239e0.a(128);
        boolean i10 = f0.i(a10);
        i.c D22 = D2();
        if (i10 || (D22 = D22.P1()) != null) {
            i.c c22 = J2(i10);
            while (c22 != null && (c22.I1() & a10) != 0) {
                if ((c22.N1() & a10) != 0) {
                    i.c cVar = c22;
                    C1538b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof A) {
                            ((A) cVar).H0(this);
                        } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                            int i11 = 0;
                            for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                if ((m22.N1() & a10) != 0) {
                                    i11++;
                                    if (i11 == 1) {
                                        cVar = m22;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new C1538b(new i.c[16], 0);
                                        }
                                        if (cVar != null) {
                                            bVar.b(cVar);
                                            cVar = null;
                                        }
                                        bVar.b(m22);
                                    }
                                }
                            }
                            if (i11 == 1) {
                            }
                        }
                        cVar = C1245k.g(bVar);
                    }
                }
                if (c22 != D22) {
                    c22 = c22.J1();
                } else {
                    return;
                }
            }
        }
    }

    public boolean Y0() {
        if (this.f3801X == null || this.f3808u || !A1().J0()) {
            return false;
        }
        return true;
    }

    public final void Y2() {
        this.f3808u = true;
        this.f3799H.invoke();
        e3();
    }

    public abstract void Z2(C2520p0 p0Var, C2673c cVar);

    public Object a() {
        if (!A1().j0().q(C1239e0.a(64))) {
            return null;
        }
        D2();
        N n10 = new N();
        for (i.c o10 = A1().j0().o(); o10 != null; o10 = o10.P1()) {
            if ((C1239e0.a(64) & o10.N1()) != 0) {
                int a10 = C1239e0.a(64);
                C1538b bVar = null;
                i.c cVar = o10;
                while (cVar != null) {
                    if (cVar instanceof p0) {
                        n10.f71759a = ((p0) cVar).s(A1().K(), n10.f71759a);
                    } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                        int i10 = 0;
                        for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                            if ((m22.N1() & a10) != 0) {
                                i10++;
                                if (i10 == 1) {
                                    cVar = m22;
                                } else {
                                    if (bVar == null) {
                                        bVar = new C1538b(new i.c[16], 0);
                                    }
                                    if (cVar != null) {
                                        bVar.b(cVar);
                                        cVar = null;
                                    }
                                    bVar.b(m22);
                                }
                            }
                        }
                        if (i10 == 1) {
                        }
                    }
                    cVar = C1245k.g(bVar);
                }
            }
        }
        return n10.f71759a;
    }

    public final long b() {
        return T0();
    }

    public C2423i b0(C1197s sVar, boolean z10) {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sVar.G()) {
            G0.a.b("LayoutCoordinates " + sVar + " is not attached!");
        }
        C1235c0 m32 = m3(sVar);
        m32.S2();
        C1235c0 q22 = q2(m32);
        C2419e B22 = B2();
        B22.i(0.0f);
        B22.k(0.0f);
        B22.j((float) r.g(sVar.b()));
        B22.h((float) r.f(sVar.b()));
        while (m32 != q22) {
            d3(m32, B22, z10, false, 4, (Object) null);
            if (B22.f()) {
                return C2423i.f25325e.a();
            }
            m32 = m32.f3807t;
            C6496s.e(m32);
        }
        i2(q22, B22, z10);
        return C2420f.a(B22);
    }

    public final void b3(long j10, float f10, C6798l lVar, C2673c cVar) {
        a3(n.n(j10, Q0()), f10, lVar, cVar);
    }

    public final void c3(C2419e eVar, boolean z10, boolean z11) {
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            if (this.f3809v) {
                if (z11) {
                    long A22 = A2();
                    float k10 = C2427m.k(A22) / 2.0f;
                    float i10 = C2427m.i(A22) / 2.0f;
                    eVar.e(-k10, -i10, ((float) r.g(b())) + k10, ((float) r.f(b())) + i10);
                } else if (z10) {
                    eVar.e(0.0f, 0.0f, (float) r.g(b()), (float) r.f(b()));
                }
                if (eVar.f()) {
                    return;
                }
            }
            l0Var.b(eVar, false);
        }
        float j10 = (float) n.j(J1());
        eVar.i(eVar.b() + j10);
        eVar.j(eVar.c() + j10);
        float k11 = (float) n.k(J1());
        eVar.k(eVar.d() + k11);
        eVar.h(eVar.a() + k11);
    }

    /* access modifiers changed from: protected */
    public void e1(long j10, float f10, C2673c cVar) {
        if (this.f3804q) {
            Q z22 = z2();
            C6496s.e(z22);
            a3(z22.J1(), f10, (C6798l) null, cVar);
            return;
        }
        a3(j10, f10, (C6798l) null, cVar);
    }

    public final void e3() {
        if (this.f3801X != null) {
            if (this.f3802Y != null) {
                this.f3802Y = null;
            }
            t3(this, (C6798l) null, false, 2, (Object) null);
            G.u1(A1(), false, 1, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void f1(long j10, float f10, C6798l lVar) {
        if (this.f3804q) {
            Q z22 = z2();
            C6496s.e(z22);
            a3(z22.J1(), f10, lVar, (C2673c) null);
            return;
        }
        a3(j10, f10, lVar, (C2673c) null);
    }

    public final void f3(boolean z10) {
        this.f3804q = z10;
    }

    public void g3(G g10) {
        G g11 = this.f3792A;
        if (g10 != g11) {
            this.f3792A = g10;
            if (!(g11 != null && g10.e() == g11.e() && g10.d() == g11.d())) {
                V2(g10.e(), g10.d());
            }
            Map map = this.f3793B;
            if (((map != null && !map.isEmpty()) || !g10.p().isEmpty()) && !C6496s.c(g10.p(), this.f3793B)) {
                u2().p().m();
                Map map2 = this.f3793B;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.f3793B = map2;
                }
                map2.clear();
                map2.putAll(g10.p());
            }
        }
    }

    public float getDensity() {
        return A1().K().getDensity();
    }

    public t getLayoutDirection() {
        return A1().getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    public void h3(long j10) {
        this.f3794C = j10;
    }

    public final void i3(C1235c0 c0Var) {
        this.f3806s = c0Var;
    }

    public final void j3(C1235c0 c0Var) {
        this.f3807t = c0Var;
    }

    /* access modifiers changed from: protected */
    public final long k2(long j10) {
        return C2428n.a(Math.max(0.0f, (C2427m.k(j10) - ((float) U0())) / 2.0f), Math.max(0.0f, (C2427m.i(j10) - ((float) S0())) / 2.0f));
    }

    public final boolean k3() {
        i.c J22 = J2(f0.i(C1239e0.a(16)));
        if (J22 != null && J22.S1()) {
            int a10 = C1239e0.a(16);
            if (!J22.v0().S1()) {
                G0.a.b("visitLocalDescendants called on an unattached node");
            }
            i.c v02 = J22.v0();
            if ((v02.I1() & a10) != 0) {
                while (v02 != null) {
                    if ((v02.N1() & a10) != 0) {
                        i.c cVar = v02;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                if (((s0) cVar).z1()) {
                                    return true;
                                }
                            } else if ((cVar.N1() & a10) != 0 && (cVar instanceof C1247m)) {
                                int i10 = 0;
                                for (i.c m22 = ((C1247m) cVar).m2(); m22 != null; m22 = m22.J1()) {
                                    if ((m22.N1() & a10) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            cVar = m22;
                                        } else {
                                            if (bVar == null) {
                                                bVar = new C1538b(new i.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                bVar.b(cVar);
                                                cVar = null;
                                            }
                                            bVar.b(m22);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            cVar = C1245k.g(bVar);
                        }
                        continue;
                    }
                    v02 = v02.J1();
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float l2(long j10, long j11) {
        if (((float) U0()) >= C2427m.k(j11) && ((float) S0()) >= C2427m.i(j11)) {
            return Float.POSITIVE_INFINITY;
        }
        long k22 = k2(j11);
        float k10 = C2427m.k(k22);
        float i10 = C2427m.i(k22);
        long R22 = R2(j10);
        if ((k10 > 0.0f || i10 > 0.0f) && C2421g.m(R22) <= k10 && C2421g.n(R22) <= i10) {
            return C2421g.l(R22);
        }
        return Float.POSITIVE_INFINITY;
    }

    public long m0(long j10) {
        return K.b(A1()).d(H0(j10));
    }

    public final void m2(C2520p0 p0Var, C2673c cVar) {
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            l0Var.h(p0Var, cVar);
            return;
        }
        float j10 = (float) n.j(J1());
        float k10 = (float) n.k(J1());
        p0Var.d(j10, k10);
        o2(p0Var, cVar);
        p0Var.d(-j10, -k10);
    }

    /* access modifiers changed from: protected */
    public final void n2(C2520p0 p0Var, Q1 q12) {
        p0Var.f(new C2423i(0.5f, 0.5f, ((float) r.g(T0())) - 0.5f, ((float) r.f(T0())) - 0.5f), q12);
    }

    public long n3(long j10, boolean z10) {
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            j10 = l0Var.c(j10, false);
        }
        if (z10 || !N1()) {
            return o.c(j10, J1());
        }
        return j10;
    }

    public long o(long j10) {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return W(C1198t.d(this), K.b(A1()).o(j10));
    }

    public abstract void p2();

    public final C2423i p3() {
        if (!G()) {
            return C2423i.f25325e.a();
        }
        C1197s d10 = C1198t.d(this);
        C2419e B22 = B2();
        long k22 = k2(A2());
        B22.i(-C2427m.k(k22));
        B22.k(-C2427m.i(k22));
        B22.j(((float) U0()) + C2427m.k(k22));
        B22.h(((float) S0()) + C2427m.i(k22));
        C1235c0 c0Var = this;
        while (c0Var != d10) {
            c0Var.c3(B22, false, true);
            if (B22.f()) {
                return C2423i.f25325e.a();
            }
            c0Var = c0Var.f3807t;
            C6496s.e(c0Var);
        }
        return C2420f.a(B22);
    }

    public void q0(float[] fArr) {
        m0 b10 = K.b(A1());
        r3(m3(C1198t.d(this)), fArr);
        b10.p(fArr);
    }

    public final C1235c0 q2(C1235c0 c0Var) {
        G A12 = c0Var.A1();
        G A13 = A1();
        if (A12 == A13) {
            i.c D22 = c0Var.D2();
            i.c D23 = D2();
            int a10 = C1239e0.a(2);
            if (!D23.v0().S1()) {
                G0.a.b("visitLocalAncestors called on an unattached node");
            }
            for (i.c P12 = D23.v0().P1(); P12 != null; P12 = P12.P1()) {
                if ((P12.N1() & a10) != 0 && P12 == D22) {
                    return c0Var;
                }
            }
            return this;
        }
        while (A12.L() > A13.L()) {
            A12 = A12.n0();
            C6496s.e(A12);
        }
        while (A13.L() > A12.L()) {
            A13 = A13.n0();
            C6496s.e(A13);
        }
        while (A12 != A13) {
            A12 = A12.n0();
            A13 = A13.n0();
            if (A12 != null) {
                if (A13 == null) {
                }
            }
            throw new IllegalArgumentException("layouts are not part of the same hierarchy");
        }
        if (A13 == A1()) {
            return this;
        }
        if (A12 == c0Var.A1()) {
            return c0Var;
        }
        return A12.P();
    }

    public float r1() {
        return A1().K().r1();
    }

    public long r2(long j10, boolean z10) {
        if (z10 || !N1()) {
            j10 = o.b(j10, J1());
        }
        l0 l0Var = this.f3801X;
        if (l0Var != null) {
            return l0Var.c(j10, true);
        }
        return j10;
    }

    public final void s3(C6798l lVar, boolean z10) {
        boolean z11;
        boolean z12;
        m0 m02;
        if (lVar == null || this.f3802Y == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            G0.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        G A12 = A1();
        if (z10 || this.f3810w != lVar || !C6496s.c(this.f3811x, A12.K()) || this.f3812y != A12.getLayoutDirection()) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f3811x = A12.K();
        this.f3812y = A12.getLayoutDirection();
        if (!A12.J0() || lVar == null) {
            this.f3810w = null;
            l0 l0Var = this.f3801X;
            if (l0Var != null) {
                l0Var.destroy();
                A12.B1(true);
                this.f3799H.invoke();
                if (G() && (m02 = A12.m0()) != null) {
                    m02.t(A12);
                }
            }
            this.f3801X = null;
            this.f3800I = false;
            return;
        }
        this.f3810w = lVar;
        if (this.f3801X == null) {
            l0 B10 = m0.B(K.b(A12), this.f3798G, this.f3799H, (C2673c) null, 4, (Object) null);
            B10.d(T0());
            B10.j(J1());
            this.f3801X = B10;
            v3(this, false, 1, (Object) null);
            A12.B1(true);
            this.f3799H.invoke();
        } else if (z12) {
            v3(this, false, 1, (Object) null);
        }
    }

    public C1232b u2() {
        return A1().U().r();
    }

    public final boolean v2() {
        return this.f3805r;
    }

    public final boolean w2() {
        return this.f3800I;
    }

    /* access modifiers changed from: protected */
    public final boolean w3(long j10) {
        if (!C2422h.b(j10)) {
            return false;
        }
        l0 l0Var = this.f3801X;
        if (l0Var == null || !this.f3809v || l0Var.f(j10)) {
            return true;
        }
        return false;
    }

    public final C1197s x0() {
        if (!G()) {
            G0.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        S2();
        return A1().l0().f3807t;
    }

    public final long x2() {
        return W0();
    }

    public final l0 y2() {
        return this.f3801X;
    }

    public P z1() {
        return this.f3806s;
    }

    public abstract Q z2();

    public C1197s C1() {
        return this;
    }
}
