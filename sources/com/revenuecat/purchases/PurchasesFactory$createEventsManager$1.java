package com.revenuecat.purchases;

import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.events.EventsRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import yf.C6787a;
import yf.p;
import yf.q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/revenuecat/purchases/common/events/EventsRequest;", "request", "Lkotlin/Function0;", "Llf/M;", "onSuccess", "Lkotlin/Function2;", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "invoke", "(Lcom/revenuecat/purchases/common/events/EventsRequest;Lyf/a;Lyf/p;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
final class PurchasesFactory$createEventsManager$1 extends C6498u implements q {
    final /* synthetic */ Backend $backend;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PurchasesFactory$createEventsManager$1(Backend backend) {
        super(3);
        this.$backend = backend;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((EventsRequest) obj, (C6787a) obj2, (p) obj3);
        return C6514M.f71813a;
    }

    public final void invoke(EventsRequest eventsRequest, C6787a aVar, p pVar) {
        C6496s.h(eventsRequest, "request");
        C6496s.h(aVar, "onSuccess");
        C6496s.h(pVar, "onError");
        this.$backend.postEvents(eventsRequest, aVar, pVar);
    }
}
