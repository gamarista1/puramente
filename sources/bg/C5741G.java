package bg;

import Eg.h;
import Eg.j;
import Of.C5487e;
import Of.C5495m;
import Xf.C5687u;
import ag.k;
import bg.C5762c;
import eg.C5823D;
import eg.C5830g;
import eg.u;
import gg.C5972v;
import gg.C5973w;
import gg.C5974x;
import hg.C5996a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6535s;
import mf.C6565s;
import mf.Y;
import mg.C6577e;
import ng.c;
import ng.f;
import yf.C6798l;
import yg.C6805d;

/* renamed from: bg.G  reason: case insensitive filesystem */
public final class C5741G extends b0 {

    /* renamed from: n  reason: collision with root package name */
    private final u f67139n;

    /* renamed from: o  reason: collision with root package name */
    private final C5738D f67140o;

    /* renamed from: p  reason: collision with root package name */
    private final j f67141p;

    /* renamed from: q  reason: collision with root package name */
    private final h f67142q;

    /* renamed from: bg.G$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final f f67143a;

        /* renamed from: b  reason: collision with root package name */
        private final C5830g f67144b;

        public a(f fVar, C5830g gVar) {
            C6496s.h(fVar, "name");
            this.f67143a = fVar;
            this.f67144b = gVar;
        }

        public final C5830g a() {
            return this.f67144b;
        }

        public final f b() {
            return this.f67143a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || !C6496s.c(this.f67143a, ((a) obj).f67143a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f67143a.hashCode();
        }
    }

    /* renamed from: bg.G$b */
    private static abstract class b {

        /* renamed from: bg.G$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C5487e f67145a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C5487e eVar) {
                super((DefaultConstructorMarker) null);
                C6496s.h(eVar, "descriptor");
                this.f67145a = eVar;
            }

            public final C5487e a() {
                return this.f67145a;
            }
        }

        /* renamed from: bg.G$b$b  reason: collision with other inner class name */
        public static final class C0985b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0985b f67146a = new C0985b();

            private C0985b() {
                super((DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bg.G$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f67147a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5741G(k kVar, u uVar, C5738D d10) {
        super(kVar);
        C6496s.h(kVar, "c");
        C6496s.h(uVar, "jPackage");
        C6496s.h(d10, "ownerDescriptor");
        this.f67139n = uVar;
        this.f67140o = d10;
        this.f67141p = kVar.e().d(new C5739E(kVar, this));
        this.f67142q = kVar.e().c(new C5740F(this, kVar));
    }

    /* access modifiers changed from: private */
    public static final C5487e i0(C5741G g10, k kVar, a aVar) {
        C5972v.a aVar2;
        C5974x xVar;
        ng.b bVar;
        C5823D d10;
        c cVar;
        C6496s.h(aVar, "request");
        ng.b bVar2 = new ng.b(g10.R().f(), aVar.b());
        if (aVar.a() != null) {
            aVar2 = kVar.a().j().a(aVar.a(), g10.m0());
        } else {
            aVar2 = kVar.a().j().b(bVar2, g10.m0());
        }
        if (aVar2 != null) {
            xVar = aVar2.a();
        } else {
            xVar = null;
        }
        if (xVar != null) {
            bVar = xVar.d();
        } else {
            bVar = null;
        }
        if (bVar != null && (bVar.j() || bVar.i())) {
            return null;
        }
        C5741G g11 = g10;
        b p02 = g10.p0(xVar);
        if (p02 instanceof b.a) {
            return ((b.a) p02).a();
        }
        if (p02 instanceof b.c) {
            return null;
        }
        if (p02 instanceof b.C0985b) {
            C5830g a10 = aVar.a();
            if (a10 == null) {
                a10 = kVar.a().d().b(new C5687u.a(bVar2, (byte[]) null, (C5830g) null, 4, (DefaultConstructorMarker) null));
            }
            C5830g gVar = a10;
            if (gVar != null) {
                d10 = gVar.M();
            } else {
                d10 = null;
            }
            if (d10 != C5823D.BINARY) {
                if (gVar != null) {
                    cVar = gVar.f();
                } else {
                    cVar = null;
                }
                if (cVar == null || cVar.d() || !C6496s.c(cVar.e(), g10.R().f())) {
                    return null;
                }
                C5773n nVar = new C5773n(kVar, g10.R(), gVar, (C5487e) null, 8, (DefaultConstructorMarker) null);
                kVar.a().e().a(nVar);
                return nVar;
            }
            throw new IllegalStateException("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: " + gVar + "\nClassId: " + bVar2 + "\nfindKotlinClass(JavaClass) = " + C5973w.a(kVar.a().j(), gVar, g10.m0()) + "\nfindKotlinClass(ClassId) = " + C5973w.b(kVar.a().j(), bVar2, g10.m0()) + 10);
        }
        throw new C6535s();
    }

    private final C5487e j0(f fVar, C5830g gVar) {
        if (!ng.h.f72303a.a(fVar)) {
            return null;
        }
        Set set = (Set) this.f67141p.invoke();
        if (gVar != null || set == null || set.contains(fVar.b())) {
            return (C5487e) this.f67142q.invoke(new a(fVar, gVar));
        }
        return null;
    }

    private final C6577e m0() {
        return Pg.c.a(L().a().b().f().g());
    }

    /* access modifiers changed from: private */
    public static final Set o0(k kVar, C5741G g10) {
        return kVar.a().d().c(g10.R().f());
    }

    private final b p0(C5974x xVar) {
        if (xVar == null) {
            return b.C0985b.f67146a;
        }
        if (xVar.e().c() != C5996a.C1007a.CLASS) {
            return b.c.f67147a;
        }
        C5487e n10 = L().a().b().n(xVar);
        if (n10 != null) {
            return new b.a(n10);
        }
        return b.C0985b.f67146a;
    }

    /* access modifiers changed from: protected */
    public void B(Collection collection, f fVar) {
        C6496s.h(collection, "result");
        C6496s.h(fVar, "name");
    }

    /* access modifiers changed from: protected */
    public Set D(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        return Y.e();
    }

    public Collection b(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return C6565s.n();
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        C6805d.a aVar = C6805d.f73908c;
        if (!dVar.a(aVar.e() | aVar.c())) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : (Iterable) K().invoke()) {
            C5495m mVar = (C5495m) next;
            if (mVar instanceof C5487e) {
                f name = ((C5487e) mVar).getName();
                C6496s.g(name, "getName(...)");
                if (((Boolean) lVar.invoke(name)).booleanValue()) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public final C5487e k0(C5830g gVar) {
        C6496s.h(gVar, "javaClass");
        return j0(gVar.getName(), gVar);
    }

    /* renamed from: l0 */
    public C5487e e(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return j0(fVar, (C5830g) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n0 */
    public C5738D R() {
        return this.f67140o;
    }

    /* access modifiers changed from: protected */
    public Set v(C6805d dVar, C6798l lVar) {
        f fVar;
        C6496s.h(dVar, "kindFilter");
        if (!dVar.a(C6805d.f73908c.e())) {
            return Y.e();
        }
        Set<String> set = (Set) this.f67141p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            for (String i10 : set) {
                hashSet.add(f.i(i10));
            }
            return hashSet;
        }
        u uVar = this.f67139n;
        if (lVar == null) {
            lVar = Pg.j.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5830g gVar : uVar.G(lVar)) {
            if (gVar.M() == C5823D.SOURCE) {
                fVar = null;
            } else {
                fVar = gVar.getName();
            }
            if (fVar != null) {
                linkedHashSet.add(fVar);
            }
        }
        return linkedHashSet;
    }

    /* access modifiers changed from: protected */
    public Set x(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public C5762c z() {
        return C5762c.a.f67201a;
    }
}
