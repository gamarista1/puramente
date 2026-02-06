package S2;

import i2.C2073A;
import i2.L;
import z2.F;

final class i {

    /* renamed from: a  reason: collision with root package name */
    public final F.a f5889a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5890b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5891c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5892d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5893e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f5894f;

    private i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f5889a = new F.a(aVar);
        this.f5890b = j10;
        this.f5891c = j11;
        this.f5894f = jArr;
        this.f5892d = i10;
        this.f5893e = i11;
    }

    public static i b(F.a aVar, C2073A a10) {
        int i10;
        long j10;
        long[] jArr;
        int i11;
        int i12;
        int q10 = a10.q();
        if ((q10 & 1) != 0) {
            i10 = a10.L();
        } else {
            i10 = -1;
        }
        if ((q10 & 2) != 0) {
            j10 = a10.J();
        } else {
            j10 = -1;
        }
        long j11 = j10;
        if ((q10 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr2[i13] = (long) a10.H();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((q10 & 8) != 0) {
            a10.V(4);
        }
        if (a10.a() >= 24) {
            a10.V(21);
            int K10 = a10.K();
            i11 = K10 & 4095;
            i12 = (16773120 & K10) >> 12;
        } else {
            i12 = -1;
            i11 = -1;
        }
        return new i(aVar, (long) i10, j11, jArr, i12, i11);
    }

    public long a() {
        long j10 = this.f5890b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        F.a aVar = this.f5889a;
        return L.T0((j10 * ((long) aVar.f29105g)) - 1, aVar.f29102d);
    }
}
