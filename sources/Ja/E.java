package ja;

import k9.S0;

public final class E implements u {

    /* renamed from: a  reason: collision with root package name */
    private final C3648d f44963a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f44964b;

    /* renamed from: c  reason: collision with root package name */
    private long f44965c;

    /* renamed from: d  reason: collision with root package name */
    private long f44966d;

    /* renamed from: e  reason: collision with root package name */
    private S0 f44967e = S0.f45372d;

    public E(C3648d dVar) {
        this.f44963a = dVar;
    }

    public void a(long j10) {
        this.f44965c = j10;
        if (this.f44964b) {
            this.f44966d = this.f44963a.a();
        }
    }

    public void b() {
        if (!this.f44964b) {
            this.f44966d = this.f44963a.a();
            this.f44964b = true;
        }
    }

    public S0 c() {
        return this.f44967e;
    }

    public void d() {
        if (this.f44964b) {
            a(u());
            this.f44964b = false;
        }
    }

    public void f(S0 s02) {
        if (this.f44964b) {
            a(u());
        }
        this.f44967e = s02;
    }

    public long u() {
        long b10;
        long j10 = this.f44965c;
        if (!this.f44964b) {
            return j10;
        }
        long a10 = this.f44963a.a() - this.f44966d;
        S0 s02 = this.f44967e;
        if (s02.f45374a == 1.0f) {
            b10 = M.C0(a10);
        } else {
            b10 = s02.b(a10);
        }
        return j10 + b10;
    }
}
