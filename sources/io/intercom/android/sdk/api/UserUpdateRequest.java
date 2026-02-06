package io.intercom.android.sdk.api;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

@AutoValue
public abstract class UserUpdateRequest {

    public static final class Builder {
        Map<String, Object> attributes;
        boolean isInternalUpdate = false;
        boolean isNewSession = false;
        boolean isSentFromBackground = true;

        public UserUpdateRequest build() {
            HashMap hashMap = new HashMap();
            Map<String, Object> map = this.attributes;
            if (map != null) {
                hashMap.putAll(map);
            }
            return new AutoValue_UserUpdateRequest(this.isNewSession, this.isSentFromBackground, this.isInternalUpdate, hashMap);
        }

        public Builder isInternalUpdate(boolean z10) {
            this.isInternalUpdate = z10;
            return this;
        }

        public Builder isNewSession(boolean z10) {
            this.isNewSession = z10;
            return this;
        }

        public Builder isSentFromBackground(boolean z10) {
            this.isSentFromBackground = z10;
            return this;
        }

        public Builder withAttributes(Map<String, Object> map) {
            this.attributes = map;
            return this;
        }
    }

    public static UserUpdateRequest create(boolean z10, boolean z11, Map<String, Object> map, boolean z12) {
        return new Builder().isNewSession(z10).isSentFromBackground(z11).withAttributes(map).isInternalUpdate(z12).build();
    }

    public abstract Map<String, Object> getAttributes();

    public abstract boolean isInternalUpdate();

    public abstract boolean isNewSession();

    public abstract boolean isSentFromBackground();

    public boolean isValidUpdate() {
        if (isInternalUpdate() || !getAttributes().isEmpty()) {
            return true;
        }
        return false;
    }

    public static UserUpdateRequest create(boolean z10, boolean z11, boolean z12) {
        return create(z10, z11, (Map<String, Object>) null, z12);
    }
}
