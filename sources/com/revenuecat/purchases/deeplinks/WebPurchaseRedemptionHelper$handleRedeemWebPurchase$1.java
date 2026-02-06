package com.revenuecat.purchases.deeplinks;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "result", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class WebPurchaseRedemptionHelper$handleRedeemWebPurchase$1 extends C6498u implements C6798l {
    final /* synthetic */ RedeemWebPurchaseListener $listener;
    final /* synthetic */ WebPurchaseRedemptionHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebPurchaseRedemptionHelper$handleRedeemWebPurchase$1(WebPurchaseRedemptionHelper webPurchaseRedemptionHelper, RedeemWebPurchaseListener redeemWebPurchaseListener) {
        super(1);
        this.this$0 = webPurchaseRedemptionHelper;
        this.$listener = redeemWebPurchaseListener;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((RedeemWebPurchaseListener.Result) obj);
        return C6514M.f71813a;
    }

    public final void invoke(RedeemWebPurchaseListener.Result result) {
        C6496s.h(result, "result");
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            LogUtilsKt.debugLog("Successfully redeemed web purchase. Updating customer info.");
            this.this$0.offlineEntitlementsManager.resetOfflineCustomerInfoCache();
            this.this$0.customerInfoUpdateHandler.cacheAndNotifyListeners(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo());
            this.this$0.dispatchResult(this.$listener, result);
            return;
        }
        LogUtilsKt.errorLog$default("Error redeeming web purchase: " + result, (Throwable) null, 2, (Object) null);
        this.this$0.dispatchResult(this.$listener, result);
    }
}
