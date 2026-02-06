package q9;

import ja.C3645a;
import m9.C3844b;
import q9.C3962B;

/* renamed from: q9.C  reason: case insensitive filesystem */
public final class C3963C {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47795a = new byte[10];

    /* renamed from: b  reason: collision with root package name */
    private boolean f47796b;

    /* renamed from: c  reason: collision with root package name */
    private int f47797c;

    /* renamed from: d  reason: collision with root package name */
    private long f47798d;

    /* renamed from: e  reason: collision with root package name */
    private int f47799e;

    /* renamed from: f  reason: collision with root package name */
    private int f47800f;

    /* renamed from: g  reason: collision with root package name */
    private int f47801g;

    public void a(C3962B b10, C3962B.a aVar) {
        if (this.f47797c > 0) {
            b10.f(this.f47798d, this.f47799e, this.f47800f, this.f47801g, aVar);
            this.f47797c = 0;
        }
    }

    public void b() {
        this.f47796b = false;
        this.f47797c = 0;
    }

    public void c(C3962B b10, long j10, int i10, int i11, int i12, C3962B.a aVar) {
        boolean z10;
        if (this.f47801g <= i11 + i12) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3645a.g(z10, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f47796b) {
            int i13 = this.f47797c;
            int i14 = i13 + 1;
            this.f47797c = i14;
            if (i13 == 0) {
                this.f47798d = j10;
                this.f47799e = i10;
                this.f47800f = 0;
            }
            this.f47800f += i11;
            this.f47801g = i12;
            if (i14 >= 16) {
                a(b10, aVar);
            }
        }
    }

    public void d(l lVar) {
        if (!this.f47796b) {
            lVar.l(this.f47795a, 0, 10);
            lVar.e();
            if (C3844b.i(this.f47795a) != 0) {
                this.f47796b = true;
            }
        }
    }
}
