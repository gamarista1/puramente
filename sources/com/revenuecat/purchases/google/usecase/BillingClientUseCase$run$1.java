package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.PurchasesError;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingClientUseCase$run$1 extends C6498u implements C6798l {
    final /* synthetic */ BillingClientUseCase<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingClientUseCase$run$1(BillingClientUseCase<T> billingClientUseCase) {
        super(1);
        this.this$0 = billingClientUseCase;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            this.this$0.executeAsync();
        } else {
            this.this$0.onError.invoke(purchasesError);
        }
    }
}
