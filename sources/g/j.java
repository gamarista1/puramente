package G;

import Ef.m;
import w.C2797i;
import z.C2946d;

final class j implements C2946d {

    /* renamed from: b  reason: collision with root package name */
    private final C f2312b;

    /* renamed from: c  reason: collision with root package name */
    private final C2946d f2313c;

    /* renamed from: d  reason: collision with root package name */
    private final C2797i f2314d;

    public j(C c10, C2946d dVar) {
        this.f2312b = c10;
        this.f2313c = dVar;
        this.f2314d = dVar.b();
    }

    private final float c(float f10) {
        float z10 = ((float) this.f2312b.z()) * ((float) -1);
        while (f10 > 0.0f && z10 < f10) {
            z10 += (float) this.f2312b.H();
        }
        while (f10 < 0.0f && z10 > f10) {
            z10 -= (float) this.f2312b.H();
        }
        return z10;
    }

    public float a(float f10, float f11, float f12) {
        float a10 = this.f2313c.a(f10, f11, f12);
        if (a10 != 0.0f) {
            return c(a10);
        }
        if (this.f2312b.z() == 0) {
            return 0.0f;
        }
        float z10 = ((float) this.f2312b.z()) * -1.0f;
        if (this.f2312b.B()) {
            z10 += (float) this.f2312b.H();
        }
        return m.k(z10, -f12, f12);
    }

    public C2797i b() {
        return this.f2314d;
    }
}
