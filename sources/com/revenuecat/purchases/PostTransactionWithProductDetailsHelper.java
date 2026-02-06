package com.revenuecat.purchases;

import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J{\u0010\u0019\u001a\u00020\u00132\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\"\b\u0002\u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u00142\"\b\u0002\u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/PostTransactionWithProductDetailsHelper;", "", "Lcom/revenuecat/purchases/common/BillingAbstract;", "billing", "Lcom/revenuecat/purchases/PostReceiptHelper;", "postReceiptHelper", "<init>", "(Lcom/revenuecat/purchases/common/BillingAbstract;Lcom/revenuecat/purchases/PostReceiptHelper;)V", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "transactions", "", "allowSharingPlayStoreAccount", "", "appUserID", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "initiationSource", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "Llf/M;", "Lcom/revenuecat/purchases/SuccessfulPurchaseCallback;", "transactionPostSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/ErrorPurchaseCallback;", "transactionPostError", "postTransactions", "(Ljava/util/List;ZLjava/lang/String;Lcom/revenuecat/purchases/PostReceiptInitiationSource;Lyf/p;Lyf/p;)V", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/revenuecat/purchases/PostReceiptHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PostTransactionWithProductDetailsHelper {
    private final BillingAbstract billing;
    /* access modifiers changed from: private */
    public final PostReceiptHelper postReceiptHelper;

    public PostTransactionWithProductDetailsHelper(BillingAbstract billingAbstract, PostReceiptHelper postReceiptHelper2) {
        C6496s.h(billingAbstract, "billing");
        C6496s.h(postReceiptHelper2, "postReceiptHelper");
        this.billing = billingAbstract;
        this.postReceiptHelper = postReceiptHelper2;
    }

    public static /* synthetic */ void postTransactions$default(PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, List list, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p pVar, p pVar2, int i10, Object obj) {
        p pVar3;
        p pVar4;
        if ((i10 & 16) != 0) {
            pVar3 = null;
        } else {
            pVar3 = pVar;
        }
        if ((i10 & 32) != 0) {
            pVar4 = null;
        } else {
            pVar4 = pVar2;
        }
        postTransactionWithProductDetailsHelper.postTransactions(list, z10, str, postReceiptInitiationSource, pVar3, pVar4);
    }

    public final void postTransactions(List<StoreTransaction> list, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p pVar, p pVar2) {
        List<StoreTransaction> list2 = list;
        p pVar3 = pVar2;
        C6496s.h(list2, "transactions");
        C6496s.h(str, "appUserID");
        C6496s.h(postReceiptInitiationSource, "initiationSource");
        for (StoreTransaction storeTransaction : list2) {
            if (storeTransaction.getPurchaseState() != PurchaseState.PENDING) {
                BillingAbstract billingAbstract = this.billing;
                ProductType type = storeTransaction.getType();
                boolean z11 = z10;
                String str2 = str;
                PostReceiptInitiationSource postReceiptInitiationSource2 = postReceiptInitiationSource;
                PostTransactionWithProductDetailsHelper$postTransactions$1$1 postTransactionWithProductDetailsHelper$postTransactions$1$1 = r0;
                p pVar4 = pVar;
                Set j12 = C6565s.j1(storeTransaction.getProductIds());
                PostTransactionWithProductDetailsHelper$postTransactions$1$1 postTransactionWithProductDetailsHelper$postTransactions$1$12 = new PostTransactionWithProductDetailsHelper$postTransactions$1$1(storeTransaction, this, z11, str2, postReceiptInitiationSource2, pVar4, pVar2);
                StoreTransaction storeTransaction2 = storeTransaction;
                PostTransactionWithProductDetailsHelper$postTransactions$1$2 postTransactionWithProductDetailsHelper$postTransactions$1$2 = r0;
                PostTransactionWithProductDetailsHelper$postTransactions$1$2 postTransactionWithProductDetailsHelper$postTransactions$1$22 = new PostTransactionWithProductDetailsHelper$postTransactions$1$2(this, storeTransaction2, z11, str2, postReceiptInitiationSource2, pVar4, pVar2);
                billingAbstract.queryProductDetailsAsync(type, j12, postTransactionWithProductDetailsHelper$postTransactions$1$1, postTransactionWithProductDetailsHelper$postTransactions$1$2);
            } else {
                if (pVar3 != null) {
                    PurchasesError purchasesError = new PurchasesError(PurchasesErrorCode.PaymentPendingError, (String) null, 2, (DefaultConstructorMarker) null);
                    LogUtilsKt.errorLog(purchasesError);
                    C6514M m10 = C6514M.f71813a;
                    pVar3.invoke(storeTransaction, purchasesError);
                }
            }
            String str3 = str;
            PostReceiptInitiationSource postReceiptInitiationSource3 = postReceiptInitiationSource;
        }
    }
}
