package O3;

import M3.c;
import Q3.m;
import Q3.n;
import R3.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.s;
import kotlin.jvm.internal.C6496s;
import t1.C2611a;

public abstract class k {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f4749a;

    static {
        String i10 = s.i("NetworkStateTracker");
        C6496s.g(i10, "tagWithPrefix(\"NetworkStateTracker\")");
        f4749a = i10;
    }

    public static final h a(Context context, b bVar) {
        C6496s.h(context, "context");
        C6496s.h(bVar, "taskExecutor");
        return new j(context, bVar);
    }

    public static final c c(ConnectivityManager connectivityManager) {
        boolean z10;
        C6496s.h(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = false;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean d10 = d(connectivityManager);
        boolean a10 = C2611a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z11 = true;
        }
        return new c(z10, d10, a10, z11);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        C6496s.h(connectivityManager, "<this>");
        try {
            NetworkCapabilities a10 = m.a(connectivityManager, n.a(connectivityManager));
            if (a10 != null) {
                return m.b(a10, 16);
            }
            return false;
        } catch (SecurityException e10) {
            s.e().d(f4749a, "Unable to validate active network", e10);
            return false;
        }
    }
}
