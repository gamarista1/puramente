package com.revenuecat.purchases;

import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ3\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\"J'\u0010#\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140%H\u0002¢\u0006\u0004\b'\u0010(J9\u0010+\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u00101R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u00102¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfoHelper;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "postPendingTransactionsHelper", "Landroid/os/Handler;", "handler", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/PostPendingTransactionsHelper;Landroid/os/Handler;)V", "", "appUserID", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "callback", "Llf/M;", "getCustomerInfoCacheOnly", "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "", "appInBackground", "allowSharingPlayStoreAccount", "postPendingPurchasesAndFetchCustomerInfo", "(Ljava/lang/String;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoFetchOnly", "(Ljava/lang/String;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "getCustomerInfoCachedOrFetched", "getCustomerInfoNotStaledCachedOrFetched", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "updateCachedCustomerInfoIfStale", "(Ljava/lang/String;ZZ)V", "Lkotlin/Function0;", "action", "dispatch", "(Lyf/a;)V", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "retrieveCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CacheFetchPolicy;ZZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "Landroid/os/Handler;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfoHelper {
    private final Backend backend;
    /* access modifiers changed from: private */
    public final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;
    private final Handler handler;
    /* access modifiers changed from: private */
    public final OfflineEntitlementsManager offlineEntitlementsManager;
    private final PostPendingTransactionsHelper postPendingTransactionsHelper;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.revenuecat.purchases.CacheFetchPolicy[] r0 = com.revenuecat.purchases.CacheFetchPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.revenuecat.purchases.CacheFetchPolicy r1 = com.revenuecat.purchases.CacheFetchPolicy.CACHE_ONLY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.revenuecat.purchases.CacheFetchPolicy r1 = com.revenuecat.purchases.CacheFetchPolicy.FETCH_CURRENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.revenuecat.purchases.CacheFetchPolicy r1 = com.revenuecat.purchases.CacheFetchPolicy.CACHED_OR_FETCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.revenuecat.purchases.CacheFetchPolicy r1 = com.revenuecat.purchases.CacheFetchPolicy.NOT_STALE_CACHED_OR_CURRENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.CustomerInfoHelper.WhenMappings.<clinit>():void");
        }
    }

    public CustomerInfoHelper(DeviceCache deviceCache2, Backend backend2, OfflineEntitlementsManager offlineEntitlementsManager2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, PostPendingTransactionsHelper postPendingTransactionsHelper2, Handler handler2) {
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(backend2, "backend");
        C6496s.h(offlineEntitlementsManager2, "offlineEntitlementsManager");
        C6496s.h(customerInfoUpdateHandler2, "customerInfoUpdateHandler");
        C6496s.h(postPendingTransactionsHelper2, "postPendingTransactionsHelper");
        C6496s.h(handler2, "handler");
        this.deviceCache = deviceCache2;
        this.backend = backend2;
        this.offlineEntitlementsManager = offlineEntitlementsManager2;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler2;
        this.postPendingTransactionsHelper = postPendingTransactionsHelper2;
        this.handler = handler2;
    }

    /* access modifiers changed from: private */
    public final void dispatch(C6787a aVar) {
        if (!C6496s.c(Thread.currentThread(), this.handler.getLooper().getThread())) {
            this.handler.post(new a(aVar));
        } else {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final void dispatch$lambda$0(C6787a aVar) {
        C6496s.h(aVar, "$tmp0");
        aVar.invoke();
    }

    private final CustomerInfo getCachedCustomerInfo(String str) {
        CustomerInfo offlineCustomerInfo = this.offlineEntitlementsManager.getOfflineCustomerInfo();
        if (offlineCustomerInfo == null) {
            return this.deviceCache.getCachedCustomerInfo(str);
        }
        return offlineCustomerInfo;
    }

    private final void getCustomerInfoCacheOnly(String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (receiveCustomerInfoCallback != null) {
            CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
            if (cachedCustomerInfo != null) {
                LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
                dispatch(new CustomerInfoHelper$getCustomerInfoCacheOnly$1(receiveCustomerInfoCallback, cachedCustomerInfo));
                return;
            }
            PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.CustomerInfoError, CustomerInfoStrings.MISSING_CACHED_CUSTOMER_INFO);
            LogUtilsKt.errorLog(purchasesError);
            dispatch(new CustomerInfoHelper$getCustomerInfoCacheOnly$2(receiveCustomerInfoCallback, purchasesError));
        }
    }

    static /* synthetic */ void getCustomerInfoCacheOnly$default(CustomerInfoHelper customerInfoHelper, String str, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        CustomerInfo cachedCustomerInfo = getCachedCustomerInfo(str);
        if (cachedCustomerInfo != null) {
            LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.VENDING_CACHE);
            dispatch(new CustomerInfoHelper$getCustomerInfoCachedOrFetched$1(receiveCustomerInfoCallback, cachedCustomerInfo));
            updateCachedCustomerInfoIfStale(str, z10, z11);
            return;
        }
        LogWrapperKt.log(LogIntent.DEBUG, CustomerInfoStrings.NO_CACHED_CUSTOMERINFO);
        postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
    }

    static /* synthetic */ void getCustomerInfoCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    /* access modifiers changed from: private */
    public final void getCustomerInfoFetchOnly(String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.deviceCache.setCustomerInfoCacheTimestampToNow(str);
        this.backend.getCustomerInfo(str, z10, new CustomerInfoHelper$getCustomerInfoFetchOnly$1(this, receiveCustomerInfoCallback), new CustomerInfoHelper$getCustomerInfoFetchOnly$2(this, str, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void getCustomerInfoFetchOnly$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoFetchOnly(str, z10, receiveCustomerInfoCallback);
    }

    private final void getCustomerInfoNotStaledCachedOrFetched(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else {
            getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        }
    }

    static /* synthetic */ void getCustomerInfoNotStaledCachedOrFetched$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
    }

    private final void postPendingPurchasesAndFetchCustomerInfo(String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        this.postPendingTransactionsHelper.syncPendingPurchaseQueue(z11, new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$1(this, str, z10, receiveCustomerInfoCallback), new CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2(this, str, z10, receiveCustomerInfoCallback));
    }

    static /* synthetic */ void postPendingPurchasesAndFetchCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
    }

    public static /* synthetic */ void retrieveCustomerInfo$default(CustomerInfoHelper customerInfoHelper, String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            receiveCustomerInfoCallback = null;
        }
        customerInfoHelper.retrieveCustomerInfo(str, cacheFetchPolicy, z10, z11, receiveCustomerInfoCallback);
    }

    private final void updateCachedCustomerInfoIfStale(String str, boolean z10, boolean z11) {
        String str2;
        if (this.deviceCache.isCustomerInfoCacheStale(str, z10)) {
            LogIntent logIntent = LogIntent.DEBUG;
            if (z10) {
                str2 = CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_BACKGROUND;
            } else {
                str2 = CustomerInfoStrings.CUSTOMERINFO_STALE_UPDATING_FOREGROUND;
            }
            LogWrapperKt.log(logIntent, str2);
            postPendingPurchasesAndFetchCustomerInfo$default(this, str, z10, z11, (ReceiveCustomerInfoCallback) null, 8, (Object) null);
        }
    }

    public final void retrieveCustomerInfo(String str, CacheFetchPolicy cacheFetchPolicy, boolean z10, boolean z11, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        C6496s.h(str, "appUserID");
        C6496s.h(cacheFetchPolicy, "fetchPolicy");
        String format = String.format(CustomerInfoStrings.RETRIEVING_CUSTOMER_INFO, Arrays.copyOf(new Object[]{cacheFetchPolicy}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.debugLog(format);
        int i10 = WhenMappings.$EnumSwitchMapping$0[cacheFetchPolicy.ordinal()];
        if (i10 == 1) {
            getCustomerInfoCacheOnly(str, receiveCustomerInfoCallback);
        } else if (i10 == 2) {
            postPendingPurchasesAndFetchCustomerInfo(str, z10, z11, receiveCustomerInfoCallback);
        } else if (i10 == 3) {
            getCustomerInfoCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        } else if (i10 == 4) {
            getCustomerInfoNotStaledCachedOrFetched(str, z10, z11, receiveCustomerInfoCallback);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomerInfoHelper(DeviceCache deviceCache2, Backend backend2, OfflineEntitlementsManager offlineEntitlementsManager2, CustomerInfoUpdateHandler customerInfoUpdateHandler2, PostPendingTransactionsHelper postPendingTransactionsHelper2, Handler handler2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceCache2, backend2, offlineEntitlementsManager2, customerInfoUpdateHandler2, postPendingTransactionsHelper2, (i10 & 32) != 0 ? new Handler(Looper.getMainLooper()) : handler2);
    }
}
