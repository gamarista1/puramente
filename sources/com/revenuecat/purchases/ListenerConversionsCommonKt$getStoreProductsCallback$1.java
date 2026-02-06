package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import io.branch.rnbranch.RNBranchModule;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/revenuecat/purchases/ListenerConversionsCommonKt$getStoreProductsCallback$1", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Llf/M;", "onReceived", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "error", "onError", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ListenerConversionsCommonKt$getStoreProductsCallback$1 implements GetStoreProductsCallback {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onReceived;

    ListenerConversionsCommonKt$getStoreProductsCallback$1(C6798l lVar, C6798l lVar2) {
        this.$onReceived = lVar;
        this.$onError = lVar2;
    }

    public void onError(PurchasesError purchasesError) {
        C6496s.h(purchasesError, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
        this.$onError.invoke(purchasesError);
    }

    public void onReceived(List<? extends StoreProduct> list) {
        C6496s.h(list, "storeProducts");
        this.$onReceived.invoke(list);
    }
}
