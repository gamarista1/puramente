package J0;

import H0.A;
import H0.C1194o;
import H0.C1197s;
import H0.C1201w;
import H0.F;
import H0.H;
import H0.U;
import H0.W;
import J0.L;
import J0.m0;
import O0.m;
import Y.C1496k;
import Y.C1523y;
import a0.C1538b;
import android.view.View;
import androidx.compose.ui.platform.C1644k0;
import androidx.compose.ui.platform.E0;
import androidx.compose.ui.platform.v1;
import c1.k;
import c1.t;
import java.util.Comparator;
import java.util.List;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import lf.C6527k;
import o0.C2340c;
import r0.C2520p0;
import u0.C2673c;
import yf.C6787a;
import yf.C6798l;

public final class G implements C1496k, W, n0, C1201w, C1241g, m0.b {

    /* renamed from: Z  reason: collision with root package name */
    public static final d f3544Z = new d((DefaultConstructorMarker) null);

    /* renamed from: f0  reason: collision with root package name */
    public static final int f3545f0 = 8;

    /* renamed from: g0  reason: collision with root package name */
    private static final f f3546g0 = new c();
    /* access modifiers changed from: private */

    /* renamed from: h0  reason: collision with root package name */
    public static final C6787a f3547h0 = a.f3587a;

    /* renamed from: i0  reason: collision with root package name */
    private static final v1 f3548i0 = new b();
    /* access modifiers changed from: private */

    /* renamed from: j0  reason: collision with root package name */
    public static final Comparator f3549j0 = new F();

    /* renamed from: A  reason: collision with root package name */
    private final C1231a0 f3550A;

    /* renamed from: B  reason: collision with root package name */
    private final L f3551B;

    /* renamed from: C  reason: collision with root package name */
    private A f3552C;

    /* renamed from: D  reason: collision with root package name */
    private C1235c0 f3553D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f3554E;

    /* renamed from: F  reason: collision with root package name */
    private k0.i f3555F;

    /* renamed from: G  reason: collision with root package name */
    private k0.i f3556G;

    /* renamed from: H  reason: collision with root package name */
    private C6798l f3557H;

    /* renamed from: I  reason: collision with root package name */
    private C6798l f3558I;

    /* renamed from: X  reason: collision with root package name */
    private boolean f3559X;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f3560Y;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3561a;

    /* renamed from: b  reason: collision with root package name */
    private int f3562b;

    /* renamed from: c  reason: collision with root package name */
    private int f3563c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3564d;

    /* renamed from: e  reason: collision with root package name */
    private G f3565e;

    /* renamed from: f  reason: collision with root package name */
    private int f3566f;

    /* renamed from: g  reason: collision with root package name */
    private final X f3567g;

    /* renamed from: h  reason: collision with root package name */
    private C1538b f3568h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f3569i;

    /* renamed from: j  reason: collision with root package name */
    private G f3570j;

    /* renamed from: k  reason: collision with root package name */
    private m0 f3571k;

    /* renamed from: l  reason: collision with root package name */
    private androidx.compose.ui.viewinterop.c f3572l;

    /* renamed from: m  reason: collision with root package name */
    private int f3573m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public boolean f3574n;

    /* renamed from: o  reason: collision with root package name */
    private O0.j f3575o;

    /* renamed from: p  reason: collision with root package name */
    private final C1538b f3576p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f3577q;

    /* renamed from: r  reason: collision with root package name */
    private F f3578r;

    /* renamed from: s  reason: collision with root package name */
    private C1258y f3579s;

    /* renamed from: t  reason: collision with root package name */
    private c1.d f3580t;

    /* renamed from: u  reason: collision with root package name */
    private t f3581u;

    /* renamed from: v  reason: collision with root package name */
    private v1 f3582v;

    /* renamed from: w  reason: collision with root package name */
    private C1523y f3583w;

    /* renamed from: x  reason: collision with root package name */
    private g f3584x;

    /* renamed from: y  reason: collision with root package name */
    private g f3585y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f3586z;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3587a = new a();

        a() {
            super(0);
        }

        /* renamed from: a */
        public final G invoke() {
            return new G(false, 0, 3, (DefaultConstructorMarker) null);
        }
    }

    public static final class b implements v1 {
        b() {
        }

        public long a() {
            return 300;
        }

        public long b() {
            return 40;
        }

        public long c() {
            return 400;
        }

        public long e() {
            return k.f19222b.b();
        }

        public float g() {
            return 16.0f;
        }
    }

    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        public Void i(H h10, List list, long j10) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        public /* bridge */ /* synthetic */ H0.G j(H h10, List list, long j10) {
            return (H0.G) i(h10, list, j10);
        }
    }

    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C6787a a() {
            return G.f3547h0;
        }

        public final Comparator b() {
            return G.f3549j0;
        }

        private d() {
        }
    }

    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    public static abstract class f implements F {

        /* renamed from: a  reason: collision with root package name */
        private final String f3594a;

        public f(String str) {
            this.f3594a = str;
        }

        public /* bridge */ /* synthetic */ int a(C1194o oVar, List list, int i10) {
            return ((Number) e(oVar, list, i10)).intValue();
        }

        public /* bridge */ /* synthetic */ int b(C1194o oVar, List list, int i10) {
            return ((Number) d(oVar, list, i10)).intValue();
        }

        public Void c(C1194o oVar, List list, int i10) {
            throw new IllegalStateException(this.f3594a.toString());
        }

        public Void d(C1194o oVar, List list, int i10) {
            throw new IllegalStateException(this.f3594a.toString());
        }

        public Void e(C1194o oVar, List list, int i10) {
            throw new IllegalStateException(this.f3594a.toString());
        }

        public Void f(C1194o oVar, List list, int i10) {
            throw new IllegalStateException(this.f3594a.toString());
        }

        public /* bridge */ /* synthetic */ int g(C1194o oVar, List list, int i10) {
            return ((Number) c(oVar, list, i10)).intValue();
        }

        public /* bridge */ /* synthetic */ int h(C1194o oVar, List list, int i10) {
            return ((Number) f(oVar, list, i10)).intValue();
        }
    }

    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3599a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f3599a = iArr;
        }
    }

    static final class i extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3600a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(G g10) {
            super(0);
            this.f3600a = g10;
        }

        public final void invoke() {
            this.f3600a.U().N();
        }
    }

    static final class j extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f3601a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f3602b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(G g10, N n10) {
            super(0);
            this.f3601a = g10;
            this.f3602b = n10;
        }

        public final void invoke() {
            C1231a0 j02 = this.f3601a.j0();
            int a10 = C1239e0.a(8);
            N n10 = this.f3602b;
            if ((j02.i() & a10) != 0) {
                for (i.c o10 = j02.o(); o10 != null; o10 = o10.P1()) {
                    if ((o10.N1() & a10) != 0) {
                        i.c cVar = o10;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof w0) {
                                w0 w0Var = (w0) cVar;
                                if (w0Var.e0()) {
                                    O0.j jVar = new O0.j();
                                    n10.f71759a = jVar;
                                    jVar.C(true);
                                }
                                if (w0Var.F1()) {
                                    ((O0.j) n10.f71759a).D(true);
                                }
                                w0Var.W((O0.j) n10.f71759a);
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
            }
        }
    }

    public G(boolean z10, int i10) {
        this.f3561a = z10;
        this.f3562b = i10;
        this.f3567g = new X(new C1538b(new G[16], 0), new i(this));
        this.f3576p = new C1538b(new G[16], 0);
        this.f3577q = true;
        this.f3578r = f3546g0;
        this.f3580t = K.f3605a;
        this.f3581u = t.Ltr;
        this.f3582v = f3548i0;
        this.f3583w = C1523y.f10201Q.a();
        g gVar = g.NotUsed;
        this.f3584x = gVar;
        this.f3585y = gVar;
        this.f3550A = new C1231a0(this);
        this.f3551B = new L(this);
        this.f3554E = true;
        this.f3555F = k0.i.f23074a;
    }

    private final void B0() {
        boolean z10;
        boolean z11;
        if (this.f3550A.p(C1239e0.a(1024) | C1239e0.a(2048) | C1239e0.a(4096))) {
            for (i.c k10 = this.f3550A.k(); k10 != null; k10 = k10.J1()) {
                boolean z12 = false;
                if ((C1239e0.a(1024) & k10.N1()) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((C1239e0.a(2048) & k10.N1()) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z10 | z11;
                if ((C1239e0.a(4096) & k10.N1()) != 0) {
                    z12 = true;
                }
                if (z13 || z12) {
                    f0.a(k10);
                }
            }
        }
    }

    private final void E1(G g10) {
        if (!C6496s.c(g10, this.f3565e)) {
            this.f3565e = g10;
            if (g10 != null) {
                this.f3551B.q();
                C1235c0 l02 = l0();
                C1235c0 E22 = P().E2();
                while (!C6496s.c(l02, E22) && l02 != null) {
                    l02.p2();
                    l02 = l02.E2();
                }
            }
            E0();
        }
    }

    private final void I0() {
        G g10;
        if (this.f3566f > 0) {
            this.f3569i = true;
        }
        if (this.f3561a && (g10 = this.f3570j) != null) {
            g10.I0();
        }
    }

    public static /* synthetic */ boolean P0(G g10, c1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f3551B.z();
        }
        return g10.O0(bVar);
    }

    private final C1235c0 Q() {
        l0 l0Var;
        if (this.f3554E) {
            C1235c0 P10 = P();
            C1235c0 F22 = l0().F2();
            this.f3553D = null;
            while (true) {
                if (C6496s.c(P10, F22)) {
                    break;
                }
                if (P10 != null) {
                    l0Var = P10.y2();
                } else {
                    l0Var = null;
                }
                if (l0Var != null) {
                    this.f3553D = P10;
                    break;
                } else if (P10 != null) {
                    P10 = P10.F2();
                } else {
                    P10 = null;
                }
            }
        }
        C1235c0 c0Var = this.f3553D;
        if (c0Var == null || c0Var.y2() != null) {
            return c0Var;
        }
        G0.a.c("layer was not set");
        throw new C6527k();
    }

    private final void f1(G g10) {
        if (g10.f3551B.s() > 0) {
            L l10 = this.f3551B;
            l10.W(l10.s() - 1);
        }
        if (this.f3571k != null) {
            g10.z();
        }
        g10.f3570j = null;
        g10.l0().j3((C1235c0) null);
        if (g10.f3561a) {
            this.f3566f--;
            C1538b f10 = g10.f3567g.f();
            int q10 = f10.q();
            if (q10 > 0) {
                Object[] p10 = f10.p();
                int i10 = 0;
                do {
                    ((G) p10[i10]).l0().j3((C1235c0) null);
                    i10++;
                } while (i10 < q10);
            }
        }
        I0();
        h1();
    }

    private final void g1() {
        E0();
        G n02 = n0();
        if (n02 != null) {
            n02.C0();
        }
        D0();
    }

    private final void j1() {
        if (this.f3569i) {
            int i10 = 0;
            this.f3569i = false;
            C1538b bVar = this.f3568h;
            if (bVar == null) {
                bVar = new C1538b(new G[16], 0);
                this.f3568h = bVar;
            }
            bVar.i();
            C1538b f10 = this.f3567g.f();
            int q10 = f10.q();
            if (q10 > 0) {
                Object[] p10 = f10.p();
                do {
                    G g10 = (G) p10[i10];
                    if (g10.f3561a) {
                        bVar.d(bVar.q(), g10.v0());
                    } else {
                        bVar.b(g10);
                    }
                    i10++;
                } while (i10 < q10);
            }
            this.f3551B.N();
        }
    }

    private final C1258y k0() {
        C1258y yVar = this.f3579s;
        if (yVar != null) {
            return yVar;
        }
        C1258y yVar2 = new C1258y(this, e0());
        this.f3579s = yVar2;
        return yVar2;
    }

    public static /* synthetic */ boolean l1(G g10, c1.b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = g10.f3551B.y();
        }
        return g10.k1(bVar);
    }

    /* access modifiers changed from: private */
    public static final int p(G g10, G g11) {
        if (g10.t0() == g11.t0()) {
            return C6496s.i(g10.o0(), g11.o0());
        }
        return Float.compare(g10.t0(), g11.t0());
    }

    public static /* synthetic */ void q1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.p1(z10);
    }

    public static /* synthetic */ void s1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.r1(z10, z11, z12);
    }

    private final void t(k0.i iVar) {
        this.f3555F = iVar;
        this.f3550A.E(iVar);
        this.f3551B.c0();
        if (this.f3565e == null && this.f3550A.q(C1239e0.a(512))) {
            E1(this);
        }
    }

    private final float t0() {
        return c0().L1();
    }

    public static /* synthetic */ void u1(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        g10.t1(z10);
    }

    private final void w() {
        this.f3585y = this.f3584x;
        this.f3584x = g.NotUsed;
        C1538b v02 = v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g10 = (G) p10[i10];
                if (g10.f3584x == g.InLayoutBlock) {
                    g10.w();
                }
                i10++;
            } while (i10 < q10);
        }
    }

    public static /* synthetic */ void w1(G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            z12 = true;
        }
        g10.v1(z10, z11, z12);
    }

    private final String x(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
        sb2.append("|-");
        sb2.append(toString());
        sb2.append(10);
        C1538b v02 = v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i12 = 0;
            do {
                sb2.append(((G) p10[i12]).x(i10 + 1));
                i12++;
            } while (i12 < q10);
        }
        String sb3 = sb2.toString();
        if (i10 != 0) {
            return sb3;
        }
        String substring = sb3.substring(0, sb3.length() - 1);
        C6496s.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ void x0(G g10, long j10, C1254u uVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        g10.w0(j10, uVar, z12, z11);
    }

    static /* synthetic */ String y(G g10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return g10.x(i10);
    }

    private final void y1() {
        this.f3550A.x();
    }

    public static /* synthetic */ void z0(G g10, long j10, C1254u uVar, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12;
        boolean z13;
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        g10.y0(j10, uVar, z12, z13);
    }

    public final void A() {
        if (W() == e.Idle && !V() && !d0() && !K0() && e()) {
            C1231a0 a0Var = this.f3550A;
            int a10 = C1239e0.a(256);
            if ((a0Var.i() & a10) != 0) {
                i.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.N1() & a10) != 0) {
                        i.c cVar = k10;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof C1253t) {
                                C1253t tVar = (C1253t) cVar;
                                tVar.p(C1245k.h(tVar, C1239e0.a(256)));
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
                    if ((k10.I1() & a10) != 0) {
                        k10 = k10.J1();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A0(int i10, G g10) {
        boolean z10;
        boolean z11;
        String str;
        if (g10.f3570j == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot insert ");
            sb2.append(g10);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(y(this, 0, 1, (Object) null));
            sb2.append(" Other tree: ");
            G g11 = g10.f3570j;
            if (g11 != null) {
                str = y(g11, 0, 1, (Object) null);
            } else {
                str = null;
            }
            sb2.append(str);
            G0.a.b(sb2.toString());
        }
        if (g10.f3571k == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            G0.a.b("Cannot insert " + g10 + " because it already has an owner. This tree: " + y(this, 0, 1, (Object) null) + " Other tree: " + y(g10, 0, 1, (Object) null));
        }
        g10.f3570j = this;
        this.f3567g.a(i10, g10);
        h1();
        if (g10.f3561a) {
            this.f3566f++;
        }
        I0();
        m0 m0Var = this.f3571k;
        if (m0Var != null) {
            g10.u(m0Var);
        }
        if (g10.f3551B.s() > 0) {
            L l10 = this.f3551B;
            l10.W(l10.s() + 1);
        }
    }

    public final void A1(boolean z10) {
        this.f3586z = z10;
    }

    public final void B(C2520p0 p0Var, C2673c cVar) {
        l0().m2(p0Var, cVar);
    }

    public final void B1(boolean z10) {
        this.f3554E = z10;
    }

    public final boolean C() {
        C1230a p10;
        L l10 = this.f3551B;
        if (l10.r().p().k()) {
            return true;
        }
        C1232b C10 = l10.C();
        if (C10 == null || (p10 = C10.p()) == null || !p10.k()) {
            return false;
        }
        return true;
    }

    public final void C0() {
        C1235c0 Q10 = Q();
        if (Q10 != null) {
            Q10.O2();
            return;
        }
        G n02 = n0();
        if (n02 != null) {
            n02.C0();
        }
    }

    public final void C1(androidx.compose.ui.viewinterop.c cVar) {
        this.f3572l = cVar;
    }

    public final boolean D() {
        if (this.f3556G != null) {
            return true;
        }
        return false;
    }

    public final void D0() {
        C1235c0 l02 = l0();
        C1235c0 P10 = P();
        while (l02 != P10) {
            C6496s.f(l02, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C c10 = (C) l02;
            l0 y22 = c10.y2();
            if (y22 != null) {
                y22.invalidate();
            }
            l02 = c10.E2();
        }
        l0 y23 = P().y2();
        if (y23 != null) {
            y23.invalidate();
        }
    }

    public final void D1(g gVar) {
        this.f3584x = gVar;
    }

    public final boolean E() {
        return this.f3586z;
    }

    public final void E0() {
        if (this.f3565e != null) {
            s1(this, false, false, false, 7, (Object) null);
        } else {
            w1(this, false, false, false, 7, (Object) null);
        }
    }

    public final List F() {
        L.a Z10 = Z();
        C6496s.e(Z10);
        return Z10.v1();
    }

    public final void F0() {
        if (!V() && !d0() && !this.f3559X) {
            K.b(this).s(this);
        }
    }

    public final void F1(boolean z10) {
        this.f3559X = z10;
    }

    public final List G() {
        return c0().E1();
    }

    public final void G0() {
        this.f3551B.M();
    }

    public final void G1(C6798l lVar) {
        this.f3557H = lVar;
    }

    public final List H() {
        return v0().h();
    }

    public final void H0() {
        this.f3575o = null;
        K.b(this).z();
    }

    public final void H1(C6798l lVar) {
        this.f3558I = lVar;
    }

    public final O0.j I() {
        if (!J0() || K0()) {
            return null;
        }
        if (!this.f3550A.q(C1239e0.a(8)) || this.f3575o != null) {
            return this.f3575o;
        }
        N n10 = new N();
        n10.f71759a = new O0.j();
        K.b(this).getSnapshotObserver().j(this, new j(this, n10));
        Object obj = n10.f71759a;
        this.f3575o = (O0.j) obj;
        return (O0.j) obj;
    }

    public void I1(int i10) {
        this.f3562b = i10;
    }

    public C1523y J() {
        return this.f3583w;
    }

    public boolean J0() {
        if (this.f3571k != null) {
            return true;
        }
        return false;
    }

    public final void J1(A a10) {
        this.f3552C = a10;
    }

    public c1.d K() {
        return this.f3580t;
    }

    public boolean K0() {
        return this.f3560Y;
    }

    public final void K1() {
        if (this.f3566f > 0) {
            j1();
        }
    }

    public final int L() {
        return this.f3573m;
    }

    public final boolean L0() {
        return c0().O1();
    }

    public final List M() {
        return this.f3567g.b();
    }

    public final Boolean M0() {
        L.a Z10 = Z();
        if (Z10 != null) {
            return Boolean.valueOf(Z10.e());
        }
        return null;
    }

    public final boolean N() {
        long x22 = P().x2();
        if (!c1.b.j(x22) || !c1.b.i(x22)) {
            return false;
        }
        return true;
    }

    public final boolean N0() {
        return this.f3564d;
    }

    public int O() {
        return this.f3551B.x();
    }

    public final boolean O0(c1.b bVar) {
        if (bVar == null || this.f3565e == null) {
            return false;
        }
        L.a Z10 = Z();
        C6496s.e(Z10);
        return Z10.S1(bVar.r());
    }

    public final C1235c0 P() {
        return this.f3550A.l();
    }

    public final void Q0() {
        if (this.f3584x == g.NotUsed) {
            w();
        }
        L.a Z10 = Z();
        C6496s.e(Z10);
        Z10.T1();
    }

    public View R() {
        androidx.compose.ui.viewinterop.c cVar = this.f3572l;
        if (cVar != null) {
            return cVar.getInteropView();
        }
        return null;
    }

    public final void R0() {
        this.f3551B.O();
    }

    public final androidx.compose.ui.viewinterop.c S() {
        return this.f3572l;
    }

    public final void S0() {
        this.f3551B.P();
    }

    public final g T() {
        return this.f3584x;
    }

    public final void T0() {
        this.f3551B.Q();
    }

    public final L U() {
        return this.f3551B;
    }

    public final void U0() {
        this.f3551B.R();
    }

    public final boolean V() {
        return this.f3551B.A();
    }

    public final int V0(int i10) {
        return k0().b(i10);
    }

    public final e W() {
        return this.f3551B.B();
    }

    public final int W0(int i10) {
        return k0().c(i10);
    }

    public final boolean X() {
        return this.f3551B.F();
    }

    public final int X0(int i10) {
        return k0().d(i10);
    }

    public final boolean Y() {
        return this.f3551B.G();
    }

    public boolean Y0() {
        return J0();
    }

    public final L.a Z() {
        return this.f3551B.H();
    }

    public final int Z0(int i10) {
        return k0().e(i10);
    }

    public void a(t tVar) {
        if (this.f3581u != tVar) {
            this.f3581u = tVar;
            g1();
            C1231a0 a0Var = this.f3550A;
            int a10 = C1239e0.a(4);
            if ((a0Var.i() & a10) != 0) {
                i.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.N1() & a10) != 0) {
                        i.c cVar = k10;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof r) {
                                r rVar = (r) cVar;
                                if (rVar instanceof C2340c) {
                                    ((C2340c) rVar).W0();
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
                    }
                    if ((k10.I1() & a10) != 0) {
                        k10 = k10.J1();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final G a0() {
        return this.f3565e;
    }

    public final int a1(int i10) {
        return k0().f(i10);
    }

    public void b(c1.d dVar) {
        if (!C6496s.c(this.f3580t, dVar)) {
            this.f3580t = dVar;
            g1();
            for (i.c k10 = this.f3550A.k(); k10 != null; k10 = k10.J1()) {
                if ((C1239e0.a(16) & k10.N1()) != 0) {
                    ((s0) k10).p1();
                } else if (k10 instanceof C2340c) {
                    ((C2340c) k10).W0();
                }
            }
        }
    }

    public final I b0() {
        return K.b(this).getSharedDrawScope();
    }

    public final int b1(int i10) {
        return k0().g(i10);
    }

    public void c() {
        androidx.compose.ui.viewinterop.c cVar = this.f3572l;
        if (cVar != null) {
            cVar.c();
        }
        A a10 = this.f3552C;
        if (a10 != null) {
            a10.c();
        }
        C1235c0 l02 = l0();
        C1235c0 E22 = P().E2();
        while (!C6496s.c(l02, E22) && l02 != null) {
            l02.Y2();
            l02 = l02.E2();
        }
    }

    public final L.b c0() {
        return this.f3551B.I();
    }

    public final int c1(int i10) {
        return k0().h(i10);
    }

    public void d(int i10) {
        this.f3563c = i10;
    }

    public final boolean d0() {
        return this.f3551B.J();
    }

    public final int d1(int i10) {
        return k0().i(i10);
    }

    public boolean e() {
        return c0().e();
    }

    public F e0() {
        return this.f3578r;
    }

    public final void e1(int i10, int i11, int i12) {
        int i13;
        int i14;
        if (i10 != i11) {
            for (int i15 = 0; i15 < i12; i15++) {
                if (i10 > i11) {
                    i13 = i10 + i15;
                } else {
                    i13 = i10;
                }
                if (i10 > i11) {
                    i14 = i11 + i15;
                } else {
                    i14 = (i11 + i12) - 2;
                }
                this.f3567g.a(i14, (G) this.f3567g.g(i13));
            }
            h1();
            I0();
            E0();
        }
    }

    public void f() {
        androidx.compose.ui.viewinterop.c cVar = this.f3572l;
        if (cVar != null) {
            cVar.f();
        }
        A a10 = this.f3552C;
        if (a10 != null) {
            a10.f();
        }
        this.f3560Y = true;
        y1();
        if (J0()) {
            H0();
        }
    }

    public final g f0() {
        return c0().J1();
    }

    public void g(F f10) {
        if (!C6496s.c(this.f3578r, f10)) {
            this.f3578r = f10;
            C1258y yVar = this.f3579s;
            if (yVar != null) {
                yVar.k(e0());
            }
            E0();
        }
    }

    public final g g0() {
        g E12;
        L.a Z10 = Z();
        if (Z10 == null || (E12 = Z10.E1()) == null) {
            return g.NotUsed;
        }
        return E12;
    }

    public t getLayoutDirection() {
        return this.f3581u;
    }

    public void h() {
        if (this.f3565e != null) {
            s1(this, false, false, false, 5, (Object) null);
        } else {
            w1(this, false, false, false, 5, (Object) null);
        }
        c1.b y10 = this.f3551B.y();
        if (y10 != null) {
            m0 m0Var = this.f3571k;
            if (m0Var != null) {
                m0Var.m(this, y10.r());
                return;
            }
            return;
        }
        m0 m0Var2 = this.f3571k;
        if (m0Var2 != null) {
            m0.j(m0Var2, false, 1, (Object) null);
        }
    }

    public k0.i h0() {
        return this.f3555F;
    }

    public final void h1() {
        if (this.f3561a) {
            G n02 = n0();
            if (n02 != null) {
                n02.h1();
                return;
            }
            return;
        }
        this.f3577q = true;
    }

    public void i(v1 v1Var) {
        if (!C6496s.c(this.f3582v, v1Var)) {
            this.f3582v = v1Var;
            C1231a0 a0Var = this.f3550A;
            int a10 = C1239e0.a(16);
            if ((a0Var.i() & a10) != 0) {
                i.c k10 = a0Var.k();
                while (k10 != null) {
                    if ((k10.N1() & a10) != 0) {
                        i.c cVar = k10;
                        C1538b bVar = null;
                        while (cVar != null) {
                            if (cVar instanceof s0) {
                                ((s0) cVar).C1();
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
                    if ((k10.I1() & a10) != 0) {
                        k10 = k10.J1();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final boolean i0() {
        return this.f3559X;
    }

    public final void i1(int i10, int i11) {
        U.a placementScope;
        C1235c0 P10;
        if (this.f3584x == g.NotUsed) {
            w();
        }
        G n02 = n0();
        if (n02 == null || (P10 = n02.P()) == null || (placementScope = P10.I1()) == null) {
            placementScope = K.b(this).getPlacementScope();
        }
        U.a.l(placementScope, c0(), i10, i11, 0.0f, 4, (Object) null);
    }

    public void j(C1523y yVar) {
        this.f3583w = yVar;
        b((c1.d) yVar.a(C1644k0.e()));
        a((t) yVar.a(C1644k0.k()));
        i((v1) yVar.a(C1644k0.r()));
        C1231a0 a0Var = this.f3550A;
        int a10 = C1239e0.a(32768);
        if ((a0Var.i() & a10) != 0) {
            i.c k10 = a0Var.k();
            while (k10 != null) {
                if ((k10.N1() & a10) != 0) {
                    i.c cVar = k10;
                    C1538b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof C1242h) {
                            i.c v02 = ((C1242h) cVar).v0();
                            if (v02.S1()) {
                                f0.e(v02);
                            } else {
                                v02.i2(true);
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
                }
                if ((k10.I1() & a10) != 0) {
                    k10 = k10.J1();
                } else {
                    return;
                }
            }
        }
    }

    public final C1231a0 j0() {
        return this.f3550A;
    }

    public void k() {
        C1235c0 P10 = P();
        int a10 = C1239e0.a(128);
        boolean i10 = f0.i(a10);
        i.c D22 = P10.D2();
        if (i10 || (D22 = D22.P1()) != null) {
            i.c c22 = P10.J2(i10);
            while (c22 != null && (c22.I1() & a10) != 0) {
                if ((c22.N1() & a10) != 0) {
                    i.c cVar = c22;
                    C1538b bVar = null;
                    while (cVar != null) {
                        if (cVar instanceof A) {
                            ((A) cVar).H0(P());
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

    public final boolean k1(c1.b bVar) {
        if (bVar == null) {
            return false;
        }
        if (this.f3584x == g.NotUsed) {
            v();
        }
        return c0().Z1(bVar.r());
    }

    public void l() {
        if (!J0()) {
            G0.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.c cVar = this.f3572l;
        if (cVar != null) {
            cVar.l();
        }
        A a10 = this.f3552C;
        if (a10 != null) {
            a10.l();
        }
        if (K0()) {
            this.f3560Y = false;
            H0();
        } else {
            y1();
        }
        I1(m.b());
        this.f3550A.s();
        this.f3550A.y();
        x1(this);
    }

    public final C1235c0 l0() {
        return this.f3550A.n();
    }

    public C1197s m() {
        return P();
    }

    public final m0 m0() {
        return this.f3571k;
    }

    public final void m1() {
        int e10 = this.f3567g.e();
        while (true) {
            e10--;
            if (-1 < e10) {
                f1((G) this.f3567g.d(e10));
            } else {
                this.f3567g.c();
                return;
            }
        }
    }

    public void n(k0.i iVar) {
        boolean z10;
        if (!this.f3561a || h0() == k0.i.f23074a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (K0()) {
            G0.a.a("modifier is updated when deactivated");
        }
        if (J0()) {
            t(iVar);
        } else {
            this.f3556G = iVar;
        }
    }

    public final G n0() {
        G g10 = this.f3570j;
        while (g10 != null && g10.f3561a) {
            g10 = g10.f3570j;
        }
        return g10;
    }

    public final void n1(int i10, int i11) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            G0.a.a("count (" + i11 + ") must be greater than 0");
        }
        int i12 = (i11 + i10) - 1;
        if (i10 <= i12) {
            while (true) {
                f1((G) this.f3567g.d(i12));
                G g10 = (G) this.f3567g.g(i12);
                if (i12 != i10) {
                    i12--;
                } else {
                    return;
                }
            }
        }
    }

    public final int o0() {
        return c0().K1();
    }

    public final void o1() {
        if (this.f3584x == g.NotUsed) {
            w();
        }
        c0().a2();
    }

    public int p0() {
        return this.f3562b;
    }

    public final void p1(boolean z10) {
        m0 m0Var;
        if (!this.f3561a && (m0Var = this.f3571k) != null) {
            m0Var.A(this, true, z10);
        }
    }

    public final A q0() {
        return this.f3552C;
    }

    public v1 r0() {
        return this.f3582v;
    }

    public final void r1(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        if (this.f3565e != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            G0.a.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        m0 m0Var = this.f3571k;
        if (m0Var != null && !this.f3574n && !this.f3561a) {
            m0Var.b(this, true, z10, z11);
            if (z12) {
                L.a Z10 = Z();
                C6496s.e(Z10);
                Z10.I1(z10);
            }
        }
    }

    public int s0() {
        return this.f3551B.L();
    }

    public final void t1(boolean z10) {
        m0 m0Var;
        if (!this.f3561a && (m0Var = this.f3571k) != null) {
            m0.i(m0Var, this, false, z10, 2, (Object) null);
        }
    }

    public String toString() {
        return E0.a(this, (String) null) + " children: " + H().size() + " measurePolicy: " + e0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u(J0.m0 r7) {
        /*
            r6 = this;
            J0.m0 r0 = r6.f3571k
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0008
            r0 = r2
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            r3 = 0
            if (r0 != 0) goto L_0x002c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Cannot attach "
            r0.append(r4)
            r0.append(r6)
            java.lang.String r4 = " as it already is attached.  Tree: "
            r0.append(r4)
            java.lang.String r4 = y(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            G0.a.b(r0)
        L_0x002c:
            J0.G r0 = r6.f3570j
            if (r0 == 0) goto L_0x003f
            if (r0 == 0) goto L_0x0035
            J0.m0 r0 = r0.f3571k
            goto L_0x0036
        L_0x0035:
            r0 = r3
        L_0x0036:
            boolean r0 = kotlin.jvm.internal.C6496s.c(r0, r7)
            if (r0 == 0) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r0 = r1
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0086
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ") than the parent's owner("
            r0.append(r4)
            J0.G r4 = r6.n0()
            if (r4 == 0) goto L_0x005d
            J0.m0 r4 = r4.f3571k
            goto L_0x005e
        L_0x005d:
            r4 = r3
        L_0x005e:
            r0.append(r4)
            java.lang.String r4 = "). This tree: "
            r0.append(r4)
            java.lang.String r4 = y(r6, r1, r2, r3)
            r0.append(r4)
            java.lang.String r4 = " Parent tree: "
            r0.append(r4)
            J0.G r4 = r6.f3570j
            if (r4 == 0) goto L_0x007b
            java.lang.String r4 = y(r4, r1, r2, r3)
            goto L_0x007c
        L_0x007b:
            r4 = r3
        L_0x007c:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            G0.a.b(r0)
        L_0x0086:
            J0.G r0 = r6.n0()
            if (r0 != 0) goto L_0x009c
            J0.L$b r4 = r6.c0()
            r4.d2(r2)
            J0.L$a r4 = r6.Z()
            if (r4 == 0) goto L_0x009c
            r4.X1(r2)
        L_0x009c:
            J0.c0 r4 = r6.l0()
            if (r0 == 0) goto L_0x00a7
            J0.c0 r5 = r0.P()
            goto L_0x00a8
        L_0x00a7:
            r5 = r3
        L_0x00a8:
            r4.j3(r5)
            r6.f3571k = r7
            if (r0 == 0) goto L_0x00b2
            int r4 = r0.f3573m
            goto L_0x00b3
        L_0x00b2:
            r4 = -1
        L_0x00b3:
            int r4 = r4 + r2
            r6.f3573m = r4
            k0.i r4 = r6.f3556G
            if (r4 == 0) goto L_0x00bd
            r6.t(r4)
        L_0x00bd:
            r6.f3556G = r3
            J0.a0 r3 = r6.f3550A
            r4 = 8
            int r4 = J0.C1239e0.a(r4)
            boolean r3 = r3.q(r4)
            if (r3 == 0) goto L_0x00d0
            r6.H0()
        L_0x00d0:
            r7.c(r6)
            boolean r3 = r6.f3564d
            if (r3 == 0) goto L_0x00db
            r6.E1(r6)
            goto L_0x00fd
        L_0x00db:
            J0.G r3 = r6.f3570j
            if (r3 == 0) goto L_0x00e3
            J0.G r3 = r3.f3565e
            if (r3 != 0) goto L_0x00e5
        L_0x00e3:
            J0.G r3 = r6.f3565e
        L_0x00e5:
            r6.E1(r3)
            J0.G r3 = r6.f3565e
            if (r3 != 0) goto L_0x00fd
            J0.a0 r3 = r6.f3550A
            r4 = 512(0x200, float:7.175E-43)
            int r4 = J0.C1239e0.a(r4)
            boolean r3 = r3.q(r4)
            if (r3 == 0) goto L_0x00fd
            r6.E1(r6)
        L_0x00fd:
            boolean r3 = r6.K0()
            if (r3 != 0) goto L_0x0108
            J0.a0 r3 = r6.f3550A
            r3.s()
        L_0x0108:
            J0.X r3 = r6.f3567g
            a0.b r3 = r3.f()
            int r4 = r3.q()
            if (r4 <= 0) goto L_0x0122
            java.lang.Object[] r3 = r3.p()
        L_0x0118:
            r5 = r3[r1]
            J0.G r5 = (J0.G) r5
            r5.u(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x0118
        L_0x0122:
            boolean r1 = r6.K0()
            if (r1 != 0) goto L_0x012d
            J0.a0 r1 = r6.f3550A
            r1.y()
        L_0x012d:
            r6.E0()
            if (r0 == 0) goto L_0x0135
            r0.E0()
        L_0x0135:
            J0.c0 r0 = r6.l0()
            J0.c0 r1 = r6.P()
            J0.c0 r1 = r1.E2()
        L_0x0141:
            boolean r2 = kotlin.jvm.internal.C6496s.c(r0, r1)
            if (r2 != 0) goto L_0x0151
            if (r0 == 0) goto L_0x0151
            r0.U2()
            J0.c0 r0 = r0.E2()
            goto L_0x0141
        L_0x0151:
            yf.l r0 = r6.f3557H
            if (r0 == 0) goto L_0x0158
            r0.invoke(r7)
        L_0x0158:
            J0.L r7 = r6.f3551B
            r7.c0()
            boolean r7 = r6.K0()
            if (r7 != 0) goto L_0x0166
            r6.B0()
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.G.u(J0.m0):void");
    }

    public final C1538b u0() {
        if (this.f3577q) {
            this.f3576p.i();
            C1538b bVar = this.f3576p;
            bVar.d(bVar.q(), v0());
            this.f3576p.D(f3549j0);
            this.f3577q = false;
        }
        return this.f3576p;
    }

    public final void v() {
        this.f3585y = this.f3584x;
        this.f3584x = g.NotUsed;
        C1538b v02 = v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g10 = (G) p10[i10];
                if (g10.f3584x != g.NotUsed) {
                    g10.v();
                }
                i10++;
            } while (i10 < q10);
        }
    }

    public final C1538b v0() {
        K1();
        if (this.f3566f == 0) {
            return this.f3567g.f();
        }
        C1538b bVar = this.f3568h;
        C6496s.e(bVar);
        return bVar;
    }

    public final void v1(boolean z10, boolean z11, boolean z12) {
        m0 m0Var;
        if (!this.f3574n && !this.f3561a && (m0Var = this.f3571k) != null) {
            m0.l(m0Var, this, false, z10, z11, 2, (Object) null);
            if (z12) {
                c0().M1(z10);
            }
        }
    }

    public final void w0(long j10, C1254u uVar, boolean z10, boolean z11) {
        l0().M2(C1235c0.f3784Z.a(), C1235c0.s2(l0(), j10, false, 2, (Object) null), uVar, z10, z11);
    }

    public final void x1(G g10) {
        if (h.f3599a[g10.W().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + g10.W());
        } else if (g10.Y()) {
            s1(g10, true, false, false, 6, (Object) null);
        } else {
            if (g10.X()) {
                g10.p1(true);
            }
            if (g10.d0()) {
                w1(g10, true, false, false, 6, (Object) null);
            } else if (g10.V()) {
                g10.t1(true);
            }
        }
    }

    public final void y0(long j10, C1254u uVar, boolean z10, boolean z11) {
        l0().M2(C1235c0.f3784Z.b(), C1235c0.s2(l0(), j10, false, 2, (Object) null), uVar, true, z11);
    }

    public final void z() {
        m0 m0Var = this.f3571k;
        String str = null;
        if (m0Var == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot detach node that is already detached!  Tree: ");
            G n02 = n0();
            if (n02 != null) {
                str = y(n02, 0, 1, (Object) null);
            }
            sb2.append(str);
            G0.a.c(sb2.toString());
            throw new C6527k();
        }
        G n03 = n0();
        if (n03 != null) {
            n03.C0();
            n03.E0();
            L.b c02 = c0();
            g gVar = g.NotUsed;
            c02.c2(gVar);
            L.a Z10 = Z();
            if (Z10 != null) {
                Z10.V1(gVar);
            }
        }
        this.f3551B.V();
        C6798l lVar = this.f3558I;
        if (lVar != null) {
            lVar.invoke(m0Var);
        }
        if (this.f3550A.q(C1239e0.a(8))) {
            H0();
        }
        this.f3550A.z();
        this.f3574n = true;
        C1538b f10 = this.f3567g.f();
        int q10 = f10.q();
        if (q10 > 0) {
            Object[] p10 = f10.p();
            int i10 = 0;
            do {
                ((G) p10[i10]).z();
                i10++;
            } while (i10 < q10);
        }
        this.f3574n = false;
        this.f3550A.t();
        m0Var.v(this);
        this.f3571k = null;
        E1((G) null);
        this.f3573m = 0;
        c0().V1();
        L.a Z11 = Z();
        if (Z11 != null) {
            Z11.P1();
        }
    }

    public final void z1() {
        C1538b v02 = v0();
        int q10 = v02.q();
        if (q10 > 0) {
            Object[] p10 = v02.p();
            int i10 = 0;
            do {
                G g10 = (G) p10[i10];
                g gVar = g10.f3585y;
                g10.f3584x = gVar;
                if (gVar != g.NotUsed) {
                    g10.z1();
                }
                i10++;
            } while (i10 < q10);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(boolean z10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? m.b() : i10);
    }
}
