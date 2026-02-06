package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C6496s;

/* renamed from: androidx.lifecycle.h  reason: case insensitive filesystem */
public abstract class C1785h implements Application.ActivityLifecycleCallbacks {
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
    }
}
