package bg;

import Eg.g;
import Eg.h;
import Eg.i;
import Eg.j;
import Eg.m;
import Ff.l;
import Fg.I0;
import Fg.J0;
import Fg.S;
import Of.C5483a;
import Of.C5495m;
import Of.C5502u;
import Of.E;
import Of.Z;
import Of.c0;
import Of.g0;
import Of.m0;
import Rf.K;
import Wf.d;
import Xf.V;
import Zf.e;
import Zf.f;
import ag.c;
import ag.k;
import cg.C5799b;
import dg.C5815a;
import eg.C5837n;
import eg.r;
import eg.y;
import gg.C5943C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import lf.C6502A;
import mf.C6565s;
import rg.C6690h;
import rg.C6691i;
import rg.C6700r;
import yf.C6798l;
import yg.C6804c;
import yg.C6805d;
import yg.C6812k;
import yg.C6813l;

/* renamed from: bg.U  reason: case insensitive filesystem */
public abstract class C5754U extends C6813l {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ l[] f67164m;

    /* renamed from: b  reason: collision with root package name */
    private final k f67165b;

    /* renamed from: c  reason: collision with root package name */
    private final C5754U f67166c;

    /* renamed from: d  reason: collision with root package name */
    private final i f67167d;

    /* renamed from: e  reason: collision with root package name */
    private final i f67168e;

    /* renamed from: f  reason: collision with root package name */
    private final g f67169f;

    /* renamed from: g  reason: collision with root package name */
    private final h f67170g;

    /* renamed from: h  reason: collision with root package name */
    private final g f67171h;

    /* renamed from: i  reason: collision with root package name */
    private final i f67172i;

    /* renamed from: j  reason: collision with root package name */
    private final i f67173j;

    /* renamed from: k  reason: collision with root package name */
    private final i f67174k;

    /* renamed from: l  reason: collision with root package name */
    private final g f67175l;

    /* renamed from: bg.U$a */
    protected static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final S f67176a;

        /* renamed from: b  reason: collision with root package name */
        private final S f67177b;

        /* renamed from: c  reason: collision with root package name */
        private final List f67178c;

        /* renamed from: d  reason: collision with root package name */
        private final List f67179d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f67180e;

        /* renamed from: f  reason: collision with root package name */
        private final List f67181f;

        public a(S s10, S s11, List list, List list2, boolean z10, List list3) {
            C6496s.h(s10, "returnType");
            C6496s.h(list, "valueParameters");
            C6496s.h(list2, "typeParameters");
            C6496s.h(list3, "errors");
            this.f67176a = s10;
            this.f67177b = s11;
            this.f67178c = list;
            this.f67179d = list2;
            this.f67180e = z10;
            this.f67181f = list3;
        }

        public final List a() {
            return this.f67181f;
        }

        public final boolean b() {
            return this.f67180e;
        }

        public final S c() {
            return this.f67177b;
        }

        public final S d() {
            return this.f67176a;
        }

        public final List e() {
            return this.f67179d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (C6496s.c(this.f67176a, aVar.f67176a) && C6496s.c(this.f67177b, aVar.f67177b) && C6496s.c(this.f67178c, aVar.f67178c) && C6496s.c(this.f67179d, aVar.f67179d) && this.f67180e == aVar.f67180e && C6496s.c(this.f67181f, aVar.f67181f)) {
                return true;
            }
            return false;
        }

        public final List f() {
            return this.f67178c;
        }

        public int hashCode() {
            int i10;
            int hashCode = this.f67176a.hashCode() * 31;
            S s10 = this.f67177b;
            if (s10 == null) {
                i10 = 0;
            } else {
                i10 = s10.hashCode();
            }
            return ((((((((hashCode + i10) * 31) + this.f67178c.hashCode()) * 31) + this.f67179d.hashCode()) * 31) + Boolean.hashCode(this.f67180e)) * 31) + this.f67181f.hashCode();
        }

        public String toString() {
            return "MethodSignatureData(returnType=" + this.f67176a + ", receiverType=" + this.f67177b + ", valueParameters=" + this.f67178c + ", typeParameters=" + this.f67179d + ", hasStableParameterNames=" + this.f67180e + ", errors=" + this.f67181f + ')';
        }
    }

    /* renamed from: bg.U$b */
    protected static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final List f67182a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f67183b;

        public b(List list, boolean z10) {
            C6496s.h(list, "descriptors");
            this.f67182a = list;
            this.f67183b = z10;
        }

        public final List a() {
            return this.f67182a;
        }

        public final boolean b() {
            return this.f67183b;
        }
    }

    static {
        Class<C5754U> cls = C5754U.class;
        f67164m = new l[]{O.i(new F(O.b(cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), O.i(new F(O.b(cls), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), O.i(new F(O.b(cls), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5754U(k kVar, C5754U u10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, (i10 & 2) != 0 ? null : u10);
    }

    private final K E(C5837n nVar) {
        f f12 = f.f1(R(), ag.h.a(this.f67165b, nVar), E.FINAL, V.d(nVar.getVisibility()), !nVar.isFinal(), nVar.getName(), this.f67165b.a().t().a(nVar), U(nVar));
        C6496s.g(f12, "create(...)");
        return f12;
    }

    /* access modifiers changed from: private */
    public static final Z F(C5754U u10, ng.f fVar) {
        C6496s.h(fVar, "name");
        C5754U u11 = u10.f67166c;
        if (u11 != null) {
            return (Z) u11.f67170g.invoke(fVar);
        }
        C5837n d10 = ((C5762c) u10.f67168e.invoke()).d(fVar);
        if (d10 == null || d10.K()) {
            return null;
        }
        return u10.a0(d10);
    }

    /* access modifiers changed from: private */
    public static final Collection G(C5754U u10, ng.f fVar) {
        C6496s.h(fVar, "name");
        C5754U u11 = u10.f67166c;
        if (u11 != null) {
            return (Collection) u11.f67169f.invoke(fVar);
        }
        ArrayList arrayList = new ArrayList();
        for (r rVar : ((C5762c) u10.f67168e.invoke()).e(fVar)) {
            e Z10 = u10.Z(rVar);
            if (u10.V(Z10)) {
                u10.f67165b.a().h().a(rVar, Z10);
                arrayList.add(Z10);
            }
        }
        u10.y(arrayList, fVar);
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final C5762c H(C5754U u10) {
        return u10.z();
    }

    /* access modifiers changed from: private */
    public static final Set I(C5754U u10) {
        return u10.x(C6805d.f73927v, (C6798l) null);
    }

    /* access modifiers changed from: private */
    public static final Collection J(C5754U u10, ng.f fVar) {
        C6496s.h(fVar, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) u10.f67169f.invoke(fVar));
        u10.e0(linkedHashSet);
        u10.B(linkedHashSet, fVar);
        return C6565s.e1(u10.f67165b.a().r().p(u10.f67165b, linkedHashSet));
    }

    private final Set M() {
        return (Set) m.a(this.f67174k, this, f67164m[2]);
    }

    private final Set P() {
        return (Set) m.a(this.f67172i, this, f67164m[0]);
    }

    private final Set S() {
        return (Set) m.a(this.f67173j, this, f67164m[1]);
    }

    private final S T(C5837n nVar) {
        S p10 = this.f67165b.g().p(nVar.getType(), C5799b.b(I0.COMMON, false, false, (m0) null, 7, (Object) null));
        if ((!Lf.i.s0(p10) && !Lf.i.v0(p10)) || !U(nVar) || !nVar.P()) {
            return p10;
        }
        S n10 = J0.n(p10);
        C6496s.g(n10, "makeNotNullable(...)");
        return n10;
    }

    private final boolean U(C5837n nVar) {
        if (!nVar.isFinal() || !nVar.g()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final List W(C5754U u10, ng.f fVar) {
        C6496s.h(fVar, "name");
        ArrayList arrayList = new ArrayList();
        Pg.a.a(arrayList, u10.f67170g.invoke(fVar));
        u10.C(fVar, arrayList);
        if (C6691i.t(u10.R())) {
            return C6565s.e1(arrayList);
        }
        return C6565s.e1(u10.f67165b.a().r().p(u10.f67165b, arrayList));
    }

    /* access modifiers changed from: private */
    public static final Set X(C5754U u10) {
        return u10.D(C6805d.f73928w, (C6798l) null);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [Of.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Of.Z a0(eg.C5837n r10) {
        /*
            r9 = this;
            kotlin.jvm.internal.N r0 = new kotlin.jvm.internal.N
            r0.<init>()
            Rf.K r1 = r9.E(r10)
            r0.f71759a = r1
            r2 = 0
            r1.V0(r2, r2, r2, r2)
            Fg.S r4 = r9.T(r10)
            java.lang.Object r1 = r0.f71759a
            r3 = r1
            Rf.K r3 = (Rf.K) r3
            java.util.List r5 = mf.C6565s.n()
            Of.c0 r6 = r9.O()
            r7 = 0
            java.util.List r8 = mf.C6565s.n()
            r3.b1(r4, r5, r6, r7, r8)
            Of.m r1 = r9.R()
            boolean r3 = r1 instanceof Of.C5487e
            if (r3 == 0) goto L_0x0033
            r2 = r1
            Of.e r2 = (Of.C5487e) r2
        L_0x0033:
            if (r2 == 0) goto L_0x004b
            ag.k r1 = r9.f67165b
            ag.d r1 = r1.a()
            wg.f r1 = r1.w()
            java.lang.Object r3 = r0.f71759a
            Rf.K r3 = (Rf.K) r3
            ag.k r4 = r9.f67165b
            Rf.K r1 = r1.e(r2, r3, r4)
            r0.f71759a = r1
        L_0x004b:
            java.lang.Object r1 = r0.f71759a
            r2 = r1
            Of.u0 r2 = (Of.u0) r2
            Rf.K r1 = (Rf.K) r1
            Fg.S r1 = r1.getType()
            boolean r1 = rg.C6691i.K(r2, r1)
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.f71759a
            Rf.K r1 = (Rf.K) r1
            bg.I r2 = new bg.I
            r2.<init>(r9, r10, r0)
            r1.L0(r2)
        L_0x0068:
            ag.k r1 = r9.f67165b
            ag.d r1 = r1.a()
            Yf.j r1 = r1.h()
            java.lang.Object r2 = r0.f71759a
            Of.Z r2 = (Of.Z) r2
            r1.c(r10, r2)
            java.lang.Object r10 = r0.f71759a
            Of.Z r10 = (Of.Z) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C5754U.a0(eg.n):Of.Z");
    }

    /* access modifiers changed from: private */
    public static final j b0(C5754U u10, C5837n nVar, N n10) {
        return u10.f67165b.e().d(new C5744J(u10, nVar, n10));
    }

    /* access modifiers changed from: private */
    public static final tg.g c0(C5754U u10, C5837n nVar, N n10) {
        return u10.f67165b.a().g().a(nVar, (Z) n10.f71759a);
    }

    private final void e0(Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : set) {
            String c10 = C5943C.c((g0) next, false, false, 2, (Object) null);
            Object obj = linkedHashMap.get(c10);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c10, obj);
            }
            ((List) obj).add(next);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection collection = list;
                Collection b10 = C6700r.b(collection, C5753T.f67163a);
                set.removeAll(collection);
                set.addAll(b10);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C5483a f0(g0 g0Var) {
        C6496s.h(g0Var, "$this$selectMostSpecificInEachOverridableGroup");
        return g0Var;
    }

    /* access modifiers changed from: private */
    public static final Collection t(C5754U u10) {
        return u10.w(C6805d.f73920o, C6812k.f73946a.c());
    }

    /* access modifiers changed from: private */
    public static final Set u(C5754U u10) {
        return u10.v(C6805d.f73925t, (C6798l) null);
    }

    /* access modifiers changed from: protected */
    public final S A(r rVar, k kVar) {
        C6496s.h(rVar, "method");
        C6496s.h(kVar, "c");
        return kVar.g().p(rVar.getReturnType(), C5799b.b(I0.COMMON, rVar.Q().p(), false, (m0) null, 6, (Object) null));
    }

    /* access modifiers changed from: protected */
    public abstract void B(Collection collection, ng.f fVar);

    /* access modifiers changed from: protected */
    public abstract void C(ng.f fVar, Collection collection);

    /* access modifiers changed from: protected */
    public abstract Set D(C6805d dVar, C6798l lVar);

    /* access modifiers changed from: protected */
    public final i K() {
        return this.f67167d;
    }

    /* access modifiers changed from: protected */
    public final k L() {
        return this.f67165b;
    }

    /* access modifiers changed from: protected */
    public final i N() {
        return this.f67168e;
    }

    /* access modifiers changed from: protected */
    public abstract c0 O();

    /* access modifiers changed from: protected */
    public final C5754U Q() {
        return this.f67166c;
    }

    /* access modifiers changed from: protected */
    public abstract C5495m R();

    /* access modifiers changed from: protected */
    public boolean V(e eVar) {
        C6496s.h(eVar, "<this>");
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract a Y(r rVar, List list, S s10, List list2);

    /* access modifiers changed from: protected */
    public final e Z(r rVar) {
        boolean z10;
        c0 c0Var;
        Map i10;
        r rVar2 = rVar;
        C6496s.h(rVar2, "method");
        Pf.h a10 = ag.h.a(this.f67165b, rVar2);
        C5495m R10 = R();
        ng.f name = rVar.getName();
        C5815a a11 = this.f67165b.a().t().a(rVar2);
        if (((C5762c) this.f67168e.invoke()).f(rVar.getName()) == null || !rVar.k().isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        e p12 = e.p1(R10, a10, name, a11, z10);
        C6496s.g(p12, "createJavaMethod(...)");
        k i11 = c.i(this.f67165b, p12, rVar, 0, 4, (Object) null);
        Iterable<y> typeParameters = rVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(C6565s.y(typeParameters, 10));
        for (y a12 : typeParameters) {
            m0 a13 = i11.f().a(a12);
            C6496s.e(a13);
            arrayList.add(a13);
        }
        b d02 = d0(i11, p12, rVar.k());
        a Y10 = Y(rVar2, arrayList, A(rVar2, i11), d02.a());
        S c10 = Y10.c();
        if (c10 != null) {
            c0Var = C6690h.i(p12, c10, Pf.h.f64602L.b());
        } else {
            c0Var = null;
        }
        c0 c0Var2 = c0Var;
        c0 O10 = O();
        List n10 = C6565s.n();
        List e10 = Y10.e();
        List f10 = Y10.f();
        S d10 = Y10.d();
        E a14 = E.f64444a.a(false, rVar.isAbstract(), true ^ rVar.isFinal());
        C5502u d11 = V.d(rVar.getVisibility());
        if (Y10.c() != null) {
            i10 = mf.O.f(C6502A.a(e.f66931G, C6565s.o0(d02.a())));
        } else {
            i10 = mf.O.i();
        }
        Map map = i10;
        e eVar = p12;
        p12.o1(c0Var2, O10, n10, e10, f10, d10, a14, d11, map);
        eVar.s1(Y10.b(), d02.b());
        if (!Y10.a().isEmpty()) {
            i11.a().s().b(eVar, Y10.a());
        }
        return eVar;
    }

    public Set a() {
        return P();
    }

    public Collection b(ng.f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        if (!d().contains(fVar)) {
            return C6565s.n();
        }
        return (Collection) this.f67175l.invoke(fVar);
    }

    public Collection c(ng.f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        if (!a().contains(fVar)) {
            return C6565s.n();
        }
        return (Collection) this.f67171h.invoke(fVar);
    }

    public Set d() {
        return S();
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [eg.x] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final bg.C5754U.b d0(ag.k r21, Of.C5507z r22, java.util.List r23) {
        /*
            r20 = this;
            r0 = r21
            r1 = r23
            java.lang.String r2 = "c"
            kotlin.jvm.internal.C6496s.h(r0, r2)
            java.lang.String r2 = "function"
            r15 = r22
            kotlin.jvm.internal.C6496s.h(r15, r2)
            java.lang.String r2 = "jValueParameters"
            kotlin.jvm.internal.C6496s.h(r1, r2)
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Iterable r2 = mf.C6565s.m1(r2)
            java.util.ArrayList r14 = new java.util.ArrayList
            r3 = 10
            int r3 = mf.C6565s.y(r2, r3)
            r14.<init>(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x002c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0139
            java.lang.Object r4 = r2.next()
            mf.I r4 = (mf.I) r4
            int r6 = r4.a()
            java.lang.Object r4 = r4.b()
            eg.B r4 = (eg.C5821B) r4
            Pf.h r7 = ag.h.a(r0, r4)
            Fg.I0 r8 = Fg.I0.COMMON
            r12 = 7
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            cg.a r5 = cg.C5799b.b(r8, r9, r10, r11, r12, r13)
            boolean r8 = r4.m()
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0096
            eg.x r8 = r4.getType()
            boolean r11 = r8 instanceof eg.C5829f
            if (r11 == 0) goto L_0x0064
            r9 = r8
            eg.f r9 = (eg.C5829f) r9
        L_0x0064:
            if (r9 == 0) goto L_0x007f
            cg.e r8 = r21.g()
            Fg.S r5 = r8.l(r9, r5, r10)
            Of.H r8 = r21.d()
            Lf.i r8 = r8.m()
            Fg.S r8 = r8.k(r5)
            kotlin.Pair r5 = lf.C6502A.a(r5, r8)
            goto L_0x00a6
        L_0x007f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Vararg parameter should be an array: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0096:
            cg.e r8 = r21.g()
            eg.x r11 = r4.getType()
            Fg.S r5 = r8.p(r11, r5)
            kotlin.Pair r5 = lf.C6502A.a(r5, r9)
        L_0x00a6:
            java.lang.Object r8 = r5.a()
            r9 = r8
            Fg.S r9 = (Fg.S) r9
            java.lang.Object r5 = r5.b()
            r13 = r5
            Fg.S r13 = (Fg.S) r13
            ng.f r5 = r22.getName()
            java.lang.String r5 = r5.b()
            java.lang.String r8 = "equals"
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r8)
            if (r5 == 0) goto L_0x00e6
            int r5 = r23.size()
            if (r5 != r10) goto L_0x00e6
            Of.H r5 = r21.d()
            Lf.i r5 = r5.m()
            Fg.d0 r5 = r5.I()
            boolean r5 = kotlin.jvm.internal.C6496s.c(r5, r9)
            if (r5 == 0) goto L_0x00e6
            java.lang.String r5 = "other"
            ng.f r5 = ng.f.i(r5)
        L_0x00e2:
            r16 = r3
            r8 = r5
            goto L_0x010a
        L_0x00e6:
            ng.f r5 = r4.getName()
            if (r5 != 0) goto L_0x00ed
            r3 = r10
        L_0x00ed:
            if (r5 != 0) goto L_0x00e2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = 112(0x70, float:1.57E-43)
            r5.append(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            ng.f r5 = ng.f.i(r5)
            java.lang.String r8 = "identifier(...)"
            kotlin.jvm.internal.C6496s.g(r5, r8)
            goto L_0x00e2
        L_0x010a:
            kotlin.jvm.internal.C6496s.e(r8)
            Rf.V r12 = new Rf.V
            ag.d r3 = r21.a()
            dg.b r3 = r3.t()
            dg.a r17 = r3.a(r4)
            r5 = 0
            r10 = 0
            r11 = 0
            r18 = 0
            r3 = r12
            r4 = r22
            r19 = r12
            r12 = r18
            r0 = r14
            r14 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r3 = r19
            r0.add(r3)
            r14 = r0
            r3 = r16
            r0 = r21
            goto L_0x002c
        L_0x0139:
            r0 = r14
            java.util.List r0 = mf.C6565s.e1(r0)
            bg.U$b r1 = new bg.U$b
            r1.<init>(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.C5754U.d0(ag.k, Of.z, java.util.List):bg.U$b");
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return (Collection) this.f67167d.invoke();
    }

    public Set g() {
        return M();
    }

    public String toString() {
        return "Lazy scope for " + R();
    }

    /* access modifiers changed from: protected */
    public abstract Set v(C6805d dVar, C6798l lVar);

    /* access modifiers changed from: protected */
    public final List w(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        d dVar2 = d.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (dVar.a(C6805d.f73908c.c())) {
            for (ng.f fVar : v(dVar, lVar)) {
                if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                    Pg.a.a(linkedHashSet, e(fVar, dVar2));
                }
            }
        }
        if (dVar.a(C6805d.f73908c.d()) && !dVar.l().contains(C6804c.a.f73905a)) {
            for (ng.f fVar2 : x(dVar, lVar)) {
                if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                    linkedHashSet.addAll(c(fVar2, dVar2));
                }
            }
        }
        if (dVar.a(C6805d.f73908c.i()) && !dVar.l().contains(C6804c.a.f73905a)) {
            for (ng.f fVar3 : D(dVar, lVar)) {
                if (((Boolean) lVar.invoke(fVar3)).booleanValue()) {
                    linkedHashSet.addAll(b(fVar3, dVar2));
                }
            }
        }
        return C6565s.e1(linkedHashSet);
    }

    /* access modifiers changed from: protected */
    public abstract Set x(C6805d dVar, C6798l lVar);

    /* access modifiers changed from: protected */
    public void y(Collection collection, ng.f fVar) {
        C6496s.h(collection, "result");
        C6496s.h(fVar, "name");
    }

    /* access modifiers changed from: protected */
    public abstract C5762c z();

    public C5754U(k kVar, C5754U u10) {
        C6496s.h(kVar, "c");
        this.f67165b = kVar;
        this.f67166c = u10;
        this.f67167d = kVar.e().b(new C5742H(this), C6565s.n());
        this.f67168e = kVar.e().g(new C5745K(this));
        this.f67169f = kVar.e().h(new C5746L(this));
        this.f67170g = kVar.e().c(new C5747M(this));
        this.f67171h = kVar.e().h(new C5748N(this));
        this.f67172i = kVar.e().g(new C5749O(this));
        this.f67173j = kVar.e().g(new C5750P(this));
        this.f67174k = kVar.e().g(new C5751Q(this));
        this.f67175l = kVar.e().h(new C5752S(this));
    }
}
