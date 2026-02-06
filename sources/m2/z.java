package m2;

public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final z f23735c = new z(0, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f23736a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23737b;

    public z(int i10, boolean z10) {
        this.f23736a = i10;
        this.f23737b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f23736a == zVar.f23736a && this.f23737b == zVar.f23737b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f23736a << 1) + (this.f23737b ? 1 : 0);
    }
}
