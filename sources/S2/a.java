package S2;

import z2.C2964h;
import z2.F;

final class a extends C2964h implements g {

    /* renamed from: h  reason: collision with root package name */
    private final int f5852h;

    /* renamed from: i  reason: collision with root package name */
    private final long f5853i;

    public a(long j10, long j11, F.a aVar, boolean z10) {
        this(j10, j11, aVar.f29104f, aVar.f29101c, z10);
    }

    public long b(long j10) {
        return f(j10);
    }

    public long d() {
        return this.f5853i;
    }

    public int l() {
        return this.f5852h;
    }

    public a(long j10, long j11, int i10, int i11, boolean z10) {
        super(j10, j11, i10, i11, z10);
        this.f5852h = i10;
        this.f5853i = j10 == -1 ? -1 : j10;
    }
}
