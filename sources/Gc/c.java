package Gc;

import java.util.Set;

final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    private final Set f50842a;

    c(Set set) {
        if (set != null) {
            this.f50842a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    public Set b() {
        return this.f50842a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f50842a.equals(((e) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f50842a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f50842a + "}";
    }
}
