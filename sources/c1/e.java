package c1;

final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final float f19208a;

    /* renamed from: b  reason: collision with root package name */
    private final float f19209b;

    public e(float f10, float f11) {
        this.f19208a = f10;
        this.f19209b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(this.f19208a, eVar.f19208a) == 0 && Float.compare(this.f19209b, eVar.f19209b) == 0) {
            return true;
        }
        return false;
    }

    public float getDensity() {
        return this.f19208a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f19208a) * 31) + Float.hashCode(this.f19209b);
    }

    public float r1() {
        return this.f19209b;
    }

    public String toString() {
        return "DensityImpl(density=" + this.f19208a + ", fontScale=" + this.f19209b + ')';
    }
}
