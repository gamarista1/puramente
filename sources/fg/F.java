package Fg;

import Of.m0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import kotlin.jvm.internal.C6496s;

public abstract class F {
    public static /* synthetic */ B0 b(F f10, m0 m0Var, G g10, A0 a02, S s10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 8) != 0) {
                s10 = a02.e(m0Var, g10);
            }
            return f10.a(m0Var, g10, a02, s10);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
    }

    public B0 a(m0 m0Var, G g10, A0 a02, S s10) {
        C6496s.h(m0Var, "parameter");
        C6496s.h(g10, ReactProgressBarViewManager.PROP_ATTR);
        C6496s.h(a02, "typeParameterUpperBoundEraser");
        C6496s.h(s10, "erasedUpperBound");
        return new D0(N0.OUT_VARIANCE, s10);
    }
}
