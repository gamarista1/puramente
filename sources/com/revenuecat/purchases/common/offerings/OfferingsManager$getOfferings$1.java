package com.revenuecat.purchases.common.offerings;

import com.revenuecat.purchases.Offerings;
import kotlin.Metadata;
import kotlin.jvm.internal.C6498u;
import yf.C6787a;
import yf.C6798l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Llf/M;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class OfferingsManager$getOfferings$1 extends C6498u implements C6787a {
    final /* synthetic */ Offerings $cachedOfferings;
    final /* synthetic */ C6798l $onSuccess;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OfferingsManager$getOfferings$1(C6798l lVar, Offerings offerings) {
        super(0);
        this.$onSuccess = lVar;
        this.$cachedOfferings = offerings;
    }

    public final void invoke() {
        C6798l lVar = this.$onSuccess;
        if (lVar != null) {
            lVar.invoke(this.$cachedOfferings);
        }
    }
}
