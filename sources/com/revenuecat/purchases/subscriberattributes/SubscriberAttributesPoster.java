package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import yf.C6787a;
import yf.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jk\u0010\u0013\u001a\u00020\u000b2 \u0010\b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2$\u0010\u0012\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttributesPoster;", "", "Lcom/revenuecat/purchases/common/BackendHelper;", "backendHelper", "<init>", "(Lcom/revenuecat/purchases/common/BackendHelper;)V", "", "", "attributes", "appUserID", "Lkotlin/Function0;", "Llf/M;", "onSuccessHandler", "Lkotlin/Function3;", "Lcom/revenuecat/purchases/PurchasesError;", "", "", "Lcom/revenuecat/purchases/common/SubscriberAttributeError;", "onErrorHandler", "postSubscriberAttributes", "(Ljava/util/Map;Ljava/lang/String;Lyf/a;Lyf/q;)V", "Lcom/revenuecat/purchases/common/BackendHelper;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SubscriberAttributesPoster {
    private final BackendHelper backendHelper;

    public SubscriberAttributesPoster(BackendHelper backendHelper2) {
        C6496s.h(backendHelper2, "backendHelper");
        this.backendHelper = backendHelper2;
    }

    public final void postSubscriberAttributes(Map<String, ? extends Map<String, ? extends Object>> map, String str, C6787a aVar, q qVar) {
        C6496s.h(map, "attributes");
        C6496s.h(str, "appUserID");
        C6496s.h(aVar, "onSuccessHandler");
        C6496s.h(qVar, "onErrorHandler");
        this.backendHelper.performRequest(new Endpoint.PostAttributes(str), O.f(C6502A.a("attributes", map)), (List<Pair<String, String>>) null, Delay.DEFAULT, new SubscriberAttributesPoster$postSubscriberAttributes$1(qVar), new SubscriberAttributesPoster$postSubscriberAttributes$2(aVar, qVar));
    }
}
