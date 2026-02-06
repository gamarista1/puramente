package g3;

import i2.L;
import z2.J;
import z2.K;

final class e implements J {

    /* renamed from: a  reason: collision with root package name */
    private final c f21087a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21088b;

    /* renamed from: c  reason: collision with root package name */
    private final long f21089c;

    /* renamed from: d  reason: collision with root package name */
    private final long f21090d;

    /* renamed from: e  reason: collision with root package name */
    private final long f21091e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f21087a = cVar;
        this.f21088b = i10;
        this.f21089c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f21082e);
        this.f21090d = j12;
        this.f21091e = a(j12);
    }

    private long a(long j10) {
        return L.U0(j10 * ((long) this.f21088b), 1000000, (long) this.f21087a.f21080c);
    }

    public J.a c(long j10) {
        long p10 = L.p((((long) this.f21087a.f21080c) * j10) / (((long) this.f21088b) * 1000000), 0, this.f21090d - 1);
        long j11 = this.f21089c + (((long) this.f21087a.f21082e) * p10);
        long a10 = a(p10);
        K k10 = new K(a10, j11);
        if (a10 >= j10 || p10 == this.f21090d - 1) {
            return new J.a(k10);
        }
        long j12 = p10 + 1;
        return new J.a(k10, new K(a(j12), this.f21089c + (((long) this.f21087a.f21082e) * j12)));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f21091e;
    }
}
