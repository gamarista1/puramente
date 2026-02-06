package v;

import Y.C1500m;
import Y.C1506p;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.C1644k0;
import c1.d;
import w.C2758B;
import w.C2814z;

/* renamed from: v.y  reason: case insensitive filesystem */
public abstract class C2742y {

    /* renamed from: a  reason: collision with root package name */
    private static final float f26902a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f26902a;
    }

    public static final C2814z b(C1500m mVar, int i10) {
        if (C1506p.H()) {
            C1506p.Q(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) mVar.m(C1644k0.e());
        boolean c10 = mVar.c(dVar.getDensity());
        Object A10 = mVar.A();
        if (c10 || A10 == C1500m.f10026a.a()) {
            A10 = C2758B.b(new C2741x(dVar));
            mVar.r(A10);
        }
        C2814z zVar = (C2814z) A10;
        if (C1506p.H()) {
            C1506p.P();
        }
        return zVar;
    }
}
