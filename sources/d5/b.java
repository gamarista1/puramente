package D5;

import D5.u;
import F5.k;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.facebook.I;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30400a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String f30401b = b.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f30402c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f30403d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f30404e;

    /* renamed from: f  reason: collision with root package name */
    private static ServiceConnection f30405f;

    /* renamed from: g  reason: collision with root package name */
    private static Application.ActivityLifecycleCallbacks f30406g;

    /* renamed from: h  reason: collision with root package name */
    private static Intent f30407h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static Object f30408i;

    /* renamed from: j  reason: collision with root package name */
    private static u.a f30409j;

    public static final class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6496s.h(componentName, "name");
            C6496s.h(iBinder, "service");
            b bVar = b.f30400a;
            b.f30408i = q.a(I.l(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6496s.h(componentName, "name");
        }
    }

    /* renamed from: D5.b$b  reason: collision with other inner class name */
    public static final class C0503b implements Application.ActivityLifecycleCallbacks {
        C0503b() {
        }

        /* access modifiers changed from: private */
        public static final void c() {
            Context l10 = I.l();
            ArrayList i10 = q.i(l10, b.f30408i);
            b bVar = b.f30400a;
            bVar.f(l10, i10, false);
            bVar.f(l10, q.j(l10, b.f30408i), true);
        }

        /* access modifiers changed from: private */
        public static final void d() {
            Context l10 = I.l();
            ArrayList i10 = q.i(l10, b.f30408i);
            if (i10.isEmpty()) {
                i10 = q.g(l10, b.f30408i);
            }
            b.f30400a.f(l10, i10, false);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            C6496s.h(activity, "activity");
            try {
                I.t().execute(new d());
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C6496s.h(activity, "activity");
            C6496s.h(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C6496s.h(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C6496s.h(activity, "activity");
            try {
                if (C6496s.c(b.f30404e, Boolean.TRUE) && C6496s.c(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    I.t().execute(new c());
                }
            } catch (Exception unused) {
            }
        }
    }

    private b() {
    }

    private final void e() {
        boolean z10;
        if (f30403d == null) {
            boolean z11 = false;
            if (u.a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            f30403d = valueOf;
            if (!C6496s.c(valueOf, Boolean.FALSE)) {
                if (u.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
                    z11 = true;
                }
                f30404e = Boolean.valueOf(z11);
                q.b();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                C6496s.g(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                f30407h = intent;
                f30405f = new a();
                f30406g = new C0503b();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void f(Context context, ArrayList arrayList, boolean z10) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    C6496s.g(string, "sku");
                    C6496s.g(str, "purchase");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e10) {
                    Log.e(f30401b, "Error parsing in-app purchase data.", e10);
                }
            }
            for (Map.Entry entry : q.k(context, arrayList2, f30408i, z10).entrySet()) {
                String str2 = (String) entry.getValue();
                String str3 = (String) hashMap.get((String) entry.getKey());
                if (str3 != null) {
                    k.k(str3, str2, z10, f30409j, false, 16, (Object) null);
                }
            }
        }
    }

    public static final void g(u.a aVar) {
        C6496s.h(aVar, "billingClientVersion");
        b bVar = f30400a;
        bVar.e();
        if (!C6496s.c(f30403d, Boolean.FALSE) && k.g()) {
            f30409j = aVar;
            bVar.h();
        }
    }

    private final void h() {
        if (f30402c.compareAndSet(false, true)) {
            Context l10 = I.l();
            if (l10 instanceof Application) {
                Application application = (Application) l10;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f30406g;
                ServiceConnection serviceConnection = null;
                if (activityLifecycleCallbacks == null) {
                    C6496s.v("callbacks");
                    activityLifecycleCallbacks = null;
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f30407h;
                if (intent == null) {
                    C6496s.v("intent");
                    intent = null;
                }
                ServiceConnection serviceConnection2 = f30405f;
                if (serviceConnection2 == null) {
                    C6496s.v("serviceConnection");
                } else {
                    serviceConnection = serviceConnection2;
                }
                l10.bindService(intent, serviceConnection, 1);
            }
        }
    }
}
