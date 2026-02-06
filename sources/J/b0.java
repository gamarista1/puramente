package J;

import q0.C2421g;
import q0.C2422h;
import q0.C2423i;

public abstract class b0 {
    /* access modifiers changed from: private */
    public static final long b(long j10, C2423i iVar) {
        float f10;
        float f11;
        if (C2421g.m(j10) < iVar.i()) {
            f10 = iVar.i();
        } else if (C2421g.m(j10) > iVar.j()) {
            f10 = iVar.j();
        } else {
            f10 = C2421g.m(j10);
        }
        if (C2421g.n(j10) < iVar.l()) {
            f11 = iVar.l();
        } else if (C2421g.n(j10) > iVar.e()) {
            f11 = iVar.e();
        } else {
            f11 = C2421g.n(j10);
        }
        return C2422h.a(f10, f11);
    }
}
