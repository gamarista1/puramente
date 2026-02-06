package F4;

import C4.q;
import G4.c;
import java.util.ArrayList;
import u4.C4071k;

abstract class J {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30685a = c.a.a("nm", "hd", "it");

    static q a(c cVar, C4071k kVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.q()) {
            int T10 = cVar.T(f30685a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                z10 = cVar.t();
            } else if (T10 != 2) {
                cVar.V();
            } else {
                cVar.b();
                while (cVar.q()) {
                    C4.c a10 = C3005h.a(cVar, kVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.n();
            }
        }
        return new q(str, arrayList, z10);
    }
}
