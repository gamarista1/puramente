package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.strings.PurchaseStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJO\u0010\u0017\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/SyncPurchasesHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "customerInfoHelper", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/CustomerInfoHelper;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "appUserID", "", "appInBackground", "isRestore", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/CustomerInfo;", "Llf/M;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "retrieveCustomerInfo", "(Ljava/lang/String;ZZLyf/l;Lyf/l;)V", "syncPurchases", "(ZZLyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/CustomerInfoHelper;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SyncPurchasesHelper {
    private final BillingAbstract billing;
    private final CustomerInfoHelper customerInfoHelper;
    private final IdentityManager identityManager;
    /* access modifiers changed from: private */
    public final PostReceiptHelper postReceiptHelper;

    public SyncPurchasesHelper(BillingAbstract billingAbstract, IdentityManager identityManager2, CustomerInfoHelper customerInfoHelper2, PostReceiptHelper postReceiptHelper2) {
        C6496s.h(billingAbstract, "billing");
        C6496s.h(identityManager2, "identityManager");
        C6496s.h(customerInfoHelper2, "customerInfoHelper");
        C6496s.h(postReceiptHelper2, "postReceiptHelper");
        this.billing = billingAbstract;
        this.identityManager = identityManager2;
        this.customerInfoHelper = customerInfoHelper2;
        this.postReceiptHelper = postReceiptHelper2;
    }

    /* access modifiers changed from: private */
    public final void retrieveCustomerInfo(String str, boolean z10, boolean z11, C6798l lVar, C6798l lVar2) {
        this.customerInfoHelper.retrieveCustomerInfo(str, CacheFetchPolicy.CACHED_OR_FETCHED, z10, z11, new SyncPurchasesHelper$retrieveCustomerInfo$1(lVar, lVar2));
    }

    public final void syncPurchases(boolean z10, boolean z11, C6798l lVar, C6798l lVar2) {
        C6496s.h(lVar, "onSuccess");
        C6496s.h(lVar2, "onError");
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SYNCING_PURCHASES);
        String currentAppUserID = this.identityManager.getCurrentAppUserID();
        this.billing.queryAllPurchases(currentAppUserID, new SyncPurchasesHelper$syncPurchases$1(this, currentAppUserID, z11, z10, lVar, lVar2), new SyncPurchasesHelper$syncPurchases$2(lVar2));
    }
}
