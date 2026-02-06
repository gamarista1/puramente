package com.google.android.gms.common.api.internal;

import Ea.n;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.common.api.internal.c  reason: case insensitive filesystem */
public final class C4491c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e  reason: collision with root package name */
    private static final C4491c f54006e = new C4491c();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f54007a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f54008b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f54009c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f54010d = false;

    /* renamed from: com.google.android.gms.common.api.internal.c$a */
    public interface a {
        void a(boolean z10);
    }

    private C4491c() {
    }

    public static C4491c b() {
        return f54006e;
    }

    public static void c(Application application) {
        C4491c cVar = f54006e;
        synchronized (cVar) {
            try {
                if (!cVar.f54010d) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f54010d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f54006e) {
            try {
                Iterator it = this.f54009c.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f54006e) {
            this.f54009c.add(aVar);
        }
    }

    public boolean d() {
        return this.f54007a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f54008b.get()) {
            if (!n.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f54008b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f54007a.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f54008b;
        boolean compareAndSet = this.f54007a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f54008b;
        boolean compareAndSet = this.f54007a.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f54007a.compareAndSet(false, true)) {
            this.f54008b.set(true);
            f(true);
        }
    }
}
