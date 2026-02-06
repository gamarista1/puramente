package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.o  reason: case insensitive filesystem */
public final class C2803o extends C2805q {

    /* renamed from: a  reason: collision with root package name */
    private float f27535a;

    /* renamed from: b  reason: collision with root package name */
    private float f27536b;

    /* renamed from: c  reason: collision with root package name */
    private float f27537c;

    /* renamed from: d  reason: collision with root package name */
    private final int f27538d = 3;

    public C2803o(float f10, float f11, float f12) {
        super((DefaultConstructorMarker) null);
        this.f27535a = f10;
        this.f27536b = f11;
        this.f27537c = f12;
    }

    public float a(int i10) {
        if (i10 == 0) {
            return this.f27535a;
        }
        if (i10 == 1) {
            return this.f27536b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f27537c;
    }

    public int b() {
        return this.f27538d;
    }

    public void d() {
        this.f27535a = 0.0f;
        this.f27536b = 0.0f;
        this.f27537c = 0.0f;
    }

    public void e(int i10, float f10) {
        if (i10 == 0) {
            this.f27535a = f10;
        } else if (i10 == 1) {
            this.f27536b = f10;
        } else if (i10 == 2) {
            this.f27537c = f10;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2803o) {
            C2803o oVar = (C2803o) obj;
            if (oVar.f27535a == this.f27535a && oVar.f27536b == this.f27536b && oVar.f27537c == this.f27537c) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: f */
    public C2803o c() {
        return new C2803o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f27535a) * 31) + Float.hashCode(this.f27536b)) * 31) + Float.hashCode(this.f27537c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f27535a + ", v2 = " + this.f27536b + ", v3 = " + this.f27537c;
    }
}
