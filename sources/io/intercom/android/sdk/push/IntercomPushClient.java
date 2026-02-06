package io.intercom.android.sdk.push;

import Sg.p;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.HostAppState;
import io.intercom.android.sdk.push.IntercomLegacyPushClientHandler;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0015\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/push/IntercomPushClient;", "", "Lcom/intercom/twig/Twig;", "twig", "Lio/intercom/android/sdk/push/IntercomLegacyPushClientHandler;", "pushHandler", "<init>", "(Lcom/intercom/twig/Twig;Lio/intercom/android/sdk/push/IntercomLegacyPushClientHandler;)V", "()V", "", "", "message", "Landroid/os/Bundle;", "convertMessageMapToBundle", "(Ljava/util/Map;)Landroid/os/Bundle;", "Landroid/app/Application;", "application", "token", "Llf/M;", "sendTokenToIntercom", "(Landroid/app/Application;Ljava/lang/String;)V", "handlePush", "(Landroid/app/Application;Landroid/os/Bundle;)V", "(Landroid/app/Application;Ljava/util/Map;)V", "", "isIntercomPush", "(Landroid/os/Bundle;)Z", "(Ljava/util/Map;)Z", "Lcom/intercom/twig/Twig;", "Lio/intercom/android/sdk/push/IntercomLegacyPushClientHandler;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntercomPushClient {
    public static final int $stable = 8;
    private final IntercomLegacyPushClientHandler pushHandler;
    private final Twig twig;

    public IntercomPushClient(Twig twig2, IntercomLegacyPushClientHandler intercomLegacyPushClientHandler) {
        C6496s.h(twig2, "twig");
        C6496s.h(intercomLegacyPushClientHandler, "pushHandler");
        this.twig = twig2;
        this.pushHandler = intercomLegacyPushClientHandler;
    }

    private final Bundle convertMessageMapToBundle(Map<String, String> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry next : map.entrySet()) {
            bundle.putString((String) next.getKey(), (String) next.getValue());
        }
        return bundle;
    }

    public final void handlePush(Application application, Bundle bundle) {
        C6496s.h(application, "application");
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        if (!isIntercomPush(bundle)) {
            this.twig.i("The message passed to handlePush() was not an Intercom push message.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Push not handled because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        Context createLocalisedContext = new ContextLocaliser(injector.getAppConfigProvider()).createLocalisedContext(application);
        boolean isBackgrounded = ((HostAppState) injector.getDataLayer().getHostAppState().getValue()).isBackgrounded();
        SystemNotificationManager systemNotificationManager = injector.getSystemNotificationManager();
        IntercomLegacyPushClientHandler.Companion companion = IntercomLegacyPushClientHandler.Companion;
        C6496s.e(systemNotificationManager);
        C6496s.e(createLocalisedContext);
        companion.setUpNotificationChannels(systemNotificationManager, createLocalisedContext);
        IntercomLegacyPushClientHandler intercomLegacyPushClientHandler = this.pushHandler;
        UserIdentity userIdentity = injector.getUserIdentity();
        C6496s.g(userIdentity, "getUserIdentity(...)");
        MetricTracker metricTracker = injector.getMetricTracker();
        C6496s.g(metricTracker, "getMetricTracker(...)");
        AppConfig appConfig = injector.getAppConfigProvider().get();
        C6496s.g(appConfig, "get(...)");
        intercomLegacyPushClientHandler.handlePush(bundle, userIdentity, systemNotificationManager, isBackgrounded, createLocalisedContext, metricTracker, appConfig);
    }

    public final boolean isIntercomPush(Bundle bundle) {
        C6496s.h(bundle, MetricTracker.Object.MESSAGE);
        return this.pushHandler.isIntercomPush(bundle);
    }

    public final void sendTokenToIntercom(Application application, String str) {
        C6496s.h(application, "application");
        C6496s.h(str, "token");
        if (p.d0(str)) {
            this.twig.e("sendTokenToIntercom() was called with a null or empty token. This user will not receive push notifications until a valid device token is sent.", new Object[0]);
            return;
        }
        Injector.initIfCachedCredentials(application);
        if (Injector.isNotInitialised()) {
            this.twig.w("Token not sent because Intercom is not initialised", new Object[0]);
            return;
        }
        Injector injector = Injector.get();
        if (this.pushHandler.shouldSendDeviceToken(application, str)) {
            IntercomLegacyPushClientHandler intercomLegacyPushClientHandler = this.pushHandler;
            Api api = injector.getApi();
            C6496s.g(api, "getApi(...)");
            UserIdentity userIdentity = injector.getUserIdentity();
            C6496s.g(userIdentity, "getUserIdentity(...)");
            Provider<AppConfig> appConfigProvider = injector.getAppConfigProvider();
            C6496s.g(appConfigProvider, "getAppConfigProvider(...)");
            intercomLegacyPushClientHandler.sendTokenToIntercom(application, str, api, userIdentity, appConfigProvider);
        }
    }

    public final boolean isIntercomPush(Map<String, String> map) {
        C6496s.h(map, MetricTracker.Object.MESSAGE);
        return isIntercomPush(convertMessageMapToBundle(map));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IntercomPushClient() {
        /*
            r4 = this;
            com.intercom.twig.Twig r0 = io.intercom.android.sdk.logger.LumberMill.getLogger()
            java.lang.String r1 = "getLogger(...)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            io.intercom.android.sdk.push.IntercomLegacyPushClientHandler r1 = new io.intercom.android.sdk.push.IntercomLegacyPushClientHandler
            r2 = 0
            r3 = 3
            r1.<init>(r2, r2, r3, r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.push.IntercomPushClient.<init>():void");
    }

    public final void handlePush(Application application, Map<String, String> map) {
        C6496s.h(application, "application");
        C6496s.h(map, MetricTracker.Object.MESSAGE);
        handlePush(application, convertMessageMapToBundle(map));
    }
}
