package f3;

import f2.C1961B;
import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.z;
import java.util.Collections;
import z2.C2957a;
import z2.O;
import z2.r;

public final class s implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final String f20712a;

    /* renamed from: b  reason: collision with root package name */
    private final int f20713b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20714c;

    /* renamed from: d  reason: collision with root package name */
    private final z f20715d;

    /* renamed from: e  reason: collision with root package name */
    private O f20716e;

    /* renamed from: f  reason: collision with root package name */
    private String f20717f;

    /* renamed from: g  reason: collision with root package name */
    private f2.s f20718g;

    /* renamed from: h  reason: collision with root package name */
    private int f20719h;

    /* renamed from: i  reason: collision with root package name */
    private int f20720i;

    /* renamed from: j  reason: collision with root package name */
    private int f20721j;

    /* renamed from: k  reason: collision with root package name */
    private int f20722k;

    /* renamed from: l  reason: collision with root package name */
    private long f20723l = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20724m;

    /* renamed from: n  reason: collision with root package name */
    private int f20725n;

    /* renamed from: o  reason: collision with root package name */
    private int f20726o;

    /* renamed from: p  reason: collision with root package name */
    private int f20727p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f20728q;

    /* renamed from: r  reason: collision with root package name */
    private long f20729r;

    /* renamed from: s  reason: collision with root package name */
    private int f20730s;

    /* renamed from: t  reason: collision with root package name */
    private long f20731t;

    /* renamed from: u  reason: collision with root package name */
    private int f20732u;

    /* renamed from: v  reason: collision with root package name */
    private String f20733v;

    public s(String str, int i10) {
        this.f20712a = str;
        this.f20713b = i10;
        C2073A a10 = new C2073A(1024);
        this.f20714c = a10;
        this.f20715d = new z(a10.e());
    }

    private static long f(z zVar) {
        return (long) zVar.h((zVar.h(2) + 1) * 8);
    }

    private void g(z zVar) {
        if (!zVar.g()) {
            this.f20724m = true;
            l(zVar);
        } else if (!this.f20724m) {
            return;
        }
        if (this.f20725n != 0) {
            throw C1961B.a((String) null, (Throwable) null);
        } else if (this.f20726o == 0) {
            k(zVar, j(zVar));
            if (this.f20728q) {
                zVar.r((int) this.f20729r);
            }
        } else {
            throw C1961B.a((String) null, (Throwable) null);
        }
    }

    private int h(z zVar) {
        int b10 = zVar.b();
        C2957a.b d10 = C2957a.d(zVar, true);
        this.f20733v = d10.f29159c;
        this.f20730s = d10.f29157a;
        this.f20732u = d10.f29158b;
        return b10 - zVar.b();
    }

    private void i(z zVar) {
        int h10 = zVar.h(3);
        this.f20727p = h10;
        if (h10 == 0) {
            zVar.r(8);
        } else if (h10 == 1) {
            zVar.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            zVar.r(6);
        } else if (h10 == 6 || h10 == 7) {
            zVar.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int j(z zVar) {
        int h10;
        if (this.f20727p == 0) {
            int i10 = 0;
            do {
                h10 = zVar.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw C1961B.a((String) null, (Throwable) null);
    }

    private void k(z zVar, int i10) {
        int e10 = zVar.e();
        boolean z10 = false;
        if ((e10 & 7) == 0) {
            this.f20714c.U(e10 >> 3);
        } else {
            zVar.i(this.f20714c.e(), 0, i10 * 8);
            this.f20714c.U(0);
        }
        this.f20716e.f(this.f20714c, i10);
        if (this.f20723l != -9223372036854775807L) {
            z10 = true;
        }
        C2076a.g(z10);
        this.f20716e.d(this.f20723l, 1, i10, 0, (O.a) null);
        this.f20723l += this.f20731t;
    }

    private void l(z zVar) {
        int i10;
        boolean g10;
        int h10 = zVar.h(1);
        if (h10 == 1) {
            i10 = zVar.h(1);
        } else {
            i10 = 0;
        }
        this.f20725n = i10;
        if (i10 == 0) {
            if (h10 == 1) {
                f(zVar);
            }
            if (zVar.g()) {
                this.f20726o = zVar.h(6);
                int h11 = zVar.h(4);
                int h12 = zVar.h(3);
                if (h11 == 0 && h12 == 0) {
                    if (h10 == 0) {
                        int e10 = zVar.e();
                        int h13 = h(zVar);
                        zVar.p(e10);
                        byte[] bArr = new byte[((h13 + 7) / 8)];
                        zVar.i(bArr, 0, h13);
                        f2.s K10 = new s.b().a0(this.f20717f).o0("audio/mp4a-latm").O(this.f20733v).N(this.f20732u).p0(this.f20730s).b0(Collections.singletonList(bArr)).e0(this.f20712a).m0(this.f20713b).K();
                        if (!K10.equals(this.f20718g)) {
                            this.f20718g = K10;
                            this.f20731t = 1024000000 / ((long) K10.f20060C);
                            this.f20716e.c(K10);
                        }
                    } else {
                        zVar.r(((int) f(zVar)) - h(zVar));
                    }
                    i(zVar);
                    boolean g11 = zVar.g();
                    this.f20728q = g11;
                    this.f20729r = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f20729r = f(zVar);
                        } else {
                            do {
                                g10 = zVar.g();
                                this.f20729r = (this.f20729r << 8) + ((long) zVar.h(8));
                            } while (g10);
                        }
                    }
                    if (zVar.g()) {
                        zVar.r(8);
                        return;
                    }
                    return;
                }
                throw C1961B.a((String) null, (Throwable) null);
            }
            throw C1961B.a((String) null, (Throwable) null);
        }
        throw C1961B.a((String) null, (Throwable) null);
    }

    private void m(int i10) {
        this.f20714c.Q(i10);
        this.f20715d.n(this.f20714c.e());
    }

    public void a() {
        this.f20719h = 0;
        this.f20723l = -9223372036854775807L;
        this.f20724m = false;
    }

    public void b(C2073A a10) {
        C2076a.i(this.f20716e);
        while (a10.a() > 0) {
            int i10 = this.f20719h;
            if (i10 != 0) {
                if (i10 == 1) {
                    int H10 = a10.H();
                    if ((H10 & 224) == 224) {
                        this.f20722k = H10;
                        this.f20719h = 2;
                    } else if (H10 != 86) {
                        this.f20719h = 0;
                    }
                } else if (i10 == 2) {
                    int H11 = ((this.f20722k & -225) << 8) | a10.H();
                    this.f20721j = H11;
                    if (H11 > this.f20714c.e().length) {
                        m(this.f20721j);
                    }
                    this.f20720i = 0;
                    this.f20719h = 3;
                } else if (i10 == 3) {
                    int min = Math.min(a10.a(), this.f20721j - this.f20720i);
                    a10.l(this.f20715d.f22164a, this.f20720i, min);
                    int i11 = this.f20720i + min;
                    this.f20720i = i11;
                    if (i11 == this.f20721j) {
                        this.f20715d.p(0);
                        g(this.f20715d);
                        this.f20719h = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (a10.H() == 86) {
                this.f20719h = 1;
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20723l = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20716e = rVar.d(dVar.c(), 1);
        this.f20717f = dVar.b();
    }

    public void c(boolean z10) {
    }
}
