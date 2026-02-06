package c1;

import d1.C1923a;

final class u implements C1923a {

    /* renamed from: a  reason: collision with root package name */
    private final float f19241a;

    public u(float f10) {
        this.f19241a = f10;
    }

    public float a(float f10) {
        return f10 / this.f19241a;
    }

    public float b(float f10) {
        return f10 * this.f19241a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && Float.compare(this.f19241a, ((u) obj).f19241a) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.f19241a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f19241a + ')';
    }
}
