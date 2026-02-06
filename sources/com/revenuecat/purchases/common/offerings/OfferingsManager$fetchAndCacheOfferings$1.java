package com.revenuecat.purchases.common.offerings;

import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import org.json.JSONObject;
import yf.C6798l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lorg/json/JSONObject;", "it", "Llf/M;", "invoke", "(Lorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsManager$fetchAndCacheOfferings$1 extends C6498u implements C6798l {
    final /* synthetic */ C6798l $onError;
    final /* synthetic */ C6798l $onSuccess;
    final /* synthetic */ OfferingsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsManager$fetchAndCacheOfferings$1(OfferingsManager offeringsManager, C6798l lVar, C6798l lVar2) {
        super(1);
        this.this$0 = offeringsManager;
        this.$onError = lVar;
        this.$onSuccess = lVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((JSONObject) obj);
        return C6514M.f71813a;
    }

    public final void invoke(JSONObject jSONObject) {
        C6496s.h(jSONObject, "it");
        this.this$0.createAndCacheOfferings(jSONObject, this.$onError, this.$onSuccess);
    }
}
