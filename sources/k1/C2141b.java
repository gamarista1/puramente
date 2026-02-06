package k1;

import androidx.constraintlayout.motion.widget.m;
import g1.k;
import g1.n;

/* renamed from: k1.b  reason: case insensitive filesystem */
public class C2141b extends m {

    /* renamed from: a  reason: collision with root package name */
    private n f23153a;

    /* renamed from: b  reason: collision with root package name */
    private k f23154b;

    /* renamed from: c  reason: collision with root package name */
    private g1.m f23155c;

    public C2141b() {
        n nVar = new n();
        this.f23153a = nVar;
        this.f23155c = nVar;
    }

    public float a() {
        return this.f23155c.a();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        n nVar = this.f23153a;
        this.f23155c = nVar;
        nVar.d(f10, f11, f12, f13, f14, f15);
    }

    public boolean c() {
        return this.f23155c.b();
    }

    public void d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f23154b == null) {
            this.f23154b = new k();
        }
        k kVar = this.f23154b;
        this.f23155c = kVar;
        kVar.d(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    public float getInterpolation(float f10) {
        return this.f23155c.getInterpolation(f10);
    }
}
