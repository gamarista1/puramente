package x;

import Y.C1500m;
import Y.C1506p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* renamed from: x.b  reason: case insensitive filesystem */
public abstract class C2863b {
    public static final C2855T a(C1500m mVar, int i10) {
        C2855T t10;
        if (C1506p.H()) {
            C1506p.Q(-1476348564, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:63)");
        }
        Context context = (Context) mVar.m(AndroidCompositionLocals_androidKt.g());
        C2853Q q10 = (C2853Q) mVar.m(C2854S.a());
        if (q10 != null) {
            mVar.T(1586021609);
            boolean S10 = mVar.S(context) | mVar.S(q10);
            Object A10 = mVar.A();
            if (S10 || A10 == C1500m.f10026a.a()) {
                A10 = new C2862a(context, q10);
                mVar.r(A10);
            }
            t10 = (C2862a) A10;
            mVar.M();
        } else {
            mVar.T(1586120933);
            mVar.M();
            t10 = C2852P.f27888a;
        }
        if (C1506p.H()) {
            C1506p.P();
        }
        return t10;
    }
}
