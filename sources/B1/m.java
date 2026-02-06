package b1;

import Q0.D;
import e1.C1943b;
import r0.C2514n0;
import r0.C2544x0;
import r0.C2550z0;
import yf.C6787a;

public abstract class m {
    public static final n b(n nVar, n nVar2, float f10) {
        boolean z10 = nVar instanceof C1871c;
        if (!z10 && !(nVar2 instanceof C1871c)) {
            return n.f19132a.b(C2550z0.i(nVar.d(), nVar2.d(), f10));
        }
        if (!z10 || !(nVar2 instanceof C1871c)) {
            return (n) D.d(nVar, nVar2, f10);
        }
        return n.f19132a.a((C2514n0) D.d(((C1871c) nVar).f(), ((C1871c) nVar2).f(), f10), C1943b.b(nVar.a(), nVar2.a(), f10));
    }

    public static final long c(long j10, float f10) {
        if (Float.isNaN(f10) || f10 >= 1.0f) {
            return j10;
        }
        return C2544x0.o(j10, C2544x0.r(j10) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float d(float f10, C6787a aVar) {
        if (Float.isNaN(f10)) {
            return ((Number) aVar.invoke()).floatValue();
        }
        return f10;
    }
}
