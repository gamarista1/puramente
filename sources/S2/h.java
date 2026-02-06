package S2;

import i2.C2073A;
import i2.L;
import i2.p;
import z2.F;
import z2.J;
import z2.K;

final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f5884a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f5885b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5886c;

    /* renamed from: d  reason: collision with root package name */
    private final long f5887d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5888e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f5884a = jArr;
        this.f5885b = jArr2;
        this.f5886c = j10;
        this.f5887d = j11;
        this.f5888e = i10;
    }

    public static h a(long j10, long j11, F.a aVar, C2073A a10) {
        int i10;
        int i11;
        long j12 = j10;
        F.a aVar2 = aVar;
        C2073A a11 = a10;
        a11.V(10);
        int q10 = a10.q();
        if (q10 <= 0) {
            return null;
        }
        int i12 = aVar2.f29102d;
        long j13 = (long) q10;
        if (i12 >= 32000) {
            i10 = 1152;
        } else {
            i10 = 576;
        }
        long U02 = L.U0(j13, ((long) i10) * 1000000, (long) i12);
        int N10 = a10.N();
        int N11 = a10.N();
        int N12 = a10.N();
        a11.V(2);
        long j14 = j11 + ((long) aVar2.f29101c);
        long[] jArr = new long[N10];
        long[] jArr2 = new long[N10];
        int i13 = 0;
        long j15 = j11;
        while (i13 < N10) {
            int i14 = N11;
            jArr[i13] = (((long) i13) * U02) / ((long) N10);
            long j16 = j14;
            jArr2[i13] = Math.max(j15, j16);
            if (N12 == 1) {
                i11 = a10.H();
            } else if (N12 == 2) {
                i11 = a10.N();
            } else if (N12 == 3) {
                i11 = a10.K();
            } else if (N12 != 4) {
                return null;
            } else {
                i11 = a10.L();
            }
            long j17 = (long) i11;
            int i15 = i14;
            j15 += j17 * ((long) i15);
            i13++;
            C2073A a12 = a10;
            N10 = N10;
            N11 = i15;
            j14 = j16;
        }
        if (!(j12 == -1 || j12 == j15)) {
            p.h("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j15);
        }
        return new h(jArr, jArr2, U02, j15, aVar2.f29104f);
    }

    public long b(long j10) {
        return this.f5884a[L.g(this.f5885b, j10, true, true)];
    }

    public J.a c(long j10) {
        int g10 = L.g(this.f5884a, j10, true, true);
        K k10 = new K(this.f5884a[g10], this.f5885b[g10]);
        if (k10.f29112a >= j10 || g10 == this.f5884a.length - 1) {
            return new J.a(k10);
        }
        int i10 = g10 + 1;
        return new J.a(k10, new K(this.f5884a[i10], this.f5885b[i10]));
    }

    public long d() {
        return this.f5887d;
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f5886c;
    }

    public int l() {
        return this.f5888e;
    }
}
