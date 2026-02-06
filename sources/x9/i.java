package x9;

import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import m9.D;
import q9.C3961A;
import q9.z;

final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f49528a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49529b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49530c;

    /* renamed from: d  reason: collision with root package name */
    private final long f49531d;

    /* renamed from: e  reason: collision with root package name */
    private final long f49532e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f49533f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1, (long[]) null);
    }

    public static i a(long j10, long j11, D.a aVar, B b10) {
        int H10;
        long j12 = j10;
        D.a aVar2 = aVar;
        int i10 = aVar2.f46551g;
        int i11 = aVar2.f46548d;
        int n10 = b10.n();
        if ((n10 & 1) != 1 || (H10 = b10.H()) == 0) {
            return null;
        }
        long O02 = M.O0((long) H10, ((long) i10) * 1000000, (long) i11);
        if ((n10 & 6) != 6) {
            return new i(j11, aVar2.f46547c, O02);
        }
        long F10 = b10.F();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = (long) b10.D();
        }
        if (j12 != -1) {
            long j13 = j11 + F10;
            if (j12 != j13) {
                s.i("XingSeeker", "XING data size mismatch: " + j12 + ", " + j13);
            }
        }
        return new i(j11, aVar2.f46547c, O02, F10, jArr);
    }

    private long f(int i10) {
        return (this.f49530c * ((long) i10)) / 100;
    }

    public long b(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f49528a;
        if (!e() || j12 <= ((long) this.f49529b)) {
            return 0;
        }
        long[] jArr = (long[]) C3645a.h(this.f49533f);
        double d11 = (((double) j12) * 256.0d) / ((double) this.f49531d);
        int i10 = M.i(jArr, (long) d11, true, true);
        long f10 = f(i10);
        long j13 = jArr[i10];
        int i11 = i10 + 1;
        long f11 = f(i11);
        if (i10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i11];
        }
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (d11 - ((double) j13)) / ((double) (j11 - j13));
        }
        return f10 + Math.round(d10 * ((double) (f11 - f10)));
    }

    public z.a c(long j10) {
        double d10;
        if (!e()) {
            return new z.a(new C3961A(0, this.f49528a + ((long) this.f49529b)));
        }
        long r10 = M.r(j10, 0, this.f49530c);
        double d11 = (((double) r10) * 100.0d) / ((double) this.f49530c);
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) C3645a.h(this.f49533f);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new z.a(new C3961A(r10, this.f49528a + M.r(Math.round((d12 / 256.0d) * ((double) this.f49531d)), (long) this.f49529b, this.f49531d - 1)));
    }

    public long d() {
        return this.f49532e;
    }

    public boolean e() {
        if (this.f49533f != null) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.f49530c;
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f49528a = j10;
        this.f49529b = i10;
        this.f49530c = j11;
        this.f49533f = jArr;
        this.f49531d = j12;
        this.f49532e = j12 != -1 ? j10 + j12 : -1;
    }
}
