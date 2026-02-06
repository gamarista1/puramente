package com.google.protobuf;

import java.util.List;

abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f58428a = z();

    /* renamed from: b  reason: collision with root package name */
    private static final g0 f58429b = A(false);

    /* renamed from: c  reason: collision with root package name */
    private static final g0 f58430c = A(true);

    /* renamed from: d  reason: collision with root package name */
    private static final g0 f58431d = new i0();

    private static g0 A(boolean z10) {
        try {
            Class B10 = B();
            if (B10 == null) {
                return null;
            }
            return (g0) B10.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void C(C4874l lVar, Object obj, Object obj2) {
        C4877o b10 = lVar.b(obj2);
        if (!b10.j()) {
            lVar.c(obj).p(b10);
        }
    }

    static void D(F f10, Object obj, Object obj2, long j10) {
        k0.R(obj, j10, f10.a(k0.C(obj, j10), k0.C(obj2, j10)));
    }

    static void E(g0 g0Var, Object obj, Object obj2) {
        g0Var.f(obj, g0Var.e(g0Var.a(obj), g0Var.a(obj2)));
    }

    public static g0 F() {
        return f58429b;
    }

    public static g0 G() {
        return f58430c;
    }

    public static void H(Class cls) {
        Class cls2;
        if (!r.class.isAssignableFrom(cls) && (cls2 = f58428a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static g0 J() {
        return f58431d;
    }

    public static void K(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.A(i10, list, z10);
        }
    }

    public static void L(int i10, List list, n0 n0Var) {
        if (list != null && !list.isEmpty()) {
            n0Var.I(i10, list);
        }
    }

    public static void M(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.G(i10, list, z10);
        }
    }

    public static void N(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.n(i10, list, z10);
        }
    }

    public static void O(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.j(i10, list, z10);
        }
    }

    public static void P(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.y(i10, list, z10);
        }
    }

    public static void Q(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.a(i10, list, z10);
        }
    }

    public static void R(int i10, List list, n0 n0Var, Z z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.M(i10, list, z10);
        }
    }

    public static void S(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.g(i10, list, z10);
        }
    }

    public static void T(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.F(i10, list, z10);
        }
    }

    public static void U(int i10, List list, n0 n0Var, Z z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.J(i10, list, z10);
        }
    }

    public static void V(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.z(i10, list, z10);
        }
    }

    public static void W(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.q(i10, list, z10);
        }
    }

    public static void X(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.D(i10, list, z10);
        }
    }

    public static void Y(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.l(i10, list, z10);
        }
    }

    public static void Z(int i10, List list, n0 n0Var) {
        if (list != null && !list.isEmpty()) {
            n0Var.d(i10, list);
        }
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return C4870h.O(i10) + C4870h.z(size);
        }
        return size * C4870h.d(i10, true);
    }

    public static void a0(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.k(i10, list, z10);
        }
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, n0 n0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            n0Var.r(i10, list, z10);
        }
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = size * C4870h.O(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            O10 += C4870h.h((C4868f) list.get(i11));
        }
        return O10;
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(e10);
        }
        return e10 + (size * C4870h.O(i10));
    }

    static int e(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4880s) {
            C4880s sVar = (C4880s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C4870h.l(sVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C4870h.l(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return C4870h.O(i10) + C4870h.z(size * 4);
        }
        return size * C4870h.m(i10, 0);
    }

    static int g(List list) {
        return list.size() * 4;
    }

    static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return C4870h.O(i10) + C4870h.z(size * 8);
        }
        return size * C4870h.o(i10, 0);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, Z z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += C4870h.s(i10, (K) list.get(i12), z10);
        }
        return i11;
    }

    static int k(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l10 = l(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(l10);
        }
        return l10 + (size * C4870h.O(i10));
    }

    static int l(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4880s) {
            C4880s sVar = (C4880s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C4870h.w(sVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C4870h.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(n10);
        }
        return n10 + (list.size() * C4870h.O(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C4870h.y(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int o(int i10, Object obj, Z z10) {
        return C4870h.A(i10, (K) obj, z10);
    }

    static int p(int i10, List list, Z z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int O10 = C4870h.O(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            O10 += C4870h.C((K) list.get(i11), z10);
        }
        return O10;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(r10);
        }
        return r10 + (size * C4870h.O(i10));
    }

    static int r(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4880s) {
            C4880s sVar = (C4880s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C4870h.J(sVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C4870h.J(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int s(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t10 = t(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(t10);
        }
        return t10 + (size * C4870h.O(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C4870h.L(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int u(int i10, List list) {
        int N10;
        int N11;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int O10 = C4870h.O(i10) * size;
        if (list instanceof C4887z) {
            C4887z zVar = (C4887z) list;
            while (i11 < size) {
                Object s10 = zVar.s(i11);
                if (s10 instanceof C4868f) {
                    N11 = C4870h.h((C4868f) s10);
                } else {
                    N11 = C4870h.N((String) s10);
                }
                O10 += N11;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof C4868f) {
                    N10 = C4870h.h((C4868f) obj);
                } else {
                    N10 = C4870h.N((String) obj);
                }
                O10 += N10;
                i11++;
            }
        }
        return O10;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(w10);
        }
        return w10 + (size * C4870h.O(i10));
    }

    static int w(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C4880s) {
            C4880s sVar = (C4880s) list;
            i10 = 0;
            while (i11 < size) {
                i10 += C4870h.Q(sVar.getInt(i11));
                i11++;
            }
        } else {
            int i12 = 0;
            while (i11 < size) {
                i12 = i10 + C4870h.Q(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y10 = y(list);
        if (z10) {
            return C4870h.O(i10) + C4870h.z(y10);
        }
        return y10 + (size * C4870h.O(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof B) {
            B b10 = (B) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C4870h.S(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    private static Class z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }
}
