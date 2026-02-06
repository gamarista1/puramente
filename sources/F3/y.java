package f3;

import f3.K;
import i2.C2073A;
import i2.C2076a;
import i2.G;
import i2.p;
import i2.z;
import z2.r;

public final class y implements K {

    /* renamed from: a  reason: collision with root package name */
    private final C1997m f20783a;

    /* renamed from: b  reason: collision with root package name */
    private final z f20784b = new z(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f20785c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f20786d;

    /* renamed from: e  reason: collision with root package name */
    private G f20787e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20788f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20789g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20790h;

    /* renamed from: i  reason: collision with root package name */
    private int f20791i;

    /* renamed from: j  reason: collision with root package name */
    private int f20792j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f20793k;

    /* renamed from: l  reason: collision with root package name */
    private long f20794l;

    public y(C1997m mVar) {
        this.f20783a = mVar;
    }

    private boolean e(C2073A a10, byte[] bArr, int i10) {
        int min = Math.min(a10.a(), i10 - this.f20786d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a10.V(min);
        } else {
            a10.l(bArr, this.f20786d, min);
        }
        int i11 = this.f20786d + min;
        this.f20786d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean f() {
        this.f20784b.p(0);
        int h10 = this.f20784b.h(24);
        if (h10 != 1) {
            p.h("PesReader", "Unexpected start code prefix: " + h10);
            this.f20792j = -1;
            return false;
        }
        this.f20784b.r(8);
        int h11 = this.f20784b.h(16);
        this.f20784b.r(5);
        this.f20793k = this.f20784b.g();
        this.f20784b.r(2);
        this.f20788f = this.f20784b.g();
        this.f20789g = this.f20784b.g();
        this.f20784b.r(6);
        int h12 = this.f20784b.h(8);
        this.f20791i = h12;
        if (h11 == 0) {
            this.f20792j = -1;
        } else {
            int i10 = (h11 - 3) - h12;
            this.f20792j = i10;
            if (i10 < 0) {
                p.h("PesReader", "Found negative packet payload size: " + this.f20792j);
                this.f20792j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f20784b.p(0);
        this.f20794l = -9223372036854775807L;
        if (this.f20788f) {
            this.f20784b.r(4);
            this.f20784b.r(1);
            this.f20784b.r(1);
            long h10 = (((long) this.f20784b.h(3)) << 30) | ((long) (this.f20784b.h(15) << 15)) | ((long) this.f20784b.h(15));
            this.f20784b.r(1);
            if (!this.f20790h && this.f20789g) {
                this.f20784b.r(4);
                this.f20784b.r(1);
                this.f20784b.r(1);
                this.f20784b.r(1);
                this.f20787e.b((((long) this.f20784b.h(3)) << 30) | ((long) (this.f20784b.h(15) << 15)) | ((long) this.f20784b.h(15)));
                this.f20790h = true;
            }
            this.f20794l = this.f20787e.b(h10);
        }
    }

    private void h(int i10) {
        this.f20785c = i10;
        this.f20786d = 0;
    }

    public void a() {
        this.f20785c = 0;
        this.f20786d = 0;
        this.f20790h = false;
        this.f20783a.a();
    }

    public void b(C2073A a10, int i10) {
        int i11;
        int i12;
        int i13;
        boolean z10;
        C2076a.i(this.f20787e);
        if ((i10 & 1) != 0) {
            int i14 = this.f20785c;
            if (!(i14 == 0 || i14 == 1)) {
                if (i14 == 2) {
                    p.h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i14 == 3) {
                    if (this.f20792j != -1) {
                        p.h("PesReader", "Unexpected start indicator: expected " + this.f20792j + " more bytes");
                    }
                    if (a10.g() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f20783a.c(z10);
                } else {
                    throw new IllegalStateException();
                }
            }
            h(1);
        }
        while (a10.a() > 0) {
            int i15 = this.f20785c;
            if (i15 == 0) {
                a10.V(a10.a());
            } else if (i15 != 1) {
                if (i15 == 2) {
                    if (e(a10, this.f20784b.f22164a, Math.min(10, this.f20791i)) && e(a10, (byte[]) null, this.f20791i)) {
                        g();
                        if (this.f20793k) {
                            i12 = 4;
                        } else {
                            i12 = 0;
                        }
                        i10 |= i12;
                        this.f20783a.d(this.f20794l, i10);
                        h(3);
                    }
                } else if (i15 == 3) {
                    int a11 = a10.a();
                    int i16 = this.f20792j;
                    if (i16 == -1) {
                        i13 = 0;
                    } else {
                        i13 = a11 - i16;
                    }
                    if (i13 > 0) {
                        a11 -= i13;
                        a10.T(a10.f() + a11);
                    }
                    this.f20783a.b(a10);
                    int i17 = this.f20792j;
                    if (i17 != -1) {
                        int i18 = i17 - a11;
                        this.f20792j = i18;
                        if (i18 == 0) {
                            this.f20783a.c(false);
                            h(1);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (e(a10, this.f20784b.f22164a, 9)) {
                if (f()) {
                    i11 = 2;
                } else {
                    i11 = 0;
                }
                h(i11);
            }
        }
    }

    public void c(G g10, r rVar, K.d dVar) {
        this.f20787e = g10;
        this.f20783a.e(rVar, dVar);
    }

    public boolean d(boolean z10) {
        if (this.f20785c == 3 && this.f20792j == -1 && (!z10 || !(this.f20783a instanceof n))) {
            return true;
        }
        return false;
    }
}
