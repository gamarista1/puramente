package C;

import k0.c;
import k0.i;

public interface Y {
    static /* synthetic */ i b(Y y10, i iVar, float f10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return y10.a(iVar, f10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    i a(i iVar, float f10, boolean z10);

    i c(i iVar, c.C0368c cVar);
}
