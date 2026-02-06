package G;

import E.C1144m;
import Y.C1500m;
import Y.C1506p;

public abstract class h {
    public static final C1144m a(C c10, int i10, C1500m mVar, int i11) {
        boolean z10;
        if (C1506p.H()) {
            C1506p.Q(373558254, i11, -1, "androidx.compose.foundation.pager.rememberPagerBeyondBoundsState (PagerBeyondBoundsModifier.kt:25)");
        }
        boolean z11 = false;
        if ((((i11 & 14) ^ 6) <= 4 || !mVar.S(c10)) && (i11 & 6) != 4) {
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
            A10 = new i(c10, i10);
            mVar.r(A10);
        }
        i iVar = (i) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return iVar;
    }
}
