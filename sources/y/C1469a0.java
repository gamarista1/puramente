package Y;

import kotlin.jvm.internal.C6496s;

/* renamed from: Y.a0  reason: case insensitive filesystem */
public final class C1469a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9926a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f9927b;

    public C1469a0(Object obj, Object obj2) {
        this.f9926a = obj;
        this.f9927b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1469a0)) {
            return false;
        }
        C1469a0 a0Var = (C1469a0) obj;
        if (C6496s.c(this.f9926a, a0Var.f9926a) && C6496s.c(this.f9927b, a0Var.f9927b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (a(this.f9926a) * 31) + a(this.f9927b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f9926a + ", right=" + this.f9927b + ')';
    }
}
