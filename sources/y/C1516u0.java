package Y;

import kotlin.jvm.internal.C6496s;

/* renamed from: Y.u0  reason: case insensitive filesystem */
public final class C1516u0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f10181a;

    public C1516u0(String str) {
        this.f10181a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1516u0) && C6496s.c(this.f10181a, ((C1516u0) obj).f10181a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f10181a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f10181a + ')';
    }
}
