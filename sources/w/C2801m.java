package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.m  reason: case insensitive filesystem */
public final class C2801m extends C2805q {

    /* renamed from: a  reason: collision with root package name */
    private float f27469a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27470b = 1;

    public C2801m(float f10) {
        super((DefaultConstructorMarker) null);
        this.f27469a = f10;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f27469a;
        }
        return 0.0f;
    }

    public int b() {
        return this.f27470b;
    }

    public void d() {
        this.f27469a = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f27469a = f10;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2801m) || ((C2801m) obj).f27469a != this.f27469a) {
            return false;
        }
        return true;
    }

    public final float f() {
        return this.f27469a;
    }

    /* renamed from: g */
    public C2801m c() {
        return new C2801m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f27469a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f27469a;
    }
}
