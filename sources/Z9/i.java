package z9;

import ja.B;
import ja.C3645a;
import ja.M;
import k9.C3717q0;
import q9.C3962B;
import q9.l;
import q9.m;
import q9.y;
import q9.z;

abstract class i {

    /* renamed from: a  reason: collision with root package name */
    private final e f50139a = new e();

    /* renamed from: b  reason: collision with root package name */
    private C3962B f50140b;

    /* renamed from: c  reason: collision with root package name */
    private m f50141c;

    /* renamed from: d  reason: collision with root package name */
    private g f50142d;

    /* renamed from: e  reason: collision with root package name */
    private long f50143e;

    /* renamed from: f  reason: collision with root package name */
    private long f50144f;

    /* renamed from: g  reason: collision with root package name */
    private long f50145g;

    /* renamed from: h  reason: collision with root package name */
    private int f50146h;

    /* renamed from: i  reason: collision with root package name */
    private int f50147i;

    /* renamed from: j  reason: collision with root package name */
    private b f50148j = new b();

    /* renamed from: k  reason: collision with root package name */
    private long f50149k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f50150l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f50151m;

    static class b {

        /* renamed from: a  reason: collision with root package name */
        C3717q0 f50152a;

        /* renamed from: b  reason: collision with root package name */
        g f50153b;

        b() {
        }
    }

    private void a() {
        C3645a.h(this.f50140b);
        M.j(this.f50141c);
    }

    private boolean i(l lVar) {
        while (this.f50139a.d(lVar)) {
            this.f50149k = lVar.getPosition() - this.f50144f;
            if (!h(this.f50139a.c(), this.f50144f, this.f50148j)) {
                return true;
            }
            this.f50144f = lVar.getPosition();
        }
        this.f50146h = 3;
        return false;
    }

    private int j(l lVar) {
        boolean z10;
        if (!i(lVar)) {
            return -1;
        }
        C3717q0 q0Var = this.f50148j.f50152a;
        this.f50147i = q0Var.f45784z;
        if (!this.f50151m) {
            this.f50140b.c(q0Var);
            this.f50151m = true;
        }
        g gVar = this.f50148j.f50153b;
        if (gVar != null) {
            this.f50142d = gVar;
        } else if (lVar.a() == -1) {
            this.f50142d = new c();
        } else {
            f b10 = this.f50139a.b();
            if ((b10.f50126b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f50142d = new C4239a(this, this.f50144f, lVar.a(), (long) (b10.f50132h + b10.f50133i), b10.f50127c, z10);
        }
        this.f50146h = 2;
        this.f50139a.f();
        return 0;
    }

    private int k(l lVar, y yVar) {
        l lVar2 = lVar;
        long a10 = this.f50142d.a(lVar2);
        if (a10 >= 0) {
            yVar.f47919a = a10;
            return 1;
        }
        if (a10 < -1) {
            e(-(a10 + 2));
        }
        if (!this.f50150l) {
            this.f50141c.q((z) C3645a.h(this.f50142d.b()));
            this.f50150l = true;
        }
        if (this.f50149k > 0 || this.f50139a.d(lVar2)) {
            this.f50149k = 0;
            B c10 = this.f50139a.c();
            long f10 = f(c10);
            if (f10 >= 0) {
                long j10 = this.f50145g;
                if (j10 + f10 >= this.f50143e) {
                    long b10 = b(j10);
                    this.f50140b.d(c10, c10.f());
                    this.f50140b.f(b10, 1, c10.f(), 0, (C3962B.a) null);
                    this.f50143e = -1;
                }
            }
            this.f50145g += f10;
            return 0;
        }
        this.f50146h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public long b(long j10) {
        return (j10 * 1000000) / ((long) this.f50147i);
    }

    /* access modifiers changed from: protected */
    public long c(long j10) {
        return (((long) this.f50147i) * j10) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public void d(m mVar, C3962B b10) {
        this.f50141c = mVar;
        this.f50140b = b10;
        l(true);
    }

    /* access modifiers changed from: protected */
    public void e(long j10) {
        this.f50145g = j10;
    }

    /* access modifiers changed from: protected */
    public abstract long f(B b10);

    /* access modifiers changed from: package-private */
    public final int g(l lVar, y yVar) {
        a();
        int i10 = this.f50146h;
        if (i10 == 0) {
            return j(lVar);
        }
        if (i10 == 1) {
            lVar.j((int) this.f50144f);
            this.f50146h = 2;
            return 0;
        } else if (i10 == 2) {
            M.j(this.f50142d);
            return k(lVar, yVar);
        } else if (i10 == 3) {
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean h(B b10, long j10, b bVar);

    /* access modifiers changed from: protected */
    public void l(boolean z10) {
        if (z10) {
            this.f50148j = new b();
            this.f50144f = 0;
            this.f50146h = 0;
        } else {
            this.f50146h = 1;
        }
        this.f50143e = -1;
        this.f50145g = 0;
    }

    /* access modifiers changed from: package-private */
    public final void m(long j10, long j11) {
        this.f50139a.e();
        if (j10 == 0) {
            l(!this.f50150l);
        } else if (this.f50146h != 0) {
            this.f50143e = c(j11);
            ((g) M.j(this.f50142d)).c(this.f50143e);
            this.f50146h = 2;
        }
    }

    private static final class c implements g {
        private c() {
        }

        public long a(l lVar) {
            return -1;
        }

        public z b() {
            return new z.b(-9223372036854775807L);
        }

        public void c(long j10) {
        }
    }
}
