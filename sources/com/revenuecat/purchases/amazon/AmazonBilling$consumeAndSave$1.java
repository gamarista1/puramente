package com.revenuecat.purchases.amazon;

import com.amazon.device.iap.model.FulfillmentResult;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$consumeAndSave$1 extends C6498u implements C6798l {
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$consumeAndSave$1(AmazonBilling amazonBilling, StoreTransaction storeTransaction) {
        super(1);
        this.this$0 = amazonBilling;
        this.$purchase = storeTransaction;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            this.this$0.purchasingServiceProvider.notifyFulfillment(this.$purchase.getPurchaseToken(), FulfillmentResult.FULFILLED);
        } else {
            LogUtilsKt.errorLog(purchasesError);
        }
    }
}
