package io.intercom.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Set;

public class LateInitializationPreparer extends SimpleActivityLifecycleCallbacks {
    @SuppressLint({"StaticFieldLeak"})
    private static LateInitializationPreparer instance;
    private boolean hasPaused;
    private boolean isRegistered;
    private Activity lastResumedActivity;
    private final Set<Integer> startedActivities = new HashSet();
    private final Twig twig = LumberMill.getLogger();

    public static LateInitializationPreparer getInstance() {
        if (instance == null) {
            instance = new LateInitializationPreparer();
        }
        return instance;
    }

    public void handlePastLifecycleEvents(Application application, Injector injector) {
        Activity activity = this.lastResumedActivity;
        boolean z10 = this.hasPaused;
        Set<Integer> set = this.startedActivities;
        unregister(application);
        if (activity != null) {
            Twig twig2 = this.twig;
            twig2.i("Handling lifecycle events for " + activity + " during late initialisation", new Object[0]);
            LifecycleTracker lifecycleTracker = injector.getLifecycleTracker();
            lifecycleTracker.onActivityStarted(activity);
            lifecycleTracker.onActivityResumed(activity);
            if (z10) {
                lifecycleTracker.onActivityPaused(activity);
            }
        }
        if (!set.isEmpty()) {
            injector.getLifecycleTracker().registerActivities(set);
            Twig twig3 = this.twig;
            twig3.i("Observed Activities with hashcodes " + set + " during late initialization", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean hasPaused() {
        return this.hasPaused;
    }

    /* access modifiers changed from: package-private */
    public Activity lastResumedActivity() {
        return this.lastResumedActivity;
    }

    public void onActivityPaused(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        this.hasPaused = true;
    }

    public void onActivityResumed(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        this.lastResumedActivity = activity;
        this.hasPaused = false;
    }

    public void onActivityStarted(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
    }

    public void onActivityStopped(Activity activity) {
        this.startedActivities.remove(Integer.valueOf(System.identityHashCode(activity)));
        if (activity == this.lastResumedActivity) {
            this.lastResumedActivity = null;
        }
    }

    public void register(Application application) {
        this.twig.i("Registering for later initialization", new Object[0]);
        synchronized (this) {
            try {
                if (!this.isRegistered) {
                    application.registerActivityLifecycleCallbacks(this);
                    this.isRegistered = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Set<Integer> startedActivities() {
        return this.startedActivities;
    }

    public void unregister(Application application) {
        this.twig.i("Unregistering for later initialization", new Object[0]);
        application.unregisterActivityLifecycleCallbacks(this);
        this.isRegistered = false;
        this.lastResumedActivity = null;
        this.hasPaused = false;
    }
}
