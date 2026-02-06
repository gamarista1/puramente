package N0;

import G0.a;
import H0.C1197s;
import H0.C1198t;
import J0.C1235c0;
import O0.h;
import O0.i;
import O0.k;
import O0.q;
import a0.C1538b;
import androidx.compose.ui.platform.C1645k1;
import java.util.List;
import lf.C6527k;
import yf.C6798l;
import yf.p;

public abstract class n {
    private static final boolean a(O0.n nVar) {
        p c10 = c(nVar);
        h hVar = (h) k.a(nVar.w(), q.f4613a.I());
        if (c10 == null || hVar == null || ((Number) hVar.a().invoke()).floatValue() <= 0.0f) {
            return false;
        }
        return true;
    }

    private static final List b(O0.n nVar) {
        return nVar.l(false, false, false);
    }

    public static final p c(O0.n nVar) {
        return (p) k.a(nVar.w(), i.f4556a.u());
    }

    private static final void d(O0.n nVar, int i10, C6798l lVar) {
        C1538b bVar = new C1538b(new O0.n[16], 0);
        List b10 = b(nVar);
        while (true) {
            bVar.f(bVar.q(), b10);
            while (bVar.t()) {
                O0.n nVar2 = (O0.n) bVar.y(bVar.q() - 1);
                if (C1645k1.g(nVar2) && !nVar2.w().g(q.f4613a.f())) {
                    C1235c0 e10 = nVar2.e();
                    if (e10 != null) {
                        C1197s C12 = e10.C1();
                        c1.p b11 = c1.q.b(C1198t.c(C12));
                        if (b11.l()) {
                            continue;
                        } else if (!a(nVar2)) {
                            b10 = b(nVar2);
                        } else {
                            int i11 = i10 + 1;
                            lVar.invoke(new m(nVar2, i11, b11, C12));
                            d(nVar2, i11, lVar);
                        }
                    } else {
                        a.c("Expected semantics node to have a coordinator.");
                        throw new C6527k();
                    }
                }
            }
            return;
        }
    }

    static /* synthetic */ void e(O0.n nVar, int i10, C6798l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(nVar, i10, lVar);
    }
}
