package bg;

import Bg.C5336w;
import Eg.i;
import Fg.C5361b;
import Fg.D0;
import Fg.I0;
import Fg.N0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Fg.v0;
import Gg.g;
import Lf.o;
import Nf.y;
import Of.C5486d;
import Of.C5487e;
import Of.C5488f;
import Of.C5490h;
import Of.C5495m;
import Of.C5501t;
import Of.C5502u;
import Of.E;
import Of.M;
import Of.f0;
import Of.k0;
import Of.m0;
import Of.q0;
import Of.x0;
import Pf.h;
import Rf.C5521j;
import Wf.d;
import Xf.I;
import Xf.r;
import Yf.j;
import ag.k;
import cg.C5798a;
import cg.C5799b;
import eg.C5830g;
import eg.C5833j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import mf.L;
import mf.Y;
import ng.e;
import pf.C6632a;
import tg.x;
import vg.C6755e;
import yg.C6808g;
import yg.C6812k;

/* renamed from: bg.n  reason: case insensitive filesystem */
public final class C5773n extends C5521j implements Zf.c {

    /* renamed from: y  reason: collision with root package name */
    public static final a f67225y = new a((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    private static final Set f67226z = Y.j("equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString");

    /* renamed from: i  reason: collision with root package name */
    private final k f67227i;

    /* renamed from: j  reason: collision with root package name */
    private final C5830g f67228j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final C5487e f67229k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public final k f67230l;

    /* renamed from: m  reason: collision with root package name */
    private final Lazy f67231m;

    /* renamed from: n  reason: collision with root package name */
    private final C5488f f67232n;

    /* renamed from: o  reason: collision with root package name */
    private final E f67233o;

    /* renamed from: p  reason: collision with root package name */
    private final x0 f67234p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f67235q;

    /* renamed from: r  reason: collision with root package name */
    private final b f67236r;

    /* renamed from: s  reason: collision with root package name */
    private final C5785z f67237s;

    /* renamed from: t  reason: collision with root package name */
    private final f0 f67238t;

    /* renamed from: u  reason: collision with root package name */
    private final C6808g f67239u;

    /* renamed from: v  reason: collision with root package name */
    private final a0 f67240v;

    /* renamed from: w  reason: collision with root package name */
    private final h f67241w;

    /* renamed from: x  reason: collision with root package name */
    private final i f67242x;

    /* renamed from: bg.n$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: bg.n$b */
    private final class b extends C5361b {

        /* renamed from: d  reason: collision with root package name */
        private final i f67243d;

        public b() {
            super(C5773n.this.f67230l.e());
            this.f67243d = C5773n.this.f67230l.e().g(new C5774o(C5773n.this));
        }

        private final S K() {
            ng.c cVar;
            ArrayList arrayList;
            ng.c L10 = L();
            if (L10 == null || L10.d() || !L10.i(o.f63953z)) {
                L10 = null;
            }
            if (L10 == null) {
                cVar = r.f66390a.b(C6755e.o(C5773n.this));
                if (cVar == null) {
                    return null;
                }
            } else {
                cVar = L10;
            }
            C5487e B10 = C6755e.B(C5773n.this.f67230l.d(), cVar, d.FROM_JAVA_LOADER);
            if (B10 == null) {
                return null;
            }
            int size = B10.l().getParameters().size();
            List parameters = C5773n.this.l().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            int size2 = parameters.size();
            if (size2 == size) {
                Iterable<m0> iterable = parameters;
                arrayList = new ArrayList(C6565s.y(iterable, 10));
                for (m0 p10 : iterable) {
                    arrayList.add(new D0(N0.INVARIANT, p10.p()));
                }
            } else if (size2 != 1 || size <= 1 || L10 != null) {
                return null;
            } else {
                D0 d02 = new D0(N0.INVARIANT, ((m0) C6565s.P0(parameters)).p());
                Ef.i iVar = new Ef.i(1, size);
                ArrayList arrayList2 = new ArrayList(C6565s.y(iVar, 10));
                Iterator it = iVar.iterator();
                while (it.hasNext()) {
                    ((L) it).a();
                    arrayList2.add(d02);
                }
                arrayList = arrayList2;
            }
            return V.h(r0.f63046b.j(), B10, arrayList);
        }

        private final ng.c L() {
            x xVar;
            String str;
            h annotations = C5773n.this.getAnnotations();
            ng.c cVar = I.f66279r;
            C6496s.g(cVar, "PURELY_IMPLEMENTS_ANNOTATION");
            Pf.c i10 = annotations.i(cVar);
            if (i10 == null) {
                return null;
            }
            Object Q02 = C6565s.Q0(i10.a().values());
            if (Q02 instanceof x) {
                xVar = (x) Q02;
            } else {
                xVar = null;
            }
            if (xVar == null || (str = (String) xVar.b()) == null || !e.e(str)) {
                return null;
            }
            return new ng.c(str);
        }

        /* access modifiers changed from: private */
        public static final List M(C5773n nVar) {
            return q0.g(nVar);
        }

        /* renamed from: I */
        public C5487e o() {
            return C5773n.this;
        }

        public List getParameters() {
            return (List) this.f67243d.invoke();
        }

        public boolean p() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection r() {
            Object obj;
            List e10;
            Collection l10 = C5773n.this.S0().l();
            ArrayList arrayList = new ArrayList(l10.size());
            ArrayList<eg.x> arrayList2 = new ArrayList<>(0);
            S K10 = K();
            Iterator it = l10.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                C5833j jVar = (C5833j) it.next();
                S q10 = C5773n.this.f67230l.a().r().q(C5773n.this.f67230l.g().p(jVar, C5799b.b(I0.SUPERTYPE, false, false, (m0) null, 7, (Object) null)), C5773n.this.f67230l);
                if (q10.N0().o() instanceof M.b) {
                    arrayList2.add(jVar);
                }
                v0 N02 = q10.N0();
                if (K10 != null) {
                    obj = K10.N0();
                }
                if (!C6496s.c(N02, obj) && !Lf.i.b0(q10)) {
                    arrayList.add(q10);
                }
            }
            C5487e K02 = C5773n.this.f67229k;
            if (K02 != null) {
                obj = y.a(K02, C5773n.this).c().p(K02.p(), N0.INVARIANT);
            }
            Pg.a.a(arrayList, obj);
            Pg.a.a(arrayList, K10);
            if (!arrayList2.isEmpty()) {
                C5336w c10 = C5773n.this.f67230l.a().c();
                C5487e I10 = o();
                ArrayList arrayList3 = new ArrayList(C6565s.y(arrayList2, 10));
                for (eg.x xVar : arrayList2) {
                    C6496s.f(xVar, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.structure.JavaClassifierType");
                    arrayList3.add(((C5833j) xVar).F());
                }
                c10.b(I10, arrayList3);
            }
            if (!arrayList.isEmpty()) {
                e10 = C6565s.e1(arrayList);
            } else {
                e10 = C6565s.e(C5773n.this.f67230l.d().m().i());
            }
            return e10;
        }

        public String toString() {
            String b10 = C5773n.this.getName().b();
            C6496s.g(b10, "asString(...)");
            return b10;
        }

        /* access modifiers changed from: protected */
        public k0 v() {
            return C5773n.this.f67230l.a().v();
        }
    }

    /* renamed from: bg.n$c */
    public static final class c implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C6632a.d(C6755e.o((C5487e) obj).b(), C6755e.o((C5487e) obj2).b());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5773n(k kVar, C5495m mVar, C5830g gVar, C5487e eVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, mVar, gVar, (i10 & 8) != 0 ? null : eVar);
    }

    /* access modifiers changed from: private */
    public static final List Q0(C5773n nVar) {
        Iterable<eg.y> typeParameters = nVar.f67228j.getTypeParameters();
        ArrayList arrayList = new ArrayList(C6565s.y(typeParameters, 10));
        for (eg.y yVar : typeParameters) {
            m0 a10 = nVar.f67230l.f().a(yVar);
            if (a10 != null) {
                arrayList.add(a10);
            } else {
                throw new AssertionError("Parameter " + yVar + " surely belongs to class " + nVar.f67228j + ", so it must be resolved");
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static final List W0(C5773n nVar) {
        ng.b n10 = C6755e.n(nVar);
        if (n10 != null) {
            return nVar.f67227i.a().f().a(n10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C5785z X0(C5773n nVar, g gVar) {
        boolean z10;
        C6496s.h(gVar, "it");
        k kVar = nVar.f67230l;
        C5830g gVar2 = nVar.f67228j;
        if (nVar.f67229k != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new C5785z(kVar, nVar, gVar2, z10, nVar.f67237s);
    }

    public boolean A() {
        return this.f67235q;
    }

    public C5486d E() {
        return null;
    }

    public boolean I0() {
        return false;
    }

    public final C5773n P0(j jVar, C5487e eVar) {
        C6496s.h(jVar, "javaResolverCache");
        k kVar = this.f67230l;
        k m10 = ag.c.m(kVar, kVar.a().x(jVar));
        C5495m b10 = b();
        C6496s.g(b10, "getContainingDeclaration(...)");
        return new C5773n(m10, b10, this.f67228j, eVar);
    }

    /* renamed from: R0 */
    public List j() {
        return (List) this.f67237s.a1().invoke();
    }

    public final C5830g S0() {
        return this.f67228j;
    }

    public final List T0() {
        return (List) this.f67231m.getValue();
    }

    /* renamed from: U0 */
    public C5785z Y() {
        C6812k Y10 = super.Y();
        C6496s.f(Y10, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope");
        return (C5785z) Y10;
    }

    public C6812k V() {
        return this.f67239u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public C5785z m0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        return (C5785z) this.f67238t.c(gVar);
    }

    public Of.r0 W() {
        return null;
    }

    public boolean Z() {
        return false;
    }

    public boolean b0() {
        return false;
    }

    public boolean f0() {
        return false;
    }

    public h getAnnotations() {
        return this.f67241w;
    }

    public C5502u getVisibility() {
        if (!C6496s.c(this.f67234p, C5501t.f64505a) || this.f67228j.h() != null) {
            return Xf.V.d(this.f67234p);
        }
        C5502u uVar = Xf.y.f66405a;
        C6496s.e(uVar);
        return uVar;
    }

    public C5488f h() {
        return this.f67232n;
    }

    public boolean isInline() {
        return false;
    }

    public boolean k0() {
        return false;
    }

    public v0 l() {
        return this.f67236r;
    }

    public C6812k n0() {
        return this.f67240v;
    }

    public C5487e o0() {
        return null;
    }

    public List q() {
        return (List) this.f67242x.invoke();
    }

    public E r() {
        return this.f67233o;
    }

    public boolean t() {
        return false;
    }

    public String toString() {
        return "Lazy Java class " + C6755e.p(this);
    }

    public Collection y() {
        C5487e eVar;
        if (this.f67233o != E.SEALED) {
            return C6565s.n();
        }
        C5798a b10 = C5799b.b(I0.COMMON, false, false, (m0) null, 7, (Object) null);
        Rg.h<C5833j> D10 = this.f67228j.D();
        ArrayList arrayList = new ArrayList();
        for (C5833j p10 : D10) {
            C5490h o10 = this.f67230l.g().p(p10, b10).N0().o();
            if (o10 instanceof C5487e) {
                eVar = (C5487e) o10;
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return C6565s.U0(arrayList, new c());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5773n(k kVar, C5495m mVar, C5830g gVar, C5487e eVar) {
        super(kVar.e(), mVar, gVar.getName(), kVar.a().t().a(gVar), false);
        C5488f fVar;
        E e10;
        C5487e eVar2 = eVar;
        C6496s.h(kVar, "outerContext");
        C6496s.h(mVar, "containingDeclaration");
        C6496s.h(gVar, "jClass");
        this.f67227i = kVar;
        this.f67228j = gVar;
        this.f67229k = eVar2;
        k f10 = ag.c.f(kVar, this, gVar, 0, 4, (Object) null);
        this.f67230l = f10;
        f10.a().h().e(gVar, this);
        gVar.M();
        this.f67231m = C6531o.b(new C5770k(this));
        if (gVar.p()) {
            fVar = C5488f.ANNOTATION_CLASS;
        } else if (gVar.L()) {
            fVar = C5488f.INTERFACE;
        } else if (gVar.w()) {
            fVar = C5488f.ENUM_CLASS;
        } else {
            fVar = C5488f.CLASS;
        }
        this.f67232n = fVar;
        if (gVar.p() || gVar.w()) {
            e10 = E.FINAL;
        } else {
            e10 = E.f64444a.a(gVar.z(), gVar.z() || gVar.isAbstract() || gVar.L(), !gVar.isFinal());
        }
        this.f67233o = e10;
        this.f67234p = gVar.getVisibility();
        this.f67235q = gVar.h() != null && !gVar.g();
        this.f67236r = new b();
        C5785z zVar = new C5785z(f10, this, gVar, eVar2 != null, (C5785z) null, 16, (DefaultConstructorMarker) null);
        this.f67237s = zVar;
        this.f67238t = f0.f64491e.a(this, f10.e(), f10.a().k().d(), new C5771l(this));
        this.f67239u = new C6808g(zVar);
        this.f67240v = new a0(f10, gVar, this);
        this.f67241w = ag.h.a(f10, gVar);
        this.f67242x = f10.e().g(new C5772m(this));
    }
}
