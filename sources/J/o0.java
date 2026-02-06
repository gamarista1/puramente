package J;

import W0.I;

final class o0 implements I {

    /* renamed from: b  reason: collision with root package name */
    private final I f3408b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3409c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3410d;

    public o0(I i10, int i11, int i12) {
        this.f3408b = i10;
        this.f3409c = i11;
        this.f3410d = i12;
    }

    public int a(int i10) {
        int a10 = this.f3408b.a(i10);
        if (i10 >= 0 && i10 <= this.f3410d) {
            p0.h(a10, this.f3409c, i10);
        }
        return a10;
    }

    public int b(int i10) {
        int b10 = this.f3408b.b(i10);
        if (i10 >= 0 && i10 <= this.f3409c) {
            p0.g(b10, this.f3410d, i10);
        }
        return b10;
    }
}
