package fg;

import Fg.A;
import Fg.C5360a0;
import Fg.C5366d0;
import Fg.I;
import Fg.J0;
import Fg.L0;
import Fg.M0;
import Fg.S;
import Fg.V;
import Fg.r0;
import Kg.d;
import kotlin.jvm.internal.C6496s;

/* renamed from: fg.j  reason: case insensitive filesystem */
public final class C5914j extends A implements C5360a0 {

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f67669b;

    public C5914j(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        this.f67669b = d0Var;
    }

    private final C5366d0 Z0(C5366d0 d0Var) {
        C5366d0 U02 = d0Var.U0(false);
        if (!d.y(d0Var)) {
            return U02;
        }
        return new C5914j(U02);
    }

    public boolean F0() {
        return true;
    }

    public boolean O0() {
        return false;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        if (z10) {
            return W0().U0(true);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public C5366d0 W0() {
        return this.f67669b;
    }

    /* renamed from: a1 */
    public C5914j V0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        return new C5914j(W0().V0(r0Var));
    }

    /* renamed from: b1 */
    public C5914j Y0(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        return new C5914j(d0Var);
    }

    public S m0(S s10) {
        C6496s.h(s10, "replacement");
        M0 Q02 = s10.Q0();
        if (!d.y(Q02) && !J0.l(Q02)) {
            return Q02;
        }
        if (Q02 instanceof C5366d0) {
            return Z0((C5366d0) Q02);
        }
        if (Q02 instanceof I) {
            I i10 = (I) Q02;
            return L0.d(V.e(Z0(i10.V0()), Z0(i10.W0())), L0.a(Q02));
        }
        throw new IllegalStateException(("Incorrect type: " + Q02).toString());
    }
}
