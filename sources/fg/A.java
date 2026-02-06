package Fg;

import Gg.g;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import yg.C6812k;

public abstract class A extends C5366d0 {
    public List L0() {
        return W0().L0();
    }

    public r0 M0() {
        return W0().M0();
    }

    public v0 N0() {
        return W0().N0();
    }

    public boolean O0() {
        return W0().O0();
    }

    /* access modifiers changed from: protected */
    public abstract C5366d0 W0();

    /* renamed from: X0 */
    public C5366d0 S0(g gVar) {
        C6496s.h(gVar, "kotlinTypeRefiner");
        S h10 = gVar.h(W0());
        C6496s.f(h10, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return Y0((C5366d0) h10);
    }

    public abstract A Y0(C5366d0 d0Var);

    public C6812k o() {
        return W0().o();
    }
}
