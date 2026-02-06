package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1751y;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class f16334a = A();

    /* renamed from: b  reason: collision with root package name */
    private static final l0 f16335b = B(false);

    /* renamed from: c  reason: collision with root package name */
    private static final l0 f16336c = B(true);

    /* renamed from: d  reason: collision with root package name */
    private static final l0 f16337d = new n0();

    private static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static l0 B(boolean z10) {
        try {
            Class C10 = C();
            if (C10 == null) {
                return null;
            }
            return (l0) C10.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z10)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static void D(C1743p pVar, Object obj, Object obj2) {
        C1745s c10 = pVar.c(obj2);
        if (!c10.j()) {
            pVar.d(obj).p(c10);
        }
    }

    static void E(J j10, Object obj, Object obj2, long j11) {
        p0.O(obj, j11, j10.a(p0.A(obj, j11), p0.A(obj2, j11)));
    }

    static void F(l0 l0Var, Object obj, Object obj2) {
        l0Var.p(obj, l0Var.k(l0Var.g(obj), l0Var.g(obj2)));
    }

    public static l0 G() {
        return f16335b;
    }

    public static l0 H() {
        return f16336c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!C1749w.class.isAssignableFrom(cls) && (cls2 = f16334a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean J(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    static Object K(int i10, int i11, Object obj, l0 l0Var) {
        if (obj == null) {
            obj = l0Var.n();
        }
        l0Var.e(obj, i10, (long) i11);
        return obj;
    }

    public static l0 L() {
        return f16337d;
    }

    public static void M(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.A(i10, list, z10);
        }
    }

    public static void N(int i10, List list, s0 s0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.I(i10, list);
        }
    }

    public static void O(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.G(i10, list, z10);
        }
    }

    public static void P(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.n(i10, list, z10);
        }
    }

    public static void Q(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.j(i10, list, z10);
        }
    }

    public static void R(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.y(i10, list, z10);
        }
    }

    public static void S(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.a(i10, list, z10);
        }
    }

    public static void T(int i10, List list, s0 s0Var, e0 e0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.J(i10, list, e0Var);
        }
    }

    public static void U(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.g(i10, list, z10);
        }
    }

    public static void V(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.F(i10, list, z10);
        }
    }

    public static void W(int i10, List list, s0 s0Var, e0 e0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.O(i10, list, e0Var);
        }
    }

    public static void X(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.z(i10, list, z10);
        }
    }

    public static void Y(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.q(i10, list, z10);
        }
    }

    public static void Z(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.D(i10, list, z10);
        }
    }

    static int a(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return C1737j.P(i10) + C1737j.y(size);
        }
        return size * C1737j.c(i10, true);
    }

    public static void a0(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.l(i10, list, z10);
        }
    }

    static int b(List list) {
        return list.size();
    }

    public static void b0(int i10, List list, s0 s0Var) {
        if (list != null && !list.isEmpty()) {
            s0Var.d(i10, list);
        }
    }

    static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P10 = size * C1737j.P(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            P10 += C1737j.g((C1734g) list.get(i11));
        }
        return P10;
    }

    public static void c0(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.k(i10, list, z10);
        }
    }

    static int d(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e10 = e(list);
        if (z10) {
            return C1737j.P(i10) + C1737j.y(e10);
        }
        return e10 + (size * C1737j.P(i10));
    }

    public static void d0(int i10, List list, s0 s0Var, boolean z10) {
        if (list != null && !list.isEmpty()) {
            s0Var.r(i10, list, z10);
        }
    }

    static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1750x) {
            C1750x xVar = (C1750x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.k(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int f(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return C1737j.P(i10) + C1737j.y(size * 4);
        }
        return size * C1737j.l(i10, 0);
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
            return C1737j.P(i10) + C1737j.y(size * 8);
        }
        return size * C1737j.n(i10, 0);
    }

    static int i(List list) {
        return list.size() * 8;
    }

    static int j(int i10, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += C1737j.r(i10, (O) list.get(i12), e0Var);
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
            return C1737j.P(i10) + C1737j.y(l10);
        }
        return l10 + (size * C1737j.P(i10));
    }

    static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1750x) {
            C1750x xVar = (C1750x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.v(((Integer) list.get(i11)).intValue());
        }
        return i10;
    }

    static int m(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int n10 = n(list);
        if (z10) {
            return C1737j.P(i10) + C1737j.y(n10);
        }
        return n10 + (list.size() * C1737j.P(i10));
    }

    static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f10 = (F) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.x(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int o(int i10, Object obj, e0 e0Var) {
        return C1737j.z(i10, (O) obj, e0Var);
    }

    static int p(int i10, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P10 = C1737j.P(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            P10 += C1737j.B((O) list.get(i11), e0Var);
        }
        return P10;
    }

    static int q(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r10 = r(list);
        if (z10) {
            return C1737j.P(i10) + C1737j.y(r10);
        }
        return r10 + (size * C1737j.P(i10));
    }

    static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1750x) {
            C1750x xVar = (C1750x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.K(((Integer) list.get(i11)).intValue());
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
            return C1737j.P(i10) + C1737j.y(t10);
        }
        return t10 + (size * C1737j.P(i10));
    }

    static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f10 = (F) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.M(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static int u(int i10, List list) {
        int O10;
        int O11;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int P10 = C1737j.P(i10) * size;
        if (list instanceof D) {
            D d10 = (D) list;
            while (i11 < size) {
                Object s10 = d10.s(i11);
                if (s10 instanceof C1734g) {
                    O11 = C1737j.g((C1734g) s10);
                } else {
                    O11 = C1737j.O((String) s10);
                }
                P10 += O11;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof C1734g) {
                    O10 = C1737j.g((C1734g) obj);
                } else {
                    O10 = C1737j.O((String) obj);
                }
                P10 += O10;
                i11++;
            }
        }
        return P10;
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w10 = w(list);
        if (z10) {
            return C1737j.P(i10) + C1737j.y(w10);
        }
        return w10 + (size * C1737j.P(i10));
    }

    static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C1750x) {
            C1750x xVar = (C1750x) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.R(((Integer) list.get(i11)).intValue());
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
            return C1737j.P(i10) + C1737j.y(y10);
        }
        return y10 + (size * C1737j.P(i10));
    }

    static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof F) {
            F f10 = (F) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += C1737j.T(((Long) list.get(i11)).longValue());
        }
        return i10;
    }

    static Object z(int i10, List list, C1751y.a aVar, Object obj, l0 l0Var) {
        if (aVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                Integer num = (Integer) list.get(i12);
                int intValue = num.intValue();
                if (aVar.a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, num);
                    }
                    i11++;
                } else {
                    obj = K(i10, intValue, obj, l0Var);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue2)) {
                    obj = K(i10, intValue2, obj, l0Var);
                    it.remove();
                }
            }
        }
        return obj;
    }
}
