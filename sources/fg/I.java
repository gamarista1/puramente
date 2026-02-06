package Fg;

import Jg.g;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qg.n;
import qg.w;
import yg.C6812k;

public abstract class I extends M0 implements g {

    /* renamed from: b  reason: collision with root package name */
    private final C5366d0 f62936b;

    /* renamed from: c  reason: collision with root package name */
    private final C5366d0 f62937c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public I(C5366d0 d0Var, C5366d0 d0Var2) {
        super((DefaultConstructorMarker) null);
        C6496s.h(d0Var, "lowerBound");
        C6496s.h(d0Var2, "upperBound");
        this.f62936b = d0Var;
        this.f62937c = d0Var2;
    }

    public List L0() {
        return U0().L0();
    }

    public r0 M0() {
        return U0().M0();
    }

    public v0 N0() {
        return U0().N0();
    }

    public boolean O0() {
        return U0().O0();
    }

    public abstract C5366d0 U0();

    public final C5366d0 V0() {
        return this.f62936b;
    }

    public final C5366d0 W0() {
        return this.f62937c;
    }

    public abstract String X0(n nVar, w wVar);

    public C6812k o() {
        return U0().o();
    }

    public String toString() {
        return n.f72702k.U(this);
    }
}
