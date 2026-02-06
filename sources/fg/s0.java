package Fg;

import Fg.q0;
import Of.C5495m;
import Pf.h;
import kotlin.jvm.internal.C6496s;

public abstract class s0 {
    public static final r0 a(r0 r0Var, h hVar) {
        r0 z10;
        C6496s.h(r0Var, "<this>");
        C6496s.h(hVar, "newAnnotations");
        if (C5392t.a(r0Var) == hVar) {
            return r0Var;
        }
        C5391s b10 = C5392t.b(r0Var);
        if (!(b10 == null || (z10 = r0Var.z(b10)) == null)) {
            r0Var = z10;
        }
        if (hVar.iterator().hasNext() || !hVar.isEmpty()) {
            return r0Var.x(new C5391s(hVar));
        }
        return r0Var;
    }

    public static final r0 b(h hVar) {
        C6496s.h(hVar, "<this>");
        return q0.a.a(C5396x.f63077a, hVar, (v0) null, (C5495m) null, 6, (Object) null);
    }
}
