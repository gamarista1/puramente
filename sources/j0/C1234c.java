package J0;

import D0.C1124o;
import D0.C1126q;
import D0.H;
import H0.C1193n;
import H0.C1194o;
import H0.C1197s;
import H0.C1203y;
import H0.E;
import H0.G;
import H0.O;
import H0.Q;
import H0.X;
import I0.c;
import I0.d;
import I0.g;
import I0.h;
import I0.j;
import I0.k;
import O0.l;
import O0.v;
import a0.C1538b;
import c1.s;
import c1.t;
import java.util.HashSet;
import k0.i;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import o0.C2339b;
import o0.C2344g;
import p0.f;
import t0.C2602c;
import yf.C6787a;

/* renamed from: J0.c  reason: case insensitive filesystem */
public final class C1234c extends i.c implements B, r, w0, s0, h, k, p0, A, C1253t, p0.b, p0.h, p0.k, n0, C2339b {

    /* renamed from: n  reason: collision with root package name */
    private i.b f3777n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3778o = true;

    /* renamed from: p  reason: collision with root package name */
    private I0.a f3779p;

    /* renamed from: q  reason: collision with root package name */
    private HashSet f3780q = new HashSet();

    /* renamed from: r  reason: collision with root package name */
    private C1197s f3781r;

    /* renamed from: J0.c$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1234c f3782a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C1234c cVar) {
            super(0);
            this.f3782a = cVar;
        }

        public final void invoke() {
            this.f3782a.r2();
        }
    }

    /* renamed from: J0.c$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C1234c f3783a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C1234c cVar) {
            super(0);
            this.f3783a = cVar;
        }

        public final void invoke() {
            i.b l22 = this.f3783a.l2();
            C6496s.f(l22, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((d) l22).g(this.f3783a);
        }
    }

    public C1234c(i.b bVar) {
        f2(f0.f(bVar));
        this.f3777n = bVar;
    }

    private final void n2(boolean z10) {
        if (!S1()) {
            G0.a.b("initializeModifier called on unattached node");
        }
        i.b bVar = this.f3777n;
        if ((C1239e0.a(32) & N1()) != 0) {
            if (bVar instanceof d) {
                j2(new a(this));
            }
            if (bVar instanceof j) {
                s2((j) bVar);
            }
        }
        if ((C1239e0.a(4) & N1()) != 0 && !z10) {
            E.a(this);
        }
        if ((C1239e0.a(2) & N1()) != 0) {
            if (C1236d.d(this)) {
                C1235c0 K12 = K1();
                C6496s.e(K12);
                ((C) K12).B3(this);
                K12.T2();
            }
            if (!z10) {
                E.a(this);
                C1245k.m(this).E0();
            }
        }
        if (bVar instanceof X) {
            ((X) bVar).q(C1245k.m(this));
        }
        C1239e0.a(128);
        N1();
        if ((C1239e0.a(256) & N1()) != 0 && (bVar instanceof O) && C1236d.d(this)) {
            C1245k.m(this).E0();
        }
        if ((C1239e0.a(16) & N1()) != 0 && (bVar instanceof H)) {
            ((H) bVar).r().f(K1());
        }
        if ((C1239e0.a(8) & N1()) != 0) {
            C1245k.n(this).z();
        }
    }

    private final void q2() {
        if (!S1()) {
            G0.a.b("unInitializeModifier called on unattached node");
        }
        i.b bVar = this.f3777n;
        if ((C1239e0.a(32) & N1()) != 0) {
            if (bVar instanceof j) {
                C1245k.n(this).getModifierLocalManager().d(this, ((j) bVar).getKey());
            }
            if (bVar instanceof d) {
                ((d) bVar).g(C1236d.f3845a);
            }
        }
        if ((C1239e0.a(8) & N1()) != 0) {
            C1245k.n(this).z();
        }
    }

    private final void s2(j jVar) {
        I0.a aVar = this.f3779p;
        if (aVar == null || !aVar.a(jVar.getKey())) {
            this.f3779p = new I0.a(jVar);
            if (C1236d.d(this)) {
                C1245k.n(this).getModifierLocalManager().a(this, jVar.getKey());
                return;
            }
            return;
        }
        aVar.c(jVar);
        C1245k.n(this).getModifierLocalManager().f(this, jVar.getKey());
    }

    public int B(C1194o oVar, C1193n nVar, int i10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C1203y) bVar).B(oVar, nVar, i10);
    }

    public void C0(C1124o oVar, C1126q qVar, long j10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((H) bVar).r().e(oVar, qVar, j10);
    }

    public int D(C1194o oVar, C1193n nVar, int i10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C1203y) bVar).D(oVar, nVar, i10);
    }

    public int G(C1194o oVar, C1193n nVar, int i10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C1203y) bVar).G(oVar, nVar, i10);
    }

    public void H0(C1197s sVar) {
        this.f3781r = sVar;
    }

    public void V1() {
        n2(true);
    }

    public void W(v vVar) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        O0.j t10 = ((l) bVar).t();
        C6496s.f(vVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((O0.j) vVar).b(t10);
    }

    public void W1() {
        q2();
    }

    public boolean Y0() {
        return S1();
    }

    public Object a(c cVar) {
        C1231a0 j02;
        this.f3780q.add(cVar);
        int a10 = C1239e0.a(32);
        if (v0().S1()) {
            i.c P12 = v0().P1();
            G m10 = C1245k.m(this);
            while (m10 != null) {
                if ((m10.j0().k().I1() & a10) != 0) {
                    while (P12 != null) {
                        if ((P12.N1() & a10) != 0) {
                            i.c cVar2 = P12;
                            C1538b bVar = null;
                            while (cVar2 != null) {
                                if (cVar2 instanceof h) {
                                    h hVar = (h) cVar2;
                                    if (hVar.q0().a(cVar)) {
                                        return hVar.q0().b(cVar);
                                    }
                                } else if ((cVar2.N1() & a10) != 0 && (cVar2 instanceof C1247m)) {
                                    int i10 = 0;
                                    for (i.c m22 = ((C1247m) cVar2).m2(); m22 != null; m22 = m22.J1()) {
                                        if ((m22.N1() & a10) != 0) {
                                            i10++;
                                            if (i10 == 1) {
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
                                    if (i10 == 1) {
                                    }
                                }
                                cVar2 = C1245k.g(bVar);
                            }
                            continue;
                        }
                        P12 = P12.P1();
                    }
                }
                m10 = m10.n0();
                if (m10 == null || (j02 = m10.j0()) == null) {
                    P12 = null;
                } else {
                    P12 = j02.o();
                }
            }
            return cVar.a().invoke();
        }
        throw new IllegalStateException("visitAncestors called on an unattached node");
    }

    public void b1(androidx.compose.ui.focus.k kVar) {
        i.b bVar = this.f3777n;
        G0.a.b("applyFocusProperties called on wrong node");
        android.support.v4.media.session.c.a(bVar);
        new f(kVar);
        throw null;
    }

    public long d() {
        return s.d(C1245k.h(this, C1239e0.a(128)).b());
    }

    public c1.d getDensity() {
        return C1245k.m(this).K();
    }

    public t getLayoutDirection() {
        return C1245k.m(this).getLayoutDirection();
    }

    public void i1() {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((H) bVar).r().d();
    }

    public boolean k0() {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((H) bVar).r().a();
    }

    public void l1() {
        this.f3778o = true;
        C1252s.a(this);
    }

    public final i.b l2() {
        return this.f3777n;
    }

    public void m0(p0.l lVar) {
        i.b bVar = this.f3777n;
        G0.a.b("onFocusEvent called on wrong node");
        android.support.v4.media.session.c.a(bVar);
        throw null;
    }

    public final HashSet m2() {
        return this.f3780q;
    }

    public G o(H0.H h10, E e10, long j10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C1203y) bVar).o(h10, e10, j10);
    }

    public final void o2() {
        this.f3778o = true;
        C1252s.a(this);
    }

    public void p(C1197s sVar) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((O) bVar).p(sVar);
    }

    public final void p2(i.b bVar) {
        if (S1()) {
            q2();
        }
        this.f3777n = bVar;
        f2(f0.f(bVar));
        if (S1()) {
            n2(false);
        }
    }

    public g q0() {
        I0.a aVar = this.f3779p;
        if (aVar != null) {
            return aVar;
        }
        return I0.i.a();
    }

    public final void r2() {
        if (S1()) {
            this.f3780q.clear();
            C1245k.n(this).getSnapshotObserver().i(this, C1236d.f3847c, new b(this));
        }
    }

    public Object s(c1.d dVar, Object obj) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((Q) bVar).s(dVar, obj);
    }

    public String toString() {
        return this.f3777n.toString();
    }

    public void u(C2602c cVar) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((C2344g) bVar).u(cVar);
    }

    public int x(C1194o oVar, C1193n nVar, int i10) {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((C1203y) bVar).x(oVar, nVar, i10);
    }

    public boolean z1() {
        i.b bVar = this.f3777n;
        C6496s.f(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((H) bVar).r().c();
    }

    public void O(long j10) {
    }
}
