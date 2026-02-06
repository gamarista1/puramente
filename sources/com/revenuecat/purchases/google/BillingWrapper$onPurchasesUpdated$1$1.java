package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTxn", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$onPurchasesUpdated$1$1 extends C6498u implements C6798l {
    final /* synthetic */ List<Purchase> $notNullPurchasesList;
    final /* synthetic */ List<StoreTransaction> $storeTransactions;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$onPurchasesUpdated$1$1(List<StoreTransaction> list, List<? extends Purchase> list2, BillingWrapper billingWrapper) {
        super(1);
        this.$storeTransactions = list;
        this.$notNullPurchasesList = list2;
        this.this$0 = billingWrapper;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StoreTransaction) obj);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction) {
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
        C6496s.h(storeTransaction, "storeTxn");
        this.$storeTransactions.add(storeTransaction);
        if (this.$storeTransactions.size() == this.$notNullPurchasesList.size() && (purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener()) != null) {
            purchasesUpdatedListener.onPurchasesUpdated(this.$storeTransactions);
        }
    }
}
