package u0;

import q0.C2415a;
import q0.C2422h;
import q0.C2425k;
import q0.C2428n;
import r0.O1;
import t0.C2605f;

/* renamed from: u0.e  reason: case insensitive filesystem */
public abstract class C2675e {
    public static final void a(C2605f fVar, C2673c cVar) {
        cVar.h(fVar.w1().f(), fVar.w1().i());
    }

    public static final void b(C2673c cVar, O1 o12) {
        if (o12 instanceof O1.b) {
            O1.b bVar = (O1.b) o12;
            cVar.R(C2422h.a(bVar.b().i(), bVar.b().l()), C2428n.a(bVar.b().n(), bVar.b().h()));
        } else if (o12 instanceof O1.a) {
            cVar.O(((O1.a) o12).b());
        } else if (o12 instanceof O1.c) {
            O1.c cVar2 = (O1.c) o12;
            if (cVar2.c() != null) {
                cVar.O(cVar2.c());
                return;
            }
            C2425k b10 = cVar2.b();
            cVar.W(C2422h.a(b10.e(), b10.g()), C2428n.a(b10.j(), b10.d()), C2415a.d(b10.b()));
        }
    }
}
