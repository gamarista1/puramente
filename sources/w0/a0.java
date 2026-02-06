package W0;

import Q0.C1321d;
import kotlin.jvm.internal.C6496s;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f8547a;

    /* renamed from: b  reason: collision with root package name */
    private final I f8548b;

    public a0(C1321d dVar, I i10) {
        this.f8547a = dVar;
        this.f8548b = i10;
    }

    public final I a() {
        return this.f8548b;
    }

    public final C1321d b() {
        return this.f8547a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (C6496s.c(this.f8547a, a0Var.f8547a) && C6496s.c(this.f8548b, a0Var.f8548b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8547a.hashCode() * 31) + this.f8548b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + this.f8547a + ", offsetMapping=" + this.f8548b + ')';
    }
}
