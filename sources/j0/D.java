package J0;

import G0.a;
import H0.C1180a;
import H0.C1192m;
import c1.n;

public abstract class D {
    /* access modifiers changed from: private */
    public static final int b(P p10, C1180a aVar) {
        boolean z10;
        int j10;
        P z12 = p10.z1();
        if (z12 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            a.b("Child of " + p10 + " cannot be null when calculating alignment line");
        }
        if (p10.E1().p().containsKey(aVar)) {
            Integer num = (Integer) p10.E1().p().get(aVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int k02 = z12.k0(aVar);
        if (k02 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        z12.T1(true);
        p10.S1(true);
        p10.R1();
        z12.T1(false);
        p10.S1(false);
        if (aVar instanceof C1192m) {
            j10 = n.k(z12.J1());
        } else {
            j10 = n.j(z12.J1());
        }
        return k02 + j10;
    }
}
