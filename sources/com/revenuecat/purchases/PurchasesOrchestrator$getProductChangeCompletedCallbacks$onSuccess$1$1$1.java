package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo $info;
    final /* synthetic */ ProductChangeCallback $productChangeCallback;
    final /* synthetic */ StoreTransaction $storeTransaction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getProductChangeCompletedCallbacks$onSuccess$1$1$1(ProductChangeCallback productChangeCallback, StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        super(0);
        this.$productChangeCallback = productChangeCallback;
        this.$storeTransaction = storeTransaction;
        this.$info = customerInfo;
    }

    public final void invoke() {
        this.$productChangeCallback.onCompleted(this.$storeTransaction, this.$info);
    }
}
