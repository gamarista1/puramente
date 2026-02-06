package x9;

import ja.M;
import ja.t;
import q9.C3961A;
import q9.z;

/* renamed from: x9.b  reason: case insensitive filesystem */
final class C4180b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f49495a;

    /* renamed from: b  reason: collision with root package name */
    private final t f49496b;

    /* renamed from: c  reason: collision with root package name */
    private final t f49497c;

    /* renamed from: d  reason: collision with root package name */
    private long f49498d;

    public C4180b(long j10, long j11, long j12) {
        this.f49498d = j10;
        this.f49495a = j12;
        t tVar = new t();
        this.f49496b = tVar;
        t tVar2 = new t();
        this.f49497c = tVar2;
        tVar.a(0);
        tVar2.a(j11);
    }

    public boolean a(long j10) {
        t tVar = this.f49496b;
        if (j10 - tVar.b(tVar.c() - 1) < 100000) {
            return true;
        }
        return false;
    }

    public long b(long j10) {
        return this.f49496b.b(M.f(this.f49497c, j10, true, true));
    }

    public z.a c(long j10) {
        int f10 = M.f(this.f49496b, j10, true, true);
        C3961A a10 = new C3961A(this.f49496b.b(f10), this.f49497c.b(f10));
        if (a10.f47789a == j10 || f10 == this.f49496b.c() - 1) {
            return new z.a(a10);
        }
        int i10 = f10 + 1;
        return new z.a(a10, new C3961A(this.f49496b.b(i10), this.f49497c.b(i10)));
    }

    public long d() {
        return this.f49495a;
    }

    public boolean e() {
        return true;
    }

    public void f(long j10, long j11) {
        if (!a(j10)) {
            this.f49496b.a(j10);
            this.f49497c.a(j11);
        }
    }

    public long g() {
        return this.f49498d;
    }

    /* access modifiers changed from: package-private */
    public void h(long j10) {
        this.f49498d = j10;
    }
}
