package U8;

import r0.C2550z0;
import yf.C6798l;

public interface b {
    static /* synthetic */ void a(b bVar, long j10, boolean z10, C6798l lVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                if (C2550z0.j(j10) > 0.5f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if ((i10 & 4) != 0) {
                lVar = c.f34432b;
            }
            bVar.b(j10, z10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setStatusBarColor-ek8zF_U");
    }

    void b(long j10, boolean z10, C6798l lVar);

    void c(boolean z10);
}
