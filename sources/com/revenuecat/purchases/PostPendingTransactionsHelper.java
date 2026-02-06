package com.revenuecat.purchases;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.identity.IdentityManager;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ_\u0010\u001d\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJi\u0010!\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00180\u001f0\u00102\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"JG\u0010#\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\u0018\b\u0002\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010*¨\u0006+"}, d2 = {"Lcom/revenuecat/purchases/PostPendingTransactionsHelper;", "", "Lcom/revenuecat/purchases/common/AppConfig;", "appConfig", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/common/Dispatcher;", "dispatcher", "Lcom/revenuecat/purchases/identity/IdentityManager;", "identityManager", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "postTransactionWithProductDetailsHelper", "<init>", "(Lcom/revenuecat/purchases/common/AppConfig;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/common/Dispatcher;Lcom/revenuecat/purchases/identity/IdentityManager;Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactionsToSync", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Llf/M;", "onError", "Lcom/revenuecat/purchases/CustomerInfo;", "onSuccess", "postTransactionsWithCompletion", "(Ljava/util/List;ZLjava/lang/String;Lyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/utils/Result;", "results", "callCompletionFromResults", "(Ljava/util/List;Ljava/util/List;Lyf/l;Lyf/l;)V", "syncPendingPurchaseQueue", "(ZLyf/l;Lyf/l;)V", "Lcom/revenuecat/purchases/common/AppConfig;", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/common/Dispatcher;", "Lcom/revenuecat/purchases/identity/IdentityManager;", "Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostPendingTransactionsHelper {
    private final AppConfig appConfig;
    private final BillingAbstract billing;
    /* access modifiers changed from: private */
    public final DeviceCache deviceCache;
    private final Dispatcher dispatcher;
    private final IdentityManager identityManager;
    private final PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper;

    public PostPendingTransactionsHelper(AppConfig appConfig2, DeviceCache deviceCache2, BillingAbstract billingAbstract, Dispatcher dispatcher2, IdentityManager identityManager2, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper2) {
        C6496s.h(appConfig2, "appConfig");
        C6496s.h(deviceCache2, "deviceCache");
        C6496s.h(billingAbstract, "billing");
        C6496s.h(dispatcher2, "dispatcher");
        C6496s.h(identityManager2, "identityManager");
        C6496s.h(postTransactionWithProductDetailsHelper2, "postTransactionWithProductDetailsHelper");
        this.appConfig = appConfig2;
        this.deviceCache = deviceCache2;
        this.billing = billingAbstract;
        this.dispatcher = dispatcher2;
        this.identityManager = identityManager2;
        this.postTransactionWithProductDetailsHelper = postTransactionWithProductDetailsHelper2;
    }

    /* access modifiers changed from: private */
    public final void callCompletionFromResults(List<StoreTransaction> list, List<? extends Result<CustomerInfo, PurchasesError>> list2, C6798l lVar, C6798l lVar2) {
        if (list.size() == list2.size()) {
            int i10 = 0;
            for (Object next : list2) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C6565s.x();
                }
                Result result = (Result) next;
                if (!(result instanceof Result.Error)) {
                    if (i10 == list2.size() - 1 && lVar2 != null) {
                        C6496s.f(result, "null cannot be cast to non-null type com.revenuecat.purchases.utils.Result.Success<com.revenuecat.purchases.CustomerInfo>");
                        lVar2.invoke(((Result.Success) result).getValue());
                    }
                    i10 = i11;
                } else if (lVar != null) {
                    lVar.invoke(((Result.Error) result).getValue());
                    return;
                } else {
                    return;
                }
            }
        }
    }

    static /* synthetic */ void callCompletionFromResults$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, List list2, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        if ((i10 & 8) != 0) {
            lVar2 = null;
        }
        postPendingTransactionsHelper.callCompletionFromResults(list, list2, lVar, lVar2);
    }

    /* access modifiers changed from: private */
    public final void postTransactionsWithCompletion(List<StoreTransaction> list, boolean z10, String str, C6798l lVar, C6798l lVar2) {
        C6798l lVar3 = lVar2;
        if (list.isEmpty()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.NO_PENDING_PURCHASES_TO_SYNC);
            if (lVar3 != null) {
                lVar3.invoke((Object) null);
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        List<StoreTransaction> list2 = list;
        C6798l lVar4 = lVar;
        C6798l lVar5 = lVar2;
        this.postTransactionWithProductDetailsHelper.postTransactions(list, z10, str, PostReceiptInitiationSource.UNSYNCED_ACTIVE_PURCHASES, new PostPendingTransactionsHelper$postTransactionsWithCompletion$1(arrayList2, this, list2, lVar4, lVar5), new PostPendingTransactionsHelper$postTransactionsWithCompletion$2(arrayList2, this, list2, lVar4, lVar5));
    }

    static /* synthetic */ void postTransactionsWithCompletion$default(PostPendingTransactionsHelper postPendingTransactionsHelper, List list, boolean z10, String str, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        C6798l lVar3;
        C6798l lVar4;
        if ((i10 & 8) != 0) {
            lVar3 = null;
        } else {
            lVar3 = lVar;
        }
        if ((i10 & 16) != 0) {
            lVar4 = null;
        } else {
            lVar4 = lVar2;
        }
        postPendingTransactionsHelper.postTransactionsWithCompletion(list, z10, str, lVar3, lVar4);
    }

    public static /* synthetic */ void syncPendingPurchaseQueue$default(PostPendingTransactionsHelper postPendingTransactionsHelper, boolean z10, C6798l lVar, C6798l lVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            lVar2 = null;
        }
        postPendingTransactionsHelper.syncPendingPurchaseQueue(z10, lVar, lVar2);
    }

    /* access modifiers changed from: private */
    public static final void syncPendingPurchaseQueue$lambda$0(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z10, C6798l lVar, C6798l lVar2) {
        C6496s.h(postPendingTransactionsHelper, "this$0");
        C6496s.h(str, "$appUserID");
        postPendingTransactionsHelper.billing.queryPurchases(str, new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$1(postPendingTransactionsHelper, z10, str, lVar, lVar2), new PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(lVar));
    }

    public final void syncPendingPurchaseQueue(boolean z10, C6798l lVar, C6798l lVar2) {
        if (!this.appConfig.getDangerousSettings().getAutoSyncPurchases()) {
            LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.SKIPPING_AUTOMATIC_SYNC);
            if (lVar2 != null) {
                lVar2.invoke((Object) null);
                return;
            }
            return;
        }
        LogWrapperKt.log(LogIntent.DEBUG, PurchaseStrings.UPDATING_PENDING_PURCHASE_QUEUE);
        Dispatcher.enqueue$default(this.dispatcher, new c(this, this.identityManager.getCurrentAppUserID(), z10, lVar, lVar2), (Delay) null, 2, (Object) null);
    }
}
