package Bg;

import Dg.C5340a;
import Dg.S;
import Ff.f;
import Fg.B0;
import Fg.C5366d0;
import Fg.C5374h0;
import Fg.C5376i0;
import Fg.C5380k0;
import Fg.C5397y;
import Fg.D0;
import Fg.N0;
import Fg.V;
import Fg.W;
import Fg.q0;
import Fg.r0;
import Fg.v0;
import Gg.g;
import Hg.k;
import Hg.l;
import Kg.d;
import Lf.i;
import Lf.o;
import Of.C5483a;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Of.C5506y;
import Of.l0;
import Of.m0;
import Pf.h;
import ig.q;
import ig.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kg.C6435b;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.b;
import ng.c;
import vg.C6755e;
import yf.C6798l;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    private final C5330p f62505a;

    /* renamed from: b  reason: collision with root package name */
    private final X f62506b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62507c;

    /* renamed from: d  reason: collision with root package name */
    private final String f62508d;

    /* renamed from: e  reason: collision with root package name */
    private final C6798l f62509e;

    /* renamed from: f  reason: collision with root package name */
    private final C6798l f62510f;

    /* renamed from: g  reason: collision with root package name */
    private final Map f62511g;

    /* synthetic */ class a extends E {

        /* renamed from: b  reason: collision with root package name */
        public static final a f62512b = new a();

        /* synthetic */ a() {
        }

        public Object get(Object obj) {
            return ((b) obj).e();
        }

        public String getName() {
            return "outerClassId";
        }

        public f getOwner() {
            return O.b(b.class);
        }

        public String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }
    }

    public X(C5330p pVar, X x10, List list, String str, String str2) {
        Map map;
        C6496s.h(pVar, "c");
        C6496s.h(list, "typeParameterProtos");
        C6496s.h(str, "debugName");
        C6496s.h(str2, "containerPresentableName");
        this.f62505a = pVar;
        this.f62506b = x10;
        this.f62507c = str;
        this.f62508d = str2;
        this.f62509e = pVar.h().c(new S(this));
        this.f62510f = pVar.h().c(new T(this));
        if (list.isEmpty()) {
            map = mf.O.i();
        } else {
            map = new LinkedHashMap();
            Iterator it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                s sVar = (s) it.next();
                map.put(Integer.valueOf(sVar.M()), new S(this.f62505a, sVar, i10));
                i10++;
            }
        }
        this.f62511g = map;
    }

    /* access modifiers changed from: private */
    public static final int A(q qVar) {
        C6496s.h(qVar, "it");
        return qVar.U();
    }

    /* access modifiers changed from: private */
    public static final C5490h f(X x10, int i10) {
        return x10.g(i10);
    }

    private final C5490h g(int i10) {
        b a10 = L.a(this.f62505a.g(), i10);
        if (a10.i()) {
            return this.f62505a.c().b(a10);
        }
        return C5506y.c(this.f62505a.c().q(), a10);
    }

    private final C5366d0 h(int i10) {
        if (L.a(this.f62505a.g(), i10).i()) {
            return this.f62505a.c().o().a();
        }
        return null;
    }

    private final C5490h i(int i10) {
        b a10 = L.a(this.f62505a.g(), i10);
        if (a10.i()) {
            return null;
        }
        return C5506y.f(this.f62505a.c().q(), a10);
    }

    private final C5366d0 j(Fg.S s10, Fg.S s11) {
        i n10 = d.n(s10);
        h annotations = s10.getAnnotations();
        Fg.S k10 = Lf.h.k(s10);
        List e10 = Lf.h.e(s10);
        Iterable<B0> h02 = C6565s.h0(Lf.h.m(s10), 1);
        ArrayList arrayList = new ArrayList(C6565s.y(h02, 10));
        for (B0 type : h02) {
            arrayList.add(type.getType());
        }
        return Lf.h.b(n10, annotations, k10, e10, arrayList, (List) null, s11, true).U0(s10.O0());
    }

    private final C5366d0 k(r0 r0Var, v0 v0Var, List list, boolean z10) {
        C5366d0 d0Var;
        int size;
        int size2 = v0Var.getParameters().size() - list.size();
        if (size2 != 0) {
            d0Var = null;
            if (size2 == 1 && (size = list.size() - 1) >= 0) {
                v0 l10 = v0Var.m().X(size).l();
                C6496s.g(l10, "getTypeConstructor(...)");
                d0Var = V.k(r0Var, l10, list, z10, (g) null, 16, (Object) null);
            }
        } else {
            d0Var = l(r0Var, v0Var, list, z10);
        }
        if (d0Var == null) {
            return l.f63471a.f(k.INCONSISTENT_SUSPEND_FUNCTION, list, v0Var, new String[0]);
        }
        return d0Var;
    }

    private final C5366d0 l(r0 r0Var, v0 v0Var, List list, boolean z10) {
        C5366d0 k10 = V.k(r0Var, v0Var, list, z10, (g) null, 16, (Object) null);
        if (!Lf.h.q(k10)) {
            return null;
        }
        return t(k10);
    }

    private final m0 n(int i10) {
        m0 m0Var = (m0) this.f62511g.get(Integer.valueOf(i10));
        if (m0Var != null) {
            return m0Var;
        }
        X x10 = this.f62506b;
        if (x10 != null) {
            return x10.n(i10);
        }
        return null;
    }

    private static final List p(q qVar, X x10) {
        List list;
        List V10 = qVar.V();
        C6496s.g(V10, "getArgumentList(...)");
        Collection collection = V10;
        q j10 = kg.f.j(qVar, x10.f62505a.j());
        if (j10 != null) {
            list = p(j10, x10);
        } else {
            list = null;
        }
        if (list == null) {
            list = C6565s.n();
        }
        return C6565s.K0(collection, list);
    }

    public static /* synthetic */ C5366d0 q(X x10, q qVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return x10.o(qVar, z10);
    }

    /* access modifiers changed from: private */
    public static final List r(X x10, q qVar) {
        return x10.f62505a.c().d().j(qVar, x10.f62505a.g());
    }

    private final r0 s(List list, h hVar, v0 v0Var, C5495m mVar) {
        Iterable<q0> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (q0 a10 : iterable) {
            arrayList.add(a10.a(hVar, v0Var, mVar));
        }
        return r0.f63046b.i(C6565s.A(arrayList));
    }

    private final C5366d0 t(Fg.S s10) {
        Fg.S type;
        c cVar;
        C5483a aVar;
        B0 b02 = (B0) C6565s.B0(Lf.h.m(s10));
        c cVar2 = null;
        if (b02 == null || (type = b02.getType()) == null) {
            return null;
        }
        C5490h o10 = type.N0().o();
        if (o10 != null) {
            cVar = C6755e.o(o10);
        } else {
            cVar = null;
        }
        if (type.L0().size() != 1 || (!C6496s.c(cVar, o.f63949v) && !C6496s.c(cVar, Y.f62513a))) {
            return (C5366d0) s10;
        }
        Fg.S type2 = ((B0) C6565s.P0(type.L0())).getType();
        C6496s.g(type2, "getType(...)");
        C5495m e10 = this.f62505a.e();
        if (e10 instanceof C5483a) {
            aVar = (C5483a) e10;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            cVar2 = C6755e.k(aVar);
        }
        if (C6496s.c(cVar2, Q.f62497a)) {
            return j(s10, type2);
        }
        return j(s10, type2);
    }

    /* access modifiers changed from: private */
    public static final C5490h v(X x10, int i10) {
        return x10.i(i10);
    }

    private final B0 w(m0 m0Var, q.b bVar) {
        if (bVar.x() != q.b.c.STAR) {
            O o10 = O.f62485a;
            q.b.c x10 = bVar.x();
            C6496s.g(x10, "getProjection(...)");
            N0 c10 = o10.c(x10);
            q p10 = kg.f.p(bVar, this.f62505a.j());
            if (p10 == null) {
                return new D0(l.d(k.NO_RECORDED_TYPE, bVar.toString()));
            }
            return new D0(c10, u(p10));
        } else if (m0Var == null) {
            return new C5376i0(this.f62505a.c().q().m());
        } else {
            return new C5380k0(m0Var);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: Of.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: Of.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: Of.m0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: Of.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Fg.v0 x(ig.q r4) {
        /*
            r3 = this;
            boolean r0 = r4.m0()
            if (r0 == 0) goto L_0x0022
            yf.l r0 = r3.f62509e
            int r1 = r4.W()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            Of.h r0 = (Of.C5490h) r0
            if (r0 != 0) goto L_0x00c0
            int r0 = r4.W()
            Of.e r0 = y(r3, r4, r0)
            goto L_0x00c0
        L_0x0022:
            boolean r0 = r4.v0()
            if (r0 == 0) goto L_0x0049
            int r0 = r4.i0()
            Of.m0 r0 = r3.n(r0)
            if (r0 != 0) goto L_0x00c0
            Hg.l r0 = Hg.l.f63471a
            Hg.k r1 = Hg.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER
            int r4 = r4.i0()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r2 = r3.f62508d
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            Hg.j r4 = r0.e(r1, r4)
            return r4
        L_0x0049:
            boolean r0 = r4.w0()
            if (r0 == 0) goto L_0x00a0
            Bg.p r0 = r3.f62505a
            kg.c r0 = r0.g()
            int r4 = r4.j0()
            java.lang.String r4 = r0.getString(r4)
            java.util.List r0 = r3.m()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0067:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0083
            java.lang.Object r1 = r0.next()
            r2 = r1
            Of.m0 r2 = (Of.m0) r2
            ng.f r2 = r2.getName()
            java.lang.String r2 = r2.b()
            boolean r2 = kotlin.jvm.internal.C6496s.c(r2, r4)
            if (r2 == 0) goto L_0x0067
            goto L_0x0084
        L_0x0083:
            r1 = 0
        L_0x0084:
            r0 = r1
            Of.m0 r0 = (Of.m0) r0
            if (r0 != 0) goto L_0x00c0
            Hg.l r0 = Hg.l.f63471a
            Hg.k r1 = Hg.k.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME
            Bg.p r2 = r3.f62505a
            Of.m r2 = r2.e()
            java.lang.String r2 = r2.toString()
            java.lang.String[] r4 = new java.lang.String[]{r4, r2}
            Hg.j r4 = r0.e(r1, r4)
            return r4
        L_0x00a0:
            boolean r0 = r4.u0()
            if (r0 == 0) goto L_0x00ca
            yf.l r0 = r3.f62510f
            int r1 = r4.g0()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.invoke(r1)
            Of.h r0 = (Of.C5490h) r0
            if (r0 != 0) goto L_0x00c0
            int r0 = r4.g0()
            Of.e r0 = y(r3, r4, r0)
        L_0x00c0:
            Fg.v0 r4 = r0.l()
            java.lang.String r0 = "getTypeConstructor(...)"
            kotlin.jvm.internal.C6496s.g(r4, r0)
            return r4
        L_0x00ca:
            Hg.l r4 = Hg.l.f63471a
            Hg.k r0 = Hg.k.UNKNOWN_TYPE
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            Hg.j r4 = r4.e(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Bg.X.x(ig.q):Fg.v0");
    }

    private static final C5487e y(X x10, q qVar, int i10) {
        b a10 = L.a(x10.f62505a.g(), i10);
        List H10 = Rg.k.H(Rg.k.x(Rg.k.h(qVar, new V(x10)), W.f62504a));
        int m10 = Rg.k.m(Rg.k.h(a10, a.f62512b));
        while (H10.size() < m10) {
            H10.add(0);
        }
        return x10.f62505a.c().r().d(a10, H10);
    }

    /* access modifiers changed from: private */
    public static final q z(X x10, q qVar) {
        C6496s.h(qVar, "it");
        return kg.f.j(qVar, x10.f62505a.j());
    }

    public final List m() {
        return C6565s.e1(this.f62511g.values());
    }

    public final C5366d0 o(q qVar, boolean z10) {
        C5366d0 d0Var;
        C5366d0 d0Var2;
        C5366d0 j10;
        boolean z11;
        q qVar2 = qVar;
        C6496s.h(qVar2, "proto");
        if (qVar.m0()) {
            d0Var = h(qVar.W());
        } else if (qVar.u0()) {
            d0Var = h(qVar.g0());
        } else {
            d0Var = null;
        }
        if (d0Var != null) {
            return d0Var;
        }
        v0 x10 = x(qVar);
        if (l.m(x10.o())) {
            return l.f63471a.c(k.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, x10, x10.toString());
        }
        C5340a aVar = new C5340a(this.f62505a.h(), new U(this, qVar2));
        r0 s10 = s(this.f62505a.c().v(), aVar, x10, this.f62505a.e());
        Iterable p10 = p(qVar2, this);
        ArrayList arrayList = new ArrayList(C6565s.y(p10, 10));
        int i10 = 0;
        for (Object next : p10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C6565s.x();
            }
            List parameters = x10.getParameters();
            C6496s.g(parameters, "getParameters(...)");
            arrayList.add(w((m0) C6565s.r0(parameters, i10), (q.b) next));
            i10 = i11;
        }
        List e12 = C6565s.e1(arrayList);
        C5490h o10 = x10.o();
        if (z10 && (o10 instanceof l0)) {
            C5366d0 c10 = V.c((l0) o10, e12);
            r0 s11 = s(this.f62505a.c().v(), h.f64602L.a(C6565s.I0(aVar, c10.getAnnotations())), x10, this.f62505a.e());
            if (W.b(c10) || qVar.d0()) {
                z11 = true;
            } else {
                z11 = false;
            }
            d0Var2 = c10.U0(z11).V0(s11);
        } else if (C6435b.f71542a.d(qVar.Z()).booleanValue()) {
            d0Var2 = k(s10, x10, e12, qVar.d0());
        } else {
            d0Var2 = V.k(s10, x10, e12, qVar.d0(), (g) null, 16, (Object) null);
            if (C6435b.f71543b.d(qVar.Z()).booleanValue()) {
                C5397y c11 = C5397y.a.c(C5397y.f63080d, d0Var2, true, false, 4, (Object) null);
                if (c11 != null) {
                    d0Var2 = c11;
                } else {
                    throw new IllegalStateException(("null DefinitelyNotNullType for '" + d0Var2 + '\'').toString());
                }
            }
        }
        q a10 = kg.f.a(qVar2, this.f62505a.j());
        if (a10 == null || (j10 = C5374h0.j(d0Var2, o(a10, false))) == null) {
            return d0Var2;
        }
        return j10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f62507c);
        if (this.f62506b == null) {
            str = "";
        } else {
            str = ". Child of " + this.f62506b.f62507c;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final Fg.S u(q qVar) {
        C6496s.h(qVar, "proto");
        if (!qVar.o0()) {
            return o(qVar, true);
        }
        String string = this.f62505a.g().getString(qVar.a0());
        C5366d0 q10 = q(this, qVar, false, 2, (Object) null);
        q f10 = kg.f.f(qVar, this.f62505a.j());
        C6496s.e(f10);
        return this.f62505a.c().m().a(qVar, string, q10, q(this, f10, false, 2, (Object) null));
    }
}
