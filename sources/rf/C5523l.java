package Rf;

import Of.O;
import Of.T;
import Of.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.c;
import yf.C6798l;

/* renamed from: Rf.l  reason: case insensitive filesystem */
public final class C5523l implements U {

    /* renamed from: a  reason: collision with root package name */
    private final List f64870a;

    /* renamed from: b  reason: collision with root package name */
    private final String f64871b;

    public C5523l(List list, String str) {
        C6496s.h(list, "providers");
        C6496s.h(str, "debugName");
        this.f64870a = list;
        this.f64871b = str;
        list.size();
        C6565s.j1(list).size();
    }

    public List a(c cVar) {
        C6496s.h(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (O a10 : this.f64870a) {
            T.a(a10, cVar, arrayList);
        }
        return C6565s.e1(arrayList);
    }

    public void b(c cVar, Collection collection) {
        C6496s.h(cVar, "fqName");
        C6496s.h(collection, "packageFragments");
        for (O a10 : this.f64870a) {
            T.a(a10, cVar, collection);
        }
    }

    public boolean c(c cVar) {
        C6496s.h(cVar, "fqName");
        Iterable<O> iterable = this.f64870a;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (O b10 : iterable) {
            if (!T.b(b10, cVar)) {
                return false;
            }
        }
        return true;
    }

    public Collection s(c cVar, C6798l lVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (O s10 : this.f64870a) {
            hashSet.addAll(s10.s(cVar, lVar));
        }
        return hashSet;
    }

    public String toString() {
        return this.f64871b;
    }
}
