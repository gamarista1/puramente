package D;

import k0.i;
import w.C2763G;

public interface c {
    static /* synthetic */ i a(c cVar, i iVar, float f10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            return cVar.b(iVar, f10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    i b(i iVar, float f10);

    i c(i iVar, C2763G g10, C2763G g11, C2763G g12);
}
