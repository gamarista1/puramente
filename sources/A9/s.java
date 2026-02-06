package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import java.util.Collections;
import k9.C3717q0;
import k9.L0;
import m9.C3843a;
import q9.C3962B;
import q9.m;

public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f29729a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29730b;

    /* renamed from: c  reason: collision with root package name */
    private final A f29731c;

    /* renamed from: d  reason: collision with root package name */
    private C3962B f29732d;

    /* renamed from: e  reason: collision with root package name */
    private String f29733e;

    /* renamed from: f  reason: collision with root package name */
    private C3717q0 f29734f;

    /* renamed from: g  reason: collision with root package name */
    private int f29735g;

    /* renamed from: h  reason: collision with root package name */
    private int f29736h;

    /* renamed from: i  reason: collision with root package name */
    private int f29737i;

    /* renamed from: j  reason: collision with root package name */
    private int f29738j;

    /* renamed from: k  reason: collision with root package name */
    private long f29739k = -9223372036854775807L;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29740l;

    /* renamed from: m  reason: collision with root package name */
    private int f29741m;

    /* renamed from: n  reason: collision with root package name */
    private int f29742n;

    /* renamed from: o  reason: collision with root package name */
    private int f29743o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29744p;

    /* renamed from: q  reason: collision with root package name */
    private long f29745q;

    /* renamed from: r  reason: collision with root package name */
    private int f29746r;

    /* renamed from: s  reason: collision with root package name */
    private long f29747s;

    /* renamed from: t  reason: collision with root package name */
    private int f29748t;

    /* renamed from: u  reason: collision with root package name */
    private String f29749u;

    public s(String str) {
        this.f29729a = str;
        B b10 = new B(1024);
        this.f29730b = b10;
        this.f29731c = new A(b10.d());
    }

    private static long b(A a10) {
        return (long) a10.h((a10.h(2) + 1) * 8);
    }

    private void g(A a10) {
        if (!a10.g()) {
            this.f29740l = true;
            l(a10);
        } else if (!this.f29740l) {
            return;
        }
        if (this.f29741m != 0) {
            throw L0.a((String) null, (Throwable) null);
        } else if (this.f29742n == 0) {
            k(a10, j(a10));
            if (this.f29744p) {
                a10.r((int) this.f29745q);
            }
        } else {
            throw L0.a((String) null, (Throwable) null);
        }
    }

    private int h(A a10) {
        int b10 = a10.b();
        C3843a.b e10 = C3843a.e(a10, true);
        this.f29749u = e10.f46612c;
        this.f29746r = e10.f46610a;
        this.f29748t = e10.f46611b;
        return b10 - a10.b();
    }

    private void i(A a10) {
        int h10 = a10.h(3);
        this.f29743o = h10;
        if (h10 == 0) {
            a10.r(8);
        } else if (h10 == 1) {
            a10.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            a10.r(6);
        } else if (h10 == 6 || h10 == 7) {
            a10.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int j(A a10) {
        int h10;
        if (this.f29743o == 0) {
            int i10 = 0;
            do {
                h10 = a10.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw L0.a((String) null, (Throwable) null);
    }

    private void k(A a10, int i10) {
        int e10 = a10.e();
        if ((e10 & 7) == 0) {
            this.f29730b.P(e10 >> 3);
        } else {
            a10.i(this.f29730b.d(), 0, i10 * 8);
            this.f29730b.P(0);
        }
        this.f29732d.d(this.f29730b, i10);
        long j10 = this.f29739k;
        if (j10 != -9223372036854775807L) {
            this.f29732d.f(j10, 1, i10, 0, (C3962B.a) null);
            this.f29739k += this.f29747s;
        }
    }

    private void l(A a10) {
        int i10;
        boolean g10;
        int h10 = a10.h(1);
        if (h10 == 1) {
            i10 = a10.h(1);
        } else {
            i10 = 0;
        }
        this.f29741m = i10;
        if (i10 == 0) {
            if (h10 == 1) {
                b(a10);
            }
            if (a10.g()) {
                this.f29742n = a10.h(6);
                int h11 = a10.h(4);
                int h12 = a10.h(3);
                if (h11 == 0 && h12 == 0) {
                    if (h10 == 0) {
                        int e10 = a10.e();
                        int h13 = h(a10);
                        a10.p(e10);
                        byte[] bArr = new byte[((h13 + 7) / 8)];
                        a10.i(bArr, 0, h13);
                        C3717q0 E10 = new C3717q0.b().S(this.f29733e).e0("audio/mp4a-latm").I(this.f29749u).H(this.f29748t).f0(this.f29746r).T(Collections.singletonList(bArr)).V(this.f29729a).E();
                        if (!E10.equals(this.f29734f)) {
                            this.f29734f = E10;
                            this.f29747s = 1024000000 / ((long) E10.f45784z);
                            this.f29732d.c(E10);
                        }
                    } else {
                        a10.r(((int) b(a10)) - h(a10));
                    }
                    i(a10);
                    boolean g11 = a10.g();
                    this.f29744p = g11;
                    this.f29745q = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f29745q = b(a10);
                        } else {
                            do {
                                g10 = a10.g();
                                this.f29745q = (this.f29745q << 8) + ((long) a10.h(8));
                            } while (g10);
                        }
                    }
                    if (a10.g()) {
                        a10.r(8);
                        return;
                    }
                    return;
                }
                throw L0.a((String) null, (Throwable) null);
            }
            throw L0.a((String) null, (Throwable) null);
        }
        throw L0.a((String) null, (Throwable) null);
    }

    private void m(int i10) {
        this.f29730b.L(i10);
        this.f29731c.n(this.f29730b.d());
    }

    public void a() {
        this.f29735g = 0;
        this.f29739k = -9223372036854775807L;
        this.f29740l = false;
    }

    public void c(B b10) {
        C3645a.h(this.f29732d);
        while (b10.a() > 0) {
            int i10 = this.f29735g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int D10 = b10.D();
                    if ((D10 & 224) == 224) {
                        this.f29738j = D10;
                        this.f29735g = 2;
                    } else if (D10 != 86) {
                        this.f29735g = 0;
                    }
                } else if (i10 == 2) {
                    int D11 = ((this.f29738j & -225) << 8) | b10.D();
                    this.f29737i = D11;
                    if (D11 > this.f29730b.d().length) {
                        m(this.f29737i);
                    }
                    this.f29736h = 0;
                    this.f29735g = 3;
                } else if (i10 == 3) {
                    int min = Math.min(b10.a(), this.f29737i - this.f29736h);
                    b10.j(this.f29731c.f44946a, this.f29736h, min);
                    int i11 = this.f29736h + min;
                    this.f29736h = i11;
                    if (i11 == this.f29737i) {
                        this.f29731c.p(0);
                        g(this.f29731c);
                        this.f29735g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (b10.D() == 86) {
                this.f29735g = 1;
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29739k = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29732d = mVar.d(dVar.c(), 1);
        this.f29733e = dVar.b();
    }

    public void e() {
    }
}
