package I;

import c1.d;
import q0.C2427m;

final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    private final float f2669a;

    public e(float f10) {
        this.f2669a = f10;
        if (f10 < 0.0f || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    public float a(long j10, d dVar) {
        return C2427m.j(j10) * (this.f2669a / 100.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && Float.compare(this.f2669a, ((e) obj).f2669a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.f2669a);
    }

    public String toString() {
        return "CornerSize(size = " + this.f2669a + "%)";
    }
}
