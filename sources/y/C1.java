package Y;

import kotlin.jvm.internal.C6496s;

public final class C1 implements G1 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9754a;

    public C1(Object obj) {
        this.f9754a = obj;
    }

    public Object a(B0 b02) {
        return this.f9754a;
    }

    public final Object b() {
        return this.f9754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1) && C6496s.c(this.f9754a, ((C1) obj).f9754a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f9754a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "StaticValueHolder(value=" + this.f9754a + ')';
    }
}
