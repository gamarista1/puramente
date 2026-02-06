package J0;

import k0.i;

/* renamed from: J0.d0  reason: case insensitive filesystem */
public abstract class C1237d0 {
    /* access modifiers changed from: private */
    public static final i.c b(C1244j jVar, int i10, int i11) {
        i.c J12 = jVar.v0().J1();
        if (J12 == null || (J12.I1() & i10) == 0) {
            return null;
        }
        while (J12 != null) {
            int N12 = J12.N1();
            if ((N12 & i11) != 0) {
                return null;
            }
            if ((N12 & i10) != 0) {
                return J12;
            }
            J12 = J12.J1();
        }
        return null;
    }
}
