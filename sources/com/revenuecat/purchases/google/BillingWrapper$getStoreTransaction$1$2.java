package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$getStoreTransaction$1$2 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $completion;
    final /* synthetic */ Purchase $purchase;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$getStoreTransaction$1$2(C6798l lVar, Purchase purchase) {
        super(1);
        this.$completion = lVar;
        this.$purchase = purchase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return C6514M.f71813a;
    }

    public final void invoke(ProductType productType) {
        C6496s.h(productType, "type");
        this.$completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(this.$purchase, productType, (PresentedOfferingContext) null, (String) null, (GoogleReplacementMode) null, 14, (Object) null));
    }
}
