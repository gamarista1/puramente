package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b  reason: collision with root package name */
    private static AtomicInteger f72478b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    private static a f72479c;

    /* renamed from: a  reason: collision with root package name */
    private b f72480a;

    private a() {
    }

    public static a a() {
        if (f72479c == null) {
            f72479c = new a();
        }
        return f72479c;
    }

    public void b(b bVar) {
        this.f72480a = bVar;
        if (f72478b.get() == 1) {
            this.f72480a.start();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivityCreated");
    }

    public void onActivityDestroyed(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityDestroyed");
        if (f72478b.get() == 0 && (bVar = this.f72480a) != null) {
            bVar.release();
        }
    }

    public void onActivityPaused(Activity activity) {
        Log.d("OrientationModule", "onActivityPaused");
    }

    public void onActivityResumed(Activity activity) {
        Log.d("OrientationModule", "onActivityResumed");
        if (f72478b.incrementAndGet() == 1 && this.f72480a != null) {
            Log.d("OrientationModule", "Start orientation");
            this.f72480a.start();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity) {
        Log.d("OrientationModule", "onActivityStarted");
    }

    public void onActivityStopped(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityStopped");
        if (f72478b.decrementAndGet() == 0 && (bVar = this.f72480a) != null) {
            bVar.stop();
        }
    }
}
