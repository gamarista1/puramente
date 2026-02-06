package P;

import Ef.m;
import H0.C1197s;
import J.C1216l;
import J.C1217m;
import J.C1228y;
import J.K;
import J.a0;
import J.l0;
import J.p0;
import Q0.C1321d;
import Q0.L;
import Q0.S;
import W0.I;
import W0.Q;
import W0.c0;
import Y.C1510r0;
import Y.o1;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.C1638i0;
import androidx.compose.ui.platform.p1;
import androidx.compose.ui.platform.r1;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import q0.C2421g;
import q0.C2422h;
import q0.C2423i;
import yf.C6787a;
import yf.C6798l;
import z0.C2951a;
import z0.C2952b;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final l0 f4772a;

    /* renamed from: b  reason: collision with root package name */
    private I f4773b = p0.d();

    /* renamed from: c  reason: collision with root package name */
    private C6798l f4774c = d.f4798a;

    /* renamed from: d  reason: collision with root package name */
    private C1228y f4775d;

    /* renamed from: e  reason: collision with root package name */
    private final C1510r0 f4776e = u1.d(new Q((String) null, 0, (Q0.Q) null, 7, (DefaultConstructorMarker) null), (o1) null, 2, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private c0 f4777f = c0.f8551a.c();

    /* renamed from: g  reason: collision with root package name */
    private C1638i0 f4778g;

    /* renamed from: h  reason: collision with root package name */
    private p1 f4779h;

    /* renamed from: i  reason: collision with root package name */
    private C2951a f4780i;

    /* renamed from: j  reason: collision with root package name */
    private o f4781j;

    /* renamed from: k  reason: collision with root package name */
    private final C1510r0 f4782k;

    /* renamed from: l  reason: collision with root package name */
    private final C1510r0 f4783l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public long f4784m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public Integer f4785n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public long f4786o;

    /* renamed from: p  reason: collision with root package name */
    private final C1510r0 f4787p;

    /* renamed from: q  reason: collision with root package name */
    private final C1510r0 f4788q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f4789r;

    /* renamed from: s  reason: collision with root package name */
    private Q f4790s;

    /* renamed from: t  reason: collision with root package name */
    private x f4791t;

    /* renamed from: u  reason: collision with root package name */
    private final K f4792u;

    /* renamed from: v  reason: collision with root package name */
    private final C1292h f4793v;

    static final class e extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4799a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(G g10) {
            super(0);
            this.f4799a = g10;
        }

        public final void invoke() {
            G.p(this.f4799a, false, 1, (Object) null);
            this.f4799a.R();
        }
    }

    static final class f extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4800a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(G g10) {
            super(0);
            this.f4800a = g10;
        }

        public final void invoke() {
            this.f4800a.s();
            this.f4800a.R();
        }
    }

    static final class g extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4801a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(G g10) {
            super(0);
            this.f4801a = g10;
        }

        public final void invoke() {
            this.f4801a.T();
            this.f4801a.R();
        }
    }

    static final class h extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4802a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(G g10) {
            super(0);
            this.f4802a = g10;
        }

        public final void invoke() {
            this.f4802a.U();
        }
    }

    public G(l0 l0Var) {
        this.f4772a = l0Var;
        Boolean bool = Boolean.TRUE;
        this.f4782k = u1.d(bool, (o1) null, 2, (Object) null);
        this.f4783l = u1.d(bool, (o1) null, 2, (Object) null);
        C2421g.a aVar = C2421g.f25320b;
        this.f4784m = aVar.c();
        this.f4786o = aVar.c();
        this.f4787p = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f4788q = u1.d((Object) null, (o1) null, 2, (Object) null);
        this.f4789r = -1;
        this.f4790s = new Q((String) null, 0, (Q0.Q) null, 7, (DefaultConstructorMarker) null);
        this.f4792u = new i(this);
        this.f4793v = new c(this);
    }

    /* access modifiers changed from: private */
    public final void W(C2421g gVar) {
        this.f4788q.setValue(gVar);
    }

    /* access modifiers changed from: private */
    public final void Y(C1216l lVar) {
        this.f4787p.setValue(lVar);
    }

    /* access modifiers changed from: private */
    public final void c0(C1217m mVar) {
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            if (yVar.d() == mVar) {
                yVar = null;
            }
            if (yVar != null) {
                yVar.B(mVar);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void m0(boolean z10) {
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            yVar.K(z10);
        }
        if (z10) {
            l0();
        } else {
            R();
        }
    }

    /* access modifiers changed from: private */
    public final long n0(Q q10, long j10, boolean z10, boolean z11, q qVar, boolean z12) {
        a0 j11;
        int i10;
        int i11;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        C2951a aVar;
        int i12;
        boolean z17 = z12;
        C1228y yVar = this.f4775d;
        if (yVar == null || (j11 = yVar.j()) == null) {
            return Q0.Q.f5291b.a();
        }
        long b10 = S.b(this.f4773b.b(Q0.Q.n(q10.g())), this.f4773b.b(Q0.Q.i(q10.g())));
        boolean z18 = false;
        int d10 = j11.d(j10, false);
        if (z11 || z10) {
            i10 = d10;
        } else {
            i10 = Q0.Q.n(b10);
        }
        if (!z11 || z10) {
            i11 = d10;
        } else {
            i11 = Q0.Q.i(b10);
        }
        x xVar = this.f4791t;
        int i13 = -1;
        if (!(z10 || xVar == null || (i12 = this.f4789r) == -1)) {
            i13 = i12;
        }
        x c10 = y.c(j11.f(), i10, i11, i13, b10, z10, z11);
        if (!c10.f(xVar)) {
            return q10.g();
        }
        this.f4791t = c10;
        this.f4789r = d10;
        C1295k a10 = qVar.a(c10);
        long b11 = S.b(this.f4773b.a(a10.e().c()), this.f4773b.a(a10.c().c()));
        if (Q0.Q.g(b11, q10.g())) {
            return q10.g();
        }
        if (Q0.Q.m(b11) == Q0.Q.m(q10.g()) || !Q0.Q.g(S.b(Q0.Q.i(b11), Q0.Q.n(b11)), q10.g())) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!Q0.Q.h(b11) || !Q0.Q.h(q10.g())) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z17 && q10.h().length() > 0 && !z13 && !z14 && (aVar = this.f4780i) != null) {
            aVar.a(C2952b.f29066a.b());
        }
        this.f4774c.invoke(q(q10.e(), b11));
        if (!z17) {
            m0(!Q0.Q.h(b11));
        }
        C1228y yVar2 = this.f4775d;
        if (yVar2 != null) {
            yVar2.D(z17);
        }
        C1228y yVar3 = this.f4775d;
        if (yVar3 != null) {
            if (Q0.Q.h(b11) || !H.c(this, true)) {
                z16 = false;
            } else {
                z16 = true;
            }
            yVar3.M(z16);
        }
        C1228y yVar4 = this.f4775d;
        if (yVar4 != null) {
            if (Q0.Q.h(b11) || !H.c(this, false)) {
                z15 = false;
            } else {
                z15 = true;
            }
            yVar4.L(z15);
        }
        C1228y yVar5 = this.f4775d;
        if (yVar5 != null) {
            if (Q0.Q.h(b11) && H.c(this, true)) {
                z18 = true;
            }
            yVar5.J(z18);
        }
        return b11;
    }

    public static /* synthetic */ void p(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        g10.o(z10);
    }

    /* access modifiers changed from: private */
    public final Q q(C1321d dVar, long j10) {
        return new Q(dVar, j10, (Q0.Q) null, 4, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ void u(G g10, C2421g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = null;
        }
        g10.t(gVar);
    }

    public static /* synthetic */ void w(G g10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        g10.v(z10);
    }

    private final C2423i z() {
        long j10;
        long j11;
        float f10;
        C1197s i10;
        float f11;
        L f12;
        C2423i e10;
        C1197s i11;
        float f13;
        L f14;
        C2423i e11;
        C1197s i12;
        C1197s i13;
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            if (yVar.z()) {
                yVar = null;
            }
            if (yVar != null) {
                int b10 = this.f4773b.b(Q0.Q.n(O().g()));
                int b11 = this.f4773b.b(Q0.Q.i(O().g()));
                C1228y yVar2 = this.f4775d;
                if (yVar2 == null || (i13 = yVar2.i()) == null) {
                    j10 = C2421g.f25320b.c();
                } else {
                    j10 = i13.H0(G(true));
                }
                C1228y yVar3 = this.f4775d;
                if (yVar3 == null || (i12 = yVar3.i()) == null) {
                    j11 = C2421g.f25320b.c();
                } else {
                    j11 = i12.H0(G(false));
                }
                C1228y yVar4 = this.f4775d;
                float f15 = 0.0f;
                if (yVar4 == null || (i11 = yVar4.i()) == null) {
                    f10 = 0.0f;
                } else {
                    a0 j12 = yVar.j();
                    if (j12 == null || (f14 = j12.f()) == null || (e11 = f14.e(b10)) == null) {
                        f13 = 0.0f;
                    } else {
                        f13 = e11.l();
                    }
                    f10 = C2421g.n(i11.H0(C2422h.a(0.0f, f13)));
                }
                C1228y yVar5 = this.f4775d;
                if (!(yVar5 == null || (i10 = yVar5.i()) == null)) {
                    a0 j13 = yVar.j();
                    if (j13 == null || (f12 = j13.f()) == null || (e10 = f12.e(b11)) == null) {
                        f11 = 0.0f;
                    } else {
                        f11 = e10.l();
                    }
                    f15 = C2421g.n(i10.H0(C2422h.a(0.0f, f11)));
                }
                return new C2423i(Math.min(C2421g.m(j10), C2421g.m(j11)), Math.min(f10, f15), Math.max(C2421g.m(j10), C2421g.m(j11)), Math.max(C2421g.n(j10), C2421g.n(j11)) + (c1.h.j((float) 25) * yVar.v().a().getDensity()));
            }
        }
        return C2423i.f25325e.a();
    }

    public final C2421g A() {
        return (C2421g) this.f4788q.getValue();
    }

    public final long B(c1.d dVar) {
        a0 a0Var;
        int b10 = this.f4773b.b(Q0.Q.n(O().g()));
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            a0Var = yVar.j();
        } else {
            a0Var = null;
        }
        C6496s.e(a0Var);
        L f10 = a0Var.f();
        C2423i e10 = f10.e(m.l(b10, 0, f10.l().j().length()));
        return C2422h.a(e10.i() + (dVar.t1(J.L.b()) / ((float) 2)), e10.e());
    }

    public final C1216l C() {
        return (C1216l) this.f4787p.getValue();
    }

    public final boolean D() {
        return ((Boolean) this.f4782k.getValue()).booleanValue();
    }

    public final boolean E() {
        return ((Boolean) this.f4783l.getValue()).booleanValue();
    }

    public final o F() {
        return this.f4781j;
    }

    public final long G(boolean z10) {
        a0 j10;
        L f10;
        int i10;
        C1228y yVar = this.f4775d;
        if (yVar == null || (j10 = yVar.j()) == null || (f10 = j10.f()) == null) {
            return C2421g.f25320b.b();
        }
        C1321d N10 = N();
        if (N10 == null) {
            return C2421g.f25320b.b();
        }
        if (!C6496s.c(N10.j(), f10.l().j().j())) {
            return C2421g.f25320b.b();
        }
        long g10 = O().g();
        if (z10) {
            i10 = Q0.Q.n(g10);
        } else {
            i10 = Q0.Q.i(g10);
        }
        return M.b(f10, this.f4773b.b(i10), z10, Q0.Q.m(O().g()));
    }

    public final C2951a H() {
        return this.f4780i;
    }

    public final C1292h I() {
        return this.f4793v;
    }

    public final I J() {
        return this.f4773b;
    }

    public final C6798l K() {
        return this.f4774c;
    }

    public final C1228y L() {
        return this.f4775d;
    }

    public final K M() {
        return this.f4792u;
    }

    public final C1321d N() {
        J.I v10;
        C1228y yVar = this.f4775d;
        if (yVar == null || (v10 = yVar.v()) == null) {
            return null;
        }
        return v10.k();
    }

    public final Q O() {
        return (Q) this.f4776e.getValue();
    }

    public final c0 P() {
        return this.f4777f;
    }

    public final K Q(boolean z10) {
        return new b(this, z10);
    }

    public final void R() {
        r1 r1Var;
        p1 p1Var;
        p1 p1Var2 = this.f4779h;
        if (p1Var2 != null) {
            r1Var = p1Var2.getStatus();
        } else {
            r1Var = null;
        }
        if (r1Var == r1.Shown && (p1Var = this.f4779h) != null) {
            p1Var.a();
        }
    }

    public final boolean S() {
        return !C6496s.c(this.f4790s.h(), O().h());
    }

    public final void T() {
        C1321d b10;
        C1638i0 i0Var = this.f4778g;
        if (i0Var != null && (b10 = i0Var.b()) != null) {
            C1321d p10 = W0.S.c(O(), O().h().length()).p(b10).p(W0.S.b(O(), O().h().length()));
            int l10 = Q0.Q.l(O().g()) + b10.length();
            this.f4774c.invoke(q(p10, S.b(l10, l10)));
            c0(C1217m.None);
            l0 l0Var = this.f4772a;
            if (l0Var != null) {
                l0Var.a();
            }
        }
    }

    public final void U() {
        Q q10 = q(O().e(), S.b(0, O().h().length()));
        this.f4774c.invoke(q10);
        this.f4790s = Q.c(this.f4790s, (C1321d) null, q10.g(), (Q0.Q) null, 5, (Object) null);
        v(true);
    }

    public final void V(C1638i0 i0Var) {
        this.f4778g = i0Var;
    }

    public final void X(long j10) {
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            yVar.A(j10);
        }
        C1228y yVar2 = this.f4775d;
        if (yVar2 != null) {
            yVar2.I(Q0.Q.f5291b.a());
        }
        if (!Q0.Q.h(j10)) {
            x();
        }
    }

    public final void Z(boolean z10) {
        this.f4782k.setValue(Boolean.valueOf(z10));
    }

    public final void a0(boolean z10) {
        this.f4783l.setValue(Boolean.valueOf(z10));
    }

    public final void b0(o oVar) {
        this.f4781j = oVar;
    }

    public final void d0(C2951a aVar) {
        this.f4780i = aVar;
    }

    public final void e0(I i10) {
        this.f4773b = i10;
    }

    public final void f0(C6798l lVar) {
        this.f4774c = lVar;
    }

    public final void g0(long j10) {
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            yVar.I(j10);
        }
        C1228y yVar2 = this.f4775d;
        if (yVar2 != null) {
            yVar2.A(Q0.Q.f5291b.a());
        }
        if (!Q0.Q.h(j10)) {
            x();
        }
    }

    public final void h0(C1228y yVar) {
        this.f4775d = yVar;
    }

    public final void i0(p1 p1Var) {
        this.f4779h = p1Var;
    }

    public final void j0(Q q10) {
        this.f4776e.setValue(q10);
    }

    public final void k0(c0 c0Var) {
        this.f4777f = c0Var;
    }

    public final void l0() {
        e eVar;
        f fVar;
        g gVar;
        C1638i0 i0Var;
        if (E()) {
            C1228y yVar = this.f4775d;
            if (yVar == null || yVar.y()) {
                h hVar = null;
                if (!Q0.Q.h(O().g())) {
                    eVar = new e(this);
                } else {
                    eVar = null;
                }
                if (Q0.Q.h(O().g()) || !D()) {
                    fVar = null;
                } else {
                    fVar = new f(this);
                }
                if (!D() || (i0Var = this.f4778g) == null || !i0Var.c()) {
                    gVar = null;
                } else {
                    gVar = new g(this);
                }
                if (Q0.Q.j(O().g()) != O().h().length()) {
                    hVar = new h(this);
                }
                h hVar2 = hVar;
                p1 p1Var = this.f4779h;
                if (p1Var != null) {
                    p1Var.b(z(), eVar, gVar, fVar, hVar2);
                }
            }
        }
    }

    public final void n() {
        C1228y yVar = this.f4775d;
        if (yVar != null) {
            yVar.A(Q0.Q.f5291b.a());
        }
        C1228y yVar2 = this.f4775d;
        if (yVar2 != null) {
            yVar2.I(Q0.Q.f5291b.a());
        }
    }

    public final void o(boolean z10) {
        if (!Q0.Q.h(O().g())) {
            C1638i0 i0Var = this.f4778g;
            if (i0Var != null) {
                i0Var.a(W0.S.a(O()));
            }
            if (z10) {
                int k10 = Q0.Q.k(O().g());
                this.f4774c.invoke(q(O().e(), S.b(k10, k10)));
                c0(C1217m.None);
            }
        }
    }

    public final K r() {
        return new a(this);
    }

    public final void s() {
        if (!Q0.Q.h(O().g())) {
            C1638i0 i0Var = this.f4778g;
            if (i0Var != null) {
                i0Var.a(W0.S.a(O()));
            }
            C1321d p10 = W0.S.c(O(), O().h().length()).p(W0.S.b(O(), O().h().length()));
            int l10 = Q0.Q.l(O().g());
            this.f4774c.invoke(q(p10, S.b(l10, l10)));
            c0(C1217m.None);
            l0 l0Var = this.f4772a;
            if (l0Var != null) {
                l0Var.a();
            }
        }
    }

    public final void t(C2421g gVar) {
        C1217m mVar;
        a0 a0Var;
        int i10;
        if (!Q0.Q.h(O().g())) {
            C1228y yVar = this.f4775d;
            if (yVar != null) {
                a0Var = yVar.j();
            } else {
                a0Var = null;
            }
            a0 a0Var2 = a0Var;
            if (gVar == null || a0Var2 == null) {
                i10 = Q0.Q.k(O().g());
            } else {
                i10 = this.f4773b.a(a0.e(a0Var2, gVar.v(), false, 2, (Object) null));
            }
            this.f4774c.invoke(Q.c(O(), (C1321d) null, S.a(i10), (Q0.Q) null, 5, (Object) null));
        }
        if (gVar == null || O().h().length() <= 0) {
            mVar = C1217m.None;
        } else {
            mVar = C1217m.Cursor;
        }
        c0(mVar);
        m0(false);
    }

    public final void v(boolean z10) {
        o oVar;
        C1228y yVar = this.f4775d;
        if (!(yVar == null || yVar.e() || (oVar = this.f4781j) == null)) {
            oVar.f();
        }
        this.f4790s = O();
        m0(z10);
        c0(C1217m.Selection);
    }

    public final void x() {
        m0(false);
        c0(C1217m.None);
    }

    public final C1638i0 y() {
        return this.f4778g;
    }

    public static final class a implements K {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4794a;

        a(G g10) {
            this.f4794a = g10;
        }

        public void b(long j10) {
            a0 j11;
            long a10 = w.a(this.f4794a.G(true));
            C1228y L10 = this.f4794a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                long k10 = j11.k(a10);
                this.f4794a.f4784m = k10;
                this.f4794a.W(C2421g.d(k10));
                this.f4794a.f4786o = C2421g.f25320b.c();
                this.f4794a.Y(C1216l.Cursor);
                this.f4794a.m0(false);
            }
        }

        public void c() {
            this.f4794a.Y((C1216l) null);
            this.f4794a.W((C2421g) null);
        }

        public void d(long j10) {
            a0 j11;
            C2951a H10;
            G g10 = this.f4794a;
            g10.f4786o = C2421g.r(g10.f4786o, j10);
            C1228y L10 = this.f4794a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                G g11 = this.f4794a;
                g11.W(C2421g.d(C2421g.r(g11.f4784m, g11.f4786o)));
                I J10 = g11.J();
                C2421g A10 = g11.A();
                C6496s.e(A10);
                int a10 = J10.a(a0.e(j11, A10.v(), false, 2, (Object) null));
                long b10 = S.b(a10, a10);
                if (!Q0.Q.g(b10, g11.O().g())) {
                    C1228y L11 = g11.L();
                    if ((L11 == null || L11.y()) && (H10 = g11.H()) != null) {
                        H10.a(C2952b.f29066a.b());
                    }
                    g11.K().invoke(g11.q(g11.O().e(), b10));
                }
            }
        }

        public void onStop() {
            this.f4794a.Y((C1216l) null);
            this.f4794a.W((C2421g) null);
        }

        public void onCancel() {
        }

        public void a(long j10) {
        }
    }

    public static final class b implements K {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f4796b;

        b(G g10, boolean z10) {
            this.f4795a = g10;
            this.f4796b = z10;
        }

        public void a(long j10) {
            C1216l lVar;
            a0 j11;
            G g10 = this.f4795a;
            if (this.f4796b) {
                lVar = C1216l.SelectionStart;
            } else {
                lVar = C1216l.SelectionEnd;
            }
            g10.Y(lVar);
            long a10 = w.a(this.f4795a.G(this.f4796b));
            C1228y L10 = this.f4795a.L();
            if (L10 != null && (j11 = L10.j()) != null) {
                long k10 = j11.k(a10);
                this.f4795a.f4784m = k10;
                this.f4795a.W(C2421g.d(k10));
                this.f4795a.f4786o = C2421g.f25320b.c();
                this.f4795a.f4789r = -1;
                C1228y L11 = this.f4795a.L();
                if (L11 != null) {
                    L11.D(true);
                }
                this.f4795a.m0(false);
            }
        }

        public void c() {
            this.f4795a.Y((C1216l) null);
            this.f4795a.W((C2421g) null);
            this.f4795a.m0(true);
        }

        public void d(long j10) {
            G g10 = this.f4795a;
            g10.f4786o = C2421g.r(g10.f4786o, j10);
            G g11 = this.f4795a;
            g11.W(C2421g.d(C2421g.r(g11.f4784m, this.f4795a.f4786o)));
            G g12 = this.f4795a;
            Q O10 = g12.O();
            C2421g A10 = this.f4795a.A();
            C6496s.e(A10);
            long unused = g12.n0(O10, A10.v(), false, this.f4796b, q.f4914a.k(), true);
            this.f4795a.m0(false);
        }

        public void onStop() {
            this.f4795a.Y((C1216l) null);
            this.f4795a.W((C2421g) null);
            this.f4795a.m0(true);
        }

        public void onCancel() {
        }

        public void b(long j10) {
        }
    }

    public static final class c implements C1292h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4797a;

        c(G g10) {
            this.f4797a = g10;
        }

        public boolean a(long j10, q qVar) {
            C1228y L10;
            if (!this.f4797a.E() || this.f4797a.O().h().length() == 0 || (L10 = this.f4797a.L()) == null || L10.j() == null) {
                return false;
            }
            f(this.f4797a.O(), j10, false, qVar);
            return true;
        }

        public boolean c(long j10, q qVar) {
            C1228y L10;
            if (!this.f4797a.E() || this.f4797a.O().h().length() == 0 || (L10 = this.f4797a.L()) == null || L10.j() == null) {
                return false;
            }
            o F10 = this.f4797a.F();
            if (F10 != null) {
                F10.f();
            }
            this.f4797a.f4784m = j10;
            this.f4797a.f4789r = -1;
            G.w(this.f4797a, false, 1, (Object) null);
            f(this.f4797a.O(), this.f4797a.f4784m, true, qVar);
            return true;
        }

        public boolean d(long j10) {
            C1228y L10;
            if (!this.f4797a.E() || this.f4797a.O().h().length() == 0 || (L10 = this.f4797a.L()) == null || L10.j() == null) {
                return false;
            }
            f(this.f4797a.O(), j10, false, q.f4914a.l());
            return true;
        }

        public boolean e(long j10) {
            C1228y L10 = this.f4797a.L();
            if (L10 == null || L10.j() == null || !this.f4797a.E()) {
                return false;
            }
            this.f4797a.f4789r = -1;
            f(this.f4797a.O(), j10, false, q.f4914a.l());
            return true;
        }

        public final void f(Q q10, long j10, boolean z10, q qVar) {
            C1217m mVar;
            long m10 = this.f4797a.n0(q10, j10, z10, false, qVar, false);
            G g10 = this.f4797a;
            if (Q0.Q.h(m10)) {
                mVar = C1217m.Cursor;
            } else {
                mVar = C1217m.Selection;
            }
            g10.c0(mVar);
        }

        public void b() {
        }
    }

    public static final class i implements K {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ G f4803a;

        i(G g10) {
            this.f4803a = g10;
        }

        private final void e() {
            C1217m mVar;
            boolean z10;
            boolean z11;
            this.f4803a.Y((C1216l) null);
            this.f4803a.W((C2421g) null);
            boolean z12 = true;
            this.f4803a.m0(true);
            this.f4803a.f4785n = null;
            boolean h10 = Q0.Q.h(this.f4803a.O().g());
            G g10 = this.f4803a;
            if (h10) {
                mVar = C1217m.Cursor;
            } else {
                mVar = C1217m.Selection;
            }
            g10.c0(mVar);
            C1228y L10 = this.f4803a.L();
            if (L10 != null) {
                if (h10 || !H.c(this.f4803a, true)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                L10.M(z11);
            }
            C1228y L11 = this.f4803a.L();
            if (L11 != null) {
                if (h10 || !H.c(this.f4803a, false)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                L11.L(z10);
            }
            C1228y L12 = this.f4803a.L();
            if (L12 != null) {
                if (!h10 || !H.c(this.f4803a, true)) {
                    z12 = false;
                }
                L12.J(z12);
            }
        }

        public void b(long j10) {
            a0 j11;
            a0 j12;
            if (this.f4803a.E() && this.f4803a.C() == null) {
                this.f4803a.Y(C1216l.SelectionEnd);
                this.f4803a.f4789r = -1;
                this.f4803a.R();
                C1228y L10 = this.f4803a.L();
                if (L10 == null || (j12 = L10.j()) == null || !j12.g(j10)) {
                    C1228y L11 = this.f4803a.L();
                    if (!(L11 == null || (j11 = L11.j()) == null)) {
                        G g10 = this.f4803a;
                        int a10 = g10.J().a(a0.e(j11, j10, false, 2, (Object) null));
                        Q a11 = g10.q(g10.O().e(), S.b(a10, a10));
                        g10.v(false);
                        C2951a H10 = g10.H();
                        if (H10 != null) {
                            H10.a(C2952b.f29066a.b());
                        }
                        g10.K().invoke(a11);
                    }
                } else if (this.f4803a.O().h().length() != 0) {
                    this.f4803a.v(false);
                    G g11 = this.f4803a;
                    this.f4803a.f4785n = Integer.valueOf(Q0.Q.n(g11.n0(Q.c(g11.O(), (C1321d) null, Q0.Q.f5291b.a(), (Q0.Q) null, 5, (Object) null), j10, true, false, q.f4914a.n(), true)));
                } else {
                    return;
                }
                this.f4803a.c0(C1217m.None);
                this.f4803a.f4784m = j10;
                G g12 = this.f4803a;
                g12.W(C2421g.d(g12.f4784m));
                this.f4803a.f4786o = C2421g.f25320b.c();
            }
        }

        public void d(long j10) {
            a0 j11;
            long j12;
            int i10;
            q qVar;
            if (this.f4803a.E() && this.f4803a.O().h().length() != 0) {
                G g10 = this.f4803a;
                g10.f4786o = C2421g.r(g10.f4786o, j10);
                C1228y L10 = this.f4803a.L();
                if (!(L10 == null || (j11 = L10.j()) == null)) {
                    G g11 = this.f4803a;
                    g11.W(C2421g.d(C2421g.r(g11.f4784m, g11.f4786o)));
                    if (g11.f4785n == null) {
                        C2421g A10 = g11.A();
                        C6496s.e(A10);
                        if (!j11.g(A10.v())) {
                            int a10 = g11.J().a(a0.e(j11, g11.f4784m, false, 2, (Object) null));
                            I J10 = g11.J();
                            C2421g A11 = g11.A();
                            C6496s.e(A11);
                            if (a10 == J10.a(a0.e(j11, A11.v(), false, 2, (Object) null))) {
                                qVar = q.f4914a.l();
                            } else {
                                qVar = q.f4914a.n();
                            }
                            Q O10 = g11.O();
                            C2421g A12 = g11.A();
                            C6496s.e(A12);
                            j12 = g11.n0(O10, A12.v(), false, false, qVar, true);
                            Q0.Q.b(j12);
                        }
                    }
                    Integer b10 = g11.f4785n;
                    if (b10 != null) {
                        i10 = b10.intValue();
                    } else {
                        i10 = j11.d(g11.f4784m, false);
                    }
                    C2421g A13 = g11.A();
                    C6496s.e(A13);
                    int d10 = j11.d(A13.v(), false);
                    if (g11.f4785n != null || i10 != d10) {
                        Q O11 = g11.O();
                        C2421g A14 = g11.A();
                        C6496s.e(A14);
                        j12 = g11.n0(O11, A14.v(), false, false, q.f4914a.n(), true);
                        Q0.Q.b(j12);
                    } else {
                        return;
                    }
                }
                this.f4803a.m0(false);
            }
        }

        public void onCancel() {
            e();
        }

        public void onStop() {
            e();
        }

        public void c() {
        }

        public void a(long j10) {
        }
    }

    static final class d extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final d f4798a = new d();

        d() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Q) obj);
            return C6514M.f71813a;
        }

        public final void a(Q q10) {
        }
    }
}
