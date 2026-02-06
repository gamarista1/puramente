package com.revenuecat.purchases.amazon;

import android.app.Activity;
import android.os.Handler;
import com.amazon.a.a.o.b;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.amazon.listener.PurchaseResponseListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$makePurchaseAsync$1 extends C6498u implements C6798l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
    final /* synthetic */ AmazonStoreProduct $storeProduct;
    final /* synthetic */ AmazonBilling this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$makePurchaseAsync$1(AmazonBilling amazonBilling, Activity activity, String str, AmazonStoreProduct amazonStoreProduct, PresentedOfferingContext presentedOfferingContext) {
        super(1);
        this.this$0 = amazonBilling;
        this.$activity = activity;
        this.$appUserID = str;
        this.$storeProduct = amazonStoreProduct;
        this.$presentedOfferingContext = presentedOfferingContext;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            PurchaseResponseListener access$getPurchaseHandler$p = this.this$0.purchaseHandler;
            Handler access$getMainHandler$p = this.this$0.mainHandler;
            Activity activity = this.$activity;
            String str = this.$appUserID;
            final AmazonStoreProduct amazonStoreProduct = this.$storeProduct;
            final AmazonBilling amazonBilling = this.this$0;
            final PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext;
            AnonymousClass1 r52 = new p() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Receipt) obj, (UserData) obj2);
                    return C6514M.f71813a;
                }

                public final void invoke(Receipt receipt, UserData userData) {
                    C6496s.h(receipt, b.f37446D);
                    C6496s.h(userData, "userData");
                    amazonBilling.handleReceipt(receipt, userData, amazonStoreProduct, presentedOfferingContext);
                }
            };
            final AmazonBilling amazonBilling2 = this.this$0;
            access$getPurchaseHandler$p.purchase(access$getMainHandler$p, activity, str, amazonStoreProduct, r52, new C6798l() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PurchasesError) obj);
                    return C6514M.f71813a;
                }

                public final void invoke(PurchasesError purchasesError) {
                    C6496s.h(purchasesError, "it");
                    amazonBilling2.onPurchaseError(purchasesError);
                }
            });
            return;
        }
        this.this$0.onPurchaseError(purchasesError);
    }
}
