package U;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final float f6223a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6224b;

    /* renamed from: c  reason: collision with root package name */
    private final float f6225c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6226d;

    public g(float f10, float f11, float f12, float f13) {
        this.f6223a = f10;
        this.f6224b = f11;
        this.f6225c = f12;
        this.f6226d = f13;
    }

    public final float a() {
        return this.f6223a;
    }

    public final float b() {
        return this.f6224b;
    }

    public final float c() {
        return this.f6225c;
    }

    public final float d() {
        return this.f6226d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f6223a == gVar.f6223a && this.f6224b == gVar.f6224b && this.f6225c == gVar.f6225c && this.f6226d == gVar.f6226d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f6223a) * 31) + Float.hashCode(this.f6224b)) * 31) + Float.hashCode(this.f6225c)) * 31) + Float.hashCode(this.f6226d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f6223a + ", focusedAlpha=" + this.f6224b + ", hoveredAlpha=" + this.f6225c + ", pressedAlpha=" + this.f6226d + ')';
    }
}
