package Nf;

import Lf.i;
import Lf.o;
import Of.C5487e;
import java.util.Collection;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.Y;
import ng.b;
import ng.c;
import rg.C6691i;
import vg.C6755e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f64275a = new d();

    private d() {
    }

    public static /* synthetic */ C5487e f(d dVar, c cVar, i iVar, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return dVar.e(cVar, iVar, num);
    }

    public final C5487e a(C5487e eVar) {
        C6496s.h(eVar, "mutable");
        c o10 = c.f64255a.o(C6691i.m(eVar));
        if (o10 != null) {
            C5487e o11 = C6755e.m(eVar).o(o10);
            C6496s.g(o11, "getBuiltInClassByFqName(...)");
            return o11;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "mutable" + " collection");
    }

    public final C5487e b(C5487e eVar) {
        C6496s.h(eVar, "readOnly");
        c p10 = c.f64255a.p(C6691i.m(eVar));
        if (p10 != null) {
            C5487e o10 = C6755e.m(eVar).o(p10);
            C6496s.g(o10, "getBuiltInClassByFqName(...)");
            return o10;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + "read-only" + " collection");
    }

    public final boolean c(C5487e eVar) {
        C6496s.h(eVar, "mutable");
        return c.f64255a.k(C6691i.m(eVar));
    }

    public final boolean d(C5487e eVar) {
        C6496s.h(eVar, "readOnly");
        return c.f64255a.l(C6691i.m(eVar));
    }

    public final C5487e e(c cVar, i iVar, Integer num) {
        b bVar;
        C6496s.h(cVar, "fqName");
        C6496s.h(iVar, "builtIns");
        if (num == null || !C6496s.c(cVar, c.f64255a.h())) {
            bVar = c.f64255a.m(cVar);
        } else {
            bVar = o.a(num.intValue());
        }
        if (bVar != null) {
            return iVar.o(bVar.a());
        }
        return null;
    }

    public final Collection g(c cVar, i iVar) {
        C6496s.h(cVar, "fqName");
        C6496s.h(iVar, "builtIns");
        C5487e f10 = f(this, cVar, iVar, (Integer) null, 4, (Object) null);
        if (f10 == null) {
            return Y.e();
        }
        c p10 = c.f64255a.p(C6755e.p(f10));
        if (p10 == null) {
            return Y.d(f10);
        }
        return C6565s.q(f10, iVar.o(p10));
    }
}
