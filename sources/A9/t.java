package A9;

import A9.I;
import ja.B;
import ja.C3645a;
import k9.C3717q0;
import m9.D;
import q9.C3962B;
import q9.m;

public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final B f29750a;

    /* renamed from: b  reason: collision with root package name */
    private final D.a f29751b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29752c;

    /* renamed from: d  reason: collision with root package name */
    private C3962B f29753d;

    /* renamed from: e  reason: collision with root package name */
    private String f29754e;

    /* renamed from: f  reason: collision with root package name */
    private int f29755f;

    /* renamed from: g  reason: collision with root package name */
    private int f29756g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29757h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f29758i;

    /* renamed from: j  reason: collision with root package name */
    private long f29759j;

    /* renamed from: k  reason: collision with root package name */
    private int f29760k;

    /* renamed from: l  reason: collision with root package name */
    private long f29761l;

    public t() {
        this((String) null);
    }

    private void b(B b10) {
        boolean z10;
        boolean z11;
        byte[] d10 = b10.d();
        int f10 = b10.f();
        for (int e10 = b10.e(); e10 < f10; e10++) {
            byte b11 = d10[e10];
            if ((b11 & 255) == 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!this.f29758i || (b11 & 224) != 224) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f29758i = z10;
            if (z11) {
                b10.P(e10 + 1);
                this.f29758i = false;
                this.f29750a.d()[1] = d10[e10];
                this.f29756g = 2;
                this.f29755f = 1;
                return;
            }
        }
        b10.P(f10);
    }

    private void g(B b10) {
        int min = Math.min(b10.a(), this.f29760k - this.f29756g);
        this.f29753d.d(b10, min);
        int i10 = this.f29756g + min;
        this.f29756g = i10;
        int i11 = this.f29760k;
        if (i10 >= i11) {
            long j10 = this.f29761l;
            if (j10 != -9223372036854775807L) {
                this.f29753d.f(j10, 1, i11, 0, (C3962B.a) null);
                this.f29761l += this.f29759j;
            }
            this.f29756g = 0;
            this.f29755f = 0;
        }
    }

    private void h(B b10) {
        int min = Math.min(b10.a(), 4 - this.f29756g);
        b10.j(this.f29750a.d(), this.f29756g, min);
        int i10 = this.f29756g + min;
        this.f29756g = i10;
        if (i10 >= 4) {
            this.f29750a.P(0);
            if (!this.f29751b.a(this.f29750a.n())) {
                this.f29756g = 0;
                this.f29755f = 1;
                return;
            }
            D.a aVar = this.f29751b;
            this.f29760k = aVar.f46547c;
            if (!this.f29757h) {
                this.f29759j = (((long) aVar.f46551g) * 1000000) / ((long) aVar.f46548d);
                this.f29753d.c(new C3717q0.b().S(this.f29754e).e0(this.f29751b.f46546b).W(4096).H(this.f29751b.f46549e).f0(this.f29751b.f46548d).V(this.f29752c).E());
                this.f29757h = true;
            }
            this.f29750a.P(0);
            this.f29753d.d(this.f29750a, 4);
            this.f29755f = 2;
        }
    }

    public void a() {
        this.f29755f = 0;
        this.f29756g = 0;
        this.f29758i = false;
        this.f29761l = -9223372036854775807L;
    }

    public void c(B b10) {
        C3645a.h(this.f29753d);
        while (b10.a() > 0) {
            int i10 = this.f29755f;
            if (i10 == 0) {
                b(b10);
            } else if (i10 == 1) {
                h(b10);
            } else if (i10 == 2) {
                g(b10);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29761l = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29754e = dVar.b();
        this.f29753d = mVar.d(dVar.c(), 1);
    }

    public t(String str) {
        this.f29755f = 0;
        B b10 = new B(4);
        this.f29750a = b10;
        b10.d()[0] = -1;
        this.f29751b = new D.a();
        this.f29761l = -9223372036854775807L;
        this.f29752c = str;
    }

    public void e() {
    }
}
