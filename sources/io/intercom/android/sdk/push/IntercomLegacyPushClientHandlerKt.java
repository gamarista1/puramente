package io.intercom.android.sdk.push;

import io.intercom.android.sdk.Injector;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"newPushNotificationEnabled", "", "getNewPushNotificationEnabled", "()Z", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntercomLegacyPushClientHandlerKt {
    /* access modifiers changed from: private */
    public static final boolean getNewPushNotificationEnabled() {
        if (!Injector.isNotInitialised() && !Injector.get().getAppConfigProvider().get().getNewPushUiDisabled()) {
            return true;
        }
        return false;
    }
}
