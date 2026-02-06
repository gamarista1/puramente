package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.PurchaseErrorCallback;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3 extends C6498u implements C6798l {
    final /* synthetic */ PurchaseErrorCallback $listener;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$replaceOldPurchaseWithNewProduct$3(PurchasesOrchestrator purchasesOrchestrator, PurchaseErrorCallback purchaseErrorCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$listener = purchaseErrorCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
        ProductChangeCallback unused = this.this$0.getAndClearProductChangeCallback();
        List unused2 = this.this$0.getAndClearAllPurchaseCallbacks();
        this.this$0.dispatch(this.$listener, purchasesError);
    }
}
