package Lf;

import Of.C5487e;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import ng.b;
import rg.C6691i;
import vg.C6755e;

public abstract class e {
    public static final boolean a(d dVar, C5487e eVar) {
        b bVar;
        C6496s.h(dVar, "<this>");
        C6496s.h(eVar, "classDescriptor");
        if (C6691i.x(eVar)) {
            Iterable b10 = dVar.b();
            b n10 = C6755e.n(eVar);
            if (n10 != null) {
                bVar = n10.e();
            } else {
                bVar = null;
            }
            if (C6565s.e0(b10, bVar)) {
                return true;
            }
        }
        return false;
    }
}
