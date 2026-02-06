package m2;

import f2.C1963D;
import i2.C2078c;
import i2.L;

/* renamed from: m2.C  reason: case insensitive filesystem */
public final class C2191C implements y {

    /* renamed from: a  reason: collision with root package name */
    private final C2078c f23695a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23696b;

    /* renamed from: c  reason: collision with root package name */
    private long f23697c;

    /* renamed from: d  reason: collision with root package name */
    private long f23698d;

    /* renamed from: e  reason: collision with root package name */
    private C1963D f23699e = C1963D.f19706d;

    public C2191C(C2078c cVar) {
        this.f23695a = cVar;
    }

    public void a(long j10) {
        this.f23697c = j10;
        if (this.f23696b) {
            this.f23698d = this.f23695a.a();
        }
    }

    public void b() {
        if (!this.f23696b) {
            this.f23698d = this.f23695a.a();
            this.f23696b = true;
        }
    }

    public C1963D c() {
        return this.f23699e;
    }

    public void d() {
        if (this.f23696b) {
            a(u());
            this.f23696b = false;
        }
    }

    public void f(C1963D d10) {
        if (this.f23696b) {
            a(u());
        }
        this.f23699e = d10;
    }

    public long u() {
        long a10;
        long j10 = this.f23697c;
        if (!this.f23696b) {
            return j10;
        }
        long a11 = this.f23695a.a() - this.f23698d;
        C1963D d10 = this.f23699e;
        if (d10.f19709a == 1.0f) {
            a10 = L.L0(a11);
        } else {
            a10 = d10.a(a11);
        }
        return j10 + a10;
    }
}
