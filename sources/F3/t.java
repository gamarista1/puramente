package f3;

import f2.s;
import f3.K;
import i2.C2073A;
import i2.C2076a;
import z2.F;
import z2.O;
import z2.r;

public final class t implements C1997m {

    /* renamed from: a  reason: collision with root package name */
    private final C2073A f20734a;

    /* renamed from: b  reason: collision with root package name */
    private final F.a f20735b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20736c;

    /* renamed from: d  reason: collision with root package name */
    private final int f20737d;

    /* renamed from: e  reason: collision with root package name */
    private O f20738e;

    /* renamed from: f  reason: collision with root package name */
    private String f20739f;

    /* renamed from: g  reason: collision with root package name */
    private int f20740g;

    /* renamed from: h  reason: collision with root package name */
    private int f20741h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f20742i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f20743j;

    /* renamed from: k  reason: collision with root package name */
    private long f20744k;

    /* renamed from: l  reason: collision with root package name */
    private int f20745l;

    /* renamed from: m  reason: collision with root package name */
    private long f20746m;

    public t() {
        this((String) null, 0);
    }

    private void f(C2073A a10) {
        boolean z10;
        boolean z11;
        byte[] e10 = a10.e();
        int g10 = a10.g();
        for (int f10 = a10.f(); f10 < g10; f10++) {
            byte b10 = e10[f10];
            if ((b10 & 255) == 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f20743j || (b10 & 224) != 224) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f20743j = z10;
            if (z11) {
                a10.U(f10 + 1);
                this.f20743j = false;
                this.f20734a.e()[1] = e10[f10];
                this.f20741h = 2;
                this.f20740g = 1;
                return;
            }
        }
        a10.U(g10);
    }

    private void g(C2073A a10) {
        boolean z10;
        int min = Math.min(a10.a(), this.f20745l - this.f20741h);
        this.f20738e.f(a10, min);
        int i10 = this.f20741h + min;
        this.f20741h = i10;
        if (i10 >= this.f20745l) {
            if (this.f20746m != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            C2076a.g(z10);
            this.f20738e.d(this.f20746m, 1, this.f20745l, 0, (O.a) null);
            this.f20746m += this.f20744k;
            this.f20741h = 0;
            this.f20740g = 0;
        }
    }

    private void h(C2073A a10) {
        int min = Math.min(a10.a(), 4 - this.f20741h);
        a10.l(this.f20734a.e(), this.f20741h, min);
        int i10 = this.f20741h + min;
        this.f20741h = i10;
        if (i10 >= 4) {
            this.f20734a.U(0);
            if (!this.f20735b.a(this.f20734a.q())) {
                this.f20741h = 0;
                this.f20740g = 1;
                return;
            }
            F.a aVar = this.f20735b;
            this.f20745l = aVar.f29101c;
            if (!this.f20742i) {
                this.f20744k = (((long) aVar.f29105g) * 1000000) / ((long) aVar.f29102d);
                this.f20738e.c(new s.b().a0(this.f20739f).o0(this.f20735b.f29100b).f0(4096).N(this.f20735b.f29103e).p0(this.f20735b.f29102d).e0(this.f20736c).m0(this.f20737d).K());
                this.f20742i = true;
            }
            this.f20734a.U(0);
            this.f20738e.f(this.f20734a, 4);
            this.f20740g = 2;
        }
    }

    public void a() {
        this.f20740g = 0;
        this.f20741h = 0;
        this.f20743j = false;
        this.f20746m = -9223372036854775807L;
    }

    public void b(C2073A a10) {
        C2076a.i(this.f20738e);
        while (a10.a() > 0) {
            int i10 = this.f20740g;
            if (i10 == 0) {
                f(a10);
            } else if (i10 == 1) {
                h(a10);
            } else if (i10 == 2) {
                g(a10);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void d(long j10, int i10) {
        this.f20746m = j10;
    }

    public void e(r rVar, K.d dVar) {
        dVar.a();
        this.f20739f = dVar.b();
        this.f20738e = rVar.d(dVar.c(), 1);
    }

    public t(String str, int i10) {
        this.f20740g = 0;
        C2073A a10 = new C2073A(4);
        this.f20734a = a10;
        a10.e()[0] = -1;
        this.f20735b = new F.a();
        this.f20746m = -9223372036854775807L;
        this.f20736c = str;
        this.f20737d = i10;
    }

    public void c(boolean z10) {
    }
}
