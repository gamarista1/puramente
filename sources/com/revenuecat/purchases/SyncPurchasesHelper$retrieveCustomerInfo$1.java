package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/revenuecat/purchases/SyncPurchasesHelper$retrieveCustomerInfo$1", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "onReceived", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SyncPurchasesHelper$retrieveCustomerInfo$1 implements ReceiveCustomerInfoCallback {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;

    SyncPurchasesHelper$retrieveCustomerInfo$1(C6798l lVar, C6798l lVar2) {
        this.$onSuccess = lVar;
        this.$onError = lVar2;
    }

    public void onError(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onError.invoke(purchasesError);
    }

    public void onReceived(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "customerInfo");
        this.$onSuccess.invoke(customerInfo);
    }
}
