package Xf;

import Lf.i;
import Of.C5484b;
import Of.g0;
import gg.C5943C;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import ng.f;
import vg.C6755e;

/* renamed from: Xf.f  reason: case insensitive filesystem */
public final class C5673f extends U {

    /* renamed from: o  reason: collision with root package name */
    public static final C5673f f66375o = new C5673f();

    private C5673f() {
    }

    /* access modifiers changed from: private */
    public static final boolean l(g0 g0Var, C5484b bVar) {
        C6496s.h(bVar, "it");
        return U.f66327a.j().containsKey(C5943C.d(g0Var));
    }

    public final f j(g0 g0Var) {
        C6496s.h(g0Var, "functionDescriptor");
        Map j10 = U.f66327a.j();
        String d10 = C5943C.d(g0Var);
        if (d10 == null) {
            return null;
        }
        return (f) j10.get(d10);
    }

    public final boolean k(g0 g0Var) {
        C6496s.h(g0Var, "functionDescriptor");
        if (!i.g0(g0Var) || C6755e.i(g0Var, false, new C5672e(g0Var), 1, (Object) null) == null) {
            return false;
        }
        return true;
    }

    public final boolean m(g0 g0Var) {
        C6496s.h(g0Var, "<this>");
        if (!C6496s.c(g0Var.getName().b(), "removeAt") || !C6496s.c(C5943C.d(g0Var), U.f66327a.h().d())) {
            return false;
        }
        return true;
    }
}
