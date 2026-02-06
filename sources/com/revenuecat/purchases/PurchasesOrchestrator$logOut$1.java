package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$logOut$1 extends C6498u implements C6798l {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$logOut$1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesOrchestrator purchasesOrchestrator) {
        super(1);
        this.$callback = receiveCustomerInfoCallback;
        this.this$0 = purchasesOrchestrator;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError != null) {
            ReceiveCustomerInfoCallback receiveCustomerInfoCallback = this.$callback;
            if (receiveCustomerInfoCallback != null) {
                receiveCustomerInfoCallback.onError(purchasesError);
                return;
            }
            return;
        }
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        synchronized (purchasesOrchestrator) {
            PurchasesState state$purchases_defaultsRelease = purchasesOrchestrator.getState$purchases_defaultsRelease();
            Map emptyMap = Collections.emptyMap();
            C6496s.g(emptyMap, "emptyMap()");
            purchasesOrchestrator.setState$purchases_defaultsRelease(PurchasesState.copy$default(state$purchases_defaultsRelease, (Boolean) null, emptyMap, (ProductChangeCallback) null, false, false, 29, (Object) null));
            C6514M m10 = C6514M.f71813a;
        }
        PurchasesOrchestrator purchasesOrchestrator2 = this.this$0;
        purchasesOrchestrator2.updateAllCaches(purchasesOrchestrator2.identityManager.getCurrentAppUserID(), this.$callback);
    }
}
