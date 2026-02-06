package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.PurchasesError;
import io.branch.rnbranch.RNBranchModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;
import yf.q;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class SubscriberAttributesPoster$postSubscriberAttributes$1 extends C6498u implements C6798l {
    final /* synthetic */ q $onErrorHandler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscriberAttributesPoster$postSubscriberAttributes$1(q qVar) {
        super(1);
        this.$onErrorHandler = qVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onErrorHandler.invoke(purchasesError, Boolean.FALSE, C6565s.n());
    }
}
