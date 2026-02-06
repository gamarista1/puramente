package H4;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import u4.C4065e;
import u4.Q;

public class e implements Q {

    /* renamed from: a  reason: collision with root package name */
    private static final Set f31658a = new HashSet();

    public void a(String str, Throwable th2) {
        if (C4065e.f48481a) {
            Log.d("LOTTIE", str, th2);
        }
    }

    public void b(String str) {
        d(str, (Throwable) null);
    }

    public void c(String str) {
        e(str, (Throwable) null);
    }

    public void d(String str, Throwable th2) {
        Set set = f31658a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th2);
            set.add(str);
        }
    }

    public void e(String str, Throwable th2) {
        if (C4065e.f48481a) {
            Log.d("LOTTIE", str, th2);
        }
    }
}
