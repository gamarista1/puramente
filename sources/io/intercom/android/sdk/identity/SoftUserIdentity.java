package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.google.auto.value.AutoValue;

@AutoValue
abstract class SoftUserIdentity {
    static final SoftUserIdentity NONE = create("", "", "", "", "", "", "", "");

    SoftUserIdentity() {
    }

    static SoftUserIdentity create(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new AutoValue_SoftUserIdentity(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* access modifiers changed from: package-private */
    public abstract String anonymousId();

    /* access modifiers changed from: package-private */
    public abstract String email();

    /* access modifiers changed from: package-private */
    public abstract String encryptedUserId();

    /* access modifiers changed from: package-private */
    public abstract String fingerprint();

    /* access modifiers changed from: package-private */
    public abstract String hmac();

    /* access modifiers changed from: package-private */
    public abstract String intercomId();

    /* access modifiers changed from: package-private */
    public boolean isPresent() {
        return !equals(NONE);
    }

    /* access modifiers changed from: package-private */
    public boolean isSameUser(Registration registration) {
        boolean z10;
        String userId = registration.getUserId();
        String email = registration.getEmail();
        boolean z11 = true;
        if (!TextUtils.isEmpty(userId) || !TextUtils.isEmpty(email)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!TextUtils.isEmpty(userId)) {
            if (!z10 || !userId.equals(userId())) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (TextUtils.isEmpty(email)) {
            return z10;
        }
        if (!z10 || !email.equals(email())) {
            z11 = false;
        }
        return z11;
    }

    /* access modifiers changed from: package-private */
    public abstract String jwt();

    /* access modifiers changed from: package-private */
    public abstract String userId();
}
