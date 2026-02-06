package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "Llf/M;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsManager$createAndCacheOfferings$2 extends C6498u implements C6798l {
    final /* synthetic */ JSONObject $offeringsJSON;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsManager$createAndCacheOfferings$2(OfferingsManager offeringsManager, JSONObject jSONObject, C6798l lVar) {
        super(1);
        this.this$0 = offeringsManager;
        this.$offeringsJSON = jSONObject;
        this.$onSuccess = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Offerings) obj);
        return C6514M.f71813a;
    }

    public final void invoke(final Offerings offerings) {
        C6496s.h(offerings, "offerings");
        Offering current = offerings.getCurrent();
        if (current != null) {
            this.this$0.offeringImagePreDownloader.preDownloadOfferingImages(current);
        }
        this.this$0.offeringsCache.cacheOfferings(offerings, this.$offeringsJSON);
        OfferingsManager offeringsManager = this.this$0;
        final C6798l lVar = this.$onSuccess;
        offeringsManager.dispatch(new C6787a() {
            public final void invoke() {
                C6798l lVar = lVar;
                if (lVar != null) {
                    lVar.invoke(offerings);
                }
            }
        });
    }
}
