package kotlin.jvm.internal;

import java.util.Arrays;
import lf.C6513L;

/* renamed from: kotlin.jvm.internal.s  reason: case insensitive filesystem */
public abstract class C6496s {

    /* renamed from: kotlin.jvm.internal.s$a */
    public static class a {
    }

    public static boolean a(Double d10, Double d11) {
        if (d10 == null) {
            if (d11 != null) {
                return false;
            }
        } else if (d11 == null || d10.doubleValue() != d11.doubleValue()) {
            return false;
        }
        return true;
    }

    public static boolean b(Float f10, float f11) {
        if (f10 == null || f10.floatValue() != f11) {
            return false;
        }
        return true;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            p();
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            q(str);
        }
    }

    public static void g(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m(new NullPointerException(str + " must not be null")));
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            r(str);
        }
    }

    public static int i(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int j(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String k(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C6496s.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void l(int i10, String str) {
        s();
    }

    private static Throwable m(Throwable th2) {
        return n(th2, C6496s.class.getName());
    }

    static Throwable n(Throwable th2, String str) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        th2.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return th2;
    }

    public static String o(String str, Object obj) {
        return str + obj;
    }

    public static void p() {
        throw ((NullPointerException) m(new NullPointerException()));
    }

    public static void q(String str) {
        throw ((NullPointerException) m(new NullPointerException(str)));
    }

    private static void r(String str) {
        throw ((NullPointerException) m(new NullPointerException(k(str))));
    }

    public static void s() {
        t("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void t(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void u(String str) {
        throw ((C6513L) m(new C6513L(str)));
    }

    public static void v(String str) {
        u("lateinit property " + str + " has not been initialized");
    }
}
