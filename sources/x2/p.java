package x2;

import android.content.Context;
import android.view.Surface;
import i2.C2078c;
import i2.L;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final b f28345a;

    /* renamed from: b  reason: collision with root package name */
    private final r f28346b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28347c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f28348d;

    /* renamed from: e  reason: collision with root package name */
    private int f28349e = 0;

    /* renamed from: f  reason: collision with root package name */
    private long f28350f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f28351g;

    /* renamed from: h  reason: collision with root package name */
    private long f28352h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f28353i = -9223372036854775807L;

    /* renamed from: j  reason: collision with root package name */
    private boolean f28354j;

    /* renamed from: k  reason: collision with root package name */
    private float f28355k = 1.0f;

    /* renamed from: l  reason: collision with root package name */
    private C2078c f28356l = C2078c.f22089a;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f28357a = -9223372036854775807L;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public long f28358b = -9223372036854775807L;

        /* access modifiers changed from: private */
        public void h() {
            this.f28357a = -9223372036854775807L;
            this.f28358b = -9223372036854775807L;
        }

        public long f() {
            return this.f28357a;
        }

        public long g() {
            return this.f28358b;
        }
    }

    public interface b {
        boolean J(long j10, long j11);

        boolean K(long j10, long j11, long j12, boolean z10, boolean z11);

        boolean Q(long j10, long j11, boolean z10);
    }

    public p(Context context, b bVar, long j10) {
        this.f28345a = bVar;
        this.f28347c = j10;
        this.f28346b = new r(context);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) (((double) (j12 - j10)) / ((double) this.f28355k));
        if (this.f28348d) {
            return j13 - (L.L0(this.f28356l.a()) - j11);
        }
        return j13;
    }

    private void f(int i10) {
        this.f28349e = Math.min(this.f28349e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f28353i != -9223372036854775807L && !this.f28354j) {
            return false;
        }
        int i10 = this.f28349e;
        if (i10 == 0) {
            return this.f28348d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                long L02 = L.L0(this.f28356l.a()) - this.f28351g;
                if (!this.f28348d || !this.f28345a.J(j11, L02)) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException();
        } else if (j10 >= j12) {
            return true;
        } else {
            return false;
        }
    }

    public void a() {
        if (this.f28349e == 0) {
            this.f28349e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, a aVar) {
        long j14 = j10;
        long j15 = j11;
        a aVar2 = aVar;
        aVar.h();
        if (this.f28350f == -9223372036854775807L) {
            this.f28350f = j15;
        }
        if (this.f28352h != j14) {
            this.f28346b.h(j14);
            this.f28352h = j14;
        }
        long unused = aVar2.f28357a = b(j11, j12, j10);
        boolean z11 = false;
        if (s(j11, aVar.f28357a, j13)) {
            return 0;
        }
        if (!this.f28348d || j15 == this.f28350f) {
            return 5;
        }
        long b10 = this.f28356l.b();
        long unused2 = aVar2.f28358b = this.f28346b.b((aVar.f28357a * 1000) + b10);
        long unused3 = aVar2.f28357a = (aVar.f28358b - b10) / 1000;
        if (this.f28353i != -9223372036854775807L && !this.f28354j) {
            z11 = true;
        }
        if (this.f28345a.K(aVar.f28357a, j11, j12, z10, z11)) {
            return 4;
        }
        if (this.f28345a.Q(aVar.f28357a, j12, z10)) {
            if (z11) {
                return 3;
            }
            return 2;
        } else if (aVar.f28357a > 50000) {
            return 5;
        } else {
            return 1;
        }
    }

    public boolean d(boolean z10) {
        if (z10 && this.f28349e == 3) {
            this.f28353i = -9223372036854775807L;
            return true;
        } else if (this.f28353i == -9223372036854775807L) {
            return false;
        } else {
            if (this.f28356l.a() < this.f28353i) {
                return true;
            }
            this.f28353i = -9223372036854775807L;
            return false;
        }
    }

    public void e(boolean z10) {
        long j10;
        this.f28354j = z10;
        if (this.f28347c > 0) {
            j10 = this.f28356l.a() + this.f28347c;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f28353i = j10;
    }

    public void g() {
        f(0);
    }

    public void h(boolean z10) {
        this.f28349e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10;
        if (this.f28349e != 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28349e = 3;
        this.f28351g = L.L0(this.f28356l.a());
        return z10;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f28348d = true;
        this.f28351g = L.L0(this.f28356l.a());
        this.f28346b.k();
    }

    public void l() {
        this.f28348d = false;
        this.f28353i = -9223372036854775807L;
        this.f28346b.l();
    }

    public void m() {
        this.f28346b.j();
        this.f28352h = -9223372036854775807L;
        this.f28350f = -9223372036854775807L;
        f(1);
        this.f28353i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f28346b.o(i10);
    }

    public void o(C2078c cVar) {
        this.f28356l = cVar;
    }

    public void p(float f10) {
        this.f28346b.g(f10);
    }

    public void q(Surface surface) {
        this.f28346b.m(surface);
        f(1);
    }

    public void r(float f10) {
        if (f10 != this.f28355k) {
            this.f28355k = f10;
            this.f28346b.i(f10);
        }
    }
}
