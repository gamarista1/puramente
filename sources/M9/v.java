package m9;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f46736a;

    /* renamed from: b  reason: collision with root package name */
    public final float f46737b;

    public v(int i10, float f10) {
        this.f46736a = i10;
        this.f46737b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f46736a == vVar.f46736a && Float.compare(vVar.f46737b, this.f46737b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f46736a) * 31) + Float.floatToIntBits(this.f46737b);
    }
}
