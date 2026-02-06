package F4;

import B4.b;
import B4.o;
import C4.k;
import G4.c;
import u4.C4071k;

abstract class C {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30677a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    static k a(c cVar, C4071k kVar, int i10) {
        boolean z10;
        c cVar2 = cVar;
        C4071k kVar2 = kVar;
        if (i10 == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = false;
        boolean z12 = z10;
        String str = null;
        k.a aVar = null;
        b bVar = null;
        o oVar = null;
        b bVar2 = null;
        b bVar3 = null;
        b bVar4 = null;
        b bVar5 = null;
        b bVar6 = null;
        while (cVar.q()) {
            switch (cVar2.T(f30677a)) {
                case 0:
                    str = cVar.F();
                    break;
                case 1:
                    aVar = k.a.b(cVar.y());
                    break;
                case 2:
                    bVar = C3001d.f(cVar2, kVar2, false);
                    break;
                case 3:
                    oVar = C2998a.b(cVar, kVar);
                    break;
                case 4:
                    bVar2 = C3001d.f(cVar2, kVar2, false);
                    break;
                case 5:
                    bVar4 = C3001d.e(cVar, kVar);
                    break;
                case 6:
                    bVar6 = C3001d.f(cVar2, kVar2, false);
                    break;
                case 7:
                    bVar3 = C3001d.e(cVar, kVar);
                    break;
                case 8:
                    bVar5 = C3001d.f(cVar2, kVar2, false);
                    break;
                case 9:
                    z11 = cVar.t();
                    break;
                case 10:
                    if (cVar.y() != 3) {
                        z12 = false;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                default:
                    cVar.U();
                    cVar.V();
                    break;
            }
        }
        return new k(str, aVar, bVar, oVar, bVar2, bVar3, bVar4, bVar5, bVar6, z11, z12);
    }
}
