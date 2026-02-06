package com.revenuecat.purchases.common.caching;

import Sg.p;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.intercom.android.sdk.models.AttributeType;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import mf.O;
import mf.Y;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b6\b\u0010\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u001d\u0010#\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b#\u0010&J\u0015\u0010'\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b'\u0010$J\u0015\u0010(\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010.\u001a\u00020+¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010$J\u0015\u00105\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b5\u0010$J\u001d\u00105\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u00106\u001a\u00020\n¢\u0006\u0004\b5\u00107J\u0015\u00108\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b8\u0010$J\u001d\u00109\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010$J\u0011\u0010=\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b=\u0010!J\r\u0010>\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b@\u0010AJ\u0015\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020\u0004¢\u0006\u0004\bC\u0010$J\u001b\u0010E\u001a\u00020\u00162\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\bE\u0010\u0018J'\u0010I\u001a\b\u0012\u0004\u0012\u00020G0H2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020G0F¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00162\u0006\u0010N\u001a\u00020K¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\u0016¢\u0006\u0004\bQ\u0010?J\u0015\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0016¢\u0006\u0004\bV\u0010?J\r\u0010W\u001a\u000201¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u0004\u0018\u00010R¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u0004\u0018\u00010K2\u0006\u0010[\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u0004H\u0016¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020\u00162\u0006\u0010^\u001a\u00020\u0004¢\u0006\u0004\bb\u0010$J\u001b\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010^\u001a\u00020\u0004¢\u0006\u0004\bc\u0010dJ\u0015\u0010e\u001a\u00020\u00042\u0006\u0010[\u001a\u00020\u0004¢\u0006\u0004\be\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010gR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010hR\u001b\u0010l\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010!R\u001b\u0010o\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\bm\u0010j\u001a\u0004\bn\u0010!R\u001b\u0010r\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\bp\u0010j\u001a\u0004\bq\u0010!R\u001a\u0010s\u001a\u00020\u00048\u0000XD¢\u0006\f\n\u0004\bs\u0010g\u001a\u0004\bt\u0010!R\u001b\u0010w\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\bu\u0010j\u001a\u0004\bv\u0010!R\u001b\u0010z\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\bx\u0010j\u001a\u0004\by\u0010!R\u001b\u0010}\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b{\u0010j\u001a\u0004\b|\u0010!R\u001c\u0010\u0001\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b~\u0010j\u001a\u0004\b\u0010!R\u001e\u0010\u0001\u001a\u00020\u00048BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010!R\u001e\u0010\u0001\u001a\u00020\u00048BX\u0002¢\u0006\u000e\n\u0005\b\u0001\u0010j\u001a\u0005\b\u0001\u0010!¨\u0006\u0001"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/interfaces/StorefrontProvider;", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "appUserID", "clearCustomerInfoCacheTimestamp", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "Ljava/util/Date;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "", "newSet", "Llf/M;", "setSavedTokenHashes", "(Ljava/util/Set;)V", "date", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "startEditing", "()Landroid/content/SharedPreferences$Editor;", "getLegacyCachedAppUserID", "()Ljava/lang/String;", "getCachedAppUserID", "cacheAppUserID", "(Ljava/lang/String;)V", "cacheEditor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearCachesForAppUserID", "customerInfoCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "info", "cacheCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "", "appInBackground", "isCustomerInfoCacheStale", "(Ljava/lang/String;Z)Z", "clearCustomerInfoCache", "editor", "(Ljava/lang/String;Landroid/content/SharedPreferences$Editor;)V", "setCustomerInfoCacheTimestampToNow", "setCustomerInfoCacheTimestamp", "(Ljava/lang/String;Ljava/util/Date;)V", "countryCode", "setStorefront", "getStorefront", "cleanupOldAttributionData", "()V", "getPreviouslySentHashedTokens", "()Ljava/util/Set;", "token", "addSuccessfullyPostedToken", "hashedTokens", "cleanPreviouslySentTokens", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache", "(Ljava/util/Map;)Ljava/util/List;", "Lorg/json/JSONObject;", "getOfferingsResponseCache", "()Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferingsResponse", "(Lorg/json/JSONObject;)V", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale", "()Z", "getProductEntitlementMapping", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "key", "getJSONObjectOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "cacheKey", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "remove", "findKeysThatStartWith", "(Ljava/lang/String;)Ljava/util/Set;", "newKey", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lkotlin/Lazy;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsRelease", "tokensCacheKey$delegate", "getTokensCacheKey", "tokensCacheKey", "storefrontCacheKey$delegate", "getStorefrontCacheKey", "storefrontCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final String apiKey;
    private final Lazy apiKeyPrefix$delegate;
    private final Lazy appUserIDCacheKey$delegate;
    private final String attributionCacheKey;
    private final Lazy customerInfoCachesLastUpdatedCacheBaseKey$delegate;
    private final DateProvider dateProvider;
    private final Lazy legacyAppUserIDCacheKey$delegate;
    private final Lazy offeringsResponseCacheKey$delegate;
    private final SharedPreferences preferences;
    private final Lazy productEntitlementMappingCacheKey$delegate;
    private final Lazy productEntitlementMappingLastUpdatedCacheKey$delegate;
    private final Lazy storefrontCacheKey$delegate;
    private final Lazy tokensCacheKey$delegate;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache$Companion;", "", "()V", "CUSTOMER_INFO_REQUEST_DATE_KEY", "", "CUSTOMER_INFO_SCHEMA_VERSION_KEY", "CUSTOMER_INFO_VERIFICATION_RESULT_KEY", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider2) {
        C6496s.h(sharedPreferences, "preferences");
        C6496s.h(str, "apiKey");
        C6496s.h(dateProvider2, "dateProvider");
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.dateProvider = dateProvider2;
        this.apiKeyPrefix$delegate = C6531o.b(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey$delegate = C6531o.b(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey$delegate = C6531o.b(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey$delegate = C6531o.b(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey$delegate = C6531o.b(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey$delegate = C6531o.b(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey$delegate = C6531o.b(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey$delegate = C6531o.b(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey$delegate = C6531o.b(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    /* access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix$delegate.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String str) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(str), 0));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey$delegate.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey$delegate.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey$delegate.getValue();
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setSavedTokenHashes(Set<String> set) {
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{set}, 1));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.preferences.edit().putStringSet(getTokensCacheKey(), set).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        C6496s.h(str, "token");
        LogIntent logIntent = LogIntent.DEBUG;
        String format = String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{str, UtilsKt.sha1(str)}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        String format2 = String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1));
        C6496s.g(format2, "format(this, *args)");
        LogWrapperKt.log(logIntent, format2);
        Set i12 = C6565s.i1(previouslySentHashedTokens);
        i12.add(UtilsKt.sha1(str));
        setSavedTokenHashes(i12);
    }

    public final synchronized void cacheAppUserID(String str) {
        C6496s.h(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        C6496s.g(edit, "preferences.edit()");
        cacheAppUserID(str, edit).apply();
    }

    public final synchronized void cacheCustomerInfo(String str, CustomerInfo customerInfo) {
        C6496s.h(str, "appUserID");
        C6496s.h(customerInfo, "info");
        JSONObject rawData = customerInfo.getRawData();
        rawData.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        rawData.put("verification_result", customerInfo.getEntitlements().getVerification().name());
        rawData.put(CUSTOMER_INFO_REQUEST_DATE_KEY, customerInfo.getRequestDate().getTime());
        this.preferences.edit().putString(customerInfoCacheKey(str), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow(str);
    }

    public final synchronized void cacheOfferingsResponse(JSONObject jSONObject) {
        C6496s.h(jSONObject, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), jSONObject.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        C6496s.h(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> set) {
        C6496s.h(set, "hashedTokens");
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        setSavedTokenHashes(C6565s.t0(set, getPreviouslySentHashedTokens()));
    }

    public final synchronized void cleanupOldAttributionData() {
        try {
            SharedPreferences.Editor edit = this.preferences.edit();
            for (String next : this.preferences.getAll().keySet()) {
                if (next != null && p.J(next, this.attributionCacheKey, false, 2, (Object) null)) {
                    edit.remove(next);
                }
            }
            edit.apply();
        } finally {
            while (true) {
            }
        }
    }

    public final synchronized void clearCachesForAppUserID(String str) {
        C6496s.h(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        C6496s.g(edit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(edit)), str).apply();
    }

    public final synchronized void clearCustomerInfoCache(String str) {
        C6496s.h(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        C6496s.g(edit, "editor");
        clearCustomerInfoCache(str, edit);
        edit.apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final String customerInfoCacheKey(String str) {
        C6496s.h(str, "appUserID");
        return getLegacyAppUserIDCacheKey() + '.' + str;
    }

    public final String customerInfoLastUpdatedCacheKey(String str) {
        C6496s.h(str, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + str;
    }

    public final Set<String> findKeysThatStartWith(String str) {
        C6496s.h(str, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : all.entrySet()) {
                    String str2 = (String) next.getKey();
                    C6496s.g(str2, "it");
                    if (p.J(str2, str, false, 2, (Object) null)) {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
                Set<String> keySet = linkedHashMap.keySet();
                if (keySet != null) {
                    return keySet;
                }
            }
            return Y.e();
        } catch (NullPointerException unused) {
            return Y.e();
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> map) {
        C6496s.h(map, "hashedTokens");
        return C6565s.e1(O.m(map, getPreviouslySentHashedTokens()).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey$delegate.getValue();
    }

    public final String getAttributionCacheKey$purchases_defaultsRelease() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), (String) null);
    }

    public final CustomerInfo getCachedCustomerInfo(String str) {
        String str2;
        Date date;
        C6496s.h(str, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey(str), (String) null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int optInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
            if (jSONObject.has("verification_result")) {
                str2 = jSONObject.getString("verification_result");
            } else {
                str2 = "NOT_REQUESTED";
            }
            Long valueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                date = new Date(valueOf.longValue());
            } else {
                date = null;
            }
            jSONObject.remove("verification_result");
            jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
            C6496s.g(str2, "verificationResultString");
            VerificationResult valueOf2 = VerificationResult.valueOf(str2);
            if (optInt == 3) {
                return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, valueOf2);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject getJSONObjectOrNull(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        String string = this.preferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey$delegate.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), (String) null);
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = mf.Y.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.Set<java.lang.String> getPreviouslySentHashedTokens() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.content.SharedPreferences r0 = r5.preferences     // Catch:{ ClassCastException -> 0x003a }
            java.lang.String r1 = r5.getTokensCacheKey()     // Catch:{ ClassCastException -> 0x003a }
            java.util.Set r2 = mf.Y.e()     // Catch:{ ClassCastException -> 0x003a }
            java.util.Set r0 = r0.getStringSet(r1, r2)     // Catch:{ ClassCastException -> 0x003a }
            if (r0 == 0) goto L_0x001c
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ ClassCastException -> 0x003a }
            java.util.Set r0 = mf.C6565s.j1(r0)     // Catch:{ ClassCastException -> 0x003a }
            if (r0 != 0) goto L_0x0020
            goto L_0x001c
        L_0x001a:
            r0 = move-exception
            goto L_0x0040
        L_0x001c:
            java.util.Set r0 = mf.Y.e()     // Catch:{ ClassCastException -> 0x003a }
        L_0x0020:
            com.revenuecat.purchases.common.LogIntent r1 = com.revenuecat.purchases.common.LogIntent.DEBUG     // Catch:{ ClassCastException -> 0x003a }
            java.lang.String r2 = "Tokens already posted: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r0}     // Catch:{ ClassCastException -> 0x003a }
            r4 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ ClassCastException -> 0x003a }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ ClassCastException -> 0x003a }
            java.lang.String r3 = "format(this, *args)"
            kotlin.jvm.internal.C6496s.g(r2, r3)     // Catch:{ ClassCastException -> 0x003a }
            com.revenuecat.purchases.common.LogWrapperKt.log(r1, r2)     // Catch:{ ClassCastException -> 0x003a }
            goto L_0x003e
        L_0x003a:
            java.util.Set r0 = mf.Y.e()     // Catch:{ all -> 0x001a }
        L_0x003e:
            monitor-exit(r5)
            return r0
        L_0x0040:
            monitor-exit(r5)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.caching.DeviceCache.getPreviouslySentHashedTokens():java.util.Set");
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        ProductEntitlementMapping productEntitlementMapping;
        productEntitlementMapping = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), (String) null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMapping = ProductEntitlementMapping.Companion.fromJson(new JSONObject(string));
        } catch (JSONException e10) {
            String format = String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1));
            C6496s.g(format, "format(this, *args)");
            LogUtilsKt.errorLog(format, e10);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMapping;
    }

    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey(), (String) null);
        if (string == null) {
            LogUtilsKt.debugLog(BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
        }
        return string;
    }

    public final String getStorefrontCacheKey() {
        return (String) this.storefrontCacheKey$delegate.getValue();
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey$delegate.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String str, boolean z10) {
        C6496s.h(str, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(str), z10, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        return DateExtensionsKt.m50isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final String newKey(String str) {
        C6496s.h(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return getApiKeyPrefix() + '.' + str;
    }

    public void putString(String str, String str2) {
        C6496s.h(str, "cacheKey");
        C6496s.h(str2, "value");
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void remove(String str) {
        C6496s.h(str, "cacheKey");
        this.preferences.edit().remove(str).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String str, Date date) {
        C6496s.h(str, "appUserID");
        C6496s.h(date, AttributeType.DATE);
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(str), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String str) {
        C6496s.h(str, "appUserID");
        setCustomerInfoCacheTimestamp(str, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront(String str) {
        C6496s.h(str, "countryCode");
        String format = String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.verboseLog(format);
        this.preferences.edit().putString(getStorefrontCacheKey(), str).apply();
    }

    public final SharedPreferences.Editor startEditing() {
        SharedPreferences.Editor edit = this.preferences.edit();
        C6496s.g(edit, "preferences.edit()");
        return edit;
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String str) {
        C6496s.h(str, "appUserID");
        SharedPreferences.Editor edit = this.preferences.edit();
        C6496s.g(edit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(edit, str).apply();
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID(String str, SharedPreferences.Editor editor) {
        SharedPreferences.Editor putString;
        C6496s.h(str, "appUserID");
        C6496s.h(editor, "cacheEditor");
        putString = editor.putString(getAppUserIDCacheKey(), str);
        C6496s.g(putString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return putString;
    }

    public final synchronized void clearCustomerInfoCache(String str, SharedPreferences.Editor editor) {
        C6496s.h(str, "appUserID");
        C6496s.h(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, str);
        editor.remove(customerInfoCacheKey(str));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, str, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider2);
    }
}
