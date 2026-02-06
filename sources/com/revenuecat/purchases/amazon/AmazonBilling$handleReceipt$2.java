package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.C6494p;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import yf.C6798l;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* synthetic */ class AmazonBilling$handleReceipt$2 extends C6494p implements C6798l {
    AmazonBilling$handleReceipt$2(Object obj) {
        super(1, obj, AmazonBilling.class, "onPurchaseError", "onPurchaseError(Lcom/revenuecat/purchases/PurchasesError;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, "p0");
        ((AmazonBilling) this.receiver).onPurchaseError(purchasesError);
    }
}
