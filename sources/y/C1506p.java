package Y;

import androidx.collection.K;
import androidx.collection.L;
import androidx.collection.X;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

/* renamed from: Y.p  reason: case insensitive filesystem */
public abstract class C1506p {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f10101a = new C1516u0("provider");

    /* renamed from: b  reason: collision with root package name */
    private static final Object f10102b = new C1516u0("provider");

    /* renamed from: c  reason: collision with root package name */
    private static final Object f10103c = new C1516u0("compositionLocalMap");

    /* renamed from: d  reason: collision with root package name */
    private static final Object f10104d = new C1516u0("providerValues");

    /* renamed from: e  reason: collision with root package name */
    private static final Object f10105e = new C1516u0("providers");

    /* renamed from: f  reason: collision with root package name */
    private static final Object f10106f = new C1516u0("reference");
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator f10107g = new C1504o();

    /* access modifiers changed from: private */
    public static final Object A(C1472b0 b0Var) {
        if (b0Var.d() != null) {
            return new C1469a0(Integer.valueOf(b0Var.a()), b0Var.d());
        }
        return Integer.valueOf(b0Var.a());
    }

    public static final Object B() {
        return f10102b;
    }

    public static final Object C() {
        return f10105e;
    }

    public static final Object D() {
        return f10106f;
    }

    /* access modifiers changed from: private */
    public static final void E(List list, int i10, L0 l02, Object obj) {
        int w10 = w(list, i10);
        if (w10 < 0) {
            int i11 = -(w10 + 1);
            if (!(obj instanceof I)) {
                obj = null;
            }
            list.add(i11, new Y(l02, i10, obj));
            return;
        }
        Y y10 = (Y) list.get(w10);
        if (obj instanceof I) {
            Object a10 = y10.a();
            if (a10 == null) {
                y10.e(obj);
            } else if (a10 instanceof L) {
                ((L) a10).h(obj);
            } else {
                y10.e(X.b(a10, obj));
            }
        } else {
            y10.e((Object) null);
        }
    }

    public static final boolean F(C1473b1 b1Var) {
        if (b1Var.k() > b1Var.u() + 1) {
            return true;
        }
        return false;
    }

    public static final boolean G(C1485f1 f1Var) {
        if (f1Var.a0() > f1Var.c0() + 1) {
            return true;
        }
        return false;
    }

    public static final boolean H() {
        return false;
    }

    /* access modifiers changed from: private */
    public static final K I(int i10) {
        return C1509q0.b(new K(i10));
    }

    /* access modifiers changed from: private */
    public static final int J(C1473b1 b1Var, int i10, int i11, int i12) {
        if (i10 == i11) {
            return i10;
        }
        if (i10 == i12 || i11 == i12) {
            return i12;
        }
        if (b1Var.P(i10) == i11) {
            return i11;
        }
        if (b1Var.P(i11) == i10) {
            return i10;
        }
        if (b1Var.P(i10) == b1Var.P(i11)) {
            return b1Var.P(i10);
        }
        int u10 = u(b1Var, i10, i12);
        int u11 = u(b1Var, i11, i12);
        int i13 = u10 - u11;
        for (int i14 = 0; i14 < i13; i14++) {
            i10 = b1Var.P(i10);
        }
        int i15 = u11 - u10;
        for (int i16 = 0; i16 < i15; i16++) {
            i11 = b1Var.P(i11);
        }
        while (i10 != i11) {
            i10 = b1Var.P(i10);
            i11 = b1Var.P(i11);
        }
        return i10;
    }

    public static final void K(C1485f1 f1Var, S0 s02) {
        int i10;
        int c10 = f1Var.Q(f1Var.f9980b, f1Var.h0(f1Var.a0() + f1Var.k0(f1Var.a0())));
        for (int c11 = f1Var.Q(f1Var.f9980b, f1Var.h0(f1Var.a0())); c11 < c10; c11++) {
            Object obj = f1Var.f9981c[f1Var.R(c11)];
            int i11 = -1;
            if (obj instanceof C1496k) {
                s02.e((C1496k) obj, f1Var.e0() - c11, -1, -1);
            }
            if (obj instanceof U0) {
                int e02 = f1Var.e0() - c11;
                U0 u02 = (U0) obj;
                C1477d a10 = u02.a();
                if (a10 == null || !a10.b()) {
                    i10 = -1;
                } else {
                    i11 = f1Var.F(a10);
                    i10 = f1Var.e0() - f1Var.b1(i11);
                }
                s02.b(u02.b(), e02, i11, i10);
            }
            if (obj instanceof L0) {
                ((L0) obj).x();
            }
        }
        f1Var.L0();
    }

    private static final void L(C1485f1 f1Var, int i10, int i11, Object obj) {
        boolean z10;
        if (obj == f1Var.R0(i10, i11, C1500m.f10026a.a())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            r("Slot table is out of sync");
        }
    }

    /* access modifiers changed from: private */
    public static final Y M(List list, int i10) {
        int w10 = w(list, i10);
        if (w10 >= 0) {
            return (Y) list.remove(w10);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final void N(List list, int i10, int i11) {
        int v10 = v(list, i10);
        while (v10 < list.size() && ((Y) list.get(v10)).b() < i11) {
            list.remove(v10);
        }
    }

    public static final void O(boolean z10) {
        if (!z10) {
            r("Check failed");
        }
    }

    /* access modifiers changed from: private */
    public static final int b(Y y10, Y y11) {
        return C6496s.i(y10.b(), y11.b());
    }

    /* access modifiers changed from: private */
    public static final boolean n(int i10) {
        if (i10 != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final List p(C1476c1 c1Var, C1477d dVar) {
        ArrayList arrayList = new ArrayList();
        C1473b1 P10 = c1Var.P();
        try {
            q(P10, arrayList, c1Var.b(dVar));
            C6514M m10 = C6514M.f71813a;
            return arrayList;
        } finally {
            P10.d();
        }
    }

    private static final void q(C1473b1 b1Var, List list, int i10) {
        if (b1Var.J(i10)) {
            list.add(b1Var.L(i10));
            return;
        }
        int i11 = i10 + 1;
        int E10 = i10 + b1Var.E(i10);
        while (i11 < E10) {
            q(b1Var, list, i11);
            i11 += b1Var.E(i11);
        }
    }

    public static final void r(String str) {
        throw new C1498l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void s(String str) {
        throw new C1498l("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void t(C1485f1 f1Var, S0 s02) {
        int i10;
        int i11;
        int a02 = f1Var.a0();
        int b02 = f1Var.b0();
        while (a02 < b02) {
            Object A02 = f1Var.A0(a02);
            if (A02 instanceof C1496k) {
                s02.a((C1496k) A02, f1Var.e0() - f1Var.d1(a02), -1, -1);
            }
            int A10 = f1Var.Z0(f1Var.f9980b, f1Var.h0(a02));
            int i12 = a02 + 1;
            int c10 = f1Var.Q(f1Var.f9980b, f1Var.h0(i12));
            for (int i13 = A10; i13 < c10; i13++) {
                int i14 = i13 - A10;
                Object obj = f1Var.f9981c[f1Var.R(i13)];
                if (obj instanceof U0) {
                    U0 u02 = (U0) obj;
                    T0 b10 = u02.b();
                    if (!(b10 instanceof W0)) {
                        L(f1Var, a02, i14, obj);
                        int e02 = f1Var.e0() - i14;
                        C1477d a10 = u02.a();
                        if (a10 == null || !a10.b()) {
                            i11 = -1;
                            i10 = -1;
                        } else {
                            i11 = f1Var.F(a10);
                            i10 = f1Var.e0() - f1Var.b1(i11);
                        }
                        s02.b(b10, e02, i11, i10);
                    }
                } else if (obj instanceof L0) {
                    L(f1Var, a02, i14, obj);
                    ((L0) obj).x();
                }
            }
            a02 = i12;
        }
    }

    private static final int u(C1473b1 b1Var, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = b1Var.P(i10);
            i12++;
        }
        return i12;
    }

    private static final int v(List list, int i10) {
        int w10 = w(list, i10);
        if (w10 < 0) {
            return -(w10 + 1);
        }
        return w10;
    }

    private static final int w(List list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = C6496s.i(((Y) list.get(i12)).b(), i10);
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* access modifiers changed from: private */
    public static final Y x(List list, int i10, int i11) {
        int v10 = v(list, i10);
        if (v10 >= list.size()) {
            return null;
        }
        Y y10 = (Y) list.get(v10);
        if (y10.b() < i11) {
            return y10;
        }
        return null;
    }

    public static final Object y() {
        return f10103c;
    }

    public static final Object z() {
        return f10101a;
    }

    public static final void P() {
    }

    /* access modifiers changed from: private */
    public static final int o(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static final void Q(int i10, int i11, int i12, String str) {
    }
}
