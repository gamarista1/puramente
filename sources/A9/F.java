package A9;

import ja.B;
import ja.I;
import ja.M;
import ja.s;
import q9.l;
import q9.y;

final class F {

    /* renamed from: a  reason: collision with root package name */
    private final int f29462a;

    /* renamed from: b  reason: collision with root package name */
    private final I f29463b = new I(0);

    /* renamed from: c  reason: collision with root package name */
    private final B f29464c = new B();

    /* renamed from: d  reason: collision with root package name */
    private boolean f29465d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29466e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29467f;

    /* renamed from: g  reason: collision with root package name */
    private long f29468g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f29469h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f29470i = -9223372036854775807L;

    F(int i10) {
        this.f29462a = i10;
    }

    private int a(l lVar) {
        this.f29464c.M(M.f44986f);
        this.f29465d = true;
        lVar.e();
        return 0;
    }

    private int f(l lVar, y yVar, int i10) {
        int min = (int) Math.min((long) this.f29462a, lVar.a());
        long j10 = (long) 0;
        if (lVar.getPosition() != j10) {
            yVar.f47919a = j10;
            return 1;
        }
        this.f29464c.L(min);
        lVar.e();
        lVar.l(this.f29464c.d(), 0, min);
        this.f29468g = g(this.f29464c, i10);
        this.f29466e = true;
        return 0;
    }

    private long g(B b10, int i10) {
        int f10 = b10.f();
        for (int e10 = b10.e(); e10 < f10; e10++) {
            if (b10.d()[e10] == 71) {
                long c10 = J.c(b10, e10, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(l lVar, y yVar, int i10) {
        long a10 = lVar.a();
        int min = (int) Math.min((long) this.f29462a, a10);
        long j10 = a10 - ((long) min);
        if (lVar.getPosition() != j10) {
            yVar.f47919a = j10;
            return 1;
        }
        this.f29464c.L(min);
        lVar.e();
        lVar.l(this.f29464c.d(), 0, min);
        this.f29469h = i(this.f29464c, i10);
        this.f29467f = true;
        return 0;
    }

    private long i(B b10, int i10) {
        int e10 = b10.e();
        int f10 = b10.f();
        for (int i11 = f10 - 188; i11 >= e10; i11--) {
            if (J.b(b10.d(), e10, f10, i11)) {
                long c10 = J.c(b10, i11, i10);
                if (c10 != -9223372036854775807L) {
                    return c10;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long b() {
        return this.f29470i;
    }

    public I c() {
        return this.f29463b;
    }

    public boolean d() {
        return this.f29465d;
    }

    public int e(l lVar, y yVar, int i10) {
        if (i10 <= 0) {
            return a(lVar);
        }
        if (!this.f29467f) {
            return h(lVar, yVar, i10);
        }
        if (this.f29469h == -9223372036854775807L) {
            return a(lVar);
        }
        if (!this.f29466e) {
            return f(lVar, yVar, i10);
        }
        long j10 = this.f29468g;
        if (j10 == -9223372036854775807L) {
            return a(lVar);
        }
        long b10 = this.f29463b.b(this.f29469h) - this.f29463b.b(j10);
        this.f29470i = b10;
        if (b10 < 0) {
            s.i("TsDurationReader", "Invalid duration: " + this.f29470i + ". Using TIME_UNSET instead.");
            this.f29470i = -9223372036854775807L;
        }
        return a(lVar);
    }
}
