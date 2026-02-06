package Mg;

import Mg.g;
import Of.C5507z;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public abstract class b {
    public final g a(C5507z zVar) {
        C6496s.h(zVar, "functionDescriptor");
        for (h hVar : b()) {
            if (hVar.b(zVar)) {
                return hVar.a(zVar);
            }
        }
        return g.a.f64146b;
    }

    public abstract List b();
}
