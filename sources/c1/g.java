package c1;

import d1.C1923a;
import kotlin.jvm.internal.C6496s;

final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    private final float f19210a;

    /* renamed from: b  reason: collision with root package name */
    private final float f19211b;

    /* renamed from: c  reason: collision with root package name */
    private final C1923a f19212c;

    public g(float f10, float f11, C1923a aVar) {
        this.f19210a = f10;
        this.f19211b = f11;
        this.f19212c = aVar;
    }

    public long P(float f10) {
        return w.e(this.f19212c.a(f10));
    }

    public float V(long j10) {
        if (x.g(v.g(j10), x.f19246b.b())) {
            return h.j(this.f19212c.b(v.h(j10)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Float.compare(this.f19210a, gVar.f19210a) == 0 && Float.compare(this.f19211b, gVar.f19211b) == 0 && C6496s.c(this.f19212c, gVar.f19212c)) {
            return true;
        }
        return false;
    }

    public float getDensity() {
        return this.f19210a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f19210a) * 31) + Float.hashCode(this.f19211b)) * 31) + this.f19212c.hashCode();
    }

    public float r1() {
        return this.f19211b;
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f19210a + ", fontScale=" + this.f19211b + ", converter=" + this.f19212c + ')';
    }
}
