package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/AppLifecycleHandler;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PurchasesOrchestrator$lifecycleHandler$2 extends C6498u implements C6787a {
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$lifecycleHandler$2(PurchasesOrchestrator purchasesOrchestrator) {
        super(0);
        this.this$0 = purchasesOrchestrator;
    }

    public final AppLifecycleHandler invoke() {
        return new AppLifecycleHandler(this.this$0);
    }
}
