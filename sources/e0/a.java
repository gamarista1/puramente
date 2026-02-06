package E0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private long f1714a;

    /* renamed from: b  reason: collision with root package name */
    private float f1715b;

    public a(long j10, float f10) {
        this.f1714a = j10;
        this.f1715b = f10;
    }

    public final float a() {
        return this.f1715b;
    }

    public final long b() {
        return this.f1714a;
    }

    public final void c(float f10) {
        this.f1715b = f10;
    }

    public final void d(long j10) {
        this.f1714a = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1714a == aVar.f1714a && Float.compare(this.f1715b, aVar.f1715b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Long.hashCode(this.f1714a) * 31) + Float.hashCode(this.f1715b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f1714a + ", dataPoint=" + this.f1715b + ')';
    }
}
