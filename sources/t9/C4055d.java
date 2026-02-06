package t9;

import D9.a;
import ja.B;
import ja.C3645a;
import ja.M;
import q9.C3962B;
import q9.k;
import q9.l;
import q9.m;
import q9.p;
import q9.q;
import q9.r;
import q9.s;
import q9.t;
import q9.y;
import q9.z;

/* renamed from: t9.d  reason: case insensitive filesystem */
public final class C4055d implements k {

    /* renamed from: o  reason: collision with root package name */
    public static final p f48294o = new C4054c();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f48295a;

    /* renamed from: b  reason: collision with root package name */
    private final B f48296b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f48297c;

    /* renamed from: d  reason: collision with root package name */
    private final q.a f48298d;

    /* renamed from: e  reason: collision with root package name */
    private m f48299e;

    /* renamed from: f  reason: collision with root package name */
    private C3962B f48300f;

    /* renamed from: g  reason: collision with root package name */
    private int f48301g;

    /* renamed from: h  reason: collision with root package name */
    private a f48302h;

    /* renamed from: i  reason: collision with root package name */
    private t f48303i;

    /* renamed from: j  reason: collision with root package name */
    private int f48304j;

    /* renamed from: k  reason: collision with root package name */
    private int f48305k;

    /* renamed from: l  reason: collision with root package name */
    private C4053b f48306l;

    /* renamed from: m  reason: collision with root package name */
    private int f48307m;

    /* renamed from: n  reason: collision with root package name */
    private long f48308n;

    public C4055d() {
        this(0);
    }

    private long c(B b10, boolean z10) {
        boolean z11;
        C3645a.e(this.f48303i);
        int e10 = b10.e();
        while (e10 <= b10.f() - 16) {
            b10.P(e10);
            if (q.d(b10, this.f48303i, this.f48305k, this.f48298d)) {
                b10.P(e10);
                return this.f48298d.f47892a;
            }
            e10++;
        }
        if (z10) {
            while (e10 <= b10.f() - this.f48304j) {
                b10.P(e10);
                boolean z12 = false;
                try {
                    z11 = q.d(b10, this.f48303i, this.f48305k, this.f48298d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (b10.e() <= b10.f()) {
                    z12 = z11;
                }
                if (z12) {
                    b10.P(e10);
                    return this.f48298d.f47892a;
                }
                e10++;
            }
            b10.P(b10.f());
            return -1;
        }
        b10.P(e10);
        return -1;
    }

    private void d(l lVar) {
        this.f48305k = r.b(lVar);
        ((m) M.j(this.f48299e)).q(e(lVar.getPosition(), lVar.a()));
        this.f48301g = 5;
    }

    private z e(long j10, long j11) {
        C3645a.e(this.f48303i);
        t tVar = this.f48303i;
        if (tVar.f47906k != null) {
            return new s(tVar, j10);
        }
        if (j11 == -1 || tVar.f47905j <= 0) {
            return new z.b(tVar.f());
        }
        C4053b bVar = new C4053b(tVar, this.f48305k, j10, j11);
        this.f48306l = bVar;
        return bVar.b();
    }

    private void g(l lVar) {
        byte[] bArr = this.f48295a;
        lVar.l(bArr, 0, bArr.length);
        lVar.e();
        this.f48301g = 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k[] j() {
        return new k[]{new C4055d()};
    }

    private void k() {
        ((C3962B) M.j(this.f48300f)).f((this.f48308n * 1000000) / ((long) ((t) M.j(this.f48303i)).f47900e), 1, this.f48307m, 0, (C3962B.a) null);
    }

    private int l(l lVar, y yVar) {
        boolean z10;
        C3645a.e(this.f48300f);
        C3645a.e(this.f48303i);
        C4053b bVar = this.f48306l;
        if (bVar != null && bVar.d()) {
            return this.f48306l.c(lVar, yVar);
        }
        if (this.f48308n == -1) {
            this.f48308n = q.i(lVar, this.f48303i);
            return 0;
        }
        int f10 = this.f48296b.f();
        if (f10 < 32768) {
            int read = lVar.read(this.f48296b.d(), f10, 32768 - f10);
            if (read == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f48296b.O(f10 + read);
            } else if (this.f48296b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z10 = false;
        }
        int e10 = this.f48296b.e();
        int i10 = this.f48307m;
        int i11 = this.f48304j;
        if (i10 < i11) {
            B b10 = this.f48296b;
            b10.Q(Math.min(i11 - i10, b10.a()));
        }
        long c10 = c(this.f48296b, z10);
        int e11 = this.f48296b.e() - e10;
        this.f48296b.P(e10);
        this.f48300f.d(this.f48296b, e11);
        this.f48307m += e11;
        if (c10 != -1) {
            k();
            this.f48307m = 0;
            this.f48308n = c10;
        }
        if (this.f48296b.a() < 16) {
            int a10 = this.f48296b.a();
            System.arraycopy(this.f48296b.d(), this.f48296b.e(), this.f48296b.d(), 0, a10);
            this.f48296b.P(0);
            this.f48296b.O(a10);
        }
        return 0;
    }

    private void m(l lVar) {
        this.f48302h = r.d(lVar, !this.f48297c);
        this.f48301g = 1;
    }

    private void n(l lVar) {
        r.a aVar = new r.a(this.f48303i);
        boolean z10 = false;
        while (!z10) {
            z10 = r.e(lVar, aVar);
            this.f48303i = (t) M.j(aVar.f47893a);
        }
        C3645a.e(this.f48303i);
        this.f48304j = Math.max(this.f48303i.f47898c, 6);
        ((C3962B) M.j(this.f48300f)).c(this.f48303i.g(this.f48295a, this.f48302h));
        this.f48301g = 4;
    }

    private void o(l lVar) {
        r.i(lVar);
        this.f48301g = 3;
    }

    public void a(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f48301g = 0;
        } else {
            C4053b bVar = this.f48306l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f48308n = j12;
        this.f48307m = 0;
        this.f48296b.L(0);
    }

    public void f(m mVar) {
        this.f48299e = mVar;
        this.f48300f = mVar.d(0, 1);
        mVar.k();
    }

    public boolean h(l lVar) {
        r.c(lVar, false);
        return r.a(lVar);
    }

    public int i(l lVar, y yVar) {
        int i10 = this.f48301g;
        if (i10 == 0) {
            m(lVar);
            return 0;
        } else if (i10 == 1) {
            g(lVar);
            return 0;
        } else if (i10 == 2) {
            o(lVar);
            return 0;
        } else if (i10 == 3) {
            n(lVar);
            return 0;
        } else if (i10 == 4) {
            d(lVar);
            return 0;
        } else if (i10 == 5) {
            return l(lVar, yVar);
        } else {
            throw new IllegalStateException();
        }
    }

    public C4055d(int i10) {
        this.f48295a = new byte[42];
        this.f48296b = new B(new byte[32768], 0);
        this.f48297c = (i10 & 1) == 0 ? false : true;
        this.f48298d = new q.a();
        this.f48301g = 0;
    }

    public void release() {
    }
}
