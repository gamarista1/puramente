package C;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final int f841a;

    /* renamed from: b  reason: collision with root package name */
    private final int f842b;

    /* renamed from: c  reason: collision with root package name */
    private final int f843c;

    /* renamed from: d  reason: collision with root package name */
    private final int f844d;

    public G(int i10, int i11, int i12, int i13) {
        this.f841a = i10;
        this.f842b = i11;
        this.f843c = i12;
        this.f844d = i13;
    }

    public final int a() {
        return this.f844d;
    }

    public final int b() {
        return this.f841a;
    }

    public final int c() {
        return this.f843c;
    }

    public final int d() {
        return this.f842b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f841a == g10.f841a && this.f842b == g10.f842b && this.f843c == g10.f843c && this.f844d == g10.f844d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f841a * 31) + this.f842b) * 31) + this.f843c) * 31) + this.f844d;
    }

    public String toString() {
        return "InsetsValues(left=" + this.f841a + ", top=" + this.f842b + ", right=" + this.f843c + ", bottom=" + this.f844d + ')';
    }
}
