package C;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

final class O extends C {

    /* renamed from: c  reason: collision with root package name */
    private final N f856c;

    public O(N n10) {
        super((DefaultConstructorMarker) null);
        this.f856c = n10;
    }

    public f0 a(f0 f0Var) {
        return h0.b(h0.c(this.f856c), f0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return C6496s.c(((O) obj).f856c, this.f856c);
    }

    public int hashCode() {
        return this.f856c.hashCode();
    }
}
