package qf;

import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import rf.C6680b;
import yf.p;

public abstract class f {
    public static final C6658d a(p pVar, Object obj, C6658d dVar) {
        C6496s.h(pVar, "<this>");
        C6496s.h(dVar, "completion");
        return new i(C6680b.c(C6680b.a(pVar, obj, dVar)), C6680b.f());
    }

    public static final void b(p pVar, Object obj, C6658d dVar) {
        C6496s.h(pVar, "<this>");
        C6496s.h(dVar, "completion");
        C6658d c10 = C6680b.c(C6680b.a(pVar, obj, dVar));
        v.a aVar = v.f71841b;
        c10.resumeWith(v.b(C6514M.f71813a));
    }
}
