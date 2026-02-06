package y9;

import ja.B;
import q9.l;

final class q {

    /* renamed from: a  reason: collision with root package name */
    public C4229c f50040a;

    /* renamed from: b  reason: collision with root package name */
    public long f50041b;

    /* renamed from: c  reason: collision with root package name */
    public long f50042c;

    /* renamed from: d  reason: collision with root package name */
    public long f50043d;

    /* renamed from: e  reason: collision with root package name */
    public int f50044e;

    /* renamed from: f  reason: collision with root package name */
    public int f50045f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f50046g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f50047h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f50048i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f50049j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f50050k = new boolean[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean f50051l;

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f50052m = new boolean[0];

    /* renamed from: n  reason: collision with root package name */
    public p f50053n;

    /* renamed from: o  reason: collision with root package name */
    public final B f50054o = new B();

    /* renamed from: p  reason: collision with root package name */
    public boolean f50055p;

    /* renamed from: q  reason: collision with root package name */
    public long f50056q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f50057r;

    public void a(B b10) {
        b10.j(this.f50054o.d(), 0, this.f50054o.f());
        this.f50054o.P(0);
        this.f50055p = false;
    }

    public void b(l lVar) {
        lVar.readFully(this.f50054o.d(), 0, this.f50054o.f());
        this.f50054o.P(0);
        this.f50055p = false;
    }

    public long c(int i10) {
        return this.f50049j[i10];
    }

    public void d(int i10) {
        this.f50054o.L(i10);
        this.f50051l = true;
        this.f50055p = true;
    }

    public void e(int i10, int i11) {
        this.f50044e = i10;
        this.f50045f = i11;
        if (this.f50047h.length < i10) {
            this.f50046g = new long[i10];
            this.f50047h = new int[i10];
        }
        if (this.f50048i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f50048i = new int[i12];
            this.f50049j = new long[i12];
            this.f50050k = new boolean[i12];
            this.f50052m = new boolean[i12];
        }
    }

    public void f() {
        this.f50044e = 0;
        this.f50056q = 0;
        this.f50057r = false;
        this.f50051l = false;
        this.f50055p = false;
        this.f50053n = null;
    }

    public boolean g(int i10) {
        if (!this.f50051l || !this.f50052m[i10]) {
            return false;
        }
        return true;
    }
}
