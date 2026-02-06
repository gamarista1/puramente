package w;

import Ef.m;

/* renamed from: w.K  reason: case insensitive filesystem */
public final class C2767K implements C2764H {

    /* renamed from: a  reason: collision with root package name */
    private final int f27192a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27193b;

    /* renamed from: c  reason: collision with root package name */
    private final C2760D f27194c;

    /* renamed from: d  reason: collision with root package name */
    private final long f27195d;

    /* renamed from: e  reason: collision with root package name */
    private final long f27196e;

    public C2767K(int i10, int i11, C2760D d10) {
        this.f27192a = i10;
        this.f27193b = i11;
        this.f27194c = d10;
        this.f27195d = ((long) i10) * 1000000;
        this.f27196e = ((long) i11) * 1000000;
    }

    private final long f(long j10) {
        return m.m(j10 - this.f27196e, 0, this.f27195d);
    }

    public float c(long j10, float f10, float f11, float f12) {
        float f13;
        long f14 = f(j10);
        float f15 = 1.0f;
        if (this.f27192a == 0) {
            f13 = 1.0f;
        } else {
            f13 = ((float) f14) / ((float) this.f27195d);
        }
        C2760D d10 = this.f27194c;
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 <= 1.0f) {
            f15 = f13;
        }
        return t0.k(f10, f11, d10.a(f15));
    }

    public float d(long j10, float f10, float f11, float f12) {
        long f13 = f(j10);
        int i10 = (f13 > 0 ? 1 : (f13 == 0 ? 0 : -1));
        if (i10 < 0) {
            return 0.0f;
        }
        if (i10 == 0) {
            return f12;
        }
        return (c(f13, f10, f11, f12) - c(f13 - 1000000, f10, f11, f12)) * 1000.0f;
    }

    public long e(float f10, float f11, float f12) {
        return ((long) (this.f27193b + this.f27192a)) * 1000000;
    }
}
