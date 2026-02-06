package f3;

import i2.C2073A;
import i2.G;
import i2.L;
import z2.C2973q;
import z2.I;

/* renamed from: f3.A  reason: case insensitive filesystem */
final class C1982A {

    /* renamed from: a  reason: collision with root package name */
    private final G f20393a = new G(0);

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20394b = new C2073A();

    /* renamed from: c  reason: collision with root package name */
    private boolean f20395c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f20396d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20397e;

    /* renamed from: f  reason: collision with root package name */
    private long f20398f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f20399g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f20400h = -9223372036854775807L;

    C1982A() {
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private int b(C2973q qVar) {
        this.f20394b.R(L.f22077f);
        this.f20395c = true;
        qVar.e();
        return 0;
    }

    private int f(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private int h(C2973q qVar, I i10) {
        int min = (int) Math.min(20000, qVar.a());
        long j10 = (long) 0;
        if (qVar.getPosition() != j10) {
            i10.f29106a = j10;
            return 1;
        }
        this.f20394b.Q(min);
        qVar.e();
        qVar.l(this.f20394b.e(), 0, min);
        this.f20398f = i(this.f20394b);
        this.f20396d = true;
        return 0;
    }

    private long i(C2073A a10) {
        int g10 = a10.g();
        for (int f10 = a10.f(); f10 < g10 - 3; f10++) {
            if (f(a10.e(), f10) == 442) {
                a10.U(f10 + 4);
                long l10 = l(a10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(C2973q qVar, I i10) {
        long a10 = qVar.a();
        int min = (int) Math.min(20000, a10);
        long j10 = a10 - ((long) min);
        if (qVar.getPosition() != j10) {
            i10.f29106a = j10;
            return 1;
        }
        this.f20394b.Q(min);
        qVar.e();
        qVar.l(this.f20394b.e(), 0, min);
        this.f20399g = k(this.f20394b);
        this.f20397e = true;
        return 0;
    }

    private long k(C2073A a10) {
        int f10 = a10.f();
        for (int g10 = a10.g() - 4; g10 >= f10; g10--) {
            if (f(a10.e(), g10) == 442) {
                a10.U(g10 + 4);
                long l10 = l(a10);
                if (l10 != -9223372036854775807L) {
                    return l10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(C2073A a10) {
        int f10 = a10.f();
        if (a10.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        a10.l(bArr, 0, 9);
        a10.U(f10);
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
        return this.f20400h;
    }

    public G d() {
        return this.f20393a;
    }

    public boolean e() {
        return this.f20395c;
    }

    public int g(C2973q qVar, I i10) {
        if (!this.f20397e) {
            return j(qVar, i10);
        }
        if (this.f20399g == -9223372036854775807L) {
            return b(qVar);
        }
        if (!this.f20396d) {
            return h(qVar, i10);
        }
        long j10 = this.f20398f;
        if (j10 == -9223372036854775807L) {
            return b(qVar);
        }
        this.f20400h = this.f20393a.c(this.f20399g) - this.f20393a.b(j10);
        return b(qVar);
    }
}
