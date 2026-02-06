package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.M;
import k9.C3717q0;
import m9.C3844b;
import q9.C3962B;
import q9.m;

/* renamed from: A9.c  reason: case insensitive filesystem */
public final class C2986c implements m {

    /* renamed from: a  reason: collision with root package name */
    private final A f29516a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29517b;

    /* renamed from: c  reason: collision with root package name */
    private final String f29518c;

    /* renamed from: d  reason: collision with root package name */
    private String f29519d;

    /* renamed from: e  reason: collision with root package name */
    private C3962B f29520e;

    /* renamed from: f  reason: collision with root package name */
    private int f29521f;

    /* renamed from: g  reason: collision with root package name */
    private int f29522g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29523h;

    /* renamed from: i  reason: collision with root package name */
    private long f29524i;

    /* renamed from: j  reason: collision with root package name */
    private C3717q0 f29525j;

    /* renamed from: k  reason: collision with root package name */
    private int f29526k;

    /* renamed from: l  reason: collision with root package name */
    private long f29527l;

    public C2986c() {
        this((String) null);
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f29522g);
        b10.j(bArr, this.f29522g, min);
        int i11 = this.f29522g + min;
        this.f29522g = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private void g() {
        this.f29516a.p(0);
        C3844b.C0698b e10 = C3844b.e(this.f29516a);
        C3717q0 q0Var = this.f29525j;
        if (q0Var == null || e10.f46622d != q0Var.f45783y || e10.f46621c != q0Var.f45784z || !M.c(e10.f46619a, q0Var.f45770l)) {
            C3717q0 E10 = new C3717q0.b().S(this.f29519d).e0(e10.f46619a).H(e10.f46622d).f0(e10.f46621c).V(this.f29518c).E();
            this.f29525j = E10;
            this.f29520e.c(E10);
        }
        this.f29526k = e10.f46623e;
        this.f29524i = (((long) e10.f46624f) * 1000000) / ((long) this.f29525j.f45784z);
    }

    private boolean h(B b10) {
        while (true) {
            boolean z10 = false;
            if (b10.a() <= 0) {
                return false;
            }
            if (!this.f29523h) {
                if (b10.D() == 11) {
                    z10 = true;
                }
                this.f29523h = z10;
            } else {
                int D10 = b10.D();
                if (D10 == 119) {
                    this.f29523h = false;
                    return true;
                }
                if (D10 == 11) {
                    z10 = true;
                }
                this.f29523h = z10;
            }
        }
    }

    public void a() {
        this.f29521f = 0;
        this.f29522g = 0;
        this.f29523h = false;
        this.f29527l = -9223372036854775807L;
    }

    public void c(B b10) {
        C3645a.h(this.f29520e);
        while (b10.a() > 0) {
            int i10 = this.f29521f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b10.a(), this.f29526k - this.f29522g);
                        this.f29520e.d(b10, min);
                        int i11 = this.f29522g + min;
                        this.f29522g = i11;
                        int i12 = this.f29526k;
                        if (i11 == i12) {
                            long j10 = this.f29527l;
                            if (j10 != -9223372036854775807L) {
                                this.f29520e.f(j10, 1, i12, 0, (C3962B.a) null);
                                this.f29527l += this.f29524i;
                            }
                            this.f29521f = 0;
                        }
                    }
                } else if (b(b10, this.f29517b.d(), 128)) {
                    g();
                    this.f29517b.P(0);
                    this.f29520e.d(this.f29517b, 128);
                    this.f29521f = 2;
                }
            } else if (h(b10)) {
                this.f29521f = 1;
                this.f29517b.d()[0] = 11;
                this.f29517b.d()[1] = 119;
                this.f29522g = 2;
            }
        }
    }

    public void d(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f29527l = j10;
        }
    }

    public void f(m mVar, I.d dVar) {
        dVar.a();
        this.f29519d = dVar.b();
        this.f29520e = mVar.d(dVar.c(), 1);
    }

    public C2986c(String str) {
        A a10 = new A(new byte[128]);
        this.f29516a = a10;
        this.f29517b = new B(a10.f44946a);
        this.f29521f = 0;
        this.f29527l = -9223372036854775807L;
        this.f29518c = str;
    }

    public void e() {
    }
}
