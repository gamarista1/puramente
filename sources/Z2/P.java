package z2;

import i2.C2076a;
import z2.O;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f29127a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f29128b;

    /* renamed from: c  reason: collision with root package name */
    private int f29129c;

    /* renamed from: d  reason: collision with root package name */
    private long f29130d;

    /* renamed from: e  reason: collision with root package name */
    private int f29131e;

    /* renamed from: f  reason: collision with root package name */
    private int f29132f;

    /* renamed from: g  reason: collision with root package name */
    private int f29133g;

    public void a(O o10, O.a aVar) {
        if (this.f29129c > 0) {
            o10.d(this.f29130d, this.f29131e, this.f29132f, this.f29133g, aVar);
            this.f29129c = 0;
        }
    }

    public void b() {
        this.f29128b = false;
        this.f29129c = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        boolean z10;
        if (this.f29133g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.h(z10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f29128b) {
            int i13 = this.f29129c;
            int i14 = i13 + 1;
            this.f29129c = i14;
            if (i13 == 0) {
                this.f29130d = j10;
                this.f29131e = i10;
                this.f29132f = 0;
            }
            this.f29132f += i11;
            this.f29133g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(C2973q qVar) {
        if (!this.f29128b) {
            qVar.l(this.f29127a, 0, 10);
            qVar.e();
            if (C2958b.j(this.f29127a) != 0) {
                this.f29128b = true;
            }
        }
    }
}
