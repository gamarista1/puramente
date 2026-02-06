package io.intercom.android.sdk.api;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.BuildConfig;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

public class ShutdownState {
    private static final String PREFS_SHUTDOWN_EXPIRY = "ShutdownExpiry";
    private static final String PREFS_SHUTDOWN_FINGERPRINT = "ShutdownFingerprint";
    private static final String PREFS_SHUTDOWN_REASON = "ShutdownReason";
    private final AppIdentity appIdentity;
    private final Context context;
    private final SharedPreferences prefs;
    long shutdownExpiry;
    String shutdownFingerprint;
    private String shutdownReason;
    private final TimeProvider timeProvider;

    public ShutdownState(Context context2, AppIdentity appIdentity2, TimeProvider timeProvider2) {
        this.context = context2;
        this.appIdentity = appIdentity2;
        SharedPreferences sharedPreferences = context2.getSharedPreferences(PreferenceKeys.INTERCOM_SHUTDOWN_PREFS, 0);
        this.prefs = sharedPreferences;
        this.timeProvider = timeProvider2;
        this.shutdownExpiry = sharedPreferences.getLong(PREFS_SHUTDOWN_EXPIRY, timeProvider2.currentTimeMillis());
        this.shutdownReason = sharedPreferences.getString(PREFS_SHUTDOWN_REASON, "");
        this.shutdownFingerprint = sharedPreferences.getString(PREFS_SHUTDOWN_FINGERPRINT, generateAppFingerprint(context2, appIdentity2));
    }

    private static String generateAppFingerprint(Context context2, AppIdentity appIdentity2) {
        return context2.getPackageName() + "-" + DeviceUtils.getAppVersion(context2) + "-" + appIdentity2.appId() + "-" + BuildConfig.VERSION_NAME;
    }

    private void persistCachedAttributes() {
        this.prefs.edit().putString(PREFS_SHUTDOWN_FINGERPRINT, this.shutdownFingerprint).putString(PREFS_SHUTDOWN_REASON, this.shutdownReason).putLong(PREFS_SHUTDOWN_EXPIRY, this.shutdownExpiry).apply();
    }

    public boolean canSendNetworkRequests() {
        boolean z10;
        if (this.shutdownExpiry <= this.timeProvider.currentTimeMillis()) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean equals = this.shutdownFingerprint.equals(generateAppFingerprint(this.context, this.appIdentity));
        if (z10 || !equals) {
            return true;
        }
        return false;
    }

    public String getShutdownReason() {
        return this.shutdownReason;
    }

    public void updateShutdownState(long j10, String str) {
        this.shutdownExpiry = this.timeProvider.currentTimeMillis() + j10;
        this.shutdownReason = str;
        this.shutdownFingerprint = generateAppFingerprint(this.context, this.appIdentity);
        persistCachedAttributes();
    }
}
