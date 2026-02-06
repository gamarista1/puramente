package D;

import E.C1144m;
import Y.C1500m;
import Y.C1506p;

public abstract class f {
    public static final C1144m a(A a10, int i10, C1500m mVar, int i11) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(-1877443446, i11, -1, "androidx.compose.foundation.lazy.rememberLazyListBeyondBoundsState (LazyListBeyondBoundsModifier.kt:26)");
        }
        boolean z11 = false;
        if ((((i11 & 14) ^ 6) <= 4 || !mVar.S(a10)) && (i11 & 6) != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((((i11 & 112) ^ 48) > 32 && mVar.d(i10)) || (i11 & 48) == 32) {
            z11 = true;
        }
        boolean z12 = z10 | z11;
        Object A10 = mVar.A();
        if (z12 || A10 == C1500m.f10026a.a()) {
            A10 = new g(a10, i10);
            mVar.r(A10);
        }
        g gVar = (g) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return gVar;
    }
}
