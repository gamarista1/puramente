package F4;

import C4.j;
import G4.c;

abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30741a = c.a.a("nm", "mm", "hd");

    static j a(c cVar) {
        String str = null;
        boolean z10 = false;
        j.a aVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30741a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                aVar = j.a.b(cVar.y());
            } else if (T10 != 2) {
                cVar.U();
                cVar.V();
            } else {
                z10 = cVar.t();
            }
        }
        return new j(str, aVar, z10);
    }
}
