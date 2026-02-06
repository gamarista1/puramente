package yg;

import Of.C5490h;
import Of.g0;
import Pg.j;
import Wf.b;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import yf.C6798l;

/* renamed from: yg.l  reason: case insensitive filesystem */
public abstract class C6813l implements C6812k {
    public Set a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : f(C6805d.f73927v, j.k())) {
            if (next instanceof g0) {
                f name = ((g0) next).getName();
                C6496s.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public Collection b(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return C6565s.n();
    }

    public Collection c(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return C6565s.n();
    }

    public Set d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object next : f(C6805d.f73928w, j.k())) {
            if (next instanceof g0) {
                f name = ((g0) next).getName();
                C6496s.g(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    public C5490h e(f fVar, b bVar) {
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        return null;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        return C6565s.n();
    }

    public Set g() {
        return null;
    }
}
