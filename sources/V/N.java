package V;

import X.C1466i;
import X.C1467j;
import Y.C1500m;
import Y.C1506p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.g2;

public final class N {

    /* renamed from: a  reason: collision with root package name */
    public static final N f6763a = new N();

    /* renamed from: b  reason: collision with root package name */
    private static final float f6764b = C1466i.f9088a.a();

    private N() {
    }

    public final O a(float f10, float f11, float f12, float f13, C1500m mVar, int i10, int i11) {
        if ((i11 & 1) != 0) {
            f10 = C1467j.f9106a.b();
        }
        if ((i11 & 2) != 0) {
            f11 = C1467j.f9106a.h();
        }
        float f14 = f11;
        if ((i11 & 4) != 0) {
            f12 = C1467j.f9106a.f();
        }
        float f15 = f12;
        if ((i11 & 8) != 0) {
            f13 = C1467j.f9106a.g();
        }
        float f16 = f13;
        if (C1506p.H()) {
            C1506p.Q(-241106249, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:446)");
        }
        O o10 = new O(f10, f14, f15, f16, (DefaultConstructorMarker) null);
        if (C1506p.H()) {
            C1506p.P();
        }
        return o10;
    }

    public final long b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(1855656391, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-containerColor> (FloatingActionButton.kt:426)");
        }
        long h10 = C1404s.h(C1467j.f9106a.a(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return h10;
    }

    public final g2 c(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(-53247565, i10, -1, "androidx.compose.material3.FloatingActionButtonDefaults.<get-shape> (FloatingActionButton.kt:410)");
        }
        g2 d10 = C0.d(C1467j.f9106a.d(), mVar, 6);
        if (C1506p.H()) {
            C1506p.P();
        }
        return d10;
    }
}
