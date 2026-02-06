package F4;

import B4.b;
import B4.f;
import B4.o;
import C4.l;
import G4.c;
import u4.C4071k;

abstract class D {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30678a = c.a.a("nm", "p", "s", "r", "hd");

    static l a(c cVar, C4071k kVar) {
        String str = null;
        o oVar = null;
        f fVar = null;
        b bVar = null;
        boolean z10 = false;
        while (cVar.q()) {
            int T10 = cVar.T(f30678a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                oVar = C2998a.b(cVar, kVar);
            } else if (T10 == 2) {
                fVar = C3001d.i(cVar, kVar);
            } else if (T10 == 3) {
                bVar = C3001d.e(cVar, kVar);
            } else if (T10 != 4) {
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        return new l(str, oVar, fVar, bVar, z10);
    }
}
