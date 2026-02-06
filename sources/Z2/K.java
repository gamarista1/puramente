package z2;

public final class K {

    /* renamed from: c  reason: collision with root package name */
    public static final K f29111c = new K(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f29112a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29113b;

    public K(long j10, long j11) {
        this.f29112a = j10;
        this.f29113b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        if (this.f29112a == k10.f29112a && this.f29113b == k10.f29113b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f29112a) * 31) + ((int) this.f29113b);
    }

    public String toString() {
        return "[timeUs=" + this.f29112a + ", position=" + this.f29113b + "]";
    }
}
