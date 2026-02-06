package H5;

import A7.a;
import F5.h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.I;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import o7.C3900p;
import o7.W;
import t7.C4049a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f31696a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final String f31697b = e.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f31698c;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: a  reason: collision with root package name */
        private final String f31702a;

        private a(String str) {
            this.f31702a = str;
        }

        public String toString() {
            return this.f31702a;
        }
    }

    private static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f31703a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        private IBinder f31704b;

        public final IBinder a() {
            this.f31703a.await(5, TimeUnit.SECONDS);
            return this.f31704b;
        }

        public void onNullBinding(ComponentName componentName) {
            C6496s.h(componentName, "name");
            this.f31703a.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6496s.h(componentName, "name");
            C6496s.h(iBinder, "serviceBinder");
            this.f31704b = iBinder;
            this.f31703a.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6496s.h(componentName, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    private e() {
    }

    private final Intent a(Context context) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C3900p.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C3900p.a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final boolean b() {
        boolean z10;
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            if (f31698c == null) {
                if (f31696a.a(I.l()) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f31698c = Boolean.valueOf(z10);
            }
            Boolean bool = f31698c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    public static final c c(String str, List list) {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "applicationId");
            C6496s.h(list, "appEvents");
            return f31696a.d(a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final c d(a aVar, String str, List list) {
        Context l10;
        b bVar;
        String str2;
        c cVar;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            h.b();
            l10 = I.l();
            Intent a10 = a(l10);
            if (a10 == null) {
                return cVar2;
            }
            bVar = new b();
            if (!l10.bindService(a10, bVar, 1)) {
                return c.SERVICE_ERROR;
            }
            try {
                IBinder a11 = bVar.a();
                if (a11 != null) {
                    A7.a a12 = a.C0496a.a(a11);
                    Bundle a13 = d.a(aVar, str, list);
                    if (a13 != null) {
                        a12.f(a13);
                        String str3 = f31697b;
                        W.l0(str3, "Successfully sent events to the remote service: " + a13);
                    }
                    cVar2 = c.OPERATION_SUCCESS;
                }
                l10.unbindService(bVar);
                W.l0(f31697b, "Unbound from the remote service");
                return cVar2;
            } catch (InterruptedException e10) {
                cVar = c.SERVICE_ERROR;
                str2 = f31697b;
                W.k0(str2, e10);
                l10.unbindService(bVar);
                W.l0(str2, "Unbound from the remote service");
                return cVar;
            } catch (RemoteException e11) {
                cVar = c.SERVICE_ERROR;
                str2 = f31697b;
                W.k0(str2, e11);
                l10.unbindService(bVar);
                W.l0(str2, "Unbound from the remote service");
                return cVar;
            }
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    public static final c e(String str) {
        Class<e> cls = e.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "applicationId");
            return f31696a.d(a.MOBILE_APP_INSTALL, str, C6565s.n());
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }
}
