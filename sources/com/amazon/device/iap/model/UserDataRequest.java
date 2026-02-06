package com.amazon.device.iap.model;

public class UserDataRequest {
    private boolean fetchLWAConsentStatus;

    public static class Builder {
        /* access modifiers changed from: private */
        public boolean fetchLWAConsentStatus;

        public UserDataRequest build() {
            return new UserDataRequest(this);
        }

        public Builder setFetchLWAConsentStatus(boolean z10) {
            this.fetchLWAConsentStatus = z10;
            return this;
        }

        private Builder() {
        }
    }

    public UserDataRequest(Builder builder) {
        this.fetchLWAConsentStatus = builder.fetchLWAConsentStatus;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getFetchLWAConsentStatus() {
        return this.fetchLWAConsentStatus;
    }
}
