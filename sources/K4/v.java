package K4;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final int f32413a;

    /* renamed from: b  reason: collision with root package name */
    private final int f32414b;

    public v(int i10, int i11) {
        this.f32413a = i10;
        this.f32414b = i11;
    }

    public final int a() {
        return this.f32413a;
    }

    public final int b() {
        return this.f32414b;
    }

    public final int c() {
        return this.f32414b;
    }

    public final int d() {
        return this.f32413a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f32413a == vVar.f32413a && this.f32414b == vVar.f32414b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f32413a) * 31) + Integer.hashCode(this.f32414b);
    }

    public String toString() {
        return "TrimMetrics(itemsTrimmed=" + this.f32413a + ", dataTrimmed=" + this.f32414b + ')';
    }
}
