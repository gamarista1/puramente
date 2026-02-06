package Ug;

import Zg.C5722k;
import qf.C6658d;

/* renamed from: Ug.q  reason: case insensitive filesystem */
public abstract class C5588q {
    public static final void a(C5582n nVar, C5559b0 b0Var) {
        c(nVar, new C5561c0(b0Var));
    }

    public static final C5584o b(C6658d dVar) {
        if (!(dVar instanceof C5722k)) {
            return new C5584o(dVar, 1);
        }
        C5584o j10 = ((C5722k) dVar).j();
        if (j10 != null) {
            if (!j10.P()) {
                j10 = null;
            }
            if (j10 != null) {
                return j10;
            }
        }
        return new C5584o(dVar, 2);
    }

    public static final void c(C5582n nVar, C5580m mVar) {
        if (nVar instanceof C5584o) {
            ((C5584o) nVar).I(mVar);
            return;
        }
        throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
    }
}
