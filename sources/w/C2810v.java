package w;

/* renamed from: w.v  reason: case insensitive filesystem */
public final class C2810v {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public double f27631a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public double f27632b;

    public C2810v(double d10, double d11) {
        this.f27631a = d10;
        this.f27632b = d11;
    }

    public final double e() {
        return this.f27632b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2810v)) {
            return false;
        }
        C2810v vVar = (C2810v) obj;
        if (Double.compare(this.f27631a, vVar.f27631a) == 0 && Double.compare(this.f27632b, vVar.f27632b) == 0) {
            return true;
        }
        return false;
    }

    public final double f() {
        return this.f27631a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f27631a) * 31) + Double.hashCode(this.f27632b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f27631a + ", _imaginary=" + this.f27632b + ')';
    }
}
