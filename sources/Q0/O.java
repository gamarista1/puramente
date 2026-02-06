package Q0;

import V0.h;
import Y.C1500m;
import Y.C1506p;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import c1.t;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    private static final int f5289a = 8;

    public static final N a(int i10, C1500m mVar, int i11, int i12) {
        boolean z10 = true;
        if ((i12 & 1) != 0) {
            i10 = f5289a;
        }
        if (C1506p.H()) {
            C1506p.Q(1538166871, i11, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:45)");
        }
        h.b bVar = (h.b) mVar.m(C1644k0.g());
        d dVar = (d) mVar.m(C1644k0.e());
        t tVar = (t) mVar.m(C1644k0.k());
        boolean S10 = mVar.S(bVar) | mVar.S(dVar) | mVar.S(tVar);
        if ((((i11 & 14) ^ 6) <= 4 || !mVar.d(i10)) && (i11 & 6) != 4) {
            z10 = false;
        }
        boolean z11 = S10 | z10;
        Object A10 = mVar.A();
        if (z11 || A10 == C1500m.f10026a.a()) {
            A10 = new N(bVar, dVar, tVar, i10);
            mVar.r(A10);
        }
        N n10 = (N) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return n10;
    }
}
