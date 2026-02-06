package Z;

import Y.C1477d;
import Y.C1483f;
import Y.C1485f1;
import Y.C1506p;

public abstract class f {
    private static final int c(C1485f1 f1Var) {
        int i10;
        int a02 = f1Var.a0();
        int c02 = f1Var.c0();
        while (c02 >= 0 && !f1Var.r0(c02)) {
            c02 = f1Var.E0(c02);
        }
        int i11 = c02 + 1;
        int i12 = 0;
        while (i11 < a02) {
            if (f1Var.m0(a02, i11)) {
                if (f1Var.r0(i11)) {
                    i12 = 0;
                }
                i11++;
            } else {
                if (f1Var.r0(i11)) {
                    i10 = 1;
                } else {
                    i10 = f1Var.C0(i11);
                }
                i12 += i10;
                i11 += f1Var.k0(i11);
            }
        }
        return i12;
    }

    /* access modifiers changed from: private */
    public static final int d(C1485f1 f1Var, C1477d dVar, C1483f fVar) {
        boolean z10;
        int F10 = f1Var.F(dVar);
        boolean z11 = true;
        if (f1Var.a0() < F10) {
            z10 = true;
        } else {
            z10 = false;
        }
        C1506p.O(z10);
        e(f1Var, fVar, F10);
        int c10 = c(f1Var);
        while (f1Var.a0() < F10) {
            if (f1Var.l0(F10)) {
                if (f1Var.q0()) {
                    fVar.g(f1Var.A0(f1Var.a0()));
                    c10 = 0;
                }
                f1Var.g1();
            } else {
                c10 += f1Var.V0();
            }
        }
        if (f1Var.a0() != F10) {
            z11 = false;
        }
        C1506p.O(z11);
        return c10;
    }

    /* access modifiers changed from: private */
    public static final void e(C1485f1 f1Var, C1483f fVar, int i10) {
        while (!f1Var.n0(i10)) {
            f1Var.W0();
            if (f1Var.r0(f1Var.c0())) {
                fVar.i();
            }
            f1Var.T();
        }
    }
}
