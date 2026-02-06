package com.amazon.device.iap.model;

public enum LWAConsentStatus {
    CONSENTED,
    UNAVAILABLE;

    public static LWAConsentStatus getEnumForValue(String str) {
        for (LWAConsentStatus lWAConsentStatus : values()) {
            if (lWAConsentStatus.toString().equals(str)) {
                return lWAConsentStatus;
            }
        }
        return UNAVAILABLE;
    }
}
