package k9;

public final class c1 {

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f45519b = new c1(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f45520a;

    public c1(boolean z10) {
        this.f45520a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        if (this.f45520a == ((c1) obj).f45520a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f45520a ^ true ? 1 : 0;
    }
}
