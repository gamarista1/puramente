package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6514M;
import mf.C6565s;
import mf.O;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "inAppProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsFactory$getStoreProductsById$1$1$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, C6798l lVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = lVar;
    }

    /* access modifiers changed from: private */
    public static final void invoke$lambda$1(Map map, List list, C6798l lVar) {
        C6496s.h(map, "$productsById");
        C6496s.h(list, "$inAppProducts");
        C6496s.h(lVar, "$onCompleted");
        Iterable<StoreProduct> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        for (StoreProduct storeProduct : iterable) {
            arrayList.add(C6502A.a(storeProduct.getPurchasingData().getProductId(), C6565s.e(storeProduct)));
        }
        O.s(map, arrayList);
        lVar.invoke(map);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        C6496s.h(list, "inAppProducts");
        Dispatcher.enqueue$default(this.this$0.dispatcher, new b(this.$productsById, list, this.$onCompleted), (Delay) null, 2, (Object) null);
    }
}
