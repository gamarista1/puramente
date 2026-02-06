package x9;

import ja.B;
import ja.M;
import ja.s;
import m9.D;
import q9.C3961A;
import q9.z;

final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f49524a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f49525b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49526c;

    /* renamed from: d  reason: collision with root package name */
    private final long f49527d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f49524a = jArr;
        this.f49525b = jArr2;
        this.f49526c = j10;
        this.f49527d = j11;
    }

    public static h a(long j10, long j11, D.a aVar, B b10) {
        int i10;
        int i11;
        long j12 = j10;
        D.a aVar2 = aVar;
        B b11 = b10;
        b11.Q(10);
        int n10 = b10.n();
        if (n10 <= 0) {
            return null;
        }
        int i12 = aVar2.f46548d;
        long j13 = (long) n10;
        if (i12 >= 32000) {
            i10 = 1152;
        } else {
            i10 = 576;
        }
        long O02 = M.O0(j13, ((long) i10) * 1000000, (long) i12);
        int J10 = b10.J();
        int J11 = b10.J();
        int J12 = b10.J();
        b11.Q(2);
        long j14 = j11 + ((long) aVar2.f46547c);
        long[] jArr = new long[J10];
        long[] jArr2 = new long[J10];
        int i13 = 0;
        long j15 = j11;
        while (i13 < J10) {
            int i14 = J11;
            jArr[i13] = (((long) i13) * O02) / ((long) J10);
            long j16 = j14;
            jArr2[i13] = Math.max(j15, j16);
            if (J12 == 1) {
                i11 = b10.D();
            } else if (J12 == 2) {
                i11 = b10.J();
            } else if (J12 == 3) {
                i11 = b10.G();
            } else if (J12 != 4) {
                return null;
            } else {
                i11 = b10.H();
            }
            long j17 = (long) i11;
            int i15 = i14;
            j15 += j17 * ((long) i15);
            i13++;
            jArr = jArr;
            J11 = i15;
            j14 = j16;
        }
        long[] jArr3 = jArr;
        if (!(j12 == -1 || j12 == j15)) {
            s.i("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + j15);
        }
        return new h(jArr3, jArr2, O02, j15);
    }

    public long b(long j10) {
        return this.f49524a[M.i(this.f49525b, j10, true, true)];
    }

    public z.a c(long j10) {
        int i10 = M.i(this.f49524a, j10, true, true);
        C3961A a10 = new C3961A(this.f49524a[i10], this.f49525b[i10]);
        if (a10.f47789a >= j10 || i10 == this.f49524a.length - 1) {
            return new z.a(a10);
        }
        int i11 = i10 + 1;
        return new z.a(a10, new C3961A(this.f49524a[i11], this.f49525b[i11]));
    }

    public long d() {
        return this.f49527d;
    }

    public boolean e() {
        return true;
    }

    public long g() {
        return this.f49526c;
    }
}
