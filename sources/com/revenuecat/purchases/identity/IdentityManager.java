package com.revenuecat.purchases.identity;

import Sg.m;
import Sg.p;
import android.content.SharedPreferences;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offerings.OfferingsCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.common.verification.SignatureVerificationMode;
import com.revenuecat.purchases.strings.IdentityStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import com.revenuecat.purchases.subscriberattributes.caching.SubscriberAttributesCache;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010\u001aJ\u001d\u0010(\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00150&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b*\u0010\u001aJC\u00101\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00122\u0018\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150,2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00150.¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u0012¢\u0006\u0004\b3\u0010\u001aJ#\u00105\u001a\u00020\u00152\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010/\u0012\u0004\u0012\u00020\u00150.¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u001d¢\u0006\u0004\b7\u00108R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bC\u0010#¨\u0006E"}, d2 = {"Lcom/revenuecat/purchases/identity/IdentityManager;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "subscriberAttributesCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "offeringsCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offerings/OfferingsCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/common/Dispatcher;)V", "", "oldAppUserId", "newAppUserId", "Llf/M;", "copySubscriberAttributesToNewUserIfOldIsAnonymous", "(Ljava/lang/String;Ljava/lang/String;)V", "appUserID", "invalidateETagCacheIfNeeded", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "shouldInvalidateETagCache", "(Lcom/revenuecat/purchases/CustomerInfo;)Z", "isUserIDAnonymous", "(Ljava/lang/String;)Z", "generateRandomID", "()Ljava/lang/String;", "newUserID", "resetAndSaveUserID", "Lkotlin/Function0;", "command", "enqueue", "(Lyf/a;)V", "configure", "newAppUserID", "Lkotlin/Function2;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "logIn", "(Ljava/lang/String;Lyf/p;Lyf/l;)V", "switchUser", "completion", "logOut", "(Lyf/l;)V", "currentUserIsAnonymous", "()Z", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offerings/OfferingsCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/common/Dispatcher;", "LSg/m;", "anonymousIdRegex", "LSg/m;", "getCurrentAppUserID", "currentAppUserID", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class IdentityManager {
    private final m anonymousIdRegex = new m("^\\$RCAnonymousID:([a-f0-9]{32})$");
    /* access modifiers changed from: private */
    public final Backend backend;
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    /* access modifiers changed from: private */
    public final OfferingsCache offeringsCache;
    /* access modifiers changed from: private */
    public final OfflineEntitlementsManager offlineEntitlementsManager;
    /* access modifiers changed from: private */
    public final SubscriberAttributesCache subscriberAttributesCache;
    private final SubscriberAttributesManager subscriberAttributesManager;

    public IdentityManager(DeviceCache deviceCache2, SubscriberAttributesCache subscriberAttributesCache2, SubscriberAttributesManager subscriberAttributesManager2, OfferingsCache offeringsCache2, Backend backend2, OfflineEntitlementsManager offlineEntitlementsManager2, Dispatcher dispatcher2) {
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(subscriberAttributesCache2, "subscriberAttributesCache");
        C6496s.h(subscriberAttributesManager2, "subscriberAttributesManager");
        C6496s.h(offeringsCache2, "offeringsCache");
        C6496s.h(backend2, "backend");
        C6496s.h(offlineEntitlementsManager2, "offlineEntitlementsManager");
        C6496s.h(dispatcher2, "dispatcher");
        this.deviceCache = deviceCache2;
        this.subscriberAttributesCache = subscriberAttributesCache2;
        this.subscriberAttributesManager = subscriberAttributesManager2;
        this.offeringsCache = offeringsCache2;
        this.backend = backend2;
        this.offlineEntitlementsManager = offlineEntitlementsManager2;
        this.dispatcher = dispatcher2;
    }

    /* access modifiers changed from: private */
    public final void copySubscriberAttributesToNewUserIfOldIsAnonymous(String str, String str2) {
        if (isUserIDAnonymous(str)) {
            this.subscriberAttributesManager.copyUnsyncedSubscriberAttributes(str, str2);
        }
    }

    private final synchronized void enqueue(C6787a aVar) {
        this.dispatcher.enqueue(new a(aVar), Delay.NONE);
    }

    /* access modifiers changed from: private */
    public static final void enqueue$lambda$3(C6787a aVar) {
        C6496s.h(aVar, "$command");
        aVar.invoke();
    }

    /* access modifiers changed from: private */
    public final String generateRandomID() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$RCAnonymousID:");
        String uuid = UUID.randomUUID().toString();
        C6496s.g(uuid, "randomUUID().toString()");
        Locale locale = Locale.ROOT;
        C6496s.g(locale, "ROOT");
        String lowerCase = uuid.toLowerCase(locale);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String D10 = p.D(lowerCase, "-", "", false, 4, (Object) null);
        LogWrapperKt.log(LogIntent.USER, IdentityStrings.SETTING_NEW_ANON_ID);
        sb2.append(D10);
        return sb2.toString();
    }

    private final void invalidateETagCacheIfNeeded(String str) {
        if (!C6496s.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE) && shouldInvalidateETagCache(this.deviceCache.getCachedCustomerInfo(str))) {
            LogUtilsKt.infoLog(IdentityStrings.INVALIDATING_CACHED_ETAG_CACHE);
            this.backend.clearCaches();
        }
    }

    private final boolean isUserIDAnonymous(String str) {
        return this.anonymousIdRegex.d(str);
    }

    /* access modifiers changed from: private */
    public final synchronized void resetAndSaveUserID(String str) {
        this.deviceCache.clearCachesForAppUserID(getCurrentAppUserID());
        this.offeringsCache.clearCache();
        this.subscriberAttributesCache.clearSubscriberAttributesIfSyncedForSubscriber(getCurrentAppUserID());
        this.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
        this.deviceCache.cacheAppUserID(str);
        this.backend.clearCaches();
    }

    private final boolean shouldInvalidateETagCache(CustomerInfo customerInfo) {
        if (customerInfo == null || customerInfo.getEntitlements().getVerification() != VerificationResult.NOT_REQUESTED || C6496s.c(this.backend.getVerificationMode(), SignatureVerificationMode.Disabled.INSTANCE)) {
            return false;
        }
        return true;
    }

    public final synchronized void configure(String str) {
        if (str != null) {
            try {
                if (p.d0(str)) {
                    LogWrapperKt.log(LogIntent.WARNING, IdentityStrings.EMPTY_APP_USER_ID_WILL_BECOME_ANONYMOUS);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (str != null) {
            if (p.d0(str)) {
                str = null;
            }
            if (str != null) {
                LogIntent logIntent = LogIntent.USER;
                String format = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1));
                C6496s.g(format, "format(this, *args)");
                LogWrapperKt.log(logIntent, format);
                SharedPreferences.Editor startEditing = this.deviceCache.startEditing();
                this.deviceCache.cacheAppUserID(str, startEditing);
                this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str, startEditing);
                invalidateETagCacheIfNeeded(str);
                startEditing.apply();
                enqueue(new IdentityManager$configure$1(this));
            }
        }
        str = this.deviceCache.getCachedAppUserID();
        if (str == null && (str = this.deviceCache.getLegacyCachedAppUserID()) == null) {
            str = generateRandomID();
        }
        LogIntent logIntent2 = LogIntent.USER;
        String format2 = String.format(IdentityStrings.IDENTIFYING_APP_USER_ID, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format2, "format(this, *args)");
        LogWrapperKt.log(logIntent2, format2);
        SharedPreferences.Editor startEditing2 = this.deviceCache.startEditing();
        this.deviceCache.cacheAppUserID(str, startEditing2);
        this.subscriberAttributesCache.cleanUpSubscriberAttributeCache(str, startEditing2);
        invalidateETagCacheIfNeeded(str);
        startEditing2.apply();
        enqueue(new IdentityManager$configure$1(this));
    }

    public final synchronized boolean currentUserIsAnonymous() {
        boolean z10;
        try {
            String cachedAppUserID = this.deviceCache.getCachedAppUserID();
            if (cachedAppUserID == null) {
                cachedAppUserID = "";
            }
            boolean isUserIDAnonymous = isUserIDAnonymous(cachedAppUserID);
            boolean c10 = C6496s.c(this.deviceCache.getCachedAppUserID(), this.deviceCache.getLegacyCachedAppUserID());
            if (isUserIDAnonymous || c10) {
                z10 = true;
            } else {
                z10 = false;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return z10;
    }

    public final String getCurrentAppUserID() {
        String cachedAppUserID = this.deviceCache.getCachedAppUserID();
        if (cachedAppUserID == null) {
            return "";
        }
        return cachedAppUserID;
    }

    public final void logIn(String str, yf.p pVar, C6798l lVar) {
        C6496s.h(str, "newAppUserID");
        C6496s.h(pVar, "onSuccess");
        C6496s.h(lVar, "onError");
        if (p.d0(str)) {
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.InvalidAppUserIdError, IdentityStrings.LOG_IN_ERROR_MISSING_APP_USER_ID);
            LogUtilsKt.errorLog(purchasesError);
            lVar.invoke(purchasesError);
            return;
        }
        LogIntent logIntent = LogIntent.USER;
        String format = String.format(IdentityStrings.LOGGING_IN, Arrays.copyOf(new Object[]{getCurrentAppUserID(), str}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(str, new IdentityManager$logIn$2(this, getCurrentAppUserID(), str, lVar, pVar));
    }

    public final synchronized void logOut(C6798l lVar) {
        C6496s.h(lVar, "completion");
        if (currentUserIsAnonymous()) {
            LogWrapperKt.log(LogIntent.RC_ERROR, IdentityStrings.LOG_OUT_CALLED_ON_ANONYMOUS_USER);
            lVar.invoke(new PurchasesError(PurchasesErrorCode.LogOutWithAnonymousUserError, (String) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        this.subscriberAttributesManager.synchronizeSubscriberAttributesForAllUsers(getCurrentAppUserID(), new IdentityManager$logOut$1(this, lVar));
    }

    public final void switchUser(String str) {
        C6496s.h(str, "newAppUserID");
        String format = String.format(IdentityStrings.SWITCHING_USER, Arrays.copyOf(new Object[]{str}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.debugLog(format);
        resetAndSaveUserID(str);
    }
}
