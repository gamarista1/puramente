package bg;

import Ef.m;
import Eg.h;
import Eg.i;
import Ff.f;
import Fg.I0;
import Fg.J0;
import Fg.S;
import Of.C5483a;
import Of.C5486d;
import Of.C5487e;
import Of.C5490h;
import Of.C5494l;
import Of.C5501t;
import Of.C5502u;
import Of.C5507z;
import Of.E;
import Of.Z;
import Of.a0;
import Of.b0;
import Of.c0;
import Of.g0;
import Of.m0;
import Of.t0;
import Pg.l;
import Rf.C5520i;
import Rf.C5528q;
import Rf.L;
import Rf.M;
import Xf.C5673f;
import Xf.C5676i;
import Xf.C5680m;
import Xf.C5687u;
import Xf.H;
import Xf.I;
import Xf.N;
import Xf.T;
import Xf.U;
import Xf.V;
import Xf.y;
import Xf.z;
import Yf.o;
import Zf.d;
import Zf.e;
import ag.c;
import ag.k;
import bg.C5754U;
import cg.C5798a;
import cg.C5799b;
import eg.C5829f;
import eg.C5830g;
import eg.C5834k;
import eg.C5837n;
import eg.q;
import eg.r;
import eg.w;
import eg.x;
import fg.C5905e0;
import gg.C5943C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6493o;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mf.C6565s;
import mf.Y;
import rg.C6690h;
import rg.C6691i;
import rg.C6697o;
import vg.C6755e;
import yf.C6798l;
import yg.C6805d;

/* renamed from: bg.z  reason: case insensitive filesystem */
public final class C5785z extends C5754U {

    /* renamed from: n  reason: collision with root package name */
    private final C5487e f67260n;

    /* renamed from: o  reason: collision with root package name */
    private final C5830g f67261o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f67262p;

    /* renamed from: q  reason: collision with root package name */
    private final i f67263q;

    /* renamed from: r  reason: collision with root package name */
    private final i f67264r;

    /* renamed from: s  reason: collision with root package name */
    private final i f67265s;

    /* renamed from: t  reason: collision with root package name */
    private final i f67266t;

    /* renamed from: u  reason: collision with root package name */
    private final h f67267u;

    /* renamed from: bg.z$a */
    /* synthetic */ class a extends C6493o implements C6798l {
        a(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsByNameWithoutBuiltinMagic";
        }

        public final f getOwner() {
            return O.b(C5785z.class);
        }

        public final String getSignature() {
            return "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: i */
        public final Collection invoke(ng.f fVar) {
            C6496s.h(fVar, "p0");
            return ((C5785z) this.receiver).q1(fVar);
        }
    }

    /* renamed from: bg.z$b */
    /* synthetic */ class b extends C6493o implements C6798l {
        b(Object obj) {
            super(1, obj);
        }

        public final String getName() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic";
        }

        public final f getOwner() {
            return O.b(C5785z.class);
        }

        public final String getSignature() {
            return "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;";
        }

        /* renamed from: i */
        public final Collection invoke(ng.f fVar) {
            C6496s.h(fVar, "p0");
            return ((C5785z) this.receiver).r1(fVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5785z(k kVar, C5487e eVar, C5830g gVar, boolean z10, C5785z zVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, eVar, gVar, z10, (i10 & 16) != 0 ? null : zVar);
    }

    /* access modifiers changed from: private */
    public static final Collection A0(C5785z zVar, ng.f fVar) {
        C6496s.h(fVar, "it");
        return zVar.q1(fVar);
    }

    /* access modifiers changed from: private */
    public static final Collection B0(C5785z zVar, ng.f fVar) {
        C6496s.h(fVar, "it");
        return zVar.r1(fVar);
    }

    private final Collection C0() {
        if (!this.f67262p) {
            return L().a().k().d().g(R());
        }
        Collection l10 = R().l().l();
        C6496s.g(l10, "getSupertypes(...)");
        return l10;
    }

    /* access modifiers changed from: private */
    public static final List D0(C5785z zVar, k kVar) {
        Collection<C5834k> j10 = zVar.f67261o.j();
        ArrayList arrayList = new ArrayList(j10.size());
        for (C5834k o12 : j10) {
            arrayList.add(zVar.o1(o12));
        }
        if (zVar.f67261o.r()) {
            C5486d G02 = zVar.G0();
            String c10 = C5943C.c(G02, false, false, 2, (Object) null);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C6496s.c(C5943C.c((C5486d) it.next(), false, false, 2, (Object) null), c10)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            arrayList.add(G02);
            kVar.a().h().b(zVar.f67261o, G02);
        }
        kVar.a().w().a(zVar.R(), arrayList, kVar);
        C5905e0 r10 = kVar.a().r();
        boolean isEmpty = arrayList.isEmpty();
        Collection collection = arrayList;
        if (isEmpty) {
            collection = C6565s.r(zVar.F0());
        }
        return C6565s.e1(r10.p(kVar, collection));
    }

    private final List E0(C5520i iVar) {
        Pair pair;
        Collection C10 = this.f67261o.C();
        ArrayList arrayList = new ArrayList(C10.size());
        C5798a b10 = C5799b.b(I0.COMMON, true, false, (m0) null, 6, (Object) null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : C10) {
            if (C6496s.c(((r) next).getName(), I.f66264c)) {
                arrayList2.add(next);
            } else {
                arrayList3.add(next);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<r> list2 = (List) pair2.b();
        list.size();
        r rVar = (r) C6565s.q0(list);
        int i10 = 1;
        if (rVar != null) {
            x returnType = rVar.getReturnType();
            if (returnType instanceof C5829f) {
                C5829f fVar = (C5829f) returnType;
                pair = new Pair(L().g().l(fVar, b10, true), L().g().p(fVar.o(), b10));
            } else {
                pair = new Pair(L().g().p(returnType, b10), (Object) null);
            }
            s0(arrayList, iVar, 0, rVar, (S) pair.a(), (S) pair.b());
        }
        int i11 = 0;
        if (rVar == null) {
            i10 = 0;
        }
        for (r rVar2 : list2) {
            s0(arrayList, iVar, i11 + i10, rVar2, L().g().p(rVar2.getReturnType(), b10), (S) null);
            i11++;
        }
        return arrayList;
    }

    private final C5486d F0() {
        List list;
        boolean p10 = this.f67261o.p();
        if ((this.f67261o.L() || !this.f67261o.s()) && !p10) {
            return null;
        }
        C5487e c12 = R();
        Zf.b t12 = Zf.b.t1(c12, Pf.h.f64602L.b(), true, L().a().t().a(this.f67261o));
        C6496s.g(t12, "createJavaConstructor(...)");
        if (p10) {
            list = E0(t12);
        } else {
            list = Collections.emptyList();
        }
        t12.Z0(false);
        t12.q1(list, Z0(c12));
        t12.Y0(true);
        t12.g1(c12.p());
        L().a().h().b(this.f67261o, t12);
        return t12;
    }

    private final C5486d G0() {
        C5487e c12 = R();
        Zf.b t12 = Zf.b.t1(c12, Pf.h.f64602L.b(), true, L().a().t().a(this.f67261o));
        C6496s.g(t12, "createJavaConstructor(...)");
        List M02 = M0(t12);
        t12.Z0(false);
        t12.q1(M02, Z0(c12));
        t12.Y0(false);
        t12.g1(c12.p());
        return t12;
    }

    private final g0 H0(g0 g0Var, C5483a aVar, Collection collection) {
        Iterable<g0> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return g0Var;
        }
        for (g0 g0Var2 : iterable) {
            if (!C6496s.c(g0Var, g0Var2) && g0Var2.t0() == null && Q0(g0Var2, aVar)) {
                C5507z f10 = g0Var.v().m().f();
                C6496s.e(f10);
                return (g0) f10;
            }
        }
        return g0Var;
    }

    private final g0 I0(C5507z zVar, C6798l lVar) {
        Object obj;
        ng.f name = zVar.getName();
        C6496s.g(name, "getName(...)");
        Iterator it = ((Iterable) lVar.invoke(name)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (e1((g0) obj, zVar)) {
                break;
            }
        }
        g0 g0Var = (g0) obj;
        if (g0Var == null) {
            return null;
        }
        C5507z.a v10 = g0Var.v();
        List k10 = zVar.k();
        C6496s.g(k10, "getValueParameters(...)");
        Iterable<t0> iterable = k10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (t0 type : iterable) {
            arrayList.add(type.getType());
        }
        List k11 = g0Var.k();
        C6496s.g(k11, "getValueParameters(...)");
        v10.h(Zf.h.a(arrayList, k11, zVar));
        v10.z();
        v10.u();
        v10.q(e.f66932H, Boolean.TRUE);
        return (g0) v10.f();
    }

    private final Zf.f J0(Z z10, C6798l lVar) {
        g0 g0Var;
        M m10 = null;
        if (!P0(z10, lVar)) {
            return null;
        }
        g0 W02 = W0(z10, lVar);
        C6496s.e(W02);
        if (z10.O()) {
            g0Var = X0(z10, lVar);
            C6496s.e(g0Var);
        } else {
            g0Var = null;
        }
        if (g0Var != null) {
            g0Var.r();
            W02.r();
        }
        d dVar = new d(R(), W02, g0Var, z10);
        S returnType = W02.getReturnType();
        C6496s.e(returnType);
        d dVar2 = dVar;
        dVar2.b1(returnType, C6565s.n(), O(), (c0) null, C6565s.n());
        L k10 = C6690h.k(dVar2, W02.getAnnotations(), false, false, false, W02.i());
        k10.M0(W02);
        k10.P0(dVar.getType());
        C6496s.g(k10, "apply(...)");
        if (g0Var != null) {
            List k11 = g0Var.k();
            C6496s.g(k11, "getValueParameters(...)");
            t0 t0Var = (t0) C6565s.q0(k11);
            if (t0Var != null) {
                m10 = C6690h.m(dVar, g0Var.getAnnotations(), t0Var.getAnnotations(), false, false, false, g0Var.getVisibility(), g0Var.i());
                m10.M0(g0Var);
            } else {
                throw new AssertionError("No parameter found for " + g0Var);
            }
        }
        dVar.U0(k10, m10);
        return dVar;
    }

    private final Zf.f K0(r rVar, S s10, E e10) {
        S s11;
        r rVar2 = rVar;
        Zf.f f12 = Zf.f.f1(R(), ag.h.a(L(), rVar2), e10, V.d(rVar.getVisibility()), false, rVar.getName(), L().a().t().a(rVar2), false);
        C6496s.g(f12, "create(...)");
        L d10 = C6690h.d(f12, Pf.h.f64602L.b());
        C6496s.g(d10, "createDefaultGetter(...)");
        f12.U0(d10, (b0) null);
        if (s10 == null) {
            s11 = A(rVar2, c.i(L(), f12, rVar, 0, 4, (Object) null));
        } else {
            s11 = s10;
        }
        f12.b1(s11, C6565s.n(), O(), (c0) null, C6565s.n());
        d10.P0(s11);
        return f12;
    }

    static /* synthetic */ Zf.f L0(C5785z zVar, r rVar, S s10, E e10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            s10 = null;
        }
        return zVar.K0(rVar, s10, e10);
    }

    private final List M0(C5520i iVar) {
        S s10;
        Collection n10 = this.f67261o.n();
        ArrayList arrayList = new ArrayList(n10.size());
        C5798a b10 = C5799b.b(I0.COMMON, false, false, (m0) null, 6, (Object) null);
        Iterator it = n10.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            w wVar = (w) it.next();
            S p10 = L().g().p(wVar.getType(), b10);
            if (wVar.m()) {
                s10 = L().a().m().m().k(p10);
            } else {
                s10 = null;
            }
            S s11 = s10;
            Rf.V v10 = r5;
            Rf.V v11 = new Rf.V(iVar, (t0) null, i11, Pf.h.f64602L.b(), wVar.getName(), p10, false, false, false, s11, L().a().t().a(wVar));
            arrayList.add(v10);
        }
    }

    private final g0 N0(g0 g0Var, ng.f fVar) {
        C5507z.a v10 = g0Var.v();
        v10.o(fVar);
        v10.z();
        v10.u();
        C5507z f10 = v10.f();
        C6496s.e(f10);
        return (g0) f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Of.g0 O0(Of.g0 r6) {
        /*
            r5 = this;
            java.util.List r0 = r6.k()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.Object r0 = mf.C6565s.B0(r0)
            Of.t0 r0 = (Of.t0) r0
            r2 = 0
            if (r0 == 0) goto L_0x007d
            Fg.S r3 = r0.getType()
            Fg.v0 r3 = r3.N0()
            Of.h r3 = r3.o()
            if (r3 == 0) goto L_0x0035
            ng.d r3 = vg.C6755e.p(r3)
            if (r3 == 0) goto L_0x0035
            boolean r4 = r3.f()
            if (r4 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r3 = r2
        L_0x002e:
            if (r3 == 0) goto L_0x0035
            ng.c r3 = r3.l()
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            ng.c r4 = Lf.o.f63949v
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r3 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r0 = r2
        L_0x0040:
            if (r0 != 0) goto L_0x0043
            goto L_0x007d
        L_0x0043:
            Of.z$a r2 = r6.v()
            java.util.List r6 = r6.k()
            kotlin.jvm.internal.C6496s.g(r6, r1)
            r1 = 1
            java.util.List r6 = mf.C6565s.h0(r6, r1)
            Of.z$a r6 = r2.h(r6)
            Fg.S r0 = r0.getType()
            java.util.List r0 = r0.L0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            Fg.B0 r0 = (Fg.B0) r0
            Fg.S r0 = r0.getType()
            Of.z$a r6 = r6.s(r0)
            Of.z r6 = r6.f()
            Of.g0 r6 = (Of.g0) r6
            r0 = r6
            Rf.O r0 = (Rf.O) r0
            if (r0 == 0) goto L_0x007c
            r0.h1(r1)
        L_0x007c:
            return r6
        L_0x007d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C5785z.O0(Of.g0):Of.g0");
    }

    private final boolean P0(Z z10, C6798l lVar) {
        if (C5763d.a(z10)) {
            return false;
        }
        g0 W02 = W0(z10, lVar);
        g0 X02 = X0(z10, lVar);
        if (W02 == null) {
            return false;
        }
        if (!z10.O()) {
            return true;
        }
        if (X02 == null || X02.r() != W02.r()) {
            return false;
        }
        return true;
    }

    private final boolean Q0(C5483a aVar, C5483a aVar2) {
        C6697o.i.a c10 = C6697o.f73033f.F(aVar2, aVar, true).c();
        C6496s.g(c10, "getResult(...)");
        if (c10 != C6697o.i.a.OVERRIDABLE || z.f66409a.a(aVar2, aVar)) {
            return false;
        }
        return true;
    }

    private final boolean R0(g0 g0Var) {
        U.a aVar = U.f66327a;
        ng.f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        ng.f b10 = aVar.b(name);
        if (b10 == null) {
            return false;
        }
        ArrayList<g0> arrayList = new ArrayList<>();
        for (Object next : b1(b10)) {
            if (T.d((g0) next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        g0 N02 = N0(g0Var, b10);
        if (arrayList.isEmpty()) {
            return false;
        }
        for (g0 S02 : arrayList) {
            if (S0(S02, N02)) {
                return true;
            }
        }
        return false;
    }

    private final boolean S0(g0 g0Var, C5507z zVar) {
        if (C5673f.f66375o.m(g0Var)) {
            zVar = zVar.a();
        }
        C6496s.e(zVar);
        return Q0(zVar, g0Var);
    }

    private final boolean T0(g0 g0Var) {
        g0 O02 = O0(g0Var);
        if (O02 == null) {
            return false;
        }
        ng.f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        Iterable<g0> b12 = b1(name);
        if ((b12 instanceof Collection) && ((Collection) b12).isEmpty()) {
            return false;
        }
        for (g0 g0Var2 : b12) {
            if (g0Var2.isSuspend() && Q0(O02, g0Var2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Map U0(C5785z zVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : zVar.f67261o.y()) {
            if (((C5837n) next).K()) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(mf.O.e(C6565s.y(arrayList, 10)), 16));
        for (Object next2 : arrayList) {
            linkedHashMap.put(((C5837n) next2).getName(), next2);
        }
        return linkedHashMap;
    }

    private final g0 V0(Z z10, String str, C6798l lVar) {
        g0 g0Var;
        boolean z11;
        ng.f i10 = ng.f.i(str);
        C6496s.g(i10, "identifier(...)");
        Iterator it = ((Iterable) lVar.invoke(i10)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.k().size() == 0) {
                Gg.e eVar = Gg.e.f63178a;
                S returnType = g0Var2.getReturnType();
                if (returnType == null) {
                    z11 = false;
                } else {
                    z11 = eVar.c(returnType, z10.getType());
                }
                if (z11) {
                    g0Var = g0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    private final g0 W0(Z z10, C6798l lVar) {
        a0 a0Var;
        a0 d10 = z10.d();
        String str = null;
        if (d10 != null) {
            a0Var = (a0) T.g(d10);
        } else {
            a0Var = null;
        }
        if (a0Var != null) {
            str = C5680m.f66386a.b(a0Var);
        }
        if (str != null && !T.l(R(), a0Var)) {
            return V0(z10, str, lVar);
        }
        String b10 = z10.getName().b();
        C6496s.g(b10, "asString(...)");
        return V0(z10, H.b(b10), lVar);
    }

    private final g0 X0(Z z10, C6798l lVar) {
        g0 g0Var;
        S returnType;
        String b10 = z10.getName().b();
        C6496s.g(b10, "asString(...)");
        ng.f i10 = ng.f.i(H.e(b10));
        C6496s.g(i10, "identifier(...)");
        Iterator it = ((Iterable) lVar.invoke(i10)).iterator();
        do {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if (g0Var2.k().size() == 1 && (returnType = g0Var2.getReturnType()) != null && Lf.i.C0(returnType)) {
                Gg.e eVar = Gg.e.f63178a;
                List k10 = g0Var2.k();
                C6496s.g(k10, "getValueParameters(...)");
                if (eVar.b(((t0) C6565s.P0(k10)).getType(), z10.getType())) {
                    g0Var = g0Var2;
                    continue;
                } else {
                    continue;
                }
            }
        } while (g0Var == null);
        return g0Var;
    }

    /* access modifiers changed from: private */
    public static final Set Y0(k kVar, C5785z zVar) {
        return C6565s.j1(kVar.a().w().b(zVar.R(), kVar));
    }

    private final C5502u Z0(C5487e eVar) {
        C5502u visibility = eVar.getVisibility();
        C6496s.g(visibility, "getVisibility(...)");
        if (!C6496s.c(visibility, y.f66406b)) {
            return visibility;
        }
        C5502u uVar = y.f66407c;
        C6496s.g(uVar, "PROTECTED_AND_PACKAGE");
        return uVar;
    }

    private final Set b1(ng.f fVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (S o10 : C0()) {
            C6565s.D(linkedHashSet, o10.o().c(fVar, Wf.d.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set d1(ng.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (S o10 : C0()) {
            Iterable<Z> b10 = o10.o().b(fVar, Wf.d.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(C6565s.y(b10, 10));
            for (Z add : b10) {
                arrayList2.add(add);
            }
            C6565s.D(arrayList, arrayList2);
        }
        return C6565s.j1(arrayList);
    }

    private final boolean e1(g0 g0Var, C5507z zVar) {
        String c10 = C5943C.c(g0Var, false, false, 2, (Object) null);
        C5507z a10 = zVar.a();
        C6496s.g(a10, "getOriginal(...)");
        if (!C6496s.c(c10, C5943C.c(a10, false, false, 2, (Object) null)) || Q0(g0Var, zVar)) {
            return false;
        }
        return true;
    }

    private final boolean f1(g0 g0Var) {
        ng.f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        Iterable<ng.f> a10 = N.a(name);
        if (!(a10 instanceof Collection) || !((Collection) a10).isEmpty()) {
            for (ng.f d12 : a10) {
                Iterable<Z> d13 = d1(d12);
                if (!(d13 instanceof Collection) || !((Collection) d13).isEmpty()) {
                    for (Z z10 : d13) {
                        if (P0(z10, new C5781v(g0Var, this))) {
                            if (!z10.O()) {
                                String b10 = g0Var.getName().b();
                                C6496s.g(b10, "asString(...)");
                                if (!H.d(b10)) {
                                }
                            }
                            return false;
                        }
                    }
                    continue;
                }
            }
        }
        if (R0(g0Var) || s1(g0Var) || T0(g0Var)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final Collection g1(g0 g0Var, C5785z zVar, ng.f fVar) {
        C6496s.h(fVar, "accessorName");
        if (C6496s.c(g0Var.getName(), fVar)) {
            return C6565s.e(g0Var);
        }
        return C6565s.K0(zVar.q1(fVar), zVar.r1(fVar));
    }

    /* access modifiers changed from: private */
    public static final Set h1(C5785z zVar) {
        return C6565s.j1(zVar.f67261o.B());
    }

    /* access modifiers changed from: private */
    public static final C5487e i1(C5785z zVar, k kVar, ng.f fVar) {
        C5785z zVar2 = zVar;
        k kVar2 = kVar;
        ng.f fVar2 = fVar;
        C6496s.h(fVar2, "name");
        if (((Set) zVar2.f67264r.invoke()).contains(fVar2)) {
            C5687u d10 = kVar.a().d();
            ng.b n10 = C6755e.n(zVar.R());
            C6496s.e(n10);
            C5830g b10 = d10.b(new C5687u.a(n10.d(fVar2), (byte[]) null, zVar2.f67261o, 2, (DefaultConstructorMarker) null));
            if (b10 == null) {
                return null;
            }
            C5773n nVar = new C5773n(kVar, zVar.R(), b10, (C5487e) null, 8, (DefaultConstructorMarker) null);
            kVar.a().e().a(nVar);
            return nVar;
        } else if (((Set) zVar2.f67265s.invoke()).contains(fVar2)) {
            List c10 = C6565s.c();
            kVar.a().w().c(zVar.R(), fVar2, c10, kVar);
            List a10 = C6565s.a(c10);
            int size = a10.size();
            if (size == 0) {
                return null;
            }
            if (size == 1) {
                return (C5487e) C6565s.P0(a10);
            }
            throw new IllegalStateException(("Multiple classes with same name are generated: " + a10).toString());
        } else {
            C5837n nVar2 = (C5837n) ((Map) zVar2.f67266t.invoke()).get(fVar2);
            if (nVar2 == null) {
                return null;
            }
            i g10 = kVar.e().g(new C5784y(zVar));
            return C5528q.L0(kVar.e(), zVar.R(), fVar, g10, ag.h.a(kVar, nVar2), kVar.a().t().a(nVar2));
        }
    }

    /* access modifiers changed from: private */
    public static final Set j1(C5785z zVar) {
        return Y.n(zVar.a(), zVar.d());
    }

    private final g0 k1(g0 g0Var, C6798l lVar, Collection collection) {
        g0 I02;
        C5507z l10 = C5676i.l(g0Var);
        if (l10 == null || (I02 = I0(l10, lVar)) == null) {
            return null;
        }
        if (!f1(I02)) {
            I02 = null;
        }
        if (I02 != null) {
            return H0(I02, l10, collection);
        }
        return null;
    }

    private final g0 l1(g0 g0Var, C6798l lVar, ng.f fVar, Collection collection) {
        g0 g0Var2 = (g0) T.g(g0Var);
        if (g0Var2 == null) {
            return null;
        }
        String e10 = T.e(g0Var2);
        C6496s.e(e10);
        ng.f i10 = ng.f.i(e10);
        C6496s.g(i10, "identifier(...)");
        for (g0 N02 : (Collection) lVar.invoke(i10)) {
            g0 N03 = N0(N02, fVar);
            if (S0(g0Var2, N03)) {
                return H0(N03, g0Var2, collection);
            }
        }
        return null;
    }

    private final g0 m1(g0 g0Var, C6798l lVar) {
        if (!g0Var.isSuspend()) {
            return null;
        }
        ng.f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        for (g0 O02 : (Iterable) lVar.invoke(name)) {
            g0 O03 = O0(O02);
            if (O03 == null || !Q0(O03, g0Var)) {
                O03 = null;
                continue;
            }
            if (O03 != null) {
                return O03;
            }
        }
        return null;
    }

    private final Zf.b o1(C5834k kVar) {
        C5487e c12 = R();
        Zf.b t12 = Zf.b.t1(c12, ag.h.a(L(), kVar), false, L().a().t().a(kVar));
        C6496s.g(t12, "createJavaConstructor(...)");
        k h10 = c.h(L(), t12, kVar, c12.q().size());
        C5754U.b d02 = d0(h10, t12, kVar.k());
        List q10 = c12.q();
        C6496s.g(q10, "getDeclaredTypeParameters(...)");
        Collection collection = q10;
        Iterable<eg.y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C6565s.y(typeParameters, 10));
        for (eg.y a10 : typeParameters) {
            m0 a11 = h10.f().a(a10);
            C6496s.e(a11);
            arrayList.add(a11);
        }
        t12.r1(d02.a(), V.d(kVar.getVisibility()), C6565s.K0(collection, arrayList));
        t12.Y0(false);
        t12.Z0(d02.b());
        t12.g1(c12.p());
        h10.a().h().b(kVar, t12);
        return t12;
    }

    private final e p1(w wVar) {
        w wVar2 = wVar;
        e p12 = e.p1(R(), ag.h.a(L(), wVar2), wVar.getName(), L().a().t().a(wVar2), true);
        C6496s.g(p12, "createJavaMethod(...)");
        e eVar = p12;
        eVar.o1((c0) null, O(), C6565s.n(), C6565s.n(), C6565s.n(), L().g().p(wVar.getType(), C5799b.b(I0.COMMON, false, false, (m0) null, 6, (Object) null)), E.f64444a.a(false, false, true), C5501t.f64509e, (Map) null);
        p12.s1(false, false);
        L().a().h().a(wVar2, p12);
        return p12;
    }

    /* access modifiers changed from: private */
    public final Collection q1(ng.f fVar) {
        Iterable<r> e10 = ((C5762c) N().invoke()).e(fVar);
        ArrayList arrayList = new ArrayList(C6565s.y(e10, 10));
        for (r Z10 : e10) {
            arrayList.add(Z(Z10));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final Collection r1(ng.f fVar) {
        ArrayList arrayList = new ArrayList();
        for (Object next : b1(fVar)) {
            g0 g0Var = (g0) next;
            if (!T.d(g0Var) && C5676i.l(g0Var) == null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private final void s0(List list, C5494l lVar, int i10, r rVar, S s10, S s11) {
        S s12;
        Pf.h b10 = Pf.h.f64602L.b();
        ng.f name = rVar.getName();
        S n10 = J0.n(s10);
        C6496s.g(n10, "makeNotNullable(...)");
        boolean O10 = rVar.O();
        if (s11 != null) {
            s12 = J0.n(s11);
        } else {
            s12 = null;
        }
        List list2 = list;
        list.add(new Rf.V(lVar, (t0) null, i10, b10, name, n10, O10, false, false, s12, L().a().t().a(rVar)));
    }

    private final boolean s1(g0 g0Var) {
        C5676i iVar = C5676i.f66378o;
        ng.f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        if (!iVar.n(name)) {
            return false;
        }
        ng.f name2 = g0Var.getName();
        C6496s.g(name2, "getName(...)");
        ArrayList<C5507z> arrayList = new ArrayList<>();
        for (g0 l10 : b1(name2)) {
            C5507z l11 = C5676i.l(l10);
            if (l11 != null) {
                arrayList.add(l11);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (C5507z e12 : arrayList) {
            if (e1(g0Var, e12)) {
                return true;
            }
        }
        return false;
    }

    private final void t0(Collection collection, ng.f fVar, Collection collection2, boolean z10) {
        Collection d10 = Yf.a.d(fVar, collection2, collection, R(), L().a().c(), L().a().k().a());
        C6496s.g(d10, "resolveOverridesForNonStaticMembers(...)");
        if (!z10) {
            collection.addAll(d10);
            return;
        }
        Iterable<g0> iterable = d10;
        List K02 = C6565s.K0(collection, iterable);
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (g0 g0Var : iterable) {
            g0 g0Var2 = (g0) T.j(g0Var);
            if (g0Var2 == null) {
                C6496s.e(g0Var);
            } else {
                C6496s.e(g0Var);
                g0Var = H0(g0Var, g0Var2, K02);
            }
            arrayList.add(g0Var);
        }
        collection.addAll(arrayList);
    }

    private final void u0(ng.f fVar, Collection collection, Collection collection2, Collection collection3, C6798l lVar) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            Pg.a.a(collection3, l1(g0Var, lVar, fVar, collection));
            Pg.a.a(collection3, k1(g0Var, lVar, collection));
            Pg.a.a(collection3, m1(g0Var, lVar));
        }
    }

    private final void v0(Set set, Collection collection, Set set2, C6798l lVar) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Z z10 = (Z) it.next();
            Zf.f J02 = J0(z10, lVar);
            if (J02 != null) {
                collection.add(J02);
                if (set2 != null) {
                    set2.add(z10);
                    return;
                }
                return;
            }
        }
    }

    private final void w0(ng.f fVar, Collection collection) {
        r rVar = (r) C6565s.Q0(((C5762c) N().invoke()).e(fVar));
        if (rVar != null) {
            collection.add(L0(this, rVar, (S) null, E.FINAL, 2, (Object) null));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean z0(q qVar) {
        C6496s.h(qVar, "it");
        return !qVar.g();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(java.util.Collection r10, ng.f r11) {
        /*
            r9 = this;
            java.lang.String r0 = "result"
            kotlin.jvm.internal.C6496s.h(r10, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r11, r0)
            java.util.Set r6 = r9.b1(r11)
            Xf.U$a r0 = Xf.U.f66327a
            boolean r0 = r0.k(r11)
            if (r0 != 0) goto L_0x006b
            Xf.i r0 = Xf.C5676i.f66378o
            boolean r0 = r0.n(r11)
            if (r0 != 0) goto L_0x006b
            r0 = r6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x002f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.util.Iterator r1 = r0.iterator()
        L_0x0033:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()
            Of.z r2 = (Of.C5507z) r2
            boolean r2 = r2.isSuspend()
            if (r2 == 0) goto L_0x0033
            goto L_0x006b
        L_0x0046:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r0.next()
            r3 = r2
            Of.g0 r3 = (Of.g0) r3
            boolean r3 = r9.f1(r3)
            if (r3 == 0) goto L_0x004f
            r1.add(r2)
            goto L_0x004f
        L_0x0066:
            r0 = 0
            r9.t0(r10, r11, r1, r0)
            return
        L_0x006b:
            Pg.l$b r0 = Pg.l.f64708c
            Pg.l r7 = r0.a()
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.List r0 = mf.C6565s.n()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            Of.e r3 = r9.R()
            Bg.w r4 = Bg.C5336w.f62587a
            ag.k r0 = r9.L()
            ag.d r0 = r0.a()
            Gg.p r0 = r0.k()
            rg.o r5 = r0.a()
            r0 = r11
            java.util.Collection r8 = Yf.a.d(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "resolveOverridesForNonStaticMembers(...)"
            kotlin.jvm.internal.C6496s.g(r8, r0)
            bg.z$a r5 = new bg.z$a
            r5.<init>(r9)
            r0 = r9
            r1 = r11
            r2 = r10
            r3 = r8
            r4 = r10
            r0.u0(r1, r2, r3, r4, r5)
            bg.z$b r5 = new bg.z$b
            r5.<init>(r9)
            r4 = r7
            r0.u0(r1, r2, r3, r4, r5)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L_0x00bc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d3
            java.lang.Object r2 = r1.next()
            r3 = r2
            Of.g0 r3 = (Of.g0) r3
            boolean r3 = r9.f1(r3)
            if (r3 == 0) goto L_0x00bc
            r0.add(r2)
            goto L_0x00bc
        L_0x00d3:
            java.util.List r0 = mf.C6565s.K0(r0, r7)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 1
            r9.t0(r10, r11, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C5785z.B(java.util.Collection, ng.f):void");
    }

    /* access modifiers changed from: protected */
    public void C(ng.f fVar, Collection collection) {
        C6496s.h(fVar, "name");
        C6496s.h(collection, "result");
        if (this.f67261o.p()) {
            w0(fVar, collection);
        }
        Set d12 = d1(fVar);
        if (!d12.isEmpty()) {
            l.b bVar = l.f64708c;
            l a10 = bVar.a();
            l a11 = bVar.a();
            v0(d12, collection, a10, new C5782w(this));
            v0(Y.l(d12, a10), a11, (Set) null, new C5783x(this));
            Collection d10 = Yf.a.d(fVar, Y.n(d12, a11), collection, R(), L().a().c(), L().a().k().a());
            C6496s.g(d10, "resolveOverridesForNonStaticMembers(...)");
            collection.addAll(d10);
        }
    }

    /* access modifiers changed from: protected */
    public Set D(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        if (this.f67261o.p()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((C5762c) N().invoke()).c());
        Collection<S> l10 = R().l().l();
        C6496s.g(l10, "getSupertypes(...)");
        for (S o10 : l10) {
            C6565s.D(linkedHashSet, o10.o().d());
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public c0 O() {
        return C6691i.l(R());
    }

    /* access modifiers changed from: protected */
    public boolean V(e eVar) {
        C6496s.h(eVar, "<this>");
        if (this.f67261o.p()) {
            return false;
        }
        return f1(eVar);
    }

    /* access modifiers changed from: protected */
    public C5754U.a Y(r rVar, List list, S s10, List list2) {
        C6496s.h(rVar, "method");
        C6496s.h(list, "methodTypeParameters");
        C6496s.h(s10, "returnType");
        C6496s.h(list2, "valueParameters");
        o.b a10 = L().a().s().a(rVar, R(), s10, (S) null, list2, list);
        C6496s.g(a10, "resolvePropagatedSignature(...)");
        S d10 = a10.d();
        C6496s.g(d10, "getReturnType(...)");
        S c10 = a10.c();
        List f10 = a10.f();
        C6496s.g(f10, "getValueParameters(...)");
        List e10 = a10.e();
        C6496s.g(e10, "getTypeParameters(...)");
        boolean g10 = a10.g();
        List b10 = a10.b();
        C6496s.g(b10, "getErrors(...)");
        return new C5754U.a(d10, c10, f10, e10, g10, b10);
    }

    public final i a1() {
        return this.f67263q;
    }

    public Collection b(ng.f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        n1(fVar, bVar);
        return super.b(fVar, bVar);
    }

    public Collection c(ng.f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        n1(fVar, bVar);
        return super.c(fVar, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c1 */
    public C5487e R() {
        return this.f67260n;
    }

    public C5490h e(ng.f fVar, Wf.b bVar) {
        h hVar;
        C5487e eVar;
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        n1(fVar, bVar);
        C5785z zVar = (C5785z) Q();
        if (zVar == null || (hVar = zVar.f67267u) == null || (eVar = (C5487e) hVar.invoke(fVar)) == null) {
            return (C5490h) this.f67267u.invoke(fVar);
        }
        return eVar;
    }

    public void n1(ng.f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        Vf.a.a(L().a().l(), bVar, R(), fVar);
    }

    public String toString() {
        return "Lazy Java member scope for " + this.f67261o.f();
    }

    /* access modifiers changed from: protected */
    public Set v(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        return Y.n((Set) this.f67264r.invoke(), ((Map) this.f67266t.invoke()).keySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: x0 */
    public LinkedHashSet x(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        Collection<S> l10 = R().l().l();
        C6496s.g(l10, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (S o10 : l10) {
            C6565s.D(linkedHashSet, o10.o().a());
        }
        linkedHashSet.addAll(((C5762c) N().invoke()).a());
        linkedHashSet.addAll(((C5762c) N().invoke()).b());
        linkedHashSet.addAll(v(dVar, lVar));
        linkedHashSet.addAll(L().a().w().g(R(), L()));
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public void y(Collection collection, ng.f fVar) {
        C6496s.h(collection, "result");
        C6496s.h(fVar, "name");
        if (this.f67261o.r() && ((C5762c) N().invoke()).f(fVar) != null) {
            Iterable iterable = collection;
            if (!((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((g0) it.next()).k().isEmpty()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            w f10 = ((C5762c) N().invoke()).f(fVar);
            C6496s.e(f10);
            collection.add(p1(f10));
        }
        L().a().w().f(R(), fVar, collection, L());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public C5761b z() {
        return new C5761b(this.f67261o, C5780u.f67254a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5785z(k kVar, C5487e eVar, C5830g gVar, boolean z10, C5785z zVar) {
        super(kVar, zVar);
        C6496s.h(kVar, "c");
        C6496s.h(eVar, "ownerDescriptor");
        C6496s.h(gVar, "jClass");
        this.f67260n = eVar;
        this.f67261o = gVar;
        this.f67262p = z10;
        this.f67263q = kVar.e().g(new C5775p(this, kVar));
        this.f67264r = kVar.e().g(new C5776q(this));
        this.f67265s = kVar.e().g(new C5777r(kVar, this));
        this.f67266t = kVar.e().g(new C5778s(this));
        this.f67267u = kVar.e().c(new C5779t(this, kVar));
    }
}
