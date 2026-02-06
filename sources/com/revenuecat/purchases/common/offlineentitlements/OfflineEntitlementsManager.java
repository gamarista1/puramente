package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ=\u0010 \u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b¢\u0006\u0004\b \u0010!J'\u0010#\u001a\u00020\u00112\u0018\b\u0002\u0010\"\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\"\u0010+\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001c8B@BX\u000e¢\u0006\u0006\n\u0004\b+\u0010,RN\u00101\u001a<\u0012\u0004\u0012\u00020\u0015\u00122\u00120\u0012,\u0012*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00110\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001b0/j\u0002`00.0-8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "offlineCustomerInfoCalculator", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "diagnosticsTracker", "<init>", "(Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;)V", "", "isOfflineEntitlementsEnabled", "()Z", "Llf/M;", "resetOfflineCustomerInfoCache", "()V", "isServerError", "", "appUserId", "shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest", "(ZLjava/lang/String;)Z", "shouldCalculateOfflineCustomerInfoInPostReceipt", "(Z)Z", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "calculateAndCacheOfflineCustomerInfo", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "completion", "updateProductEntitlementMappingCacheIfStale", "(Lyf/l;)V", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCalculator;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "<set-?>", "_offlineCustomerInfo", "Lcom/revenuecat/purchases/CustomerInfo;", "", "", "Lkotlin/Pair;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineCustomerInfoCallback;", "offlineCustomerInfoCallbackCache", "Ljava/util/Map;", "getOfflineCustomerInfo", "()Lcom/revenuecat/purchases/CustomerInfo;", "offlineCustomerInfo", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfflineEntitlementsManager {
    /* access modifiers changed from: private */
    public CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;
    /* access modifiers changed from: private */
    public final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    /* access modifiers changed from: private */
    public final Map<String, List<Pair<C6798l, C6798l>>> offlineCustomerInfoCallbackCache = new LinkedHashMap();

    public OfflineEntitlementsManager(Backend backend2, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator2, DeviceCache deviceCache2, AppConfig appConfig2, DiagnosticsTracker diagnosticsTracker2) {
        C6496s.h(backend2, "backend");
        C6496s.h(offlineCustomerInfoCalculator2, "offlineCustomerInfoCalculator");
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(appConfig2, "appConfig");
        this.backend = backend2;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator2;
        this.deviceCache = deviceCache2;
        this.appConfig = appConfig2;
        this.diagnosticsTracker = diagnosticsTracker2;
    }

    private final boolean isOfflineEntitlementsEnabled() {
        if (!this.appConfig.getFinishTransactions() || !this.appConfig.getEnableOfflineEntitlements() || this.appConfig.getCustomEntitlementComputation()) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, C6798l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(lVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String str, C6798l lVar, C6798l lVar2) {
        C6496s.h(str, "appUserId");
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, OfflineEntitlementsStrings.OFFLINE_ENTITLEMENTS_NOT_ENABLED));
            return;
        }
        synchronized (this) {
            try {
                boolean containsKey = this.offlineCustomerInfoCallbackCache.containsKey(str);
                List list = this.offlineCustomerInfoCallbackCache.get(str);
                if (list == null) {
                    list = C6565s.n();
                }
                this.offlineCustomerInfoCallbackCache.put(str, C6565s.K0(list, C6565s.e(C6502A.a(lVar, lVar2))));
                if (containsKey) {
                    String format = String.format(OfflineEntitlementsStrings.ALREADY_CALCULATING_OFFLINE_CUSTOMER_INFO, Arrays.copyOf(new Object[]{str}, 1));
                    C6496s.g(format, "format(this, *args)");
                    LogUtilsKt.debugLog(format);
                    return;
                }
                C6514M m10 = C6514M.f71813a;
                this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(str, new OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2(this, str), new OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3(this, str));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final CustomerInfo getOfflineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        if (this._offlineCustomerInfo != null) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.RESETTING_OFFLINE_CUSTOMER_INFO_CACHE);
            this._offlineCustomerInfo = null;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean z10, String str) {
        C6496s.h(str, "appUserId");
        if (!z10 || !isOfflineEntitlementsEnabled() || this.deviceCache.getCachedCustomerInfo(str) != null) {
            return false;
        }
        return true;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean z10) {
        if (!z10 || !isOfflineEntitlementsEnabled()) {
            return false;
        }
        return true;
    }

    public final void updateProductEntitlementMappingCacheIfStale(C6798l lVar) {
        if (isOfflineEntitlementsEnabled() && this.deviceCache.isProductEntitlementMappingCacheStale()) {
            LogUtilsKt.debugLog(OfflineEntitlementsStrings.UPDATING_PRODUCT_ENTITLEMENT_MAPPING);
            this.backend.getProductEntitlementMapping(new OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1(this, lVar), new OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2(lVar));
        } else if (lVar != null) {
            lVar.invoke((Object) null);
        }
    }
}
