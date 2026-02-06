package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import io.branch.rnbranch.RNBranchModule;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$restorePurchases$1$2$1$2 extends C6498u implements p {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$restorePurchases$1$2$1$2(StoreTransaction storeTransaction, List<StoreTransaction> list, PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.$purchase = storeTransaction;
        this.$sortedByTime = list;
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction, final PurchasesError purchasesError) {
        C6496s.h(storeTransaction, "<anonymous parameter 0>");
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        LogIntent logIntent = LogIntent.RC_ERROR;
        String format = String.format(RestoreStrings.RESTORING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{this.$purchase, purchasesError}, 2));
        C6496s.g(format, "format(this, *args)");
        LogWrapperKt.log(logIntent, format);
        if (C6496s.c(C6565s.z0(this.$sortedByTime), this.$purchase)) {
            PurchasesOrchestrator purchasesOrchestrator = this.this$0;
            final ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            purchasesOrchestrator.dispatch(new C6787a() {
                public final void invoke() {
                    receiveCustomerInfoCallback.onError(purchasesError);
                }
            });
        }
    }
}
