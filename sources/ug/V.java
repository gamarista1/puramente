package Ug;

import kotlin.coroutines.jvm.internal.h;
import lf.C6514M;
import qf.C6658d;
import qf.e;
import qf.g;
import rf.C6680b;

public abstract class V {
    public static final Object a(long j10, C6658d dVar) {
        if (j10 <= 0) {
            return C6514M.f71813a;
        }
        C5584o oVar = new C5584o(C6680b.c(dVar), 1);
        oVar.E();
        if (j10 < Long.MAX_VALUE) {
            b(oVar.getContext()).g0(j10, oVar);
        }
        Object v10 = oVar.v();
        if (v10 == C6680b.f()) {
            h.c(dVar);
        }
        if (v10 == C6680b.f()) {
            return v10;
        }
        return C6514M.f71813a;
    }

    public static final U b(g gVar) {
        U u10;
        g.b b10 = gVar.b(e.f72642c0);
        if (b10 instanceof U) {
            u10 = (U) b10;
        } else {
            u10 = null;
        }
        if (u10 == null) {
            return Q.a();
        }
        return u10;
    }
}
