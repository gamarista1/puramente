package f2;

/* renamed from: f2.f  reason: case insensitive filesystem */
public final class C1971f {

    /* renamed from: a  reason: collision with root package name */
    public final int f19969a;

    /* renamed from: b  reason: collision with root package name */
    public final float f19970b;

    public C1971f(int i10, float f10) {
        this.f19969a = i10;
        this.f19970b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1971f.class != obj.getClass()) {
            return false;
        }
        C1971f fVar = (C1971f) obj;
        if (this.f19969a == fVar.f19969a && Float.compare(fVar.f19970b, this.f19970b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f19969a) * 31) + Float.floatToIntBits(this.f19970b);
    }
}
