package s0;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final double f25878a;

    /* renamed from: b  reason: collision with root package name */
    private final double f25879b;

    /* renamed from: c  reason: collision with root package name */
    private final double f25880c;

    /* renamed from: d  reason: collision with root package name */
    private final double f25881d;

    /* renamed from: e  reason: collision with root package name */
    private final double f25882e;

    /* renamed from: f  reason: collision with root package name */
    private final double f25883f;

    /* renamed from: g  reason: collision with root package name */
    private final double f25884g;

    public y(double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        this.f25878a = d10;
        this.f25879b = d11;
        this.f25880c = d12;
        this.f25881d = d13;
        this.f25882e = d14;
        this.f25883f = d15;
        this.f25884g = d16;
        if (Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        } else if (d14 < 0.0d || d14 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d14);
        } else if (d14 == 0.0d && (d11 == 0.0d || d10 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        } else if (d14 >= 1.0d && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        } else if ((d11 == 0.0d || d10 == 0.0d) && d13 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        } else if (d13 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        } else if (d11 < 0.0d || d10 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f25879b;
    }

    public final double b() {
        return this.f25880c;
    }

    public final double c() {
        return this.f25881d;
    }

    public final double d() {
        return this.f25882e;
    }

    public final double e() {
        return this.f25883f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Double.compare(this.f25878a, yVar.f25878a) == 0 && Double.compare(this.f25879b, yVar.f25879b) == 0 && Double.compare(this.f25880c, yVar.f25880c) == 0 && Double.compare(this.f25881d, yVar.f25881d) == 0 && Double.compare(this.f25882e, yVar.f25882e) == 0 && Double.compare(this.f25883f, yVar.f25883f) == 0 && Double.compare(this.f25884g, yVar.f25884g) == 0) {
            return true;
        }
        return false;
    }

    public final double f() {
        return this.f25884g;
    }

    public final double g() {
        return this.f25878a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f25878a) * 31) + Double.hashCode(this.f25879b)) * 31) + Double.hashCode(this.f25880c)) * 31) + Double.hashCode(this.f25881d)) * 31) + Double.hashCode(this.f25882e)) * 31) + Double.hashCode(this.f25883f)) * 31) + Double.hashCode(this.f25884g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f25878a + ", a=" + this.f25879b + ", b=" + this.f25880c + ", c=" + this.f25881d + ", d=" + this.f25882e + ", e=" + this.f25883f + ", f=" + this.f25884g + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(double d10, double d11, double d12, double d13, double d14, double d15, double d16, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(d10, d11, d12, d13, d14, (i10 & 32) != 0 ? 0.0d : d15, (i10 & 64) != 0 ? 0.0d : d16);
    }
}
