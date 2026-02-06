package v;

import c1.d;
import w.C2765I;

/* renamed from: v.x  reason: case insensitive filesystem */
public final class C2741x implements C2765I {

    /* renamed from: a  reason: collision with root package name */
    private final C2730m f26901a;

    public C2741x(d dVar) {
        this.f26901a = new C2730m(C2742y.a(), dVar);
    }

    private final float f(float f10) {
        return this.f26901a.b(f10) * Math.signum(f10);
    }

    public float a() {
        return 0.0f;
    }

    public float b(long j10, float f10, float f11) {
        return this.f26901a.d(f11).b(j10 / 1000000);
    }

    public long c(float f10, float f11) {
        return this.f26901a.c(f11) * 1000000;
    }

    public float d(float f10, float f11) {
        return f10 + f(f11);
    }

    public float e(long j10, float f10, float f11) {
        return f10 + this.f26901a.d(f11).a(j10 / 1000000);
    }
}
