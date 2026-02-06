package Of;

import Rg.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import yf.C6798l;

public final class S implements U {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f64467a;

    public S(Collection collection) {
        C6496s.h(collection, "packageFragments");
        this.f64467a = collection;
    }

    /* access modifiers changed from: private */
    public static final c f(N n10) {
        C6496s.h(n10, "it");
        return n10.f();
    }

    /* access modifiers changed from: private */
    public static final boolean g(c cVar, c cVar2) {
        C6496s.h(cVar2, "it");
        if (cVar2.d() || !C6496s.c(cVar2.e(), cVar)) {
            return false;
        }
        return true;
    }

    public List a(c cVar) {
        C6496s.h(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f64467a) {
            if (C6496s.c(((N) next).f(), cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public void b(c cVar, Collection collection) {
        C6496s.h(cVar, "fqName");
        C6496s.h(collection, "packageFragments");
        for (Object next : this.f64467a) {
            if (C6496s.c(((N) next).f(), cVar)) {
                collection.add(next);
            }
        }
    }

    public boolean c(c cVar) {
        C6496s.h(cVar, "fqName");
        Iterable<N> iterable = this.f64467a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (N f10 : iterable) {
            if (C6496s.c(f10.f(), cVar)) {
                return false;
            }
        }
        return true;
    }

    public Collection s(c cVar, C6798l lVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        return k.G(k.o(k.x(C6565s.b0(this.f64467a), P.f64465a), new Q(cVar)));
    }
}
