package m2;

import android.util.Pair;
import f2.H;
import i2.C2076a;
import t2.b0;

/* renamed from: m2.a  reason: case insensitive filesystem */
public abstract class C2192a extends H {

    /* renamed from: e  reason: collision with root package name */
    private final int f23700e;

    /* renamed from: f  reason: collision with root package name */
    private final b0 f23701f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f23702g;

    public C2192a(boolean z10, b0 b0Var) {
        this.f23702g = z10;
        this.f23701f = b0Var;
        this.f23700e = b0Var.a();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f23701f.d(i10);
        }
        if (i10 < this.f23700e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f23701f.c(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10);

    /* access modifiers changed from: protected */
    public abstract H D(int i10);

    public int a(boolean z10) {
        if (this.f23700e == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f23702g) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f23701f.g();
        }
        while (D(i10).q()) {
            i10 = B(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return A(i10) + D(i10).a(z10);
    }

    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        if (s10 == -1 || (b10 = D(s10).b(v10)) == -1) {
            return -1;
        }
        return z(s10) + b10;
    }

    public int c(boolean z10) {
        int i10;
        int i11 = this.f23700e;
        if (i11 == 0) {
            return -1;
        }
        if (this.f23702g) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f23701f.e();
        } else {
            i10 = i11 - 1;
        }
        while (D(i10).q()) {
            i10 = C(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return A(i10) + D(i10).c(z10);
    }

    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f23702g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        H D10 = D(u10);
        int i13 = i10 - A10;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = D10.e(i13, i12, z10);
        if (e10 != -1) {
            return A10 + e10;
        }
        int B10 = B(u10, z10);
        while (B10 != -1 && D(B10).q()) {
            B10 = B(B10, z10);
        }
        if (B10 != -1) {
            return A(B10) + D(B10).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public final H.b g(int i10, H.b bVar, boolean z10) {
        int t10 = t(i10);
        int A10 = A(t10);
        D(t10).g(i10 - z(t10), bVar, z10);
        bVar.f19746c += A10;
        if (z10) {
            bVar.f19745b = y(x(t10), C2076a.e(bVar.f19745b));
        }
        return bVar;
    }

    public final H.b h(Object obj, H.b bVar) {
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        int A10 = A(s10);
        D(s10).h(v10, bVar);
        bVar.f19746c += A10;
        bVar.f19745b = obj;
        return bVar;
    }

    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f23702g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        H D10 = D(u10);
        int i13 = i10 - A10;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = D10.l(i13, i12, z10);
        if (l10 != -1) {
            return A10 + l10;
        }
        int C10 = C(u10, z10);
        while (C10 != -1 && D(C10).q()) {
            C10 = C(C10, z10);
        }
        if (C10 != -1) {
            return A(C10) + D(C10).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    public final Object m(int i10) {
        int t10 = t(i10);
        return y(x(t10), D(t10).m(i10 - z(t10)));
    }

    public final H.c o(int i10, H.c cVar, long j10) {
        int u10 = u(i10);
        int A10 = A(u10);
        int z10 = z(u10);
        D(u10).o(i10 - A10, cVar, j10);
        Object x10 = x(u10);
        if (!H.c.f19757q.equals(cVar.f19767a)) {
            x10 = y(x10, cVar.f19767a);
        }
        cVar.f19767a = x10;
        cVar.f19780n += z10;
        cVar.f19781o += z10;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public abstract int s(Object obj);

    /* access modifiers changed from: protected */
    public abstract int t(int i10);

    /* access modifiers changed from: protected */
    public abstract int u(int i10);

    /* access modifiers changed from: protected */
    public abstract Object x(int i10);

    /* access modifiers changed from: protected */
    public abstract int z(int i10);
}
