package H0;

/* renamed from: H0.k  reason: case insensitive filesystem */
public final class C1190k implements C1187h {

    /* renamed from: b  reason: collision with root package name */
    private final float f2621b;

    public C1190k(float f10) {
        this.f2621b = f10;
    }

    public long a(long j10, long j11) {
        float f10 = this.f2621b;
        return c0.a(f10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1190k) && Float.compare(this.f2621b, ((C1190k) obj).f2621b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.f2621b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f2621b + ')';
    }
}
