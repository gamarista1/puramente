package M6;

import java.util.HashMap;
import java.util.Map;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static Object f32610a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static Object f32611b = new b();

    private static class b {
        private b() {
        }
    }

    private static class c {
        private c() {
        }
    }

    public static Object a(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey(str)) {
            return d();
        }
        Object obj2 = hashMap.get(str);
        if (obj2 == null) {
            return b();
        }
        return obj2;
    }

    public static Object b() {
        return f32611b;
    }

    public static void c(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object d() {
        return f32610a;
    }

    public static boolean e(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double f(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map g(Object obj) {
        return (HashMap) obj;
    }

    public static String h(Object obj) {
        return (String) obj;
    }

    public static boolean i(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean j(Object obj) {
        return obj instanceof b;
    }

    public static boolean k(Object obj) {
        return obj instanceof Double;
    }

    public static boolean l(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean m(Object obj) {
        return obj instanceof String;
    }

    public static boolean n(Object obj) {
        return obj instanceof c;
    }

    public static Object o(boolean z10) {
        return Boolean.valueOf(z10);
    }

    public static Object p(double d10) {
        return Double.valueOf(d10);
    }

    public static Object q() {
        return new HashMap();
    }

    public static Object r(String str) {
        return str;
    }
}
