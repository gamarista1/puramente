package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lf.C6525i;
import yf.C6787a;
import yf.C6788b;
import yf.C6789c;
import yf.C6790d;
import yf.C6791e;
import yf.C6792f;
import yf.C6793g;
import yf.C6794h;
import yf.C6795i;
import yf.C6796j;
import yf.C6797k;
import yf.C6798l;
import yf.C6799m;
import yf.C6800n;
import yf.C6801o;
import yf.p;
import yf.q;
import yf.r;
import yf.s;
import yf.t;
import yf.u;
import yf.v;
import yf.w;
import zf.C6828a;
import zf.C6829b;
import zf.C6830c;
import zf.C6831d;
import zf.C6832e;
import zf.C6833f;

public abstract class V {
    public static Collection a(Object obj) {
        if ((obj instanceof C6828a) && !(obj instanceof C6829b)) {
            s(obj, "kotlin.collections.MutableCollection");
        }
        return g(obj);
    }

    public static Iterable b(Object obj) {
        if ((obj instanceof C6828a) && !(obj instanceof C6830c)) {
            s(obj, "kotlin.collections.MutableIterable");
        }
        return h(obj);
    }

    public static List c(Object obj) {
        if ((obj instanceof C6828a) && !(obj instanceof C6831d)) {
            s(obj, "kotlin.collections.MutableList");
        }
        return i(obj);
    }

    public static Map d(Object obj) {
        if ((obj instanceof C6828a) && !(obj instanceof C6832e)) {
            s(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Set e(Object obj) {
        if ((obj instanceof C6828a) && !(obj instanceof C6833f)) {
            s(obj, "kotlin.collections.MutableSet");
        }
        return k(obj);
    }

    public static Object f(Object obj, int i10) {
        if (obj != null && !m(obj, i10)) {
            s(obj, "kotlin.jvm.functions.Function" + i10);
        }
        return obj;
    }

    public static Collection g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Iterable h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static List i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static Set k(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e10) {
            throw r(e10);
        }
    }

    public static int l(Object obj) {
        if (obj instanceof C6492n) {
            return ((C6492n) obj).getArity();
        }
        if (obj instanceof C6787a) {
            return 0;
        }
        if (obj instanceof C6798l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof C6788b) {
            return 10;
        }
        if (obj instanceof C6789c) {
            return 11;
        }
        if (obj instanceof C6790d) {
            return 12;
        }
        if (obj instanceof C6791e) {
            return 13;
        }
        if (obj instanceof C6792f) {
            return 14;
        }
        if (obj instanceof C6793g) {
            return 15;
        }
        if (obj instanceof C6794h) {
            return 16;
        }
        if (obj instanceof C6795i) {
            return 17;
        }
        if (obj instanceof C6796j) {
            return 18;
        }
        if (obj instanceof C6797k) {
            return 19;
        }
        if (obj instanceof C6799m) {
            return 20;
        }
        if (obj instanceof C6800n) {
            return 21;
        }
        if (obj instanceof C6801o) {
            return 22;
        }
        return -1;
    }

    public static boolean m(Object obj, int i10) {
        if (!(obj instanceof C6525i) || l(obj) != i10) {
            return false;
        }
        return true;
    }

    public static boolean n(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof C6828a) && !(obj instanceof C6831d))) {
            return false;
        }
        return true;
    }

    public static boolean o(Object obj) {
        if (!(obj instanceof Map) || ((obj instanceof C6828a) && !(obj instanceof C6832e))) {
            return false;
        }
        return true;
    }

    public static boolean p(Object obj) {
        if (!(obj instanceof Set) || ((obj instanceof C6828a) && !(obj instanceof C6833f))) {
            return false;
        }
        return true;
    }

    private static Throwable q(Throwable th2) {
        return C6496s.n(th2, V.class.getName());
    }

    public static ClassCastException r(ClassCastException classCastException) {
        throw ((ClassCastException) q(classCastException));
    }

    public static void s(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        t(str2 + " cannot be cast to " + str);
    }

    public static void t(String str) {
        throw r(new ClassCastException(str));
    }
}
