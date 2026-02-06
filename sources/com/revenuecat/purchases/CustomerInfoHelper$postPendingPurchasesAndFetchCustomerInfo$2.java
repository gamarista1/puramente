package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.strings.CustomerInfoStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2 extends C6498u implements C6798l {
    final /* synthetic */ boolean $appInBackground;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ CustomerInfoHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CustomerInfoHelper$postPendingPurchasesAndFetchCustomerInfo$2(CustomerInfoHelper customerInfoHelper, String str, boolean z10, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(1);
        this.this$0 = customerInfoHelper;
        this.$appUserID = str;
        this.$appInBackground = z10;
        this.$callback = receiveCustomerInfoCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return C6514M.f71813a;
    }

    public final void invoke(final CustomerInfo customerInfo) {
        if (customerInfo == null) {
            this.this$0.getCustomerInfoFetchOnly(this.$appUserID, this.$appInBackground, this.$callback);
            return;
        }
        LogWrapperKt.log(LogIntent.RC_SUCCESS, CustomerInfoStrings.CUSTOMERINFO_UPDATED_FROM_SYNCING_PENDING_PURCHASES);
        CustomerInfoHelper customerInfoHelper = this.this$0;
        final ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
        customerInfoHelper.dispatch(new C6787a() {
            public final void invoke() {
                ReceiveCustomerInfoCallback receiveCustomerInfoCallback = receiveCustomerInfoCallback;
                if (receiveCustomerInfoCallback != null) {
                    receiveCustomerInfoCallback.onReceived(customerInfo);
                }
            }
        });
    }
}
