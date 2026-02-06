package S2;

import N2.l;
import android.util.Pair;
import i2.L;
import z2.J;
import z2.K;

final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f5859a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f5860b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5861c;

    private c(long[] jArr, long[] jArr2, long j10) {
        this.f5859a = jArr;
        this.f5860b = jArr2;
        this.f5861c = j10 == -9223372036854775807L ? L.L0(jArr2[jArr2.length - 1]) : j10;
    }

    public static c a(long j10, l lVar, long j11) {
        int length = lVar.f4426e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f4424c + lVar.f4426e[i12]);
            j12 += (long) (lVar.f4425d + lVar.f4427f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new c(jArr, jArr2, j11);
    }

    private static Pair f(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int g10 = L.g(jArr, j10, true, true);
        long j11 = jArr[g10];
        long j12 = jArr2[g10];
        int i10 = g10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        long j14 = jArr2[i10];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (((double) j10) - ((double) j11)) / ((double) (j13 - j11));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * ((double) (j14 - j12)))) + j12));
    }

    public long b(long j10) {
        return L.L0(((Long) f(j10, this.f5859a, this.f5860b).second).longValue());
    }

    public J.a c(long j10) {
        Pair f10 = f(L.h1(L.p(j10, 0, this.f5861c)), this.f5860b, this.f5859a);
        return new J.a(new K(L.L0(((Long) f10.first).longValue()), ((Long) f10.second).longValue()));
    }

    public long d() {
        return -1;
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f5861c;
    }

    public int l() {
        return -2147483647;
    }
}
