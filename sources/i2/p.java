package i2;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f22143a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f22144b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f22145c = true;

    /* renamed from: d  reason: collision with root package name */
    private static a f22146d = a.f22147a;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f22147a = new C0358a();

        /* renamed from: i2.p$a$a  reason: collision with other inner class name */
        class C0358a implements a {
            C0358a() {
            }

            public void a(String str, String str2, Throwable th2) {
                Log.i(str, p.a(str2, th2));
            }

            public void b(String str, String str2, Throwable th2) {
                Log.d(str, p.a(str2, th2));
            }

            public void c(String str, String str2, Throwable th2) {
                Log.w(str, p.a(str2, th2));
            }

            public void e(String str, String str2, Throwable th2) {
                Log.e(str, p.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void e(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String e10 = e(th2);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + 10;
    }

    public static void b(String str, String str2) {
        synchronized (f22143a) {
            try {
                if (f22144b == 0) {
                    f22146d.b(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f22143a) {
            try {
                if (f22144b <= 3) {
                    f22146d.e(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f22143a) {
            try {
                if (f22144b <= 3) {
                    f22146d.e(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f22143a) {
            try {
                if (g(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (!f22145c) {
                    String message = th2.getMessage();
                    return message;
                }
                String replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                return replace;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f22143a) {
            try {
                if (f22144b <= 1) {
                    f22146d.a(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f22143a) {
            try {
                if (f22144b <= 2) {
                    f22146d.c(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        synchronized (f22143a) {
            try {
                if (f22144b <= 2) {
                    f22146d.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
