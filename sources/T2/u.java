package T2;

import i2.C2073A;
import z2.C2973q;

final class u {

    /* renamed from: a  reason: collision with root package name */
    public d f6143a;

    /* renamed from: b  reason: collision with root package name */
    public long f6144b;

    /* renamed from: c  reason: collision with root package name */
    public long f6145c;

    /* renamed from: d  reason: collision with root package name */
    public long f6146d;

    /* renamed from: e  reason: collision with root package name */
    public int f6147e;

    /* renamed from: f  reason: collision with root package name */
    public int f6148f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f6149g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f6150h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f6151i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f6152j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f6153k = new boolean[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean f6154l;

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f6155m = new boolean[0];

    /* renamed from: n  reason: collision with root package name */
    public t f6156n;

    /* renamed from: o  reason: collision with root package name */
    public final C2073A f6157o = new C2073A();

    /* renamed from: p  reason: collision with root package name */
    public boolean f6158p;

    /* renamed from: q  reason: collision with root package name */
    public long f6159q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6160r;

    public void a(C2073A a10) {
        a10.l(this.f6157o.e(), 0, this.f6157o.g());
        this.f6157o.U(0);
        this.f6158p = false;
    }

    public void b(C2973q qVar) {
        qVar.readFully(this.f6157o.e(), 0, this.f6157o.g());
        this.f6157o.U(0);
        this.f6158p = false;
    }

    public long c(int i10) {
        return this.f6152j[i10];
    }

    public void d(int i10) {
        this.f6157o.Q(i10);
        this.f6154l = true;
        this.f6158p = true;
    }

    public void e(int i10, int i11) {
        this.f6147e = i10;
        this.f6148f = i11;
        if (this.f6150h.length < i10) {
            this.f6149g = new long[i10];
            this.f6150h = new int[i10];
        }
        if (this.f6151i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f6151i = new int[i12];
            this.f6152j = new long[i12];
            this.f6153k = new boolean[i12];
            this.f6155m = new boolean[i12];
        }
    }

    public void f() {
        this.f6147e = 0;
        this.f6159q = 0;
        this.f6160r = false;
        this.f6154l = false;
        this.f6158p = false;
        this.f6156n = null;
    }

    public boolean g(int i10) {
        if (!this.f6154l || !this.f6155m[i10]) {
            return false;
        }
        return true;
    }
}
