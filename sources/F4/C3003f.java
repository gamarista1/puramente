package F4;

import B4.f;
import B4.o;
import C4.b;
import G4.c;
import u4.C4071k;

/* renamed from: F4.f  reason: case insensitive filesystem */
abstract class C3003f {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30698a = c.a.a("nm", "p", "s", "hd", "d");

    static b a(c cVar, C4071k kVar, int i10) {
        boolean z10;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = z10;
        boolean z12 = false;
        String str = null;
        o oVar = null;
        f fVar = null;
        while (cVar.q()) {
            int T10 = cVar.T(f30698a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                oVar = C2998a.b(cVar, kVar);
            } else if (T10 == 2) {
                fVar = C3001d.i(cVar, kVar);
            } else if (T10 == 3) {
                z12 = cVar.t();
            } else if (T10 != 4) {
                cVar.U();
                cVar.V();
            } else if (cVar.y() == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return new b(str, oVar, fVar, z11, z12);
    }
}
