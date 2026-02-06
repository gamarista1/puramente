package C;

import k0.c;
import k0.i;

/* renamed from: C.j  reason: case insensitive filesystem */
public interface C1092j {
    static /* synthetic */ i c(C1092j jVar, i iVar, float f10, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            return jVar.a(iVar, f10, z10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    i a(i iVar, float f10, boolean z10);

    i b(i iVar, c.b bVar);
}
