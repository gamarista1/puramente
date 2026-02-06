package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.models.StoreTransaction;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activePurchasesByHashedToken", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasedProductsFetcher$queryActiveProducts$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
    final /* synthetic */ PurchasedProductsFetcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasedProductsFetcher$queryActiveProducts$1(C6798l lVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
        super(1);
        this.$onSuccess = lVar;
        this.this$0 = purchasedProductsFetcher;
        this.$productEntitlementMapping = productEntitlementMapping;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        C6496s.h(map, "activePurchasesByHashedToken");
        Iterable<StoreTransaction> e12 = C6565s.e1(map.values());
        PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
        ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
        ArrayList arrayList = new ArrayList(C6565s.y(e12, 10));
        for (StoreTransaction access$createPurchasedProduct : e12) {
            arrayList.add(purchasedProductsFetcher.createPurchasedProduct(access$createPurchasedProduct, productEntitlementMapping));
        }
        this.$onSuccess.invoke(arrayList);
    }
}
