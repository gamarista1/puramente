package com.revenuecat.purchases.google;

import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "subFound", "Llf/M;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class BillingWrapper$getPurchaseType$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BillingWrapper$getPurchaseType$1(C6798l lVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = lVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        final C6798l lVar = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, lVar, new C6798l() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C6514M.f71813a;
            }

            public final void invoke(boolean z10) {
                if (z10) {
                    lVar.invoke(ProductType.INAPP);
                } else {
                    lVar.invoke(ProductType.UNKNOWN);
                }
            }
        });
    }
}
