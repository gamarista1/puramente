package J0;

import H0.G;
import kotlin.jvm.internal.C6496s;

final class r0 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final G f3921a;

    /* renamed from: b  reason: collision with root package name */
    private final P f3922b;

    public r0(G g10, P p10) {
        this.f3921a = g10;
        this.f3922b = p10;
    }

    public boolean Y0() {
        return this.f3922b.C1().G();
    }

    public final P a() {
        return this.f3922b;
    }

    public final G b() {
        return this.f3921a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (C6496s.c(this.f3921a, r0Var.f3921a) && C6496s.c(this.f3922b, r0Var.f3922b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f3921a.hashCode() * 31) + this.f3922b.hashCode();
    }

    public String toString() {
        return "PlaceableResult(result=" + this.f3921a + ", placeable=" + this.f3922b + ')';
    }
}
