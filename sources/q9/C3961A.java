package q9;

/* renamed from: q9.A  reason: case insensitive filesystem */
public final class C3961A {

    /* renamed from: c  reason: collision with root package name */
    public static final C3961A f47788c = new C3961A(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f47789a;

    /* renamed from: b  reason: collision with root package name */
    public final long f47790b;

    public C3961A(long j10, long j11) {
        this.f47789a = j10;
        this.f47790b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3961A.class != obj.getClass()) {
            return false;
        }
        C3961A a10 = (C3961A) obj;
        if (this.f47789a == a10.f47789a && this.f47790b == a10.f47790b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f47789a) * 31) + ((int) this.f47790b);
    }

    public String toString() {
        return "[timeUs=" + this.f47789a + ", position=" + this.f47790b + "]";
    }
}
