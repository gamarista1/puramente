package com.amazon.a.a.f;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.amazon.a.a.o.c;

public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private static final c f37167a = new c("ApplicationLifecycleObserver");

    /* renamed from: b  reason: collision with root package name */
    private static final String f37168b = a.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    private static final a f37169c = new a();

    private a() {
    }

    public static a a() {
        return f37169c;
    }

    private static boolean b() {
        return com.amazon.a.a.d();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!com.amazon.a.a.d()) {
            com.amazon.a.a.a((Context) activity.getApplication());
            f37167a.a("AppstoreSDK Re-initialized");
        }
        if (a("onCreate", activity)) {
            com.amazon.a.a.b().a(activity);
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnCreate Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    public void onActivityDestroyed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onDestroy", activity)) {
            try {
                com.amazon.a.a.b().b(activity);
            } catch (Exception e10) {
                f37167a.b("ActivityOnDestroy Error: ", e10);
            }
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnDestroy Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    public void onActivityPaused(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onPause", activity)) {
            com.amazon.a.a.b().d(activity);
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnPause Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    public void onActivityResumed(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onResume", activity)) {
            com.amazon.a.a.b().c(activity);
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnResume Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        c cVar = f37167a;
        cVar.a(f37168b + " onActivitySaveInstanceState " + activity.getLocalClassName());
    }

    public void onActivityStarted(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onStart", activity)) {
            com.amazon.a.a.b().e(activity);
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnStart Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    public void onActivityStopped(Activity activity) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a("onStop", activity)) {
            com.amazon.a.a.b().f(activity);
        }
        if (c.f37534a) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            c cVar = f37167a;
            cVar.a("ActivityOnStop Time: " + (elapsedRealtime2 - elapsedRealtime));
        }
    }

    private static boolean a(String str, Context context) {
        return com.amazon.a.a.a(str, context);
    }
}
