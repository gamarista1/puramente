package H;

import q0.C2423i;
import qf.C6658d;

public interface b {
    static /* synthetic */ Object a(b bVar, C2423i iVar, C6658d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                iVar = null;
            }
            return bVar.b(iVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
    }

    Object b(C2423i iVar, C6658d dVar);
}
