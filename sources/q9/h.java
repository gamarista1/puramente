package Q9;

import R9.i;
import q9.C3968c;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final C3968c f33681a;

    /* renamed from: b  reason: collision with root package name */
    private final long f33682b;

    public h(C3968c cVar, long j10) {
        this.f33681a = cVar;
        this.f33682b = j10;
    }

    public long b(long j10) {
        return this.f33681a.f47855e[(int) j10] - this.f33682b;
    }

    public long c(long j10, long j11) {
        return this.f33681a.f47854d[(int) j10];
    }

    public long d(long j10, long j11) {
        return 0;
    }

    public long e(long j10, long j11) {
        return -9223372036854775807L;
    }

    public i f(long j10) {
        C3968c cVar = this.f33681a;
        int i10 = (int) j10;
        return new i((String) null, cVar.f47853c[i10], (long) cVar.f47852b[i10]);
    }

    public long g(long j10, long j11) {
        return (long) this.f33681a.a(j10 + this.f33682b);
    }

    public long h(long j10) {
        return (long) this.f33681a.f47851a;
    }

    public boolean i() {
        return true;
    }

    public long j() {
        return 0;
    }

    public long k(long j10, long j11) {
        return (long) this.f33681a.f47851a;
    }
}
