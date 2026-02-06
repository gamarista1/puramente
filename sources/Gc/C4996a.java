package gc;

import java.util.List;

/* renamed from: gc.a  reason: case insensitive filesystem */
final class C4996a extends r {

    /* renamed from: a  reason: collision with root package name */
    private final String f60605a;

    /* renamed from: b  reason: collision with root package name */
    private final List f60606b;

    C4996a(String str, List list) {
        if (str != null) {
            this.f60605a = str;
            if (list != null) {
                this.f60606b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public List b() {
        return this.f60606b;
    }

    public String c() {
        return this.f60605a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (!this.f60605a.equals(rVar.c()) || !this.f60606b.equals(rVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f60605a.hashCode() ^ 1000003) * 1000003) ^ this.f60606b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f60605a + ", usedDates=" + this.f60606b + "}";
    }
}
