package z;

import qf.C6658d;
import x.C2848L;
import yf.p;

public interface y {
    static /* synthetic */ Object a(y yVar, C2848L l10, p pVar, C6658d dVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                l10 = C2848L.Default;
            }
            return yVar.e(l10, pVar, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
    }

    boolean b();

    boolean c() {
        return true;
    }

    boolean d() {
        return true;
    }

    Object e(C2848L l10, p pVar, C6658d dVar);

    float f(float f10);
}
