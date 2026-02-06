package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.OfferingStrings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6798l;
import yf.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "backendError", "", "isServerError", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsManager$fetchAndCacheOfferings$2 extends C6498u implements p {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsManager$fetchAndCacheOfferings$2(OfferingsManager offeringsManager, C6798l lVar, C6798l lVar2) {
        super(2);
        this.this$0 = offeringsManager;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return C6514M.f71813a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z10) {
        C6496s.h(purchasesError, "backendError");
        if (z10) {
            JSONObject cachedOfferingsResponse = this.this$0.offeringsCache.getCachedOfferingsResponse();
            if (cachedOfferingsResponse == null) {
                this.this$0.handleErrorFetchingOfferings(purchasesError, this.$onError);
                return;
            }
            LogUtilsKt.warnLog(OfferingStrings.ERROR_FETCHING_OFFERINGS_USING_DISK_CACHE);
            this.this$0.createAndCacheOfferings(cachedOfferingsResponse, this.$onError, this.$onSuccess);
            return;
        }
        this.this$0.handleErrorFetchingOfferings(purchasesError, this.$onError);
    }
}
