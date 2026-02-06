package J0;

import k0.i;

public abstract class J {
    /* access modifiers changed from: private */
    public static final i.c b(C1244j jVar) {
        int a10 = C1239e0.a(4);
        int a11 = C1239e0.a(2);
        i.c J12 = jVar.v0().J1();
        if (J12 == null || (J12.I1() & a10) == 0) {
            return null;
        }
        while (J12 != null && (J12.N1() & a11) == 0) {
            if ((J12.N1() & a10) != 0) {
                return J12;
            }
            J12 = J12.J1();
        }
        return null;
    }
}
