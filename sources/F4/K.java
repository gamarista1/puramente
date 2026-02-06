package F4;

import B4.h;
import C4.r;
import G4.c;
import u4.C4071k;

abstract class K {

    /* renamed from: a  reason: collision with root package name */
    static c.a f30686a = c.a.a("nm", "ind", "ks", "hd");

    static r a(c cVar, C4071k kVar) {
        String str = null;
        int i10 = 0;
        boolean z10 = false;
        h hVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30686a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                i10 = cVar.y();
            } else if (T10 == 2) {
                hVar = C3001d.k(cVar, kVar);
            } else if (T10 != 3) {
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        return new r(str, i10, hVar, z10);
    }
}
