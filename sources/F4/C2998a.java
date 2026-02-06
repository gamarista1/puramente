package F4;

import B4.b;
import B4.e;
import B4.i;
import B4.o;
import G4.c;
import H4.l;
import I4.a;
import java.util.ArrayList;
import u4.C4071k;

/* renamed from: F4.a  reason: case insensitive filesystem */
public abstract class C2998a {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30690a = c.a.a("k", "x", "y");

    public static e a(c cVar, C4071k kVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.M() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.q()) {
                arrayList.add(z.a(cVar, kVar));
            }
            cVar.n();
            u.b(arrayList);
        } else {
            arrayList.add(new a(s.e(cVar, l.e())));
        }
        return new e(arrayList);
    }

    static o b(c cVar, C4071k kVar) {
        cVar.f();
        e eVar = null;
        b bVar = null;
        boolean z10 = false;
        b bVar2 = null;
        while (cVar.M() != c.b.END_OBJECT) {
            int T10 = cVar.T(f30690a);
            if (T10 != 0) {
                if (T10 != 1) {
                    if (T10 != 2) {
                        cVar.U();
                        cVar.V();
                    } else if (cVar.M() == c.b.STRING) {
                        cVar.V();
                    } else {
                        bVar = C3001d.e(cVar, kVar);
                    }
                } else if (cVar.M() == c.b.STRING) {
                    cVar.V();
                } else {
                    bVar2 = C3001d.e(cVar, kVar);
                }
                z10 = true;
            } else {
                eVar = a(cVar, kVar);
            }
        }
        cVar.o();
        if (z10) {
            kVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new i(bVar2, bVar);
    }
}
