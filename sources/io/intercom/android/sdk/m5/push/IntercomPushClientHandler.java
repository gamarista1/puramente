package io.intercom.android.sdk.m5.push;

import Sg.p;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.user.DeviceData;
import io.intercom.android.sdk.utilities.commons.TimeProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lio/intercom/android/sdk/m5/push/IntercomPushClientHandler;", "", "<init>", "()V", "Lio/intercom/android/sdk/identity/UserIdentity;", "userIdentity", "Lio/intercom/android/sdk/identity/AppConfig;", "appConfig", "", "hasUserHashIfNeeded", "(Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/identity/AppConfig;)Z", "Landroid/content/Context;", "context", "", "token", "shouldSendDeviceToken", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lio/intercom/android/sdk/api/Api;", "api", "Lio/intercom/android/sdk/Provider;", "appConfigProvider", "Llf/M;", "sendTokenToIntercom", "(Landroid/content/Context;Ljava/lang/String;Lio/intercom/android/sdk/api/Api;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/Provider;)V", "Landroid/os/Bundle;", "message", "localisedContext", "handlePush", "(Landroid/os/Bundle;Landroid/content/Context;Lio/intercom/android/sdk/identity/UserIdentity;)V", "isIntercomPush", "(Landroid/os/Bundle;)Z", "Lcom/intercom/twig/Twig;", "kotlin.jvm.PlatformType", "twig", "Lcom/intercom/twig/Twig;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPushClientHandler {
    public static final int $stable = 8;
    private final Twig twig = LumberMill.getLogger();

    private final boolean hasUserHashIfNeeded(UserIdentity userIdentity, AppConfig appConfig) {
        if (appConfig.isReceivedFromServer()) {
            if (appConfig.isIdentityVerificationEnabled()) {
                if (appConfig.isIdentityVerificationEnabled()) {
                    String hmac = userIdentity.getHmac();
                    C6496s.g(hmac, "getHmac(...)");
                    if (!p.d0(hmac)) {
                        return true;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void handlePush(Bundle bundle, Context context, UserIdentity userIdentity) {
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        C6496s.h(context, "localisedContext");
        C6496s.h(userIdentity, "userIdentity");
        IntercomPushData createFrom = IntercomPushData.Companion.createFrom(context, bundle);
        if (createFrom == null) {
            this.twig.i("This is not a Intercom push message", new Object[0]);
        } else if (!userIdentity.identityExists()) {
            this.twig.i("Can't create push message as we have no user identity. This can be caused by messages being sent to a logged out user.", new Object[0]);
            IntercomNotificationHandler.INSTANCE.clear(context);
        } else {
            IntercomNotificationHandler.processIntercomPushNotification$intercom_sdk_base_release$default(IntercomNotificationHandler.INSTANCE, context, createFrom, (TimeProvider) null, 4, (Object) null);
        }
    }

    public final boolean isIntercomPush(Bundle bundle) {
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        return IntercomPushData.Companion.isIntercomPush(bundle);
    }

    public final void sendTokenToIntercom(Context context, String str, Api api, UserIdentity userIdentity, Provider<AppConfig> provider) {
        C6496s.h(context, "context");
        C6496s.h(str, "token");
        C6496s.h(api, MetricTracker.Place.API);
        C6496s.h(userIdentity, "userIdentity");
        C6496s.h(provider, "appConfigProvider");
        if (userIdentity.identityExists()) {
            AppConfig appConfig = provider.get();
            C6496s.g(appConfig, "get(...)");
            if (hasUserHashIfNeeded(userIdentity, appConfig)) {
                api.setDeviceToken(str);
            }
        }
        DeviceData.cacheDeviceToken(context, str);
    }

    public final boolean shouldSendDeviceToken(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, "token");
        return !DeviceData.hasCachedDeviceToken(context, str);
    }
}
