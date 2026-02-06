package F4;

import B4.b;
import C4.n;
import G4.c;
import u4.C4071k;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30680a = c.a.a("nm", "r", "hd");

    static n a(c cVar, C4071k kVar) {
        boolean z10 = false;
        String str = null;
        b bVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30680a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                bVar = C3001d.f(cVar, kVar, true);
            } else if (T10 != 2) {
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        if (z10) {
            return null;
        }
        return new n(str, bVar);
    }
}
