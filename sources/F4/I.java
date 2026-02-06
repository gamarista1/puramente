package F4;

import B4.a;
import B4.d;
import C4.p;
import G4.c;
import android.graphics.Path;
import java.util.Collections;
import u4.C4071k;

abstract class I {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30684a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    static p a(c cVar, C4071k kVar) {
        Path.FillType fillType;
        d dVar = null;
        String str = null;
        a aVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (cVar.q()) {
            int T10 = cVar.T(f30684a);
            if (T10 == 0) {
                str = cVar.F();
            } else if (T10 == 1) {
                aVar = C3001d.c(cVar, kVar);
            } else if (T10 == 2) {
                dVar = C3001d.h(cVar, kVar);
            } else if (T10 == 3) {
                z10 = cVar.t();
            } else if (T10 == 4) {
                i10 = cVar.y();
            } else if (T10 != 5) {
                cVar.U();
                cVar.V();
            } else {
                z11 = cVar.t();
            }
        }
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new I4.a(100)));
        }
        d dVar2 = dVar;
        if (i10 == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new p(str, z10, fillType, aVar, dVar2, z11);
    }
}
