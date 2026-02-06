package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.p  reason: case insensitive filesystem */
public final class C2804p extends C2805q {

    /* renamed from: a  reason: collision with root package name */
    private float f27564a;

    /* renamed from: b  reason: collision with root package name */
    private float f27565b;

    /* renamed from: c  reason: collision with root package name */
    private float f27566c;

    /* renamed from: d  reason: collision with root package name */
    private float f27567d;

    /* renamed from: e  reason: collision with root package name */
    private final int f27568e = 4;

    public C2804p(float f10, float f11, float f12, float f13) {
        super((DefaultConstructorMarker) null);
        this.f27564a = f10;
        this.f27565b = f11;
        this.f27566c = f12;
        this.f27567d = f13;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f27564a;
        }
        if (i10 == 1) {
            return this.f27565b;
        }
        if (i10 == 2) {
            return this.f27566c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f27567d;
    }

    public int b() {
        return this.f27568e;
    }

    public void d() {
        this.f27564a = 0.0f;
        this.f27565b = 0.0f;
        this.f27566c = 0.0f;
        this.f27567d = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f27564a = f10;
        } else if (i10 == 1) {
            this.f27565b = f10;
        } else if (i10 == 2) {
            this.f27566c = f10;
        } else if (i10 == 3) {
            this.f27567d = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2804p) {
            C2804p pVar = (C2804p) obj;
            if (pVar.f27564a == this.f27564a && pVar.f27565b == this.f27565b && pVar.f27566c == this.f27566c && pVar.f27567d == this.f27567d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f27564a;
    }

    public final float g() {
        return this.f27565b;
    }

    public final float h() {
        return this.f27566c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f27564a) * 31) + Float.hashCode(this.f27565b)) * 31) + Float.hashCode(this.f27566c)) * 31) + Float.hashCode(this.f27567d);
    }

    public final float i() {
        return this.f27567d;
    }

    /* renamed from: j */
    public C2804p c() {
        return new C2804p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f27564a + ", v2 = " + this.f27565b + ", v3 = " + this.f27566c + ", v4 = " + this.f27567d;
    }
}
