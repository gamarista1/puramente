package F4;

import B4.b;
import B4.n;
import C4.m;
import G4.c;
import u4.C4071k;

abstract class E {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30679a = c.a.a("nm", "c", "o", "tr", "hd");

    static m a(c cVar, C4071k kVar) {
        String str = null;
        b bVar = null;
        b bVar2 = null;
        n nVar = null;
        boolean z10 = false;
        while (cVar.q()) {
            int T10 = cVar.T(f30679a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                bVar = C3001d.f(cVar, kVar, false);
            } else if (T10 == 2) {
                bVar2 = C3001d.f(cVar, kVar, false);
            } else if (T10 == 3) {
                nVar = C3000c.g(cVar, kVar);
            } else if (T10 != 4) {
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        return new m(str, bVar, bVar2, nVar, z10);
    }
}
