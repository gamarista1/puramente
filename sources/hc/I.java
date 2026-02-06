package Hc;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;

public final class I implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static final I f50952a = new I();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f50953b;

    /* renamed from: c  reason: collision with root package name */
    private static E f50954c;

    private I() {
    }

    public final void a(E e10) {
        f50954c = e10;
        if (e10 != null && f50953b) {
            f50953b = false;
            e10.i();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C6496s.h(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C6496s.h(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C6496s.h(activity, "activity");
        E e10 = f50954c;
        if (e10 != null) {
            e10.f();
        }
    }

    public void onActivityResumed(Activity activity) {
        C6514M m10;
        C6496s.h(activity, "activity");
        E e10 = f50954c;
        if (e10 != null) {
            e10.i();
            m10 = C6514M.f71813a;
        } else {
            m10 = null;
        }
        if (m10 == null) {
            f50953b = true;
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
    }
}
