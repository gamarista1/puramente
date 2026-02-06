package p4;

import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.C6535s;
import p4.g;
import yf.C6798l;

public abstract class f {
    public static final C6798l b(C3929d dVar) {
        C6496s.h(dVar, "<this>");
        return new C3930e(dVar);
    }

    /* access modifiers changed from: private */
    public static final C6514M c(C3929d dVar, g gVar) {
        C6496s.h(gVar, "result");
        if (gVar instanceof g.c) {
            g.c cVar = (g.c) gVar;
            dVar.a(cVar.a(), cVar.b(), cVar.c(), cVar.d());
        } else if (gVar instanceof g.b) {
            dVar.c(((g.b) gVar).a());
        } else if (gVar instanceof g.a) {
            dVar.b();
        } else {
            throw new C6535s();
        }
        return C6514M.f71813a;
    }
}
