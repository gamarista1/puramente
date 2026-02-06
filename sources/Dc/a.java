package Dc;

import java.util.Set;

final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final Set f50580a;

    a(Set set) {
        if (set != null) {
            this.f50580a = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public Set b() {
        return this.f50580a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return this.f50580a.equals(((b) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f50580a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ConfigUpdate{updatedKeys=" + this.f50580a + "}";
    }
}
