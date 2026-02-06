package U2;

import f2.s;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.O;
import z2.r;

abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f6378a = new e();

    /* renamed from: b  reason: collision with root package name */
    private O f6379b;

    /* renamed from: c  reason: collision with root package name */
    private r f6380c;

    /* renamed from: d  reason: collision with root package name */
    private g f6381d;

    /* renamed from: e  reason: collision with root package name */
    private long f6382e;

    /* renamed from: f  reason: collision with root package name */
    private long f6383f;

    /* renamed from: g  reason: collision with root package name */
    private long f6384g;

    /* renamed from: h  reason: collision with root package name */
    private int f6385h;

    /* renamed from: i  reason: collision with root package name */
    private int f6386i;

    /* renamed from: j  reason: collision with root package name */
    private b f6387j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f6388k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f6389l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f6390m;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        s f6391a;

        /* renamed from: b  reason: collision with root package name */
        g f6392b;

        b() {
        }
    }

    private void a() {
        C2076a.i(this.f6379b);
        L.h(this.f6380c);
    }

    private boolean i(C2973q qVar) {
        while (this.f6378a.d(qVar)) {
            this.f6388k = qVar.getPosition() - this.f6383f;
            if (!h(this.f6378a.c(), this.f6383f, this.f6387j)) {
                return true;
            }
            this.f6383f = qVar.getPosition();
        }
        this.f6385h = 3;
        return false;
    }

    private int j(C2973q qVar) {
        boolean z10;
        if (!i(qVar)) {
            return -1;
        }
        s sVar = this.f6387j.f6391a;
        this.f6386i = sVar.f20060C;
        if (!this.f6390m) {
            this.f6379b.c(sVar);
            this.f6390m = true;
        }
        g gVar = this.f6387j.f6392b;
        if (gVar != null) {
            this.f6381d = gVar;
        } else if (qVar.a() == -1) {
            this.f6381d = new c();
        } else {
            f b10 = this.f6378a.b();
            if ((b10.f6365b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f6381d = new a(this, this.f6383f, qVar.a(), (long) (b10.f6371h + b10.f6372i), b10.f6366c, z10);
        }
        this.f6385h = 2;
        this.f6378a.f();
        return 0;
    }

    private int k(C2973q qVar, I i10) {
        C2973q qVar2 = qVar;
        long a10 = this.f6381d.a(qVar2);
        if (a10 >= 0) {
            i10.f29106a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f6389l) {
            this.f6380c.u((J) C2076a.i(this.f6381d.b()));
            this.f6389l = true;
        }
        if (this.f6388k > 0 || this.f6378a.d(qVar2)) {
            this.f6388k = 0;
            C2073A c10 = this.f6378a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f6384g;
                if (j10 + f10 >= this.f6382e) {
                    long b10 = b(j10);
                    this.f6379b.f(c10, c10.g());
                    this.f6379b.d(b10, 1, c10.g(), 0, (O.a) null);
                    this.f6382e = -1;
                }
            }
            this.f6384g += f10;
            return 0;
        }
        this.f6385h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f6386i);
    }

    /* access modifiers changed from: protected */
    public long c(long j10) {
        return (((long) this.f6386i) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void d(r rVar, O o10) {
        this.f6380c = rVar;
        this.f6379b = o10;
        l(true);
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        this.f6384g = j10;
    }

    /* access modifiers changed from: protected */
    public abstract long f(C2073A a10);

    /* access modifiers changed from: package-private */
    public final int g(C2973q qVar, I i10) {
        a();
        int i11 = this.f6385h;
        if (i11 == 0) {
            return j(qVar);
        }
        if (i11 == 1) {
            qVar.j((int) this.f6383f);
            this.f6385h = 2;
            return 0;
        } else if (i11 == 2) {
            L.h(this.f6381d);
            return k(qVar, i10);
        } else if (i11 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(C2073A a10, long j10, b bVar);

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f6387j = new b();
            this.f6383f = 0;
            this.f6385h = 0;
        } else {
            this.f6385h = 1;
        }
        this.f6382e = -1;
        this.f6384g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f6378a.e();
        if (j10 == 0) {
            l(!this.f6389l);
        } else if (this.f6385h != 0) {
            this.f6382e = c(j11);
            ((g) L.h(this.f6381d)).c(this.f6382e);
            this.f6385h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        public long a(C2973q qVar) {
            return -1;
        }

        public J b() {
            return new J.b(-9223372036854775807L);
        }

        public void c(long j10) {
        }
    }
}
