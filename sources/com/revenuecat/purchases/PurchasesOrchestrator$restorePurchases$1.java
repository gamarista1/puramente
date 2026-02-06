package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "allPurchases", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$restorePurchases$1 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$restorePurchases$1(PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback, String str) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
        this.$appUserID = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<StoreTransaction>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<StoreTransaction> list) {
        C6496s.h(list, "allPurchases");
        if (list.isEmpty()) {
            this.this$0.getCustomerInfo(this.$callback);
            return;
        }
        List<StoreTransaction> U02 = C6565s.U0(list, new PurchasesOrchestrator$restorePurchases$1$invoke$$inlined$sortedBy$1());
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        String str = this.$appUserID;
        ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        for (StoreTransaction storeTransaction : U02) {
            purchasesOrchestrator.postReceiptHelper.postTransactionAndConsumeIfNeeded(storeTransaction, (StoreProduct) null, true, str, PostReceiptInitiationSource.RESTORE, new PurchasesOrchestrator$restorePurchases$1$2$1$1(storeTransaction, U02, purchasesOrchestrator, receiveCustomerInfoCallback), new PurchasesOrchestrator$restorePurchases$1$2$1$2(storeTransaction, U02, purchasesOrchestrator, receiveCustomerInfoCallback));
        }
    }
}
