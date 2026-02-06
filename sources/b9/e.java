package B9;

import ja.M;
import q9.C3961A;
import q9.z;

final class e implements z {

    /* renamed from: a  reason: collision with root package name */
    private final c f29886a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29887b;

    /* renamed from: c  reason: collision with root package name */
    private final long f29888c;

    /* renamed from: d  reason: collision with root package name */
    private final long f29889d;

    /* renamed from: e  reason: collision with root package name */
    private final long f29890e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f29886a = cVar;
        this.f29887b = i10;
        this.f29888c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f29881e);
        this.f29889d = j12;
        this.f29890e = a(j12);
    }

    private long a(long j10) {
        return M.O0(j10 * ((long) this.f29887b), 1000000, (long) this.f29886a.f29879c);
    }

    public z.a c(long j10) {
        long r10 = M.r((((long) this.f29886a.f29879c) * j10) / (((long) this.f29887b) * 1000000), 0, this.f29889d - 1);
        long j11 = this.f29888c + (((long) this.f29886a.f29881e) * r10);
        long a10 = a(r10);
        C3961A a11 = new C3961A(a10, j11);
        if (a10 >= j10 || r10 == this.f29889d - 1) {
            return new z.a(a11);
        }
        long j12 = r10 + 1;
        return new z.a(a11, new C3961A(a(j12), this.f29888c + (((long) this.f29886a.f29881e) * j12)));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f29890e;
    }
}
