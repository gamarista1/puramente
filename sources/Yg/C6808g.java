package yg;

import Of.C5487e;
import Of.C5490h;
import Of.C5491i;
import Of.l0;
import Wf.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.f;
import yf.C6798l;

/* renamed from: yg.g  reason: case insensitive filesystem */
public final class C6808g extends C6813l {

    /* renamed from: b  reason: collision with root package name */
    private final C6812k f73942b;

    public C6808g(C6812k kVar) {
        C6496s.h(kVar, "workerScope");
        this.f73942b = kVar;
    }

    public Set a() {
        return this.f73942b.a();
    }

    public Set d() {
        return this.f73942b.d();
    }

    public C5490h e(f fVar, b bVar) {
        C5487e eVar;
        C6496s.h(fVar, "name");
        C6496s.h(bVar, "location");
        C5490h e10 = this.f73942b.e(fVar, bVar);
        if (e10 == null) {
            return null;
        }
        if (e10 instanceof C5487e) {
            eVar = (C5487e) e10;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (e10 instanceof l0) {
            return (l0) e10;
        }
        return null;
    }

    public Set g() {
        return this.f73942b.g();
    }

    /* renamed from: h */
    public List f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        C6805d n10 = dVar.n(C6805d.f73908c.c());
        if (n10 == null) {
            return C6565s.n();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : this.f73942b.f(n10, lVar)) {
            if (next instanceof C5491i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public String toString() {
        return "Classes from " + this.f73942b;
    }
}
