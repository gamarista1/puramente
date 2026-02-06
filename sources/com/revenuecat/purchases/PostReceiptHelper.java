package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.PostReceiptErrorHandlingBehavior;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.OfflineEntitlementsManager;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.paywalls.PaywallPresentedCache;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yf.C6787a;
import yf.C6798l;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0001\u0010)\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2$\u0010(\u001a \u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%\u0012\u0006\u0012\u0004\u0018\u00010&\u0012\u0004\u0012\u00020!0#j\u0002`'H\u0002¢\u0006\u0004\b)\u0010*JA\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020!0-H\u0002¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0\u001fH\u0002¢\u0006\u0004\b0\u00101Jq\u00102\u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!0\u001f2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0004\b2\u00103J\u0010;\u001a\u00020!2\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\"\b\u0002\u0010\"\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020!\u0018\u000108j\u0004\u0018\u0001`92\"\b\u0002\u0010(\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!\u0018\u000108j\u0004\u0018\u0001`:¢\u0006\u0004\b;\u0010<R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010=R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010BR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010DR\u0014\u0010G\u001a\u00020\u00178BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/revenuecat/purchases/PostReceiptHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/Backend;", "backend", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "customerInfoUpdateHandler", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "subscriberAttributesManager", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "offlineEntitlementsManager", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "paywallPresentedCache", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/Backend;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;)V", "", "appUserID", "purchaseToken", "", "isRestore", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "storeUserID", "marketplace", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "Llf/M;", "onSuccess", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;", "Lorg/json/JSONObject;", "Lcom/revenuecat/purchases/common/PostReceiptDataErrorCallback;", "onError", "postReceiptAndSubscriberAttributes", "(Ljava/lang/String;Ljava/lang/String;ZLcom/revenuecat/purchases/common/ReceiptInfo;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lyf/l;Lyf/q;)V", "errorHandlingBehavior", "Lcom/revenuecat/purchases/CustomerInfo;", "Lkotlin/Function0;", "useOfflineEntitlementsCustomerInfoIfNeeded", "(Lcom/revenuecat/purchases/common/PostReceiptErrorHandlingBehavior;Ljava/lang/String;Lyf/l;Lyf/a;)V", "calculateOfflineCustomerInfo", "(Ljava/lang/String;Lyf/l;Lyf/l;)V", "postTokenWithoutConsuming", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;ZLjava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "postTransactionAndConsumeIfNeeded", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/models/StoreProduct;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lyf/p;Lyf/p;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/Backend;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/CustomerInfoUpdateHandler;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesManager;", "Lcom/revenuecat/purchases/common/offlineentitlements/OfflineEntitlementsManager;", "Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "getFinishTransactions", "()Z", "finishTransactions", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostReceiptHelper {
    private final AppConfig appConfig;
    /* access modifiers changed from: private */
    public final Backend backend;
    /* access modifiers changed from: private */
    public final BillingAbstract billing;
    /* access modifiers changed from: private */
    public final CustomerInfoUpdateHandler customerInfoUpdateHandler;
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;
    /* access modifiers changed from: private */
    public final OfflineEntitlementsManager offlineEntitlementsManager;
    /* access modifiers changed from: private */
    public final PaywallPresentedCache paywallPresentedCache;
    /* access modifiers changed from: private */
    public final SubscriberAttributesManager subscriberAttributesManager;

    public PostReceiptHelper(AppConfig appConfig2, Backend backend2, BillingAbstract billingAbstract, CustomerInfoUpdateHandler customerInfoUpdateHandler2, DeviceCache deviceCache2, SubscriberAttributesManager subscriberAttributesManager2, OfflineEntitlementsManager offlineEntitlementsManager2, PaywallPresentedCache paywallPresentedCache2) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(backend2, "backend");
        C6496s.h(billingAbstract, "billing");
        C6496s.h(customerInfoUpdateHandler2, "customerInfoUpdateHandler");
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(subscriberAttributesManager2, "subscriberAttributesManager");
        C6496s.h(offlineEntitlementsManager2, "offlineEntitlementsManager");
        C6496s.h(paywallPresentedCache2, "paywallPresentedCache");
        this.appConfig = appConfig2;
        this.backend = backend2;
        this.billing = billingAbstract;
        this.customerInfoUpdateHandler = customerInfoUpdateHandler2;
        this.deviceCache = deviceCache2;
        this.subscriberAttributesManager = subscriberAttributesManager2;
        this.offlineEntitlementsManager = offlineEntitlementsManager2;
        this.paywallPresentedCache = paywallPresentedCache2;
    }

    private final void calculateOfflineCustomerInfo(String str, C6798l lVar, C6798l lVar2) {
        this.offlineEntitlementsManager.calculateAndCacheOfflineCustomerInfo(str, new PostReceiptHelper$calculateOfflineCustomerInfo$1(this, lVar), new PostReceiptHelper$calculateOfflineCustomerInfo$2(lVar2));
    }

    /* access modifiers changed from: private */
    public final boolean getFinishTransactions() {
        return this.appConfig.getFinishTransactions();
    }

    private final void postReceiptAndSubscriberAttributes(String str, String str2, boolean z10, ReceiptInfo receiptInfo, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, C6798l lVar, q qVar) {
        String str5 = str;
        this.subscriberAttributesManager.getUnsyncedSubscriberAttributes(str5, new PostReceiptHelper$postReceiptAndSubscriberAttributes$1(this, str2, str, z10, receiptInfo, str3, str4, postReceiptInitiationSource, this.paywallPresentedCache.getAndRemovePresentedEvent(), lVar, qVar));
    }

    public static /* synthetic */ void postTransactionAndConsumeIfNeeded$default(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p pVar, p pVar2, int i10, Object obj) {
        p pVar3;
        p pVar4;
        if ((i10 & 32) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar;
        }
        if ((i10 & 64) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
        postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, storeProduct, z10, str, postReceiptInitiationSource, pVar3, pVar4);
    }

    /* access modifiers changed from: private */
    public final void useOfflineEntitlementsCustomerInfoIfNeeded(PostReceiptErrorHandlingBehavior postReceiptErrorHandlingBehavior, String str, C6798l lVar, C6787a aVar) {
        boolean z10;
        if (postReceiptErrorHandlingBehavior == PostReceiptErrorHandlingBehavior.SHOULD_USE_OFFLINE_ENTITLEMENTS_AND_NOT_CONSUME) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.offlineEntitlementsManager.shouldCalculateOfflineCustomerInfoInPostReceipt(z10)) {
            calculateOfflineCustomerInfo(str, lVar, new PostReceiptHelper$useOfflineEntitlementsCustomerInfoIfNeeded$1(aVar));
        } else {
            aVar.invoke();
        }
    }

    public final void postTokenWithoutConsuming(String str, String str2, ReceiptInfo receiptInfo, boolean z10, String str3, String str4, PostReceiptInitiationSource postReceiptInitiationSource, C6798l lVar, C6798l lVar2) {
        String str5 = str;
        C6798l lVar3 = lVar;
        C6496s.h(str, "purchaseToken");
        C6496s.h(receiptInfo, "receiptInfo");
        C6496s.h(str3, "appUserID");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        C6496s.h(lVar3, "onSuccess");
        C6798l lVar4 = lVar2;
        C6496s.h(lVar4, "onError");
        String str6 = str;
        postReceiptAndSubscriberAttributes(str3, str6, z10, receiptInfo, str2, str4, postReceiptInitiationSource, new PostReceiptHelper$postTokenWithoutConsuming$1(this, str, lVar3), new PostReceiptHelper$postTokenWithoutConsuming$2(this, str6, str3, lVar3, lVar4));
    }

    public final void postTransactionAndConsumeIfNeeded(StoreTransaction storeTransaction, StoreProduct storeProduct, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p pVar, p pVar2) {
        StoreTransaction storeTransaction2 = storeTransaction;
        PostReceiptInitiationSource postReceiptInitiationSource2 = postReceiptInitiationSource;
        C6496s.h(storeTransaction2, "purchase");
        C6496s.h(str, "appUserID");
        C6496s.h(postReceiptInitiationSource2, "initiationSource");
        ReceiptInfo receiptInfo = new ReceiptInfo(storeTransaction.getProductIds(), storeTransaction.getPresentedOfferingContext(), storeTransaction.getSubscriptionOptionId(), storeProduct, (Double) null, (String) null, storeTransaction.getReplacementMode(), 48, (DefaultConstructorMarker) null);
        p pVar3 = pVar;
        postReceiptAndSubscriberAttributes(str, storeTransaction.getPurchaseToken(), z10, receiptInfo, storeTransaction.getStoreUserID(), storeTransaction.getMarketplace(), postReceiptInitiationSource2, new PostReceiptHelper$postTransactionAndConsumeIfNeeded$1(this, storeTransaction2, postReceiptInitiationSource2, pVar3), new PostReceiptHelper$postTransactionAndConsumeIfNeeded$2(this, storeTransaction2, postReceiptInitiationSource, str, pVar3, pVar2));
    }
}
