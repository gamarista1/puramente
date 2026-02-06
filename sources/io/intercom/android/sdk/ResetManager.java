package io.intercom.android.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.UnreadConversationsTracker;
import io.intercom.android.sdk.overlay.OverlayPresenter;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.ActivityFinisher;

public class ResetManager {
    private final ActivityFinisher activityFinisher;
    private final Provider<Api> apiProvider;
    private final Provider<AppConfig> appConfigProvider;
    private final Context context;
    private final IntercomDataLayer dataLayer;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Runnable hardResetTask = new Runnable() {
        public void run() {
            ResetManager.this.hardReset();
        }
    };
    private final OverlayPresenter overlayPresenter;
    private final Twig twig = LumberMill.getLogger();
    private final UnreadConversationsTracker unreadConversationsTracker;
    private final UserIdentity userIdentity;

    public ResetManager(Provider<Api> provider, UserIdentity userIdentity2, OverlayPresenter overlayPresenter2, Provider<AppConfig> provider2, Context context2, ActivityFinisher activityFinisher2, IntercomDataLayer intercomDataLayer, UnreadConversationsTracker unreadConversationsTracker2) {
        this.apiProvider = provider;
        this.userIdentity = userIdentity2;
        this.overlayPresenter = overlayPresenter2;
        this.appConfigProvider = provider2;
        this.context = context2;
        this.activityFinisher = activityFinisher2;
        this.dataLayer = intercomDataLayer;
        this.unreadConversationsTracker = unreadConversationsTracker2;
    }

    public void clear() {
        this.handler.removeCallbacks(this.hardResetTask);
    }

    public void hardReset() {
        this.handler.removeCallbacks(this.hardResetTask);
        this.dataLayer.clearUserData();
        this.unreadConversationsTracker.clear();
        if (isSoftReset()) {
            String deviceToken = DeviceData.getDeviceToken(this.context);
            if (TextUtils.isEmpty(deviceToken)) {
                this.twig.internal("There is no device token to remove.");
            } else {
                this.apiProvider.get().removeDeviceToken(deviceToken, this.userIdentity);
            }
            this.dataLayer.hardReset();
            this.userIdentity.hardReset();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isSoftReset() {
        return this.userIdentity.isSoftReset();
    }

    public void softReset() {
        this.activityFinisher.finishActivities();
        this.overlayPresenter.softReset();
        this.handler.postDelayed(this.hardResetTask, this.appConfigProvider.get().getSoftResetTimeoutMs());
        this.dataLayer.emitEvent(IntercomEvent.SoftReset.INSTANCE);
        this.userIdentity.softReset();
        this.twig.i("Successfully reset the user. To resume communicating with Intercom, you can register a user", new Object[0]);
    }
}
