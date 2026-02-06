package Y;

import androidx.collection.K;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.V;
import mf.C6565s;

/* renamed from: Y.q0  reason: case insensitive filesystem */
final class C1509q0 {

    /* renamed from: a  reason: collision with root package name */
    private final K f10108a;

    private /* synthetic */ C1509q0(K k10) {
        this.f10108a = k10;
    }

    public static final /* synthetic */ C1509q0 a(K k10) {
        return new C1509q0(k10);
    }

    public static boolean c(K k10, Object obj) {
        if ((obj instanceof C1509q0) && C6496s.c(k10, ((C1509q0) obj).h())) {
            return true;
        }
        return false;
    }

    public static int d(K k10) {
        return k10.hashCode();
    }

    public static final Object e(K k10, Object obj) {
        Object b10 = k10.b(obj);
        if (b10 == null) {
            return null;
        }
        if (V.n(b10)) {
            List c10 = V.c(b10);
            Object remove = c10.remove(0);
            if (c10.isEmpty()) {
                k10.o(obj);
            }
            b10 = remove;
        } else {
            k10.o(obj);
        }
        C6496s.f(b10, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return b10;
    }

    public static final void f(K k10, Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        int k11 = k10.k(obj);
        if (k11 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj3 = null;
        } else {
            obj3 = k10.f12125c[k11];
        }
        if (obj3 != null) {
            if (V.n(obj3)) {
                C6496s.f(obj3, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List c10 = V.c(obj3);
                c10.add(obj2);
                obj2 = c10;
            } else {
                obj2 = C6565s.t(obj3, obj2);
            }
        }
        if (z10) {
            int i10 = ~k11;
            k10.f12124b[i10] = obj;
            k10.f12125c[i10] = obj2;
            return;
        }
        k10.f12125c[k11] = obj2;
    }

    public static String g(K k10) {
        return "MutableScatterMultiMap(map=" + k10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f10108a, obj);
    }

    public final /* synthetic */ K h() {
        return this.f10108a;
    }

    public int hashCode() {
        return d(this.f10108a);
    }

    public String toString() {
        return g(this.f10108a);
    }

    public static K b(K k10) {
        return k10;
    }
}
