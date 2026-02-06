package Bg;

import Bg.N;
import Dg.C5340a;
import Dg.C5342c;
import Dg.C5352m;
import Dg.O;
import Dg.P;
import Dg.T;
import Eg.j;
import Fg.S;
import Of.C5483a;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5494l;
import Of.C5495m;
import Of.C5502u;
import Of.E;
import Of.N;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.g0;
import Of.h0;
import Of.l0;
import Of.t0;
import Pf.h;
import Rf.L;
import Rf.M;
import Rf.V;
import Rf.r;
import ig.b;
import ig.d;
import ig.i;
import ig.k;
import ig.n;
import ig.q;
import ig.u;
import ig.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.C6434a;
import kg.C6435b;
import kg.C6436c;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.f;
import pg.p;
import rg.C6690h;
import tg.g;
import vg.C6755e;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    private final C5330p f62469a;

    /* renamed from: b  reason: collision with root package name */
    private final C5321g f62470b;

    public K(C5330p pVar) {
        C6496s.h(pVar, "c");
        this.f62469a = pVar;
        this.f62470b = new C5321g(pVar.c().q(), pVar.c().r());
    }

    private final c0 A(q qVar, C5330p pVar, C5483a aVar, int i10) {
        return C6690h.b(aVar, pVar.i().u(qVar), (f) null, h.f64602L.b(), i10);
    }

    private final List B(List list, p pVar, C5318d dVar) {
        int i10;
        T t10;
        S s10;
        C5495m e10 = this.f62469a.e();
        C6496s.f(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        C5483a aVar = (C5483a) e10;
        C5495m b10 = aVar.b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        N i11 = i(b10);
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        int i12 = 0;
        for (Object next : iterable) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C6565s.x();
            }
            u uVar = (u) next;
            if (uVar.Q()) {
                i10 = uVar.K();
            } else {
                i10 = 0;
            }
            if (i11 == null || !C6435b.f71544c.d(i10).booleanValue()) {
                t10 = h.f64602L.b();
            } else {
                t10 = new T(this.f62469a.h(), new H(this, i11, pVar, dVar, i12, uVar));
            }
            f b11 = L.b(this.f62469a.g(), uVar.L());
            S u10 = this.f62469a.i().u(kg.f.q(uVar, this.f62469a.j()));
            Boolean f10 = C6435b.f71533H.d(i10);
            C6496s.g(f10, "get(...)");
            boolean booleanValue = f10.booleanValue();
            Boolean f11 = C6435b.f71534I.d(i10);
            C6496s.g(f11, "get(...)");
            boolean booleanValue2 = f11.booleanValue();
            Boolean f12 = C6435b.f71535J.d(i10);
            C6496s.g(f12, "get(...)");
            boolean booleanValue3 = f12.booleanValue();
            q t11 = kg.f.t(uVar, this.f62469a.j());
            if (t11 != null) {
                s10 = this.f62469a.i().u(t11);
            } else {
                s10 = null;
            }
            S s11 = s10;
            h0 h0Var = h0.f64497a;
            C6496s.g(h0Var, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new V(aVar, (t0) null, i12, t10, b11, u10, booleanValue, booleanValue2, booleanValue3, s11, h0Var));
            arrayList = arrayList2;
            i12 = i13;
        }
        return C6565s.e1(arrayList);
    }

    /* access modifiers changed from: private */
    public static final List C(K k10, N n10, p pVar, C5318d dVar, int i10, u uVar) {
        return C6565s.e1(k10.f62469a.c().d().g(n10, pVar, dVar, i10, uVar));
    }

    private final N i(C5495m mVar) {
        if (mVar instanceof N) {
            return new N.b(((Of.N) mVar).f(), this.f62469a.g(), this.f62469a.j(), this.f62469a.d());
        }
        if (mVar instanceof C5352m) {
            return ((C5352m) mVar).i1();
        }
        return null;
    }

    private final h j(p pVar, int i10, C5318d dVar) {
        if (!C6435b.f71544c.d(i10).booleanValue()) {
            return h.f64602L.b();
        }
        return new T(this.f62469a.h(), new E(this, pVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final List k(K k10, p pVar, C5318d dVar) {
        List list;
        N i10 = k10.i(k10.f62469a.e());
        if (i10 != null) {
            list = C6565s.e1(k10.f62469a.c().d().k(i10, pVar, dVar));
        } else {
            list = null;
        }
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    private final c0 l() {
        C5487e eVar;
        C5495m e10 = this.f62469a.e();
        if (e10 instanceof C5487e) {
            eVar = (C5487e) e10;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar.J0();
        }
        return null;
    }

    private final h m(n nVar, boolean z10) {
        if (!C6435b.f71544c.d(nVar.a0()).booleanValue()) {
            return h.f64602L.b();
        }
        return new T(this.f62469a.h(), new F(this, z10, nVar));
    }

    /* access modifiers changed from: private */
    public static final List n(K k10, boolean z10, n nVar) {
        List list;
        N i10 = k10.i(k10.f62469a.e());
        if (i10 == null) {
            list = null;
        } else if (z10) {
            list = C6565s.e1(k10.f62469a.c().d().h(i10, nVar));
        } else {
            list = C6565s.e1(k10.f62469a.c().d().f(i10, nVar));
        }
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    private final h o(p pVar, C5318d dVar) {
        return new C5340a(this.f62469a.h(), new G(this, pVar, dVar));
    }

    /* access modifiers changed from: private */
    public static final List p(K k10, p pVar, C5318d dVar) {
        List list;
        N i10 = k10.i(k10.f62469a.e());
        if (i10 != null) {
            list = k10.f62469a.c().d().b(i10, pVar, dVar);
        } else {
            list = null;
        }
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    private final void q(O o10, c0 c0Var, c0 c0Var2, List list, List list2, List list3, S s10, E e10, C5502u uVar, Map map) {
        o10.o1(c0Var, c0Var2, list, list2, list3, s10, e10, uVar, map);
    }

    private final int t(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    /* access modifiers changed from: private */
    public static final j v(K k10, n nVar, Dg.N n10) {
        return k10.f62469a.h().d(new I(k10, nVar, n10));
    }

    /* access modifiers changed from: private */
    public static final g w(K k10, n nVar, Dg.N n10) {
        N i10 = k10.i(k10.f62469a.e());
        C6496s.e(i10);
        C5319e d10 = k10.f62469a.c().d();
        S returnType = n10.getReturnType();
        C6496s.g(returnType, "getReturnType(...)");
        return (g) d10.d(i10, nVar, returnType);
    }

    /* access modifiers changed from: private */
    public static final j x(K k10, n nVar, Dg.N n10) {
        return k10.f62469a.h().d(new J(k10, nVar, n10));
    }

    /* access modifiers changed from: private */
    public static final g y(K k10, n nVar, Dg.N n10) {
        N i10 = k10.i(k10.f62469a.e());
        C6496s.e(i10);
        C5319e d10 = k10.f62469a.c().d();
        S returnType = n10.getReturnType();
        C6496s.g(returnType, "getReturnType(...)");
        return (g) d10.e(i10, nVar, returnType);
    }

    public final C5486d r(d dVar, boolean z10) {
        d dVar2 = dVar;
        C6496s.h(dVar2, "proto");
        C5495m e10 = this.f62469a.e();
        C6496s.f(e10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        C5487e eVar = (C5487e) e10;
        int J10 = dVar.J();
        C5318d dVar3 = C5318d.FUNCTION;
        C5342c cVar = r1;
        C5342c cVar2 = new C5342c(eVar, (C5494l) null, j(dVar2, J10, dVar3), z10, C5484b.a.DECLARATION, dVar, this.f62469a.g(), this.f62469a.j(), this.f62469a.k(), this.f62469a.d(), (h0) null, 1024, (DefaultConstructorMarker) null);
        K f10 = C5330p.b(this.f62469a, cVar, C6565s.n(), (C6436c) null, (kg.g) null, (kg.h) null, (C6434a) null, 60, (Object) null).f();
        List M10 = dVar.M();
        C6496s.g(M10, "getValueParameterList(...)");
        C5342c cVar3 = cVar;
        cVar3.q1(f10.B(M10, dVar2, dVar3), P.a(O.f62485a, (x) C6435b.f71545d.d(dVar.J())));
        cVar3.g1(eVar.p());
        cVar3.W0(eVar.k0());
        cVar3.Y0(!C6435b.f71556o.d(dVar.J()).booleanValue());
        return cVar3;
    }

    public final g0 s(i iVar) {
        int t10;
        h hVar;
        kg.h k10;
        c0 c0Var;
        S u10;
        i iVar2 = iVar;
        C6496s.h(iVar2, "proto");
        if (iVar.t0()) {
            t10 = iVar.c0();
        } else {
            t10 = t(iVar.e0());
        }
        int i10 = t10;
        C5318d dVar = C5318d.FUNCTION;
        h j10 = j(iVar2, i10, dVar);
        if (kg.f.g(iVar)) {
            hVar = o(iVar2, dVar);
        } else {
            hVar = h.f64602L.b();
        }
        if (C6496s.c(C6755e.o(this.f62469a.e()).c(L.b(this.f62469a.g(), iVar.d0())), Q.f62497a)) {
            k10 = kg.h.f71575b.b();
        } else {
            k10 = this.f62469a.k();
        }
        O o10 = new O(this.f62469a.e(), (g0) null, j10, L.b(this.f62469a.g(), iVar.d0()), P.b(O.f62485a, (ig.j) C6435b.f71557p.d(i10)), iVar, this.f62469a.g(), this.f62469a.j(), k10, this.f62469a.d(), (h0) null, 1024, (DefaultConstructorMarker) null);
        C5330p pVar = this.f62469a;
        List m02 = iVar.m0();
        C6496s.g(m02, "getTypeParameterList(...)");
        C5330p b10 = C5330p.b(pVar, o10, m02, (C6436c) null, (kg.g) null, (kg.h) null, (C6434a) null, 60, (Object) null);
        q k11 = kg.f.k(iVar2, this.f62469a.j());
        if (k11 == null || (u10 = b10.i().u(k11)) == null) {
            c0Var = null;
        } else {
            c0Var = C6690h.i(o10, u10, hVar);
        }
        c0 c0Var2 = c0Var;
        c0 l10 = l();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object next : kg.f.c(iVar2, this.f62469a.j())) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            c0 A10 = A((q) next, b10, o10, i11);
            if (A10 != null) {
                arrayList.add(A10);
            }
            i11 = i12;
        }
        List m10 = b10.i().m();
        K f10 = b10.f();
        List q02 = iVar.q0();
        C6496s.g(q02, "getValueParameterList(...)");
        List B10 = f10.B(q02, iVar2, C5318d.FUNCTION);
        S u11 = b10.i().u(kg.f.m(iVar2, this.f62469a.j()));
        O o11 = O.f62485a;
        E b11 = o11.b((k) C6435b.f71546e.d(i10));
        O o12 = o10;
        C5330p pVar2 = b10;
        O o13 = o10;
        E e10 = b11;
        int i13 = i10;
        C5502u a10 = P.a(o11, (x) C6435b.f71545d.d(i10));
        q(o12, c0Var2, l10, arrayList, m10, B10, u11, e10, a10, mf.O.i());
        o13.f1(C6435b.f71558q.d(i13).booleanValue());
        o13.c1(C6435b.f71559r.d(i13).booleanValue());
        o13.X0(C6435b.f71562u.d(i13).booleanValue());
        o13.e1(C6435b.f71560s.d(i13).booleanValue());
        o13.i1(C6435b.f71561t.d(i13).booleanValue());
        o13.h1(C6435b.f71563v.d(i13).booleanValue());
        o13.W0(C6435b.f71564w.d(i13).booleanValue());
        o13.Y0(!C6435b.f71565x.d(i13).booleanValue());
        Pair a11 = this.f62469a.c().h().a(iVar2, o13, this.f62469a.j(), pVar2.i());
        if (a11 != null) {
            o13.U0((C5483a.C0945a) a11.c(), a11.d());
        }
        return o13;
    }

    public final Z u(n nVar) {
        n nVar2;
        h hVar;
        Dg.N n10;
        c0 c0Var;
        C6435b.d dVar;
        C6435b.d dVar2;
        C5330p pVar;
        L l10;
        n nVar3;
        Dg.N n11;
        L l11;
        M m10;
        L l12;
        S u10;
        n nVar4 = nVar;
        C6496s.h(nVar4, "proto");
        int a02 = nVar.p0() ? nVar.a0() : t(nVar.d0());
        C5495m e10 = this.f62469a.e();
        h j10 = j(nVar4, a02, C5318d.PROPERTY);
        O o10 = O.f62485a;
        E b10 = o10.b((k) C6435b.f71546e.d(a02));
        C5502u a10 = P.a(o10, (x) C6435b.f71545d.d(a02));
        Boolean f10 = C6435b.f71566y.d(a02);
        C6496s.g(f10, "get(...)");
        boolean booleanValue = f10.booleanValue();
        f b11 = L.b(this.f62469a.g(), nVar.c0());
        C5484b.a b12 = P.b(o10, (ig.j) C6435b.f71557p.d(a02));
        Boolean f11 = C6435b.f71528C.d(a02);
        C6496s.g(f11, "get(...)");
        boolean booleanValue2 = f11.booleanValue();
        Boolean f12 = C6435b.f71527B.d(a02);
        C6496s.g(f12, "get(...)");
        boolean booleanValue3 = f12.booleanValue();
        Boolean f13 = C6435b.f71530E.d(a02);
        C6496s.g(f13, "get(...)");
        boolean booleanValue4 = f13.booleanValue();
        Dg.N n12 = r1;
        Boolean f14 = C6435b.f71531F.d(a02);
        C6496s.g(f14, "get(...)");
        String str = "get(...)";
        boolean booleanValue5 = f14.booleanValue();
        Boolean f15 = C6435b.f71532G.d(a02);
        C6496s.g(f15, str);
        Dg.N n13 = n12;
        String str2 = str;
        n nVar5 = nVar4;
        Dg.N n14 = new Dg.N(e10, (Z) null, j10, b10, a10, booleanValue, b11, b12, booleanValue2, booleanValue3, booleanValue4, booleanValue5, f15.booleanValue(), nVar, this.f62469a.g(), this.f62469a.j(), this.f62469a.k(), this.f62469a.d());
        C5330p pVar2 = this.f62469a;
        List n02 = nVar.n0();
        C6496s.g(n02, "getTypeParameterList(...)");
        C5330p b13 = C5330p.b(pVar2, n13, n02, (C6436c) null, (kg.g) null, (kg.h) null, (C6434a) null, 60, (Object) null);
        int i10 = a02;
        Boolean f16 = C6435b.f71567z.d(i10);
        String str3 = str2;
        C6496s.g(f16, str3);
        boolean booleanValue6 = f16.booleanValue();
        if (!booleanValue6 || !kg.f.h(nVar)) {
            nVar2 = nVar;
            hVar = h.f64602L.b();
        } else {
            nVar2 = nVar;
            hVar = o(nVar2, C5318d.PROPERTY_GETTER);
        }
        S u11 = b13.i().u(kg.f.n(nVar2, this.f62469a.j()));
        List m11 = b13.i().m();
        c0 l13 = l();
        q l14 = kg.f.l(nVar2, this.f62469a.j());
        C5488f fVar = null;
        if (l14 == null || (u10 = b13.i().u(l14)) == null) {
            n10 = n13;
            c0Var = null;
        } else {
            n10 = n13;
            c0Var = C6690h.i(n10, u10, hVar);
        }
        Iterable d10 = kg.f.d(nVar2, this.f62469a.j());
        ArrayList arrayList = new ArrayList(C6565s.y(d10, 10));
        int i11 = 0;
        for (Object next : d10) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C6565s.x();
            }
            arrayList.add(A((q) next, b13, n10, i11));
            i11 = i12;
        }
        n10.b1(u11, m11, l13, c0Var, arrayList);
        Boolean f17 = C6435b.f71544c.d(i10);
        C6496s.g(f17, str3);
        boolean booleanValue7 = f17.booleanValue();
        C6435b.d dVar3 = C6435b.f71545d;
        C6435b.d dVar4 = C6435b.f71546e;
        int b14 = C6435b.b(booleanValue7, (x) dVar3.d(i10), (k) dVar4.d(i10), false, false, false);
        if (booleanValue6) {
            int b02 = nVar.q0() ? nVar.b0() : b14;
            Boolean f18 = C6435b.f71536K.d(b02);
            C6496s.g(f18, str3);
            boolean booleanValue8 = f18.booleanValue();
            Boolean f19 = C6435b.f71537L.d(b02);
            C6496s.g(f19, str3);
            boolean booleanValue9 = f19.booleanValue();
            Boolean f20 = C6435b.f71538M.d(b02);
            C6496s.g(f20, str3);
            boolean booleanValue10 = f20.booleanValue();
            h j11 = j(nVar2, b02, C5318d.PROPERTY_GETTER);
            if (booleanValue8) {
                O o11 = O.f62485a;
                dVar = dVar4;
                pVar = b13;
                n11 = n10;
                dVar2 = dVar3;
                nVar3 = nVar2;
                l12 = new L(n10, j11, o11.b((k) dVar4.d(b02)), P.a(o11, (x) dVar3.d(b02)), !booleanValue8, booleanValue9, booleanValue10, n10.h(), (a0) null, h0.f64497a);
            } else {
                pVar = b13;
                dVar = dVar4;
                dVar2 = dVar3;
                n11 = n10;
                nVar3 = nVar2;
                L d11 = C6690h.d(n11, j11);
                C6496s.e(d11);
                l12 = d11;
            }
            l12.P0(n11.getReturnType());
            l10 = l12;
        } else {
            pVar = b13;
            dVar = dVar4;
            dVar2 = dVar3;
            n11 = n10;
            nVar3 = nVar2;
            l10 = null;
        }
        if (C6435b.f71526A.d(i10).booleanValue()) {
            if (nVar.x0()) {
                b14 = nVar.j0();
            }
            int i13 = b14;
            Boolean f21 = C6435b.f71536K.d(i13);
            C6496s.g(f21, str3);
            boolean booleanValue11 = f21.booleanValue();
            Boolean f22 = C6435b.f71537L.d(i13);
            C6496s.g(f22, str3);
            boolean booleanValue12 = f22.booleanValue();
            Boolean f23 = C6435b.f71538M.d(i13);
            C6496s.g(f23, str3);
            boolean booleanValue13 = f23.booleanValue();
            C5318d dVar5 = C5318d.PROPERTY_SETTER;
            h j12 = j(nVar3, i13, dVar5);
            if (booleanValue11) {
                O o12 = O.f62485a;
                M m12 = r4;
                l11 = l10;
                M m13 = new M(n11, j12, o12.b((k) dVar.d(i13)), P.a(o12, (x) dVar2.d(i13)), !booleanValue11, booleanValue12, booleanValue13, n11.h(), (b0) null, h0.f64497a);
                M m14 = m12;
                m14.Q0((t0) C6565s.P0(C5330p.b(pVar, m12, C6565s.n(), (C6436c) null, (kg.g) null, (kg.h) null, (C6434a) null, 60, (Object) null).f().B(C6565s.e(nVar.k0()), nVar3, dVar5)));
                m10 = m14;
            } else {
                l11 = l10;
                m10 = C6690h.e(n11, j12, h.f64602L.b());
                C6496s.e(m10);
            }
        } else {
            l11 = l10;
            m10 = null;
        }
        if (C6435b.f71529D.d(i10).booleanValue()) {
            n11.L0(new C(this, nVar3, n11));
        }
        C5495m e11 = this.f62469a.e();
        C5487e eVar = e11 instanceof C5487e ? (C5487e) e11 : null;
        if (eVar != null) {
            fVar = eVar.h();
        }
        if (fVar == C5488f.ANNOTATION_CLASS) {
            n11.L0(new D(this, nVar3, n11));
        }
        n11.V0(l11, m10, new r(m(nVar3, false), n11), new r(m(nVar3, true), n11));
        return n11;
    }

    public final l0 z(ig.r rVar) {
        ig.r rVar2 = rVar;
        C6496s.h(rVar2, "proto");
        h.a aVar = h.f64602L;
        List Q10 = rVar.Q();
        C6496s.g(Q10, "getAnnotationList(...)");
        Iterable<b> iterable = Q10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (b bVar : iterable) {
            C5321g gVar = this.f62470b;
            C6496s.e(bVar);
            arrayList.add(gVar.a(bVar, this.f62469a.g()));
        }
        P p10 = new P(this.f62469a.h(), this.f62469a.e(), aVar.a(arrayList), L.b(this.f62469a.g(), rVar.W()), P.a(O.f62485a, (x) C6435b.f71545d.d(rVar.V())), rVar, this.f62469a.g(), this.f62469a.j(), this.f62469a.k(), this.f62469a.d());
        C5330p pVar = this.f62469a;
        List Z10 = rVar.Z();
        C6496s.g(Z10, "getTypeParameterList(...)");
        P p11 = p10;
        C5330p b10 = C5330p.b(pVar, p10, Z10, (C6436c) null, (kg.g) null, (kg.h) null, (C6434a) null, 60, (Object) null);
        p11.W0(b10.i().m(), b10.i().o(kg.f.r(rVar2, this.f62469a.j()), false), b10.i().o(kg.f.e(rVar2, this.f62469a.j()), false));
        return p11;
    }
}
