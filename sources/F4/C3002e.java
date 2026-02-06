package F4;

import C4.a;
import G4.c;
import u4.C4071k;

/* renamed from: F4.e  reason: case insensitive filesystem */
abstract class C3002e {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30696a = c.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30697b = c.a.a("ty", "v");

    private static a a(c cVar, C4071k kVar) {
        cVar.f();
        a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (cVar.q()) {
                    int T10 = cVar.T(f30697b);
                    if (T10 != 0) {
                        if (T10 != 1) {
                            cVar.U();
                            cVar.V();
                        } else if (z10) {
                            aVar = new a(C3001d.e(cVar, kVar));
                        } else {
                            cVar.V();
                        }
                    } else if (cVar.y() == 0) {
                        z10 = true;
                    }
                } else {
                    cVar.o();
                    return aVar;
                }
            }
        }
    }

    static a b(c cVar, C4071k kVar) {
        a aVar = null;
        while (cVar.q()) {
            if (cVar.T(f30696a) != 0) {
                cVar.U();
                cVar.V();
            } else {
                cVar.b();
                while (cVar.q()) {
                    a a10 = a(cVar, kVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.n();
            }
        }
        return aVar;
    }
}
