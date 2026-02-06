package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "<anonymous parameter 0>", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$acknowledge$1 extends C6498u implements C6798l {
    public static final BillingWrapper$acknowledge$1 INSTANCE = new BillingWrapper$acknowledge$1();

    BillingWrapper$acknowledge$1() {
        super(1);
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, "<anonymous parameter 0>");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }
}
