package com.revenuecat.purchases;

import com.revenuecat.purchases.common.networking.PostReceiptResponse;
import com.revenuecat.purchases.models.StoreTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;", "postReceiptResponse", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/common/networking/PostReceiptResponse;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostReceiptHelper$postTransactionAndConsumeIfNeeded$1 extends C6498u implements C6798l {
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ p $onSuccess;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ PostReceiptHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostReceiptHelper$postTransactionAndConsumeIfNeeded$1(PostReceiptHelper postReceiptHelper, StoreTransaction storeTransaction, PostReceiptInitiationSource postReceiptInitiationSource, p pVar) {
        super(1);
        this.this$0 = postReceiptHelper;
        this.$purchase = storeTransaction;
        this.$initiationSource = postReceiptInitiationSource;
        this.$onSuccess = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PostReceiptResponse) obj);
        return C6514M.f71813a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse r7) {
        /*
            r6 = this;
            java.lang.String r0 = "postReceiptResponse"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.util.Map r0 = r7.getProductInfoByProductId()
            if (r0 == 0) goto L_0x005d
            com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.util.List r5 = r1.getProductIds()
            boolean r4 = r5.contains(r4)
            if (r4 == 0) goto L_0x001a
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r2.put(r4, r3)
            goto L_0x001a
        L_0x0042:
            java.util.Collection r0 = r2.values()
            if (r0 == 0) goto L_0x005d
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = mf.C6565s.p0(r0)
            com.revenuecat.purchases.common.networking.PostReceiptProductInfo r0 = (com.revenuecat.purchases.common.networking.PostReceiptProductInfo) r0
            if (r0 == 0) goto L_0x005d
            java.lang.Boolean r0 = r0.getShouldConsume()
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.booleanValue()
            goto L_0x005e
        L_0x005d:
            r0 = 1
        L_0x005e:
            com.revenuecat.purchases.PostReceiptHelper r1 = r6.this$0
            com.revenuecat.purchases.common.BillingAbstract r1 = r1.billing
            com.revenuecat.purchases.PostReceiptHelper r2 = r6.this$0
            boolean r2 = r2.getFinishTransactions()
            com.revenuecat.purchases.models.StoreTransaction r3 = r6.$purchase
            com.revenuecat.purchases.PostReceiptInitiationSource r4 = r6.$initiationSource
            r1.consumeAndSave(r2, r3, r0, r4)
            yf.p r0 = r6.$onSuccess
            if (r0 == 0) goto L_0x007e
            com.revenuecat.purchases.models.StoreTransaction r1 = r6.$purchase
            com.revenuecat.purchases.CustomerInfo r7 = r7.getCustomerInfo()
            r0.invoke(r1, r7)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PostReceiptHelper$postTransactionAndConsumeIfNeeded$1.invoke(com.revenuecat.purchases.common.networking.PostReceiptResponse):void");
    }
}
