package X8;

import java.util.List;

final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    private final List f35450a;

    d(List list) {
        if (list != null) {
            this.f35450a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    public List c() {
        return this.f35450a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f35450a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f35450a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f35450a + "}";
    }
}
