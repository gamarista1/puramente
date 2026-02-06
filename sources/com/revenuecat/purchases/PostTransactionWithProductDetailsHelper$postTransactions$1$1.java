package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PostTransactionWithProductDetailsHelper$postTransactions$1$1 extends C6498u implements C6798l {
    final /* synthetic */ boolean $allowSharingPlayStoreAccount;
    final /* synthetic */ String $appUserID;
    final /* synthetic */ PostReceiptInitiationSource $initiationSource;
    final /* synthetic */ StoreTransaction $transaction;
    final /* synthetic */ p $transactionPostError;
    final /* synthetic */ p $transactionPostSuccess;
    final /* synthetic */ PostTransactionWithProductDetailsHelper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PostTransactionWithProductDetailsHelper$postTransactions$1$1(StoreTransaction storeTransaction, PostTransactionWithProductDetailsHelper postTransactionWithProductDetailsHelper, boolean z10, String str, PostReceiptInitiationSource postReceiptInitiationSource, p pVar, p pVar2) {
        super(1);
        this.$transaction = storeTransaction;
        this.this$0 = postTransactionWithProductDetailsHelper;
        this.$allowSharingPlayStoreAccount = z10;
        this.$appUserID = str;
        this.$initiationSource = postReceiptInitiationSource;
        this.$transactionPostSuccess = pVar;
        this.$transactionPostError = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.revenuecat.purchases.models.StoreProduct} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "storeProducts"
            kotlin.jvm.internal.C6496s.h(r12, r0)
            com.revenuecat.purchases.models.StoreTransaction r0 = r11.$transaction
            com.revenuecat.purchases.ProductType r0 = r0.getType()
            com.revenuecat.purchases.ProductType r1 = com.revenuecat.purchases.ProductType.SUBS
            r2 = 0
            if (r0 != r1) goto L_0x005d
            com.revenuecat.purchases.models.StoreTransaction r0 = r11.$transaction
            java.lang.String r0 = r0.getMarketplace()
            if (r0 != 0) goto L_0x005d
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.revenuecat.purchases.models.StoreTransaction r0 = r11.$transaction
            java.util.Iterator r12 = r12.iterator()
        L_0x0020:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0059
            java.lang.Object r1 = r12.next()
            r3 = r1
            com.revenuecat.purchases.models.StoreProduct r3 = (com.revenuecat.purchases.models.StoreProduct) r3
            com.revenuecat.purchases.models.SubscriptionOptions r3 = r3.getSubscriptionOptions()
            if (r3 == 0) goto L_0x0020
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x003a
            goto L_0x0020
        L_0x003a:
            java.util.Iterator r3 = r3.iterator()
        L_0x003e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0020
            java.lang.Object r4 = r3.next()
            com.revenuecat.purchases.models.SubscriptionOption r4 = (com.revenuecat.purchases.models.SubscriptionOption) r4
            java.lang.String r4 = r4.getId()
            java.lang.String r5 = r0.getSubscriptionOptionId()
            boolean r4 = kotlin.jvm.internal.C6496s.c(r4, r5)
            if (r4 == 0) goto L_0x003e
            r2 = r1
        L_0x0059:
            com.revenuecat.purchases.models.StoreProduct r2 = (com.revenuecat.purchases.models.StoreProduct) r2
        L_0x005b:
            r5 = r2
            goto L_0x0088
        L_0x005d:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            com.revenuecat.purchases.models.StoreTransaction r0 = r11.$transaction
            java.util.Iterator r12 = r12.iterator()
        L_0x0065:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0085
            java.lang.Object r1 = r12.next()
            r3 = r1
            com.revenuecat.purchases.models.StoreProduct r3 = (com.revenuecat.purchases.models.StoreProduct) r3
            java.lang.String r3 = r3.getId()
            java.util.List r4 = r0.getProductIds()
            java.lang.Object r4 = mf.C6565s.q0(r4)
            boolean r3 = kotlin.jvm.internal.C6496s.c(r3, r4)
            if (r3 == 0) goto L_0x0065
            r2 = r1
        L_0x0085:
            com.revenuecat.purchases.models.StoreProduct r2 = (com.revenuecat.purchases.models.StoreProduct) r2
            goto L_0x005b
        L_0x0088:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Store product found for transaction: "
            r12.append(r0)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            com.revenuecat.purchases.common.LogUtilsKt.debugLog(r12)
            com.revenuecat.purchases.PostTransactionWithProductDetailsHelper r12 = r11.this$0
            com.revenuecat.purchases.PostReceiptHelper r3 = r12.postReceiptHelper
            com.revenuecat.purchases.models.StoreTransaction r4 = r11.$transaction
            boolean r6 = r11.$allowSharingPlayStoreAccount
            java.lang.String r7 = r11.$appUserID
            com.revenuecat.purchases.PostReceiptInitiationSource r8 = r11.$initiationSource
            yf.p r9 = r11.$transactionPostSuccess
            yf.p r10 = r11.$transactionPostError
            r3.postTransactionAndConsumeIfNeeded(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.PostTransactionWithProductDetailsHelper$postTransactions$1$1.invoke(java.util.List):void");
    }
}
