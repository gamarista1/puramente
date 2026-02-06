package w;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.J  reason: case insensitive filesystem */
public final class C2766J implements C2764H {

    /* renamed from: a  reason: collision with root package name */
    private final float f27188a;

    /* renamed from: b  reason: collision with root package name */
    private final float f27189b;

    /* renamed from: c  reason: collision with root package name */
    private final float f27190c;

    /* renamed from: d  reason: collision with root package name */
    private final C2791e0 f27191d;

    public C2766J(float f10, float f11, float f12) {
        this.f27188a = f10;
        this.f27189b = f11;
        this.f27190c = f12;
        C2791e0 e0Var = new C2791e0(1.0f);
        e0Var.d(f10);
        e0Var.f(f11);
        this.f27191d = e0Var;
    }

    public float b(float f10, float f11, float f12) {
        return 0.0f;
    }

    public float c(long j10, float f10, float f11, float f12) {
        this.f27191d.e(f11);
        return C2776U.b(this.f27191d.g(f10, f12, j10 / 1000000));
    }

    public float d(long j10, float f10, float f11, float f12) {
        this.f27191d.e(f11);
        return C2776U.c(this.f27191d.g(f10, f12, j10 / 1000000));
    }

    public long e(float f10, float f11, float f12) {
        float b10 = this.f27191d.b();
        float a10 = this.f27191d.a();
        float f13 = f10 - f11;
        float f14 = this.f27190c;
        return C2789d0.b(b10, a10, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2766J(float f10, float f11, float f12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
