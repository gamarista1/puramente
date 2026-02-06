package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1 extends C6498u implements p {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getPurchaseCompletedCallbacks$onError$1(PurchasesOrchestrator purchasesOrchestrator) {
        super(2);
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        C6496s.h(storeTransaction, "purchase");
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        PurchaseCallback access$getPurchaseCallback = this.this$0.getPurchaseCallback(storeTransaction.getProductIds().get(0));
        if (access$getPurchaseCallback != null) {
            this.this$0.dispatch(access$getPurchaseCallback, purchasesError);
        }
    }
}
