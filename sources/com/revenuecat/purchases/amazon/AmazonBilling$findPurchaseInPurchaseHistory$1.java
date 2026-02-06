package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$findPurchaseInPurchaseHistory$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onCompletion;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ String $productId;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$findPurchaseInPurchaseHistory$1(C6798l lVar, String str, C6798l lVar2) {
        super(1);
        this.$onCompletion = lVar;
        this.$productId = str;
        this.$onError = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<StoreTransaction>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<StoreTransaction> list) {
        Object obj;
        C6496s.h(list, "it");
        String str = this.$productId;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C6496s.c(str, ((StoreTransaction) obj).getProductIds().get(0))) {
                break;
            }
        }
        StoreTransaction storeTransaction = (StoreTransaction) obj;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        String format = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1));
        C6496s.g(format, "format(this, *args)");
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, format));
    }
}
