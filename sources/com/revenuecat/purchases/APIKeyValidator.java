package com.revenuecat.purchases;

import Sg.p;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.ConfigureStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator;", "", "<init>", "()V", "", "apiKey", "Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "getApiKeyPlatform", "(Ljava/lang/String;)Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "Lcom/revenuecat/purchases/Store;", "configuredStore", "Llf/M;", "validateAndLog", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)V", "Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "validate", "(Ljava/lang/String;Lcom/revenuecat/purchases/Store;)Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "APIKeyPlatform", "ValidationResult", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class APIKeyValidator {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$APIKeyPlatform;", "", "(Ljava/lang/String;I)V", "GOOGLE", "AMAZON", "LEGACY", "OTHER_PLATFORM", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private enum APIKeyPlatform {
        GOOGLE,
        AMAZON,
        LEGACY,
        OTHER_PLATFORM
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/APIKeyValidator$ValidationResult;", "", "(Ljava/lang/String;I)V", "VALID", "GOOGLE_KEY_AMAZON_STORE", "AMAZON_KEY_GOOGLE_STORE", "LEGACY", "OTHER_PLATFORM", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum ValidationResult {
        VALID,
        GOOGLE_KEY_AMAZON_STORE,
        AMAZON_KEY_GOOGLE_STORE,
        LEGACY,
        OTHER_PLATFORM
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.revenuecat.purchases.APIKeyValidator$ValidationResult[] r0 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.APIKeyValidator$ValidationResult r1 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.AMAZON_KEY_GOOGLE_STORE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.APIKeyValidator$ValidationResult r1 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.GOOGLE_KEY_AMAZON_STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.APIKeyValidator$ValidationResult r1 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.LEGACY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.APIKeyValidator$ValidationResult r1 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.OTHER_PLATFORM     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.revenuecat.purchases.APIKeyValidator$ValidationResult r1 = com.revenuecat.purchases.APIKeyValidator.ValidationResult.VALID     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.APIKeyValidator.WhenMappings.<clinit>():void");
        }
    }

    private final APIKeyPlatform getApiKeyPlatform(String str) {
        if (p.J(str, "goog_", false, 2, (Object) null)) {
            return APIKeyPlatform.GOOGLE;
        }
        if (p.J(str, "amzn_", false, 2, (Object) null)) {
            return APIKeyPlatform.AMAZON;
        }
        if (!p.N(str, '_', false, 2, (Object) null)) {
            return APIKeyPlatform.LEGACY;
        }
        return APIKeyPlatform.OTHER_PLATFORM;
    }

    public final ValidationResult validate(String str, Store store) {
        C6496s.h(str, "apiKey");
        C6496s.h(store, "configuredStore");
        APIKeyPlatform apiKeyPlatform = getApiKeyPlatform(str);
        APIKeyPlatform aPIKeyPlatform = APIKeyPlatform.GOOGLE;
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.PLAY_STORE) {
            return ValidationResult.VALID;
        }
        APIKeyPlatform aPIKeyPlatform2 = APIKeyPlatform.AMAZON;
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.AMAZON) {
            return ValidationResult.VALID;
        }
        if (apiKeyPlatform == aPIKeyPlatform && store == Store.AMAZON) {
            return ValidationResult.GOOGLE_KEY_AMAZON_STORE;
        }
        if (apiKeyPlatform == aPIKeyPlatform2 && store == Store.PLAY_STORE) {
            return ValidationResult.AMAZON_KEY_GOOGLE_STORE;
        }
        if (apiKeyPlatform == APIKeyPlatform.LEGACY) {
            return ValidationResult.LEGACY;
        }
        if (apiKeyPlatform == APIKeyPlatform.OTHER_PLATFORM) {
            return ValidationResult.OTHER_PLATFORM;
        }
        return ValidationResult.OTHER_PLATFORM;
    }

    public final void validateAndLog(String str, Store store) {
        C6496s.h(str, "apiKey");
        C6496s.h(store, "configuredStore");
        int i10 = WhenMappings.$EnumSwitchMapping$0[validate(str, store).ordinal()];
        if (i10 == 1) {
            LogUtilsKt.errorLog$default(ConfigureStrings.AMAZON_API_KEY_GOOGLE_STORE, (Throwable) null, 2, (Object) null);
        } else if (i10 == 2) {
            LogUtilsKt.errorLog$default(ConfigureStrings.GOOGLE_API_KEY_AMAZON_STORE, (Throwable) null, 2, (Object) null);
        } else if (i10 == 3) {
            LogUtilsKt.debugLog(ConfigureStrings.LEGACY_API_KEY);
        } else if (i10 == 4) {
            LogUtilsKt.errorLog$default(ConfigureStrings.INVALID_API_KEY, (Throwable) null, 2, (Object) null);
        }
    }
}
