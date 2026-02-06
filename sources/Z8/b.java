package Z8;

import Z8.g;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f35957a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35958b;

    b(g.a aVar, long j10) {
        if (aVar != null) {
            this.f35957a = aVar;
            this.f35958b = j10;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public long b() {
        return this.f35958b;
    }

    public g.a c() {
        return this.f35957a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.f35957a.equals(gVar.c()) || this.f35958b != gVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j10 = this.f35958b;
        return ((this.f35957a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f35957a + ", nextRequestWaitMillis=" + this.f35958b + "}";
    }
}
