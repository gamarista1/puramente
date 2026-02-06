package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "it", "Llf/M;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class AmazonBilling$queryAllPurchases$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onReceivePurchaseHistory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AmazonBilling$queryAllPurchases$1(C6798l lVar) {
        super(1);
        this.$onReceivePurchaseHistory = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Map<String, StoreTransaction>) (Map) obj);
        return C6514M.f71813a;
    }

    public final void invoke(Map<String, StoreTransaction> map) {
        C6496s.h(map, "it");
        this.$onReceivePurchaseHistory.invoke(C6565s.e1(map.values()));
    }
}
