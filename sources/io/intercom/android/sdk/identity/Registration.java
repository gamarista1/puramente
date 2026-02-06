package io.intercom.android.sdk.identity;

import android.text.TextUtils;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.UserAttributes;
import io.intercom.android.sdk.logger.LumberMill;

public class Registration {
    private UserAttributes attributes;
    private String email = "";
    private final Twig twig = LumberMill.getLogger();
    private String userId = "";
    private Validity validity = Validity.NOT_SET;

    private enum Validity {
        NOT_SET,
        INVALID,
        VALID
    }

    public static Registration create() {
        return new Registration();
    }

    private void updateState(boolean z10) {
        Validity validity2;
        Validity validity3 = this.validity;
        if (validity3 == Validity.NOT_SET || validity3 == Validity.VALID) {
            if (z10) {
                validity2 = Validity.VALID;
            } else {
                validity2 = Validity.INVALID;
            }
            this.validity = validity2;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Registration registration = (Registration) obj;
        if (!this.email.equals(registration.email) || !this.userId.equals(registration.userId)) {
            return false;
        }
        UserAttributes userAttributes = this.attributes;
        UserAttributes userAttributes2 = registration.attributes;
        if (userAttributes != null) {
            return userAttributes.equals(userAttributes2);
        }
        if (userAttributes2 == null) {
            return true;
        }
        return false;
    }

    public UserAttributes getAttributes() {
        return this.attributes;
    }

    public String getEmail() {
        return this.email;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i10;
        int hashCode = ((this.email.hashCode() * 31) + this.userId.hashCode()) * 31;
        UserAttributes userAttributes = this.attributes;
        if (userAttributes != null) {
            i10 = userAttributes.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    /* access modifiers changed from: package-private */
    public boolean isValidRegistration() {
        return Validity.VALID.equals(this.validity);
    }

    public String toString() {
        return "Registration{email='" + this.email + '\'' + ", userId='" + this.userId + '\'' + ", attributes=" + this.attributes + '}';
    }

    public Registration withEmail(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty;
        if (!isEmpty) {
            this.email = str;
        } else {
            this.twig.e("Email cannot be null or empty", new Object[0]);
        }
        updateState(z10);
        return this;
    }

    public Registration withUserAttributes(UserAttributes userAttributes) {
        if (userAttributes == null) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is null", new Object[0]);
        } else if (userAttributes.isEmpty()) {
            this.validity = Validity.INVALID;
            this.twig.e("Registration.withUserAttributes method failed: the attributes Map provided is empty", new Object[0]);
        } else {
            this.attributes = userAttributes;
        }
        return this;
    }

    public Registration withUserId(String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z10 = !isEmpty;
        if (!isEmpty) {
            this.userId = str;
        } else {
            this.twig.e("UserId cannot be null or empty", new Object[0]);
        }
        updateState(z10);
        return this;
    }
}
