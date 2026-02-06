package Lb;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final long f51967a;

    public z(long j10) {
        this.f51967a = j10;
    }

    public long a() {
        return this.f51967a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass() && this.f51967a == ((z) obj).f51967a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f51967a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    public String toString() {
        return "Tag{tagNumber=" + this.f51967a + '}';
    }
}
