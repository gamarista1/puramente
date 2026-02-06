package A9;

import ja.B;
import ja.I;
import ja.M;
import ja.s;
import q9.l;

final class y {

    /* renamed from: a  reason: collision with root package name */
    private final I f29784a = new I(0);

    /* renamed from: b  reason: collision with root package name */
    private final B f29785b = new B();

    /* renamed from: c  reason: collision with root package name */
    private boolean f29786c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f29787d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29788e;

    /* renamed from: f  reason: collision with root package name */
    private long f29789f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f29790g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f29791h = -9223372036854775807L;

    y() {
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private int b(l lVar) {
        this.f29785b.M(M.f44986f);
        this.f29786c = true;
        lVar.e();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(l lVar, q9.y yVar) {
        int min = (int) Math.min(20000, lVar.a());
        long j10 = (long) 0;
        if (lVar.getPosition() != j10) {
            yVar.f47919a = j10;
            return 1;
        }
        this.f29785b.L(min);
        lVar.e();
        lVar.l(this.f29785b.d(), 0, min);
        this.f29789f = i(this.f29785b);
        this.f29787d = true;
        return 0;
    }

    private long i(B b10) {
        int f10 = b10.f();
        for (int e10 = b10.e(); e10 < f10 - 3; e10++) {
            if (f(b10.d(), e10) == 442) {
                b10.P(e10 + 4);
                long l10 = l(b10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(l lVar, q9.y yVar) {
        long a10 = lVar.a();
        int min = (int) Math.min(20000, a10);
        long j10 = a10 - ((long) min);
        if (lVar.getPosition() != j10) {
            yVar.f47919a = j10;
            return 1;
        }
        this.f29785b.L(min);
        lVar.e();
        lVar.l(this.f29785b.d(), 0, min);
        this.f29790g = k(this.f29785b);
        this.f29788e = true;
        return 0;
    }

    private long k(B b10) {
        int e10 = b10.e();
        for (int f10 = b10.f() - 4; f10 >= e10; f10--) {
            if (f(b10.d(), f10) == 442) {
                b10.P(f10 + 4);
                long l10 = l(b10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(B b10) {
        int e10 = b10.e();
        if (b10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        b10.j(bArr, 0, 9);
        b10.P(e10);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return m(bArr);
    }

    private static long m(byte[] bArr) {
        byte b10 = bArr[0];
        byte b11 = bArr[2];
        return (((((long) b10) & 56) >> 3) << 30) | ((((long) b10) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) b11) & 248) >> 3) << 15) | ((((long) b11) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public long c() {
        return this.f29791h;
    }

    public I d() {
        return this.f29784a;
    }

    public boolean e() {
        return this.f29786c;
    }

    public int g(l lVar, q9.y yVar) {
        if (!this.f29788e) {
            return j(lVar, yVar);
        }
        if (this.f29790g == -9223372036854775807L) {
            return b(lVar);
        }
        if (!this.f29787d) {
            return h(lVar, yVar);
        }
        long j10 = this.f29789f;
        if (j10 == -9223372036854775807L) {
            return b(lVar);
        }
        long b10 = this.f29784a.b(this.f29790g) - this.f29784a.b(j10);
        this.f29791h = b10;
        if (b10 < 0) {
            s.i("PsDurationReader", "Invalid duration: " + this.f29791h + ". Using TIME_UNSET instead.");
            this.f29791h = -9223372036854775807L;
        }
        return b(lVar);
    }
}
