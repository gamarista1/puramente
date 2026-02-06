package x2;

import f2.P;
import i2.C2076a;
import i2.F;
import i2.r;
import x2.p;

final class s {

    /* renamed from: a  reason: collision with root package name */
    private final a f28384a;

    /* renamed from: b  reason: collision with root package name */
    private final p f28385b;

    /* renamed from: c  reason: collision with root package name */
    private final p.a f28386c = new p.a();

    /* renamed from: d  reason: collision with root package name */
    private final F f28387d = new F();

    /* renamed from: e  reason: collision with root package name */
    private final F f28388e = new F();

    /* renamed from: f  reason: collision with root package name */
    private final r f28389f = new r();

    /* renamed from: g  reason: collision with root package name */
    private P f28390g;

    /* renamed from: h  reason: collision with root package name */
    private P f28391h = P.f19906e;

    /* renamed from: i  reason: collision with root package name */
    private long f28392i;

    /* renamed from: j  reason: collision with root package name */
    private long f28393j = -9223372036854775807L;

    interface a {
        void a();

        void b(long j10, long j11, long j12, boolean z10);

        void p(P p10);
    }

    public s(a aVar, p pVar) {
        this.f28384a = aVar;
        this.f28385b = pVar;
    }

    private void a() {
        C2076a.i(Long.valueOf(this.f28389f.d()));
        this.f28384a.a();
    }

    private static Object c(F f10) {
        boolean z10;
        if (f10.l() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        while (f10.l() > 1) {
            f10.i();
        }
        return C2076a.e(f10.i());
    }

    private boolean f(long j10) {
        Long l10 = (Long) this.f28388e.j(j10);
        if (l10 == null || l10.longValue() == this.f28392i) {
            return false;
        }
        this.f28392i = l10.longValue();
        return true;
    }

    private boolean g(long j10) {
        P p10 = (P) this.f28387d.j(j10);
        if (p10 == null || p10.equals(P.f19906e) || p10.equals(this.f28391h)) {
            return false;
        }
        this.f28391h = p10;
        return true;
    }

    private void i(boolean z10) {
        long g10;
        long longValue = ((Long) C2076a.i(Long.valueOf(this.f28389f.d()))).longValue();
        if (g(longValue)) {
            this.f28384a.p(this.f28391h);
        }
        if (z10) {
            g10 = -1;
        } else {
            g10 = this.f28386c.g();
        }
        this.f28384a.b(g10, longValue, this.f28392i, this.f28385b.i());
    }

    public void b() {
        this.f28389f.a();
        this.f28393j = -9223372036854775807L;
        if (this.f28388e.l() > 0) {
            Long l10 = (Long) c(this.f28388e);
            l10.longValue();
            this.f28388e.a(0, l10);
        }
        if (this.f28390g != null) {
            this.f28387d.c();
        } else if (this.f28387d.l() > 0) {
            this.f28390g = (P) c(this.f28387d);
        }
    }

    public boolean d(long j10) {
        long j11 = this.f28393j;
        if (j11 == -9223372036854775807L || j11 < j10) {
            return false;
        }
        return true;
    }

    public boolean e() {
        return this.f28385b.d(true);
    }

    public void h(long j10, long j11) {
        while (!this.f28389f.c()) {
            long b10 = this.f28389f.b();
            if (f(b10)) {
                this.f28385b.j();
            }
            int c10 = this.f28385b.c(b10, j10, j11, this.f28392i, false, this.f28386c);
            boolean z10 = true;
            if (c10 == 0 || c10 == 1) {
                this.f28393j = b10;
                if (c10 != 0) {
                    z10 = false;
                }
                i(z10);
            } else if (c10 == 2 || c10 == 3 || c10 == 4) {
                this.f28393j = b10;
                a();
            } else if (c10 != 5) {
                throw new IllegalStateException(String.valueOf(c10));
            } else {
                return;
            }
        }
    }

    public void j(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.a(z10);
        this.f28385b.r(f10);
    }
}
