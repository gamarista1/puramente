package androidx.core.app;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.C1886a;
import com.revenuecat.purchases.common.Constants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f15910c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f15911d;

    /* renamed from: e  reason: collision with root package name */
    private static Set f15912e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f15913f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static e f15914g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15915a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f15916b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannels(list);
        }
    }

    private static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final String f15917a;

        /* renamed from: b  reason: collision with root package name */
        final int f15918b;

        /* renamed from: c  reason: collision with root package name */
        final String f15919c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f15920d;

        c(String str, int i10, String str2, Notification notification) {
            this.f15917a = str;
            this.f15918b = i10;
            this.f15919c = str2;
            this.f15920d = notification;
        }

        public void a(C1886a aVar) {
            aVar.m1(this.f15917a, this.f15918b, this.f15919c, this.f15920d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f15917a + ", id:" + this.f15918b + ", tag:" + this.f15919c + "]";
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f15921a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f15922b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f15921a = componentName;
            this.f15922b = iBinder;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f15923a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f15924b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f15925c;

        /* renamed from: d  reason: collision with root package name */
        private final Map f15926d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set f15927e = new HashSet();

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f15928a;

            /* renamed from: b  reason: collision with root package name */
            boolean f15929b = false;

            /* renamed from: c  reason: collision with root package name */
            C1886a f15930c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque f15931d = new ArrayDeque();

            /* renamed from: e  reason: collision with root package name */
            int f15932e = 0;

            a(ComponentName componentName) {
                this.f15928a = componentName;
            }
        }

        e(Context context) {
            this.f15923a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f15924b = handlerThread;
            handlerThread.start();
            this.f15925c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f15929b) {
                return true;
            }
            boolean bindService = this.f15923a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f15928a), this, 33);
            aVar.f15929b = bindService;
            if (bindService) {
                aVar.f15932e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f15928a);
                this.f15923a.unbindService(this);
            }
            return aVar.f15929b;
        }

        private void b(a aVar) {
            if (aVar.f15929b) {
                this.f15923a.unbindService(this);
                aVar.f15929b = false;
            }
            aVar.f15930c = null;
        }

        private void c(f fVar) {
            j();
            for (a aVar : this.f15926d.values()) {
                aVar.f15931d.add(fVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = (a) this.f15926d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f15926d.get(componentName);
            if (aVar != null) {
                aVar.f15930c = C1886a.C0331a.a(iBinder);
                aVar.f15932e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = (a) this.f15926d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f15928a + ", " + aVar.f15931d.size() + " queued tasks");
            }
            if (!aVar.f15931d.isEmpty()) {
                if (!a(aVar) || aVar.f15930c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    f fVar = (f) aVar.f15931d.peek();
                    if (fVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + fVar);
                        }
                        fVar.a(aVar.f15930c);
                        aVar.f15931d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f15928a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f15928a, e10);
                    }
                }
                if (!aVar.f15931d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f15925c.hasMessages(3, aVar.f15928a)) {
                int i10 = aVar.f15932e;
                int i11 = i10 + 1;
                aVar.f15932e = i11;
                if (i11 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f15931d.size() + " tasks to " + aVar.f15928a + " after " + aVar.f15932e + " retries");
                    aVar.f15931d.clear();
                    return;
                }
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f15925c.sendMessageDelayed(this.f15925c.obtainMessage(3, aVar.f15928a), (long) i12);
            }
        }

        private void j() {
            Set g10 = r.g(this.f15923a);
            if (!g10.equals(this.f15927e)) {
                this.f15927e = g10;
                List<ResolveInfo> queryIntentServices = this.f15923a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (g10.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f15926d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f15926d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator it = this.f15926d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        b((a) entry.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(f fVar) {
            this.f15925c.obtainMessage(0, fVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            } else if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f15921a, dVar.f15922b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f15925c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f15925c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface f {
        void a(C1886a aVar);
    }

    private r(Context context) {
        this.f15915a = context;
        this.f15916b = (NotificationManager) context.getSystemService("notification");
    }

    public static r f(Context context) {
        return new r(context);
    }

    public static Set g(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f15910c) {
            if (string != null) {
                try {
                    if (!string.equals(f15911d)) {
                        String[] split = string.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f15912e = hashSet;
                        f15911d = string;
                    }
                } finally {
                }
            }
            set = f15912e;
        }
        return set;
    }

    private void j(f fVar) {
        synchronized (f15913f) {
            try {
                if (f15914g == null) {
                    f15914g = new e(this.f15915a.getApplicationContext());
                }
                f15914g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean k(Notification notification) {
        Bundle a10 = o.a(notification);
        if (a10 == null || !a10.getBoolean("android.support.useSideChannel")) {
            return false;
        }
        return true;
    }

    public boolean a() {
        return a.a(this.f15916b);
    }

    public void b(int i10) {
        c((String) null, i10);
    }

    public void c(String str, int i10) {
        this.f15916b.cancel(str, i10);
    }

    public void d() {
        this.f15916b.cancelAll();
    }

    public void e(List list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((n) it.next()).a());
            }
            b.a(this.f15916b, arrayList);
        }
    }

    public void h(int i10, Notification notification) {
        i((String) null, i10, notification);
    }

    public void i(String str, int i10, Notification notification) {
        if (k(notification)) {
            j(new c(this.f15915a.getPackageName(), i10, str, notification));
            this.f15916b.cancel(str, i10);
            return;
        }
        this.f15916b.notify(str, i10, notification);
    }
}
