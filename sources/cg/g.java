package cg;

import Fg.A0;
import Fg.B0;
import Fg.D0;
import Fg.F;
import Fg.G;
import Fg.J0;
import Fg.N0;
import Fg.S;
import Of.m0;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import vg.C6755e;

public final class g extends F {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f67347a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                cg.c[] r0 = cg.C5800c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cg.c r1 = cg.C5800c.FLEXIBLE_LOWER_BOUND     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cg.c r1 = cg.C5800c.FLEXIBLE_UPPER_BOUND     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cg.c r1 = cg.C5800c.INFLEXIBLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f67347a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cg.g.a.<clinit>():void");
        }
    }

    public B0 a(m0 m0Var, G g10, A0 a02, S s10) {
        C6496s.h(m0Var, "parameter");
        C6496s.h(g10, ReactProgressBarViewManager.PROP_ATTR);
        C6496s.h(a02, "typeParameterUpperBoundEraser");
        C6496s.h(s10, "erasedUpperBound");
        if (!(g10 instanceof C5798a)) {
            return super.a(m0Var, g10, a02, s10);
        }
        C5798a aVar = (C5798a) g10;
        if (!aVar.i()) {
            aVar = aVar.l(C5800c.INFLEXIBLE);
        }
        int i10 = a.f67347a[aVar.g().ordinal()];
        if (i10 == 1) {
            return new D0(N0.INVARIANT, s10);
        }
        if (i10 != 2 && i10 != 3) {
            throw new C6535s();
        } else if (!m0Var.n().b()) {
            return new D0(N0.INVARIANT, C6755e.m(m0Var).H());
        } else {
            List parameters = s10.N0().getParameters();
            C6496s.g(parameters, "getParameters(...)");
            if (!parameters.isEmpty()) {
                return new D0(N0.OUT_VARIANCE, s10);
            }
            B0 t10 = J0.t(m0Var, aVar);
            C6496s.e(t10);
            return t10;
        }
    }
}
