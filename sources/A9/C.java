package A9;

import A9.I;
import ja.B;
import ja.I;
import ja.M;
import q9.m;

public final class C implements I {

    /* renamed from: a  reason: collision with root package name */
    private final B f29450a;

    /* renamed from: b  reason: collision with root package name */
    private final B f29451b = new B(32);

    /* renamed from: c  reason: collision with root package name */
    private int f29452c;

    /* renamed from: d  reason: collision with root package name */
    private int f29453d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29454e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29455f;

    public C(B b10) {
        this.f29450a = b10;
    }

    public void a() {
        this.f29455f = true;
    }

    public void b(I i10, m mVar, I.d dVar) {
        this.f29450a.b(i10, mVar, dVar);
        this.f29455f = true;
    }

    public void c(B b10, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = b10.e() + b10.D();
        } else {
            i11 = -1;
        }
        if (this.f29455f) {
            if (z10) {
                this.f29455f = false;
                b10.P(i11);
                this.f29453d = 0;
            } else {
                return;
            }
        }
        while (b10.a() > 0) {
            int i12 = this.f29453d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int D10 = b10.D();
                    b10.P(b10.e() - 1);
                    if (D10 == 255) {
                        this.f29455f = true;
                        return;
                    }
                }
                int min = Math.min(b10.a(), 3 - this.f29453d);
                b10.j(this.f29451b.d(), this.f29453d, min);
                int i13 = this.f29453d + min;
                this.f29453d = i13;
                if (i13 == 3) {
                    this.f29451b.P(0);
                    this.f29451b.O(3);
                    this.f29451b.Q(1);
                    int D11 = this.f29451b.D();
                    int D12 = this.f29451b.D();
                    if ((D11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f29454e = z11;
                    this.f29452c = (((D11 & 15) << 8) | D12) + 3;
                    int b11 = this.f29451b.b();
                    int i14 = this.f29452c;
                    if (b11 < i14) {
                        this.f29451b.c(Math.min(4098, Math.max(i14, this.f29451b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(b10.a(), this.f29452c - this.f29453d);
                b10.j(this.f29451b.d(), this.f29453d, min2);
                int i15 = this.f29453d + min2;
                this.f29453d = i15;
                int i16 = this.f29452c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f29454e) {
                        this.f29451b.O(i16);
                    } else if (M.t(this.f29451b.d(), 0, this.f29452c, -1) != 0) {
                        this.f29455f = true;
                        return;
                    } else {
                        this.f29451b.O(this.f29452c - 4);
                    }
                    this.f29451b.P(0);
                    this.f29450a.c(this.f29451b);
                    this.f29453d = 0;
                }
            }
        }
    }
}
