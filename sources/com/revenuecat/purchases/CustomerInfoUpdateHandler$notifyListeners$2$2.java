package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerInfoUpdateHandler$notifyListeners$2$2 extends C6498u implements C6787a {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfoUpdateHandler$notifyListeners$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    public final void invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
