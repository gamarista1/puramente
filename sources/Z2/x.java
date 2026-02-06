package z2;

import i2.C2076a;
import i2.L;
import z2.J;
import z2.y;

public final class x implements J {

    /* renamed from: a  reason: collision with root package name */
    private final y f29279a;

    /* renamed from: b  reason: collision with root package name */
    private final long f29280b;

    public x(y yVar, long j10) {
        this.f29279a = yVar;
        this.f29280b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / ((long) this.f29279a.f29285e), this.f29280b + j11);
    }

    public J.a c(long j10) {
        long j11;
        C2076a.i(this.f29279a.f29291k);
        y yVar = this.f29279a;
        y.a aVar = yVar.f29291k;
        long[] jArr = aVar.f29293a;
        long[] jArr2 = aVar.f29294b;
        int g10 = L.g(jArr, yVar.i(j10), true, false);
        long j12 = 0;
        if (g10 == -1) {
            j11 = 0;
        } else {
            j11 = jArr[g10];
        }
        if (g10 != -1) {
            j12 = jArr2[g10];
        }
        K a10 = a(j11, j12);
        if (a10.f29112a == j10 || g10 == jArr.length - 1) {
            return new J.a(a10);
        }
        int i10 = g10 + 1;
        return new J.a(a10, a(jArr[i10], jArr2[i10]));
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f29279a.f();
    }
}
