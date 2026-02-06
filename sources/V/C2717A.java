package v;

import Y.A1;
import Y.C1500m;
import Y.C1506p;
import r0.C2544x0;
import w.C2769M;
import w.C2770N;
import w.C2771O;
import w.r0;

/* renamed from: v.A  reason: case insensitive filesystem */
public abstract class C2717A {
    public static final A1 a(C2770N n10, long j10, long j11, C2769M m10, String str, C1500m mVar, int i10, int i11) {
        String str2;
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str2 = "ColorAnimation";
        } else {
            str2 = str;
        }
        if (C1506p.H()) {
            C1506p.Q(1901963533, i12, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        Object A10 = mVar.A();
        if (A10 == C1500m.f10026a.a()) {
            A10 = (r0) C2725h.a(C2544x0.f25560b).invoke(C2544x0.t(j11));
            mVar.r(A10);
        } else {
            C1500m mVar2 = mVar;
        }
        int i13 = i12 << 3;
        C2770N n11 = n10;
        A1 b10 = C2771O.b(n11, C2544x0.k(j10), C2544x0.k(j11), (r0) A10, m10, str2, mVar, C2770N.f27201f | (i12 & 14) | (i12 & 112) | (i12 & 896) | (C2769M.f27197d << 12) | (57344 & i13) | (i13 & 458752), 0);
        if (C1506p.H()) {
            C1506p.P();
        }
        return b10;
    }
}
