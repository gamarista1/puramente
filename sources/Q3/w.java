package Q3;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5482a;

    static {
        String i10 = s.i("WakeLocks");
        C6496s.g(i10, "tagWithPrefix(\"WakeLocks\")");
        f5482a = i10;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x xVar = x.f5483a;
        synchronized (xVar) {
            linkedHashMap.putAll(xVar.a());
            C6514M m10 = C6514M.f71813a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                s e10 = s.e();
                String str2 = f5482a;
                e10.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        C6496s.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        x xVar = x.f5483a;
        synchronized (xVar) {
            String str3 = (String) xVar.a().put(newWakeLock, str2);
        }
        C6496s.g(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
