package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$dispatch$1 extends C6498u implements C6787a {
    final /* synthetic */ PurchasesError $error;
    final /* synthetic */ PurchaseErrorCallback $this_dispatch;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$dispatch$1(PurchaseErrorCallback purchaseErrorCallback, PurchasesError purchasesError) {
        super(0);
        this.$this_dispatch = purchaseErrorCallback;
        this.$error = purchasesError;
    }

    public final void invoke() {
        PurchaseErrorCallback purchaseErrorCallback = this.$this_dispatch;
        PurchasesError purchasesError = this.$error;
        purchaseErrorCallback.onError(purchasesError, purchasesError.getCode() == PurchasesErrorCode.PurchaseCancelledError);
    }
}
