package S2;

import i2.C2076a;
import i2.L;
import z2.F;
import z2.J;
import z2.K;

final class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f5895a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5896b;

    /* renamed from: c  reason: collision with root package name */
    private final long f5897c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5898d;

    /* renamed from: e  reason: collision with root package name */
    private final long f5899e;

    /* renamed from: f  reason: collision with root package name */
    private final long f5900f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f5901g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1, (long[]) null);
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long a10 = iVar.a();
        if (a10 == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f5891c;
        if (j11 == -1 || (jArr = iVar.f5894f) == null) {
            F.a aVar = iVar.f5889a;
            return new j(j10, aVar.f29101c, a10, aVar.f29104f);
        }
        F.a aVar2 = iVar.f5889a;
        return new j(j10, aVar2.f29101c, a10, aVar2.f29104f, j11, jArr);
    }

    private long f(int i10) {
        return (this.f5897c * ((long) i10)) / 100;
    }

    public long b(long j10) {
        long j11;
        double d10;
        long j12 = j10 - this.f5895a;
        if (!e() || j12 <= ((long) this.f5896b)) {
            return 0;
        }
        long[] jArr = (long[]) C2076a.i(this.f5901g);
        double d11 = (((double) j12) * 256.0d) / ((double) this.f5899e);
        int g10 = L.g(jArr, (long) d11, true, true);
        long f10 = f(g10);
        long j13 = jArr[g10];
        int i10 = g10 + 1;
        long f11 = f(i10);
        if (g10 == 99) {
            j11 = 256;
        } else {
            j11 = jArr[i10];
        }
        if (j13 == j11) {
            d10 = 0.0d;
        } else {
            d10 = (d11 - ((double) j13)) / ((double) (j11 - j13));
        }
        return f10 + Math.round(d10 * ((double) (f11 - f10)));
    }

    public J.a c(long j10) {
        double d10;
        if (!e()) {
            return new J.a(new K(0, this.f5895a + ((long) this.f5896b)));
        }
        long p10 = L.p(j10, 0, this.f5897c);
        double d11 = (((double) p10) * 100.0d) / ((double) this.f5897c);
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) C2076a.i(this.f5901g);
                double d13 = (double) jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = (double) jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - ((double) i10)) * (d10 - d13));
            }
        }
        return new J.a(new K(p10, this.f5895a + L.p(Math.round((d12 / 256.0d) * ((double) this.f5899e)), (long) this.f5896b, this.f5899e - 1)));
    }

    public long d() {
        return this.f5900f;
    }

    public boolean e() {
        if (this.f5901g != null) {
            return true;
        }
        return false;
    }

    public long g() {
        return this.f5897c;
    }

    public int l() {
        return this.f5898d;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f5895a = j10;
        this.f5896b = i10;
        this.f5897c = j11;
        this.f5898d = i11;
        this.f5899e = j12;
        this.f5901g = jArr;
        this.f5900f = j12 != -1 ? j10 + j12 : -1;
    }
}
