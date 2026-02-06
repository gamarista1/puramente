package Hc;

import Ea.o;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f51047a = new w();

    private w() {
    }

    private final u a(String str, int i10, int i11, boolean z10) {
        return new u(str, i10, i11, z10);
    }

    static /* synthetic */ u b(w wVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            z10 = false;
        }
        return wVar.a(str, i10, i11, z10);
    }

    public final List c(Context context) {
        ActivityManager activityManager;
        C6496s.h(context, "context");
        int i10 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = C6565s.n();
        }
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList<>();
        for (Object next : C6565s.l0(list)) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6565s.y(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            C6496s.g(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new u(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, C6496s.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public final u d(Context context) {
        Object obj;
        C6496s.h(context, "context");
        int myPid = Process.myPid();
        Iterator it = c(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u) obj).b() == myPid) {
                break;
            }
        }
        u uVar = (u) obj;
        if (uVar != null) {
            return uVar;
        }
        return b(this, e(), myPid, 0, false, 12, (Object) null);
    }

    public final String e() {
        String a10;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            String a11 = Process.myProcessName();
            C6496s.g(a11, "myProcessName()");
            return a11;
        } else if (i10 >= 28 && (a10 = Application.getProcessName()) != null) {
            return a10;
        } else {
            String a12 = o.a();
            if (a12 != null) {
                return a12;
            }
            return "";
        }
    }
}
