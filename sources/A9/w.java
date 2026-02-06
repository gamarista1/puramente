package A9;

import A9.I;
import ja.A;
import ja.B;
import ja.C3645a;
import ja.I;
import ja.s;
import q9.m;

public final class w implements I {

    /* renamed from: a  reason: collision with root package name */
    private final m f29770a;

    /* renamed from: b  reason: collision with root package name */
    private final A f29771b = new A(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f29772c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f29773d;

    /* renamed from: e  reason: collision with root package name */
    private I f29774e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f29775f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f29776g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f29777h;

    /* renamed from: i  reason: collision with root package name */
    private int f29778i;

    /* renamed from: j  reason: collision with root package name */
    private int f29779j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f29780k;

    /* renamed from: l  reason: collision with root package name */
    private long f29781l;

    public w(m mVar) {
        this.f29770a = mVar;
    }

    private boolean d(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f29773d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            b10.Q(min);
        } else {
            b10.j(bArr, this.f29773d, min);
        }
        int i11 = this.f29773d + min;
        this.f29773d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    private boolean e() {
        this.f29771b.p(0);
        int h10 = this.f29771b.h(24);
        if (h10 != 1) {
            s.i("PesReader", "Unexpected start code prefix: " + h10);
            this.f29779j = -1;
            return false;
        }
        this.f29771b.r(8);
        int h11 = this.f29771b.h(16);
        this.f29771b.r(5);
        this.f29780k = this.f29771b.g();
        this.f29771b.r(2);
        this.f29775f = this.f29771b.g();
        this.f29776g = this.f29771b.g();
        this.f29771b.r(6);
        int h12 = this.f29771b.h(8);
        this.f29778i = h12;
        if (h11 == 0) {
            this.f29779j = -1;
        } else {
            int i10 = (h11 - 3) - h12;
            this.f29779j = i10;
            if (i10 < 0) {
                s.i("PesReader", "Found negative packet payload size: " + this.f29779j);
                this.f29779j = -1;
            }
        }
        return true;
    }

    private void f() {
        this.f29771b.p(0);
        this.f29781l = -9223372036854775807L;
        if (this.f29775f) {
            this.f29771b.r(4);
            this.f29771b.r(1);
            this.f29771b.r(1);
            long h10 = (((long) this.f29771b.h(3)) << 30) | ((long) (this.f29771b.h(15) << 15)) | ((long) this.f29771b.h(15));
            this.f29771b.r(1);
            if (!this.f29777h && this.f29776g) {
                this.f29771b.r(4);
                this.f29771b.r(1);
                this.f29771b.r(1);
                this.f29771b.r(1);
                this.f29774e.b((((long) this.f29771b.h(3)) << 30) | ((long) (this.f29771b.h(15) << 15)) | ((long) this.f29771b.h(15)));
                this.f29777h = true;
            }
            this.f29781l = this.f29774e.b(h10);
        }
    }

    private void g(int i10) {
        this.f29772c = i10;
        this.f29773d = 0;
    }

    public final void a() {
        this.f29772c = 0;
        this.f29773d = 0;
        this.f29777h = false;
        this.f29770a.a();
    }

    public void b(I i10, m mVar, I.d dVar) {
        this.f29774e = i10;
        this.f29770a.f(mVar, dVar);
    }

    public final void c(B b10, int i10) {
        C3645a.h(this.f29774e);
        if ((i10 & 1) != 0) {
            int i11 = this.f29772c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    s.i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f29779j != -1) {
                        s.i("PesReader", "Unexpected start indicator: expected " + this.f29779j + " more bytes");
                    }
                    this.f29770a.e();
                } else {
                    throw new IllegalStateException();
                }
            }
            g(1);
        }
        while (b10.a() > 0) {
            int i12 = this.f29772c;
            if (i12 != 0) {
                int i13 = 0;
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (d(b10, this.f29771b.f44946a, Math.min(10, this.f29778i)) && d(b10, (byte[]) null, this.f29778i)) {
                            f();
                            if (this.f29780k) {
                                i13 = 4;
                            }
                            i10 |= i13;
                            this.f29770a.d(this.f29781l, i10);
                            g(3);
                        }
                    } else if (i12 == 3) {
                        int a10 = b10.a();
                        int i14 = this.f29779j;
                        if (i14 != -1) {
                            i13 = a10 - i14;
                        }
                        if (i13 > 0) {
                            a10 -= i13;
                            b10.O(b10.e() + a10);
                        }
                        this.f29770a.c(b10);
                        int i15 = this.f29779j;
                        if (i15 != -1) {
                            int i16 = i15 - a10;
                            this.f29779j = i16;
                            if (i16 == 0) {
                                this.f29770a.e();
                                g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (d(b10, this.f29771b.f44946a, 9)) {
                    if (e()) {
                        i13 = 2;
                    }
                    g(i13);
                }
            } else {
                b10.Q(b10.a());
            }
        }
    }
}
