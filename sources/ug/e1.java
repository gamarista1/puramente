package Ug;

import ah.b;
import kotlin.coroutines.jvm.internal.h;
import qf.C6658d;
import rf.C6680b;
import yf.p;

public abstract class e1 {
    public static final c1 a(long j10, U u10, C5600w0 w0Var) {
        return new c1("Timed out waiting for " + j10 + " ms", w0Var);
    }

    private static final Object b(d1 d1Var, p pVar) {
        A0.k(d1Var, V.b(d1Var.f66946d.getContext()).I0(d1Var.f65357e, d1Var, d1Var.getContext()));
        return b.c(d1Var, d1Var, pVar);
    }

    public static final Object c(long j10, p pVar, C6658d dVar) {
        if (j10 > 0) {
            Object b10 = b(new d1(j10, dVar), pVar);
            if (b10 == C6680b.f()) {
                h.c(dVar);
            }
            return b10;
        }
        throw new c1("Timed out immediately");
    }
}
