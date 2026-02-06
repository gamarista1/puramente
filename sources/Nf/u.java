package Nf;

import Dg.C5352m;
import Eg.g;
import Eg.i;
import Eg.m;
import Eg.n;
import Ff.l;
import Fg.C5366d0;
import Fg.G0;
import Fg.S;
import Fg.Y;
import Nf.k;
import Of.C5484b;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5494l;
import Of.C5495m;
import Of.C5500s;
import Of.C5501t;
import Of.C5506y;
import Of.C5507z;
import Of.E;
import Of.H;
import Of.M;
import Of.g0;
import Of.h0;
import Of.t0;
import Pf.h;
import Pg.b;
import Pg.l;
import Rf.C5522k;
import Yf.j;
import bg.C5773n;
import bg.C5785z;
import gg.C5942B;
import gg.C5943C;
import gg.C5946F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.O;
import mf.C6565s;
import ng.f;
import rg.C6697o;
import sf.C6714a;
import vg.C6755e;
import yf.C6787a;
import yf.C6798l;
import yg.C6812k;

public final class u implements Qf.a, Qf.c {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ l[] f64315i;

    /* renamed from: a  reason: collision with root package name */
    private final H f64316a;

    /* renamed from: b  reason: collision with root package name */
    private final d f64317b = d.f64275a;

    /* renamed from: c  reason: collision with root package name */
    private final i f64318c;

    /* renamed from: d  reason: collision with root package name */
    private final S f64319d;

    /* renamed from: e  reason: collision with root package name */
    private final i f64320e;

    /* renamed from: f  reason: collision with root package name */
    private final Eg.a f64321f;

    /* renamed from: g  reason: collision with root package name */
    private final i f64322g;

    /* renamed from: h  reason: collision with root package name */
    private final g f64323h;

    private enum a {
        HIDDEN,
        VISIBLE,
        DEPRECATED_LIST_METHODS,
        NOT_CONSIDERED,
        DROP;

        static {
            a[] a10;
            f64330g = C6714a.a(a10);
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f64331a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Nf.u$a[] r0 = Nf.u.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nf.u$a r1 = Nf.u.a.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nf.u$a r1 = Nf.u.a.DEPRECATED_LIST_METHODS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nf.u$a r1 = Nf.u.a.NOT_CONSIDERED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Nf.u$a r1 = Nf.u.a.DROP     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Nf.u$a r1 = Nf.u.a.VISIBLE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f64331a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Nf.u.b.<clinit>():void");
        }
    }

    public static final class c extends Rf.H {
        c(H h10, ng.c cVar) {
            super(h10, cVar);
        }

        /* renamed from: H0 */
        public C6812k.b o() {
            return C6812k.b.f73949b;
        }
    }

    public static final class d extends b.C0948b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f64332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N f64333b;

        d(String str, N n10) {
            this.f64332a = str;
            this.f64333b = n10;
        }

        /* renamed from: d */
        public boolean c(C5487e eVar) {
            C6496s.h(eVar, "javaClassDescriptor");
            String a10 = C5942B.a(C5946F.f67716a, eVar, this.f64332a);
            x xVar = x.f64337a;
            if (xVar.f().contains(a10)) {
                this.f64333b.f71759a = a.HIDDEN;
            } else if (xVar.i().contains(a10)) {
                this.f64333b.f71759a = a.VISIBLE;
            } else if (xVar.c().contains(a10)) {
                this.f64333b.f71759a = a.DEPRECATED_LIST_METHODS;
            } else if (xVar.d().contains(a10)) {
                this.f64333b.f71759a = a.DROP;
            }
            if (this.f64333b.f71759a == null) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public a a() {
            a aVar = (a) this.f64333b.f71759a;
            if (aVar == null) {
                return a.NOT_CONSIDERED;
            }
            return aVar;
        }
    }

    static {
        Class<u> cls = u.class;
        f64315i = new l[]{O.i(new F(O.b(cls), "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), O.i(new F(O.b(cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), O.i(new F(O.b(cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public u(H h10, n nVar, C6787a aVar) {
        C6496s.h(h10, "moduleDescriptor");
        C6496s.h(nVar, "storageManager");
        C6496s.h(aVar, "settingsComputation");
        this.f64316a = h10;
        this.f64318c = nVar.g(aVar);
        this.f64319d = q(nVar);
        this.f64320e = nVar.g(new l(this, nVar));
        this.f64321f = nVar.a();
        this.f64322g = nVar.g(new m(this));
        this.f64323h = nVar.h(new n(this));
    }

    private final a A(C5507z zVar) {
        C5495m b10 = zVar.b();
        C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Object b11 = Pg.b.b(C6565s.e((C5487e) b10), new t(this), new d(C5943C.c(zVar, false, false, 3, (Object) null), new N()));
        C6496s.g(b11, "dfs(...)");
        return (a) b11;
    }

    /* access modifiers changed from: private */
    public static final Iterable B(u uVar, C5487e eVar) {
        C5490h hVar;
        C5487e eVar2;
        Collection<S> l10 = eVar.l().l();
        C6496s.g(l10, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        for (S N02 : l10) {
            C5490h o10 = N02.N0().o();
            C5487e eVar3 = null;
            if (o10 != null) {
                hVar = o10.a();
            } else {
                hVar = null;
            }
            if (hVar instanceof C5487e) {
                eVar2 = (C5487e) hVar;
            } else {
                eVar2 = null;
            }
            if (eVar2 != null && (eVar3 = uVar.z(eVar2)) == null) {
                eVar3 = eVar2;
            }
            if (eVar3 != null) {
                arrayList.add(eVar3);
            }
        }
        return arrayList;
    }

    private final h C() {
        return (h) m.a(this.f64322g, this, f64315i[2]);
    }

    private final k.b D() {
        return (k.b) m.a(this.f64318c, this, f64315i[0]);
    }

    private final boolean E(g0 g0Var, boolean z10) {
        C5495m b10 = g0Var.b();
        C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        String c10 = C5943C.c(g0Var, false, false, 3, (Object) null);
        if (z10 ^ x.f64337a.g().contains(C5942B.a(C5946F.f67716a, (C5487e) b10, c10))) {
            return true;
        }
        Boolean e10 = Pg.b.e(C6565s.e(g0Var), r.f64312a, new s(this));
        C6496s.g(e10, "ifAny(...)");
        return e10.booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Iterable F(C5484b bVar) {
        return bVar.a().e();
    }

    /* access modifiers changed from: private */
    public static final Boolean G(u uVar, C5484b bVar) {
        boolean z10;
        if (bVar.h() == C5484b.a.DECLARATION) {
            d dVar = uVar.f64317b;
            C5495m b10 = bVar.b();
            C6496s.f(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            if (dVar.c((C5487e) b10)) {
                z10 = true;
                return Boolean.valueOf(z10);
            }
        }
        z10 = false;
        return Boolean.valueOf(z10);
    }

    private final boolean H(C5494l lVar, C5487e eVar) {
        ng.d dVar;
        if (lVar.k().size() == 1) {
            List k10 = lVar.k();
            C6496s.g(k10, "getValueParameters(...)");
            C5490h o10 = ((t0) C6565s.P0(k10)).getType().N0().o();
            if (o10 != null) {
                dVar = C6755e.p(o10);
            } else {
                dVar = null;
            }
            if (C6496s.c(dVar, C6755e.p(eVar))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final h I(u uVar) {
        return h.f64602L.a(C6565s.e(Pf.g.c(uVar.f64316a.m(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", (String) null, (String) null, true, 6, (Object) null)));
    }

    /* access modifiers changed from: private */
    public static final C5366d0 o(u uVar, n nVar) {
        return C5506y.d(uVar.D().a(), g.f64279d.a(), new M(nVar, uVar.D().a())).p();
    }

    private final g0 p(C5352m mVar, g0 g0Var) {
        C5507z.a v10 = g0Var.v();
        v10.v(mVar);
        v10.k(C5501t.f64509e);
        v10.s(mVar.p());
        v10.p(mVar.J0());
        C5507z f10 = v10.f();
        C6496s.e(f10);
        return (g0) f10;
    }

    private final S q(n nVar) {
        C5522k kVar = new C5522k(new c(this.f64316a, new ng.c("java.io")), f.i("Serializable"), E.ABSTRACT, C5488f.INTERFACE, C6565s.e(new Y(nVar, new o(this))), h0.f64497a, false, nVar);
        kVar.K0(C6812k.b.f73949b, mf.Y.e(), (C5486d) null);
        C5366d0 p10 = kVar.p();
        C6496s.g(p10, "getDefaultType(...)");
        return p10;
    }

    /* access modifiers changed from: private */
    public static final S r(u uVar) {
        C5366d0 i10 = uVar.f64316a.m().i();
        C6496s.g(i10, "getAnyType(...)");
        return i10;
    }

    /* access modifiers changed from: private */
    public static final h s(u uVar, Pair pair) {
        C6496s.h(pair, "<destruct>");
        String str = (String) pair.b();
        return h.f64602L.a(C6565s.e(Pf.g.b(uVar.f64316a.m(), '\'' + ((String) pair.a()) + "()' member of List is redundant in Kotlin and might be removed soon. Please use '" + str + "()' stdlib extension instead", str + "()", "HIDDEN", false)));
    }

    private final Collection t(C5487e eVar, C6798l lVar) {
        C5773n z10 = z(eVar);
        if (z10 == null) {
            return C6565s.n();
        }
        Iterable<C5487e> g10 = this.f64317b.g(C6755e.o(z10), b.f64253h.a());
        C5487e eVar2 = (C5487e) C6565s.A0(g10);
        if (eVar2 == null) {
            return C6565s.n();
        }
        l.b bVar = Pg.l.f64708c;
        ArrayList arrayList = new ArrayList(C6565s.y(g10, 10));
        for (C5487e o10 : g10) {
            arrayList.add(C6755e.o(o10));
        }
        Pg.l b10 = bVar.b(arrayList);
        boolean c10 = this.f64317b.c(eVar);
        C6812k Y10 = ((C5487e) this.f64321f.a(C6755e.o(z10), new q(z10, eVar2))).Y();
        C6496s.g(Y10, "getUnsubstitutedMemberScope(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object next : (Iterable) lVar.invoke(Y10)) {
            g0 g0Var = (g0) next;
            if (g0Var.h() == C5484b.a.DECLARATION && g0Var.getVisibility().d() && !Lf.i.k0(g0Var)) {
                Collection e10 = g0Var.e();
                C6496s.g(e10, "getOverriddenDescriptors(...)");
                Iterable iterable = e10;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5495m b11 = ((C5507z) it.next()).b();
                        C6496s.g(b11, "getContainingDeclaration(...)");
                        if (b10.contains(C6755e.o(b11))) {
                            break;
                        }
                    }
                }
                if (!E(g0Var, c10)) {
                    arrayList2.add(next);
                }
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public static final C5487e u(C5773n nVar, C5487e eVar) {
        j jVar = j.f66757a;
        C6496s.g(jVar, com.amazon.a.a.n.a.a.g.f37322a);
        return nVar.P0(jVar, eVar);
    }

    private final C5366d0 v() {
        return (C5366d0) m.a(this.f64320e, this, f64315i[1]);
    }

    private static final boolean w(C5494l lVar, G0 g02, C5494l lVar2) {
        if (C6697o.x(lVar, lVar2.c(g02)) == C6697o.i.a.OVERRIDABLE) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final Collection x(f fVar, C6812k kVar) {
        C6496s.h(kVar, "it");
        return kVar.c(fVar, Wf.d.FROM_BUILTINS);
    }

    private final C5773n z(C5487e eVar) {
        ng.b n10;
        ng.c a10;
        if (Lf.i.a0(eVar) || !Lf.i.B0(eVar)) {
            return null;
        }
        ng.d p10 = C6755e.p(eVar);
        if (!p10.f() || (n10 = c.f64255a.n(p10)) == null || (a10 = n10.a()) == null) {
            return null;
        }
        C5487e d10 = C5500s.d(D().a(), a10, Wf.d.FROM_BUILTINS);
        if (d10 instanceof C5773n) {
            return (C5773n) d10;
        }
        return null;
    }

    public boolean a(C5487e eVar, g0 g0Var) {
        C6496s.h(eVar, "classDescriptor");
        C6496s.h(g0Var, "functionDescriptor");
        C5773n z10 = z(eVar);
        if (z10 == null || !g0Var.getAnnotations().n0(Qf.d.a())) {
            return true;
        }
        if (!D().b()) {
            return false;
        }
        String c10 = C5943C.c(g0Var, false, false, 3, (Object) null);
        C5785z U02 = z10.Y();
        f name = g0Var.getName();
        C6496s.g(name, "getName(...)");
        Iterable<g0> c11 = U02.c(name, Wf.d.FROM_BUILTINS);
        if (!(c11 instanceof Collection) || !((Collection) c11).isEmpty()) {
            for (g0 c12 : c11) {
                if (C6496s.c(C5943C.c(c12, false, false, 3, (Object) null), c10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Collection b(C5487e eVar) {
        C6496s.h(eVar, "classDescriptor");
        ng.d p10 = C6755e.p(eVar);
        x xVar = x.f64337a;
        if (xVar.j(p10)) {
            return C6565s.q(v(), this.f64319d);
        } else if (xVar.k(p10)) {
            return C6565s.e(this.f64319d);
        } else {
            return C6565s.n();
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [Of.z, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b8 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection c(ng.f r7, Of.C5487e r8) {
        /*
            r6 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.String r0 = "classDescriptor"
            kotlin.jvm.internal.C6496s.h(r8, r0)
            Nf.a$a r0 = Nf.a.f64251e
            ng.f r0 = r0.a()
            boolean r0 = kotlin.jvm.internal.C6496s.c(r7, r0)
            if (r0 == 0) goto L_0x0093
            boolean r0 = r8 instanceof Dg.C5352m
            if (r0 == 0) goto L_0x0093
            boolean r0 = Lf.i.e0(r8)
            if (r0 == 0) goto L_0x0093
            Dg.m r8 = (Dg.C5352m) r8
            ig.c r0 = r8.e1()
            java.util.List r0 = r0.I0()
            java.lang.String r1 = "getFunctionList(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x003f
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003f
            goto L_0x0072
        L_0x003f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0072
            java.lang.Object r1 = r0.next()
            ig.i r1 = (ig.i) r1
            Bg.p r2 = r8.d1()
            kg.c r2 = r2.g()
            int r1 = r1.d0()
            ng.f r1 = Bg.L.b(r2, r1)
            Nf.a$a r2 = Nf.a.f64251e
            ng.f r2 = r2.a()
            boolean r1 = kotlin.jvm.internal.C6496s.c(r1, r2)
            if (r1 == 0) goto L_0x0043
            java.util.List r7 = mf.C6565s.n()
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x0072:
            Fg.d0 r0 = r6.v()
            yg.k r0 = r0.o()
            Wf.d r1 = Wf.d.FROM_BUILTINS
            java.util.Collection r7 = r0.c(r7, r1)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r7 = mf.C6565s.O0(r7)
            Of.g0 r7 = (Of.g0) r7
            Of.g0 r7 = r6.p(r8, r7)
            java.util.List r7 = mf.C6565s.e(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x0093:
            Nf.k$b r0 = r6.D()
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x00a4
            java.util.List r7 = mf.C6565s.n()
            java.util.Collection r7 = (java.util.Collection) r7
            return r7
        L_0x00a4:
            Nf.p r0 = new Nf.p
            r0.<init>(r7)
            java.util.Collection r7 = r6.t(r8, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00b8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x01a4
            java.lang.Object r1 = r7.next()
            Of.g0 r1 = (Of.g0) r1
            Of.m r2 = r1.b()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            kotlin.jvm.internal.C6496s.f(r2, r3)
            Of.e r2 = (Of.C5487e) r2
            Fg.w0 r2 = Nf.y.a(r2, r8)
            Fg.G0 r2 = r2.c()
            Of.z r2 = r1.c(r2)
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            kotlin.jvm.internal.C6496s.f(r2, r3)
            Of.g0 r2 = (Of.g0) r2
            Of.z$a r2 = r2.v()
            r2.v(r8)
            Of.c0 r3 = r8.J0()
            r2.p(r3)
            r2.u()
            Nf.u$a r3 = r6.A(r1)
            int[] r4 = Nf.u.b.f64331a
            int r3 = r3.ordinal()
            r3 = r4[r3]
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0189
            r4 = 2
            if (r3 == r4) goto L_0x0121
            r1 = 3
            if (r3 == r1) goto L_0x0119
            r1 = 4
            if (r3 == r1) goto L_0x019d
            r1 = 5
            if (r3 != r1) goto L_0x0113
            lf.M r1 = lf.C6514M.f71813a
            goto L_0x0193
        L_0x0113:
            lf.s r7 = new lf.s
            r7.<init>()
            throw r7
        L_0x0119:
            Pf.h r1 = r6.C()
            r2.t(r1)
            goto L_0x0193
        L_0x0121:
            ng.f r3 = r1.getName()
            ng.f r4 = Nf.v.f64334a
            boolean r4 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r4 == 0) goto L_0x0146
            Eg.g r3 = r6.f64323h
            ng.f r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r4 = "first"
            kotlin.Pair r1 = lf.C6502A.a(r1, r4)
            java.lang.Object r1 = r3.invoke(r1)
            Pf.h r1 = (Pf.h) r1
            goto L_0x0166
        L_0x0146:
            ng.f r4 = Nf.v.f64335b
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r3 == 0) goto L_0x016a
            Eg.g r3 = r6.f64323h
            ng.f r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r4 = "last"
            kotlin.Pair r1 = lf.C6502A.a(r1, r4)
            java.lang.Object r1 = r3.invoke(r1)
            Pf.h r1 = (Pf.h) r1
        L_0x0166:
            r2.t(r1)
            goto L_0x0193
        L_0x016a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Unexpected name: "
            r8.append(r0)
            ng.f r0 = r1.getName()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0189:
            boolean r1 = Of.F.a(r8)
            if (r1 == 0) goto L_0x0190
            goto L_0x019d
        L_0x0190:
            r2.i()
        L_0x0193:
            Of.z r1 = r2.f()
            kotlin.jvm.internal.C6496s.e(r1)
            r5 = r1
            Of.g0 r5 = (Of.g0) r5
        L_0x019d:
            if (r5 == 0) goto L_0x00b8
            r0.add(r5)
            goto L_0x00b8
        L_0x01a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Nf.u.c(ng.f, Of.e):java.util.Collection");
    }

    public Collection e(C5487e eVar) {
        C6496s.h(eVar, "classDescriptor");
        if (eVar.h() != C5488f.CLASS || !D().b()) {
            return C6565s.n();
        }
        C5773n z10 = z(eVar);
        if (z10 == null) {
            return C6565s.n();
        }
        C5487e f10 = d.f(this.f64317b, C6755e.o(z10), b.f64253h.a(), (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return C6565s.n();
        }
        G0 c10 = y.a(f10, z10).c();
        ArrayList<C5486d> arrayList = new ArrayList<>();
        for (Object next : z10.j()) {
            C5486d dVar = (C5486d) next;
            if (dVar.getVisibility().d()) {
                Collection j10 = f10.j();
                C6496s.g(j10, "getConstructors(...)");
                Iterable iterable = j10;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C5486d dVar2 = (C5486d) it.next();
                        C6496s.e(dVar2);
                        if (w(dVar2, c10, dVar)) {
                            break;
                        }
                    }
                }
                if (!H(dVar, eVar) && !Lf.i.k0(dVar) && !x.f64337a.e().contains(C5942B.a(C5946F.f67716a, z10, C5943C.c(dVar, false, false, 3, (Object) null)))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (C5486d dVar3 : arrayList) {
            C5507z.a v10 = dVar3.v();
            v10.v(eVar);
            v10.s(eVar.p());
            v10.u();
            v10.j(c10.j());
            if (!x.f64337a.h().contains(C5942B.a(C5946F.f67716a, z10, C5943C.c(dVar3, false, false, 3, (Object) null)))) {
                v10.t(C());
            }
            C5507z f11 = v10.f();
            C6496s.f(f11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((C5486d) f11);
        }
        return arrayList2;
    }

    /* renamed from: y */
    public Set d(C5487e eVar) {
        C5785z U02;
        Set a10;
        C6496s.h(eVar, "classDescriptor");
        if (!D().b()) {
            return mf.Y.e();
        }
        C5773n z10 = z(eVar);
        if (z10 == null || (U02 = z10.Y()) == null || (a10 = U02.a()) == null) {
            return mf.Y.e();
        }
        return a10;
    }
}
