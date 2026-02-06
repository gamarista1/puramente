package G;

import E.F;
import Y.C1500m;
import Y.C1506p;

public abstract class z {
    public static final F a(C c10, boolean z10, C1500m mVar, int i10) {
        boolean z11;
        if (C1506p.H()) {
            C1506p.Q(-786344289, i10, -1, "androidx.compose.foundation.pager.rememberPagerSemanticState (PagerSemantics.kt:26)");
        }
        boolean z12 = false;
        if ((((i10 & 14) ^ 6) <= 4 || !mVar.S(c10)) && (i10 & 6) != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((((i10 & 112) ^ 48) > 32 && mVar.b(z10)) || (i10 & 48) == 32) {
            z12 = true;
        }
        boolean z13 = z11 | z12;
        Object A10 = mVar.A();
        if (z13 || A10 == C1500m.f10026a.a()) {
            A10 = C1178d.a(c10, z10);
            mVar.r(A10);
        }
        F f10 = (F) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return f10;
    }
}
