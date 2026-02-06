package Ug;

import ah.b;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class U0 {
    public static final C5605z a(C5600w0 w0Var) {
        return new T0(w0Var);
    }

    public static /* synthetic */ C5605z b(C5600w0 w0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            w0Var = null;
        }
        return a(w0Var);
    }

    public static final Object c(p pVar, C6658d dVar) {
        S0 s02 = new S0(dVar.getContext(), dVar);
        Object b10 = b.b(s02, s02, pVar);
        if (b10 == C6680b.f()) {
            h.c(dVar);
        }
        return b10;
    }
}
