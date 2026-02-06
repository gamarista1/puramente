package Mf;

import Eg.n;
import Mf.f;
import Of.C5487e;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yg.C6807f;

public final class d extends C6807f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(n nVar, b bVar) {
        super(nVar, bVar);
        C6496s.h(nVar, "storageManager");
        C6496s.h(bVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    public List j() {
        C5487e m10 = m();
        C6496s.f(m10, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f U02 = ((b) m10).U0();
        if (C6496s.c(U02, f.a.f64123e)) {
            return C6565s.e(e.f64118E.a((b) m(), false));
        }
        if (C6496s.c(U02, f.d.f64126e)) {
            return C6565s.e(e.f64118E.a((b) m(), true));
        }
        return C6565s.n();
    }
}
