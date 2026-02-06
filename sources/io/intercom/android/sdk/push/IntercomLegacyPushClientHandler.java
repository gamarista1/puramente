package io.intercom.android.sdk.push;

import android.content.Context;
import android.os.Bundle;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.push.IntercomNotificationHandler;
import io.intercom.android.sdk.m5.push.IntercomPushClientHandler;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 (2\u00020\u0001:\u0001(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ;\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\"\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'¨\u0006)"}, d2 = {"Lio/intercom/android/sdk/push/IntercomLegacyPushClientHandler;", "", "Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;", "pushClientHandler", "Lio/intercom/android/sdk/push/PushHandler;", "legacyPushClientHandler", "<init>", "(Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;Lio/intercom/android/sdk/push/PushHandler;)V", "Landroid/content/Context;", "context", "", "token", "", "shouldSendDeviceToken", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lio/intercom/android/sdk/api/Api;", "api", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/Provider;", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfigProvider", "Llf/M;", "sendTokenToIntercom", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/api/Api;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/Provider;)V", "Landroid/os/Bundle;", "message", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "systemNotificationManager", "appBackgrounded", "localisedContext", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricTracker", "appConfig", "handlePush", "(Landroid/os/Bundle;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/push/SystemNotificationManager;ZLandroid/content/Context;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/identity/AppConfig;)V", "isIntercomPush", "(Landroid/os/Bundle;)Z", "Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;", "Lio/intercom/android/sdk/push/PushHandler;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomLegacyPushClientHandler {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final PushHandler legacyPushClientHandler;
    private final IntercomPushClientHandler pushClientHandler;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/push/IntercomLegacyPushClientHandler$Companion;", "", "<init>", "()V", "Lio/intercom/android/sdk/push/SystemNotificationManager;", "systemNotificationManager", "Landroid/content/Context;", "context", "Llf/M;", "clear", "(Lio/intercom/android/sdk/push/SystemNotificationManager;Landroid/content/Context;)V", "setUpNotificationChannels", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear(SystemNotificationManager systemNotificationManager, Context context) {
            C6496s.h(systemNotificationManager, "systemNotificationManager");
            C6496s.h(context, "context");
            if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
                IntercomNotificationHandler.INSTANCE.clear(context);
            } else {
                systemNotificationManager.clear();
            }
        }

        public final void setUpNotificationChannels(SystemNotificationManager systemNotificationManager, Context context) {
            C6496s.h(systemNotificationManager, "systemNotificationManager");
            C6496s.h(context, "context");
            if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
                IntercomNotificationHandler.INSTANCE.setUpNotificationChannels$intercom_sdk_base_release(context);
            } else {
                systemNotificationManager.setUpNotificationChannelsIfSupported(context);
            }
        }

        private Companion() {
        }
    }

    public IntercomLegacyPushClientHandler() {
        this((IntercomPushClientHandler) null, (PushHandler) null, 3, (DefaultConstructorMarker) null);
    }

    public final void handlePush(Bundle bundle, UserIdentity userIdentity, SystemNotificationManager systemNotificationManager, boolean z10, Context context, MetricTracker metricTracker, AppConfig appConfig) {
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        C6496s.h(userIdentity, "userIdentity");
        C6496s.h(systemNotificationManager, "systemNotificationManager");
        C6496s.h(context, "localisedContext");
        C6496s.h(metricTracker, "metricTracker");
        C6496s.h(appConfig, "appConfig");
        if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
            this.pushClientHandler.handlePush(bundle, context, userIdentity);
        } else {
            this.legacyPushClientHandler.handlePush(bundle, userIdentity, systemNotificationManager, z10, context, metricTracker, appConfig);
        }
    }

    public final boolean isIntercomPush(Bundle bundle) {
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
            return this.pushClientHandler.isIntercomPush(bundle);
        }
        return PushPayload.create(bundle).isIntercomPush();
    }

    public final void sendTokenToIntercom(Context context, String str, Api api, UserIdentity userIdentity, Provider<AppConfig> provider) {
        C6496s.h(context, "context");
        C6496s.h(str, "token");
        C6496s.h(api, MetricTracker.Place.API);
        C6496s.h(userIdentity, "userIdentity");
        C6496s.h(provider, "appConfigProvider");
        if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
            this.pushClientHandler.sendTokenToIntercom(context, str, api, userIdentity, provider);
        } else {
            this.legacyPushClientHandler.sendTokenToIntercom(context, str, api, userIdentity, provider);
        }
    }

    public final boolean shouldSendDeviceToken(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "token");
        if (IntercomLegacyPushClientHandlerKt.getNewPushNotificationEnabled()) {
            return this.pushClientHandler.shouldSendDeviceToken(context, str);
        }
        return this.legacyPushClientHandler.shouldSendDeviceToken(context, str);
    }

    public IntercomLegacyPushClientHandler(IntercomPushClientHandler intercomPushClientHandler, PushHandler pushHandler) {
        C6496s.h(intercomPushClientHandler, "pushClientHandler");
        C6496s.h(pushHandler, "legacyPushClientHandler");
        this.pushClientHandler = intercomPushClientHandler;
        this.legacyPushClientHandler = pushHandler;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntercomLegacyPushClientHandler(IntercomPushClientHandler intercomPushClientHandler, PushHandler pushHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new IntercomPushClientHandler() : intercomPushClientHandler, (i10 & 2) != 0 ? new PushHandler() : pushHandler);
    }
}
