package f3;

import f3.K;
import i2.C2073A;
import i2.G;
import i2.L;
import z2.r;

public final class E implements K {

    /* renamed from: a  reason: collision with root package name */
    private final D f20421a;

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f20422b = new C2073A(32);

    /* renamed from: c  reason: collision with root package name */
    private int f20423c;

    /* renamed from: d  reason: collision with root package name */
    private int f20424d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f20425e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20426f;

    public E(D d10) {
        this.f20421a = d10;
    }

    public void a() {
        this.f20426f = true;
    }

    public void b(C2073A a10, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = a10.f() + a10.H();
        } else {
            i11 = -1;
        }
        if (this.f20426f) {
            if (z10) {
                this.f20426f = false;
                a10.U(i11);
                this.f20424d = 0;
            } else {
                return;
            }
        }
        while (a10.a() > 0) {
            int i12 = this.f20424d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int H10 = a10.H();
                    a10.U(a10.f() - 1);
                    if (H10 == 255) {
                        this.f20426f = true;
                        return;
                    }
                }
                int min = Math.min(a10.a(), 3 - this.f20424d);
                a10.l(this.f20422b.e(), this.f20424d, min);
                int i13 = this.f20424d + min;
                this.f20424d = i13;
                if (i13 == 3) {
                    this.f20422b.U(0);
                    this.f20422b.T(3);
                    this.f20422b.V(1);
                    int H11 = this.f20422b.H();
                    int H12 = this.f20422b.H();
                    if ((H11 & 128) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f20425e = z11;
                    this.f20423c = (((H11 & 15) << 8) | H12) + 3;
                    int b10 = this.f20422b.b();
                    int i14 = this.f20423c;
                    if (b10 < i14) {
                        this.f20422b.c(Math.min(4098, Math.max(i14, this.f20422b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a10.a(), this.f20423c - this.f20424d);
                a10.l(this.f20422b.e(), this.f20424d, min2);
                int i15 = this.f20424d + min2;
                this.f20424d = i15;
                int i16 = this.f20423c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f20425e) {
                        this.f20422b.T(i16);
                    } else if (L.w(this.f20422b.e(), 0, this.f20423c, -1) != 0) {
                        this.f20426f = true;
                        return;
                    } else {
                        this.f20422b.T(this.f20423c - 4);
                    }
                    this.f20422b.U(0);
                    this.f20421a.b(this.f20422b);
                    this.f20424d = 0;
                }
            }
        }
    }

    public void c(G g10, r rVar, K.d dVar) {
        this.f20421a.c(g10, rVar, dVar);
        this.f20426f = true;
    }
}
