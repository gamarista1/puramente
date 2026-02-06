package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import lf.v;
import qf.C6658d;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "storeTransaction", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class CoroutinesExtensionsCommonKt$awaitPurchase$2$1 extends C6498u implements p {
    final /* synthetic */ C6658d<PurchaseResult> $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoroutinesExtensionsCommonKt$awaitPurchase$2$1(C6658d<? super PurchaseResult> dVar) {
        super(2);
        this.$continuation = dVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (CustomerInfo) obj2);
        return C6514M.f71813a;
    }

    public final void invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
        C6496s.h(storeTransaction, "storeTransaction");
        C6496s.h(customerInfo, "customerInfo");
        C6658d<PurchaseResult> dVar = this.$continuation;
        v.a aVar = v.f71841b;
        dVar.resumeWith(v.b(new PurchaseResult(storeTransaction, customerInfo)));
    }
}
