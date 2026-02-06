package f3;

import com.google.common.collect.C4770v;
import f2.s;
import f3.K;
import f3.v;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.z;
import z2.O;
import z2.r;

public final class u implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f20747a = new C2073A(new byte[15], 2);

    /* renamed from: b  reason: collision with root package name */
    private final z f20748b = new z();

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20749c = new C2073A();

    /* renamed from: d  reason: collision with root package name */
    private int f20750d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f20751e;

    /* renamed from: f  reason: collision with root package name */
    private O f20752f;

    /* renamed from: g  reason: collision with root package name */
    private double f20753g = -9.223372036854776E18d;

    /* renamed from: h  reason: collision with root package name */
    private double f20754h = -9.223372036854776E18d;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20755i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20756j = true;

    /* renamed from: k  reason: collision with root package name */
    private int f20757k;

    /* renamed from: l  reason: collision with root package name */
    private int f20758l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20759m = true;

    /* renamed from: n  reason: collision with root package name */
    private int f20760n;

    /* renamed from: o  reason: collision with root package name */
    private int f20761o;

    /* renamed from: p  reason: collision with root package name */
    private v.b f20762p = new v.b();

    /* renamed from: q  reason: collision with root package name */
    private int f20763q = -2147483647;

    /* renamed from: r  reason: collision with root package name */
    private int f20764r = -1;

    /* renamed from: s  reason: collision with root package name */
    private int f20765s;

    /* renamed from: t  reason: collision with root package name */
    private long f20766t = -1;

    /* renamed from: u  reason: collision with root package name */
    private boolean f20767u;

    private void f(C2073A a10, C2073A a11, boolean z10) {
        int f10 = a10.f();
        int min = Math.min(a10.a(), a11.a());
        a10.l(a11.e(), a11.f(), min);
        a11.V(min);
        if (z10) {
            a10.U(f10);
        }
    }

    private void g() {
        int i10;
        if (this.f20767u) {
            this.f20756j = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f20764r - this.f20765s)) * 1000000.0d) / ((double) this.f20763q);
        long round = Math.round(this.f20753g);
        if (this.f20755i) {
            this.f20755i = false;
            this.f20753g = this.f20754h;
        } else {
            this.f20753g += d10;
        }
        this.f20752f.d(round, i10, this.f20761o, 0, (O.a) null);
        this.f20767u = false;
        this.f20765s = 0;
        this.f20761o = 0;
    }

    private void h(z zVar) {
        C4770v vVar;
        v.c h10 = v.h(zVar);
        this.f20763q = h10.f20772b;
        this.f20764r = h10.f20773c;
        long j10 = this.f20766t;
        long j11 = this.f20762p.f20769b;
        if (j10 != j11) {
            this.f20766t = j11;
            String str = "mhm1";
            if (h10.f20771a != -1) {
                str = str + String.format(".%02X", new Object[]{Integer.valueOf(h10.f20771a)});
            }
            byte[] bArr = h10.f20774d;
            if (bArr == null || bArr.length <= 0) {
                vVar = null;
            } else {
                vVar = C4770v.I(L.f22077f, bArr);
            }
            this.f20752f.c(new s.b().a0(this.f20751e).o0("audio/mhm1").p0(this.f20763q).O(str).b0(vVar).K());
        }
        this.f20767u = true;
    }

    private boolean i() {
        int g10 = this.f20747a.g();
        this.f20748b.o(this.f20747a.e(), g10);
        boolean g11 = v.g(this.f20748b, this.f20762p);
        if (g11) {
            this.f20760n = 0;
            this.f20761o += this.f20762p.f20770c + g10;
        }
        return g11;
    }

    private boolean j(int i10) {
        if (i10 == 1 || i10 == 17) {
            return true;
        }
        return false;
    }

    private boolean k(C2073A a10) {
        int i10 = this.f20757k;
        if ((i10 & 2) == 0) {
            a10.U(a10.g());
            return false;
        } else if ((i10 & 4) != 0) {
            return true;
        } else {
            while (a10.a() > 0) {
                int i11 = this.f20758l << 8;
                this.f20758l = i11;
                int H10 = i11 | a10.H();
                this.f20758l = H10;
                if (v.e(H10)) {
                    a10.U(a10.f() - 3);
                    this.f20758l = 0;
                    return true;
                }
            }
            return false;
        }
    }

    private void l(C2073A a10) {
        int min = Math.min(a10.a(), this.f20762p.f20770c - this.f20760n);
        this.f20752f.f(a10, min);
        this.f20760n += min;
    }

    public void a() {
        this.f20750d = 0;
        this.f20758l = 0;
        this.f20747a.Q(2);
        this.f20760n = 0;
        this.f20761o = 0;
        this.f20763q = -2147483647;
        this.f20764r = -1;
        this.f20765s = 0;
        this.f20766t = -1;
        this.f20767u = false;
        this.f20755i = false;
        this.f20759m = true;
        this.f20756j = true;
        this.f20753g = -9.223372036854776E18d;
        this.f20754h = -9.223372036854776E18d;
    }

    public void b(C2073A a10) {
        C2076a.i(this.f20752f);
        while (a10.a() > 0) {
            int i10 = this.f20750d;
            if (i10 != 0) {
                if (i10 == 1) {
                    f(a10, this.f20747a, false);
                    if (this.f20747a.a() != 0) {
                        this.f20759m = false;
                    } else if (i()) {
                        this.f20747a.U(0);
                        O o10 = this.f20752f;
                        C2073A a11 = this.f20747a;
                        o10.f(a11, a11.g());
                        this.f20747a.Q(2);
                        this.f20749c.Q(this.f20762p.f20770c);
                        this.f20759m = true;
                        this.f20750d = 2;
                    } else if (this.f20747a.g() < 15) {
                        C2073A a12 = this.f20747a;
                        a12.T(a12.g() + 1);
                        this.f20759m = false;
                    }
                } else if (i10 == 2) {
                    if (j(this.f20762p.f20768a)) {
                        f(a10, this.f20749c, true);
                    }
                    l(a10);
                    int i11 = this.f20760n;
                    v.b bVar = this.f20762p;
                    if (i11 == bVar.f20770c) {
                        int i12 = bVar.f20768a;
                        if (i12 == 1) {
                            h(new z(this.f20749c.e()));
                        } else if (i12 == 17) {
                            this.f20765s = v.f(new z(this.f20749c.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f20750d = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (k(a10)) {
                this.f20750d = 1;
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20757k = i10;
        if (!this.f20756j && (this.f20761o != 0 || !this.f20759m)) {
            this.f20755i = true;
        }
        if (j10 == -9223372036854775807L) {
            return;
        }
        if (this.f20755i) {
            this.f20754h = (double) j10;
        } else {
            this.f20753g = (double) j10;
        }
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20751e = dVar.b();
        this.f20752f = rVar.d(dVar.c(), 1);
    }

    public void c(boolean z10) {
    }
}
