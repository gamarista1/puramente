package Y;

import kotlin.jvm.internal.C6496s;

public final class O implements G1 {

    /* renamed from: a  reason: collision with root package name */
    private final C1510r0 f9809a;

    public O(C1510r0 r0Var) {
        this.f9809a = r0Var;
    }

    public Object a(B0 b02) {
        return this.f9809a.getValue();
    }

    public final C1510r0 b() {
        return this.f9809a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof O) && C6496s.c(this.f9809a, ((O) obj).f9809a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9809a.hashCode();
    }

    public String toString() {
        return "DynamicValueHolder(state=" + this.f9809a + ')';
    }
}
