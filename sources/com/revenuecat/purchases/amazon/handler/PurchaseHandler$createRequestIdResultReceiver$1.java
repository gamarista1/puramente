package com.revenuecat.purchases.amazon.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.amazon.device.iap.model.RequestId;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.Metadata;
import lf.C6502A;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/revenuecat/purchases/amazon/handler/PurchaseHandler$createRequestIdResultReceiver$1", "Landroid/os/ResultReceiver;", "", "resultCode", "Landroid/os/Bundle;", "resultData", "Llf/M;", "onReceiveResult", "(ILandroid/os/Bundle;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PurchaseHandler$createRequestIdResultReceiver$1 extends ResultReceiver {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ p $onSuccess;
    final /* synthetic */ StoreProduct $storeProduct;
    final /* synthetic */ PurchaseHandler this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchaseHandler$createRequestIdResultReceiver$1(Handler handler, PurchaseHandler purchaseHandler, p pVar, C6798l lVar, StoreProduct storeProduct) {
        super(handler);
        this.this$0 = purchaseHandler;
        this.$onSuccess = pVar;
        this.$onError = lVar;
        this.$storeProduct = storeProduct;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i10, Bundle bundle) {
        Object obj;
        RequestId requestId;
        PurchaseHandler purchaseHandler = this.this$0;
        p pVar = this.$onSuccess;
        C6798l lVar = this.$onError;
        StoreProduct storeProduct = this.$storeProduct;
        synchronized (purchaseHandler) {
            if (bundle != null) {
                try {
                    obj = bundle.get(ProxyAmazonBillingActivity.EXTRAS_REQUEST_ID);
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                obj = null;
            }
            if (obj instanceof RequestId) {
                requestId = (RequestId) obj;
            } else {
                requestId = null;
            }
            if (requestId != null) {
                purchaseHandler.purchaseCallbacks.put(requestId, C6502A.a(pVar, lVar));
                purchaseHandler.productTypes.put(storeProduct.getId(), storeProduct.getType());
            } else {
                LogUtilsKt.errorLog$default("No RequestId coming from ProxyAmazonBillingActivity", (Throwable) null, 2, (Object) null);
            }
            C6514M m10 = C6514M.f71813a;
        }
    }
}
