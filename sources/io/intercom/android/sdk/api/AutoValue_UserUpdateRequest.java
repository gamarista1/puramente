package io.intercom.android.sdk.api;

import java.util.Map;

final class AutoValue_UserUpdateRequest extends UserUpdateRequest {
    private final Map<String, Object> attributes;
    private final boolean internalUpdate;
    private final boolean newSession;
    private final boolean sentFromBackground;

    AutoValue_UserUpdateRequest(boolean z10, boolean z11, boolean z12, Map<String, Object> map) {
        this.newSession = z10;
        this.sentFromBackground = z11;
        this.internalUpdate = z12;
        if (map != null) {
            this.attributes = map;
            return;
        }
        throw new NullPointerException("Null attributes");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserUpdateRequest)) {
            return false;
        }
        UserUpdateRequest userUpdateRequest = (UserUpdateRequest) obj;
        if (this.newSession == userUpdateRequest.isNewSession() && this.sentFromBackground == userUpdateRequest.isSentFromBackground() && this.internalUpdate == userUpdateRequest.isInternalUpdate() && this.attributes.equals(userUpdateRequest.getAttributes())) {
            return true;
        }
        return false;
    }

    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public int hashCode() {
        int i10;
        int i11;
        int i12 = 1237;
        if (this.newSession) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i13 = (i10 ^ 1000003) * 1000003;
        if (this.sentFromBackground) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i14 = (i13 ^ i11) * 1000003;
        if (this.internalUpdate) {
            i12 = 1231;
        }
        return ((i14 ^ i12) * 1000003) ^ this.attributes.hashCode();
    }

    public boolean isInternalUpdate() {
        return this.internalUpdate;
    }

    public boolean isNewSession() {
        return this.newSession;
    }

    public boolean isSentFromBackground() {
        return this.sentFromBackground;
    }

    public String toString() {
        return "UserUpdateRequest{newSession=" + this.newSession + ", sentFromBackground=" + this.sentFromBackground + ", internalUpdate=" + this.internalUpdate + ", attributes=" + this.attributes + "}";
    }
}
