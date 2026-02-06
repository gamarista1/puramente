package ag;

import Eg.a;
import Of.U;
import Xf.C5686t;
import ag.p;
import bg.C5738D;
import eg.u;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import mf.C6565s;
import ng.c;
import yf.C6798l;

public final class j implements U {

    /* renamed from: a  reason: collision with root package name */
    private final k f67075a;

    /* renamed from: b  reason: collision with root package name */
    private final a f67076b;

    public j(d dVar) {
        C6496s.h(dVar, "components");
        k kVar = new k(dVar, p.a.f67089a, C6531o.c((Object) null));
        this.f67075a = kVar;
        this.f67076b = kVar.e().a();
    }

    private final C5738D e(c cVar) {
        u a10 = C5686t.a(this.f67075a.a().d(), cVar, false, 2, (Object) null);
        if (a10 == null) {
            return null;
        }
        return (C5738D) this.f67076b.a(cVar, new i(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C5738D f(j jVar, u uVar) {
        return new C5738D(jVar.f67075a, uVar);
    }

    public List a(c cVar) {
        C6496s.h(cVar, "fqName");
        return C6565s.r(e(cVar));
    }

    public void b(c cVar, Collection collection) {
        C6496s.h(cVar, "fqName");
        C6496s.h(collection, "packageFragments");
        Pg.a.a(collection, e(cVar));
    }

    public boolean c(c cVar) {
        C6496s.h(cVar, "fqName");
        if (C5686t.a(this.f67075a.a().d(), cVar, false, 2, (Object) null) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public List s(c cVar, C6798l lVar) {
        List list;
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        C5738D e10 = e(cVar);
        if (e10 != null) {
            list = e10.Q0();
        } else {
            list = null;
        }
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f67075a.a().m();
    }
}
