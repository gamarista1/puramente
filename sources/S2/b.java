package S2;

import i2.L;
import i2.q;
import java.math.RoundingMode;
import z2.J;
import z2.K;

final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f5854a;

    /* renamed from: b  reason: collision with root package name */
    private final q f5855b;

    /* renamed from: c  reason: collision with root package name */
    private final q f5856c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5857d;

    /* renamed from: e  reason: collision with root package name */
    private long f5858e;

    public b(long j10, long j11, long j12) {
        long j13 = j10;
        long j14 = j11;
        long j15 = j12;
        this.f5858e = j13;
        this.f5854a = j15;
        q qVar = new q();
        this.f5855b = qVar;
        q qVar2 = new q();
        this.f5856c = qVar2;
        qVar.a(0);
        qVar2.a(j11);
        int i10 = -2147483647;
        if (j13 != -9223372036854775807L) {
            long W02 = L.W0(j14 - j15, 8, j10, RoundingMode.HALF_UP);
            if (W02 > 0 && W02 <= 2147483647L) {
                i10 = (int) W02;
            }
            this.f5857d = i10;
            return;
        }
        this.f5857d = -2147483647;
    }

    public boolean a(long j10) {
        q qVar = this.f5855b;
        if (j10 - qVar.b(qVar.c() - 1) < 100000) {
            return true;
        }
        return false;
    }

    public long b(long j10) {
        return this.f5855b.b(L.e(this.f5856c, j10, true, true));
    }

    public J.a c(long j10) {
        int e10 = L.e(this.f5855b, j10, true, true);
        K k10 = new K(this.f5855b.b(e10), this.f5856c.b(e10));
        if (k10.f29112a == j10 || e10 == this.f5855b.c() - 1) {
            return new J.a(k10);
        }
        int i10 = e10 + 1;
        return new J.a(k10, new K(this.f5855b.b(i10), this.f5856c.b(i10)));
    }

    public long d() {
        return this.f5854a;
    }

    public boolean e() {
        return true;
    }

    public void f(long j10, long j11) {
        if (!a(j10)) {
            this.f5855b.a(j10);
            this.f5856c.a(j11);
        }
    }

    public long g() {
        return this.f5858e;
    }

    /* access modifiers changed from: package-private */
    public void h(long j10) {
        this.f5858e = j10;
    }

    public int l() {
        return this.f5857d;
    }
}
