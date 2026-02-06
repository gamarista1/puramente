package gg;

import Bg.C5318d;
import Bg.C5322h;
import Bg.N;
import Of.h0;
import Sg.p;
import gg.C5941A;
import gg.C5974x;
import ig.c;
import ig.i;
import ig.n;
import ig.q;
import ig.s;
import ig.u;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kg.C6435b;
import kg.C6436c;
import kg.e;
import kg.g;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.C6536a;
import mf.C6565s;
import mg.C6574b;
import mg.C6576d;
import mg.C6577e;
import mg.C6581i;
import ng.b;
import ng.f;
import pg.C6647i;
import sf.C6714a;
import wg.C6768d;

/* renamed from: gg.e  reason: case insensitive filesystem */
public abstract class C5955e implements C5322h {

    /* renamed from: b  reason: collision with root package name */
    public static final b f67752b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C5972v f67753a;

    /* renamed from: gg.e$a */
    public static abstract class a {
        public abstract Map a();
    }

    /* renamed from: gg.e$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C5974x a(N n10, boolean z10, boolean z11, Boolean bool, boolean z12, C5972v vVar, C6577e eVar) {
            N.a h10;
            C5976z zVar;
            C5968r rVar;
            C6768d dVar;
            C6496s.h(n10, "container");
            C6496s.h(vVar, "kotlinClassFinder");
            C6496s.h(eVar, "jvmMetadataVersion");
            if (z10) {
                if (bool != null) {
                    if (n10 instanceof N.a) {
                        N.a aVar = (N.a) n10;
                        if (aVar.g() == c.C1017c.INTERFACE) {
                            ng.b e10 = aVar.e();
                            f i10 = f.i("DefaultImpls");
                            C6496s.g(i10, "identifier(...)");
                            return C5973w.b(vVar, e10.d(i10), eVar);
                        }
                    }
                    if (bool.booleanValue() && (n10 instanceof N.b)) {
                        h0 c10 = n10.c();
                        if (c10 instanceof C5968r) {
                            rVar = (C5968r) c10;
                        } else {
                            rVar = null;
                        }
                        if (rVar != null) {
                            dVar = rVar.f();
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            b.a aVar2 = ng.b.f72283d;
                            String f10 = dVar.f();
                            C6496s.g(f10, "getInternalName(...)");
                            return C5973w.b(vVar, aVar2.c(new ng.c(p.C(f10, '/', '.', false, 4, (Object) null))), eVar);
                        }
                    }
                } else {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + n10 + ')').toString());
                }
            }
            if (z11 && (n10 instanceof N.a)) {
                N.a aVar3 = (N.a) n10;
                if (aVar3.g() == c.C1017c.COMPANION_OBJECT && (h10 = aVar3.h()) != null && (h10.g() == c.C1017c.CLASS || h10.g() == c.C1017c.ENUM_CLASS || (z12 && (h10.g() == c.C1017c.INTERFACE || h10.g() == c.C1017c.ANNOTATION_CLASS)))) {
                    h0 c11 = h10.c();
                    if (c11 instanceof C5976z) {
                        zVar = (C5976z) c11;
                    } else {
                        zVar = null;
                    }
                    if (zVar != null) {
                        return zVar.d();
                    }
                    return null;
                }
            }
            if (!(n10 instanceof N.b) || !(n10.c() instanceof C5968r)) {
                return null;
            }
            h0 c12 = n10.c();
            C6496s.f(c12, "null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            C5968r rVar2 = (C5968r) c12;
            C5974x g10 = rVar2.g();
            if (g10 == null) {
                return C5973w.b(vVar, rVar2.d(), eVar);
            }
            return g10;
        }

        private b() {
        }
    }

    /* renamed from: gg.e$c */
    private enum c {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        static {
            c[] a10;
            f67758e = C6714a.a(a10);
        }
    }

    /* renamed from: gg.e$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67759a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Bg.d[] r0 = Bg.C5318d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Bg.d r1 = Bg.C5318d.PROPERTY_GETTER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Bg.d r1 = Bg.C5318d.PROPERTY_SETTER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Bg.d r1 = Bg.C5318d.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f67759a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gg.C5955e.d.<clinit>():void");
        }
    }

    public C5955e(C5972v vVar) {
        C6496s.h(vVar, "kotlinClassFinder");
        this.f67753a = vVar;
    }

    private final C5974x A(N.a aVar) {
        C5976z zVar;
        h0 c10 = aVar.c();
        if (c10 instanceof C5976z) {
            zVar = (C5976z) c10;
        } else {
            zVar = null;
        }
        if (zVar != null) {
            return zVar.d();
        }
        return null;
    }

    private final int m(N n10, pg.p pVar) {
        if (pVar instanceof i) {
            if (!kg.f.g((i) pVar)) {
                return 0;
            }
        } else if (pVar instanceof n) {
            if (!kg.f.h((n) pVar)) {
                return 0;
            }
        } else if (pVar instanceof ig.d) {
            C6496s.f(n10, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
            N.a aVar = (N.a) n10;
            if (aVar.g() == c.C1017c.ENUM_CLASS) {
                return 2;
            }
            if (!aVar.i()) {
                return 0;
            }
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + pVar.getClass());
        }
        return 1;
    }

    private final List n(N n10, C5941A a10, boolean z10, boolean z11, Boolean bool, boolean z12) {
        C5974x p10 = p(n10, f67752b.a(n10, z10, z11, bool, z12, this.f67753a, u()));
        if (p10 == null) {
            return C6565s.n();
        }
        List list = (List) q(p10).a().get(a10);
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    static /* synthetic */ List o(C5955e eVar, N n10, C5941A a10, boolean z10, boolean z11, Boolean bool, boolean z12, int i10, Object obj) {
        boolean z13;
        boolean z14;
        Boolean bool2;
        boolean z15;
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z13 = false;
            } else {
                z13 = z10;
            }
            if ((i10 & 8) != 0) {
                z14 = false;
            } else {
                z14 = z11;
            }
            if ((i10 & 16) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i10 & 32) != 0) {
                z15 = false;
            } else {
                z15 = z12;
            }
            return eVar.n(n10, a10, z13, z14, bool2, z15);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ C5941A t(C5955e eVar, pg.p pVar, C6436c cVar, g gVar, C5318d dVar, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return eVar.s(pVar, cVar, gVar, dVar, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final List z(N n10, n nVar, c cVar) {
        c cVar2 = cVar;
        Boolean f10 = C6435b.f71527B.d(nVar.a0());
        C6496s.g(f10, "get(...)");
        f10.booleanValue();
        boolean f11 = C6581i.f(nVar);
        if (cVar2 == c.PROPERTY) {
            C5941A b10 = C5956f.b(nVar, n10.b(), n10.d(), false, true, false, 40, (Object) null);
            if (b10 == null) {
                return C6565s.n();
            }
            return o(this, n10, b10, true, false, f10, f11, 8, (Object) null);
        }
        C5941A b11 = C5956f.b(nVar, n10.b(), n10.d(), true, false, false, 48, (Object) null);
        if (b11 == null) {
            return C6565s.n();
        }
        boolean z10 = false;
        boolean O10 = p.O(b11.a(), "$delegate", false, 2, (Object) null);
        if (cVar2 == c.DELEGATE_FIELD) {
            z10 = true;
        }
        if (O10 != z10) {
            return C6565s.n();
        }
        return n(n10, b11, true, true, f10, f11);
    }

    public List a(s sVar, C6436c cVar) {
        C6496s.h(sVar, "proto");
        C6496s.h(cVar, "nameResolver");
        Object u10 = sVar.u(C6536a.f71862h);
        C6496s.g(u10, "getExtension(...)");
        Iterable<ig.b> iterable = (Iterable) u10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ig.b bVar : iterable) {
            C6496s.e(bVar);
            arrayList.add(i(bVar, cVar));
        }
        return arrayList;
    }

    public List b(N n10, pg.p pVar, C5318d dVar) {
        C6496s.h(n10, "container");
        C6496s.h(pVar, "proto");
        C6496s.h(dVar, "kind");
        C5941A t10 = t(this, pVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        if (t10 == null) {
            return C6565s.n();
        }
        return o(this, n10, C5941A.f67712b.e(t10, 0), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List c(N.a aVar) {
        C6496s.h(aVar, "container");
        C5974x A10 = A(aVar);
        if (A10 != null) {
            ArrayList arrayList = new ArrayList(1);
            A10.b(new C0999e(this, arrayList), r(A10));
            return arrayList;
        }
        throw new IllegalStateException(("Class for loading annotations is not found: " + aVar.a()).toString());
    }

    public List f(N n10, n nVar) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        return z(n10, nVar, c.BACKING_FIELD);
    }

    public List g(N n10, pg.p pVar, C5318d dVar, int i10, u uVar) {
        C6496s.h(n10, "container");
        C6496s.h(pVar, "callableProto");
        C6496s.h(dVar, "kind");
        C6496s.h(uVar, "proto");
        C5941A t10 = t(this, pVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        if (t10 == null) {
            return C6565s.n();
        }
        return o(this, n10, C5941A.f67712b.e(t10, i10 + m(n10, pVar)), false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List h(N n10, n nVar) {
        C6496s.h(n10, "container");
        C6496s.h(nVar, "proto");
        return z(n10, nVar, c.DELEGATE_FIELD);
    }

    public abstract Object i(ig.b bVar, C6436c cVar);

    public List j(q qVar, C6436c cVar) {
        C6496s.h(qVar, "proto");
        C6496s.h(cVar, "nameResolver");
        Object u10 = qVar.u(C6536a.f71860f);
        C6496s.g(u10, "getExtension(...)");
        Iterable<ig.b> iterable = (Iterable) u10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (ig.b bVar : iterable) {
            C6496s.e(bVar);
            arrayList.add(i(bVar, cVar));
        }
        return arrayList;
    }

    public List k(N n10, pg.p pVar, C5318d dVar) {
        C6496s.h(n10, "container");
        C6496s.h(pVar, "proto");
        C6496s.h(dVar, "kind");
        if (dVar == C5318d.PROPERTY) {
            return z(n10, (n) pVar, c.PROPERTY);
        }
        C5941A t10 = t(this, pVar, n10.b(), n10.d(), dVar, false, 16, (Object) null);
        if (t10 == null) {
            return C6565s.n();
        }
        return o(this, n10, t10, false, false, (Boolean) null, false, 60, (Object) null);
    }

    public List l(N n10, ig.g gVar) {
        C6496s.h(n10, "container");
        C6496s.h(gVar, "proto");
        return o(this, n10, C5941A.f67712b.a(n10.b().getString(gVar.F()), C6574b.b(((N.a) n10).e().b())), false, false, (Boolean) null, false, 60, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final C5974x p(N n10, C5974x xVar) {
        C6496s.h(n10, "container");
        if (xVar != null) {
            return xVar;
        }
        if (n10 instanceof N.a) {
            return A((N.a) n10);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract a q(C5974x xVar);

    /* access modifiers changed from: protected */
    public byte[] r(C5974x xVar) {
        C6496s.h(xVar, "kotlinClass");
        return null;
    }

    /* access modifiers changed from: protected */
    public final C5941A s(pg.p pVar, C6436c cVar, g gVar, C5318d dVar, boolean z10) {
        C6496s.h(pVar, "proto");
        C6496s.h(cVar, "nameResolver");
        C6496s.h(gVar, "typeTable");
        C6496s.h(dVar, "kind");
        if (pVar instanceof ig.d) {
            C5941A.a aVar = C5941A.f67712b;
            C6576d.b b10 = C6581i.f72110a.b((ig.d) pVar, cVar, gVar);
            if (b10 == null) {
                return null;
            }
            return aVar.b(b10);
        } else if (pVar instanceof i) {
            C5941A.a aVar2 = C5941A.f67712b;
            C6576d.b e10 = C6581i.f72110a.e((i) pVar, cVar, gVar);
            if (e10 == null) {
                return null;
            }
            return aVar2.b(e10);
        } else if (!(pVar instanceof n)) {
            return null;
        } else {
            C6647i.f fVar = C6536a.f71858d;
            C6496s.g(fVar, "propertySignature");
            C6536a.d dVar2 = (C6536a.d) e.a((C6647i.d) pVar, fVar);
            if (dVar2 == null) {
                return null;
            }
            int i10 = d.f67759a[dVar.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return C5956f.a((n) pVar, cVar, gVar, true, true, z10);
                } else if (!dVar2.H()) {
                    return null;
                } else {
                    C5941A.a aVar3 = C5941A.f67712b;
                    C6536a.c C10 = dVar2.C();
                    C6496s.g(C10, "getSetter(...)");
                    return aVar3.c(cVar, C10);
                }
            } else if (!dVar2.G()) {
                return null;
            } else {
                C5941A.a aVar4 = C5941A.f67712b;
                C6536a.c B10 = dVar2.B();
                C6496s.g(B10, "getGetter(...)");
                return aVar4.c(cVar, B10);
            }
        }
    }

    public abstract C6577e u();

    /* access modifiers changed from: protected */
    public final C5972v v() {
        return this.f67753a;
    }

    /* access modifiers changed from: protected */
    public final boolean w(ng.b bVar) {
        C5974x b10;
        C6496s.h(bVar, "classId");
        if (bVar.e() == null || !C6496s.c(bVar.h().b(), "Container") || (b10 = C5973w.b(this.f67753a, bVar, u())) == null || !Kf.a.f63853a.c(b10)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract C5974x.a x(ng.b bVar, h0 h0Var, List list);

    /* access modifiers changed from: protected */
    public final C5974x.a y(ng.b bVar, h0 h0Var, List list) {
        C6496s.h(bVar, "annotationClassId");
        C6496s.h(h0Var, "source");
        C6496s.h(list, "result");
        if (Kf.a.f63853a.b().contains(bVar)) {
            return null;
        }
        return x(bVar, h0Var, list);
    }

    /* renamed from: gg.e$e  reason: collision with other inner class name */
    public static final class C0999e implements C5974x.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5955e f67760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f67761b;

        C0999e(C5955e eVar, ArrayList arrayList) {
            this.f67760a = eVar;
            this.f67761b = arrayList;
        }

        public C5974x.a b(ng.b bVar, h0 h0Var) {
            C6496s.h(bVar, "classId");
            C6496s.h(h0Var, "source");
            return this.f67760a.y(bVar, h0Var, this.f67761b);
        }

        public void a() {
        }
    }
}
