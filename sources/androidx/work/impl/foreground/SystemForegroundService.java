package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C1802z;
import androidx.work.impl.foreground.b;
import androidx.work.s;

public class SystemForegroundService extends C1802z implements b.C0322b {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final String f18904f = s.i("SystemFgService");

    /* renamed from: g  reason: collision with root package name */
    private static SystemForegroundService f18905g = null;

    /* renamed from: b  reason: collision with root package name */
    private Handler f18906b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18907c;

    /* renamed from: d  reason: collision with root package name */
    b f18908d;

    /* renamed from: e  reason: collision with root package name */
    NotificationManager f18909e;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f18910a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f18911b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18912c;

        a(int i10, Notification notification, int i11) {
            this.f18910a = i10;
            this.f18911b = notification;
            this.f18912c = i11;
        }

        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f18910a, this.f18911b, this.f18912c);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f18910a, this.f18911b, this.f18912c);
            } else {
                SystemForegroundService.this.startForeground(this.f18910a, this.f18911b);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f18914a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Notification f18915b;

        b(int i10, Notification notification) {
            this.f18914a = i10;
            this.f18915b = notification;
        }

        public void run() {
            SystemForegroundService.this.f18909e.notify(this.f18914a, this.f18915b);
        }
    }

    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f18917a;

        c(int i10) {
            this.f18917a = i10;
        }

        public void run() {
            SystemForegroundService.this.f18909e.cancel(this.f18917a);
        }
    }

    static class d {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    static class e {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                s.e().l(SystemForegroundService.f18904f, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                s.e().l(SystemForegroundService.f18904f, "Unable to start foreground service", e11);
            }
        }
    }

    private void f() {
        this.f18906b = new Handler(Looper.getMainLooper());
        this.f18909e = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f18908d = bVar;
        bVar.n(this);
    }

    public void a(int i10, Notification notification) {
        this.f18906b.post(new b(i10, notification));
    }

    public void c(int i10, int i11, Notification notification) {
        this.f18906b.post(new a(i10, notification, i11));
    }

    public void d(int i10) {
        this.f18906b.post(new c(i10));
    }

    public void onCreate() {
        super.onCreate();
        f18905g = this;
        f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f18908d.l();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f18907c) {
            s.e().f(f18904f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f18908d.l();
            f();
            this.f18907c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f18908d.m(intent);
        return 3;
    }

    public void stop() {
        this.f18907c = true;
        s.e().a(f18904f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f18905g = null;
        stopSelf();
    }
}
