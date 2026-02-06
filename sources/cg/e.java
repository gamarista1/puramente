package cg;

import Fg.A0;
import Fg.B0;
import Fg.C5366d0;
import Fg.D0;
import Fg.I0;
import Fg.J0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.Y;
import Fg.r0;
import Fg.s0;
import Fg.v0;
import Fg.x0;
import Hg.i;
import Hg.l;
import Nf.d;
import Of.C5487e;
import Of.C5490h;
import Of.m0;
import Pf.h;
import Pf.o;
import ag.g;
import ag.k;
import ag.p;
import eg.C5820A;
import eg.C5822C;
import eg.C5829f;
import eg.C5830g;
import eg.C5832i;
import eg.C5833j;
import eg.v;
import eg.x;
import eg.y;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import ng.b;
import ng.c;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final k f67342a;

    /* renamed from: b  reason: collision with root package name */
    private final p f67343b;

    /* renamed from: c  reason: collision with root package name */
    private final g f67344c;

    /* renamed from: d  reason: collision with root package name */
    private final A0 f67345d;

    public e(k kVar, p pVar) {
        C6496s.h(kVar, "c");
        C6496s.h(pVar, "typeParameterResolver");
        this.f67342a = kVar;
        this.f67343b = pVar;
        g gVar = new g();
        this.f67344c = gVar;
        this.f67345d = new A0(gVar, (x0) null, 2, (DefaultConstructorMarker) null);
    }

    private final boolean b(C5833j jVar, C5487e eVar) {
        N0 n10;
        if (!C5820A.a((x) C6565s.B0(jVar.A()))) {
            return false;
        }
        List parameters = d.f64275a.b(eVar).l().getParameters();
        C6496s.g(parameters, "getParameters(...)");
        m0 m0Var = (m0) C6565s.B0(parameters);
        if (m0Var == null || (n10 = m0Var.n()) == null || n10 == N0.OUT_VARIANCE) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if (r0.isEmpty() == false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List c(eg.C5833j r10, cg.C5798a r11, Fg.v0 r12) {
        /*
            r9 = this;
            boolean r0 = r10.u()
            java.lang.String r1 = "getParameters(...)"
            if (r0 != 0) goto L_0x0024
            java.util.List r0 = r10.A()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0022
            java.util.List r0 = r12.getParameters()
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            java.util.List r2 = r12.getParameters()
            kotlin.jvm.internal.C6496s.g(r2, r1)
            if (r0 == 0) goto L_0x0033
            java.util.List r10 = r9.d(r10, r2, r12, r11)
            return r10
        L_0x0033:
            int r11 = r2.size()
            java.util.List r12 = r10.A()
            int r12 = r12.size()
            r0 = 10
            if (r11 == r12) goto L_0x007e
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = mf.C6565s.y(r2, r0)
            r10.<init>(r11)
            java.util.Iterator r11 = r2.iterator()
        L_0x0052:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0079
            java.lang.Object r12 = r11.next()
            Of.m0 r12 = (Of.m0) r12
            Fg.D0 r0 = new Fg.D0
            Hg.k r1 = Hg.k.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER
            ng.f r12 = r12.getName()
            java.lang.String r12 = r12.b()
            java.lang.String[] r12 = new java.lang.String[]{r12}
            Hg.i r12 = Hg.l.d(r1, r12)
            r0.<init>(r12)
            r10.add(r0)
            goto L_0x0052
        L_0x0079:
            java.util.List r10 = mf.C6565s.e1(r10)
            return r10
        L_0x007e:
            java.util.List r10 = r10.A()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Iterable r10 = mf.C6565s.m1(r10)
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = mf.C6565s.y(r10, r0)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00ca
            java.lang.Object r12 = r10.next()
            mf.I r12 = (mf.I) r12
            int r0 = r12.a()
            java.lang.Object r12 = r12.b()
            eg.x r12 = (eg.x) r12
            r2.size()
            java.lang.Object r0 = r2.get(r0)
            Of.m0 r0 = (Of.m0) r0
            Fg.I0 r3 = Fg.I0.COMMON
            r7 = 7
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            cg.a r1 = cg.C5799b.b(r3, r4, r5, r6, r7, r8)
            kotlin.jvm.internal.C6496s.e(r0)
            Fg.B0 r12 = r9.q(r12, r1, r0)
            r11.add(r12)
            goto L_0x0095
        L_0x00ca:
            java.util.List r10 = mf.C6565s.e1(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cg.e.c(eg.j, cg.a, Fg.v0):java.util.List");
    }

    private final List d(C5833j jVar, List list, v0 v0Var, C5798a aVar) {
        B0 b02;
        Iterable<m0> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (m0 m0Var : iterable) {
            if (Kg.d.q(m0Var, (v0) null, aVar.c())) {
                b02 = J0.t(m0Var, aVar);
            } else {
                b02 = this.f67344c.a(m0Var, aVar.j(jVar.u()), this.f67345d, new Y(this.f67342a.e(), new C5801d(this, m0Var, aVar, v0Var, jVar)));
            }
            arrayList.add(b02);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final S e(e eVar, m0 m0Var, C5798a aVar, v0 v0Var, C5833j jVar) {
        C5366d0 d0Var;
        A0 a02 = eVar.f67345d;
        C5490h o10 = v0Var.o();
        if (o10 != null) {
            d0Var = o10.p();
        } else {
            d0Var = null;
        }
        return a02.e(m0Var, aVar.k(d0Var).j(jVar.u()));
    }

    private final C5366d0 f(C5833j jVar, C5798a aVar, C5366d0 d0Var) {
        r0 b10;
        if (d0Var == null || (b10 = d0Var.M0()) == null) {
            b10 = s0.b(new g(this.f67342a, jVar, false, 4, (DefaultConstructorMarker) null));
        }
        r0 r0Var = b10;
        v0 g10 = g(jVar, aVar);
        v0 v0Var = null;
        if (g10 == null) {
            return null;
        }
        boolean j10 = j(aVar);
        if (d0Var != null) {
            v0Var = d0Var.N0();
        }
        if (!C6496s.c(v0Var, g10) || jVar.u() || !j10) {
            return V.k(r0Var, g10, c(jVar, aVar, g10), j10, (Gg.g) null, 16, (Object) null);
        }
        return d0Var.U0(true);
    }

    private final v0 g(C5833j jVar, C5798a aVar) {
        v0 l10;
        C5832i b10 = jVar.b();
        if (b10 == null) {
            return h(jVar);
        }
        if (b10 instanceof C5830g) {
            C5830g gVar = (C5830g) b10;
            c f10 = gVar.f();
            if (f10 != null) {
                C5487e k10 = k(jVar, aVar, f10);
                if (k10 == null) {
                    k10 = this.f67342a.a().n().a(gVar);
                }
                if (k10 == null || (l10 = k10.l()) == null) {
                    return h(jVar);
                }
                return l10;
            }
            throw new AssertionError("Class type should have a FQ name: " + b10);
        } else if (b10 instanceof y) {
            m0 a10 = this.f67343b.a((y) b10);
            if (a10 != null) {
                return a10.l();
            }
            return null;
        } else {
            throw new IllegalStateException("Unknown classifier kind: " + b10);
        }
    }

    private final v0 h(C5833j jVar) {
        v0 l10 = this.f67342a.a().b().f().r().d(b.f72283d.c(new c(jVar.I())), C6565s.e(0)).l();
        C6496s.g(l10, "getTypeConstructor(...)");
        return l10;
    }

    private final boolean i(N0 n02, m0 m0Var) {
        if (m0Var.n() == N0.INVARIANT || n02 == m0Var.n()) {
            return false;
        }
        return true;
    }

    private final boolean j(C5798a aVar) {
        if (aVar.g() == C5800c.FLEXIBLE_LOWER_BOUND || aVar.h() || aVar.b() == I0.SUPERTYPE) {
            return false;
        }
        return true;
    }

    private final C5487e k(C5833j jVar, C5798a aVar, c cVar) {
        if (aVar.h() && C6496s.c(cVar, f.f67346a)) {
            return this.f67342a.a().p().d();
        }
        d dVar = d.f64275a;
        C5487e f10 = d.f(dVar, cVar, this.f67342a.d().m(), (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return null;
        }
        if (!dVar.d(f10) || (aVar.g() != C5800c.FLEXIBLE_LOWER_BOUND && aVar.b() != I0.SUPERTYPE && !b(jVar, f10))) {
            return f10;
        }
        return dVar.b(f10);
    }

    public static /* synthetic */ S m(e eVar, C5829f fVar, C5798a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return eVar.l(fVar, aVar, z10);
    }

    private final S n(C5833j jVar, C5798a aVar) {
        boolean z10;
        if (aVar.h() || aVar.b() == I0.SUPERTYPE) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean u10 = jVar.u();
        if (u10 || z10) {
            C5366d0 f10 = f(jVar, aVar.l(C5800c.FLEXIBLE_LOWER_BOUND), (C5366d0) null);
            if (f10 == null) {
                return o(jVar);
            }
            C5366d0 f11 = f(jVar, aVar.l(C5800c.FLEXIBLE_UPPER_BOUND), f10);
            if (f11 == null) {
                return o(jVar);
            }
            if (u10) {
                return new k(f10, f11);
            }
            return V.e(f10, f11);
        }
        C5366d0 f12 = f(jVar, aVar, (C5366d0) null);
        if (f12 != null) {
            return f12;
        }
        return o(jVar);
    }

    private static final i o(C5833j jVar) {
        return l.d(Hg.k.UNRESOLVED_JAVA_CLASS, jVar.F());
    }

    private final B0 q(x xVar, C5798a aVar, m0 m0Var) {
        N0 n02;
        if (!(xVar instanceof C5822C)) {
            return new D0(N0.INVARIANT, p(xVar, aVar));
        }
        C5822C c10 = (C5822C) xVar;
        x x10 = c10.x();
        if (c10.N()) {
            n02 = N0.OUT_VARIANCE;
        } else {
            n02 = N0.IN_VARIANCE;
        }
        if (x10 == null || i(n02, m0Var)) {
            B0 t10 = J0.t(m0Var, aVar);
            C6496s.g(t10, "makeStarProjection(...)");
            return t10;
        }
        Pf.c a10 = Xf.V.a(this.f67342a, c10);
        S p10 = p(x10, C5799b.b(I0.COMMON, false, false, (m0) null, 7, (Object) null));
        if (a10 != null) {
            p10 = Kg.d.C(p10, h.f64602L.a(C6565s.J0(p10.getAnnotations(), a10)));
        }
        return Kg.d.k(p10, n02, m0Var);
    }

    public final S l(C5829f fVar, C5798a aVar, boolean z10) {
        v vVar;
        N0 n02;
        C6496s.h(fVar, "arrayType");
        C6496s.h(aVar, "attr");
        x o10 = fVar.o();
        Lf.l lVar = null;
        if (o10 instanceof v) {
            vVar = (v) o10;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            lVar = vVar.getType();
        }
        g gVar = new g(this.f67342a, fVar, true);
        if (lVar != null) {
            C5366d0 O10 = this.f67342a.d().m().O(lVar);
            C6496s.e(O10);
            S C10 = Kg.d.C(O10, new o(O10.getAnnotations(), gVar));
            C6496s.f(C10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            C5366d0 d0Var = (C5366d0) C10;
            if (aVar.h()) {
                return d0Var;
            }
            return V.e(d0Var, d0Var.U0(true));
        }
        S p10 = p(o10, C5799b.b(I0.COMMON, aVar.h(), false, (m0) null, 6, (Object) null));
        if (aVar.h()) {
            if (z10) {
                n02 = N0.OUT_VARIANCE;
            } else {
                n02 = N0.INVARIANT;
            }
            C5366d0 m10 = this.f67342a.d().m().m(n02, p10, gVar);
            C6496s.g(m10, "getArrayType(...)");
            return m10;
        }
        C5366d0 m11 = this.f67342a.d().m().m(N0.INVARIANT, p10, gVar);
        C6496s.g(m11, "getArrayType(...)");
        return V.e(m11, this.f67342a.d().m().m(N0.OUT_VARIANCE, p10, gVar).U0(true));
    }

    public final S p(x xVar, C5798a aVar) {
        S p10;
        C5366d0 d0Var;
        C6496s.h(aVar, "attr");
        if (xVar instanceof v) {
            Lf.l type = ((v) xVar).getType();
            if (type != null) {
                d0Var = this.f67342a.d().m().R(type);
            } else {
                d0Var = this.f67342a.d().m().Z();
            }
            C6496s.e(d0Var);
            return d0Var;
        } else if (xVar instanceof C5833j) {
            return n((C5833j) xVar, aVar);
        } else {
            if (xVar instanceof C5829f) {
                return m(this, (C5829f) xVar, aVar, false, 4, (Object) null);
            } else if (xVar instanceof C5822C) {
                x x10 = ((C5822C) xVar).x();
                if (x10 != null && (p10 = p(x10, aVar)) != null) {
                    return p10;
                }
                C5366d0 y10 = this.f67342a.d().m().y();
                C6496s.g(y10, "getDefaultBound(...)");
                return y10;
            } else if (xVar == null) {
                C5366d0 y11 = this.f67342a.d().m().y();
                C6496s.g(y11, "getDefaultBound(...)");
                return y11;
            } else {
                throw new UnsupportedOperationException("Unsupported type: " + xVar);
            }
        }
    }
}
