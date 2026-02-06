package Fg;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.C6812k;

public abstract class O0 extends S {
    public O0() {
        super((DefaultConstructorMarker) null);
    }

    public List L0() {
        return R0().L0();
    }

    public r0 M0() {
        return R0().M0();
    }

    public v0 N0() {
        return R0().N0();
    }

    public boolean O0() {
        return R0().O0();
    }

    public final M0 Q0() {
        S R02 = R0();
        while (R02 instanceof O0) {
            R02 = ((O0) R02).R0();
        }
        C6496s.f(R02, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (M0) R02;
    }

    /* access modifiers changed from: protected */
    public abstract S R0();

    public abstract boolean S0();

    public C6812k o() {
        return R0().o();
    }

    public String toString() {
        if (S0()) {
            return R0().toString();
        }
        return "<Not computed yet>";
    }
}
