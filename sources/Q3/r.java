package Q3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C1836c;
import androidx.work.E;
import androidx.work.s;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5468a;

    static {
        String i10 = s.i("ProcessUtils");
        C6496s.g(i10, "tagWithPrefix(\"ProcessUtils\")");
        f5468a = i10;
    }

    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C1341a.f5451a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, E.class.getClassLoader()).getDeclaredMethod("currentProcessName", (Class[]) null);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, (Object[]) null);
            C6496s.e(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            s.e().b(f5468a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C6496s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, C1836c cVar) {
        C6496s.h(context, "context");
        C6496s.h(cVar, "configuration");
        String a10 = a(context);
        String c10 = cVar.c();
        if (c10 == null || c10.length() == 0) {
            return C6496s.c(a10, context.getApplicationInfo().processName);
        }
        return C6496s.c(a10, cVar.c());
    }
}
