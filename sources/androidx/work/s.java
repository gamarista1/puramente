package androidx.work;

import android.util.Log;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f19028a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile s f19029b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final int f19030c = 20;

    public static class a extends s {

        /* renamed from: d  reason: collision with root package name */
        private final int f19031d;

        public a(int i10) {
            super(i10);
            this.f19031d = i10;
        }

        public void a(String str, String str2) {
            if (this.f19031d <= 3) {
                Log.d(str, str2);
            }
        }

        public void b(String str, String str2, Throwable th2) {
            if (this.f19031d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        public void c(String str, String str2) {
            if (this.f19031d <= 6) {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable th2) {
            if (this.f19031d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        public void f(String str, String str2) {
            if (this.f19031d <= 4) {
                Log.i(str, str2);
            }
        }

        public void g(String str, String str2, Throwable th2) {
            if (this.f19031d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        public void j(String str, String str2) {
            if (this.f19031d <= 2) {
                Log.v(str, str2);
            }
        }

        public void k(String str, String str2) {
            if (this.f19031d <= 5) {
                Log.w(str, str2);
            }
        }

        public void l(String str, String str2, Throwable th2) {
            if (this.f19031d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public s(int i10) {
    }

    public static s e() {
        s sVar;
        synchronized (f19028a) {
            try {
                if (f19029b == null) {
                    f19029b = new a(3);
                }
                sVar = f19029b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public static void h(s sVar) {
        synchronized (f19028a) {
            f19029b = sVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f19030c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
