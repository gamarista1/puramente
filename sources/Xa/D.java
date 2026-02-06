package xa;

import Fa.C4287b;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class D {

    /* renamed from: e  reason: collision with root package name */
    private static D f62141e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f62142a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f62143b;

    /* renamed from: c  reason: collision with root package name */
    private x f62144c = new x(this, (w) null);

    /* renamed from: d  reason: collision with root package name */
    private int f62145d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f62143b = scheduledExecutorService;
        this.f62142a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        D d10;
        synchronized (D.class) {
            try {
                if (f62141e == null) {
                    zze.zza();
                    f62141e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C4287b("MessengerIpcClient"))));
                }
                d10 = f62141e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return d10;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f62145d;
        this.f62145d = i10 + 1;
        return i10;
    }

    private final synchronized Task g(C5267A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f62144c.g(a10)) {
                x xVar = new x(this, (w) null);
                this.f62144c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return a10.f62138b.getTask();
    }

    public final Task c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final Task d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}
