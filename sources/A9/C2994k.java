package A9;

import A9.I;
import ja.B;
import ja.C3645a;
import k9.C3717q0;
import m9.C3840A;
import o9.m;
import q9.C3962B;

/* renamed from: A9.k  reason: case insensitive filesystem */
public final class C2994k implements m {

    /* renamed from: a  reason: collision with root package name */
    private final B f29582a = new B(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f29583b;

    /* renamed from: c  reason: collision with root package name */
    private String f29584c;

    /* renamed from: d  reason: collision with root package name */
    private C3962B f29585d;

    /* renamed from: e  reason: collision with root package name */
    private int f29586e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f29587f;

    /* renamed from: g  reason: collision with root package name */
    private int f29588g;

    /* renamed from: h  reason: collision with root package name */
    private long f29589h;

    /* renamed from: i  reason: collision with root package name */
    private C3717q0 f29590i;

    /* renamed from: j  reason: collision with root package name */
    private int f29591j;

    /* renamed from: k  reason: collision with root package name */
    private long f29592k = -9223372036854775807L;

    public C2994k(String str) {
        this.f29583b = str;
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f29587f);
        b10.j(bArr, this.f29587f, min);
        int i11 = this.f29587f + min;
        this.f29587f = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        byte[] d10 = this.f29582a.d();
        if (this.f29590i == null) {
            C3717q0 g10 = C3840A.g(d10, this.f29584c, this.f29583b, (m) null);
            this.f29590i = g10;
            this.f29585d.c(g10);
        }
        this.f29591j = C3840A.a(d10);
        this.f29589h = (long) ((int) ((((long) C3840A.f(d10)) * 1000000) / ((long) this.f29590i.f45784z)));
    }

    private boolean h(B b10) {
        while (b10.a() > 0) {
            int i10 = this.f29588g << 8;
            this.f29588g = i10;
            int D10 = i10 | b10.D();
            this.f29588g = D10;
            if (C3840A.d(D10)) {
                byte[] d10 = this.f29582a.d();
                int i11 = this.f29588g;
                d10[0] = (byte) ((i11 >> 24) & 255);
                d10[1] = (byte) ((i11 >> 16) & 255);
                d10[2] = (byte) ((i11 >> 8) & 255);
                d10[3] = (byte) (i11 & 255);
                this.f29587f = 4;
                this.f29588g = 0;
                return true;
            }
        }
        return false;
    }

    public void a() {
        this.f29586e = 0;
        this.f29587f = 0;
        this.f29588g = 0;
        this.f29592k = -9223372036854775807L;
    }

    public void c(B b10) {
        C3645a.h(this.f29585d);
        while (b10.a() > 0) {
            int i10 = this.f29586e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b10.a(), this.f29591j - this.f29587f);
                        this.f29585d.d(b10, min);
                        int i11 = this.f29587f + min;
                        this.f29587f = i11;
                        int i12 = this.f29591j;
                        if (i11 == i12) {
                            long j10 = this.f29592k;
                            if (j10 != -9223372036854775807L) {
                                this.f29585d.f(j10, 1, i12, 0, (C3962B.a) null);
                                this.f29592k += this.f29589h;
                            }
                            this.f29586e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (b(b10, this.f29582a.d(), 18)) {
                    g();
                    this.f29582a.P(0);
                    this.f29585d.d(this.f29582a, 18);
                    this.f29586e = 2;
                }
            } else if (h(b10)) {
                this.f29586e = 1;
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29592k = j10;
        }
    }

    public void f(q9.m mVar, I.d dVar) {
        dVar.a();
        this.f29584c = dVar.b();
        this.f29585d = mVar.d(dVar.c(), 1);
    }

    public void e() {
    }
}
