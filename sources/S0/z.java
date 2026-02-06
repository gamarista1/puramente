package s0;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final float f25885a;

    /* renamed from: b  reason: collision with root package name */
    private final float f25886b;

    public z(float f10, float f11) {
        this.f25885a = f10;
        this.f25886b = f11;
    }

    public final float a() {
        return this.f25885a;
    }

    public final float b() {
        return this.f25886b;
    }

    public final float[] c() {
        float f10 = this.f25885a;
        float f11 = this.f25886b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (Float.compare(this.f25885a, zVar.f25885a) == 0 && Float.compare(this.f25886b, zVar.f25886b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f25885a) * 31) + Float.hashCode(this.f25886b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f25885a + ", y=" + this.f25886b + ')';
    }

    public z(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private z(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
