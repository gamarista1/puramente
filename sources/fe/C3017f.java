package Fe;

import Fe.C3016e;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* renamed from: Fe.f  reason: case insensitive filesystem */
class C3017f implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private int f31094a = 0;

    /* renamed from: b  reason: collision with root package name */
    private Set f31095b = new HashSet();

    C3017f() {
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        C3016e X10 = C3016e.X();
        if (X10 == null || X10.R() == null) {
            return false;
        }
        C3023l.l("activitiesOnStack_: " + this.f31095b + " Current Activity: " + X10.R());
        return this.f31095b.contains(X10.R().toString());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityCreated, activity = " + activity + " branch: " + X10 + " Activities on stack: " + this.f31095b);
        if (X10 != null) {
            X10.S0(C3016e.k.PENDING);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityDestroyed, activity = " + activity + " branch: " + X10);
        if (X10 != null) {
            if (X10.R() == activity) {
                X10.f31069p.clear();
            }
            this.f31095b.remove(activity.toString());
            C3023l.l("activitiesOnStack_: " + this.f31095b);
        }
    }

    public void onActivityPaused(Activity activity) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityPaused, activity = " + activity + " branch: " + X10);
        if (X10 != null) {
            if (X10.f0() != null) {
                X10.f0().p(true);
            }
            C3023l.l("activityCnt_: " + this.f31094a);
            C3023l.l("activitiesOnStack_: " + this.f31095b);
        }
    }

    public void onActivityResumed(Activity activity) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityResumed, activity = " + activity + " branch: " + X10);
        if (X10 != null) {
            boolean l10 = C3016e.l();
            C3023l.l("bypassIntentState: " + l10);
            if (!l10) {
                X10.z0(activity);
            }
            if (X10.V() == C3016e.n.UNINITIALISED && !C3016e.f31040D) {
                if (C3016e.b0() == null) {
                    C3023l.l("initializing session on user's behalf (onActivityResumed called but SESSION_STATE = UNINITIALISED)");
                    C3016e.H0(activity).c(true).b();
                } else {
                    C3023l.l("onActivityResumed called and SESSION_STATE = UNINITIALISED, however this is a " + C3016e.b0() + " plugin, so we are NOT initializing session on user's behalf");
                }
            }
            this.f31095b.add(activity.toString());
            C3023l.l("activityCnt_: " + this.f31094a);
            C3023l.l("activitiesOnStack_: " + this.f31095b);
        }
    }

    public void onActivityStarted(Activity activity) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityStarted, activity = " + activity + " branch: " + X10 + " Activities on stack: " + this.f31095b);
        if (X10 != null) {
            X10.f31069p = new WeakReference(activity);
            X10.S0(C3016e.k.PENDING);
            this.f31094a++;
        }
    }

    public void onActivityStopped(Activity activity) {
        C3016e X10 = C3016e.X();
        C3023l.l("onActivityStopped, activity = " + activity + " branch: " + X10);
        if (X10 != null) {
            this.f31094a--;
            C3023l.l("activityCnt_: " + this.f31094a);
            if (this.f31094a < 1) {
                X10.R0(false);
                X10.u();
                this.f31094a = 0;
                C3023l.l("activityCnt_: reset to 0");
            }
            C3023l.l("activitiesOnStack_: " + this.f31095b);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
