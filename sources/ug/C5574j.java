package Ug;

import qf.e;
import qf.g;
import qf.h;
import yf.p;

/* renamed from: Ug.j  reason: case insensitive filesystem */
abstract /* synthetic */ class C5574j {
    public static final Object a(g gVar, p pVar) {
        g gVar2;
        C5567f0 f0Var;
        C5567f0 f0Var2;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) gVar.b(e.f72642c0);
        if (eVar == null) {
            f0Var = W0.f65337a.b();
            gVar2 = F.d(C5585o0.f65402a, gVar.n1(f0Var));
        } else {
            C5567f0 f0Var3 = null;
            if (eVar instanceof C5567f0) {
                f0Var2 = (C5567f0) eVar;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 != null) {
                if (f0Var2.O1()) {
                    f0Var3 = f0Var2;
                }
                if (f0Var3 != null) {
                    f0Var = f0Var3;
                    gVar2 = F.d(C5585o0.f65402a, gVar);
                }
            }
            f0Var = W0.f65337a.a();
            gVar2 = F.d(C5585o0.f65402a, gVar);
        }
        C5568g gVar3 = new C5568g(gVar2, currentThread, f0Var);
        gVar3.f1(M.DEFAULT, gVar3, pVar);
        return gVar3.g1();
    }

    public static /* synthetic */ Object b(g gVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f72645a;
        }
        return C5572i.e(gVar, pVar);
    }
}
