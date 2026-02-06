package com.revenuecat.purchases.amazon;

import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "response", "Llf/M;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$handleReceipt$1 extends C6498u implements C6798l {
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ Receipt $receipt;
    final /* synthetic */ UserData $userData;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$handleReceipt$1(Receipt receipt, PresentedOfferingContext presentedOfferingContext, UserData userData, AmazonBilling amazonBilling) {
        super(1);
        this.$receipt = receipt;
        this.$presentedOfferingContext = presentedOfferingContext;
        this.$userData = userData;
        this.this$0 = amazonBilling;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return C6514M.f71813a;
    }

    public final void invoke(JSONObject jSONObject) {
        C6496s.h(jSONObject, "response");
        Object obj = jSONObject.get(b.f37454L);
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.String");
        StoreTransaction storeTransaction = StoreTransactionConversionsKt.toStoreTransaction(this.$receipt, (String) obj, this.$presentedOfferingContext, PurchaseState.PURCHASED, this.$userData);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = this.this$0.getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesUpdated(C6565s.e(storeTransaction));
        }
    }
}
