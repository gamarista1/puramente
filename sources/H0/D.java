package H0;

import J0.G;
import J0.Q;
import kotlin.jvm.internal.C6496s;

public abstract class D {
    public static final Q a(Q q10) {
        G g10;
        G A12 = q10.A1();
        while (true) {
            G n02 = A12.n0();
            G g11 = null;
            if (n02 != null) {
                g10 = n02.a0();
            } else {
                g10 = null;
            }
            if (g10 != null) {
                G n03 = A12.n0();
                if (n03 != null) {
                    g11 = n03.a0();
                }
                C6496s.e(g11);
                if (g11.N0()) {
                    A12 = A12.n0();
                    C6496s.e(A12);
                } else {
                    G n04 = A12.n0();
                    C6496s.e(n04);
                    A12 = n04.a0();
                    C6496s.e(A12);
                }
            } else {
                Q z22 = A12.l0().z2();
                C6496s.e(z22);
                return z22;
            }
        }
    }
}
