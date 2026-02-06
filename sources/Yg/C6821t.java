package yg;

import Fg.E0;
import Fg.G0;
import Of.C5490h;
import Of.C5495m;
import Of.j0;
import Pg.a;
import Wf.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import lf.C6531o;
import ng.f;
import sg.C6721e;
import yf.C6798l;
import yg.C6815n;

/* renamed from: yg.t  reason: case insensitive filesystem */
public final class C6821t implements C6812k {

    /* renamed from: b  reason: collision with root package name */
    private final C6812k f73959b;

    /* renamed from: c  reason: collision with root package name */
    private final Lazy f73960c;

    /* renamed from: d  reason: collision with root package name */
    private final G0 f73961d;

    /* renamed from: e  reason: collision with root package name */
    private Map f73962e;

    /* renamed from: f  reason: collision with root package name */
    private final Lazy f73963f = C6531o.b(new C6820s(this));

    public C6821t(C6812k kVar, G0 g02) {
        C6496s.h(kVar, "workerScope");
        C6496s.h(g02, "givenSubstitutor");
        this.f73959b = kVar;
        this.f73960c = C6531o.b(new C6819r(g02));
        E0 j10 = g02.j();
        C6496s.g(j10, "getSubstitution(...)");
        this.f73961d = C6721e.h(j10, false, 1, (Object) null).c();
    }

    /* access modifiers changed from: private */
    public static final Collection h(C6821t tVar) {
        return tVar.m(C6815n.a.a(tVar.f73959b, (C6805d) null, (C6798l) null, 3, (Object) null));
    }

    private final Collection k() {
        return (Collection) this.f73963f.getValue();
    }

    private final C5495m l(C5495m mVar) {
        if (this.f73961d.k()) {
            return mVar;
        }
        if (this.f73962e == null) {
            this.f73962e = new HashMap();
        }
        Map map = this.f73962e;
        C6496s.e(map);
        Object obj = map.get(mVar);
        if (obj == null) {
            if (mVar instanceof j0) {
                obj = ((j0) mVar).c(this.f73961d);
                if (obj != null) {
                    map.put(mVar, obj);
                } else {
                    throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + mVar + " substitution fails");
                }
            } else {
                throw new IllegalStateException(("Unknown descriptor in scope: " + mVar).toString());
            }
        }
        C5495m mVar2 = (C5495m) obj;
        C6496s.f(mVar2, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return mVar2;
    }

    private final Collection m(Collection collection) {
        if (this.f73961d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet g10 = a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            g10.add(l((C5495m) it.next()));
        }
        return g10;
    }

    /* access modifiers changed from: private */
    public static final G0 n(G0 g02) {
        return g02.j().c();
    }

    public Set a() {
        return this.f73959b.a();
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return m(this.f73959b.b(fVar, bVar));
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return m(this.f73959b.c(fVar, bVar));
    }

    public Set d() {
        return this.f73959b.d();
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C5490h e10 = this.f73959b.e(fVar, bVar);
        if (e10 != null) {
            return (C5490h) l(e10);
        }
        return null;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return k();
    }

    public Set g() {
        return this.f73959b.g();
    }
}
