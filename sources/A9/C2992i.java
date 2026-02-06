package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.M;
import ja.s;
import java.util.Arrays;
import java.util.Collections;
import k9.C3717q0;
import m9.C3843a;
import q9.C3962B;
import q9.j;
import q9.m;

/* renamed from: A9.i  reason: case insensitive filesystem */
public final class C2992i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f29558v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f29559a;

    /* renamed from: b  reason: collision with root package name */
    private final A f29560b;

    /* renamed from: c  reason: collision with root package name */
    private final B f29561c;

    /* renamed from: d  reason: collision with root package name */
    private final String f29562d;

    /* renamed from: e  reason: collision with root package name */
    private String f29563e;

    /* renamed from: f  reason: collision with root package name */
    private C3962B f29564f;

    /* renamed from: g  reason: collision with root package name */
    private C3962B f29565g;

    /* renamed from: h  reason: collision with root package name */
    private int f29566h;

    /* renamed from: i  reason: collision with root package name */
    private int f29567i;

    /* renamed from: j  reason: collision with root package name */
    private int f29568j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29569k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f29570l;

    /* renamed from: m  reason: collision with root package name */
    private int f29571m;

    /* renamed from: n  reason: collision with root package name */
    private int f29572n;

    /* renamed from: o  reason: collision with root package name */
    private int f29573o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f29574p;

    /* renamed from: q  reason: collision with root package name */
    private long f29575q;

    /* renamed from: r  reason: collision with root package name */
    private int f29576r;

    /* renamed from: s  reason: collision with root package name */
    private long f29577s;

    /* renamed from: t  reason: collision with root package name */
    private C3962B f29578t;

    /* renamed from: u  reason: collision with root package name */
    private long f29579u;

    public C2992i(boolean z10) {
        this(z10, (String) null);
    }

    private void b() {
        C3645a.e(this.f29564f);
        M.j(this.f29578t);
        M.j(this.f29565g);
    }

    private void g(B b10) {
        if (b10.a() != 0) {
            this.f29560b.f44946a[0] = b10.d()[b10.e()];
            this.f29560b.p(2);
            int h10 = this.f29560b.h(4);
            int i10 = this.f29572n;
            if (i10 == -1 || h10 == i10) {
                if (!this.f29570l) {
                    this.f29570l = true;
                    this.f29571m = this.f29573o;
                    this.f29572n = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    private boolean h(B b10, int i10) {
        b10.P(i10 + 1);
        if (!w(b10, this.f29560b.f44946a, 1)) {
            return false;
        }
        this.f29560b.p(4);
        int h10 = this.f29560b.h(1);
        int i11 = this.f29571m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f29572n != -1) {
            if (!w(b10, this.f29560b.f44946a, 1)) {
                return true;
            }
            this.f29560b.p(2);
            if (this.f29560b.h(4) != this.f29572n) {
                return false;
            }
            b10.P(i10 + 2);
        }
        if (!w(b10, this.f29560b.f44946a, 4)) {
            return true;
        }
        this.f29560b.p(14);
        int h11 = this.f29560b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] d10 = b10.d();
        int f10 = b10.f();
        int i12 = i10 + h11;
        if (i12 >= f10) {
            return true;
        }
        byte b11 = d10[i12];
        if (b11 == -1) {
            int i13 = i12 + 1;
            if (i13 == f10) {
                return true;
            }
            if (!l((byte) -1, d10[i13]) || ((d10[i13] & 8) >> 3) != h10) {
                return false;
            }
            return true;
        } else if (b11 != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == f10) {
                return true;
            }
            if (d10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            if (i15 == f10 || d10[i15] == 51) {
                return true;
            }
            return false;
        }
    }

    private boolean i(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f29567i);
        b10.j(bArr, this.f29567i, min);
        int i11 = this.f29567i + min;
        this.f29567i = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void j(B b10) {
        byte[] d10 = b10.d();
        int e10 = b10.e();
        int f10 = b10.f();
        while (e10 < f10) {
            int i10 = e10 + 1;
            byte b11 = d10[e10];
            byte b12 = b11 & 255;
            if (this.f29568j != 512 || !l((byte) -1, (byte) b12) || (!this.f29570l && !h(b10, e10 - 1))) {
                int i11 = this.f29568j;
                byte b13 = b12 | i11;
                if (b13 == 329) {
                    this.f29568j = 768;
                } else if (b13 == 511) {
                    this.f29568j = 512;
                } else if (b13 == 836) {
                    this.f29568j = 1024;
                } else if (b13 == 1075) {
                    u();
                    b10.P(i10);
                    return;
                } else if (i11 != 256) {
                    this.f29568j = 256;
                }
                e10 = i10;
            } else {
                this.f29573o = (b11 & 8) >> 3;
                boolean z10 = true;
                if ((b11 & 1) != 0) {
                    z10 = false;
                }
                this.f29569k = z10;
                if (!this.f29570l) {
                    r();
                } else {
                    t();
                }
                b10.P(i10);
                return;
            }
        }
        b10.P(e10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        if ((i10 & 65526) == 65520) {
            return true;
        }
        return false;
    }

    private void n() {
        this.f29560b.p(0);
        if (!this.f29574p) {
            int i10 = 2;
            int h10 = this.f29560b.h(2) + 1;
            if (h10 != 2) {
                s.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
            } else {
                i10 = h10;
            }
            this.f29560b.r(5);
            byte[] b10 = C3843a.b(i10, this.f29572n, this.f29560b.h(3));
            C3843a.b f10 = C3843a.f(b10);
            C3717q0 E10 = new C3717q0.b().S(this.f29563e).e0("audio/mp4a-latm").I(f10.f46612c).H(f10.f46611b).f0(f10.f46610a).T(Collections.singletonList(b10)).V(this.f29562d).E();
            this.f29575q = 1024000000 / ((long) E10.f45784z);
            this.f29564f.c(E10);
            this.f29574p = true;
        } else {
            this.f29560b.r(10);
        }
        this.f29560b.r(4);
        int h11 = this.f29560b.h(13);
        int i11 = h11 - 7;
        if (this.f29569k) {
            i11 = h11 - 9;
        }
        v(this.f29564f, this.f29575q, 0, i11);
    }

    private void o() {
        this.f29565g.d(this.f29561c, 10);
        this.f29561c.P(6);
        v(this.f29565g, 0, 10, this.f29561c.C() + 10);
    }

    private void p(B b10) {
        int min = Math.min(b10.a(), this.f29576r - this.f29567i);
        this.f29578t.d(b10, min);
        int i10 = this.f29567i + min;
        this.f29567i = i10;
        int i11 = this.f29576r;
        if (i10 == i11) {
            long j10 = this.f29577s;
            if (j10 != -9223372036854775807L) {
                this.f29578t.f(j10, 1, i11, 0, (C3962B.a) null);
                this.f29577s += this.f29579u;
            }
            s();
        }
    }

    private void q() {
        this.f29570l = false;
        s();
    }

    private void r() {
        this.f29566h = 1;
        this.f29567i = 0;
    }

    private void s() {
        this.f29566h = 0;
        this.f29567i = 0;
        this.f29568j = 256;
    }

    private void t() {
        this.f29566h = 3;
        this.f29567i = 0;
    }

    private void u() {
        this.f29566h = 2;
        this.f29567i = f29558v.length;
        this.f29576r = 0;
        this.f29561c.P(0);
    }

    private void v(C3962B b10, long j10, int i10, int i11) {
        this.f29566h = 4;
        this.f29567i = i10;
        this.f29578t = b10;
        this.f29579u = j10;
        this.f29576r = i11;
    }

    private boolean w(B b10, byte[] bArr, int i10) {
        if (b10.a() < i10) {
            return false;
        }
        b10.j(bArr, 0, i10);
        return true;
    }

    public void a() {
        this.f29577s = -9223372036854775807L;
        q();
    }

    public void c(B b10) {
        int i10;
        b();
        while (b10.a() > 0) {
            int i11 = this.f29566h;
            if (i11 == 0) {
                j(b10);
            } else if (i11 == 1) {
                g(b10);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f29569k) {
                        i10 = 7;
                    } else {
                        i10 = 5;
                    }
                    if (i(b10, this.f29560b.f44946a, i10)) {
                        n();
                    }
                } else if (i11 == 4) {
                    p(b10);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(b10, this.f29561c.d(), 10)) {
                o();
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29577s = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29563e = dVar.b();
        C3962B d10 = mVar.d(dVar.c(), 1);
        this.f29564f = d10;
        this.f29578t = d10;
        if (this.f29559a) {
            dVar.a();
            C3962B d11 = mVar.d(dVar.c(), 5);
            this.f29565g = d11;
            d11.c(new C3717q0.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f29565g = new j();
    }

    public long k() {
        return this.f29575q;
    }

    public C2992i(boolean z10, String str) {
        this.f29560b = new A(new byte[7]);
        this.f29561c = new B(Arrays.copyOf(f29558v, 10));
        s();
        this.f29571m = -1;
        this.f29572n = -1;
        this.f29575q = -9223372036854775807L;
        this.f29577s = -9223372036854775807L;
        this.f29559a = z10;
        this.f29562d = str;
    }

    public void e() {
    }
}
