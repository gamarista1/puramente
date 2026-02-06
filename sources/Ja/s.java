package ja;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f45052a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f45053b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f45054c = true;

    /* renamed from: d  reason: collision with root package name */
    private static a f45055d = a.f45056a;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45056a = new C0689a();

        /* renamed from: ja.s$a$a  reason: collision with other inner class name */
        class C0689a implements a {
            C0689a() {
            }

            public void a(String str, String str2) {
                Log.e(str, str2);
            }

            public void d(String str, String str2) {
                Log.d(str, str2);
            }

            public void i(String str, String str2) {
                Log.i(str, str2);
            }

            public void w(String str, String str2) {
                Log.w(str, str2);
            }
        }

        void a(String str, String str2);

        void d(String str, String str2);

        void i(String str, String str2);

        void w(String str, String str2);
    }

    private static String a(String str, Throwable th2) {
        String e10 = e(th2);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + 10;
    }

    public static void b(String str, String str2) {
        synchronized (f45052a) {
            try {
                if (f45053b == 0) {
                    f45055d.d(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f45052a) {
            try {
                if (f45053b <= 3) {
                    f45055d.a(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        c(str, a(str2, th2));
    }

    public static String e(Throwable th2) {
        synchronized (f45052a) {
            if (th2 == null) {
                try {
                    return null;
                } catch (Throwable th3) {
                    throw th3;
                }
            } else if (h(th2)) {
                return "UnknownHostException (no network)";
            } else {
                if (!f45054c) {
                    String message = th2.getMessage();
                    return message;
                }
                String replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                return replace;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f45052a) {
            try {
                if (f45053b <= 1) {
                    f45055d.i(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void g(String str, String str2, Throwable th2) {
        f(str, a(str2, th2));
    }

    private static boolean h(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f45052a) {
            try {
                if (f45053b <= 2) {
                    f45055d.w(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        i(str, a(str2, th2));
    }
}
