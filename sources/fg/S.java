package Fg;

import Gg.g;
import Gg.t;
import Jg.i;
import Pf.a;
import Pf.h;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yg.C6812k;

public abstract class S implements a, i {

    /* renamed from: a  reason: collision with root package name */
    private int f62971a;

    public /* synthetic */ S(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int K0() {
        if (W.a(this)) {
            return super.hashCode();
        }
        return (((N0().hashCode() * 31) + L0().hashCode()) * 31) + (O0() ? 1 : 0);
    }

    public abstract List L0();

    public abstract r0 M0();

    public abstract v0 N0();

    public abstract boolean O0();

    public abstract S P0(g gVar);

    public abstract M0 Q0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s10 = (S) obj;
        if (O0() != s10.O0() || !t.f63206a.a(Q0(), s10.Q0())) {
            return false;
        }
        return true;
    }

    public h getAnnotations() {
        return C5392t.a(M0());
    }

    public final int hashCode() {
        int i10 = this.f62971a;
        if (i10 != 0) {
            return i10;
        }
        int K02 = K0();
        this.f62971a = K02;
        return K02;
    }

    public abstract C6812k o();

    private S() {
    }
}
