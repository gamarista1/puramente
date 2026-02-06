package com.revenuecat.purchases;

import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$logIn$2$1 extends C6498u implements p {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(final CustomerInfo customerInfo, final boolean z10) {
        C6496s.h(customerInfo, "customerInfo");
        final PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        final LogInCallback logInCallback = this.$callback;
        purchasesOrchestrator.dispatch(new C6787a() {
            public final void invoke() {
                LogInCallback logInCallback = logInCallback;
                if (logInCallback != null) {
                    logInCallback.onReceived(customerInfo, z10);
                }
                purchasesOrchestrator.customerInfoUpdateHandler.notifyListeners(customerInfo);
            }
        });
        OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_defaultsRelease().getAppInBackground(), (C6798l) null, (C6798l) null, 12, (Object) null);
    }
}
