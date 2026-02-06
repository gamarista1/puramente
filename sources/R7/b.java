package r7;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.I;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import q7.c;
import q7.k;
import t7.C4049a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f47985a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final int f47986b = Process.myUid();

    /* renamed from: c  reason: collision with root package name */
    private static final ScheduledExecutorService f47987c = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: d  reason: collision with root package name */
    private static String f47988d = "";

    /* renamed from: e  reason: collision with root package name */
    private static final Runnable f47989e = new C3980a();

    private b() {
    }

    /* access modifiers changed from: private */
    public static final void b() {
        Class<b> cls = b.class;
        if (!C4049a.d(cls)) {
            try {
                Object systemService = I.l().getSystemService("activity");
                C6496s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                c((ActivityManager) systemService);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void c(ActivityManager activityManager) {
        Class<b> cls = b.class;
        if (!C4049a.d(cls) && activityManager != null) {
            try {
                List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
                if (processesInErrorState != null) {
                    for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                        if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f47986b) {
                            Thread thread = Looper.getMainLooper().getThread();
                            C6496s.g(thread, "getMainLooper().thread");
                            String g10 = k.g(thread);
                            if (!C6496s.c(g10, f47988d)) {
                                if (k.k(thread)) {
                                    f47988d = g10;
                                    c.a.a(processErrorStateInfo.shortMsg, g10).g();
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void d() {
        Class<b> cls = b.class;
        if (!C4049a.d(cls)) {
            try {
                f47987c.scheduleWithFixedDelay(f47989e, 0, 500, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }
}
