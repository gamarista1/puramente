package t7;

import android.os.Handler;
import android.os.Looper;
import com.facebook.I;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C6496s;
import q7.b;
import q7.c;

/* renamed from: t7.a  reason: case insensitive filesystem */
public final class C4049a {

    /* renamed from: a  reason: collision with root package name */
    public static final C4049a f48283a = new C4049a();

    /* renamed from: b  reason: collision with root package name */
    private static final Set f48284b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f48285c;

    /* renamed from: t7.a$a  reason: collision with other inner class name */
    public static final class C0730a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f48286a;

        C0730a(Throwable th2) {
            this.f48286a = th2;
        }

        public void run() {
            throw new RuntimeException(this.f48286a);
        }
    }

    private C4049a() {
    }

    public static final void a() {
        f48285c = true;
    }

    public static final void b(Throwable th2, Object obj) {
        C6496s.h(obj, "o");
        if (f48285c) {
            f48284b.add(obj);
            if (I.p()) {
                b.c(th2);
                c.a.b(th2, c.C0718c.CrashShield).g();
            }
            e(th2);
        }
    }

    public static final boolean c() {
        return false;
    }

    public static final boolean d(Object obj) {
        C6496s.h(obj, "o");
        return f48284b.contains(obj);
    }

    public static final void e(Throwable th2) {
        if (c()) {
            new Handler(Looper.getMainLooper()).post(new C0730a(th2));
        }
    }
}
