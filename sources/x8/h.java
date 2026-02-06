package X8;

final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f35483a;

    h(long j10) {
        this.f35483a = j10;
    }

    public long c() {
        return this.f35483a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        if (this.f35483a == ((n) obj).c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f35483a;
        return ((int) (j10 ^ (j10 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f35483a + "}";
    }
}
