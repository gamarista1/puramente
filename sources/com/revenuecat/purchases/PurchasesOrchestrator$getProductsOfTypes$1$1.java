package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Llf/M;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends C6498u implements C6798l {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ Set<ProductType> $typesRemaining;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$callback = getStoreProductsCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) (List) obj);
        return C6514M.f71813a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        C6496s.h(list, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        final Set<String> set = this.$productIds;
        final Set<ProductType> set2 = this.$typesRemaining;
        final List<StoreProduct> list2 = this.$collectedStoreProducts;
        final GetStoreProductsCallback getStoreProductsCallback = this.$callback;
        final PurchasesOrchestrator purchasesOrchestrator2 = purchasesOrchestrator;
        final List<? extends StoreProduct> list3 = list;
        purchasesOrchestrator.dispatch(new C6787a() {
            public final void invoke() {
                purchasesOrchestrator2.getProductsOfTypes(set, set2, C6565s.K0(list2, list3), getStoreProductsCallback);
            }
        });
    }
}
