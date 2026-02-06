package F2;

import F2.e;
import f2.s;
import i2.C2073A;
import j2.d;
import z2.C2960d;
import z2.O;

final class f extends e {

    /* renamed from: b  reason: collision with root package name */
    private final C2073A f2154b = new C2073A(d.f22705a);

    /* renamed from: c  reason: collision with root package name */
    private final C2073A f2155c = new C2073A(4);

    /* renamed from: d  reason: collision with root package name */
    private int f2156d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2157e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2158f;

    /* renamed from: g  reason: collision with root package name */
    private int f2159g;

    public f(O o10) {
        super(o10);
    }

    /* access modifiers changed from: protected */
    public boolean b(C2073A a10) {
        int H10 = a10.H();
        int i10 = (H10 >> 4) & 15;
        int i11 = H10 & 15;
        if (i11 == 7) {
            this.f2159g = i10;
            if (i10 != 5) {
                return true;
            }
            return false;
        }
        throw new e.a("Video format not supported: " + i11);
    }

    /* access modifiers changed from: protected */
    public boolean c(C2073A a10, long j10) {
        int i10;
        int H10 = a10.H();
        long r10 = j10 + (((long) a10.r()) * 1000);
        if (H10 == 0 && !this.f2157e) {
            C2073A a11 = new C2073A(new byte[a10.a()]);
            a10.l(a11.e(), 0, a10.a());
            C2960d b10 = C2960d.b(a11);
            this.f2156d = b10.f29180b;
            this.f2153a.c(new s.b().o0("video/avc").O(b10.f29190l).t0(b10.f29181c).Y(b10.f29182d).k0(b10.f29189k).b0(b10.f29179a).K());
            this.f2157e = true;
            return false;
        } else if (H10 != 1 || !this.f2157e) {
            return false;
        } else {
            if (this.f2159g == 1) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (!this.f2158f && i10 == 0) {
                return false;
            }
            byte[] e10 = this.f2155c.e();
            e10[0] = 0;
            e10[1] = 0;
            e10[2] = 0;
            int i11 = 4 - this.f2156d;
            int i12 = 0;
            while (a10.a() > 0) {
                a10.l(this.f2155c.e(), i11, this.f2156d);
                this.f2155c.U(0);
                int L10 = this.f2155c.L();
                this.f2154b.U(0);
                this.f2153a.f(this.f2154b, 4);
                this.f2153a.f(a10, L10);
                i12 = i12 + 4 + L10;
            }
            this.f2153a.d(r10, i10, i12, 0, (O.a) null);
            this.f2158f = true;
            return true;
        }
    }
}
