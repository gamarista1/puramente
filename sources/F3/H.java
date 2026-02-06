package f3;

import i2.C2073A;
import i2.G;
import i2.L;
import z2.C2973q;
import z2.I;

final class H {

    /* renamed from: a  reason: collision with root package name */
    private final int f20433a;

    /* renamed from: b  reason: collision with root package name */
    private final G f20434b = new G(0);

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20435c = new C2073A();

    /* renamed from: d  reason: collision with root package name */
    private boolean f20436d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20437e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20438f;

    /* renamed from: g  reason: collision with root package name */
    private long f20439g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f20440h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f20441i = -9223372036854775807L;

    H(int i10) {
        this.f20433a = i10;
    }

    private int a(C2973q qVar) {
        this.f20435c.R(L.f22077f);
        this.f20436d = true;
        qVar.e();
        return 0;
    }

    private int f(C2973q qVar, I i10, int i11) {
        int min = (int) Math.min((long) this.f20433a, qVar.a());
        long j10 = (long) 0;
        if (qVar.getPosition() != j10) {
            i10.f29106a = j10;
            return 1;
        }
        this.f20435c.Q(min);
        qVar.e();
        qVar.l(this.f20435c.e(), 0, min);
        this.f20439g = g(this.f20435c, i11);
        this.f20437e = true;
        return 0;
    }

    private long g(C2073A a10, int i10) {
        int g10 = a10.g();
        for (int f10 = a10.f(); f10 < g10; f10++) {
            if (a10.e()[f10] == 71) {
                long c10 = L.c(a10, f10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(C2973q qVar, I i10, int i11) {
        long a10 = qVar.a();
        int min = (int) Math.min((long) this.f20433a, a10);
        long j10 = a10 - ((long) min);
        if (qVar.getPosition() != j10) {
            i10.f29106a = j10;
            return 1;
        }
        this.f20435c.Q(min);
        qVar.e();
        qVar.l(this.f20435c.e(), 0, min);
        this.f20440h = i(this.f20435c, i11);
        this.f20438f = true;
        return 0;
    }

    private long i(C2073A a10, int i10) {
        int f10 = a10.f();
        int g10 = a10.g();
        for (int i11 = g10 - 188; i11 >= f10; i11--) {
            if (L.b(a10.e(), f10, g10, i11)) {
                long c10 = L.c(a10, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f20441i;
    }

    public G c() {
        return this.f20434b;
    }

    public boolean d() {
        return this.f20436d;
    }

    public int e(C2973q qVar, I i10, int i11) {
        if (i11 <= 0) {
            return a(qVar);
        }
        if (!this.f20438f) {
            return h(qVar, i10, i11);
        }
        if (this.f20440h == -9223372036854775807L) {
            return a(qVar);
        }
        if (!this.f20437e) {
            return f(qVar, i10, i11);
        }
        long j10 = this.f20439g;
        if (j10 == -9223372036854775807L) {
            return a(qVar);
        }
        this.f20441i = this.f20434b.c(this.f20440h) - this.f20434b.b(j10);
        return a(qVar);
    }
}
