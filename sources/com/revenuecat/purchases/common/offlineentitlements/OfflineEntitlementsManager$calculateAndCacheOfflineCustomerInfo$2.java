package com.revenuecat.purchases.common.offlineentitlements;

import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2 extends C6498u implements C6798l {
    final /* synthetic */ String $appUserId;
    final /* synthetic */ OfflineEntitlementsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfflineEntitlementsManager$calculateAndCacheOfflineCustomerInfo$2(OfflineEntitlementsManager offlineEntitlementsManager, String str) {
        super(1);
        this.this$0 = offlineEntitlementsManager;
        this.$appUserId = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return C6514M.f71813a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        C6496s.h(customerInfo, "customerInfo");
        OfflineEntitlementsManager offlineEntitlementsManager = this.this$0;
        String str = this.$appUserId;
        synchronized (offlineEntitlementsManager) {
            try {
                LogUtilsKt.warnLog(OfflineEntitlementsStrings.USING_OFFLINE_ENTITLEMENTS_CUSTOMER_INFO);
                DiagnosticsTracker access$getDiagnosticsTracker$p = offlineEntitlementsManager.diagnosticsTracker;
                if (access$getDiagnosticsTracker$p != null) {
                    access$getDiagnosticsTracker$p.trackEnteredOfflineEntitlementsMode();
                }
                offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
                String cachedAppUserID = offlineEntitlementsManager.deviceCache.getCachedAppUserID();
                if (cachedAppUserID != null) {
                    offlineEntitlementsManager.deviceCache.clearCustomerInfoCache(cachedAppUserID);
                }
                List<Pair> list = (List) offlineEntitlementsManager.offlineCustomerInfoCallbackCache.remove(str);
                if (list != null) {
                    for (Pair a10 : list) {
                        ((C6798l) a10.a()).invoke(customerInfo);
                    }
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
