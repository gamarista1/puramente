package Rf;

import Of.H;
import Of.V;
import Pg.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.c;
import ng.f;
import yf.C6798l;
import yg.C6804c;
import yg.C6805d;
import yg.C6813l;

public class P extends C6813l {

    /* renamed from: b  reason: collision with root package name */
    private final H f64802b;

    /* renamed from: c  reason: collision with root package name */
    private final c f64803c;

    public P(H h10, c cVar) {
        C6496s.h(h10, "moduleDescriptor");
        C6496s.h(cVar, "fqName");
        this.f64802b = h10;
        this.f64803c = cVar;
    }

    public Collection f(C6805d dVar, C6798l lVar) {
        C6496s.h(dVar, "kindFilter");
        C6496s.h(lVar, "nameFilter");
        if (!dVar.a(C6805d.f73908c.f())) {
            return C6565s.n();
        }
        if (this.f64803c.d() && dVar.l().contains(C6804c.b.f73907a)) {
            return C6565s.n();
        }
        Collection<c> s10 = this.f64802b.s(this.f64803c, lVar);
        ArrayList arrayList = new ArrayList(s10.size());
        for (c g10 : s10) {
            f g11 = g10.g();
            C6496s.g(g11, "shortName(...)");
            if (((Boolean) lVar.invoke(g11)).booleanValue()) {
                a.a(arrayList, h(g11));
            }
        }
        return arrayList;
    }

    public Set g() {
        return Y.e();
    }

    /* access modifiers changed from: protected */
    public final V h(f fVar) {
        C6496s.h(fVar, "name");
        if (fVar.j()) {
            return null;
        }
        H h10 = this.f64802b;
        c c10 = this.f64803c.c(fVar);
        C6496s.g(c10, "child(...)");
        V l02 = h10.l0(c10);
        if (l02.isEmpty()) {
            return null;
        }
        return l02;
    }

    public String toString() {
        return "subpackages of " + this.f64803c + " from " + this.f64802b;
    }
}
