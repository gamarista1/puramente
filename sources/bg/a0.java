package bg;

import Fg.S;
import Lf.o;
import Of.C5487e;
import Of.C5490h;
import Of.Z;
import Of.g0;
import Pg.b;
import Wf.d;
import Zf.c;
import Zf.h;
import ag.k;
import eg.C5830g;
import eg.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import mf.Y;
import ng.f;
import rg.C6690h;
import yf.C6798l;
import yg.C6805d;
import yg.C6812k;

public final class a0 extends b0 {

    /* renamed from: n  reason: collision with root package name */
    private final C5830g f67190n;

    /* renamed from: o  reason: collision with root package name */
    private final c f67191o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(k kVar, C5830g gVar, c cVar) {
        super(kVar);
        C6496s.h(kVar, "c");
        C6496s.h(gVar, "jClass");
        C6496s.h(cVar, "ownerDescriptor");
        this.f67190n = gVar;
        this.f67191o = cVar;
    }

    /* access modifiers changed from: private */
    public static final boolean m0(q qVar) {
        C6496s.h(qVar, "it");
        return qVar.g();
    }

    /* access modifiers changed from: private */
    public static final Collection n0(f fVar, C6812k kVar) {
        C6496s.h(kVar, "it");
        return kVar.b(fVar, d.WHEN_GET_SUPER_MEMBERS);
    }

    /* access modifiers changed from: private */
    public static final Collection o0(C6812k kVar) {
        C6496s.h(kVar, "it");
        return kVar.d();
    }

    private final Set p0(C5487e eVar, Set set, C6798l lVar) {
        b.b(C6565s.e(eVar), C5758Y.f67187a, new a(eVar, set, lVar));
        return set;
    }

    /* access modifiers changed from: private */
    public static final Iterable q0(C5487e eVar) {
        Collection l10 = eVar.l().l();
        C6496s.g(l10, "getSupertypes(...)");
        return Rg.k.l(Rg.k.y(C6565s.b0(l10), C5759Z.f67188a));
    }

    /* access modifiers changed from: private */
    public static final C5487e r0(S s10) {
        C5490h o10 = s10.N0().o();
        if (o10 instanceof C5487e) {
            return (C5487e) o10;
        }
        return null;
    }

    private final Z t0(Z z10) {
        if (z10.h().a()) {
            return z10;
        }
        Collection e10 = z10.e();
        C6496s.g(e10, "getOverriddenDescriptors(...)");
        Iterable<Z> iterable = e10;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (Z z11 : iterable) {
            C6496s.e(z11);
            arrayList.add(t0(z11));
        }
        return (Z) C6565s.P0(C6565s.f0(arrayList));
    }

    private final Set u0(f fVar, C5487e eVar) {
        a0 b10 = h.b(eVar);
        if (b10 == null) {
            return Y.e();
        }
        return C6565s.j1(b10.c(fVar, d.WHEN_GET_SUPER_MEMBERS));
    }

    /* access modifiers changed from: protected */
    public void B(Collection collection, f fVar) {
        C6496s.h(collection, "result");
        C6496s.h(fVar, "name");
        Collection e10 = Yf.a.e(fVar, u0(fVar, R()), collection, R(), L().a().c(), L().a().k().a());
        C6496s.g(e10, "resolveOverridesForStaticMembers(...)");
        collection.addAll(e10);
        if (!this.f67190n.w()) {
            return;
        }
        if (C6496s.c(fVar, o.f63933f)) {
            g0 g10 = C6690h.g(R());
            C6496s.g(g10, "createEnumValueOfMethod(...)");
            collection.add(g10);
        } else if (C6496s.c(fVar, o.f63931d)) {
            g0 h10 = C6690h.h(R());
            C6496s.g(h10, "createEnumValuesMethod(...)");
            collection.add(h10);
        }
    }

    /* access modifiers changed from: protected */
    public void C(f fVar, Collection collection) {
        C6496s.h(fVar, "name");
        C6496s.h(collection, "result");
        Set p02 = p0(R(), new LinkedHashSet(), new C5757X(fVar));
        if (!collection.isEmpty()) {
            Collection e10 = Yf.a.e(fVar, p02, collection, R(), L().a().c(), L().a().k().a());
            C6496s.g(e10, "resolveOverridesForStaticMembers(...)");
            collection.addAll(e10);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object next : p02) {
                Z t02 = t0((Z) next);
                Object obj = linkedHashMap.get(t02);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(t02, obj);
                }
                ((List) obj).add(next);
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry value : linkedHashMap.entrySet()) {
                Collection e11 = Yf.a.e(fVar, (Collection) value.getValue(), collection, R(), L().a().c(), L().a().k().a());
                C6496s.g(e11, "resolveOverridesForStaticMembers(...)");
                C6565s.D(arrayList, e11);
            }
            collection.addAll(arrayList);
        }
        if (this.f67190n.w() && C6496s.c(fVar, o.f63932e)) {
            Pg.a.a(collection, C6690h.f(R()));
        }
    }

    /* access modifiers changed from: protected */
    public Set D(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        Set i12 = C6565s.i1(((C5762c) N().invoke()).c());
        p0(R(), i12, C5756W.f67185a);
        if (this.f67190n.w()) {
            i12.add(o.f63932e);
        }
        return i12;
    }

    public C5490h e(f fVar, Wf.b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l0 */
    public C5761b z() {
        return new C5761b(this.f67190n, C5755V.f67184a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public c R() {
        return this.f67191o;
    }

    /* access modifiers changed from: protected */
    public Set v(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public Set x(C6805d dVar, C6798l lVar) {
        Set set;
        C6496s.h(dVar, "kindFilter");
        Set i12 = C6565s.i1(((C5762c) N().invoke()).a());
        a0 b10 = h.b(R());
        if (b10 != null) {
            set = b10.a();
        } else {
            set = null;
        }
        if (set == null) {
            set = Y.e();
        }
        i12.addAll(set);
        if (this.f67190n.w()) {
            i12.addAll(C6565s.q(o.f63933f, o.f63931d));
        }
        i12.addAll(L().a().w().d(R(), L()));
        return i12;
    }

    /* access modifiers changed from: protected */
    public void y(Collection collection, f fVar) {
        C6496s.h(collection, "result");
        C6496s.h(fVar, "name");
        L().a().w().h(R(), fVar, collection, L());
    }

    public static final class a extends b.C0948b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5487e f67192a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Set f67193b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6798l f67194c;

        a(C5487e eVar, Set set, C6798l lVar) {
            this.f67192a = eVar;
            this.f67193b = set;
            this.f67194c = lVar;
        }

        public /* bridge */ /* synthetic */ Object a() {
            e();
            return C6514M.f71813a;
        }

        /* renamed from: d */
        public boolean c(C5487e eVar) {
            C6496s.h(eVar, "current");
            if (eVar == this.f67192a) {
                return true;
            }
            C6812k n02 = eVar.n0();
            C6496s.g(n02, "getStaticScope(...)");
            if (!(n02 instanceof b0)) {
                return true;
            }
            this.f67193b.addAll((Collection) this.f67194c.invoke(n02));
            return false;
        }

        public void e() {
        }
    }
}
