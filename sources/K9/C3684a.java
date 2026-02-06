package k9;

import N9.O;
import android.util.Pair;
import ja.C3645a;
import k9.n1;

/* renamed from: k9.a  reason: case insensitive filesystem */
public abstract class C3684a extends n1 {

    /* renamed from: c  reason: collision with root package name */
    private final int f45426c;

    /* renamed from: d  reason: collision with root package name */
    private final O f45427d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f45428e;

    public C3684a(boolean z10, O o10) {
        this.f45428e = z10;
        this.f45427d = o10;
        this.f45426c = o10.a();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f45427d.d(i10);
        }
        if (i10 < this.f45426c - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int H(int i10, boolean z10) {
        if (z10) {
            return this.f45427d.c(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public abstract Object C(int i10);

    /* access modifiers changed from: protected */
    public abstract int E(int i10);

    /* access modifiers changed from: protected */
    public abstract int F(int i10);

    /* access modifiers changed from: protected */
    public abstract n1 I(int i10);

    public int e(boolean z10) {
        if (this.f45426c == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f45428e) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f45427d.g();
        }
        while (I(i10).u()) {
            i10 = G(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return F(i10) + I(i10).e(z10);
    }

    public final int f(Object obj) {
        int f10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B10 = B(obj);
        Object A10 = A(obj);
        int x10 = x(B10);
        if (x10 == -1 || (f10 = I(x10).f(A10)) == -1) {
            return -1;
        }
        return E(x10) + f10;
    }

    public int g(boolean z10) {
        int i10;
        int i11 = this.f45426c;
        if (i11 == 0) {
            return -1;
        }
        if (this.f45428e) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f45427d.e();
        } else {
            i10 = i11 - 1;
        }
        while (I(i10).u()) {
            i10 = H(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return F(i10) + I(i10).g(z10);
    }

    public int i(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f45428e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F10 = F(z11);
        n1 I10 = I(z11);
        int i13 = i10 - F10;
        if (i11 != 2) {
            i12 = i11;
        }
        int i14 = I10.i(i13, i12, z10);
        if (i14 != -1) {
            return F10 + i14;
        }
        int G10 = G(z11, z10);
        while (G10 != -1 && I(G10).u()) {
            G10 = G(G10, z10);
        }
        if (G10 != -1) {
            return F(G10) + I(G10).e(z10);
        }
        if (i11 == 2) {
            return e(z10);
        }
        return -1;
    }

    public final n1.b k(int i10, n1.b bVar, boolean z10) {
        int y10 = y(i10);
        int F10 = F(y10);
        I(y10).k(i10 - E(y10), bVar, z10);
        bVar.f45715c += F10;
        if (z10) {
            bVar.f45714b = D(C(y10), C3645a.e(bVar.f45714b));
        }
        return bVar;
    }

    public final n1.b l(Object obj, n1.b bVar) {
        Object B10 = B(obj);
        Object A10 = A(obj);
        int x10 = x(B10);
        int F10 = F(x10);
        I(x10).l(A10, bVar);
        bVar.f45715c += F10;
        bVar.f45714b = obj;
        return bVar;
    }

    public int p(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f45428e) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F10 = F(z11);
        n1 I10 = I(z11);
        int i13 = i10 - F10;
        if (i11 != 2) {
            i12 = i11;
        }
        int p10 = I10.p(i13, i12, z10);
        if (p10 != -1) {
            return F10 + p10;
        }
        int H10 = H(z11, z10);
        while (H10 != -1 && I(H10).u()) {
            H10 = H(H10, z10);
        }
        if (H10 != -1) {
            return F(H10) + I(H10).g(z10);
        }
        if (i11 == 2) {
            return g(z10);
        }
        return -1;
    }

    public final Object q(int i10) {
        int y10 = y(i10);
        return D(C(y10), I(y10).q(i10 - E(y10)));
    }

    public final n1.d s(int i10, n1.d dVar, long j10) {
        int z10 = z(i10);
        int F10 = F(z10);
        int E10 = E(z10);
        I(z10).s(i10 - F10, dVar, j10);
        Object C10 = C(z10);
        if (!n1.d.f45724r.equals(dVar.f45728a)) {
            C10 = D(C10, dVar.f45728a);
        }
        dVar.f45728a = C10;
        dVar.f45742o += E10;
        dVar.f45743p += E10;
        return dVar;
    }

    /* access modifiers changed from: protected */
    public abstract int x(Object obj);

    /* access modifiers changed from: protected */
    public abstract int y(int i10);

    /* access modifiers changed from: protected */
    public abstract int z(int i10);
}
