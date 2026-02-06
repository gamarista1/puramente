package U5;

import android.util.Log;
import com.revenuecat.purchases.common.Constants;

public class b implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final b f34407c = new b();

    /* renamed from: a  reason: collision with root package name */
    private String f34408a = "unknown";

    /* renamed from: b  reason: collision with root package name */
    private int f34409b = 5;

    private b() {
    }

    public static b h() {
        return f34407c;
    }

    private static String j(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        return Log.getStackTraceString(th2);
    }

    private String k(String str) {
        if (this.f34408a == null) {
            return str;
        }
        return this.f34408a + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + str;
    }

    private void l(int i10, String str, String str2) {
        Log.println(i10, k(str), str2);
    }

    private void m(int i10, String str, String str2, Throwable th2) {
        Log.println(i10, k(str), i(str2, th2));
    }

    public void a(String str, String str2) {
        l(6, str, str2);
    }

    public void b(String str, String str2, Throwable th2) {
        m(3, str, str2, th2);
    }

    public void c(String str, String str2, Throwable th2) {
        m(5, str, str2, th2);
    }

    public void d(String str, String str2) {
        l(3, str, str2);
    }

    public void e(String str, String str2, Throwable th2) {
        m(6, str, str2, th2);
    }

    public void f(String str, String str2, Throwable th2) {
        m(6, str, str2, th2);
    }

    public boolean g(int i10) {
        if (this.f34409b <= i10) {
            return true;
        }
        return false;
    }

    public void i(String str, String str2) {
        l(4, str, str2);
    }

    public void v(String str, String str2) {
        l(2, str, str2);
    }

    public void w(String str, String str2) {
        l(5, str, str2);
    }

    private static String i(String str, Throwable th2) {
        return str + 10 + j(th2);
    }

    public void e(String str, String str2) {
        l(6, str, str2);
    }
}
