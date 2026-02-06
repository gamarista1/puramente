package com.revenuecat.purchases;

import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "config", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getCustomerCenterConfig$1 extends C6498u implements C6798l {
    final /* synthetic */ GetCustomerCenterConfigCallback $callback;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getCustomerCenterConfig$1(GetCustomerCenterConfigCallback getCustomerCenterConfigCallback) {
        super(1);
        this.$callback = getCustomerCenterConfigCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterConfigData) obj);
        return C6514M.f71813a;
    }

    public final void invoke(CustomerCenterConfigData customerCenterConfigData) {
        C6496s.h(customerCenterConfigData, "config");
        this.$callback.onSuccess(customerCenterConfigData);
    }
}
