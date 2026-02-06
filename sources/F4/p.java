package F4;

import B4.b;
import B4.d;
import B4.f;
import C4.e;
import C4.g;
import G4.c;
import I4.a;
import android.graphics.Path;
import java.util.Collections;
import u4.C4071k;

abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30720a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30721b = c.a.a("p", "k");

    static e a(c cVar, C4071k kVar) {
        d dVar;
        g gVar;
        Path.FillType fillType;
        d dVar2 = null;
        Path.FillType fillType2 = Path.FillType.WINDING;
        String str = null;
        g gVar2 = null;
        B4.c cVar2 = null;
        f fVar = null;
        f fVar2 = null;
        boolean z10 = false;
        while (cVar.q()) {
            switch (cVar.T(f30720a)) {
                case 0:
                    str = cVar.F();
                    break;
                case 1:
                    cVar.f();
                    int i10 = -1;
                    while (cVar.q()) {
                        int T10 = cVar.T(f30721b);
                        if (T10 == 0) {
                            i10 = cVar.y();
                        } else if (T10 != 1) {
                            cVar.U();
                            cVar.V();
                        } else {
                            cVar2 = C3001d.g(cVar, kVar, i10);
                        }
                    }
                    cVar.o();
                    break;
                case 2:
                    dVar2 = C3001d.h(cVar, kVar);
                    break;
                case 3:
                    if (cVar.y() == 1) {
                        gVar = g.LINEAR;
                    } else {
                        gVar = g.RADIAL;
                    }
                    gVar2 = gVar;
                    break;
                case 4:
                    fVar = C3001d.i(cVar, kVar);
                    break;
                case 5:
                    fVar2 = C3001d.i(cVar, kVar);
                    break;
                case 6:
                    if (cVar.y() == 1) {
                        fillType = Path.FillType.WINDING;
                    } else {
                        fillType = Path.FillType.EVEN_ODD;
                    }
                    fillType2 = fillType;
                    break;
                case 7:
                    z10 = cVar.t();
                    break;
                default:
                    cVar.U();
                    cVar.V();
                    break;
            }
        }
        if (dVar2 == null) {
            dVar = new d(Collections.singletonList(new a(100)));
        } else {
            dVar = dVar2;
        }
        return new e(str, gVar2, fillType2, cVar2, dVar, fVar, fVar2, (b) null, (b) null, z10);
    }
}
