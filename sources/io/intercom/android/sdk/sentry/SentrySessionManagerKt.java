package io.intercom.android.sdk.sentry;

import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.identity.FeatureFlag;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\"\u0014\u0010\u0000\u001a\u00020\u00018BX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000\"\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, d2 = {"newSentrySetupDisabled", "", "getNewSentrySetupDisabled", "()Z", "INTERCOM_SDK_PACKAGE", "", "REDACTION_LINE", "ALLOWED_PACKAGES", "", "[Ljava/lang/String;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SentrySessionManagerKt {
    /* access modifiers changed from: private */
    public static final String[] ALLOWED_PACKAGES = {"io.intercom.android.sdk", "java.", "kotlin.", "kotlinx.", "android.", "androidx.", "com.android.", "com.google."};
    private static final String INTERCOM_SDK_PACKAGE = "io.intercom.android.sdk";
    private static final String REDACTION_LINE = "[Non Intercom/OS method]";

    /* access modifiers changed from: private */
    public static final boolean getNewSentrySetupDisabled() {
        if (Injector.isNotInitialised()) {
            return true;
        }
        return Injector.get().getAppConfigProvider().get().hasFeature(FeatureFlag.NEW_SENTRY_SETUP_DISABLED);
    }
}
