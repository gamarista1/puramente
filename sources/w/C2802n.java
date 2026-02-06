package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.n  reason: case insensitive filesystem */
public final class C2802n extends C2805q {

    /* renamed from: a  reason: collision with root package name */
    private float f27480a;

    /* renamed from: b  reason: collision with root package name */
    private float f27481b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27482c = 2;

    public C2802n(float f10, float f11) {
        super((DefaultConstructorMarker) null);
        this.f27480a = f10;
        this.f27481b = f11;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f27480a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f27481b;
    }

    public int b() {
        return this.f27482c;
    }

    public void d() {
        this.f27480a = 0.0f;
        this.f27481b = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f27480a = f10;
        } else if (i10 == 1) {
            this.f27481b = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2802n) {
            C2802n nVar = (C2802n) obj;
            if (nVar.f27480a == this.f27480a && nVar.f27481b == this.f27481b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f27480a;
    }

    public final float g() {
        return this.f27481b;
    }

    /* renamed from: h */
    public C2802n c() {
        return new C2802n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f27480a) * 31) + Float.hashCode(this.f27481b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f27480a + ", v2 = " + this.f27481b;
    }
}
