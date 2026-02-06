package z;

import Y.C1500m;
import Y.C1506p;
import c1.t;
import k0.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v.C2742y;
import w.C2814z;
import x.C2855T;
import x.C2863b;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f29064a = new x();

    private x() {
    }

    public final n a(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1107739818, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:570)");
        }
        C2814z b10 = C2742y.b(mVar, 0);
        boolean S10 = mVar.S(b10);
        Object A10 = mVar.A();
        if (S10 || A10 == C1500m.f10026a.a()) {
            A10 = new C2950h(b10, (l) null, 2, (DefaultConstructorMarker) null);
            mVar.r(A10);
        }
        C2950h hVar = (C2950h) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return hVar;
    }

    public final C2855T b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1809802212, i10, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:583)");
        }
        C2855T a10 = C2863b.a(mVar, 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return a10;
    }

    public final boolean c(t tVar, q qVar, boolean z10) {
        boolean z11 = !z10;
        if (tVar != t.Rtl || qVar == q.Vertical) {
            return z11;
        }
        return z10;
    }
}
