package Fg;

import kotlin.jvm.internal.C6496s;

public abstract class B extends A {

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f62917b;

    public B(C5366d0 d0Var) {
        C6496s.h(d0Var, "delegate");
        this.f62917b = d0Var;
    }

    /* renamed from: U0 */
    public C5366d0 R0(boolean z10) {
        if (z10 == O0()) {
            return this;
        }
        return W0().U0(z10).V0(M0());
    }

    /* renamed from: V0 */
    public C5366d0 T0(r0 r0Var) {
        C6496s.h(r0Var, "newAttributes");
        if (r0Var != M0()) {
            return new C5370f0(this, r0Var);
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public C5366d0 W0() {
        return this.f62917b;
    }
}
