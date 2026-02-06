package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "e", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $completion;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineEntitlementsManager$updateProductEntitlementMappingCacheIfStale$2(C6798l lVar) {
        super(1);
        this.$completion = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, "e");
        String format = String.format(OfflineEntitlementsStrings.ERROR_UPDATING_PRODUCT_ENTITLEMENTS, Arrays.copyOf(new Object[]{purchasesError}, 1));
        C6496s.g(format, "format(this, *args)");
        LogUtilsKt.errorLog$default(format, (Throwable) null, 2, (Object) null);
        C6798l lVar = this.$completion;
        if (lVar != null) {
            lVar.invoke(purchasesError);
        }
    }
}
