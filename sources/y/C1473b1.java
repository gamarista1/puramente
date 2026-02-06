package Y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: Y.b1  reason: case insensitive filesystem */
public final class C1473b1 {

    /* renamed from: a  reason: collision with root package name */
    private final C1476c1 f9937a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f9938b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9939c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f9940d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9941e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap f9942f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f9943g;

    /* renamed from: h  reason: collision with root package name */
    private int f9944h;

    /* renamed from: i  reason: collision with root package name */
    private int f9945i;

    /* renamed from: j  reason: collision with root package name */
    private int f9946j = -1;

    /* renamed from: k  reason: collision with root package name */
    private final W f9947k = new W();

    /* renamed from: l  reason: collision with root package name */
    private int f9948l;

    /* renamed from: m  reason: collision with root package name */
    private int f9949m;

    /* renamed from: n  reason: collision with root package name */
    private int f9950n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9951o;

    public C1473b1(C1476c1 c1Var) {
        this.f9937a = c1Var;
        this.f9938b = c1Var.z();
        int A10 = c1Var.A();
        this.f9939c = A10;
        this.f9940d = c1Var.C();
        this.f9941e = c1Var.D();
        this.f9945i = A10;
    }

    private final Object M(int[] iArr, int i10) {
        if (C1482e1.N(iArr, i10)) {
            return this.f9940d[C1482e1.R(iArr, i10)];
        }
        return C1500m.f10026a.a();
    }

    private final Object O(int[] iArr, int i10) {
        if (C1482e1.L(iArr, i10)) {
            return this.f9940d[C1482e1.S(iArr, i10)];
        }
        return null;
    }

    private final Object b(int[] iArr, int i10) {
        if (C1482e1.J(iArr, i10)) {
            return this.f9940d[C1482e1.B(iArr, i10)];
        }
        return C1500m.f10026a.a();
    }

    public final Object A(int i10) {
        return B(this.f9944h, i10);
    }

    public final Object B(int i10, int i11) {
        int i12;
        int u10 = C1482e1.V(this.f9938b, i10);
        int i13 = i10 + 1;
        if (i13 < this.f9939c) {
            i12 = C1482e1.F(this.f9938b, i13);
        } else {
            i12 = this.f9941e;
        }
        int i14 = u10 + i11;
        if (i14 < i12) {
            return this.f9940d[i14];
        }
        return C1500m.f10026a.a();
    }

    public final int C(int i10) {
        return C1482e1.O(this.f9938b, i10);
    }

    public final Object D(int i10) {
        return O(this.f9938b, i10);
    }

    public final int E(int i10) {
        return C1482e1.I(this.f9938b, i10);
    }

    public final boolean F(int i10) {
        return C1482e1.K(this.f9938b, i10);
    }

    public final boolean G(int i10) {
        return C1482e1.L(this.f9938b, i10);
    }

    public final boolean H() {
        if (t() || this.f9944h == this.f9945i) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        return C1482e1.N(this.f9938b, this.f9944h);
    }

    public final boolean J(int i10) {
        return C1482e1.N(this.f9938b, i10);
    }

    public final Object K() {
        int i10;
        if (this.f9948l > 0 || (i10 = this.f9949m) >= this.f9950n) {
            this.f9951o = false;
            return C1500m.f10026a.a();
        }
        this.f9951o = true;
        Object[] objArr = this.f9940d;
        this.f9949m = i10 + 1;
        return objArr[i10];
    }

    public final Object L(int i10) {
        if (C1482e1.N(this.f9938b, i10)) {
            return M(this.f9938b, i10);
        }
        return null;
    }

    public final int N(int i10) {
        return C1482e1.Q(this.f9938b, i10);
    }

    public final int P(int i10) {
        return C1482e1.T(this.f9938b, i10);
    }

    public final void Q(int i10) {
        boolean z10;
        int i11;
        if (this.f9948l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot reposition while in an empty region");
        }
        this.f9944h = i10;
        if (i10 < this.f9939c) {
            i11 = C1482e1.T(this.f9938b, i10);
        } else {
            i11 = -1;
        }
        this.f9946j = i11;
        if (i11 < 0) {
            this.f9945i = this.f9939c;
        } else {
            this.f9945i = i11 + C1482e1.I(this.f9938b, i11);
        }
        this.f9949m = 0;
        this.f9950n = 0;
    }

    public final void R(int i10) {
        boolean z10;
        int h10 = C1482e1.I(this.f9938b, i10) + i10;
        int i11 = this.f9944h;
        if (i11 < i10 || i11 > h10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            C1506p.r("Index " + i10 + " is not a parent of " + i11);
        }
        this.f9946j = i10;
        this.f9945i = h10;
        this.f9949m = 0;
        this.f9950n = 0;
    }

    public final int S() {
        boolean z10;
        int i10 = 1;
        if (this.f9948l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot skip while in an empty region");
        }
        if (!C1482e1.N(this.f9938b, this.f9944h)) {
            i10 = C1482e1.Q(this.f9938b, this.f9944h);
        }
        int i11 = this.f9944h;
        this.f9944h = i11 + C1482e1.I(this.f9938b, i11);
        return i10;
    }

    public final void T() {
        boolean z10;
        if (this.f9948l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C1506p.r("Cannot skip the enclosing group while in an empty region");
        }
        this.f9944h = this.f9945i;
        this.f9949m = 0;
        this.f9950n = 0;
    }

    public final void U() {
        boolean z10;
        int i10;
        if (this.f9948l <= 0) {
            int i11 = this.f9946j;
            int i12 = this.f9944h;
            if (C1482e1.T(this.f9938b, i12) == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C0.a("Invalid slot table detected");
            }
            HashMap hashMap = this.f9942f;
            if (hashMap != null) {
                V v10 = (V) hashMap.get(a(i11));
            }
            W w10 = this.f9947k;
            int i13 = this.f9949m;
            int i14 = this.f9950n;
            if (i13 == 0 && i14 == 0) {
                w10.j(-1);
            } else {
                w10.j(i13);
            }
            this.f9946j = i12;
            this.f9945i = C1482e1.I(this.f9938b, i12) + i12;
            int i15 = i12 + 1;
            this.f9944h = i15;
            this.f9949m = C1482e1.V(this.f9938b, i12);
            if (i12 >= this.f9939c - 1) {
                i10 = this.f9941e;
            } else {
                i10 = C1482e1.F(this.f9938b, i15);
            }
            this.f9950n = i10;
        }
    }

    public final void V() {
        if (this.f9948l <= 0) {
            if (!C1482e1.N(this.f9938b, this.f9944h)) {
                C0.a("Expected a node group");
            }
            U();
        }
    }

    public final C1477d a(int i10) {
        ArrayList v10 = this.f9937a.v();
        int t10 = C1482e1.U(v10, i10, this.f9939c);
        if (t10 >= 0) {
            return (C1477d) v10.get(t10);
        }
        C1477d dVar = new C1477d(i10);
        v10.add(-(t10 + 1), dVar);
        return dVar;
    }

    public final void c() {
        this.f9948l++;
    }

    public final void d() {
        this.f9943g = true;
        this.f9937a.g(this, this.f9942f);
    }

    public final boolean e(int i10) {
        return C1482e1.D(this.f9938b, i10);
    }

    public final void f() {
        boolean z10;
        if (this.f9948l > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C0.a("Unbalanced begin/end empty");
        }
        this.f9948l--;
    }

    public final void g() {
        boolean z10;
        int i10;
        int i11;
        if (this.f9948l == 0) {
            if (this.f9944h == this.f9945i) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                C1506p.r("endGroup() not called at the end of a group");
            }
            int s10 = C1482e1.T(this.f9938b, this.f9946j);
            this.f9946j = s10;
            if (s10 < 0) {
                i10 = this.f9939c;
            } else {
                i10 = C1482e1.I(this.f9938b, s10) + s10;
            }
            this.f9945i = i10;
            int i12 = this.f9947k.i();
            if (i12 < 0) {
                this.f9949m = 0;
                this.f9950n = 0;
                return;
            }
            this.f9949m = i12;
            if (s10 >= this.f9939c - 1) {
                i11 = this.f9941e;
            } else {
                i11 = C1482e1.F(this.f9938b, s10 + 1);
            }
            this.f9950n = i11;
        }
    }

    public final List h() {
        int p10;
        ArrayList arrayList = new ArrayList();
        if (this.f9948l > 0) {
            return arrayList;
        }
        int i10 = this.f9944h;
        int i11 = 0;
        while (i10 < this.f9945i) {
            int n10 = C1482e1.O(this.f9938b, i10);
            Object O10 = O(this.f9938b, i10);
            if (C1482e1.N(this.f9938b, i10)) {
                p10 = 1;
            } else {
                p10 = C1482e1.Q(this.f9938b, i10);
            }
            arrayList.add(new C1472b0(n10, O10, i10, p10, i11));
            i10 += C1482e1.I(this.f9938b, i10);
            i11++;
        }
        return arrayList;
    }

    public final boolean i() {
        return this.f9943g;
    }

    public final int j() {
        return this.f9945i;
    }

    public final int k() {
        return this.f9944h;
    }

    public final Object l() {
        int i10 = this.f9944h;
        if (i10 < this.f9945i) {
            return b(this.f9938b, i10);
        }
        return 0;
    }

    public final int m() {
        return this.f9945i;
    }

    public final int n() {
        int i10 = this.f9944h;
        if (i10 < this.f9945i) {
            return C1482e1.O(this.f9938b, i10);
        }
        return 0;
    }

    public final Object o() {
        int i10 = this.f9944h;
        if (i10 < this.f9945i) {
            return O(this.f9938b, i10);
        }
        return null;
    }

    public final int p() {
        return C1482e1.I(this.f9938b, this.f9944h);
    }

    public final int q() {
        return this.f9949m - C1482e1.V(this.f9938b, this.f9946j);
    }

    public final boolean r() {
        return this.f9951o;
    }

    public final boolean s() {
        int i10 = this.f9944h;
        if (i10 >= this.f9945i || !C1482e1.L(this.f9938b, i10)) {
            return false;
        }
        return true;
    }

    public final boolean t() {
        if (this.f9948l > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "SlotReader(current=" + this.f9944h + ", key=" + n() + ", parent=" + this.f9946j + ", end=" + this.f9945i + ')';
    }

    public final int u() {
        return this.f9946j;
    }

    public final int v() {
        int i10 = this.f9946j;
        if (i10 >= 0) {
            return C1482e1.Q(this.f9938b, i10);
        }
        return 0;
    }

    public final int w() {
        return this.f9950n - this.f9949m;
    }

    public final int x() {
        return this.f9939c;
    }

    public final C1476c1 y() {
        return this.f9937a;
    }

    public final Object z(int i10) {
        return b(this.f9938b, i10);
    }
}
