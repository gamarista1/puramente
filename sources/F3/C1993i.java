package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.L;
import i2.p;
import i2.z;
import java.util.Arrays;
import java.util.Collections;
import z2.C2957a;
import z2.C2969m;
import z2.O;
import z2.r;

/* renamed from: f3.i  reason: case insensitive filesystem */
public final class C1993i implements C1997m {

    /* renamed from: w  reason: collision with root package name */
    private static final byte[] f20534w = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f20535a;

    /* renamed from: b  reason: collision with root package name */
    private final z f20536b;

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f20537c;

    /* renamed from: d  reason: collision with root package name */
    private final String f20538d;

    /* renamed from: e  reason: collision with root package name */
    private final int f20539e;

    /* renamed from: f  reason: collision with root package name */
    private String f20540f;

    /* renamed from: g  reason: collision with root package name */
    private O f20541g;

    /* renamed from: h  reason: collision with root package name */
    private O f20542h;

    /* renamed from: i  reason: collision with root package name */
    private int f20543i;

    /* renamed from: j  reason: collision with root package name */
    private int f20544j;

    /* renamed from: k  reason: collision with root package name */
    private int f20545k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f20546l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f20547m;

    /* renamed from: n  reason: collision with root package name */
    private int f20548n;

    /* renamed from: o  reason: collision with root package name */
    private int f20549o;

    /* renamed from: p  reason: collision with root package name */
    private int f20550p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f20551q;

    /* renamed from: r  reason: collision with root package name */
    private long f20552r;

    /* renamed from: s  reason: collision with root package name */
    private int f20553s;

    /* renamed from: t  reason: collision with root package name */
    private long f20554t;

    /* renamed from: u  reason: collision with root package name */
    private O f20555u;

    /* renamed from: v  reason: collision with root package name */
    private long f20556v;

    public C1993i(boolean z10) {
        this(z10, (String) null, 0);
    }

    private void f() {
        C2076a.e(this.f20541g);
        L.h(this.f20555u);
        L.h(this.f20542h);
    }

    private void g(C2073A a10) {
        if (a10.a() != 0) {
            this.f20536b.f22164a[0] = a10.e()[a10.f()];
            this.f20536b.p(2);
            int h10 = this.f20536b.h(4);
            int i10 = this.f20549o;
            if (i10 == -1 || h10 == i10) {
                if (!this.f20547m) {
                    this.f20547m = true;
                    this.f20548n = this.f20550p;
                    this.f20549o = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    private boolean h(C2073A a10, int i10) {
        a10.U(i10 + 1);
        if (!w(a10, this.f20536b.f22164a, 1)) {
            return false;
        }
        this.f20536b.p(4);
        int h10 = this.f20536b.h(1);
        int i11 = this.f20548n;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f20549o != -1) {
            if (!w(a10, this.f20536b.f22164a, 1)) {
                return true;
            }
            this.f20536b.p(2);
            if (this.f20536b.h(4) != this.f20549o) {
                return false;
            }
            a10.U(i10 + 2);
        }
        if (!w(a10, this.f20536b.f22164a, 4)) {
            return true;
        }
        this.f20536b.p(14);
        int h11 = this.f20536b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] e10 = a10.e();
        int g10 = a10.g();
        int i12 = i10 + h11;
        if (i12 >= g10) {
            return true;
        }
        byte b10 = e10[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == g10) {
                return true;
            }
            if (!l((byte) -1, e10[i13]) || ((e10[i13] & 8) >> 3) != h10) {
                return false;
            }
            return true;
        } else if (b10 != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == g10) {
                return true;
            }
            if (e10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            if (i15 == g10 || e10[i15] == 51) {
                return true;
            }
            return false;
        }
    }

    private boolean i(C2073A a10, byte[] bArr, int i10) {
        int min = Math.min(a10.a(), i10 - this.f20544j);
        a10.l(bArr, this.f20544j, min);
        int i11 = this.f20544j + min;
        this.f20544j = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void j(C2073A a10) {
        byte[] e10 = a10.e();
        int f10 = a10.f();
        int g10 = a10.g();
        while (f10 < g10) {
            int i10 = f10 + 1;
            byte b10 = e10[f10];
            byte b11 = b10 & 255;
            if (this.f20545k != 512 || !l((byte) -1, (byte) b11) || (!this.f20547m && !h(a10, f10 - 1))) {
                int i11 = this.f20545k;
                byte b12 = b11 | i11;
                if (b12 == 329) {
                    this.f20545k = 768;
                } else if (b12 == 511) {
                    this.f20545k = 512;
                } else if (b12 == 836) {
                    this.f20545k = 1024;
                } else if (b12 == 1075) {
                    u();
                    a10.U(i10);
                    return;
                } else if (i11 != 256) {
                    this.f20545k = 256;
                }
                f10 = i10;
            } else {
                this.f20550p = (b10 & 8) >> 3;
                boolean z10 = true;
                if ((b10 & 1) != 0) {
                    z10 = false;
                }
                this.f20546l = z10;
                if (!this.f20547m) {
                    r();
                } else {
                    t();
                }
                a10.U(i10);
                return;
            }
        }
        a10.U(f10);
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
        this.f20536b.p(0);
        if (!this.f20551q) {
            int i10 = 2;
            int h10 = this.f20536b.h(2) + 1;
            if (h10 != 2) {
                p.h("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
            } else {
                i10 = h10;
            }
            this.f20536b.r(5);
            byte[] a10 = C2957a.a(i10, this.f20549o, this.f20536b.h(3));
            C2957a.b e10 = C2957a.e(a10);
            s K10 = new s.b().a0(this.f20540f).o0("audio/mp4a-latm").O(e10.f29159c).N(e10.f29158b).p0(e10.f29157a).b0(Collections.singletonList(a10)).e0(this.f20538d).m0(this.f20539e).K();
            this.f20552r = 1024000000 / ((long) K10.f20060C);
            this.f20541g.c(K10);
            this.f20551q = true;
        } else {
            this.f20536b.r(10);
        }
        this.f20536b.r(4);
        int h11 = this.f20536b.h(13);
        int i11 = h11 - 7;
        if (this.f20546l) {
            i11 = h11 - 9;
        }
        v(this.f20541g, this.f20552r, 0, i11);
    }

    private void o() {
        this.f20542h.f(this.f20537c, 10);
        this.f20537c.U(6);
        v(this.f20542h, 0, 10, this.f20537c.G() + 10);
    }

    private void p(C2073A a10) {
        boolean z10;
        int min = Math.min(a10.a(), this.f20553s - this.f20544j);
        this.f20555u.f(a10, min);
        int i10 = this.f20544j + min;
        this.f20544j = i10;
        if (i10 == this.f20553s) {
            if (this.f20554t != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            this.f20555u.d(this.f20554t, 1, this.f20553s, 0, (O.a) null);
            this.f20554t += this.f20556v;
            s();
        }
    }

    private void q() {
        this.f20547m = false;
        s();
    }

    private void r() {
        this.f20543i = 1;
        this.f20544j = 0;
    }

    private void s() {
        this.f20543i = 0;
        this.f20544j = 0;
        this.f20545k = 256;
    }

    private void t() {
        this.f20543i = 3;
        this.f20544j = 0;
    }

    private void u() {
        this.f20543i = 2;
        this.f20544j = f20534w.length;
        this.f20553s = 0;
        this.f20537c.U(0);
    }

    private void v(O o10, long j10, int i10, int i11) {
        this.f20543i = 4;
        this.f20544j = i10;
        this.f20555u = o10;
        this.f20556v = j10;
        this.f20553s = i11;
    }

    private boolean w(C2073A a10, byte[] bArr, int i10) {
        if (a10.a() < i10) {
            return false;
        }
        a10.l(bArr, 0, i10);
        return true;
    }

    public void a() {
        this.f20554t = -9223372036854775807L;
        q();
    }

    public void b(C2073A a10) {
        int i10;
        f();
        while (a10.a() > 0) {
            int i11 = this.f20543i;
            if (i11 == 0) {
                j(a10);
            } else if (i11 == 1) {
                g(a10);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f20546l) {
                        i10 = 7;
                    } else {
                        i10 = 5;
                    }
                    if (i(a10, this.f20536b.f22164a, i10)) {
                        n();
                    }
                } else if (i11 == 4) {
                    p(a10);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(a10, this.f20537c.e(), 10)) {
                o();
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20554t = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20540f = dVar.b();
        O d10 = rVar.d(dVar.c(), 1);
        this.f20541g = d10;
        this.f20555u = d10;
        if (this.f20535a) {
            dVar.a();
            O d11 = rVar.d(dVar.c(), 5);
            this.f20542h = d11;
            d11.c(new s.b().a0(dVar.b()).o0("application/id3").K());
            return;
        }
        this.f20542h = new C2969m();
    }

    public long k() {
        return this.f20552r;
    }

    public C1993i(boolean z10, String str, int i10) {
        this.f20536b = new z(new byte[7]);
        this.f20537c = new C2073A(Arrays.copyOf(f20534w, 10));
        s();
        this.f20548n = -1;
        this.f20549o = -1;
        this.f20552r = -9223372036854775807L;
        this.f20554t = -9223372036854775807L;
        this.f20535a = z10;
        this.f20538d = str;
        this.f20539e = i10;
    }

    public void c(boolean z10) {
    }
}
