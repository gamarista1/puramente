package io.intercom.android.sdk;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.api.DeDuper;
import io.intercom.android.sdk.errorreporting.ErrorReporter;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.IntercomRootActivity;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.m5.push.ConversationDeepLinkRouterKt;
import io.intercom.android.sdk.metrics.MetricsStore;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.push.IntercomLegacyPushClientHandler;
import io.intercom.android.sdk.push.SystemNotificationManager;
import io.intercom.android.sdk.sentry.SentrySessionManager;
import io.intercom.android.sdk.user.UserUpdaterHelper;
import io.intercom.android.sdk.utilities.SimpleActivityLifecycleCallbacks;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

class LifecycleTracker extends SimpleActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Provider<Api> apiProvider;
    private final IntercomDataLayer dataLayer;
    private final DeDuper deDuper;
    private final ErrorReporter errorReporter;
    private final ActivityLifecycleHandler handler;
    private final MetricsStore metricsStore;
    private final ResetManager resetManager;
    private final Set<Integer> startedActivities = new HashSet();
    private final SystemNotificationManager systemNotificationManager;
    private final TimeProvider timeProvider;
    private final Twig twig = LumberMill.getLogger();
    private final UserUpdaterHelper userUpdaterHelper;

    LifecycleTracker(SystemNotificationManager systemNotificationManager2, MetricsStore metricsStore2, ErrorReporter errorReporter2, DeDuper deDuper2, TimeProvider timeProvider2, ResetManager resetManager2, ActivityLifecycleHandler activityLifecycleHandler, Provider<Api> provider, IntercomDataLayer intercomDataLayer, UserUpdaterHelper userUpdaterHelper2) {
        this.systemNotificationManager = systemNotificationManager2;
        this.metricsStore = metricsStore2;
        this.errorReporter = errorReporter2;
        this.deDuper = deDuper2;
        this.timeProvider = timeProvider2;
        this.resetManager = resetManager2;
        this.handler = activityLifecycleHandler;
        this.apiProvider = provider;
        this.dataLayer = intercomDataLayer;
        this.userUpdaterHelper = userUpdaterHelper2;
    }

    static LifecycleTracker create(SystemNotificationManager systemNotificationManager2, MetricsStore metricsStore2, ErrorReporter errorReporter2, DeDuper deDuper2, TimeProvider timeProvider2, ResetManager resetManager2, float f10, Provider<Api> provider, IntercomDataLayer intercomDataLayer, UserUpdaterHelper userUpdaterHelper2) {
        IntercomDataLayer intercomDataLayer2 = intercomDataLayer;
        return new LifecycleTracker(systemNotificationManager2, metricsStore2, errorReporter2, deDuper2, timeProvider2, resetManager2, new ActivityLifecycleHandler(Looper.getMainLooper(), f10, intercomDataLayer2), provider, intercomDataLayer2, userUpdaterHelper2);
    }

    private void handleExtras(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID)) {
            String stringExtra = intent.getStringExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID);
            if (!TextUtils.isEmpty(stringExtra)) {
                Twig twig2 = this.twig;
                twig2.i("Activity started from Mobile Push: " + activity, new Object[0]);
                this.apiProvider.get().markPushAsOpened(stringExtra);
                Injector.get().getMetricTracker().openedPushOnlyNotification(stringExtra);
            }
            intent.removeExtra(ConversationDeepLinkRouterKt.INTERCOM_PUSH_INSTANCE_ID);
        }
    }

    private boolean hasApplicationBecomeBackgrounded(Activity activity) {
        if (!isApplicationInBackground(activity) || ((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded()) {
            return false;
        }
        return true;
    }

    private static boolean isScreenLocked(Context context) {
        return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
    }

    private void registerActivity(Activity activity) {
        this.startedActivities.add(Integer.valueOf(System.identityHashCode(activity)));
        Twig twig2 = this.twig;
        twig2.i("Started observing " + activity, new Object[0]);
    }

    private void unregisterActivity(Activity activity) {
        this.startedActivities.remove(Integer.valueOf(System.identityHashCode(activity)));
        Twig twig2 = this.twig;
        twig2.i("Stopped observing " + activity, new Object[0]);
    }

    /* access modifiers changed from: package-private */
    public boolean isApplicationInBackground(Activity activity) {
        if (isScreenLocked(activity) || (this.startedActivities.isEmpty() && !activity.isChangingConfigurations())) {
            return true;
        }
        return false;
    }

    public void onActivityPaused(Activity activity) {
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(2, activity));
    }

    public void onActivityResumed(Activity activity) {
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(0, activity));
        handleExtras(activity);
    }

    public void onActivityStarted(Activity activity) {
        registerActivity(activity);
        handleExtras(activity);
        if (((HostAppState) this.dataLayer.getHostAppState().getValue()).isBackgrounded()) {
            long currentTimeMillis = this.timeProvider.currentTimeMillis();
            this.userUpdaterHelper.update(currentTimeMillis);
            this.dataLayer.emitEvent(new IntercomEvent.AppEnteredForeground(currentTimeMillis));
            this.dataLayer.appEnteredForeground();
            this.metricsStore.loadAndSendMetrics();
            this.errorReporter.sendSavedReport();
            if (activity instanceof IntercomRootActivity) {
                IntercomLegacyPushClientHandler.Companion.clear(this.systemNotificationManager, activity);
            }
        }
        SentrySessionManager.INSTANCE.onActivityStarted(activity);
    }

    public void onActivityStopped(Activity activity) {
        unregisterActivity(activity);
        this.handler.removeMessages(1, activity);
        this.handler.sendMessage(ActivityLifecycleHandler.getMessage(3, activity));
        if (hasApplicationBecomeBackgrounded(activity)) {
            if (this.resetManager.isSoftReset()) {
                this.resetManager.hardReset();
            }
            long currentTimeMillis = this.timeProvider.currentTimeMillis();
            this.dataLayer.emitEvent(new IntercomEvent.AppEnteredBackground(currentTimeMillis));
            this.dataLayer.appEnteredBackground(currentTimeMillis);
            this.deDuper.reset();
            this.metricsStore.loadAndSendMetrics();
        }
        SentrySessionManager.INSTANCE.onActivityStopped(activity);
    }

    /* access modifiers changed from: package-private */
    public void registerActivities(Collection<Integer> collection) {
        this.startedActivities.addAll(collection);
    }
}
