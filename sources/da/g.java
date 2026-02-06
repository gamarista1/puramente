package da;

import android.text.Layout;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f43225a;

    /* renamed from: b  reason: collision with root package name */
    private int f43226b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f43227c;

    /* renamed from: d  reason: collision with root package name */
    private int f43228d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f43229e;

    /* renamed from: f  reason: collision with root package name */
    private int f43230f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f43231g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f43232h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f43233i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f43234j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f43235k;

    /* renamed from: l  reason: collision with root package name */
    private String f43236l;

    /* renamed from: m  reason: collision with root package name */
    private int f43237m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f43238n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f43239o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f43240p;

    /* renamed from: q  reason: collision with root package name */
    private int f43241q = -1;

    /* renamed from: r  reason: collision with root package name */
    private b f43242r;

    /* renamed from: s  reason: collision with root package name */
    private float f43243s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f43227c && gVar.f43227c) {
                w(gVar.f43226b);
            }
            if (this.f43232h == -1) {
                this.f43232h = gVar.f43232h;
            }
            if (this.f43233i == -1) {
                this.f43233i = gVar.f43233i;
            }
            if (this.f43225a == null && (str = gVar.f43225a) != null) {
                this.f43225a = str;
            }
            if (this.f43230f == -1) {
                this.f43230f = gVar.f43230f;
            }
            if (this.f43231g == -1) {
                this.f43231g = gVar.f43231g;
            }
            if (this.f43238n == -1) {
                this.f43238n = gVar.f43238n;
            }
            if (this.f43239o == null && (alignment2 = gVar.f43239o) != null) {
                this.f43239o = alignment2;
            }
            if (this.f43240p == null && (alignment = gVar.f43240p) != null) {
                this.f43240p = alignment;
            }
            if (this.f43241q == -1) {
                this.f43241q = gVar.f43241q;
            }
            if (this.f43234j == -1) {
                this.f43234j = gVar.f43234j;
                this.f43235k = gVar.f43235k;
            }
            if (this.f43242r == null) {
                this.f43242r = gVar.f43242r;
            }
            if (this.f43243s == Float.MAX_VALUE) {
                this.f43243s = gVar.f43243s;
            }
            if (z10 && !this.f43229e && gVar.f43229e) {
                u(gVar.f43228d);
            }
            if (z10 && this.f43237m == -1 && (i10 = gVar.f43237m) != -1) {
                this.f43237m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f43236l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f43233i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f43230f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f43240p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f43238n = i10;
        return this;
    }

    public g F(int i10) {
        this.f43237m = i10;
        return this;
    }

    public g G(float f10) {
        this.f43243s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f43239o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f43241q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f43242r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f43231g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f43229e) {
            return this.f43228d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f43227c) {
            return this.f43226b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f43225a;
    }

    public float e() {
        return this.f43235k;
    }

    public int f() {
        return this.f43234j;
    }

    public String g() {
        return this.f43236l;
    }

    public Layout.Alignment h() {
        return this.f43240p;
    }

    public int i() {
        return this.f43238n;
    }

    public int j() {
        return this.f43237m;
    }

    public float k() {
        return this.f43243s;
    }

    public int l() {
        int i10;
        int i11 = this.f43232h;
        if (i11 == -1 && this.f43233i == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f43233i == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public Layout.Alignment m() {
        return this.f43239o;
    }

    public boolean n() {
        if (this.f43241q == 1) {
            return true;
        }
        return false;
    }

    public b o() {
        return this.f43242r;
    }

    public boolean p() {
        return this.f43229e;
    }

    public boolean q() {
        return this.f43227c;
    }

    public boolean s() {
        if (this.f43230f == 1) {
            return true;
        }
        return false;
    }

    public boolean t() {
        if (this.f43231g == 1) {
            return true;
        }
        return false;
    }

    public g u(int i10) {
        this.f43228d = i10;
        this.f43229e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f43232h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f43226b = i10;
        this.f43227c = true;
        return this;
    }

    public g x(String str) {
        this.f43225a = str;
        return this;
    }

    public g y(float f10) {
        this.f43235k = f10;
        return this;
    }

    public g z(int i10) {
        this.f43234j = i10;
        return this;
    }
}
