package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.p;

@Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/revenuecat/purchases/ListenerConversionsKt$productChangeCompletedListener$1", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchase", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "onCompleted", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "", "userCancelled", "onError", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsKt$productChangeCompletedListener$1 implements ProductChangeCallback {
    final /* synthetic */ p $onError;
    final /* synthetic */ p $onSuccess;

    ListenerConversionsKt$productChangeCompletedListener$1(p pVar, p pVar2) {
        this.$onSuccess = pVar;
        this.$onError = pVar2;
    }

    public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "customerInfo");
        this.$onSuccess.invoke(storeTransaction, customerInfo);
    }

    public void onError(PurchasesError purchasesError, boolean z10) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onError.invoke(purchasesError, Boolean.valueOf(z10));
    }
}
