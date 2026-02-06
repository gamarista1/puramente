package c3;

import android.text.Layout;

final class g {

    /* renamed from: a  reason: collision with root package name */
    private String f19338a;

    /* renamed from: b  reason: collision with root package name */
    private int f19339b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19340c;

    /* renamed from: d  reason: collision with root package name */
    private int f19341d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19342e;

    /* renamed from: f  reason: collision with root package name */
    private int f19343f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f19344g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f19345h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f19346i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f19347j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f19348k;

    /* renamed from: l  reason: collision with root package name */
    private String f19349l;

    /* renamed from: m  reason: collision with root package name */
    private int f19350m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f19351n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f19352o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f19353p;

    /* renamed from: q  reason: collision with root package name */
    private int f19354q = -1;

    /* renamed from: r  reason: collision with root package name */
    private b f19355r;

    /* renamed from: s  reason: collision with root package name */
    private float f19356s = Float.MAX_VALUE;

    private g r(g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f19340c && gVar.f19340c) {
                w(gVar.f19339b);
            }
            if (this.f19345h == -1) {
                this.f19345h = gVar.f19345h;
            }
            if (this.f19346i == -1) {
                this.f19346i = gVar.f19346i;
            }
            if (this.f19338a == null && (str = gVar.f19338a) != null) {
                this.f19338a = str;
            }
            if (this.f19343f == -1) {
                this.f19343f = gVar.f19343f;
            }
            if (this.f19344g == -1) {
                this.f19344g = gVar.f19344g;
            }
            if (this.f19351n == -1) {
                this.f19351n = gVar.f19351n;
            }
            if (this.f19352o == null && (alignment2 = gVar.f19352o) != null) {
                this.f19352o = alignment2;
            }
            if (this.f19353p == null && (alignment = gVar.f19353p) != null) {
                this.f19353p = alignment;
            }
            if (this.f19354q == -1) {
                this.f19354q = gVar.f19354q;
            }
            if (this.f19347j == -1) {
                this.f19347j = gVar.f19347j;
                this.f19348k = gVar.f19348k;
            }
            if (this.f19355r == null) {
                this.f19355r = gVar.f19355r;
            }
            if (this.f19356s == Float.MAX_VALUE) {
                this.f19356s = gVar.f19356s;
            }
            if (z10 && !this.f19342e && gVar.f19342e) {
                u(gVar.f19341d);
            }
            if (z10 && this.f19350m == -1 && (i10 = gVar.f19350m) != -1) {
                this.f19350m = i10;
            }
        }
        return this;
    }

    public g A(String str) {
        this.f19349l = str;
        return this;
    }

    public g B(boolean z10) {
        this.f19346i = z10 ? 1 : 0;
        return this;
    }

    public g C(boolean z10) {
        this.f19343f = z10 ? 1 : 0;
        return this;
    }

    public g D(Layout.Alignment alignment) {
        this.f19353p = alignment;
        return this;
    }

    public g E(int i10) {
        this.f19351n = i10;
        return this;
    }

    public g F(int i10) {
        this.f19350m = i10;
        return this;
    }

    public g G(float f10) {
        this.f19356s = f10;
        return this;
    }

    public g H(Layout.Alignment alignment) {
        this.f19352o = alignment;
        return this;
    }

    public g I(boolean z10) {
        this.f19354q = z10 ? 1 : 0;
        return this;
    }

    public g J(b bVar) {
        this.f19355r = bVar;
        return this;
    }

    public g K(boolean z10) {
        this.f19344g = z10 ? 1 : 0;
        return this;
    }

    public g a(g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f19342e) {
            return this.f19341d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f19340c) {
            return this.f19339b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f19338a;
    }

    public float e() {
        return this.f19348k;
    }

    public int f() {
        return this.f19347j;
    }

    public String g() {
        return this.f19349l;
    }

    public Layout.Alignment h() {
        return this.f19353p;
    }

    public int i() {
        return this.f19351n;
    }

    public int j() {
        return this.f19350m;
    }

    public float k() {
        return this.f19356s;
    }

    public int l() {
        int i10;
        int i11 = this.f19345h;
        if (i11 == -1 && this.f19346i == -1) {
            return -1;
        }
        int i12 = 0;
        if (i11 == 1) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (this.f19346i == 1) {
            i12 = 2;
        }
        return i10 | i12;
    }

    public Layout.Alignment m() {
        return this.f19352o;
    }

    public boolean n() {
        if (this.f19354q == 1) {
            return true;
        }
        return false;
    }

    public b o() {
        return this.f19355r;
    }

    public boolean p() {
        return this.f19342e;
    }

    public boolean q() {
        return this.f19340c;
    }

    public boolean s() {
        if (this.f19343f == 1) {
            return true;
        }
        return false;
    }

    public boolean t() {
        if (this.f19344g == 1) {
            return true;
        }
        return false;
    }

    public g u(int i10) {
        this.f19341d = i10;
        this.f19342e = true;
        return this;
    }

    public g v(boolean z10) {
        this.f19345h = z10 ? 1 : 0;
        return this;
    }

    public g w(int i10) {
        this.f19339b = i10;
        this.f19340c = true;
        return this;
    }

    public g x(String str) {
        this.f19338a = str;
        return this;
    }

    public g y(float f10) {
        this.f19348k = f10;
        return this;
    }

    public g z(int i10) {
        this.f19347j = i10;
        return this;
    }
}
