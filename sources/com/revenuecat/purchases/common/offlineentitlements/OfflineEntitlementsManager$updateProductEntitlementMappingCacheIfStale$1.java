package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $completion;
    final /* synthetic */ OfflineEntitlementsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$1(OfflineEntitlementsManager offlineEntitlementsManager, C6798l lVar) {
        super(1);
        this.this$0 = offlineEntitlementsManager;
        this.$completion = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductEntitlementMapping) obj);
        return C6514M.f71813a;
    }

    public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
        C6496s.h(productEntitlementMapping, "productEntitlementMapping");
        this.this$0.deviceCache.cacheProductEntitlementMapping(productEntitlementMapping);
        LogUtilsKt.debugLog(OfflineEntitlementsStrings.SUCCESSFULLY_UPDATED_PRODUCT_ENTITLEMENTS);
        C6798l lVar = this.$completion;
        if (lVar != null) {
            lVar.invoke((Object) null);
        }
    }
}
