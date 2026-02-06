package F0;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final float f2123a;

    /* renamed from: b  reason: collision with root package name */
    private final float f2124b;

    /* renamed from: c  reason: collision with root package name */
    private final long f2125c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2126d;

    public b(float f10, float f11, long j10, int i10) {
        this.f2123a = f10;
        this.f2124b = f11;
        this.f2125c = j10;
        this.f2126d = i10;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.f2123a == this.f2123a && bVar.f2124b == this.f2124b && bVar.f2125c == this.f2125c && bVar.f2126d == this.f2126d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f2123a) * 31) + Float.hashCode(this.f2124b)) * 31) + Long.hashCode(this.f2125c)) * 31) + Integer.hashCode(this.f2126d);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.f2123a + ",horizontalScrollPixels=" + this.f2124b + ",uptimeMillis=" + this.f2125c + ",deviceId=" + this.f2126d + ')';
    }
}
