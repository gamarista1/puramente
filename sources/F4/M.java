package F4;

import B4.b;
import C4.t;
import G4.c;
import u4.C4071k;

abstract class M {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30689a = c.a.a("s", "e", "o", "nm", "m", "hd");

    static t a(c cVar, C4071k kVar) {
        String str = null;
        t.a aVar = null;
        b bVar = null;
        b bVar2 = null;
        b bVar3 = null;
        boolean z10 = false;
        while (cVar.q()) {
            int T10 = cVar.T(f30689a);
            if (T10 == 0) {
                bVar = C3001d.f(cVar, kVar, false);
            } else if (T10 == 1) {
                bVar2 = C3001d.f(cVar, kVar, false);
            } else if (T10 == 2) {
                bVar3 = C3001d.f(cVar, kVar, false);
            } else if (T10 == 3) {
                str = cVar.F();
            } else if (T10 == 4) {
                aVar = t.a.b(cVar.y());
            } else if (T10 != 5) {
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        return new t(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
