package Ef;

final class d implements e {

    /* renamed from: a  reason: collision with root package name */
    private final float f62815a;

    /* renamed from: b  reason: collision with root package name */
    private final float f62816b;

    public d(float f10, float f11) {
        this.f62815a = f10;
        this.f62816b = f11;
    }

    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* renamed from: c */
    public Float g() {
        return Float.valueOf(this.f62816b);
    }

    /* renamed from: d */
    public Float a() {
        return Float.valueOf(this.f62815a);
    }

    public boolean e(float f10, float f11) {
        if (f10 <= f11) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (!(this.f62815a == dVar.f62815a && this.f62816b == dVar.f62816b)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f62815a) * 31) + Float.hashCode(this.f62816b);
    }

    public boolean isEmpty() {
        if (this.f62815a > this.f62816b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f62815a + ".." + this.f62816b;
    }
}
