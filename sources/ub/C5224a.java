package ub;

/* renamed from: ub.a  reason: case insensitive filesystem */
final class C5224a extends r {

    /* renamed from: a  reason: collision with root package name */
    private final long f61674a;

    /* renamed from: b  reason: collision with root package name */
    private final long f61675b;

    /* renamed from: c  reason: collision with root package name */
    private final long f61676c;

    C5224a(long j10, long j11, long j12) {
        this.f61674a = j10;
        this.f61675b = j11;
        this.f61676c = j12;
    }

    public long b() {
        return this.f61675b;
    }

    public long c() {
        return this.f61674a;
    }

    public long d() {
        return this.f61676c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f61674a == rVar.c() && this.f61675b == rVar.b() && this.f61676c == rVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f61674a;
        long j11 = this.f61675b;
        long j12 = this.f61676c;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f61674a + ", elapsedRealtime=" + this.f61675b + ", uptimeMillis=" + this.f61676c + "}";
    }
}
