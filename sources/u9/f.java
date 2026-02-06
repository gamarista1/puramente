package u9;

import ja.B;
import ja.x;
import k9.C3717q0;
import ka.a;
import q9.C3962B;
import u9.e;

final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final B f48693b = new B(x.f45063a);

    /* renamed from: c  reason: collision with root package name */
    private final B f48694c = new B(4);

    /* renamed from: d  reason: collision with root package name */
    private int f48695d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48696e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f48697f;

    /* renamed from: g  reason: collision with root package name */
    private int f48698g;

    public f(C3962B b10) {
        super(b10);
    }

    /* access modifiers changed from: protected */
    public boolean b(B b10) {
        int D10 = b10.D();
        int i10 = (D10 >> 4) & 15;
        int i11 = D10 & 15;
        if (i11 == 7) {
            this.f48698g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public boolean c(B b10, long j10) {
        int i10;
        int D10 = b10.D();
        long o10 = j10 + (((long) b10.o()) * 1000);
        if (D10 == 0 && !this.f48696e) {
            B b11 = new B(new byte[b10.a()]);
            b10.j(b11.d(), 0, b10.a());
            a b12 = a.b(b11);
            this.f48695d = b12.f45951b;
            this.f48692a.c(new C3717q0.b().e0("video/avc").I(b12.f45955f).j0(b12.f45952c).Q(b12.f45953d).a0(b12.f45954e).T(b12.f45950a).E());
            this.f48696e = true;
            return false;
        } else if (D10 != 1 || !this.f48696e) {
            return false;
        } else {
            if (this.f48698g == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f48697f && i10 == 0) {
                return false;
            }
            byte[] d10 = this.f48694c.d();
            d10[0] = 0;
            d10[1] = 0;
            d10[2] = 0;
            int i11 = 4 - this.f48695d;
            int i12 = 0;
            while (b10.a() > 0) {
                b10.j(this.f48694c.d(), i11, this.f48695d);
                this.f48694c.P(0);
                int H10 = this.f48694c.H();
                this.f48693b.P(0);
                this.f48692a.d(this.f48693b, 4);
                this.f48692a.d(b10, H10);
                i12 = i12 + 4 + H10;
            }
            this.f48692a.f(o10, i10, i12, 0, (C3962B.a) null);
            this.f48697f = true;
            return true;
        }
    }
}
