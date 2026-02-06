package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.PurchasesError;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserId;
    final /* synthetic */ OfflineEntitlementsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$3(OfflineEntitlementsManager offlineEntitlementsManager, String str) {
        super(1);
        this.this$0 = offlineEntitlementsManager;
        this.$appUserId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError) {
        C6496s.h(purchasesError, "it");
        OfflineEntitlementsManager offlineEntitlementsManager = this.this$0;
        String str = this.$appUserId;
        synchronized (offlineEntitlementsManager) {
            try {
                List<Pair> list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    for (Pair b10 : list) {
                        ((C6798l) b10.b()).invoke(purchasesError);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
