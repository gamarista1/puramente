package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.O;
import mf.Y;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsFactory$getStoreProductsById$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onCompleted;
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsFactory$getStoreProductsById$1(OfferingsFactory offeringsFactory, Set<String> set, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productIds = set;
        this.$onCompleted = lVar;
        this.$onError = lVar2;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1(List list, Set set, OfferingsFactory offeringsFactory, C6798l lVar, C6798l lVar2) {
        C6496s.h(list, "$subscriptionProducts");
        C6496s.h(set, "$productIds");
        C6496s.h(offeringsFactory, "this$0");
        C6496s.h(lVar, "$onCompleted");
        C6496s.h(lVar2, "$onError");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            String productId = ((StoreProduct) next).getPurchasingData().getProductId();
            Object obj = linkedHashMap.get(productId);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(productId, obj);
            }
            ((List) obj).add(next);
        }
        Map B10 = O.B(linkedHashMap);
        Set l10 = Y.l(set, B10.keySet());
        if (!l10.isEmpty()) {
            offeringsFactory.billing.queryProductDetailsAsync(ProductType.INAPP, l10, new OfferingsFactory$getStoreProductsById$1$1$1(offeringsFactory, B10, lVar), new OfferingsFactory$getStoreProductsById$1$1$2(lVar2));
        } else {
            lVar.invoke(B10);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        C6496s.h(list, "subscriptionProducts");
        Dispatcher.enqueue$default(this.this$0.dispatcher, new a(list, this.$productIds, this.this$0, this.$onCompleted, this.$onError), (Delay) null, 2, (Object) null);
    }
}
