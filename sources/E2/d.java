package E2;

import f2.z;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import z2.C2972p;
import z2.C2973q;
import z2.I;
import z2.J;
import z2.O;
import z2.r;
import z2.u;
import z2.v;
import z2.w;
import z2.x;
import z2.y;

public final class d implements C2972p {

    /* renamed from: o  reason: collision with root package name */
    public static final u f1746o = new c();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f1747a;

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f1748b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f1749c;

    /* renamed from: d  reason: collision with root package name */
    private final v.a f1750d;

    /* renamed from: e  reason: collision with root package name */
    private r f1751e;

    /* renamed from: f  reason: collision with root package name */
    private O f1752f;

    /* renamed from: g  reason: collision with root package name */
    private int f1753g;

    /* renamed from: h  reason: collision with root package name */
    private z f1754h;

    /* renamed from: i  reason: collision with root package name */
    private y f1755i;

    /* renamed from: j  reason: collision with root package name */
    private int f1756j;

    /* renamed from: k  reason: collision with root package name */
    private int f1757k;

    /* renamed from: l  reason: collision with root package name */
    private b f1758l;

    /* renamed from: m  reason: collision with root package name */
    private int f1759m;

    /* renamed from: n  reason: collision with root package name */
    private long f1760n;

    public d() {
        this(0);
    }

    private long c(C2073A a10, boolean z10) {
        boolean z11;
        C2076a.e(this.f1755i);
        int f10 = a10.f();
        while (f10 <= a10.g() - 16) {
            a10.U(f10);
            if (v.d(a10, this.f1755i, this.f1757k, this.f1750d)) {
                a10.U(f10);
                return this.f1750d.f29277a;
            }
            f10++;
        }
        if (z10) {
            while (f10 <= a10.g() - this.f1756j) {
                a10.U(f10);
                boolean z12 = false;
                try {
                    z11 = v.d(a10, this.f1755i, this.f1757k, this.f1750d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (a10.f() <= a10.g()) {
                    z12 = z11;
                }
                if (z12) {
                    a10.U(f10);
                    return this.f1750d.f29277a;
                }
                f10++;
            }
            a10.U(a10.g());
            return -1;
        }
        a10.U(f10);
        return -1;
    }

    private void d(C2973q qVar) {
        this.f1757k = w.b(qVar);
        ((r) L.h(this.f1751e)).u(e(qVar.getPosition(), qVar.a()));
        this.f1753g = 5;
    }

    private J e(long j10, long j11) {
        C2076a.e(this.f1755i);
        y yVar = this.f1755i;
        if (yVar.f29291k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f29290j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f1757k, j10, j11);
        this.f1758l = bVar;
        return bVar.b();
    }

    private void g(C2973q qVar) {
        byte[] bArr = this.f1747a;
        qVar.l(bArr, 0, bArr.length);
        qVar.e();
        this.f1753g = 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C2972p[] l() {
        return new C2972p[]{new d()};
    }

    private void m() {
        ((O) L.h(this.f1752f)).d((this.f1760n * 1000000) / ((long) ((y) L.h(this.f1755i)).f29285e), 1, this.f1759m, 0, (O.a) null);
    }

    private int n(C2973q qVar, I i10) {
        boolean z10;
        C2076a.e(this.f1752f);
        C2076a.e(this.f1755i);
        b bVar = this.f1758l;
        if (bVar != null && bVar.d()) {
            return this.f1758l.c(qVar, i10);
        }
        if (this.f1760n == -1) {
            this.f1760n = v.i(qVar, this.f1755i);
            return 0;
        }
        int g10 = this.f1748b.g();
        if (g10 < 32768) {
            int read = qVar.read(this.f1748b.e(), g10, 32768 - g10);
            if (read == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f1748b.T(g10 + read);
            } else if (this.f1748b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z10 = false;
        }
        int f10 = this.f1748b.f();
        int i11 = this.f1759m;
        int i12 = this.f1756j;
        if (i11 < i12) {
            C2073A a10 = this.f1748b;
            a10.V(Math.min(i12 - i11, a10.a()));
        }
        long c10 = c(this.f1748b, z10);
        int f11 = this.f1748b.f() - f10;
        this.f1748b.U(f10);
        this.f1752f.f(this.f1748b, f11);
        this.f1759m += f11;
        if (c10 != -1) {
            m();
            this.f1759m = 0;
            this.f1760n = c10;
        }
        if (this.f1748b.a() < 16) {
            int a11 = this.f1748b.a();
            System.arraycopy(this.f1748b.e(), this.f1748b.f(), this.f1748b.e(), 0, a11);
            this.f1748b.U(0);
            this.f1748b.T(a11);
        }
        return 0;
    }

    private void o(C2973q qVar) {
        this.f1754h = w.d(qVar, !this.f1749c);
        this.f1753g = 1;
    }

    private void p(C2973q qVar) {
        w.a aVar = new w.a(this.f1755i);
        boolean z10 = false;
        while (!z10) {
            z10 = w.e(qVar, aVar);
            this.f1755i = (y) L.h(aVar.f29278a);
        }
        C2076a.e(this.f1755i);
        this.f1756j = Math.max(this.f1755i.f29283c, 6);
        ((O) L.h(this.f1752f)).c(this.f1755i.g(this.f1747a, this.f1754h));
        this.f1753g = 4;
    }

    private void q(C2973q qVar) {
        w.i(qVar);
        this.f1753g = 3;
    }

    public void a(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f1753g = 0;
        } else {
            b bVar = this.f1758l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f1760n = j12;
        this.f1759m = 0;
        this.f1748b.Q(0);
    }

    public void f(r rVar) {
        this.f1751e = rVar;
        this.f1752f = rVar.d(0, 1);
        rVar.k();
    }

    public int i(C2973q qVar, I i10) {
        int i11 = this.f1753g;
        if (i11 == 0) {
            o(qVar);
            return 0;
        } else if (i11 == 1) {
            g(qVar);
            return 0;
        } else if (i11 == 2) {
            q(qVar);
            return 0;
        } else if (i11 == 3) {
            p(qVar);
            return 0;
        } else if (i11 == 4) {
            d(qVar);
            return 0;
        } else if (i11 == 5) {
            return n(qVar, i10);
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean j(C2973q qVar) {
        w.c(qVar, false);
        return w.a(qVar);
    }

    public d(int i10) {
        this.f1747a = new byte[42];
        this.f1748b = new C2073A(new byte[32768], 0);
        this.f1749c = (i10 & 1) == 0 ? false : true;
        this.f1750d = new v.a();
        this.f1753g = 0;
    }

    public void release() {
    }
}
