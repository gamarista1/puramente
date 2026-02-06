package Da;

import Ea.n;
import Ga.C4293e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.A0;
import com.google.android.gms.common.internal.C4536s;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: Da.b  reason: case insensitive filesystem */
public class C4250b {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f50419b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile C4250b f50420c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f50421a = new ConcurrentHashMap();

    private C4250b() {
    }

    public static C4250b b() {
        if (f50420c == null) {
            synchronized (f50419b) {
                try {
                    if (f50420c == null) {
                        f50420c = new C4250b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C4250b bVar = f50420c;
        C4536s.l(bVar);
        return bVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C4293e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f50421a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h10 = h(context, intent, serviceConnection, i10, executor);
            if (h10) {
                return h10;
            }
            return false;
        } finally {
            this.f50421a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof A0)) {
            return true;
        }
        return false;
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        if (!n.j() || executor == null) {
            return context.bindService(intent, serviceConnection, i10);
        }
        return context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, (Executor) null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f50421a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f50421a.get(serviceConnection));
        } finally {
            this.f50421a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
