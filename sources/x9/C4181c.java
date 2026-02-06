package x9;

import I9.k;
import android.util.Pair;
import ja.M;
import q9.C3961A;
import q9.z;

/* renamed from: x9.c  reason: case insensitive filesystem */
final class C4181c implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f49499a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f49500b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49501c;

    private C4181c(long[] jArr, long[] jArr2, long j10) {
        this.f49499a = jArr;
        this.f49500b = jArr2;
        this.f49501c = j10 == -9223372036854775807L ? M.C0(jArr2[jArr2.length - 1]) : j10;
    }

    public static C4181c a(long j10, k kVar, long j11) {
        int length = kVar.f31817e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (kVar.f31815c + kVar.f31817e[i12]);
            j12 += (long) (kVar.f31816d + kVar.f31818f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C4181c(jArr, jArr2, j11);
    }

    private static Pair f(long j10, long[] jArr, long[] jArr2) {
        double d10;
        int i10 = M.i(jArr, j10, true, true);
        long j11 = jArr[i10];
        long j12 = jArr2[i10];
        int i11 = i10 + 1;
        if (i11 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i11];
        long j14 = jArr2[i11];
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (((double) j10) - ((double) j11)) / ((double) (j13 - j11));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) (d10 * ((double) (j14 - j12)))) + j12));
    }

    public long b(long j10) {
        return M.C0(((Long) f(j10, this.f49499a, this.f49500b).second).longValue());
    }

    public z.a c(long j10) {
        Pair f10 = f(M.Z0(M.r(j10, 0, this.f49501c)), this.f49500b, this.f49499a);
        return new z.a(new C3961A(M.C0(((Long) f10.first).longValue()), ((Long) f10.second).longValue()));
    }

    public long d() {
        return -1;
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f49501c;
    }
}
