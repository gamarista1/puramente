package Y;

import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public final class E implements G1 {

    /* renamed from: a  reason: collision with root package name */
    private final C6798l f9758a;

    public E(C6798l lVar) {
        this.f9758a = lVar;
    }

    public Object a(B0 b02) {
        return this.f9758a.invoke(b02);
    }

    public final C6798l b() {
        return this.f9758a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof E) && C6496s.c(this.f9758a, ((E) obj).f9758a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f9758a.hashCode();
    }

    public String toString() {
        return "ComputedValueHolder(compute=" + this.f9758a + ')';
    }
}
