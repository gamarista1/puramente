package io.intercom.android.sdk.identity;

import android.content.Context;
import android.content.SharedPreferences;
import io.intercom.android.sdk.models.User;
import io.intercom.android.sdk.utilities.PreferenceKeys;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserIdentity {
    public static final String ANONYMOUS_ID = "anonymous_id";
    public static final String EMAIL = "email";
    public static final String INTERCOM_ID = "intercom_id";
    private static final String KEY_ANONYMOUS_ID = "INTERCOM_SDK_ANONYMOUS_ID";
    private static final String KEY_EMAIL_ID = "INTERCOM_SDK_EMAIL_ID";
    private static final String KEY_INTERCOM_ID = "INTERCOM_SDK_INTERCOM_ID";
    private static final String KEY_JWT = "INTERCOM_SDK_JWT";
    private static final String KEY_PREFIX = "intercomsdk-session-";
    private static final String KEY_SECURE_HMAC = "SecureMode_HMAC";
    private static final String KEY_USER_ID = "INTERCOM_SDK_USER_ID";
    private static final String TYPE = "type";
    private static final String USER = "user";
    private static final String USER_ID = "user_id";
    private String anonymousId;
    private String email;
    private String encryptedUserId;
    private String fingerprint = "";
    private String hmac;
    private String intercomId;
    private String jwt;
    private final SharedPreferences prefs;
    private SoftUserIdentity softUserIdentity = SoftUserIdentity.NONE;
    private String userId;

    public UserIdentity(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PreferenceKeys.INTERCOM_USER_PREFS, 0);
        this.prefs = sharedPreferences;
        this.anonymousId = sharedPreferences.getString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", "");
        this.intercomId = sharedPreferences.getString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", "");
        this.userId = sharedPreferences.getString("intercomsdk-session-INTERCOM_SDK_USER_ID", "");
        this.email = sharedPreferences.getString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", "");
        this.hmac = sharedPreferences.getString("intercomsdk-session-SecureMode_HMAC", "");
        this.jwt = sharedPreferences.getString("intercomsdk-session-INTERCOM_SDK_JWT", "");
        this.encryptedUserId = "";
        if (identityExists()) {
            this.fingerprint = generateFingerprint();
        }
    }

    private String generateFingerprint() {
        return UUID.randomUUID().toString();
    }

    public String getAnonymousId() {
        return this.anonymousId;
    }

    public String getEmail() {
        return this.email;
    }

    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHmac() {
        return this.hmac;
    }

    public String getIntercomId() {
        return this.intercomId;
    }

    public String getJwt() {
        return this.jwt;
    }

    public String getSoftUserIdentityHmac() {
        return this.softUserIdentity.hmac();
    }

    public String getUserId() {
        return this.userId;
    }

    public void hardReset() {
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean hasIntercomId() {
        return !getIntercomId().isEmpty();
    }

    public boolean identityExists() {
        if (!this.email.isEmpty() || !this.userId.isEmpty() || !this.intercomId.isEmpty() || !this.anonymousId.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isIdentified() {
        if (!identityExists() || isUnidentified()) {
            return false;
        }
        return true;
    }

    public boolean isSoftReset() {
        return this.softUserIdentity.isPresent();
    }

    public boolean isUnidentified() {
        if (this.anonymousId.isEmpty() || !this.email.isEmpty() || !this.userId.isEmpty()) {
            return false;
        }
        return true;
    }

    public void registerIdentifiedUser(Registration registration) {
        this.intercomId = "";
        SharedPreferences.Editor putString = this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", this.intercomId);
        if (!registration.getUserId().isEmpty()) {
            String userId2 = registration.getUserId();
            this.userId = userId2;
            putString.putString("intercomsdk-session-INTERCOM_SDK_USER_ID", userId2);
        }
        if (!registration.getEmail().isEmpty()) {
            String email2 = registration.getEmail();
            this.email = email2;
            putString.putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", email2);
        }
        putString.apply();
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public void registerUnidentifiedUser() {
        this.anonymousId = UUID.randomUUID().toString();
        this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId).apply();
        if (this.fingerprint.isEmpty()) {
            this.fingerprint = generateFingerprint();
        }
    }

    public boolean registrationHasAttributes(Registration registration) {
        if (registration == null || registration.getAttributes() == null || registration.getAttributes().isEmpty()) {
            return false;
        }
        return true;
    }

    public void setJwt(String str) {
        this.jwt = str;
        this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_JWT", str).apply();
    }

    public void setUserHash(String str) {
        this.hmac = str;
        this.prefs.edit().putString("intercomsdk-session-SecureMode_HMAC", str).apply();
    }

    public boolean softIdentityIsSameUser(Registration registration) {
        if (isUnidentified()) {
            return false;
        }
        return this.softUserIdentity.isSameUser(registration);
    }

    public void softReset() {
        if (!isSoftReset()) {
            this.softUserIdentity = SoftUserIdentity.create(this.anonymousId, this.email, this.fingerprint, this.hmac, this.jwt, this.intercomId, this.userId, this.encryptedUserId);
            this.prefs.edit().clear().apply();
            this.anonymousId = "";
            this.intercomId = "";
            this.encryptedUserId = "";
            this.userId = "";
            this.email = "";
            this.hmac = "";
            this.jwt = "";
            this.fingerprint = "";
        }
    }

    public void softRestart() {
        this.userId = this.softUserIdentity.userId();
        this.email = this.softUserIdentity.email();
        this.anonymousId = this.softUserIdentity.anonymousId();
        this.intercomId = this.softUserIdentity.intercomId();
        this.encryptedUserId = this.softUserIdentity.encryptedUserId();
        this.hmac = this.softUserIdentity.hmac();
        this.jwt = this.softUserIdentity.jwt();
        this.fingerprint = this.softUserIdentity.fingerprint();
        this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_USER_ID", this.userId).putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", this.email).putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId).putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", this.intercomId).apply();
        this.softUserIdentity = SoftUserIdentity.NONE;
    }

    public boolean softUserIdentityHmacDiffers(String str) {
        if (!this.softUserIdentity.isPresent() || getSoftUserIdentityHmac().equals(str)) {
            return false;
        }
        return true;
    }

    public boolean softUserIdentityJwtDiffers(String str) {
        if (!this.softUserIdentity.isPresent() || this.softUserIdentity.jwt().equals(str)) {
            return false;
        }
        return true;
    }

    public Map<String, Object> softUserIdentityToMap() {
        HashMap hashMap = new HashMap();
        String anonymousId2 = this.softUserIdentity.anonymousId();
        String intercomId2 = this.softUserIdentity.intercomId();
        String userId2 = this.softUserIdentity.userId();
        String email2 = this.softUserIdentity.email();
        if (!anonymousId2.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, anonymousId2);
        } else if (!intercomId2.isEmpty()) {
            hashMap.put(INTERCOM_ID, intercomId2);
        }
        if (!userId2.isEmpty()) {
            hashMap.put(USER_ID, userId2);
        }
        if (!email2.isEmpty()) {
            hashMap.put("email", email2);
        }
        hashMap.put(TYPE, "user");
        return hashMap;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        if (!this.anonymousId.isEmpty()) {
            hashMap.put(ANONYMOUS_ID, this.anonymousId);
        } else if (!this.intercomId.isEmpty()) {
            hashMap.put(INTERCOM_ID, this.intercomId);
        }
        if (!this.userId.isEmpty()) {
            hashMap.put(USER_ID, this.userId);
        }
        if (!this.email.isEmpty()) {
            hashMap.put("email", this.email);
        }
        hashMap.put(TYPE, "user");
        return hashMap;
    }

    public void update(User user) {
        if (user != User.NULL) {
            this.userId = user.getUserId();
            this.email = user.getEmail();
            this.anonymousId = user.getAnonymousId();
            this.encryptedUserId = user.getEncryptedUserId();
            SharedPreferences.Editor putString = this.prefs.edit().putString("intercomsdk-session-INTERCOM_SDK_USER_ID", this.userId).putString("intercomsdk-session-INTERCOM_SDK_EMAIL_ID", this.email).putString("intercomsdk-session-INTERCOM_SDK_ANONYMOUS_ID", this.anonymousId);
            if (!user.getIntercomId().isEmpty()) {
                String intercomId2 = user.getIntercomId();
                this.intercomId = intercomId2;
                putString.putString("intercomsdk-session-INTERCOM_SDK_INTERCOM_ID", intercomId2);
            }
            putString.apply();
        }
    }
}
