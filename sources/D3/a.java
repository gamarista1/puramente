package D3;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f1533a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f1534b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f1535c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f1536d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f1537e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f1535c == null) {
                f1535c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f1535c.invoke((Object) null, new Object[]{Long.valueOf(f1533a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(l(str));
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f1536d == null) {
                f1536d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f1536d.invoke((Object) null, new Object[]{Long.valueOf(f1533a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        if (Build.VERSION.SDK_INT >= 29) {
            return c.c();
        }
        return i();
    }

    private static boolean i() {
        Class<Trace> cls = Trace.class;
        try {
            if (f1534b == null) {
                f1533a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f1534b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f1534b.invoke((Object) null, new Object[]{Long.valueOf(f1533a)})).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f1537e == null) {
                f1537e = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f1537e.invoke((Object) null, new Object[]{Long.valueOf(f1533a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    private static String l(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }
}
